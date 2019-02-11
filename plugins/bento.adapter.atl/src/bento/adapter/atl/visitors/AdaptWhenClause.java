package bento.adapter.atl.visitors;

import java.util.stream.Stream;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.Helper;
import anatlyzer.atlext.ATL.InPatternElement;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.OCL.BooleanExp;
import anatlyzer.atlext.OCL.IfExp;
import anatlyzer.atlext.OCL.Iterator;
import anatlyzer.atlext.OCL.IteratorExp;
import anatlyzer.atlext.OCL.LetExp;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.atlext.OCL.VariableDeclaration;
import anatlyzer.atlext.OCL.VariableExp;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import gbind.dsl.ClassBinding;

public class AdaptWhenClause extends BaseAdapterVisitor {
	
	public AdaptWhenClause(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info, AdaptationContext ctx) {
		super(atlModel, bindingModel, info, ctx);
	}

	public void perform() {
		// First, create a helper for each when clause, that will be invoked
		// in the suitable places.
		bindingModel.findWhenClauseBindings().forEach(cb -> createHelperForWhenClauseExpression(cb) );
		
		startVisiting(atlModel.getModule());
		applyPending();
	}

	@Override
	public void inMatchedRule(MatchedRule self) {
		// Assuming rules with one input element
		InPatternElement inPatternElement = self.getInPattern().getElements().get(0);
		OclModelElement me = (OclModelElement) inPatternElement.getType();
		
		findAdaptedWhenClauseBindings(me).forEach(cb -> adaptRuleForWhenClause(self, cb));
	}

	private void adaptRuleForWhenClause(MatchedRule r, ClassBinding cb) {
		NavigationOrAttributeCallExp call = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
		call.setName( getWhenHelperName(cb) );
		
		VariableExp v = OCLFactory.eINSTANCE.createVariableExp();
		v.setReferredVariable(r.getInPattern().getElements().get(0));		
		call.setSource(v);

		if ( r.getInPattern().getFilter() == null ) {
			r.getInPattern().setFilter(call);
		} else {
			IfExp ifExp = OCLFactory.eINSTANCE.createIfExp();
			ifExp.setCondition(call);
			
			ifExp.setThenExpression(r.getInPattern().getFilter());
			
			BooleanExp falseValue = OCLFactory.eINSTANCE.createBooleanExp();
			falseValue.setBooleanSymbol(false);
			ifExp.setElseExpression(falseValue);
			
			r.getInPattern().setFilter(ifExp);
		}				
	}

	@Override
	public void inOperationCallExp(OperationCallExp self) {
		if ( self.getOperationName().equals("allInstances") || self.getOperationName().equals("allInstancesFrom")) {
			adaptAllInstances(self); 
		} else if ( self.getOperationName().equals("oclIsKindOf") || self.getOperationName().equals("oclIsTypeOf")) {
			adaptKindOf(self);
		}
	}
	
	private void adaptKindOf(OperationCallExp op) {
		OclModelElement me = (OclModelElement) op.getArguments().get(0);
		findAdaptedWhenClauseBindings(me).findFirst().ifPresent(cb -> {	
			
			LetExp letExp = OCLFactory.eINSTANCE.createLetExp();
			// Do the replacement just here because later the parent of is changed
			replaceContaining(op, letExp);

			VariableDeclaration vd = OCLFactory.eINSTANCE.createVariableDeclaration();
			vd.setVarName(genUniqueId());
			vd.setType(addToResource(OCLFactory.eINSTANCE.createOclAnyType()));
			vd.setInitExpression(op.getSource());
			letExp.setVariable(vd);
			
		    // Re-arrange oclIsKindOf -> source now is Let variable
			NavigationOrAttributeCallExp call = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
			call.setName(getWhenHelperName(cb));			
  			VariableExp vExp2 = OCLFactory.eINSTANCE.createVariableExp();
  			vExp2.setReferredVariable(letExp.getVariable());
  			call.setSource(vExp2);
  			
  			IfExp ifExp = OCLFactory.eINSTANCE.createIfExp();
  			
  			VariableExp vExp3 = OCLFactory.eINSTANCE.createVariableExp();
  			vExp3.setReferredVariable(letExp.getVariable());
  			
  			op.setSource(vExp3);
  			
  			ifExp.setCondition(op);
  			ifExp.setThenExpression(call);
  			BooleanExp aFalse = OCLFactory.eINSTANCE.createBooleanExp();
  			aFalse.setBooleanSymbol(false);
  			ifExp.setElseExpression(aFalse);

  			letExp.setIn_(ifExp);
		});
	}

	private void adaptAllInstances(OperationCallExp op) {
		OclModelElement me = (OclModelElement) op.getSource();
		findAdaptedWhenClauseBindings(me).findFirst().ifPresent(cb -> {	
			IteratorExp select = OCLFactory.eINSTANCE.createIteratorExp();
			// Do the replacement just here because later the parent of is changed
			replaceContaining(op, select);

			select.setName("select");
			select.setSource(op);
			
			Iterator it = OCLFactory.eINSTANCE.createIterator();
			it.setVarName("__v__");
			select.getIterators().add(it);
			
			NavigationOrAttributeCallExp call = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
			call.setName(getWhenHelperName(cb));
			VariableExp vExp2 = OCLFactory.eINSTANCE.createVariableExp();
			vExp2.setReferredVariable(it);
			
			call.setSource(vExp2);

			select.setBody(call);
		});

		
	}

	
	
	private void createHelperForWhenClauseExpression(ClassBinding cb) {
		OclModel metamodel = AdaptationUtils.getMetamodel(atlModel, info.getConceptMetamodelName());
		
		anatlyzer.atlext.OCL.OclExpression atlExpr = new GbindToATL(atlModel, info).transform(cb.getWhenClause());
		Helper helper = AdaptationUtils.createContextAttributeHelper(metamodel, cb.getConcept().getName(), 
				getWhenHelperName(cb), atlExpr, this::addToResource);
	
		atlModel.getModule().getElements().add(helper);
	}

	private Stream<ClassBinding> findAdaptedWhenClauseBindings(OclModelElement me) {
		return bindingModel.findWhenClauseBindings().filter(cb -> 
			me.getModel().getName().equals(info.getConceptMetamodelName()) && 
			me.getName().equals(cb.getConcept().getName()));
	}
	
	private String getWhenHelperName(ClassBinding cb) {
		return cb.getConcept().getName() + "__filter__";
	}

}

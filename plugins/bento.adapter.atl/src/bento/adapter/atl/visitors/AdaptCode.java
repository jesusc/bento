package bento.adapter.atl.visitors;

import gbind.dsl.ClassBinding;
import gbind.dsl.ConcreteMetaclass;

import java.util.function.BiFunction;
import java.util.function.Function;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.OCL.BooleanExp;
import anatlyzer.atlext.OCL.LetExp;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclExpression;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.atlext.OCL.OperatorCallExp;
import anatlyzer.atlext.OCL.SequenceExp;
import anatlyzer.atlext.OCL.VariableDeclaration;
import anatlyzer.atlext.OCL.VariableExp;
import bento.adapter.atl.util.TPat;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;

public class AdaptCode extends BaseAdapterVisitor {
	
	public AdaptCode(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info, AdaptationContext ctx) {
		super(atlModel, bindingModel, info, ctx);
	}

	public void perform() {
		startVisiting(atlModel.getModule());
		applyPending();
	}

	public void inOperationCallExp(anatlyzer.atlext.OCL.OperationCallExp self) {
		if ( self.getOperationName().equals("oclIsKindOf") ||
			 self.getOperationName().equals("oclIsTypeOf") ) {
	
			OclModelElement me = (OclModelElement) self.getArguments().get(0);
			if ( belongsToCurrentMetamodel(me) ) {
				// Classes mapped to N
				bindingModel.findClassBindingForConcept(me.getName()).
				             filter(cb -> cb.getConcrete().size() > 1).
				             ifPresent(cb -> adaptKindOf_N(self, me, cb));			

				// Classes mapped to NONE
				bindingModel.findClassBindingForConcept(me.getName()).
	             filter(cb -> cb.getConcrete().get(0).getName().toUpperCase().equals("NONE")).
	             ifPresent(cb -> adaptKindOf_None(self, me, cb));			
			}
			
		} else if ( self.getOperationName().equals("allInstances") ) {
			OclModelElement me = (OclModelElement) self.getSource(); 
			if ( belongsToCurrentMetamodel(me) ) {
				// Classes mapped to NONE
				bindingModel.findClassBindingForConcept(me.getName()).
	             filter(cb -> cb.getConcrete().get(0).getName().toUpperCase().equals("NONE")).
	             ifPresent(cb -> adaptAllInstances_None(self, me, cb));			
			}	
		}
		
	}

	/**
	 * <pre>
	 * 		OclExpression: <<receptor>>.oclIsKindOf(AClass)
	 *      Class binding: class AClass to TClass1, TClass2, TClass3
	 * </pre>
	 * 
	 * <pre>
	 *   let newVar : OclAny = <<receptor>>  
	 *    in newVar.oclIsKindOf(TClass1) or newVar.oclIsKindOf(TClass2) or newVar.oclIsKindOf(TClass3)
	 * </pre>
	 * 
	 * @param operation
	 * @param me
	 * @param cb
	 */
	private void adaptKindOf_N(OperationCallExp operation, OclModelElement me, ClassBinding cb) {
		System.out.println("Adapting oclIsXxxxOf: " + operation.getLocation());
		
		LetExp letExp = OCLFactory.eINSTANCE.createLetExp();
		VariableDeclaration vd = OCLFactory.eINSTANCE.createVariableDeclaration();
		vd.setVarName("__unique_id__");
		vd.setType(addToResource(OCLFactory.eINSTANCE.createOclAnyType())); // TODO: Add to resource
		vd.setInitExpression(operation.getSource());
		letExp.setVariable(vd);
		
		// Creates <<receptorVar>>.oclIsKind/TypeOf(<<concreteType>>)
		Function<ConcreteMetaclass, OclExpression> createOclIsKindOf = (targetClass) -> {
			OclModelElement targetMe = OCLFactory.eINSTANCE.createOclModelElement();
			targetMe.setName( targetClass.getName() );
			targetMe.setModel( me.getModel() );
			
			OperationCallExp newKindOf = OCLFactory.eINSTANCE.createOperationCallExp();
			newKindOf.setOperationName( operation.getOperationName() );
			
			VariableExp vExp = OCLFactory.eINSTANCE.createVariableExp();
			vExp.setReferredVariable( letExp.getVariable() );
			newKindOf.setSource(vExp);
			newKindOf.getArguments().add(targetMe);
			
			return targetMe;
		};
		
		BiFunction<OclExpression, OclExpression, OclExpression> join = (e1, e2) -> {
	         OperatorCallExp orOp = OCLFactory.eINSTANCE.createOperatorCallExp();
	         orOp.setOperationName("or");
	         orOp.setSource(e1);
	         orOp.getArguments().add(e2);
	         return orOp;
		};
		
		OclExpression r = TPat.listToTree(cb.getConcrete(), createOclIsKindOf, join);
		letExp.setIn_(r);
		
		replaceContaining(operation, letExp);	
	}

	/**
	 * 
	 * <pre>
	 * 		OclExpression: <<receptor>>.oclIsKindOf(AClass)
	 *      Class binding: class AClass to NONE
	 * </pre>
	 * 
	 * Expression replacement:
	 * <pre>
	 *    false 
	 * </pre>
	 *  
	 * @param operation
	 * @param me
	 * @param cb
	 */
	private void adaptKindOf_None(OperationCallExp operation, OclModelElement me, ClassBinding cb) {
		BooleanExp exp = OCLFactory.eINSTANCE.createBooleanExp();
		exp.setBooleanSymbol(false);
		replaceContaining(operation, exp);
	}

	/**
	 * <pre>
	 * 		OclExpression: AClass.allInstances()
	 *      Class binding: class AClass to NONE
	 * </pre>
	 * 
	 * Expression replacement:
	 * <pre>
	 *    Sequence { } 
	 * </pre>

	 * @param operation
	 * @param me
	 * @param cb
	 */
	private void adaptAllInstances_None(OperationCallExp operation, OclModelElement me, ClassBinding cb) {
		SequenceExp exp = OCLFactory.eINSTANCE.createSequenceExp();
		replaceContaining(operation, exp);
	}

}

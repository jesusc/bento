package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.compiler.atl.csp.TransformationSlice;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.HelperAnn;
import genericity.typing.atl_types.annotations.ImperativeRuleAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;
import genericity.typing.atl_types.annotations.ModuleCallableAnn;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;

public class CallExprNode extends AbstractDependencyNode {

	private PropertyCallExp	call;
	// private OclExpression	end;
	private CallExprAnn	ann;
	private ATLModel atlModel;

	public CallExprNode(PropertyCallExp start, CallExprAnn ann, ATLModel atlModel) {
		this.call = start;
		this.ann   = ann;
		this.atlModel = atlModel;
		// this.end   = end;
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, call.getSource());
		// call.getSource() does not work, why???
		generatedDependencies(slice);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, OclGenerator.gen(call), leadsToExecution);
	}

	@Override
	public OclExpression genCSP(CSPModel model) {
		// TODO: Parameter passing simply nesting let expressions
		if ( ann.isIsStaticCall() ) {
			ModuleCallableAnn moduleCallableAnn = ann.getStaticResolver();
			
			LetExp topLet = null;
			LetExp innerLet = null;
			for(int i = 0; i < moduleCallableAnn.getArguments().size(); i++) {
				String varName = moduleCallableAnn.getNames().get(i);
				OclExpression actualParameter = ((OperationCallExp) call).getArguments().get(i);
				VariableDeclaration paramVar  = (VariableDeclaration) atlModel.findWrapper(moduleCallableAnn.getArgumentVars().get(i));
				
				LetExp let = model.createLetScope(model.gen(actualParameter), null, varName);

				VariableDeclaration newVar = let.getVariable();
				model.addToScope(paramVar, newVar);
				
				if ( topLet == null ) {
					topLet = let;					
				} else {
					innerLet.setIn_(let);
				}					
				innerLet = let;
			}
			
			OclExpression inlineCall   = getDepending().genCSP(model);
			if ( topLet != null ) {
				innerLet.setIn_(inlineCall);
				inlineCall = topLet;
			}
			
			return inlineCall;
		} else {
			OclExpression receptorExpr = model.gen(call.getSource());
			if ( ann.getDynamicResolvers().size() > 1 ) 
				throw new UnsupportedOperationException();
			
			ContextHelperAnn contextHelperAnn = ann.getDynamicResolvers().get(0);
			
			// TODO: There may be several helpers... ??
			LetExp topLet = model.createLetScope(receptorExpr, null, "genSelf");
			for (VariableDeclaration vd : findSelfReferences(contextHelperAnn)) {
				model.addToScope(vd, topLet.getVariable());
			}

			LetExp innerLet = topLet;
			for(int i = 0; i < contextHelperAnn.getArguments().size(); i++) {
				String varName = contextHelperAnn.getNames().get(i);
				OclExpression formalParameter = ((OperationCallExp) call).getArguments().get(i);
				VariableDeclaration paramVar  = (VariableDeclaration) atlModel.findWrapper(contextHelperAnn.getArgumentVars().get(i));
				
				LetExp let = model.createLetScope(model.gen(formalParameter), null, varName);

				VariableDeclaration newVar = let.getVariable();
				model.addToScope(paramVar, newVar);
				
				innerLet.setIn_(let);
				innerLet = let;
			}

			
			OclExpression inlineCall   = getDepending().genCSP(model);
			innerLet.setIn_(inlineCall);
			return topLet;	
		}
	}


	private List<VariableDeclaration> findSelfReferences(ContextHelperAnn contextHelperAnn) {
		ArrayList<VariableDeclaration> selfs = new ArrayList<VariableDeclaration>();
		TreeIterator<EObject> it = contextHelperAnn.getHelper().eAllContents();
		while ( it.hasNext() ) {
			EObject obj = it.next();
			ATLModelBaseObject atlObj = atlModel.findWrapper(obj);
			if ( atlObj instanceof VariableExp && ((VariableExp) atlObj).getReferredVariable().getVarName().equals("self") )
				selfs.add(((VariableExp) atlObj).getReferredVariable());
		}
		return selfs;
	}

	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		// For the moment just gathering the enclosing element
		for(DependencyNode n : dependencies) {
			n.genTransformationSlice(slice);
		}					

		ModuleCallableAnn moduleCallableAnn = ann.getStaticResolver();
		if ( moduleCallableAnn instanceof HelperAnn) {
			throw new UnsupportedOperationException();
		} else if ( moduleCallableAnn instanceof ImperativeRuleAnn) {
			if ( moduleCallableAnn instanceof LazyRuleAnn) {
				LazyMatchedRule r = (LazyMatchedRule) atlModel.findWrapper(((ImperativeRuleAnn) moduleCallableAnn).getRule());
				// For the moment not distinguishing between lazy and normal
				slice.addRule(r);
			} else {
				throw new UnsupportedOperationException("CalledRuleAnn not supported");
			}
		}
	}
	
}

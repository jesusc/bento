package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.ModuleCallableAnn;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
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
	
	/*
	@Override
	public String genCSP(String dependent) {
		// I could factorize in a let... somehow? Not the common case I guess
		String s = "";
		String g = OclGenerator.gen(start, null);
		
		if ( TypeUtils.isReference(ann.getType()) ) {
			g = " not " + g + ".oclIsUndefined()";					
		} else if ( TypeUtils.isCollection(ann.getType()) ) {
			g = g + ".size() > 0";					
		} else if ( ann.getType() instanceof StringType ) {
			g = g + "STRING_NOT_SUPPORTED";
		} else { 
			throw new UnsupportedOperationException(ann.getType().getClass().toString());
		}
		
		for(DependencyNode node : getDependencies()) {
			s += node.genCSP(g) + "\n";
		}
		return s;
	}
	*/
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, call);
		generatedDependencies(slice);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, OclGenerator.gen(call), leadsToExecution);
	}

	/*
	@Override
	public void getCSPText(CSPBuffer buf) {
		this.getDependency().getCSPText(buf);
		// TODO: Add parameters
		buf.generateCallContext(call, ann.isIsStaticCall(), ann.getStaticResolver());
	}
	*/

	@Override
	public OclExpression genCSP(CSPModel model) {
		// TODO: Parameter passing simply nesting let expressions
		if ( ann.isIsStaticCall() ) {
			ModuleCallableAnn moduleCallableAnn = ann.getStaticResolver();
			
			LetExp lastLet = null;
			for(int i = 0; i < moduleCallableAnn.getArguments().size(); i++) {
				String varName = moduleCallableAnn.getNames().get(i);
				OclExpression formalParameter = ((OperationCallExp) call).getArguments().get(i);
				VariableDeclaration paramVar  = (VariableDeclaration) atlModel.findWrapper(moduleCallableAnn.getArgumentVars().get(i));
				
				LetExp innerLet = model.createLetScope(model.gen(formalParameter), null, varName);

				VariableDeclaration newVar = innerLet.getVariable();
				model.addToScope(paramVar, newVar);
				
				if ( lastLet != null )
					lastLet.setIn_(innerLet);
				lastLet = innerLet;
			}
			
			OclExpression inlineCall   = getDepending().genCSP(model);
			if ( lastLet != null ) {
				lastLet.setIn_(inlineCall);
				inlineCall = lastLet;
			}
			
			return inlineCall;
		} else {
			OclExpression receptorExpr = model.gen(call.getSource());
			if ( ann.getDynamicResolvers().size() > 1 ) 
				throw new UnsupportedOperationException();
			
			ContextHelperAnn contextHelperAnn = ann.getDynamicResolvers().get(0);
			
			// TODO: There may be several helpers... ??
			LetExp let = model.createLetScope(receptorExpr, null, "genSelf");
			for (VariableDeclaration vd : findSelfReferences(contextHelperAnn)) {
				model.addToScope(vd, let.getVariable());
			}

			LetExp lastLet = let;
			for(int i = 0; i < contextHelperAnn.getArguments().size(); i++) {
				String varName = contextHelperAnn.getNames().get(i);
				OclExpression formalParameter = ((OperationCallExp) call).getArguments().get(i);
				
				LetExp innerLet = model.createLetScope(model.gen(formalParameter), null, varName);
				lastLet.setIn_(innerLet);
				lastLet = innerLet;
			}

			
			OclExpression inlineCall   = getDepending().genCSP(model);
			lastLet.setIn_(inlineCall);
			return lastLet;	
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
	
}

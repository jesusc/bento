package genericity.compiler.atl.graph;

import genericity.compiler.atl.analyser.ATLUtils;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.TransformationSlice;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.HelperAnn;

import org.eclipse.emf.common.util.EList;

import atl.metamodel.ATL.Helper;
import atl.metamodel.OCL.OclExpression;

public class HelperInvocationNode extends AbstractDependencyNode {

	private Helper	helper;
	private HelperAnn	helperAnn;

	public HelperInvocationNode(Helper h, HelperAnn helperAnn) {
		this.helper = h;
		this.helperAnn = helperAnn;
	}
	
	/*
	@Override
	public String genCSP(String dependent) {
		String s = "";
		for(DependencyNode n : dependencies) {
			s += n.genCSP(dependent) + " ";
		}
		return s + "\nHELPER INVOCATION: " + OclGenerator.gen(ATLUtils.getBody(helper));
	}
	*/

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		if ( helperAnn.getReturnType() instanceof Metaclass )
			slice.addExplicitMetaclass((Metaclass) helperAnn.getReturnType());

		EList<Type> args = helperAnn.getArguments();
		for (Type type : args) {
			if ( type instanceof Metaclass) slice.addExplicitMetaclass((Metaclass) type);
		}
		
		if ( helperAnn instanceof ContextHelperAnn ) {
			ContextHelperAnn h = (ContextHelperAnn) helperAnn;
			if ( h.getContextType() instanceof Metaclass ) 
				slice.addExplicitMetaclass((Metaclass) h.getContextType());
		}
		
		
		generatedDependencies(slice);
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, 
				"def:" + (ATLUtils.isContextHelper(helper) ? ATLUtils.getHelperType(helper).getName() + "." : "") + 
				ATLUtils.getHelperName(helper), leadsToExecution);
	}

	@Override
	public OclExpression genCSP(CSPModel model) {	
		return getDepending().genCSP(model);
	}

	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		throw new UnsupportedOperationException();
	}
	
}

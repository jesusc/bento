package genericity.compiler.atl.graph;

import org.eclipse.emf.common.util.EList;

import atl.metamodel.ATL.Helper;
import genericity.compiler.atl.analyser.ATLUtils;
import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.HelperAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;

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
	public void getCSPText(CSPBuffer buf) {
		if ( getDependencies().size() == 0 ) {
			System.err.println("WARNING: Error cannot be reached");
		}
		
		for(DependencyNode n : getDependencies()) {
			// 1. Generate code for the dependency node
			n.getCSPText(buf);
			// 2. Place the generated code in "if ( dependency = true ) then X else false endif"
			// TODO: Do this.
			// 3. X will be the code for the depending node
		}
	}
}

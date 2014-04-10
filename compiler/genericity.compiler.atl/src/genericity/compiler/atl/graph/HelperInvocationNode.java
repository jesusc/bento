package genericity.compiler.atl.graph;

import atl.metamodel.ATL.Helper;
import genericity.compiler.atl.analyser.ATLUtils;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.HelperAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;

public class HelperInvocationNode extends AbstractDependencyNode {

	private Helper	helper;
	private HelperAnn	helperAnn;

	public HelperInvocationNode(Helper h, HelperAnn helperAnn) {
		this.helper = h;
		this.helperAnn = helperAnn;
	}
	
	@Override
	public String genCSP(String dependent) {
		String s = "";
		for(DependencyNode n : dependencies) {
			s += n.genCSP(dependent) + " ";
		}
		return s + "\nHELPER INVOCATION: " + OclGenerator.gen(ATLUtils.getBody(helper));
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		if ( helperAnn.getReturnType() instanceof Metaclass )
			slice.addExplicitMetaclass((Metaclass) helperAnn.getReturnType());
		System.out.println("HelperInvocationNode.genErrorSlice(): TODO: Add context type and arguments");
		generatedDependencies(slice);
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, 
				"def:" + (ATLUtils.isContextHelper(helper) ? ATLUtils.getHelperType(helper).getName() + "." : "") + 
				ATLUtils.getHelperName(helper));
	}
}

package genericity.compiler.atl.graph;

import atl.metamodel.ATL.Binding;
import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.annotations.BindingAnn;

public class RuleResolutionNode extends AbstractDependencyNode {

	private BindingAnn	bindingAnn;
	private Binding	atlBinding;

	public RuleResolutionNode(Binding atlBinding, BindingAnn bindingAnn) {
		this.atlBinding = atlBinding;
		this.bindingAnn = bindingAnn;
	}
	
	@Override
	public String genCSP(String dependent) {
	//	throw new UnsupportedOperationException();
		return "";
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genErrorSlice(slice);
		}				
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, OclGenerator.gen(atlBinding.getValue()) + 
				": " + TypeUtils.typeToString(bindingAnn.getSourceType()) +"\\nresolvedBy");
	}
}

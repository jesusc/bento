package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import atl.metamodel.ATL.Binding;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;

public class BindingExpectedOneAssignedManyNode extends AbstractBindingAssignmentNode implements ProblemNode {

	private Binding	binding;

	public BindingExpectedOneAssignedManyNode(BindingExpectedOneAssignedMany problem, Binding binding) {
		super(problem);
		this.binding = binding;
	}
	

	public String genCSP(String dependent) {
		String s = "";
		for(DependencyNode n : dependencies) {
			s += n.genCSP(completeDependency(dependent)) + "\n";
		}
		return s;
	}

	private String completeDependency(String dependent) {
		String s = dependent == null ? "" : dependent + " and";
		s       += OclGenerator.gen(binding.getValue(), null) + "->size() > 1"; 
		return s;
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genErrorSlice(slice);
		}		
		
		OclSlice.slice(slice, binding.getValue());
		
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "Problem\\n" + binding.getPropertyName() + ":1 <- *" + "\\n" + binding.getLocation());
	}
}

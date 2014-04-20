package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import atl.metamodel.ATL.Binding;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;
import bento.analysis.atl_analysis.atl_error.BindingWithResolvedByIncompatibleRule;

public class BindingWithResolvedByIncompatibleRuleNode extends AbstractBindingAssignmentNode<BindingWithResolvedByIncompatibleRule> implements ProblemNode {

	private Binding	binding;

	public BindingWithResolvedByIncompatibleRuleNode(BindingWithResolvedByIncompatibleRule p, Binding binding) {
		super(p);
		this.binding = binding;
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genErrorSlice(slice);
		}		
		
		for(ConstraintNode n : constraints) {
			n.genErrorSlice(slice);
		}		
		
		OclSlice.slice(slice, binding.getValue());
		
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "Problem\\n" + binding.getPropertyName() + ":1 <- *" + "\\n" + binding.getLocation());
	}


	@Override
	public void getCSPText(CSPBuffer buf) {
		getDependency().getCSPText(buf);
		
		buf.generateIf(binding.getValue(), "->size() > 0", true);
		
		// CSPBuffer buf2 = new CSPBuffer();
		getConstraint().getCSPText(buf);
		// System.out.println(buf2.getText());
	}

}

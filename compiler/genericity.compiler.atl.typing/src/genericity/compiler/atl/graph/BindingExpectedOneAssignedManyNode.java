package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.compiler.atl.csp.TransformationSlice;
import atl.metamodel.ATL.Binding;
import atl.metamodel.OCL.OclExpression;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;

public class BindingExpectedOneAssignedManyNode extends AbstractBindingAssignmentNode implements ProblemNode {

	private Binding	binding;

	public BindingExpectedOneAssignedManyNode(BindingExpectedOneAssignedMany problem, Binding binding) {
		super(problem);
		this.binding = binding;
	}
	
	/*
	@Override
	public String genCSP(String dependent) {
		String s = "";
		for(DependencyNode n : dependencies) {
			s += n.genCSP(completeDependency(dependent)) + "\n";
		}
		return s;
	}
	*/
	/*
	private String completeDependency(String dependent) {
		String s = dependent == null ? "" : dependent + " and";
		s       += OclGenerator.gen(binding.getValue()) + "->size() > 1"; 
		return s;
	}
	*/
	
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
		gv.addNode(this, "Problem\\n" + binding.getPropertyName() + ":1 <- *" + "\\n" + binding.getLocation(), leadsToExecution);
	}


	/*
	@Override
	public void getCSPText(CSPBuffer buf) {
		getDependency().getCSPText(buf);
		
		buf.generateIf(binding.getValue(), "->size() > 1", true);
		
		// CSPBuffer buf2 = new CSPBuffer();
		getConstraint().getCSPText(buf);
		// System.out.println(buf2.getText());
	}
	*/

	@Override
	public OclExpression genCSP(CSPModel model) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		throw new UnsupportedOperationException();
	}
		
	@Override
	public boolean isStraightforward() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

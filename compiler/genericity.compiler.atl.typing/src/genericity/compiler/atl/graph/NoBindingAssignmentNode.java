package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import atl.metamodel.OCL.OclExpression;
import bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature;

public class NoBindingAssignmentNode extends AbstractBindingAssignmentNode<NoBindingForCompulsoryFeature> implements ProblemNode {

	public NoBindingAssignmentNode(NoBindingForCompulsoryFeature problem) {
		super(problem);
	}
	
	/*
	public String genCSP(String dependent) {
		String s = "";
		for(DependencyNode n : dependencies) {
			s += n.genCSP(dependent) + " ";
		}
		return s;
	}
	*/
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genErrorSlice(slice);
		}		
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "No binding for\\ncompulsory '" + problem.getFeatureName() + "'", leadsToExecution);
	}

	/*
	@Override
	public void getCSPText(CSPBuffer buf) {
		getDependency().getCSPText(buf);
	}
	*/
	
	@Override
	public OclExpression genCSP(CSPModel model) {
		return model.createBooleanLiteral(true);
	}

	@Override
	public boolean isStraightforward() {
		return true;
	}
}

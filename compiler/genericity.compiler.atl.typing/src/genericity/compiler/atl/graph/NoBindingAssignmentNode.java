package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.TransformationSlice;
import atl.metamodel.OCL.OclExpression;
import bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature;

public class NoBindingAssignmentNode extends AbstractBindingAssignmentNode<NoBindingForCompulsoryFeature> implements ProblemNode {

	public NoBindingAssignmentNode(NoBindingForCompulsoryFeature problem) {
		super(problem);
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
		gv.addNode(this, "No binding for\\ncompulsory '" + problem.getFeatureName() + "'", leadsToExecution);
	}
	
	@Override
	public OclExpression genCSP(CSPModel model) {
		return model.createBooleanLiteral(true);
	}

	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		// Do nothing
	}

	@Override
	public boolean isStraightforward() {
		return true;
	}

}

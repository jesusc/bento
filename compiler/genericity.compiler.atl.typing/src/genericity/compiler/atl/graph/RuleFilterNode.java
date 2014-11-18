package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.compiler.atl.csp.TransformationSlice;
import atl.metamodel.OCL.OclExpression;

public class RuleFilterNode implements ConstraintNode {

	private OclExpression	expr;

	public RuleFilterNode(OclExpression expr) {
		this.expr = expr;
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, expr);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		gv.addNode(this, OclGenerator.gen(expr), true);
	}

	/**
	 * Rule filters should be calculated by Rule's nodes.
	 */
	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		throw new IllegalStateException(); 
	}

	
	@Override
	public OclExpression genCSP(CSPModel model) {
		return model.gen(expr);
	}

}

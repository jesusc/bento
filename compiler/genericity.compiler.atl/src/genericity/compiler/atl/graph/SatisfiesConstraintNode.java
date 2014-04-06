package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import atl.metamodel.OCL.OclExpression;

public class SatisfiesConstraintNode extends AbstractDependencyNode {

	private OclExpression	expr;

	public SatisfiesConstraintNode(OclExpression expr) {
		this.expr = expr;
	}

	public String genCSP(String dependent) {
		String s = OclGenerator.gen(expr, null); 
		return s;
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, expr);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, OclGenerator.gen(expr));
	}
}

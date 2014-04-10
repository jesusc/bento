package genericity.compiler.atl.graph;

import genericity.compiler.atl.analyser.ErrorUtils;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import atl.metamodel.OCL.OclExpression;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

public class ExpressionProblemNode<P extends LocalProblem> extends AbstractProblemNode<LocalProblem> {

	private OclExpression	expr;

	public ExpressionProblemNode(P p, OclExpression expr) {
		super(p);
		this.expr = expr;
	}

	@Override
	public String genCSP(String dependent) {
		String s = "";
		for(DependencyNode node : getDependencies()) {
			s += node.genCSP(dependent) + "\n";
		}
		return s;
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, expr);
		generatedDependencies(slice);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		String msg = ErrorUtils.getShortError(problem);
		
		gv.addNode(this, msg + "\\n" + OclGenerator.gen(expr));
	}
}

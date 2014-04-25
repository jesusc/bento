package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.ErrorSlice;
import bento.analysis.atl_analysis.Problem;

public abstract class AbstractProblemNode<P extends Problem> extends AbstractDependencyNode implements ProblemNode {

	protected P problem;
	private ErrorSlice	errorSlice;
	
	public AbstractProblemNode(P p) {
		this.problem = p;
	}
	
	
	@Override
	public void setErrorSlice(ErrorSlice slice) {
		this.errorSlice = slice;
	}
	
	@Override
	public ErrorSlice getErrorSlice() {
		return errorSlice;
	}
	
}

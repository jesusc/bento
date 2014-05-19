package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.ErrorSlice;

public interface ProblemNode extends DependencyNode {

	void setErrorSlice(ErrorSlice slice);
	ErrorSlice getErrorSlice();
	boolean isStraightforward();
}
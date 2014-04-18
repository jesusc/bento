package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import bento.analysis.atl_analysis.Problem;

public interface DependencyNode extends GraphNode {
	void setGraph(DependencyGraph dependencyGraph);

	void addDependency(DependencyNode node);
	void addDepending(DependencyNode node);
	void addConstraint(ConstraintNode constraint);
	
	public DependencyNode getDependency();
	
	void setProblem(Problem p);
	Problem getProblem();
	
	//String genCSP(String dependent);
}

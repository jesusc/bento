package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import bento.analysis.atl_analysis.Problem;

public interface DependencyNode {
	void setGraph(DependencyGraph dependencyGraph);

	void addDependency(DependencyNode node);
	void addDepending(DependencyNode node);

	void setProblem(Problem p);
	Problem getProblem();
	
	String genCSP(String dependent);
	void genErrorSlice(ErrorSlice slice);
	void genGraphviz(GraphvizBuffer gv);
}

package genericity.compiler.atl.csp;

import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.graph.DependencyGraph;
import genericity.compiler.atl.graph.DependencyNode;

public class CSPGenerator {
	
	private DependencyGraph	graph;

	public CSPGenerator(DependencyGraph g) {
		this.graph = g;
	}
	
	public String generate() {
		String s = "";
		for(DependencyNode node : graph.getProblemNodes()) {
			LocalProblem lp = (LocalProblem) node.getProblem();

			s += lp.getClass().getSimpleName() + " (" + lp.getLocation() +"): ";
			s += node.genCSP(null);
			s += "\n";
		}
		return s;
	}
}

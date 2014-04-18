package genericity.compiler.atl.csp;

import java.io.FileWriter;
import java.io.IOException;

import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.graph.DependencyGraph;
import genericity.compiler.atl.graph.DependencyNode;

public class GraphvizGenerator {
	
	private DependencyGraph	graph;

	public GraphvizGenerator(DependencyGraph g) {
		this.graph = g;
	}
	
	public String generate() {
		GraphvizBuffer gv = new GraphvizBuffer();
		for(DependencyNode node : graph.getProblemNodes()) {
			node.genGraphviz(gv);
			if ( graph.getProblemNodes().size() > 1 ) {
				gv.packSubgraph();
			}
		}
		return gv.getText();
	}

	public void visualize(String path) {
		String s = generate();
		try {
			FileWriter fw = new FileWriter(path);
			fw.append(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

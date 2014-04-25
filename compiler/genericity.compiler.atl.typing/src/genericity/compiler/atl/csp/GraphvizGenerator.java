package genericity.compiler.atl.csp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.graph.DependencyGraph;
import genericity.compiler.atl.graph.DependencyNode;

public class GraphvizGenerator {
	
	private DependencyGraph	graph;

	public GraphvizGenerator(DependencyGraph g) {
		this.graph = g;
	}
	
	public String generate() {
		LinkedList<DependencyNode> sorted = new LinkedList<DependencyNode>(graph.getProblemNodes());
		Collections.sort(sorted, new Comparator<DependencyNode>() {
			@Override
			public int compare(DependencyNode arg0, DependencyNode arg1) {
				LocalProblem lp1 = (LocalProblem) arg0.getProblem();
				LocalProblem lp2 = (LocalProblem) arg1.getProblem();
				return lp1.getLocation().compareTo(lp2.getLocation());
			}
		});
		
		GraphvizBuffer gv = new GraphvizBuffer();
		for(DependencyNode node : sorted) {
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

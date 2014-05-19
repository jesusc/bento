package genericity.compiler.atl.csp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.graph.ProblemGraph;
import genericity.compiler.atl.graph.ProblemPath;
import genericity.compiler.atl.graph.DependencyNode;

public class GraphvizGenerator {
	
	private ProblemGraph	graph;

	public GraphvizGenerator(ProblemGraph g) {
		this.graph = g;
	}
	
	public String generate(String location) {
		ArrayList<ProblemPath> sorted = graph.getProblemPaths();
		
		GraphvizBuffer gv = new GraphvizBuffer();
		for(ProblemPath path : sorted) {
			LocalProblem lp = path.getProblem();
			if ( location != null && ! lp.getLocation().equals(location) ) 
				continue;

			path.getErrorNode().genGraphviz(gv);
			if ( graph.getProblemPaths().size() > 1 ) {
				gv.packSubgraph();
			}
		}
		return gv.getText();
	}

	public void visualize(String path) {
		visualize(path, null);
	}
	
	public void visualize(String path, String location) {
		String s = generate(location);
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

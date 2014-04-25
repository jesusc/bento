package genericity.compiler.atl.csp;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.analyser.ErrorUtils;
import genericity.compiler.atl.graph.DependencyGraph;
import genericity.compiler.atl.graph.DependencyNode;
import genericity.compiler.atl.graph.HelperInvocationNode;

public class CSPGenerator {
	
	private DependencyGraph	graph;
	private ErrorSlice	slice;

	public CSPGenerator(DependencyGraph g, ErrorSlice slice) {
		this.graph = g;
		this.slice = slice;
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
		
		String s = "";
		for(DependencyNode node : sorted) {
			LocalProblem lp = (LocalProblem) node.getProblem();

			s += ErrorUtils.getErrorMessage(lp) + " (" + lp.getLocation() +"): \n";
			s += generateCSP(node);
			s += "\n\n";
			// System.out.println(s);
		}
		return s;
	}

	private String generateCSP(DependencyNode errorNode) {
		CSPBuffer buf = new CSPBuffer();
		
		errorNode.getCSPText(buf);
		
		String s = buf.getText();
		
		return s;
		/*
		while ( (node = node.getDependency()) != null ) {
			node.getCSPText(buf);
			
			if ( node instanceof HelperInvocationNode ) {
				System.out.println("* End of helper\n");
				// break;
			}
		}
		*/
	}
}

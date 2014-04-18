package genericity.compiler.atl.csp;

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
		String s = "";
		for(DependencyNode node : graph.getProblemNodes()) {
			LocalProblem lp = (LocalProblem) node.getProblem();

			s += ErrorUtils.getErrorMessage(lp) + " (" + lp.getLocation() +"): \n";
			s += generateCSP(node);
			s += "\n\n";
			System.out.println(s);
			s = "";
		}
		return s;
	}

	private String generateCSP(DependencyNode errorNode) {
		CSPBuffer buf = new CSPBuffer();
		
		for(String typeName : slice.getHelpers().keySet()) {
			
		}
		
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

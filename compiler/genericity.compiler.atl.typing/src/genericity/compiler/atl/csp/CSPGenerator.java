package genericity.compiler.atl.csp;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import atl.metamodel.OCL.OclExpression;
import bento.analyser.util.AtlLoader;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.analyser.ErrorUtils;
import genericity.compiler.atl.graph.ProblemGraph;
import genericity.compiler.atl.graph.ProblemPath;
import genericity.compiler.atl.graph.DependencyNode;
import genericity.compiler.atl.graph.ExecutionNode;
import genericity.compiler.atl.graph.HelperInvocationNode;

public class CSPGenerator {
	
	private ProblemGraph	graph;
	private ErrorSlice	slice;
	private boolean topDown = false;
	private AtlLoader loader;

	public CSPGenerator(ProblemGraph g, ErrorSlice slice, AtlLoader loader) {
		this(g, slice, false);
		this.loader = loader;
	}
	
	public CSPGenerator(ProblemGraph g, ErrorSlice slice, boolean topDown) {
		this.graph = g;
		this.slice = slice;
		this.topDown  = topDown;
	}

	public String generate() {
		return generateLoc(null);
	}
	
	public String generateLoc(String location) {
		List<ProblemPath> sorted = graph.getSortedPaths();
		
		String s = "";
		for(ProblemPath path : sorted) {
			LocalProblem lp = (LocalProblem) path.getProblem();
		
			if ( location != null && ! lp.getLocation().equals(location) ) 
				continue;
				
			s += ErrorUtils.getErrorMessage(lp) + " (" + lp.getLocation() +"): \n";
			s += generateCSP(path);
			s += "\n\n";
			// System.out.println(s);
		}
		return s;
	}

	/*
	public String generate(Problem p) {
		for(DependencyNode node : graph.getProblemNodes()) {
			if ( node.getProblem() == p ) {
				return generateCSP(node);
			}
		}
		throw new IllegalArgumentException();
	}
	*/
	
	public String generateCSP(ProblemPath path) {
		DependencyNode errorNode = path.getErrorNode();
		if ( topDown ) {
			CSPBuffer buf = new CSPBuffer();
			
			errorNode.getCSPText(buf);
			
			String s = buf.getText();
			
			return s;
		} else {
			for (ExecutionNode node : path.getExecutionNodes()) {
				OclExpression exp = node.genCSP(new CSPModel(loader));
				return OclGenerator.gen(exp);
				// Only one execution node supported so far
			}
			
			return "Nothing generated";
		}
	}
}

package genericity.compiler.atl.csp;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import atl.metamodel.OCL.OclExpression;
import bento.analyser.util.AtlLoader;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.ErrorUtils;
import genericity.compiler.atl.graph.ProblemGraph;
import genericity.compiler.atl.graph.ProblemPath;
import genericity.compiler.atl.graph.DependencyNode;
import genericity.compiler.atl.graph.ExecutionNode;
import genericity.compiler.atl.graph.HelperInvocationNode;

public class CSPGenerator {
	
	private ProblemGraph	graph;
	private ErrorSlice	slice;
	private AtlLoader loader;

	public CSPGenerator(ProblemGraph g, ErrorSlice slice, AtlLoader loader) {
		this(g, slice);
		this.loader = loader;
	}
	
	public CSPGenerator(ProblemGraph g, ErrorSlice slice) {
		this.graph = g;
		this.slice = slice;
	}

	public String generate(Analyser analyser) {
		return generateLoc(null, analyser);
	}
	
	public String generateLoc(String location, Analyser analyser) {
		List<ProblemPath> sorted = graph.getSortedPaths();
		
		String s = "";
		for(ProblemPath path : sorted) {
			LocalProblem lp = (LocalProblem) path.getProblem();
		
			if ( location != null && ! lp.getLocation().equals(location) ) 
				continue;
				
			s += ErrorUtils.getErrorMessage(lp) + " (" + lp.getLocation() +"): \n";
			// System.out.println(lp.getLocation());
			s += generateCSP(path, analyser);
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
	
	public String generateCSP(ProblemPath path, Analyser analyser) {
		DependencyNode errorNode = path.getErrorNode();
		for (ExecutionNode node : path.getExecutionNodes()) {
			OclExpression exp = node.genCSP(new CSPModel(loader, analyser));
			return OclGenerator.gen(exp); // Not passing the analyser because it is not an original expression...
			// Only one execution node supported so far
		}
		
		return "Nothing generated";
	}
}

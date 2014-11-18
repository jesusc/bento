package genericity.compiler.atl.csp;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import atl.metamodel.OCL.IteratorExp;
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

public class TransformationSlicer {
	
	private ProblemGraph	graph;
	private AtlLoader loader;

	public TransformationSlicer(ProblemGraph g, AtlLoader loader) {
		this(g);
		this.loader = loader;
	}
	
	public TransformationSlicer(ProblemGraph g) {
		this.graph = g;
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
			
			s = generateSlice(path, analyser);
			// System.out.println(s);
		}
		return s;
	}
	
	public String generateSlice(ProblemPath path, Analyser analyser) {
		DependencyNode errorNode = path.getErrorNode();

		TransformationSlice slice = new TransformationSlice(analyser.getATLModel());
		errorNode.genTransformationSlice(slice);
		
		throw new UnsupportedOperationException();
	}
}

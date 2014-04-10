package genericity.compiler.atl.csp;

import org.eclipse.emf.ecore.resource.Resource;

import bento.analyser.footprint.EffectiveMetamodelBuilder;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.ErrorUtils;
import genericity.compiler.atl.graph.DependencyGraph;
import genericity.compiler.atl.graph.DependencyNode;
import genericity.compiler.atl.graph.ProblemNode;

public class ErrorSliceGenerator {
	
	private DependencyGraph	graph;
	private Analyser	analyser;
	
	public ErrorSliceGenerator(Analyser analyser, DependencyGraph g) {
		this.graph = g;
		this.analyser = analyser;
	}

	public void generate(String metamodelName) {
		for(DependencyNode node : graph.getProblemNodes()) {
			ErrorSlice slice = new ErrorSlice(analyser, metamodelName);
			node.genErrorSlice(slice);
			((ProblemNode) node).setErrorSlice(slice);
		}
	}

	public void generate(Resource r, String metamodelName) {
		generate(metamodelName);
		
		int i = 0;
		for(DependencyNode node : graph.getProblemNodes()) {
			ErrorSlice slice = ((ProblemNode) node).getErrorSlice();
			LocalProblem p   = (LocalProblem) ((ProblemNode) node).getProblem();
			
			String name = ErrorUtils.getShortError(p);
			new EffectiveMetamodelBuilder(slice).extractSource(r, name, name, "prefix" + i);
			
			i++;
		}
	}
}

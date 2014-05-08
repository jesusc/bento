package genericity.compiler.atl.csp;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

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
	private ErrorSlice	slice;
	
	public ErrorSliceGenerator(Analyser analyser, DependencyGraph g) {
		this.graph = g;
		this.analyser = analyser;
	}

	public ErrorSlice generate(String metamodelName) {
		for(DependencyNode node : graph.getProblemNodes()) {
			slice = new ErrorSlice(analyser, metamodelName);
			node.genErrorSlice(slice);
			((ProblemNode) node).setErrorSlice(slice);
		}
		
		return slice;
	}

	public ErrorSlice generate(Resource r, String metamodelName) {
		generate(metamodelName);

		LinkedList<DependencyNode> sorted = new LinkedList<DependencyNode>(graph.getProblemNodes());
		Collections.sort(sorted, new Comparator<DependencyNode>() {
			@Override
			public int compare(DependencyNode arg0, DependencyNode arg1) {
				LocalProblem lp1 = (LocalProblem) arg0.getProblem();
				LocalProblem lp2 = (LocalProblem) arg1.getProblem();
				return lp1.getLocation().compareTo(lp2.getLocation());
			}
		});
		
		int i = 0;
		for(DependencyNode node : sorted) {
			slice = ((ProblemNode) node).getErrorSlice();
			LocalProblem p   = (LocalProblem) ((ProblemNode) node).getProblem();
			
			String name = "error" + (i + 1);
			String info = ErrorUtils.getShortError(p);
			new EffectiveMetamodelBuilder(slice).extractSource(r, name, name, "prefix" + (i + 1), info);
			
			i++;
		}
		
		return slice;
	}
	
	public ErrorSlice generate(Problem p, Resource r, String metamodelName) {
		generate(metamodelName);

		for(DependencyNode node : graph.getProblemNodes()) {
			LocalProblem problemOfNode   = (LocalProblem) ((ProblemNode) node).getProblem();
			System.out.println(p + " - " + problemOfNode);
			if ( problemOfNode == p ) {
				slice = ((ProblemNode) node).getErrorSlice();

				String name = "error"; //  + (i + 1);
				String info = ErrorUtils.getShortError(problemOfNode);

				new EffectiveMetamodelBuilder(slice).extractSource(r, name, name, name, info);
				return slice;
			}
		}
		
		throw new IllegalArgumentException(graph.getProblemNodes().toString());
	}
	
	
	public ErrorSlice getSlice() {
		return slice;
	}
	
}

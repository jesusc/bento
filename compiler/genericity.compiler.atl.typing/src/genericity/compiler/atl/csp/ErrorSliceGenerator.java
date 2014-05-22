package genericity.compiler.atl.csp;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.ErrorUtils;
import genericity.compiler.atl.graph.ProblemGraph;
import genericity.compiler.atl.graph.ProblemPath;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import bento.analyser.footprint.EffectiveMetamodelBuilder;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

public class ErrorSliceGenerator {
	
	private ProblemGraph graph;
	private Analyser	analyser;
	private ErrorSlice	slice;
	
	public ErrorSliceGenerator(Analyser analyser, ProblemGraph g) {
		this.graph = g;
		this.analyser = analyser;
	}

	public ErrorSlice generate(String metamodelName) {
		for(ProblemPath path : graph.getProblemPaths()) {
			slice = new ErrorSlice(analyser, metamodelName);
			path.getErrorNode().genErrorSlice(slice);
			path.getErrorNode().setErrorSlice(slice);
		}
		
		return slice;
	}

	public ErrorSlice generate(Resource r, String metamodelName, String location) {
		int i = 0;
		for(ProblemPath path : graph.getProblemPaths()) {
			if ( path.getProblem().getLocation().equals(location) ) {
				slice = new ErrorSlice(analyser, metamodelName);
				path.getErrorNode().genErrorSlice(slice);
				path.getErrorNode().setErrorSlice(slice);

				slice = path.getErrorNode().getErrorSlice();
				LocalProblem p = path.getProblem();
				
				String name = "error" + (i + 1);
				String info = ErrorUtils.getShortError(p);
				new EffectiveMetamodelBuilder(slice).extractSource(r, name, name, "prefix" + (i + 1), info);
				
				i++;				
			}
		}
		
		return slice;
	}
	
	public ErrorSlice generate(Resource r, String metamodelName) {
		generate(metamodelName);

		List<ProblemPath> sorted = graph.getSortedPaths();
		
		int i = 0;
		for(ProblemPath path : sorted) {
			slice = path.getErrorNode().getErrorSlice();
			LocalProblem p = path.getProblem();
			
			String name = "error" + (i + 1);
			String info = ErrorUtils.getShortError(p);
			new EffectiveMetamodelBuilder(slice).extractSource(r, name, name, "prefix" + (i + 1), info);
			
			i++;
		}
		
		return slice;
	}
	
	public ErrorSlice generate(ProblemPath path, Resource r, String metamodelName) {
		slice = new ErrorSlice(analyser, metamodelName);
		path.getErrorNode().genErrorSlice(slice);
		path.getErrorNode().setErrorSlice(slice);

		LocalProblem problemOfNode   = path.getProblem();
		slice = path.getErrorNode().getErrorSlice();

		String name = "error"; //  + (i + 1);
		String info = ErrorUtils.getShortError(problemOfNode);

		new EffectiveMetamodelBuilder(slice).extractSource(r, name, name, name, info);
		return slice;
	}
	
	
	public ErrorSlice getSlice() {
		return slice;
	}

	
	
}

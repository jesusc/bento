package genericity.compiler.atl.csp;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.graph.DependencyNode;
import genericity.compiler.atl.graph.ProblemGraph;
import genericity.compiler.atl.graph.ProblemPath;

import java.util.List;

import atl.metamodel.ATLModel;
import bento.analyser.util.ATLSerializer;
import bento.analyser.util.AtlLoader;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

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
		
		ATLModel result = slice.doSlice();
		/*
		try {
			ModelFactory modelFactory = new EMFModelFactory();
			IReferenceModel atlMetamodel = modelFactory
					.getBuiltInResource("ATL.ecore"); //$NON-NLS-1$
			IModel atlModel = modelFactory.newModel(atlMetamodel);
	
			EMFInjector injector = new EMFInjector();
			injector.inject(atlModel, result.getResource());
			System.out.println(result.getResource().getContents());
			AtlParser atlParser = new AtlParser();
			atlParser.extract(atlModel,  "/tmp/salid.atl");

		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		return ATLSerializer.serialize(result);
	}
}

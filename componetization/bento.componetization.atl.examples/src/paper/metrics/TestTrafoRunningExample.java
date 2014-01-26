package paper.metrics;


import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.resource.Resource;

import tests.base.BaseTest;
import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.MetamodelPrunner;

public class TestTrafoRunningExample extends BaseTest {
	// public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/footprint/simplequery/simplequery1.atl.xmi";

	public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/paper/metrics/trafo_running_example.atl.xmi";

	
	public static final String TARGET_METAMODEL_NAME = "NOTHING_FOR_LIBRARIES";
	private static final String SOURCE_METAMODEL_NAME = "UML";

	public static final String SOURCE_METAMODEL = "../bento.componetization.atl.examples/src/paper/metrics/SimpleUML.ecore";
	public static final String TARGET_METAMODEL = "../bento.componetization.atl.examples/src/paper/metrics/Metrics.ecore";

	public static final String PRUNED_SOURCE_METAMODEL = "tmp_/SimpleUML_concept.ecore";

	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();
		
		new TestTrafoRunningExample().run();
	}
	
	public void run() throws IOException {
		// initial typing
		typing(ATL_TRANSFORMATION, SOURCE_METAMODEL, TARGET_METAMODEL);
		
		// getTransformationMetamodels().serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		// getTypingModel().serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));

		System.out.println("Typing of " + TestTrafoRunningExample.class.getSimpleName());

		// Meta-model prunning
		MetamodelPrunner pr = pruneMetamodel("http://bento/componetization/paper/simpleuml", "http://bento/componetization/paper/simpleuml_concept", "simpleuml");
		Resource prunned = savePrunnedMetamodel(PRUNED_SOURCE_METAMODEL);
		
		System.out.println("Meta-model prunned");
		
		// Re-typing
		typing(ATL_TRANSFORMATION, prunned, TARGET_METAMODEL);
		System.out.println("Re-Typing of " + TestTrafoRunningExample.class.getSimpleName());
		
		getTypingModel().serialize(new FileOutputStream("tmp_/retyping.xmi"));
		
		// Effective meta-model
		ConceptExtractor ex = extractConcept("http://bento/componetization/paper/simpleuml_concept", "http://bento/componetization/paper/simpleuml_concept", "simpleuml");
		
		// Refactor
		ex.refactor();
		
		saveConcept(withDir("tmp_/concept_paper_running_example.ecore"));
		this.atlTransformation.serialize(new FileOutputStream(withDir("tmp_/trafo_running_example.atl.xmi")));
		
		
		
		System.out.println("Finished extracting of " + TestTrafoRunningExample.class.getSimpleName());

	}

}

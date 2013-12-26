package paper.metrics;


import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import tests.base.BaseTest;
import bento.componetization.atl.ConceptExtractor;

public class TestTrafoRunningExample extends BaseTest {
	// public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/footprint/simplequery/simplequery1.atl.xmi";

	public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/paper/metrics/trafo_running_example.atl.xmi";

	
	public static final String TARGET_METAMODEL_NAME = "NOTHING_FOR_LIBRARIES";
	private static final String SOURCE_METAMODEL_NAME = "UML";

	public static final String SOURCE_METAMODEL = "../bento.componetization.atl.examples/src/paper/metrics/SimpleUML.ecore";
	public static final String TARGET_METAMODEL = "../bento.componetization.atl.examples/src/paper/metrics/Metrics.ecore";
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();
		
		new TestTrafoRunningExample().run();
	}
	
	public void run() throws IOException {
		// typing
		typing(ATL_TRANSFORMATION, SOURCE_METAMODEL, TARGET_METAMODEL);
		
		getTransformationMetamodels().serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		getTypingModel().serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));

		System.out.println("Finished typing of " + TestTrafoRunningExample.class.getSimpleName());

		// Effective meta-model
		ConceptExtractor ex = extractConcept("http://bento/componetization/paper/simpleuml", "http://bento/componetization/paper/simpleuml_concept", "simpleuml",
				// ConceptExtractor.Strategy.CALLSITES_STRATEGY);
				ConceptExtractor.Strategy.REALFEATURE_STRATEGY);

		
		// Refactor
		ex.refactor();
		
		saveConcept(withDir("tmp_/concept_paper_running_example.ecore"));
		
		
		
		System.out.println("Finished extracting of " + TestTrafoRunningExample.class.getSimpleName());

	}

}

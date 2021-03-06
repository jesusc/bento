package footprint.simplequery;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import tests.base.BaseTest;
import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.MetamodelPrunner;

public class TestFootprint extends BaseTest {
	// public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/footprint/simplequery/simplequery1.atl.xmi";

	public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/footprint/simplequery/simplequery1.atl.xmi";

	
	public static final String TARGET_METAMODEL_NAME = "NOTHING_FOR_LIBRARIES";
	private static final String SOURCE_METAMODEL_NAME = "CD";

	public static final String SOURCE_METAMODEL = "../bento.componetization.atl.examples/src/footprint/simplequery/ClassCD.ecore";
	public static final String TARGET_METAMODEL = "../bento.componetization.atl.examples/src/footprint/simplequery/ClassCD.ecore";
	
	public static final String PRUNED_SOURCE_METAMODEL = "tmp_/ClassCD_concept.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();
		
		new TestFootprint().run();
	}
	
	public void run() throws IOException {
		// typing
		typing(ATL_TRANSFORMATION, new Object[] { SOURCE_METAMODEL }, new String[] { "CD" });
		
		// getTransformationMetamodels().serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		// getTypingModel().serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));

		System.out.println("Finished analysis of " + TestFootprint.class.getSimpleName());

		// Prunning
		MetamodelPrunner pr = pruneMetamodel("http://bento/componetization/simplequery/classcd", "CD", "http://bento/footprint/simplequery1_concept", "classdiag", PRUNED_SOURCE_METAMODEL);
		Resource prunned = savePrunnedMetamodel(PRUNED_SOURCE_METAMODEL);		
		
		System.out.println("Meta-model prunned");
		
		// Re-typing
		typing(ATL_TRANSFORMATION, new Object[] { prunned }, new String[] { "CD" });

		// Extract concept by refactoring
		ConceptExtractor extractor = extractConcept("http://bento/componetization/simplequery/classcd", "CD", "http://bento/footprint/simplequery1_concept", "classdiag");
		
		saveConcept(withDir("tmp_/concept_simplequery1.ecore"));
		// this.atlTransformation.serialize(new FileOutputStream(withDir("tmp_/test_footprint.atl.xmi")));

		
		System.out.println("Finished extracting of " + TestFootprint.class.getSimpleName());

	}

}

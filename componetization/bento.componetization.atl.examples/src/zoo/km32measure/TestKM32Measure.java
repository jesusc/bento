package zoo.km32measure;


import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.resource.Resource;

import paper.metrics.TestTrafoRunningExample;

import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.MetamodelPrunner;

import tests.base.BaseTest;

public class TestKM32Measure extends BaseTest {
	// public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/zoo/km32measure/KM32Measure_all.atl.xmi";
	public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/template/KM32Measure_all.atl.xmi";

	public static final String TARGET_METAMODEL_NAME = "Measure";
	private static final String SOURCE_METAMODEL_NAME = "KM3";

	public static final String SOURCE_METAMODEL = "../bento.componetization.atl.examples/src/zoo/km32measure/KM3_modified.ecore";
	public static final String TARGET_METAMODEL = "../bento.componetization.atl.examples/src/zoo/km32measure/Measure.ecore";

	public static final String PRUNED_SOURCE_METAMODEL = "tmp_/KM3_concept.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new TestKM32Measure().run();
	}
	
	public void run() throws IOException {
		// typing
		typing(ATL_TRANSFORMATION, SOURCE_METAMODEL, TARGET_METAMODEL);
		
		// getTransformationMetamodels().serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		getTypingModel().serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));

		System.out.println("Finished typing of " + TestKM32Measure.class.getSimpleName());

		// Meta-model prunning
		MetamodelPrunner pr = pruneMetamodel("amma/km3/modified", "http://bento/examples/classdiag", "classidag", PRUNED_SOURCE_METAMODEL);
		Resource prunned = savePrunnedMetamodel(PRUNED_SOURCE_METAMODEL);		
		
		System.out.println("Meta-model prunned");
		
		// Re-typing
		typing(ATL_TRANSFORMATION, prunned, TARGET_METAMODEL);
		System.out.println("Re-Typing of " + TestKM32Measure.class.getSimpleName());

		// conceptExtraction - RealFeature
		ConceptExtractor ex = extractConcept("http://bento/examples/classdiag", "http://bento/examples/classdiag", "classdiag_concept");
		
		saveConcept(withDir("tmp_/concept_uml2measure.ecore"));
		System.out.println("Finished extracting of " + TestKM32Measure.class.getSimpleName());

		/*
		// Call sites
		extractConcept("http://www.eclipse.org/uml2/3.0.0/UML", "http://bento/examples/classdiag", "classdiag_concept",
				ConceptExtractor.Strategy.CALLSITES_STRATEGY);
		saveConcept(withDir("tmp_/concept_uml2measure_sites.ecore"));
		System.out.println("Finished extracting of " + TestUML2Measure.class.getSimpleName());
		*/
	}

}

package zoo.uml2owl;


import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import bento.componetization.atl.ConceptExtractor;

import tests.base.BaseTest;

public class TestUML2OWL extends BaseTest {
	public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/zoo/uml2owl/UML2OWL.atl.xmi";
	public static final String TARGET_METAMODEL_NAME = "Measure";
	private static final String SOURCE_METAMODEL_NAME = "UML2";

	public static final String SOURCE_METAMODEL = "../bento.componetization.atl.examples/src/zoo/uml2owl/UML2_3_0_0.ecore";
	public static final String TARGET_METAMODEL = "../bento.componetization.atl.examples/src/zoo/uml2owl/OWL.ecore";
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new TestUML2OWL().run();
	}
	
	public void run() throws IOException {
		// typing
		typing(ATL_TRANSFORMATION, SOURCE_METAMODEL, TARGET_METAMODEL);
		
		getTransformationMetamodels().serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		getTypingModel().serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));

		System.out.println("Finished typing of " + TestUML2OWL.class.getSimpleName());

		// conceptExtraction - RealFeature
		ConceptExtractor ex = extractConcept("http://www.eclipse.org/uml2/3.0.0/UML", "http://bento/examples/classdiag", "classdiag_concept",
				ConceptExtractor.Strategy.REALFEATURE_STRATEGY);

		printAnalysisInfo(ex);		
		
		// Refactor
		ex.refactor();
		
		saveConcept(withDir("tmp_/concept_uml2owl.ecore"));
		System.out.println("Finished extracting of " + TestUML2OWL.class.getSimpleName());

		/*
		// Call sites
		extractConcept("http://www.eclipse.org/uml2/3.0.0/UML", "http://bento/examples/classdiag", "classdiag_concept",
				ConceptExtractor.Strategy.CALLSITES_STRATEGY);
		saveConcept(withDir("tmp_/concept_uml2measure_sites.ecore"));
		System.out.println("Finished extracting of " + TestUML2Measure.class.getSimpleName());
		*/
	}

}
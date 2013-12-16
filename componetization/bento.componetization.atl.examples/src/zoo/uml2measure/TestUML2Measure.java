package zoo.uml2measure;


import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import tests.base.BaseTest;

public class TestUML2Measure extends BaseTest {
	public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/zoo/uml2measure/oo2measure-all.atl.xmi";
	public static final String TARGET_METAMODEL_NAME = "Measure";
	private static final String SOURCE_METAMODEL_NAME = "UML2";

	public static final String SOURCE_METAMODEL = "../bento.componetization.atl.examples/src/zoo/uml2measure/UML2_3_0_0.ecore";
	public static final String TARGET_METAMODEL = "../bento.componetization.atl.examples/src/zoo/uml2measure/Measure.ecore";
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new TestUML2Measure().run();
	}
	
	public void run() throws IOException {
		// typing
		typing(ATL_TRANSFORMATION, SOURCE_METAMODEL, TARGET_METAMODEL);
		
		getTransformationMetamodels().serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		getTypingModel().serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));

		System.out.println("Finished typing of " + TestUML2Measure.class.getSimpleName());

		// conceptExtraction
		extractConcept("http://www.eclipse.org/uml2/3.0.0/UML", "http://bento/examples/classdiag", "classdiag_concept");
		saveConcept(withDir("tmp_/concept_uml2measure.ecore"));
		System.out.println("Finished extracting of " + TestUML2Measure.class.getSimpleName());

	}

}

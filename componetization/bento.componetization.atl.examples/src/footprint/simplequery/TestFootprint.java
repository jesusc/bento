package footprint.simplequery;


import genericity.typecheck.atl.TypeCheckLauncher;
import genericity.typing.atl_types.AtlTypingPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import tests.base.BaseTest;

import zoo.uml2measure.TestUML2Measure;

import bento.componetization.atl.ConceptExtractor;

public class TestFootprint extends BaseTest {
	public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/footprint/simplequery/simplequery1.atl.xmi";
	public static final String TARGET_METAMODEL_NAME = "NOTHING_FOR_LIBRARIES";
	private static final String SOURCE_METAMODEL_NAME = "CD";

	public static final String SOURCE_METAMODEL = "../bento.componetization.atl.examples/src/footprint/simplequery/ClassCD.ecore";
	public static final String TARGET_METAMODEL = "../bento.componetization.atl.examples/src/footprint/simplequery/ClassCD.ecore";
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();
		
		new TestFootprint().run();
	}
	
	public void run() throws IOException {
		// typing
		typing(ATL_TRANSFORMATION, SOURCE_METAMODEL, TARGET_METAMODEL);
		
		getTransformationMetamodels().serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		getTypingModel().serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));

		System.out.println("Finished typing of " + TestFootprint.class.getSimpleName());

		// Call sites
		extractConcept("http://bento/componetization/simplequery/classcd", "http://bento/footprint/simplequery1_concept", "classdiag",
				ConceptExtractor.Strategy.CALLSITES_STRATEGY);
		saveConcept(withDir("tmp_/concept_simplequery1_sites.ecore"));
		System.out.println("Finished extracting of " + TestFootprint.class.getSimpleName());

	}

}

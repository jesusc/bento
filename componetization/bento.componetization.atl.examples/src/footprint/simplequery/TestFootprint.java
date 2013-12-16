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

import bento.componetization.atl.ConceptExtractor;

public class TestFootprint {
	public static final String ATL_TRANSFORMATION = "../bento.componetization.atl.examples/src/footprint/simplequery/simplequery1.atl.xmi";
	public static final String TARGET_METAMODEL_NAME = "NOTHING_FOR_LIBRARIES";
	private static final String SOURCE_METAMODEL_NAME = "CD";

	public static final String SOURCE_METAMODEL = "../bento.componetization.atl.examples/src/footprint/simplequery/ClassCD.ecore";
	public static final String TARGET_METAMODEL = "../bento.componetization.atl.examples/src/footprint/simplequery/ClassCD.ecore";
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");

		Util.registerResourceFactory();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
	
		BasicEMFModel mm = TypeCheckLauncher.loadTransformationMetamodels(loader, SOURCE_METAMODEL); //, TARGET_METAMODEL);
				
		BasicEMFModel atlTransformation = loader
				.basicModelFromFile(
						withDir("../../compiler/genericity.compiler.atl/src/genericity/typecheck/atl/ATL.ecore"),
						withDir(ATL_TRANSFORMATION));

		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		BasicEMFModel out = loader
				.emptyModelFromMemory(pkgs, "tmp_/typing.xmi");

		new TypeCheckLauncher().launch(mm, atlTransformation, out);
		
		out.serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));
		mm.serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		System.out.println("Finished typing of " + TestFootprint.class.getSimpleName());

		
		// Extractor
		ConceptExtractor extractor = new ConceptExtractor(atlTransformation, mm, out, "http://bento/componetization/simplequery/classcd");
		EPackage pkg = extractor.extractSource("classdiag", "http://bento/footprint/simplequery1_concept", "classdiag_concept");

		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(withDir("tmp_/simple_query1_concept.ecore")));
		r.getContents().add(pkg);
		r.save(null);
		
		System.out.println("Finished extracting of " + TestFootprint.class.getSimpleName());

	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}
}

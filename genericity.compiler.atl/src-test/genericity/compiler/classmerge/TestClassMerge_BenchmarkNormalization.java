package genericity.compiler.classmerge;

import genericity.compiler.atl.ClassMerge;
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
import org.eclipse.emf.ecore.EPackage;

public class TestClassMerge_BenchmarkNormalization {

	public static final String BINDING_MODEL = "../genericity.benchmarks/stbenchmark/scenarios/i_denormalization/i_denormalization.gbind.xmi";
	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/stbenchmark/trafo/copybio_i_denormalization.atl.xmi";
	public static final String BOUND_METAMODEL_NAME = "BIO1";
	public static final String TARGET_METAMODEL_NAME = "BIO2";
	private static final String SOURCE_METAMODEL_NAME = "BIO1";

	public static final String SOURCE_METAMODEL = "../genericity.benchmarks/stbenchmark/metamodels/bio_src.ecore";
	public static final String TARGET_METAMODEL = "../genericity.benchmarks/stbenchmark/metamodels/bio_src.ecore";
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");

		Util.registerResourceFactory();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
	
		BasicEMFModel mm = TypeCheckLauncher.loadTransformationMetamodels(loader, SOURCE_METAMODEL, TARGET_METAMODEL);
				
		BasicEMFModel atlTransformation = loader
				.basicModelFromFile(
						withDir("../genericity.atl.transformations/metamodels/ATL.ecore"),
						withDir(ATL_TRANSFORMATION));

		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		BasicEMFModel out = loader
				.emptyModelFromMemory(pkgs, "tmp_/typing.xmi");

		new TypeCheckLauncher().launch(mm, atlTransformation, out);
		
		out.serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));
		mm.serialize(new FileOutputStream("tmp_/typing_metamodels.ecore"));
		System.out.println("Finished typing of " + TestClassMerge_BenchmarkNormalization.class.getSimpleName());

		
		/// 
		
		BasicEMFModel bindingModel = loader
				.basicModelFromFile(
						new String[] {
						// withDir("../be.ac.vub.simpleocl/metamodel/simpleocl.ecore"),
						withDir("../genericity.language.gbind/metamodel/gbind.ecore") },
						withDir(BINDING_MODEL));

		ClassMerge.BindingData data = new ClassMerge.BindingData(SOURCE_METAMODEL_NAME, BOUND_METAMODEL_NAME);
		new ClassMerge().launch(atlTransformation, bindingModel, out, data);

		System.out.println("Finished class merge adaptation of " + TestClassMerge_BenchmarkNormalization.class.getSimpleName());

		atlTransformation.serialize(new FileOutputStream("tmp_/virtual_classes.adapted.atl.xmi"));
	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}
}

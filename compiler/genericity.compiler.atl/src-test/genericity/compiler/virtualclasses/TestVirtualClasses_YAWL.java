package genericity.compiler.virtualclasses;

import genericity.compiler.atl.Class2Reference;
import genericity.compiler.atl.VirtualClasses;
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

public class TestVirtualClasses_YAWL {

	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/flowdiagrams/trafo/flow2pn.atl.xmi";
	public static final String SOURCE_METAMODEL = "../genericity.benchmarks/components/flowdiagrams/metamodels/flow_concept.ecore";
	public static final String TARGET_METAMODEL = "../genericity.benchmarks/components/flowdiagrams/metamodels/petri_nets.ecore";
	public static final String BINDING_MODEL    = "../genericity.benchmarks/components/flowdiagrams/yawl2pn/yawl.gbind.xmi";
	private static final String BOUND_METAMODEL_NAME = "YAWL";
	private static final String SOURCE_METAMODEL_NAME = "FD";
	
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
		System.out.println("Finished typing of " + TestVirtualClasses_YAWL.class.getSimpleName());

		
		/// 
		
		BasicEMFModel bindingModel = loader
				.basicModelFromFile(
						new String[] {
						// withDir("../be.ac.vub.simpleocl/metamodel/simpleocl.ecore"),
						withDir("../genericity.language.gbind/metamodel/gbind.ecore") },
						withDir(BINDING_MODEL));

		VirtualClasses.BindingData data = new VirtualClasses.BindingData(SOURCE_METAMODEL_NAME, BOUND_METAMODEL_NAME);
		new VirtualClasses().launch(atlTransformation, bindingModel, out, data);

		System.out.println("Finished class2reference adaptation of " + TestVirtualClasses_YAWL.class.getSimpleName());

		atlTransformation.serialize(new FileOutputStream("tmp_/virtual_classes.adapted.atl.xmi"));
	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}
}

package genericity.typecheck.atl;

import genericity.checking.AdaptCheckTransformation.CustomMethodWrapper;
import genericity.compiler.atl.AdaptTransformation;
import genericity.compiler.atl.AdaptTransformation.BindingData;
import genericity.compiler.atl.AdaptTransformation.CustomMethodHandler;
import genericity.typing.atl_types.AtlTypingPackage;
import genericity.typing.atl_types.BooleanType;
import genericity.typing.atl_types.EmptyCollection;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.RefType;
import genericity.typing.atl_types.ReflectiveClass;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.ThisModuleType;
import genericity.typing.atl_types.TupleAttribute;
import genericity.typing.atl_types.TupleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.Unknown;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.ParametersModel;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class TestTypecheck1 {

	//public static final String ATL_TRANSFORMATION = "test/typing/reference0.atl.xmi";
	//public static final String SOURCE_METAMODEL = "fixtures/metamodels/UML.ecore";

	public static final String ATL_TRANSFORMATION = "test/typing/flow2pn_simple.atl.xmi";
	public static final String SOURCE_METAMODEL = "fixtures/metamodels/flow_concept.ecore";
	public static final String TARGET_METAMODEL = "fixtures/metamodels/petri_nets.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");

		Util.registerResourceFactory();
		EMFLoader loader = new EMFLoader(new JavaListConverter());

		
		ResourceSetImpl rs = new ResourceSetImpl();
		Resource r1 = rs.getResource(URI.createURI(SOURCE_METAMODEL), true);
		Resource r2 = rs.getResource(URI.createURI(TARGET_METAMODEL), true);

		Resource merged = rs.createResource(URI.createURI("typing_metamodels.ecore"));
		merged.getContents().addAll(r1.getContents());
		merged.getContents().addAll(r2.getContents());
			
		//BasicEMFModel mm = loader.basicModelFromFile(EcorePackage.eINSTANCE, new String[] { SOURCE_METAMODEL, TARGET_METAMODEL });
		BasicEMFModel mm = loader.basicModelFromMemory(EcorePackage.eINSTANCE, merged);	
		
		
		BasicEMFModel in = loader
				.basicModelFromFile(
						withDir("../genericity.atl.transformations/metamodels/ATL.ecore"),
						withDir(ATL_TRANSFORMATION));

		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		
		BasicEMFModel out = loader
				.emptyModelFromMemory(pkgs, "tmp_/typing.xmi");


		new TypeCheckLauncher().launch(mm, in, out);
		
		out.serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));
		merged.save(new FileOutputStream("tmp_/typing_metamodels.ecore"), null);
		System.out.println("Finished " + TestTypecheck1.class.getSimpleName());

	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}
}

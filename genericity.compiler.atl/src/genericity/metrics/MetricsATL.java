package genericity.metrics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IModelMethodHandler;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.IdcMetaclass;
import org.eclectic.idc.jvm.runtime.ParametersModel;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

import eclectic.callexpr;
import eclectic.composed_genericity;
import eclectic.ocl2ocl;
import eclectic.rewrite_class1;
import gbind.dsl.ClassBinding;
import gbind.dsl.DslPackage;
import gbind.dsl.OclFeatureBinding;
import gbind.simpleocl.OclExpression;
import gbind.simpleocl.OclFeature;

public class MetricsATL {

	// public static final String TRANSFORMATION_MODEL = "../genericity.benchmarks/components/oo2measure/trafo/oo2measure-all.atl.xmi";
	public static final String TRANSFORMATION_MODEL = "../genericity.benchmarks/components/oo2measure/manual-trafo/oo2measure.atl.xmi";
	// public static final String TRANSFORMATION_MODEL = "../genericity.benchmarks/components/oo2measure/manual-trafo/uml2measure/uml2measure.atl.xmi";
	// public static final String TRANSFORMATION_MODEL = "/home/jesus/usr/genericity2/runtime-New_configuration/ATL 2 Metrics/Code/UML22Measure_All.atl.xmi";	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");

		Util.registerResourceFactory();
		//EPackage.Registry.INSTANCE.put(DslPackage.eINSTANCE.getNsURI(), DslPackage.eINSTANCE);
		
		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());

		BasicEMFModel in = loader
				.basicModelFromFile(
						withDir("metamodels/ATL.ecore"),
						TRANSFORMATION_MODEL);
						//withDir(TRANSFORMATION_MODEL));
	
		measure(in);
	}

	private static void measure(BasicEMFModel in) {
		List<EObject> helpers = in.allObjectsOf("Helper");
		ListIterator<EObject> it = helpers.listIterator();
		while ( it.hasNext() ) {
			EObject helper = it.next();
			if ( in.getFeature((EObject) in.getFeature(helper, "definition"), "context_") == null ) {
				it.remove();
			}
		}
		
		double totalHelpers = 0;
		for (EObject helper : helpers) {
			EObject definition = (EObject) in.getFeature(helper, "definition");
			int count = countExpressions(in, definition);
			totalHelpers += count;
			//System.out.println("Feature " + f.getConceptFeature() + " = " + count);
		}

		
		
		System.out.println();
		System.out.println("Total number of helpers: " + helpers.size());
		System.out.println("  * Total nodes: " + totalHelpers);
		System.out.println("  * Average nodes: " + totalHelpers / helpers.size());
	}

	private static int countExpressions(BasicEMFModel in, EObject root) {
		int count = 0;
		TreeIterator<EObject> it = root.eAllContents();
		while(it.hasNext()) {
			EObject exp = it.next();
			if ( in.isKindOf(exp, "OclExpression") ) 
				count++;
		}
		return count;
	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}
}

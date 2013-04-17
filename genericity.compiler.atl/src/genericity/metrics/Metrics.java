package genericity.metrics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

public class Metrics {

	// public static final String BINDING_MODEL =
	// "../genericity.benchmarks/components/oo2java/component2java/component2oo.gbind.xmi";
	// public static final String ATL_TRANSFORMATION =
	// "../genericity.benchmarks/components/oo2java/oo2java.atl.xmi";

	// oo2measure
//	public static final String BINDING_MODEL = "../genericity.benchmarks/components/oo2measure/ecore2measure/ecore2oo.gbind.xmi";
//	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/oo2measure/trafo/oo2measure-all.atl.xmi";

	// bpmn2pn
//	public static final String BINDING_MODEL = "../genericity.benchmarks/components/flowdiagrams/bpmn2pn/bpmn2fd.gbind.xmi";
//	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/flowdiagrams/trafo/flow2pn.atl.xmi";

//	public static final String BINDING_MODEL = "../genericity.benchmarks/components/flowdiagrams/bpmn2.omg2pn/bpmn2.gbind.xmi";

	// bender2pn
//	public static final String BINDING_MODEL = "../genericity.benchmarks/components/flowdiagrams/bender2pn/bender.gbind.xmi";
//	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/flowdiagrams/trafo/flow2pn.atl.xmi";

	// uml2pn
//	public static final String BINDING_MODEL = "../genericity.benchmarks/components/flowdiagrams/uml22pn/uml2.gbind.xmi";
//	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/flowdiagrams/trafo/flow2pn.atl.xmi";

	// grafcet2pn
	//public static final String BINDING_MODEL = "../genericity.benchmarks/components/flowdiagrams/sfc2pn/sfc.gbind.xmi";
//	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/flowdiagrams/trafo/flow2pn.atl.xmi";

	// apromore
	//public static final String BINDING_MODEL = "../genericity.benchmarks/components/flowdiagrams/apromore2pn/apromore2fd.gbind.xmi";

	// epc2pn
//	public static final String BINDING_MODEL = "../genericity.benchmarks/components/flowdiagrams/epc2pn/epc.gbind.xmi";
//	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/flowdiagrams/trafo/flow2pn.atl.xmi";

	// yawl2pn
	public static final String BINDING_MODEL = "../genericity.benchmarks/components/flowdiagrams/yawl2pn/yawl.gbind.xmi";
//	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/flowdiagrams/trafo/flow2pn.atl.xmi";

	// ecore2measure_manual
//	public static final String BINDING_MODEL = "../genericity.benchmarks/components/oo2measure/manual-trafo/ecore2measure/ecore2oo.gbind.xmi";
//	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/oo2measure/manual-trafo/oo2measure.atl.xmi";
//	public static final String BOUND_METAMODEL_NAME = "simple_OO_concept";
//	public static final String TARGET_METAMODEL_NAME = "ECORE";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");

		Util.registerResourceFactory();
		EPackage.Registry.INSTANCE.put(DslPackage.eINSTANCE.getNsURI(), DslPackage.eINSTANCE);
		
		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());

		BasicEMFModel in = loader
				.basicModelFromFile(
						DslPackage.eINSTANCE.getNsURI(),
						withDir(BINDING_MODEL));
	
		measure(in);
	}

	private static void measure(BasicEMFModel in) {
		List<EObject> fbindings = in.allObjectsOf(OclFeatureBinding.class.getSimpleName());
		double totalFeatures = 0;
		for (EObject eObject : fbindings) {
			OclFeatureBinding f = (OclFeatureBinding) eObject;

			int count = countExpressions(f.getConcrete());
			totalFeatures += count;
			System.out.println("Feature " + f.getConceptFeature() + " = " + count);
		}
	
		double totalClassBindings = 0;
		List<EObject> cbindings = in.allObjectsOf(ClassBinding.class.getSimpleName());
		int whenBindingsSize = 0;
		for (EObject eObject : cbindings) {
			ClassBinding cb = (ClassBinding) eObject;
			if ( cb.getWhenClause() != null ) {
				int count = countExpressions( cb.getWhenClause() );
				whenBindingsSize++;
				System.out.println("Class binding " + cb.getConcept().getName() + " = " + count);			
				totalClassBindings += count;
			}
		}
		
		
		System.out.println();
		System.out.println("    Average Ocl Expressions: ");
		System.out.println("      * Average features: " + totalFeatures / fbindings.size());
		System.out.println("      * Average class bindings: " + totalClassBindings / whenBindingsSize);
		System.out.println("      * Average all: " + (totalFeatures + totalClassBindings) / (fbindings.size() + whenBindingsSize) );
		
	}

	private static int countExpressions(OclExpression root) {
		int count = 1;
		TreeIterator<EObject> it = root.eAllContents();
		while(it.hasNext()) {
			EObject exp = it.next();
			if ( exp instanceof OclExpression )
				count++;
		}
		return count;
	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}
}

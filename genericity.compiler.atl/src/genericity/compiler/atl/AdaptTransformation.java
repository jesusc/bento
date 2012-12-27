package genericity.compiler.atl;

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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

import eclectic.callexpr;
import eclectic.composed_genericity;
import eclectic.ocl2ocl;
import eclectic.rewrite_class1;

public class AdaptTransformation {

	// public static final String BINDING_MODEL =
	// "../genericity.benchmarks/components/oo2java/component2java/component2oo.gbind.xmi";
	// public static final String ATL_TRANSFORMATION =
	// "../genericity.benchmarks/components/oo2java/oo2java.atl.xmi";

	// oo2measure
	public static final String BINDING_MODEL = "../genericity.benchmarks/components/oo2measure/ecore2measure/ecore2oo.gbind.xmi";
	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/oo2measure/trafo/oo2measure-all.atl.xmi";
	public static final String BOUND_METAMODEL_NAME = "UML2";
	public static final String TARGET_METAMODEL_NAME = "ECORE";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.NoOpLog");

		eclectic.adapt_transformation transformation = new eclectic.adapt_transformation();

		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = loader
				.basicModelFromFile(
						new String[] {
						// withDir("../be.ac.vub.simpleocl/metamodel/simpleocl.ecore"),
						withDir("../genericity.language.gbind/metamodel/gbind.ecore") },
						withDir(BINDING_MODEL));

		BasicEMFModel inout = loader
				.basicModelFromFile(
						withDir("../genericity.atl.transformations/metamodels/ATL.ecore"),
						withDir(ATL_TRANSFORMATION));

		ParametersModel parameters = new ParametersModel();
		parameters.addParameterObject("BindingData", new BindingData());

		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("socl", in);
		manager.register("params", parameters);
		manager.register("atl", inout);

		// in.registerMethodHandler(new
		// org.eclectic.idc.jvm.runtime.BasicMethodHandler(manager));
		in.registerMethodHandler(new CustomMethodHandler(manager));
		inout.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();

		// TODO: Define in/out modes for EMFModels
		// out.serialize();

		inout.serialize(new FileOutputStream(
				withDir("tmp_/uml2java-adapted.atl.xmi")));
		System.out.println("Finished "
				+ AdaptTransformation.class.getSimpleName());

	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}

	// Copied from atl adapter in components.api
	public static class CustomMethodHandler extends
			org.eclectic.idc.jvm.runtime.BasicMethodHandler {
		public CustomMethodHandler(ModelManager m) {
			super(m);
		}

		@Override
		public IMethodWrapper wrap(Object o) {
			try {
				return new CustomMethodWrapper(manager.getNamespace(o), o);
			} catch (NoModelFoundException e) {
				throw new IdcException(e);
			}
		}
	}

	public static class CustomMethodWrapper extends
			org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		public CustomMethodWrapper(IModel<?, ?> model, Object o) {
			super(model, o);
		}

		public Boolean is_child_of(EObject parent) {
			boolean result = checkIsChild((EObject) object, parent);
			// if ( result ) System.out.println("Processed " + object);
			// if ( ! result ) System.out.println("NOT Processed " + object);
			return result;
		}

		private boolean checkIsChild(EObject o, EObject parent) {
			if (o == null)
				return false;
			if (o == parent)
				return true;
			return checkIsChild(o.eContainer(), parent);
		}

		public EObject copy() {
			MyCopier copier = new MyCopier((EObject) object);
			EObject copied = copier.copy((EObject) object);
			copier.copyReferences();

			// EObject copied = (EObject) EcoreUtil.copy((EObject) this.object);
			BasicEMFModel m = (BasicEMFModel) ((IModel<?, ?>) this.model);
			m.getHandler().addToResource(copied);

			TreeIterator<EObject> it = copied.eAllContents();
			while (it.hasNext()) {
				m.getHandler().addToResource(it.next());
			}
			return copied;
		}

		public void replace_containing_property(Object obj) {
			//EcoreUtil.replace((EObject) this.object, (EObject) obj);
			
			
			BasicEMFModel m = (BasicEMFModel) ((IModel<?, ?>) this.model);
			EObject container = (EObject) this.model.getContainer(this.object);
						
			put_expression_in_container((EObject) this.object, container, (EObject) obj);
		}

		private void put_expression_in_container(EObject original, EObject container, EObject v) {
			/*
			String containing_property;
			if (this.model.isKindOf(container, "Attribute")) {
				containing_property = "initExpression";
			} else if (this.model.isKindOf(container, "IfExp") || this.model.isKindOf(container, "IfStat") ) {
				containing_property = "condition";
			} else {
				containing_property = "source";
			}
			*/
			String containing_property = original.eContainingFeature().getName();
			BasicEMFModel m = (BasicEMFModel) ((IModel<?, ?>) this.model);
			m.delete(original);

			//System.out.println("Setting " + containing_property + container);
			//System.out.println(v);
			//System.out.println();
			
			this.model.setFeature(container, containing_property, v);
		}

	}

	public static class BindingData {
		public String boundMetamodelName() {
			return BOUND_METAMODEL_NAME;
		}

		public String concreteMetamodelName() {
			return TARGET_METAMODEL_NAME;
		}
	}

	/*
	 * public static class ParametersModel implements
	 * org.eclectic.modeling.emf.IModel<Object, Object> { private
	 * HashMap<String, Object> data = new HashMap<String, Object>();
	 * 
	 * public void addParameterObject(String metaclassName, Object data) {
	 * this.data.put(metaclassName, data); }
	 * 
	 * @Override public Object getMetaclass(String metaclass) { if (
	 * data.containsKey(metaclass) ) return data.get(metaclass); throw new
	 * IllegalArgumentException("No parameter " + metaclass +
	 * " in parameters models"); }
	 * 
	 * @Override public List<Object> allObjectsOf(String metaclass) {
	 * ArrayList<Object> result = new ArrayList<Object>(); if (
	 * data.containsKey(metaclass) ) { result.add(data.get(metaclass)); } return
	 * result; }
	 * 
	 * @Override public Object createObject(String metaclass) { throw new
	 * UnsupportedOperationException(); }
	 * 
	 * @Override public void setFeature(Object receptor, String featureName,
	 * Object value) { throw new UnsupportedOperationException(); }
	 * 
	 * @Override public Object getFeature(Object receptor, String featureName) {
	 * throw new UnsupportedOperationException(); }
	 * 
	 * @Override public boolean hasFeature(Object receptor, String featureName)
	 * { return false; }
	 * 
	 * @Override public boolean contains(Object obj) { return
	 * data.values().contains(obj); }
	 * 
	 * @Override public boolean isKindOf(Object o, String metaclass) { throw new
	 * UnsupportedOperationException(); }
	 * 
	 * @Override public void registerMethodHandler(Object handler) { }
	 * 
	 * @Override public Object getMethodHandler() { return null; }
	 * 
	 * @Override public Object getContainer(Object object) { throw new
	 * UnsupportedOperationException(); }
	 * 
	 * @Override public List<Object> allObjectsOf(String metaclass, boolean
	 * noSubtypes) { throw new UnsupportedOperationException(); } }
	 */

	public static class MyCopier extends EcoreUtil.Copier {
		private EObject root;

		public MyCopier(EObject object) {
			super();
			this.root = object;
		}

		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {
			super.copyReference(eReference, eObject, copyEObject);

			if (eObject.eIsSet(eReference)) {
				if (eReference.isMany()) {
				} else {
					Object referencedEObject = eObject.eGet(eReference,
							resolveProxies);
					if (referencedEObject == null) {
					} else {
						Object copyReferencedEObject = get(referencedEObject);
						if (copyReferencedEObject == null) {
							if (useOriginalReferences
									&& eReference.getEOpposite() == null) {
							}
							// added to make a cross-reference to objects
							// outside the copy
							else {
								boolean isContained = EcoreUtil.isAncestor(
										root, (EObject) referencedEObject);
								if (useOriginalReferences && !isContained) {
									copyEObject.eSet(eReference,
											referencedEObject);
								}
							}
						} else {
						}
					}
				}
			}
		}
	}
	// End-of MyCopier

}

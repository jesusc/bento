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
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EObject;

import eclectic.callexpr;
import eclectic.composed_genericity;
import eclectic.ocl2ocl;
import eclectic.rewrite_class1;
import genericity.compiler.atl.Rewrite1.ParametersModel;

public class Rewrite1 {
	
	//public static final String BINDING_MODEL = "../genericity.benchmarks/components/oo2java/component2java/component2oo.gbind.xmi";
	//public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/oo2java/oo2java.atl.xmi";

	
	// oo2measure
	public static final String BINDING_MODEL = "../genericity.benchmarks/components/oo2measure/ecore2measure/ecore2oo.gbind.xmi";
	public static final String ATL_TRANSFORMATION = "../genericity.benchmarks/components/oo2measure/trafo/oo2measure.atl.xmi";

	
	public static void main(String[] args) throws IOException {
	     System.setProperty("org.apache.commons.logging.Log",
                 "org.apache.commons.logging.impl.NoOpLog");

	    rewrite_class1 transformation = new rewrite_class1();
	     
		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				new String[] { 
						// withDir("../be.ac.vub.simpleocl/metamodel/simpleocl.ecore"),		
						withDir("../genericity.language.gbind/metamodel/gbind.ecore")
				}, 
				withDir(BINDING_MODEL)); 
		
		BasicEMFModel inout = loader.basicModelFromFile(
				withDir("../genericity.atl.transformations/metamodels/ATL.ecore"), 
				withDir(ATL_TRANSFORMATION)); 
		
		ParametersModel parameters = new ParametersModel();
		parameters.addParameterObject("BindingData", new BindingData());
		
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("socl", in);
		manager.register("params", parameters);
		manager.register("atl", inout);
		
		
		//in.registerMethodHandler(new org.eclectic.idc.jvm.runtime.BasicMethodHandler(manager));
		in.registerMethodHandler(new CustomMethodHandler(manager));
		inout.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);
		
		transformation.configure_();
		transformation.start_();

		// TODO: Define in/out modes for EMFModels
		// out.serialize();
		
		inout.serialize(new FileOutputStream(withDir("tmp_/uml2java-adapted.atl.xmi")));
		System.out.println("Finished " + Rewrite1.class.getSimpleName());
		
	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}
	

	// Copied from atl adapter in components.api
	public static class CustomMethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodHandler  {
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
	
	public static class CustomMethodWrapper extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		public CustomMethodWrapper(IModel<?, ?> model, Object o) {
			super(model, o);
		}
		
		public Boolean is_child_of(EObject parent) {
			boolean result = checkIsChild((EObject) object, parent);
			//if ( result ) System.out.println("Processed " + object);
			//if ( ! result ) System.out.println("NOT Processed " + object);				
			return result;
		}
		
		private boolean checkIsChild(EObject o, EObject parent) {
			if ( o == null ) return false;
			if ( o == parent ) return true;
			return checkIsChild(o.eContainer(), parent);
		}
	}	

	public static class BindingData {
		public String boundMetamodelName() { return "SimpleOO"; }
	}
	
	public static class ParametersModel implements org.eclectic.modeling.emf.IModel<Object, Object> {
		private HashMap<String, Object> data = new HashMap<String, Object>();
		
		public void addParameterObject(String metaclassName, Object data) {
			this.data.put(metaclassName, data);
		}

		@Override
		public Object getMetaclass(String metaclass) { 
			if ( data.containsKey(metaclass) ) 
				return data.get(metaclass);
			throw new IllegalArgumentException("No parameter " + metaclass + " in parameters models");
		}

		@Override
		public List<Object> allObjectsOf(String metaclass) {  
			ArrayList<Object> result = new ArrayList<Object>();
			if ( data.containsKey(metaclass) ) {
				result.add(data.get(metaclass));
			}
			return result;
		}
		
		@Override
		public Object createObject(String metaclass) { throw new UnsupportedOperationException(); }
		@Override
		public void setFeature(Object receptor, String featureName, Object value) { throw new UnsupportedOperationException(); }
		
		@Override
		public Object getFeature(Object receptor, String featureName) { throw new UnsupportedOperationException(); }
		
		@Override
		public boolean hasFeature(Object receptor, String featureName) { 
			return false;
		}
		
		@Override
		public boolean contains(Object obj) {
			return data.values().contains(obj);
		}
		@Override
		public boolean isKindOf(Object o, String metaclass) { throw new UnsupportedOperationException(); }
		@Override
		public void registerMethodHandler(Object handler) { }
		@Override
		public Object getMethodHandler() { return null; }
		@Override
		public Object getContainer(Object object) { throw new UnsupportedOperationException(); }

		@Override
		public List<Object> allObjectsOf(String metaclass, boolean noSubtypes) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void deleteObject(Object o) {
			throw new UnsupportedOperationException();
			
		}
	}
}


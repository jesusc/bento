package genericity.compiler.atl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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

public class Rewrite1 {
	
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
				withDir("test/uml2java/generalization.concrete/uml2java.gbind.xmi")); 
		
		BasicEMFModel inout = loader.basicModelFromFile(
				withDir("../genericity.atl.transformations/metamodels/ATL.ecore"), 
				withDir("test/uml2java/uml2java.atl.xmi")); 
		
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("socl", in);

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
			
			return checkIsChild((EObject) object, parent);
		}
		
		private boolean checkIsChild(EObject o, EObject parent) {
			if ( o == null )   return false;
			if ( o == parent ) return true;
			return checkIsChild(o.eContainer(), parent);
		}
	}	
	
}

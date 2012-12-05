package genericity.compiler.atl.api;

import java.io.IOException;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.ParametersModel;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import eclectic.rewrite_class1;

/**
 * Adapts an existing ATL transformation according to a given binding.
 * 
 * @author jesus
 */
public class AtlAdapter {

	private AtlTransformationLoader atlTransformation;
	private BasicEMFModel inout;
	
	public AtlAdapter(AtlTransformationLoader atlTransformation) {
		this.atlTransformation = atlTransformation;
		this.inout = null;
	}
	
	public void doAdaptation(BindingModelLoader binding, String boundMetamodelName) {
	    rewrite_class1 transformation = new rewrite_class1();

	    Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = null;
		try {
			in = binding.load(loader);
			
			// Atl model is only loaded once, the other times the transformation is re-applied 
			if ( inout == null )
				inout = atlTransformation.load(loader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParametersModel parameters = new ParametersModel();
		parameters.addParameterObject(new BindingData(boundMetamodelName));
		
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("socl", in);
		manager.register("atl", inout);
		manager.register("params", parameters);
		
		in.registerMethodHandler(new CustomMethodHandler(manager));
		inout.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();
		
		// TODO: Define in/out modes for EMFModels
		// out.serialize();
		
		//inout.serialize(new FileOutputStream(withDir("tmp_/uml2java-adapted.atl.xmi")));
		//System.out.println("Finished " + Rewrite1.class.getSimpleName());
		
		System.out.println("Finished Atl Adaptation");
	}

	public Resource getResource() {
		inout.getHandler().packRootElements();
		return inout.getHandler().getResource();
	}

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

	public class BindingData {
		private String boundMetamodelName;

		public BindingData(String boundMetamodelName) {
			this.boundMetamodelName = boundMetamodelName;
		}
		
		public String boundMetamodelName() {
			return boundMetamodelName;
		}
	}
}

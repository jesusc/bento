package genericity.compiler.atl;

import java.io.File;
import java.io.IOException;

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

import eclectic.callexpr;
import eclectic.composed_genericity;
import eclectic.ocl2ocl;

public class CompileOCL {
	
	public static void main(String[] args) throws IOException {
	     System.setProperty("org.apache.commons.logging.Log",
                 "org.apache.commons.logging.impl.NoOpLog");

		// ocl2ocl transformation = new ocl2ocl();
	    //callexpr transformation = new callexpr(); 
	    composed_genericity transformation = new composed_genericity();
	     
		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in  = loader.basicModelFromFile(
				new String[] { 
						withDir("../be.ac.vub.simpleocl/metamodel/simpleocl.ecore"),		
						withDir("../genericity.language.gbind/metamodel/gbind.ecore")
				}, 
				withDir("fixtures/test1.xmi")); 
		BasicEMFModel out = loader.basicEmptyModelFromFile(
				withDir("../genericity.atl.transformations/metamodels/ATL.ecore"), 
				withDir("tmp_/output.xmi")); 
		
		
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("socl", in);
		manager.register("atl", out);
		transformation.setModelManager(manager);
		
		transformation.configure_();
		transformation.start_();

		out.serialize();
		
	}

	private static String withDir(String path) {
		return "." + File.separator + path;
	}
	

public static class BasicMethodHandler implements IModelMethodHandler {

	protected ModelManager manager;

	// This can be more efficient, because sometimes the model is known at compile time
	public BasicMethodHandler(ModelManager m) {
		this.manager = m;
	}
	
	@Override
	public IMethodWrapper wrap(Object o) {
		try {
			return new BasicMethodWrapper(manager.getNamespace(o), o);
		} catch (NoModelFoundException e) {
			throw new IdcException(e);
		}
	}
	

}

public static class BasicMethodWrapper implements IMethodWrapper {
	protected IModel<Object, ?> model;
	protected Object object;

	public BasicMethodWrapper(IModel<?, ?> model, Object o) {
		this.model = (IModel<Object, ?>) model;
		this.object = o;
	}
	
	public Boolean kind_of(Object o) {
		if ( ! (o instanceof IdcMetaclass) ) return Boolean.FALSE;
		return model.isKindOf(object, ((IdcMetaclass) o).getMetaclassName());
	}
	
	public Object _refContainer() {
		return model.getContainer(object);
	}
	
	public String println(String x) {
		String s = x + ": " + object;
		System.out.println(s);
		return s;
		
	}
	
	public Boolean is_nil() { return false; }

	public Object if_nil() { return object; }

	public Boolean eq(Object o) { return o == object; }
}


}

package genericity.compiler.atl.api;

import java.io.IOException;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.resource.Resource;

import eclectic.rewrite_class1;

/**
 * Adapts an existing ATL transformation according to a given binding.
 * 
 * @author jesus
 */
public class AtlAdapter {

	private AtlTransformationLoader atlTransformation;
	private Resource adaptedTransformation;
	
	public AtlAdapter(AtlTransformationLoader atlTransformation) {
		this.atlTransformation = atlTransformation;
	}
	
	public void doAdaptation(BindingModelLoader binding) {
	    rewrite_class1 transformation = new rewrite_class1();

	    Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = null, inout = null;
		try {
			in = binding.load(loader);
			inout = atlTransformation.load(loader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("atl", inout);
		in.registerMethodHandler(new BasicMethodHandler(manager));
		inout.registerMethodHandler(new BasicMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();

		adaptedTransformation = inout.getHandler().getResource();
		
		// TODO: Define in/out modes for EMFModels
		// out.serialize();
		
		//inout.serialize(new FileOutputStream(withDir("tmp_/uml2java-adapted.atl.xmi")));
		//System.out.println("Finished " + Rewrite1.class.getSimpleName());
		
		System.out.println("Finished Atl Adaptation");
	}

	public Resource getResource() {
		return adaptedTransformation;
	}
	
}

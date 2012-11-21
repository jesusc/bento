package genericity.compiler.atl.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.m2m.atl.engine.parser.AtlParser;

import eclectic.rewrite_class1;

/**
 * Adapts an existing ATL transformation according to a given binding.
 * 
 * @author jesus
 */
public class AtlInvoker {
	
	private EMFModelFactory modelFactory;
	private EMFVMLauncher launcher;


	public AtlInvoker() {
		modelFactory = new EMFModelFactory();
		launcher = new EMFVMLauncher();
	}
	
	public void transform() {

		Map<String, Object> launcherOptions = new HashMap<String, Object>(); //getOptions();
		//launcher.initialize(launcherOptions);
		//launcher.addInModel(inModel, "IN", "Imp");
		//launcher.addOutModel(outModel, "OUT", "BBL");
		//return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
		
		
		/*
		IReferenceModel atlMetamodel;
		try {
			EMFModel atlModel = (EMFModel) modelFactory.newModel(atlMetamodel);
			AtlParser atlParser = new AtlParser();
			
			String srcFile = templateFileName;
			atlParser.inject(atlModel, srcFile);
			
			atlModel.setIsTarget(true);

			List<? extends EPackage> atlPackages = (List<? extends EPackage>) atlModel.getReferenceModel().getResource().getContents();
			return loader.basicModelFromMemory((List<EPackage>) atlPackages, atlModel.getResource());
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //$NON-NLS-1$
		*/
	}


	public void addInModel(String modelName, String modelUri, String metamodelUri) {
		/*
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel mm = factory.newReferenceModel();
		injector.inject(mm, metamodelUri);
		IModel inModel = factory.newModel(mm);
		injector.inject(inModel, modelUri);

		launcher.addInModel(inModel, modelName, mm);
		*/
	}
	
}

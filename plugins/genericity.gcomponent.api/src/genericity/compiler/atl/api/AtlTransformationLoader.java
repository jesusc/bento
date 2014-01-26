package genericity.compiler.atl.api;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFHandler;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;

public interface AtlTransformationLoader {

	BasicEMFModel load(EMFLoader loader) throws IOException;

	public class FileBased implements AtlTransformationLoader {

		private String templateFileName;
		private EMFModel loadedAtlModel;

		public FileBased(String template) {
			this.templateFileName = template;
		}

		public FileBased(String template, EMFModel loadedAtlModel) {
			this(template);
			this.loadedAtlModel = loadedAtlModel;
		}

		@Override
		public BasicEMFModel load(EMFLoader loader) throws IOException {
			// TODO: Repeated in gcomponents.ui -> for importing to XMI...
			ModelFactory modelFactory = new EMFModelFactory();

			IReferenceModel atlMetamodel;
			try {
				atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore");
				EMFModel atlModel = (EMFModel) modelFactory
						.newModel(atlMetamodel);

				AtlParser atlParser = new AtlParser();

				String srcFile = templateFileName;
				atlParser.inject(atlModel, srcFile);

				atlModel.setIsTarget(true);
				this.loadedAtlModel = atlModel;
		
				List<? extends EPackage> atlPackages = (List<? extends EPackage>) atlModel
						.getReferenceModel().getResource().getContents();
				return loader.basicModelFromMemory(
						(List<EPackage>) atlPackages, atlModel.getResource());
			} catch (ATLCoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //$NON-NLS-1$

			// TODO Auto-generated method stub
			return null;
		}

		// public void exportAdapted(Resource resource) {
		public void exportAdapted(String adaptedFileName) {
			ModelFactory modelFactory = new EMFModelFactory();
			try {
				/*
				 * IReferenceModel atlMetamodel = modelFactory
				 * .getBuiltInResource("ATL.ecore"); //$NON-NLS-1$ IModel
				 * atlModel = modelFactory.newModel(atlMetamodel);
				 * 
				 * EMFInjector injector = new EMFInjector();
				 * injector.inject(atlModel, resource);
				 */

				AtlParser atlParser = new AtlParser();
				atlParser.extract(loadedAtlModel, adaptedFileName);
				// atlParser.extract(atlModel, adaptedFileName);

			} catch (ATLCoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}

			System.out.println("Adapted transformation: " + adaptedFileName);
		}

		// Does not work!! Why???
		public static void exportAtlResource(Resource resource, String filename) {
			ModelFactory modelFactory = new EMFModelFactory();
			try {
				IReferenceModel atlMetamodel = modelFactory
						.getBuiltInResource("ATL.ecore"); //$NON-NLS-1$
				IModel atlModel = modelFactory.newModel(atlMetamodel);

				EMFInjector injector = new EMFInjector();
				injector.inject(atlModel, resource);
				atlModel.setIsTarget(true);

				AtlParser atlParser = new AtlParser();
				atlParser.extract(atlModel, filename);
			} catch (ATLCoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}

	}

}

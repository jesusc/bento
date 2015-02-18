package genericity.compiler.atl.api;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import genericity.compiler.atl.api.AtlTransformationLoader.FileBased;
import genericity.language.gcomponent.core.CompositeComponent;
import genericity.language.gcomponent.core.Model;
import genericity.language.gcomponent.core.ParameterModel;
import genericity.language.gcomponent.core.TransformationComponent;
import genericity.language.gcomponent.technologies.AtlParameter;
import genericity.language.gcomponent.technologies.AtlTemplate;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLSerializer;
import anatlyzer.atl.util.ATLUtils;
import bento.adapter.atl.ATLTrafoAdapter;
import bento.adapter.atl.BindingModel;
import bento.adapter.atl.IComponentInfoForBinding;

/**
 * Holds an ATL template loaded in memory, adding the possibility
 * of modifiying it according to a binding.
 * 
 * 
 * @author jesus
 *
 */
public class AtlMemoryTemplate implements AdaptationResult {
	private AtlTemplate original;
	private CompositeComponent topComposite;
	private TransformationComponent component;
	private ATLModel adaptedAtlModel;
	private FilePathResolver filePathResolver;
	
	public AtlMemoryTemplate(TransformationComponent comp, FilePathResolver filePathResolver) {
		this.component = comp;
		this.original = (AtlTemplate) comp.getTemplate();
		this.filePathResolver = filePathResolver;
	}

	public void adapt(ParameterModel conceptModel, Model concreteModel, BindingModelLoader2 loader) {
		if ( adaptedAtlModel != null ) {
			throw new UnsupportedOperationException("Multiple adaptations of the same template are not supported");
		}
		
		// Select the actual ATL model that is bound
		AtlParameter atlBoundModel = null;
		
		for(AtlParameter p : original.getParameters()) {
			if ( p.getModel() == conceptModel ) {
				atlBoundModel = p;
			}
		}

		if ( atlBoundModel == null )
			throw new IllegalArgumentException();
		
		// TODO: Load only the first time
		Resource atlResource = loadAtlTransformation();
		
		ATLModel atlModel = new ATLModel(atlResource);
		BindingModel bindModel = new BindingModel(loader.load());
		
		// TODO: The atl model is fixed, the others may vary in several invocations... 
		ATLTrafoAdapter adapter = new ATLTrafoAdapter(atlModel, bindModel, 
				new EclipseComponentInfoForBinding(atlBoundModel.getAtlMetamodelName(), bindModel) );
		
		adapter.perform();
		
		this.adaptedAtlModel = adapter.getAdaptedATL();
	}

	public class EclipseComponentInfoForBinding implements IComponentInfoForBinding {
		
		private String conceptMetamodelName;
		private BindingModel bindModel;

		public EclipseComponentInfoForBinding(String conceptMetamodelName, BindingModel bindModel) {
			this.conceptMetamodelName = conceptMetamodelName;
			this.bindModel = bindModel;
		}

		@Override
		public String getConceptMetamodelName() {
			return conceptMetamodelName;
		}

		@Override
		public String getBoundMetamodelName() {
			return bindModel.getRoot().getBoundMetamodel().getName();
		}

		@Override
		public String getBoundMetamodelURI() {
			String uri = bindModel.getRoot().getBoundMetamodel().getMetamodelURI();
			// quick trick			
			return uri.replace("platform:/resource", "");
		}
		
	}
	
	private Resource loadAtlTransformation() {
		ModelFactory modelFactory = new EMFModelFactory();

		IReferenceModel atlMetamodel;
		try {
			atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore");
			EMFModel loadedAtlModel = (EMFModel) modelFactory
					.newModel(atlMetamodel);

			AtlParser atlParser = new AtlParser();

			String srcFile = original.getTemplate();
			atlParser.inject(loadedAtlModel, filePathResolver.resolve(srcFile));

			loadedAtlModel.setIsTarget(true);
			return loadedAtlModel.getResource();
		} catch ( ATLCoreException e ) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void exportToFileSystem(FilePathResolver filePathResolver) {
		if ( topComposite == null )  {
			//	throw new IllegalStateException();
			System.err.println("At some point I need to pass the top composite to generate a proper name at least...");
		}
		
		// String atlFile = filePathResolver.resolve(original.getTemplate());		
		String outputFileName = component.getName() + ".atl";		
		String adaptedFileName = filePathResolver.createFileNameFromInitial(outputFileName);
		
		String result = ATLSerializer.serialize(adaptedAtlModel);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(adaptedFileName);
			fos.write(result.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void setAdapterFor(CompositeComponent topComposite) {
		this.topComposite = topComposite;
	}
	
}

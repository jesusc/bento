package bento.component.atl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLSerializer;
import bento.adapter.atl.ATLTrafoAdapter;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import bento.common.adapter.IComponentInfoForBinding.IBoundMetamodelInfo;
import bento.component.model.AdaptationResult;
import bento.language.bentocomp.core.CompositeComponent;
import bento.language.bentocomp.core.Model;
import bento.language.bentocomp.core.ParameterModel;
import bento.language.bentocomp.core.TransformationComponent;
import bento.language.bentocomp.technologies.AtlParameter;
import bento.language.bentocomp.technologies.AtlTemplate;
import bento.repository.common.BentoURIResolver;
import bento.repository.local.FilePathResolver;
import gbind.dsl.MetamodelDeclaration;

/**
 * Holds an ATL template loaded in memory, adding the possibility
 * of modifiying it according to a binding.
 * 
 * @author jesus
 *
 */
public class AtlMemoryTemplate implements AdaptationResult {
	private AtlTemplate original;
	private CompositeComponent topComposite;
	private TransformationComponent component;
	// private ATLModel adaptedAtlModel;
	private FilePathResolver filePathResolver;
	
	public AtlMemoryTemplate(TransformationComponent comp, FilePathResolver filePathResolver) {
		this.component = comp;
		this.original = (AtlTemplate) comp.getTemplate();
		this.filePathResolver = filePathResolver;
	}

	Supplier<ATLModel> pending ;
	public void adapt(ParameterModel conceptModel, Model concreteModel, BindingModel bindingModel) {
		if ( pending != null ) {
			Supplier<ATLModel> oldPending = pending;
			pending = () -> {
				AtlParameter atlBoundModel = selectBoundModel(conceptModel);
				
				// Get the adapted from from the previous adaptation
				ATLModel atlModel = oldPending.get();

				ATLTrafoAdapter adapter = new ATLTrafoAdapter(atlModel, bindingModel, 
						new EclipseComponentInfoForBinding(atlBoundModel.getAtlMetamodelName(), bindingModel) );
				
				adapter.perform();
				
				// this.adaptedAtlModel = adapter.getAdaptedATL();
				return adapter.getAdaptedATL();				
			};
			return;
			// throw new UnsupportedOperationException("Multiple adaptations of the same template are not supported");
		}
	
		pending = () -> {
		
			/*
			if ( adaptedAtlModel != null ) {
				throw new UnsupportedOperationException("Multiple adaptations of the same template are not supported");
			}
			*/
			
			AtlParameter atlBoundModel = selectBoundModel(conceptModel);
			
			// TODO: Load only the first time
			Resource atlResource = loadAtlTransformation();
			
			ATLModel atlModel = new ATLModel(atlResource);
			
			// TODO: The atl model is fixed, the others may vary in several invocations... 
			ATLTrafoAdapter adapter = new ATLTrafoAdapter(atlModel, bindingModel, 
					new EclipseComponentInfoForBinding(atlBoundModel.getAtlMetamodelName(), bindingModel) );
			
			adapter.perform();
			
			// this.adaptedAtlModel = adapter.getAdaptedATL();
			return adapter.getAdaptedATL();
		};
	}


	private AtlParameter selectBoundModel(ParameterModel conceptModel) {
		// Select the actual ATL model that is bound
		AtlParameter atlBoundModel = null;
		
		for(AtlParameter p : original.getParameters()) {
			if ( p.getModel() == conceptModel ) {
				atlBoundModel = p;
			}
		}

		if ( atlBoundModel == null )
			throw new IllegalArgumentException();
		return atlBoundModel;
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
		public List<IBoundMetamodelInfo> getBoundMetamodels() {
			return this.bindModel.getRoot().getBoundMetamodels().stream().map(m -> new EclipseBoundMetamodel(m, bindModel)).collect(Collectors.toList());
		}
		

	}
	
	public static class EclipseBoundMetamodel implements IBoundMetamodelInfo {

		private MetamodelDeclaration metamodel;
		private BindingModel bindModel;

		public EclipseBoundMetamodel(MetamodelDeclaration m, BindingModel bindModel) {
			this.metamodel = m;
			this.bindModel = bindModel;
		}

		@Override
		public String getBoundMetamodelName() {
			return metamodel.getName();
		}

		@Override
		public String getBoundMetamodelURI() {
			String uri = BentoURIResolver.tryResolveMetamodel(metamodel.getMetamodelURI(), bindModel.getResource());
//			String uri = bindModel.getRoot().getBoundMetamodel().getMetamodelURI();
//			// quick trick			
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
			String anURI   = filePathResolver.resolveTransformation(component, srcFile);
					
			
			atlParser.inject(loadedAtlModel, anURI); 
					//filePathResolver.resolve(srcFile));

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
		
		if ( pending == null ) 
			return;
		
		ATLModel adaptedAtlModel = pending.get();
		
		String adaptedFileName = getAdaptedTemplateFileName();
		
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


	@Override
	public String getAdaptedTemplateFileName() {
		String adaptedFileName = filePathResolver.createPlaceForAdaptation(topComposite, component);
		adaptedFileName = adaptedFileName + ".atl"; // Not very clean...
		return adaptedFileName;
	}
	
}

package bento.sirius.adapter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.resource.Resource;

import bento.binding.utils.BindingModel;
import bento.component.interpreter.ComponentInterpreter.Adaptation;
import bento.component.interpreter.TechnologyConfiguration;
import bento.component.model.AdaptationResult;
import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.core.CompositeComponent;
import bento.language.bentocomp.core.GraphicalEditorComponent;
import bento.language.bentocomp.core.Model;
import bento.language.bentocomp.core.ParameterModel;
import bento.language.bentocomp.technologies.SiriusTemplate;
import bento.repository.local.FilePathResolver;
import bento.utils.BindingUtils;

public class SiriusTemplateHandler implements TechnologyConfiguration.TechnologyHandler {

	@Override
	public AdaptationResult adapt(Component comp, List<Adaptation> adaptations, CompositeComponent topComposite, FilePathResolver filePathResolver) {
		SiriusAdaptedTemplate template = new SiriusAdaptedTemplate((GraphicalEditorComponent) comp, filePathResolver);
		template.setAdapterFor(topComposite);
		adaptations.forEach(a -> {
			ParameterModel conceptModel = a.isSource() ? comp.getSourceModels().get(a.getParameterIndex()) : comp.getTargetModels().get(a.getParameterIndex());
			// BindingModelLoader2 loader = new BindingModelLoader2( a.appliedBinding.getFileName() );
			BindingModel bindingModel = BindingUtils.readBindingDescription( a.getAppliedBinding() );
			
			template.adapt(conceptModel, a.getConcreteModel(), bindingModel);
			
		});
		
		return template;
	}

	
	public class SiriusAdaptedTemplate implements AdaptationResult {

		private CompositeComponent topComposite;
		private GraphicalEditorComponent component;
		private SiriusTemplate original;
		private FilePathResolver filePathResolver;

		public SiriusAdaptedTemplate(GraphicalEditorComponent comp, FilePathResolver filePathResolver) {
			this.component = comp;
			this.original = (SiriusTemplate) comp.getTemplate();
			this.filePathResolver = filePathResolver;
		}

		
		@Override
		public void setAdapterFor(CompositeComponent topComposite) {
			this.topComposite = topComposite;
		}

		Supplier<SiriusModel> pending ;
		
		public void adapt(ParameterModel conceptModel, Model concreteModel, BindingModel bindingModel) {
			if ( pending != null ) {
				Supplier<SiriusModel> oldPending = pending;
				pending = () -> {
					throw new UnsupportedOperationException("Multiple adaptations of the same Sirius template are not supported yet");
				};
				return;
			}
		
			pending = () -> {
				SiriusModel templateModel = new SiriusModel(original.getODesignFile());
				
				SiriusAdapter adapter = new SiriusAdapter(templateModel.getResource(), bindingModel, conceptModel.getName());

				return adapter.perform().getSiriusModel();
			};
		}

		
		@Override
		public void exportToFileSystem(FilePathResolver resolver) {
			if ( topComposite == null )  {
				//	throw new IllegalStateException();
				System.err.println("At some point I need to pass the top composite to generate a proper name at least...");
			}
			
			if ( pending == null ) 
				return;
			
			SiriusModel adaptedModel = pending.get();			
			String adaptedFileName = getAdaptedTemplateFileName();
			
			Resource r = adaptedModel.getResource();
			try {
				r.save(new FileOutputStream(adaptedFileName), null);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}			
		}

		@Override
		public String getAdaptedTemplateFileName() {
			String adaptedFileName = filePathResolver.createPlaceForAdaptation(topComposite, component);
			adaptedFileName = adaptedFileName + ".odesign"; 
			return adaptedFileName;
		}
		
	}
	
	
}

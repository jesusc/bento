package genericity.compiler.atl.api;

import genericity.language.gcomponent.core.Component;
import genericity.language.gcomponent.core.CompositeComponent;
import genericity.language.gcomponent.core.ParameterModel;
import genericity.language.gcomponent.core.Template;
import genericity.language.gcomponent.core.TransformationComponent;
import genericity.language.gcomponent.dsl.DefinitionRoot;
import genericity.language.gcomponent.flowcontrol.Apply;
import genericity.language.gcomponent.flowcontrol.ApplyParameter;
import genericity.language.gcomponent.flowcontrol.Composition;
import genericity.language.gcomponent.flowcontrol.CompositionStep;
import genericity.language.gcomponent.technologies.AtlTemplate;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

public class ComponentExecutor {

	private Component component;
	private FilePathResolver filePathResolver;

	public ComponentExecutor(Resource r, FilePathResolver filePathResolver) {
		this.component = ((DefinitionRoot) r.getContents().get(0)).getComponent();
		this.filePathResolver = filePathResolver;
	}

	public void execute() throws MyComponentError {
		if ( component instanceof CompositeComponent ) {
			adaptComponent((CompositeComponent) component, null);
		}
		throw new MyComponentError("Only composite components can be executed");
	}

	private void adaptComponent(CompositeComponent component, AdaptationContext context) {
		adaptSwitch( component.getComposition().getStep() );
		
		
		AtlInvoker invoker = new AtlInvoker();
		/*
		// After adaptation -> execute if final component
		for(ParameterModel s : component.getSourceModels()) {
			if ( s.getResourceName() != null ) {
				// TODO: For some reason I put type *... change
				invoker.addInModel(s.getResourceName(), s.getType().get(0).getUri());
			}
		}
		// TODO: How to deal with components that fix only some of the models and the
		//       others are left open.
		*/
	}

	private void adaptComponent(TransformationComponent component, AdaptationContext context) {
		adaptTemplateSwitch(component.getTemplate(), context);
	}

	private void adapt(Apply composition) {
		adaptSwitch(composition.getComponent(), new AdaptationContext(composition));
	}

	
	private void adaptTemplate(AtlTemplate template, AdaptationContext context) {
		AtlAdapter adapter = new AtlAdapter( new AtlTransformationLoader.FileBased(
				this.filePathResolver.resolve(template.getTemplate())) );
		
		List<ApplyParameter> inputModels = context.getInputModels();
		for (ApplyParameter applyParameter : inputModels) {
			// Not needed if type checking is not performed
			// 		-> applyParameter.getBoundConcept()
			
			BindingModelLoader loader = new BindingModelLoader.FileBased( applyParameter.getBinding().getFileName() );
			adapter.doAdaptation(loader);
			context.setAdapted(adapter.getResource());
		}
	}

	// Switches	
	private void adaptTemplateSwitch(Template template, AdaptationContext context) {
		if ( template instanceof AtlTemplate ) adaptTemplate((AtlTemplate) template, context);
		else throw new UnsupportedOperationException("Not supported: " + template.eClass().getName());
	}

	private void adaptSwitch(Component component, AdaptationContext context) {
		if ( component instanceof CompositeComponent ) adaptComponent((CompositeComponent) component, context);
		if ( component instanceof TransformationComponent ) adaptComponent((TransformationComponent) component, context);
		else throw new UnsupportedOperationException("Not supported: " + component.eClass().getName());
	}

	private void adaptSwitch(CompositionStep compositionStep) {
		if ( compositionStep instanceof Apply ) adapt((Apply) compositionStep);
		else throw new UnsupportedOperationException("Not supported: " + compositionStep.eClass().getName());
	}

	
	/**
	 * It provides the context in which a given transformation context is
	 * instantiated, that is, "who is using this component".
	 * 
	 */
	private static class AdaptationContext {
		private Apply composition;
		private Resource adapted;

		public AdaptationContext(Apply composition) {
			this.composition = composition;
		}
		
		public void setAdapted(Resource resource) {
			this.adapted = resource;
		}
		
		public Resource getAdapted() {
			return adapted;
		}

		public List<ApplyParameter> getInputModels() { return composition.getInputModels(); }
	}
}

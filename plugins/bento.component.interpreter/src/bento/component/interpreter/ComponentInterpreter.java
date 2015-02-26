package bento.component.interpreter;

import bento.language.bentocomp.core.BindingDeclaration;
import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.core.CompositeComponent;
import bento.language.bentocomp.core.Model;
import bento.language.bentocomp.core.ParameterModel;
import bento.language.bentocomp.core.TransformationComponent;
import bento.language.bentocomp.core.util.CoreSwitch;
import bento.language.bentocomp.flowcontrol.Apply;
import bento.language.bentocomp.flowcontrol.CompositionStep;
import bento.language.bentocomp.flowcontrol.Seq;
import bento.language.bentocomp.flowcontrol.util.FlowcontrolSwitch;
import bento.language.bentocomp.technologies.AtlTemplate;
import bento.repository.local.FilePathResolver;
import bento.utils.BindingUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import bento.binding.utils.BindingModel;
import bento.component.atl.AtlMemoryTemplate;
import bento.component.model.AdaptationResult;
import bento.component.model.ComponentModel;
import bento.component.model.MyComponentError;

/**
 * Traverses a given component adapting their dependencies
 * recursively. 
 * 
 * @author jesus
 */
public class ComponentInterpreter {

	private Component component;
	private FilePathResolver filePathResolver;
	
	public ComponentInterpreter(ComponentModel model, FilePathResolver filePathResolver) {
		this.component = model.getComponent();
		this.filePathResolver = filePathResolver;
	}

	public void execute() throws MyComponentError {
		List<AdaptationResult> result = null;
		if ( component instanceof CompositeComponent ) {
			result = adaptCompositeComponent((CompositeComponent) component);
		} else {
			throw new MyComponentError("Only composite components can be adapted");
		}
		
		result.forEach(r -> r.exportToFileSystem(filePathResolver));
	}

	/**
	 * Computes the required adaptations of a composite component.
	 * 
	 * @param component the composite component
	 * @return the list of required adaptations
	 * @throws MyComponentError 
	 */
	private List<AdaptationResult> adaptCompositeComponent(final CompositeComponent component) throws MyComponentError { 
		List<AdaptationResult> adaptations = doStep(component, component.getComposition().getStep(), component);
		
		return adaptations;
	}

	private List<AdaptationResult> doStep(CompositeComponent component, final CompositionStep step, Component topComposite) {
		List<AdaptationResult> adaptations = new FlowcontrolSwitch<List<AdaptationResult>>() {
			public List<AdaptationResult> caseApply(bento.language.bentocomp.flowcontrol.Apply object) {
				return doApplyTransformation(component, object, component);
			}
		
			public java.util.List<AdaptationResult> caseSeq(bento.language.bentocomp.flowcontrol.Seq object) {
				return doSeq(component, object, component);				
			};
			
			public java.util.List<AdaptationResult> defaultCase(org.eclipse.emf.ecore.EObject object) {
				throw new UnsupportedOperationException("Not supported: " + object);
			}
			
		}.doSwitch(step);
		
		return adaptations;
	}


	protected List<AdaptationResult> doSeq(CompositeComponent component, Seq seq, CompositeComponent topComposite) {
		List<AdaptationResult> result = new ArrayList<AdaptationResult>();
		seq.getSteps().forEach(step -> {
			result.addAll(doStep(component, step, topComposite));
		});
		return result;
	}

	/**
	 * Interprets the "Apply" command by creating adaptations for
	 * each of the transformation parameters with a binding.
	 * 
	 * @param component
	 * @param applyCommand
	 * @param topComposite
	 * @return 
	 */
	private List<AdaptationResult> doApplyTransformation(CompositeComponent parent, Apply applyCommand, final CompositeComponent topComposite) {
		// Required adaptations for an applied component
		Stream<Adaptation> adaptations = applyCommand
				.getInputModels()
				.stream()
				.filter(m -> m.getBinding() != null)
				.map(m -> {
					Adaptation a = new Adaptation();
					a.parameterIndex = applyCommand.getInputModels().indexOf(m);
					a.concreteModel = m.getModel();
					a.appliedBinding = m.getBinding();
					return a;
				});

		AdaptationResult r = new CoreSwitch<AdaptationResult>() {
			public AdaptationResult caseCompositeComponent(CompositeComponent object) {
				throw new UnsupportedOperationException();
			};
			
			public AdaptationResult caseTransformationComponent(bento.language.bentocomp.core.TransformationComponent comp) {
				return applyTransformationComponent(comp, adaptations, topComposite);
			}

			public AdaptationResult defaultCase(org.eclipse.emf.ecore.EObject object) {
				throw new UnsupportedOperationException("Not supported: " + object);
			}
		}.doSwitch(applyCommand.getComponent()); 
		
		ArrayList<AdaptationResult> result = new ArrayList<AdaptationResult>();
		result.add(r);
		return result;
	};
	
	/**
	 * Apply a transformation component by instantiating its template for each of the
	 * bound models provided in the adaptations collection. 
	 * 
	 * @param comp
	 * @param adaptations
	 * @param topComposite 
	 * @return 
	 */
	private AdaptationResult applyTransformationComponent(TransformationComponent comp, Stream<Adaptation> adaptations, CompositeComponent topComposite) {
		if ( ! ( comp.getTemplate() instanceof AtlTemplate) ) {
			throw new UnsupportedOperationException();
		}

		AtlMemoryTemplate template = new AtlMemoryTemplate(comp, filePathResolver);
		template.setAdapterFor(topComposite);
		adaptations.forEach(a -> {
			ParameterModel conceptModel = comp.getSourceModels().get(a.parameterIndex);
			// BindingModelLoader2 loader = new BindingModelLoader2( a.appliedBinding.getFileName() );
			BindingModel bindingModel = BindingUtils.readBindingDescription( a.appliedBinding );
			
			template.adapt(conceptModel, a.concreteModel, bindingModel);
			
		});
		
		return template;
	};		
	
	private class Adaptation {
		int parameterIndex;
		Model conceptModel;
		BindingDeclaration appliedBinding;
		Model concreteModel;	
	}
	
	
}

package bento.component.interpreter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;

import bento.binding.utils.BindingModel;
import bento.component.atl.AtlMemoryTemplate;
import bento.component.model.AdaptationResult;
import bento.component.model.ComponentModel;
import bento.component.model.MyComponentError;
import bento.language.bentocomp.core.BindingDeclaration;
import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.core.CompositeComponent;
import bento.language.bentocomp.core.Model;
import bento.language.bentocomp.core.ParameterModel;
import bento.language.bentocomp.core.TemplateBasedComponent;
import bento.language.bentocomp.core.TransformationComponent;
import bento.language.bentocomp.core.util.CoreSwitch;
import bento.language.bentocomp.flowcontrol.Apply;
import bento.language.bentocomp.flowcontrol.ApplyParameter;
import bento.language.bentocomp.flowcontrol.CompositionStep;
import bento.language.bentocomp.flowcontrol.Seq;
import bento.language.bentocomp.flowcontrol.util.FlowcontrolSwitch;
import bento.language.bentocomp.technologies.AtlTemplate;
import bento.repository.local.FilePathResolver;
import bento.utils.BindingUtils;

/**
 * Traverses a given component adapting their dependencies
 * recursively. 
 * 
 * @author jesus
 */
public class ComponentInterpreter {

	private Component component;
	private FilePathResolver filePathResolver;
	
	private List<String> generatedArtifacts = new ArrayList<String>();
	
	public ComponentInterpreter(ComponentModel model, FilePathResolver filePathResolver) {
		this.component = model.getComponent();
		this.filePathResolver = filePathResolver;
	}

	public void apply() throws MyComponentError {
		List<AdaptationResult> result = null;
		if ( component instanceof CompositeComponent ) {
			result = adaptCompositeComponent((CompositeComponent) component, new ArrayList<Adaptation>(), (CompositeComponent) component);
		} else {
			throw new MyComponentError("Only composite components can be adapted");
		}
		
		result.forEach(r -> {
			r.exportToFileSystem(filePathResolver);
			generatedArtifacts.add(r.getAdaptedTemplateFileName());
		});
	}
	
	public List<? extends String> getGeneratedArtifacts() {
		return generatedArtifacts;
	}
	
	public void execute() throws MyComponentError {
		
		List<AdaptationResult> result = null;
		if ( component instanceof CompositeComponent ) {
			result = adaptCompositeComponent((CompositeComponent) component, new ArrayList<Adaptation>(), (CompositeComponent) component);
		} else {
			throw new MyComponentError("Only composite components can be adapted");
		}
		
		result.forEach(r -> System.out.println( r.getAdaptedTemplateFileName() ) );
	}
	

	/**
	 * Computes the required adaptations of a composite component.
	 * 
	 * @param component the composite component
	 * @param topComposite 
	 * @param parentAdaptations
	 * @return the list of required adaptations
	 * @throws MyComponentError 
	 */
	private List<AdaptationResult> adaptCompositeComponent(final CompositeComponent component, List<Adaptation> parentAdaptations, CompositeComponent topComposite) { 
		List<AdaptationResult> adaptations = doStep(component, component.getComposition().getStep(), parentAdaptations, topComposite);
		
		return adaptations;
	}

	private List<AdaptationResult> doStep(CompositeComponent component, final CompositionStep step, List<Adaptation> parentAdaptations, CompositeComponent topComposite) {
		List<AdaptationResult> adaptations = new FlowcontrolSwitch<List<AdaptationResult>>() {
			public List<AdaptationResult> caseApply(bento.language.bentocomp.flowcontrol.Apply object) {
				return doApplyTransformation(component, object, parentAdaptations, topComposite);
			}
		
			public java.util.List<AdaptationResult> caseSeq(bento.language.bentocomp.flowcontrol.Seq object) {
				return doSeq(component, object, parentAdaptations, topComposite);				
			};
			
			public java.util.List<AdaptationResult> defaultCase(org.eclipse.emf.ecore.EObject object) {
				throw new UnsupportedOperationException("Not supported: " + object);
			}
			
		}.doSwitch(step);
		
		return adaptations;
	}


	protected List<AdaptationResult> doSeq(CompositeComponent component, Seq seq, List<Adaptation> parentAdaptations, CompositeComponent topComposite) {
		List<AdaptationResult> result = new ArrayList<AdaptationResult>();
		seq.getSteps().forEach(step -> {
			result.addAll(doStep(component, step, parentAdaptations, topComposite));
		});
		return result;
	}

	/**
	 * Interprets the "Apply" command by creating adaptations for
	 * each of the transformation parameters with a binding.
	 * 
	 * @param component
	 * @param applyCommand
	 * @param parentAdaptations 
	 * @param topComposite
	 * @return 
	 */
	private List<AdaptationResult> doApplyTransformation(CompositeComponent parent, Apply applyCommand, List<Adaptation> parentAdaptations, final CompositeComponent topComposite) {
		
		// Required adaptations for an applied component
		// TODO: What happens if a parameter in a position of a parent adaptation has also been applied a binding?
		List<Adaptation> adaptations = computeAdaptationsForApply(applyCommand, true);
		adaptations.addAll(computeAdaptationsForApply(applyCommand, false));

		// Required adaptations specified in a parent component
		List<Adaptation> requiredByParent = computeParentAdaptations(parent, applyCommand, parentAdaptations, true);
		requiredByParent.addAll( computeParentAdaptations(parent, applyCommand, parentAdaptations, false) );
				
		adaptations.addAll(requiredByParent);
		
		List<AdaptationResult> r = new CoreSwitch<List<AdaptationResult>>() {
			public List<AdaptationResult> caseCompositeComponent(CompositeComponent comp) {
				return adaptCompositeComponent(comp, adaptations, topComposite);
				// throw new UnsupportedOperationException();
			};
			
			public List<AdaptationResult> caseTransformationComponent(bento.language.bentocomp.core.TransformationComponent comp) {
				return Collections.singletonList( applyTemplateBasedComponent(comp, adaptations, topComposite) );
			}

			
			public java.util.List<AdaptationResult> caseGraphicalEditorComponent(bento.language.bentocomp.core.GraphicalEditorComponent comp) {
				return Collections.singletonList( applyTemplateBasedComponent(comp, adaptations, topComposite) );				
			};
			
			public List<AdaptationResult> defaultCase(org.eclipse.emf.ecore.EObject object) {
				throw new UnsupportedOperationException("Not supported: " + object);
			}
		}.doSwitch(applyCommand.getComponent()); 
		
		ArrayList<AdaptationResult> result = new ArrayList<AdaptationResult>();
		result.addAll(r);
		return result;
	}

	private List<Adaptation> computeParentAdaptations(CompositeComponent parent, Apply applyCommand,
			List<Adaptation> parentAdaptations, boolean isSource) {
		List<ParameterModel> parentModels = isSource ? parent.getSourceModels() : parent.getTargetModels();
		List<ApplyParameter> applyModels  = isSource ? applyCommand.getInputModels() : applyCommand.getOutputModels();

		
		return parentAdaptations.stream().
			flatMap(a -> {
				ParameterModel m = parentModels.get(a.parameterIndex);
				
				Optional<ApplyParameter> opt = applyModels.stream().
					filter(p -> p.getModel() == m).
					findAny();
				
				if ( opt.isPresent() ) {				
					Adaptation newAdaptation = new Adaptation();
					newAdaptation.isSource = isSource;
					newAdaptation.parameterIndex = applyModels.indexOf(opt.get());
					newAdaptation.concreteModel = a.concreteModel;
					newAdaptation.appliedBinding = a.appliedBinding;
					return Stream.of(newAdaptation);
				} else {
					return Stream.empty();
				}
			}).collect(Collectors.toList());
	}

	private List<Adaptation> computeAdaptationsForApply(Apply applyCommand, boolean isSource) {
		List<ApplyParameter> models = isSource ? applyCommand.getInputModels() : applyCommand.getOutputModels();
		
		List<Adaptation> adaptations = models.stream()
				.filter(m -> m.getBinding() != null )
				.map(m -> {
					Adaptation a = new Adaptation();
					a.isSource = isSource;
					a.parameterIndex = models.indexOf(m);
					a.concreteModel = m.getModel();
					a.appliedBinding = m.getBinding();
					return a;
				}).collect(Collectors.toList());
		return adaptations;
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
	private AdaptationResult applyTemplateBasedComponent(Component comp, List<Adaptation> adaptations, CompositeComponent topComposite) {
		if ( ! (comp instanceof TemplateBasedComponent) ) {
			throw new UnsupportedOperationException();
		}
		TemplateBasedComponent component = (TemplateBasedComponent) comp;
		
		TechnologyConfiguration.TechnologyHandler handler = TechnologyConfiguration.INSTANCE.getHandler(component.getTemplate().eClass());
		if ( handler != null ) {
			return handler.adapt(comp, adaptations, topComposite, filePathResolver);
		}
		
		if ( ! ( component.getTemplate() instanceof AtlTemplate) ) {
			throw new UnsupportedOperationException();
		}

		AtlMemoryTemplate template = new AtlMemoryTemplate((TransformationComponent) component, filePathResolver);
		template.setAdapterFor(topComposite);
		adaptations.forEach(a -> {
			ParameterModel conceptModel = a.isSource ? comp.getSourceModels().get(a.parameterIndex) : comp.getTargetModels().get(a.parameterIndex);
			// BindingModelLoader2 loader = new BindingModelLoader2( a.appliedBinding.getFileName() );
			BindingModel bindingModel = BindingUtils.readBindingDescription( a.appliedBinding );
			
			template.adapt(conceptModel, a.concreteModel, bindingModel);
			
		});
		
		return template;
	};		
	
	public static class Adaptation {
		private boolean isSource;
		private int parameterIndex;
		private Model conceptModel;
		private BindingDeclaration appliedBinding;
		private Model concreteModel;	
	
		public boolean isSource() {
			return isSource;
		}
		
		public int getParameterIndex() {
			return parameterIndex;
		}
		
		public Model getConceptModel() {
			return conceptModel;
		}
		
		public BindingDeclaration getAppliedBinding() {
			return appliedBinding;
		}
		
		public Model getConcreteModel() {
			return concreteModel;
		}
	}

	
	
	
}

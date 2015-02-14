package genericity.compiler.atl.api;

import genericity.gcomponent.instantiation.ExecutableTransformation;
import genericity.language.gcomponent.core.BindingDeclaration;
import genericity.language.gcomponent.core.Component;
import genericity.language.gcomponent.core.CompositeComponent;
import genericity.language.gcomponent.core.Model;
import genericity.language.gcomponent.core.ParameterModel;
import genericity.language.gcomponent.core.TransformationComponent;
import genericity.language.gcomponent.core.util.CoreSwitch;
import genericity.language.gcomponent.dsl.DefinitionRoot;
import genericity.language.gcomponent.flowcontrol.Apply;
import genericity.language.gcomponent.flowcontrol.util.FlowcontrolSwitch;
import genericity.language.gcomponent.technologies.AtlTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;

public class ComponentExecutor2 {

	private Component component;
	private FilePathResolver filePathResolver;
	private HashMap<ExecutableTransformation, AtlTransformationLoader> loaders = new HashMap<ExecutableTransformation, AtlTransformationLoader>();
	
	public ComponentExecutor2(Resource r, FilePathResolver filePathResolver) {
		this.component = ((DefinitionRoot) r.getContents().get(0)).getComponent();
		this.filePathResolver = filePathResolver;
	}

	public void execute() throws MyComponentError {
		List<AdaptationResult> result = null;
		if ( component instanceof CompositeComponent ) {
			result = adaptComponent((CompositeComponent) component);
		} else {
			throw new MyComponentError("Only composite components can be executed");
		}
		
		result.forEach(r -> r.exportToFileSystem(filePathResolver));
		
	}

	private List<AdaptationResult> adaptComponent(final CompositeComponent component) throws MyComponentError { 
		List<AdaptationResult> adaptations = new FlowcontrolSwitch<List<AdaptationResult>>() {
			public List<AdaptationResult> caseApply(genericity.language.gcomponent.flowcontrol.Apply object) {
				return doApplyTransformation(component, object, component);
			}
		
			public java.util.List<AdaptationResult> defaultCase(org.eclipse.emf.ecore.EObject object) {
				throw new UnsupportedOperationException("Not supported: " + object);
			}
			
		}.doSwitch(component.getComposition().getStep());
		
		return adaptations;
	}


	/**
	 * Apply a transformation.
	 * 
	 * @param component
	 * @param object
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
			
			public AdaptationResult caseTransformationComponent(genericity.language.gcomponent.core.TransformationComponent comp) {
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
		
		adaptations.forEach(a -> {
			ParameterModel conceptModel = comp.getSourceModels().get(a.parameterIndex);
			BindingModelLoader2 loader = new BindingModelLoader2( a.appliedBinding.getFileName() );
			
			template.adapt(conceptModel, a.concreteModel, loader);
			
		});
		
		return template;
	};		
	
//	private void adapt(AdaptedTransformation transformation) {
//		String atlTemplate = null;
//		if ( transformation.getTemplate() instanceof AtlTemplate ) {
//			atlTemplate = ((AtlTemplate) transformation.getTemplate()).getTemplate();
//		} else {
//			throw new UnsupportedOperationException();
//		}
//		
//		String atlFile = this.filePathResolver.resolve(atlTemplate);		
//		FileBased atlLoader = adaptAtlFile(transformation, atlFile, component.getName() + ".atl");
//
//		String checkFile = atlFile.replace(".atl", "_check.atl");
//		if ( new File(checkFile).exists() ) {
//			adaptAtlFile(transformation, checkFile, component.getName() + "_check.atl");
//		}
//		
//		loaders.put(transformation, atlLoader);
//	}
	
	private class Adaptation {
		int parameterIndex;
		Model conceptModel;
		BindingDeclaration appliedBinding;
		Model concreteModel;	
	}
	
	
}

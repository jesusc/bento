/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.analysis;

import genericity.language.gcomponent.core.CoreFactory;
import genericity.language.gcomponent.core.GeneratedModel;
import genericity.language.gcomponent.core.ParameterModel;
import genericity.language.gcomponent.dsl.DefinitionRoot;
import genericity.language.gcomponent.flowcontrol.Apply;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class ApplyParameterModelReferenceResolver implements genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Model> {
	
	private genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Model> delegate = new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Model>();
	
	public void resolve(String identifier, genericity.language.gcomponent.flowcontrol.ApplyParameter container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<genericity.language.gcomponent.core.Model> result) {
		DefinitionRoot root = (DefinitionRoot) EcoreUtil.getRootContainer(container);
		Apply apply = (Apply) container.eContainer();
		boolean isSourceParameter = apply.getInputModels().contains(container);
		
		if ( isSourceParameter ) {
			// Look up the source models
			for(ParameterModel m : root.getComponent().getSourceModels()) {
				if ( m.getName().equals(identifier) ) {
                    result.addMapping(identifier, m);
                    return;					
				}
			}
	
			// Look up the generated models
			for(GeneratedModel m : root.getComponent().getGenerateModels() ) {
				if ( m.getName().equals(identifier) ) {
                    result.addMapping(identifier, m);
                    return;					
				}
			}	
		} else {
			// Look up the target model
			for(ParameterModel m : root.getComponent().getTargetModels()) {
				if ( m.getName().equals(identifier) ) {
                    result.addMapping(identifier, m);
                    return;					
				}
			}			
			
			// Generate a new model name
	        GeneratedModel newModel = CoreFactory.eINSTANCE.createGeneratedModel();
			newModel.setName(identifier);
			root.getComponent().getGenerateModels().add(newModel);
	        result.addMapping(identifier, newModel);
		}

		// delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(genericity.language.gcomponent.core.Model element, genericity.language.gcomponent.flowcontrol.ApplyParameter container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

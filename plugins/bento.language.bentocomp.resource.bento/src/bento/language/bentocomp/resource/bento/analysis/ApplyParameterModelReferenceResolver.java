/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.analysis;

import org.eclipse.emf.ecore.util.EcoreUtil;

import bento.language.bentocomp.core.CoreFactory;
import bento.language.bentocomp.core.GeneratedModel;
import bento.language.bentocomp.core.ParameterModel;
import bento.language.bentocomp.dsl.DefinitionRoot;
import bento.language.bentocomp.flowcontrol.Apply;

public class ApplyParameterModelReferenceResolver implements bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.Model> {
	
	private bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.Model> delegate = new bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.Model>();
	
	public void resolve(String identifier, bento.language.bentocomp.flowcontrol.ApplyParameter container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<bento.language.bentocomp.core.Model> result) {
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

			// Look up the target model as well
			for(ParameterModel m : root.getComponent().getTargetModels()) {
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
	
	public String deResolve(bento.language.bentocomp.core.Model element, bento.language.bentocomp.flowcontrol.ApplyParameter container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

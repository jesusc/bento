/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.analysis;

import org.eclipse.emf.ecore.util.EcoreUtil;

import genericity.language.gcomponent.core.Concept;
import genericity.language.gcomponent.flowcontrol.Apply;

public class ApplyParameterBoundConceptReferenceResolver implements genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Concept> {
	
	private genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Concept> delegate = new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.flowcontrol.ApplyParameter, genericity.language.gcomponent.core.Concept>();
	
	public void resolve(String identifier, genericity.language.gcomponent.flowcontrol.ApplyParameter container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<genericity.language.gcomponent.core.Concept> result) {
		// Apply apply = (Apply) container.eContainer();
		// boolean isSourceParameter = apply.getInputModels().contains(container);
		
		// DefinitionRoot root = (DefinitionRoot) EcoreUtil.getRootContainer(container);
		if ( container.getBoundConceptQualifier() != null ) {
			// boolean foundd = delegate.tryToResolveIdentifierInObjectTree(identifier, container, container.getBoundConceptQualifier(), reference, position, resolveFuzzy, result, false);
			//System.out.println(foundd);
			
			if ( container.getBoundConceptQualifier().eIsProxy() ) {
				EcoreUtil.resolve(container.getBoundConceptQualifier(), container.eResource().getResourceSet());
			}

			for(Concept c : container.getBoundConceptQualifier().getSource()) {
				if ( c.getName().equals(identifier) ) {
					result.addMapping(identifier, c);
				}
			}
			
			for(Concept c : container.getBoundConceptQualifier().getTarget()) {
				if ( c.getName().equals(identifier) ) {
					result.addMapping(identifier, c);
				}
			}
					
		} else {
			// TODO: Check source - target??
			delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);			
		}

	}
	
	public String deResolve(genericity.language.gcomponent.core.Concept element, genericity.language.gcomponent.flowcontrol.ApplyParameter container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

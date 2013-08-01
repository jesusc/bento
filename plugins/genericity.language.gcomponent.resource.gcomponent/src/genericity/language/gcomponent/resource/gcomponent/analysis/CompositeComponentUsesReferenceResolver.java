/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.analysis;

import genericity.language.gcomponent.dsl.DefinitionRoot;

public class CompositeComponentUsesReferenceResolver implements genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.core.CompositeComponent, genericity.language.gcomponent.core.Component> {
	
	private genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.core.CompositeComponent, genericity.language.gcomponent.core.Component> delegate = new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.core.CompositeComponent, genericity.language.gcomponent.core.Component>();
	
	public void resolve(String identifier, genericity.language.gcomponent.core.CompositeComponent container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<genericity.language.gcomponent.core.Component> result) {
		// copied from delegate.tryToResolveAsURI
		org.eclipse.emf.ecore.EClass type = reference.getEReferenceType();
		org.eclipse.emf.ecore.resource.Resource resource = container.eResource();
		if (resource != null) {
			org.eclipse.emf.common.util.URI uri = delegate.getURI(identifier, resource.getURI());
			if (uri != null) {
				org.eclipse.emf.ecore.EObject element = delegate.loadResource(container.eResource().getResourceSet(), uri);				
				if ( element instanceof DefinitionRoot ) {
					delegate.checkElement(container, 
							((DefinitionRoot) element).getComponent(), 
							reference, position, type, identifier, resolveFuzzy, false, result);					
					return;
				}
			}
		}
		
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(genericity.language.gcomponent.core.Component element, genericity.language.gcomponent.core.CompositeComponent container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

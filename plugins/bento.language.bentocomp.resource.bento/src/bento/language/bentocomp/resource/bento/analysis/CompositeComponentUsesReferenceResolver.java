/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.analysis;

import bento.language.bentocomp.dsl.DefinitionRoot;
import bento.language.bentocomp.resource.bento.ResolveBentoQuickfix;
import bento.repository.common.BentoURIResolver;

public class CompositeComponentUsesReferenceResolver implements bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.core.CompositeComponent, bento.language.bentocomp.core.Component> {
	
	private bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.core.CompositeComponent, bento.language.bentocomp.core.Component> delegate = new bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.core.CompositeComponent, bento.language.bentocomp.core.Component>();
	
	public void resolve(String identifier, bento.language.bentocomp.core.CompositeComponent container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<bento.language.bentocomp.core.Component> result) {
		// copied from delegate.tryToResolveAsURI
		org.eclipse.emf.ecore.EClass type = reference.getEReferenceType();
		org.eclipse.emf.ecore.resource.Resource resource = container.eResource();

		result.addQuickFix(new ResolveBentoQuickfix("Resolve component", null, container, identifier));
		identifier = BentoURIResolver.tryResolveComponent(identifier);
		
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
	
	public String deResolve(bento.language.bentocomp.core.Component element, bento.language.bentocomp.core.CompositeComponent container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

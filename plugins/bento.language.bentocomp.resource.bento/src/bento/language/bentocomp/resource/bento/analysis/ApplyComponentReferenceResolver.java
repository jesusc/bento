/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.analysis;

import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.core.CompositeComponent;
import bento.language.bentocomp.dsl.DefinitionRoot;
import bento.repository.common.BentoURIResolver;

public class ApplyComponentReferenceResolver implements bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.flowcontrol.Apply, bento.language.bentocomp.core.Component> {
	
	private bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.flowcontrol.Apply, bento.language.bentocomp.core.Component> delegate = new bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.flowcontrol.Apply, bento.language.bentocomp.core.Component>();
	
	public void resolve(String identifier, bento.language.bentocomp.flowcontrol.Apply container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<bento.language.bentocomp.core.Component> result) {
		DefinitionRoot root = (DefinitionRoot) org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer(container);
		CompositeComponent cc = (CompositeComponent) root.getComponent();
		for(Component u : cc.getUses()) {
			if ( resolveFuzzy ) {
				result.addMapping(BentoURIResolver.getNonQualifiedName(u), u);
			} else {
				if ( u.getName().equals(identifier) || BentoURIResolver.getNonQualifiedName(u).equals(identifier) ) {
					result.addMapping(identifier, u);
					return;
				}
			}
		}
		
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(bento.language.bentocomp.core.Component element, bento.language.bentocomp.flowcontrol.Apply container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

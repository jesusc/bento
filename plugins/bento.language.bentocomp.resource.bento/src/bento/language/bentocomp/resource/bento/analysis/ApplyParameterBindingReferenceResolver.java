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

public class ApplyParameterBindingReferenceResolver implements bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.BindingDeclaration> {
	
	private bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.BindingDeclaration> delegate = new bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.flowcontrol.ApplyParameter, bento.language.bentocomp.core.BindingDeclaration>();
	
	public void resolve(String identifier, bento.language.bentocomp.flowcontrol.ApplyParameter container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<bento.language.bentocomp.core.BindingDeclaration> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(bento.language.bentocomp.core.BindingDeclaration element, bento.language.bentocomp.flowcontrol.ApplyParameter container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

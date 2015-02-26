/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.analysis;

public class ParameterModelTypeReferenceResolver implements bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.core.ParameterModel, bento.language.bentocomp.core.Concept> {
	
	private bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.core.ParameterModel, bento.language.bentocomp.core.Concept> delegate = new bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.core.ParameterModel, bento.language.bentocomp.core.Concept>();
	
	public void resolve(String identifier, bento.language.bentocomp.core.ParameterModel container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<bento.language.bentocomp.core.Concept> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(bento.language.bentocomp.core.Concept element, bento.language.bentocomp.core.ParameterModel container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

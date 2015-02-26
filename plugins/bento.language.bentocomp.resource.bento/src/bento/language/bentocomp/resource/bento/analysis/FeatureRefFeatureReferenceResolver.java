/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.analysis;

public class FeatureRefFeatureReferenceResolver implements bento.language.bentocomp.resource.bento.IBentoReferenceResolver<bento.language.bentocomp.flowcontrol.FeatureRef, bento.language.bentocomp.variants.Feature> {
	
	private bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.flowcontrol.FeatureRef, bento.language.bentocomp.variants.Feature> delegate = new bento.language.bentocomp.resource.bento.analysis.BentoDefaultResolverDelegate<bento.language.bentocomp.flowcontrol.FeatureRef, bento.language.bentocomp.variants.Feature>();
	
	public void resolve(String identifier, bento.language.bentocomp.flowcontrol.FeatureRef container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<bento.language.bentocomp.variants.Feature> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(bento.language.bentocomp.variants.Feature element, bento.language.bentocomp.flowcontrol.FeatureRef container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

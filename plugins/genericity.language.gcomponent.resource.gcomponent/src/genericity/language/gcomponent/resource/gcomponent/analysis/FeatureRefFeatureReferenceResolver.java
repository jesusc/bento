/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.analysis;

public class FeatureRefFeatureReferenceResolver implements genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.flowcontrol.FeatureRef, genericity.language.gcomponent.variants.Feature> {
	
	private genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.flowcontrol.FeatureRef, genericity.language.gcomponent.variants.Feature> delegate = new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.flowcontrol.FeatureRef, genericity.language.gcomponent.variants.Feature>();
	
	public void resolve(String identifier, genericity.language.gcomponent.flowcontrol.FeatureRef container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<genericity.language.gcomponent.variants.Feature> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(genericity.language.gcomponent.variants.Feature element, genericity.language.gcomponent.flowcontrol.FeatureRef container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

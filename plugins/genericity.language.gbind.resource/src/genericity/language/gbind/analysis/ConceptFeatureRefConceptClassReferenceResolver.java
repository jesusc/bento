/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

public class ConceptFeatureRefConceptClassReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.ConceptFeatureRef, gbind.dsl.ConceptMetaclass> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.ConceptFeatureRef, gbind.dsl.ConceptMetaclass> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.ConceptFeatureRef, gbind.dsl.ConceptMetaclass>();
	
	public void resolve(String identifier, gbind.dsl.ConceptFeatureRef container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.dsl.ConceptMetaclass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(gbind.dsl.ConceptMetaclass element, gbind.dsl.ConceptFeatureRef container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

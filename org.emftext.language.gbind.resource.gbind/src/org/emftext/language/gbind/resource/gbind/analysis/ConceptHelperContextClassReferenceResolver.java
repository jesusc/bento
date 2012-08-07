/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.analysis;

public class ConceptHelperContextClassReferenceResolver implements org.emftext.language.gbind.resource.gbind.IGbindReferenceResolver<org.emftext.language.gbind.ConceptHelper, org.emftext.language.gbind.ConceptMetaclass> {
	
	private org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultResolverDelegate<org.emftext.language.gbind.ConceptHelper, org.emftext.language.gbind.ConceptMetaclass> delegate = new org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultResolverDelegate<org.emftext.language.gbind.ConceptHelper, org.emftext.language.gbind.ConceptMetaclass>();
	
	public void resolve(String identifier, org.emftext.language.gbind.ConceptHelper container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.gbind.resource.gbind.IGbindReferenceResolveResult<org.emftext.language.gbind.ConceptMetaclass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.gbind.ConceptMetaclass element, org.emftext.language.gbind.ConceptHelper container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

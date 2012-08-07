/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.analysis;

public class LocalHelperContextReferenceResolver implements org.emftext.language.gbind.resource.gbind.IGbindReferenceResolver<org.emftext.language.gbind.LocalHelper, org.emftext.language.gbind.ConcreteMetaclass> {
	
	private org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultResolverDelegate<org.emftext.language.gbind.LocalHelper, org.emftext.language.gbind.ConcreteMetaclass> delegate = new org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultResolverDelegate<org.emftext.language.gbind.LocalHelper, org.emftext.language.gbind.ConcreteMetaclass>();
	
	public void resolve(String identifier, org.emftext.language.gbind.LocalHelper container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.gbind.resource.gbind.IGbindReferenceResolveResult<org.emftext.language.gbind.ConcreteMetaclass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.gbind.ConcreteMetaclass element, org.emftext.language.gbind.LocalHelper container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}

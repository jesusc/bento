/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * A FuzzyResolveResult is an implementation of the IBentoReferenceResolveResult
 * interface that delegates all method calls to a given
 * IBentoReferenceResolveResult with ReferenceType EObject. It is used by
 * reference resolver switches to collect results from different reference
 * resolvers in a type safe manner.
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class BentoFuzzyResolveResult<ReferenceType extends org.eclipse.emf.ecore.EObject> implements bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<ReferenceType> {
	
	private bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate;
	
	public BentoFuzzyResolveResult(bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target, warning);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoQuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(bento.language.bentocomp.resource.bento.IBentoQuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}

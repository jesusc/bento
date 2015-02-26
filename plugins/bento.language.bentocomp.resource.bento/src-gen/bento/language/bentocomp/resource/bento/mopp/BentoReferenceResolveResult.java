/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * A basic implementation of the
 * bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult interface
 * that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class BentoReferenceResolveResult<ReferenceType> implements bento.language.bentocomp.resource.bento.IBentoReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<bento.language.bentocomp.resource.bento.IBentoReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<bento.language.bentocomp.resource.bento.IBentoQuickFix> quickFixes;
	
	public BentoReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<bento.language.bentocomp.resource.bento.IBentoQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(bento.language.bentocomp.resource.bento.IBentoQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<bento.language.bentocomp.resource.bento.IBentoQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<bento.language.bentocomp.resource.bento.IBentoReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new bento.language.bentocomp.resource.bento.mopp.BentoElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<bento.language.bentocomp.resource.bento.IBentoReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new bento.language.bentocomp.resource.bento.mopp.BentoURIMapping<ReferenceType>(identifier, uri, warning));
	}
}

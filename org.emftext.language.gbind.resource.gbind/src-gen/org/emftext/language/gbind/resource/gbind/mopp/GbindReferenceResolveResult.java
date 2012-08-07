/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

/**
 * A basic implementation of the
 * org.emftext.language.gbind.resource.gbind.IGbindReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class GbindReferenceResolveResult<ReferenceType> implements org.emftext.language.gbind.resource.gbind.IGbindReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.emftext.language.gbind.resource.gbind.IGbindQuickFix> quickFixes;
	
	public GbindReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.emftext.language.gbind.resource.gbind.IGbindQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.emftext.language.gbind.resource.gbind.IGbindQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.emftext.language.gbind.resource.gbind.IGbindQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<org.emftext.language.gbind.resource.gbind.IGbindReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.emftext.language.gbind.resource.gbind.mopp.GbindElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.emftext.language.gbind.resource.gbind.IGbindReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.emftext.language.gbind.resource.gbind.mopp.GbindURIMapping<ReferenceType>(identifier, uri, warning));
	}
}

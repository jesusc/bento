/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

/**
 * A basic implementation of the
 * genericity.language.gbind.IGbindReferenceResolveResult interface that collects
 * mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class GbindReferenceResolveResult<ReferenceType> implements genericity.language.gbind.IGbindReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<genericity.language.gbind.IGbindReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<genericity.language.gbind.IGbindQuickFix> quickFixes;
	
	public GbindReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<genericity.language.gbind.IGbindQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<genericity.language.gbind.IGbindQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(genericity.language.gbind.IGbindQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<genericity.language.gbind.IGbindQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<genericity.language.gbind.IGbindReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<genericity.language.gbind.IGbindReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new genericity.language.gbind.mopp.GbindElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<genericity.language.gbind.IGbindReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new genericity.language.gbind.mopp.GbindURIMapping<ReferenceType>(identifier, uri, warning));
	}
}

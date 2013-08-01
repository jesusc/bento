/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

/**
 * A basic implementation of the
 * genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveRe
 * sult interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class GcomponentReferenceResolveResult<ReferenceType> implements genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> quickFixes;
	
	public GcomponentReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentURIMapping<ReferenceType>(identifier, uri, warning));
	}
}

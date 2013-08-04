/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class GcomponentExpectedStructuralFeature extends genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentAbstractExpectedElement {
	
	private genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder placeholder;
	
	public GcomponentExpectedStructuralFeature(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof GcomponentExpectedStructuralFeature) {
			return getFeature().equals(((GcomponentExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}

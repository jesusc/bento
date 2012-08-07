/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class GbindExpectedStructuralFeature extends org.emftext.language.gbind.resource.gbind.mopp.GbindAbstractExpectedElement {
	
	private org.emftext.language.gbind.resource.gbind.grammar.GbindPlaceholder placeholder;
	
	public GbindExpectedStructuralFeature(org.emftext.language.gbind.resource.gbind.grammar.GbindPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
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
		if (o instanceof GbindExpectedStructuralFeature) {
			return getFeature().equals(((GbindExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}

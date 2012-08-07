/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class GbindPlaceholder extends org.emftext.language.gbind.resource.gbind.grammar.GbindTerminal {
	
	private final String tokenName;
	
	public GbindPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}

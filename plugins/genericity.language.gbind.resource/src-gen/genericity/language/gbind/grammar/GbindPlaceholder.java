/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class GbindPlaceholder extends genericity.language.gbind.grammar.GbindTerminal {
	
	private final String tokenName;
	
	public GbindPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, genericity.language.gbind.grammar.GbindCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}

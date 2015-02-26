/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class BentoPlaceholder extends bento.language.bentocomp.resource.bento.grammar.BentoTerminal {
	
	private final String tokenName;
	
	public BentoPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}

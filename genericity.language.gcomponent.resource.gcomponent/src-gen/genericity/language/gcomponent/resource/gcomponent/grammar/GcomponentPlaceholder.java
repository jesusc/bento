/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class GcomponentPlaceholder extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentTerminal {
	
	private final String tokenName;
	
	public GcomponentPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}

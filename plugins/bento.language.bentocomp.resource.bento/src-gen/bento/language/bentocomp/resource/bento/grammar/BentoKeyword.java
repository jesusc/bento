/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class BentoKeyword extends bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement {
	
	private final String value;
	
	public BentoKeyword(String value, bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}

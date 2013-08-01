/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class GbindKeyword extends genericity.language.gbind.grammar.GbindSyntaxElement {
	
	private final String value;
	
	public GbindKeyword(String value, genericity.language.gbind.grammar.GbindCardinality cardinality) {
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

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class GcomponentKeyword extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement {
	
	private final String value;
	
	public GcomponentKeyword(String value, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality) {
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

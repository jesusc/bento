/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

public class GbindChoice extends genericity.language.gbind.grammar.GbindSyntaxElement {
	
	public GbindChoice(genericity.language.gbind.grammar.GbindCardinality cardinality, genericity.language.gbind.grammar.GbindSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return genericity.language.gbind.util.GbindStringUtil.explode(getChildren(), "|");
	}
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

public class GbindSequence extends genericity.language.gbind.grammar.GbindSyntaxElement {
	
	public GbindSequence(genericity.language.gbind.grammar.GbindCardinality cardinality, genericity.language.gbind.grammar.GbindSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return genericity.language.gbind.util.GbindStringUtil.explode(getChildren(), " ");
	}
	
}

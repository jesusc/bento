/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

public class GcomponentSequence extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement {
	
	public GcomponentSequence(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return genericity.language.gcomponent.resource.gcomponent.util.GcomponentStringUtil.explode(getChildren(), " ");
	}
	
}

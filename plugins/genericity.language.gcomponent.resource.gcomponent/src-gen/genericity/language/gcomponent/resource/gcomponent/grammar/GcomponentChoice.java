/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

public class GcomponentChoice extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement {
	
	public GcomponentChoice(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return genericity.language.gcomponent.resource.gcomponent.util.GcomponentStringUtil.explode(getChildren(), "|");
	}
	
}

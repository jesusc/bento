/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

public class GcomponentCompound extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement {
	
	public GcomponentCompound(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentChoice choice, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality) {
		super(cardinality, new genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}

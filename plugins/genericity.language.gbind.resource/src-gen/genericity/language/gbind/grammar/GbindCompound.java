/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

public class GbindCompound extends genericity.language.gbind.grammar.GbindSyntaxElement {
	
	public GbindCompound(genericity.language.gbind.grammar.GbindChoice choice, genericity.language.gbind.grammar.GbindCardinality cardinality) {
		super(cardinality, new genericity.language.gbind.grammar.GbindSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}

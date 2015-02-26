/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

public class BentoCompound extends bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement {
	
	public BentoCompound(bento.language.bentocomp.resource.bento.grammar.BentoChoice choice, bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality) {
		super(cardinality, new bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}

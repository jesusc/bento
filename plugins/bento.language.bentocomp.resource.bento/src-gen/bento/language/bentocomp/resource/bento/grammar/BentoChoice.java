/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

public class BentoChoice extends bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement {
	
	public BentoChoice(bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality, bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return bento.language.bentocomp.resource.bento.util.BentoStringUtil.explode(getChildren(), "|");
	}
	
}

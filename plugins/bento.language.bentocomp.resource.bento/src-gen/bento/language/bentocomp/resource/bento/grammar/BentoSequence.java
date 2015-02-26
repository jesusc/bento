/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

public class BentoSequence extends bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement {
	
	public BentoSequence(bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality, bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return bento.language.bentocomp.resource.bento.util.BentoStringUtil.explode(getChildren(), " ");
	}
	
}

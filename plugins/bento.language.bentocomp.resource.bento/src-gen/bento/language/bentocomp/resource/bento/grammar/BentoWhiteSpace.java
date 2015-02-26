/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

public class BentoWhiteSpace extends bento.language.bentocomp.resource.bento.grammar.BentoFormattingElement {
	
	private final int amount;
	
	public BentoWhiteSpace(int amount, bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}

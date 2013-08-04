/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

public class GbindWhiteSpace extends genericity.language.gbind.grammar.GbindFormattingElement {
	
	private final int amount;
	
	public GbindWhiteSpace(int amount, genericity.language.gbind.grammar.GbindCardinality cardinality) {
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

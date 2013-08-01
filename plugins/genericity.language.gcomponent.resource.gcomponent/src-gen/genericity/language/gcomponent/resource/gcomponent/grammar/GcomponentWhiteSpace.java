/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

public class GcomponentWhiteSpace extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFormattingElement {
	
	private final int amount;
	
	public GcomponentWhiteSpace(int amount, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality) {
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

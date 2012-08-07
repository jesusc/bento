/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

public class GbindWhiteSpace extends org.emftext.language.gbind.resource.gbind.grammar.GbindFormattingElement {
	
	private final int amount;
	
	public GbindWhiteSpace(int amount, org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality) {
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

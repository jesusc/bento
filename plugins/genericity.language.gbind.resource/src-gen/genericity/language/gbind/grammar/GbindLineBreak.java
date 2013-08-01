/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

public class GbindLineBreak extends genericity.language.gbind.grammar.GbindFormattingElement {
	
	private final int tabs;
	
	public GbindLineBreak(genericity.language.gbind.grammar.GbindCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}

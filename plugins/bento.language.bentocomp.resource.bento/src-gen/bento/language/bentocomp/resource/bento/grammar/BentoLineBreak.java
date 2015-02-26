/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

public class BentoLineBreak extends bento.language.bentocomp.resource.bento.grammar.BentoFormattingElement {
	
	private final int tabs;
	
	public BentoLineBreak(bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality, int tabs) {
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

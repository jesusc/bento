/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

public class GbindLineBreak extends org.emftext.language.gbind.resource.gbind.grammar.GbindFormattingElement {
	
	private final int tabs;
	
	public GbindLineBreak(org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality, int tabs) {
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

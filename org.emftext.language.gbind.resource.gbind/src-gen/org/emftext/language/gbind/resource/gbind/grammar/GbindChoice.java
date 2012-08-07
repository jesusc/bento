/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

public class GbindChoice extends org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement {
	
	public GbindChoice(org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality, org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.emftext.language.gbind.resource.gbind.util.GbindStringUtil.explode(getChildren(), "|");
	}
	
}

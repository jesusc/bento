/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

public class GbindSequence extends org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement {
	
	public GbindSequence(org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality, org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.emftext.language.gbind.resource.gbind.util.GbindStringUtil.explode(getChildren(), " ");
	}
	
}

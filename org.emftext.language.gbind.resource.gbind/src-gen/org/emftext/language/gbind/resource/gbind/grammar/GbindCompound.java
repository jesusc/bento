/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

public class GbindCompound extends org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement {
	
	public GbindCompound(org.emftext.language.gbind.resource.gbind.grammar.GbindChoice choice, org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality) {
		super(cardinality, new org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class GbindKeyword extends org.emftext.language.gbind.resource.gbind.grammar.GbindSyntaxElement {
	
	private final String value;
	
	public GbindKeyword(String value, org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}

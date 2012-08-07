/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class GbindExpectedCsString extends org.emftext.language.gbind.resource.gbind.mopp.GbindAbstractExpectedElement {
	
	private org.emftext.language.gbind.resource.gbind.grammar.GbindKeyword keyword;
	
	public GbindExpectedCsString(org.emftext.language.gbind.resource.gbind.grammar.GbindKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof GbindExpectedCsString) {
			return getValue().equals(((GbindExpectedCsString) o).getValue());
		}
		return false;
	}
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class GcomponentExpectedCsString extends genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentAbstractExpectedElement {
	
	private genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword keyword;
	
	public GcomponentExpectedCsString(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentKeyword keyword) {
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
		if (o instanceof GcomponentExpectedCsString) {
			return getValue().equals(((GcomponentExpectedCsString) o).getValue());
		}
		return false;
	}
	
}

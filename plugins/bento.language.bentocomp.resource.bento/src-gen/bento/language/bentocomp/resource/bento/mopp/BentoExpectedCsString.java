/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class BentoExpectedCsString extends bento.language.bentocomp.resource.bento.mopp.BentoAbstractExpectedElement {
	
	private bento.language.bentocomp.resource.bento.grammar.BentoKeyword keyword;
	
	public BentoExpectedCsString(bento.language.bentocomp.resource.bento.grammar.BentoKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof BentoExpectedCsString) {
			return getValue().equals(((BentoExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}

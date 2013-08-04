/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

public class GcomponentLineBreak extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentFormattingElement {
	
	private final int tabs;
	
	public GcomponentLineBreak(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality, int tabs) {
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

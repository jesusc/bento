/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentBracketInformationProvider {
	
	public class BracketPair implements genericity.language.gcomponent.resource.gcomponent.IGcomponentBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentBracketPair> getBracketPairs() {
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentBracketPair> result = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.IGcomponentBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}

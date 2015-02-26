/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoBracketInformationProvider {
	
	public class BracketPair implements bento.language.bentocomp.resource.bento.IBentoBracketPair {
		
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
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoBracketPair> getBracketPairs() {
		java.util.Collection<bento.language.bentocomp.resource.bento.IBentoBracketPair> result = new java.util.ArrayList<bento.language.bentocomp.resource.bento.IBentoBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}

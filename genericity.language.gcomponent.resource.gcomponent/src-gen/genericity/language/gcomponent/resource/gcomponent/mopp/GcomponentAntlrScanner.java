/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentAntlrScanner implements genericity.language.gcomponent.resource.gcomponent.IGcomponentTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public GcomponentAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTextToken result = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}

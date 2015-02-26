/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoAntlrScanner implements bento.language.bentocomp.resource.bento.IBentoTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public BentoAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		bento.language.bentocomp.resource.bento.IBentoTextToken result = new bento.language.bentocomp.resource.bento.mopp.BentoANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}

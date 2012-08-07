/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

public class GbindAntlrScanner implements org.emftext.language.gbind.resource.gbind.IGbindTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public GbindAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.emftext.language.gbind.resource.gbind.IGbindTextToken result = new org.emftext.language.gbind.resource.gbind.mopp.GbindTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}

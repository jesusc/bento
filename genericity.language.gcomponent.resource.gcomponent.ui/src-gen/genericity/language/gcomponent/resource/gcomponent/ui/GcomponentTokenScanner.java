/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class GcomponentTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentTextScanner lexer;
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentTextToken currentToken;
	private java.util.List<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextToken> nextTokens;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private genericity.language.gcomponent.resource.gcomponent.ui.GcomponentColorManager colorManager;
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public GcomponentTokenScanner(genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation().createLexer();
		this.languageId = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation().getSyntaxName();
		genericity.language.gcomponent.resource.gcomponent.ui.GcomponentUIPlugin plugin = genericity.language.gcomponent.resource.gcomponent.ui.GcomponentUIPlugin.getDefault();
		if (plugin != null) {
			this.store = plugin.getPreferenceStore();
		}
		this.nextTokens = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextToken>();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		boolean isOriginalToken = true;
		if (!nextTokens.isEmpty()) {
			currentToken = nextTokens.remove(0);
			isOriginalToken = false;
		} else {
			currentToken = lexer.getNextToken();
		}
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		if (isOriginalToken) {
			splitCurrentToken();
		}
		
		org.eclipse.jface.text.TextAttribute textAttribute = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
			if (dynamicStyle != null) {
				textAttribute = getTextAttribute(dynamicStyle);
			}
		}
		
		return new org.eclipse.jface.text.rules.Token(textAttribute);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(org.eclipse.swt.graphics.RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle getStaticTokenStyle() {
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle staticStyle = null;
		String tokenName = currentToken.getName();
		String enableKey = genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.ENABLE);
		boolean enabled = store.getBoolean(enableKey);
		if (enabled) {
			String colorKey = genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.COLOR);
			org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
			org.eclipse.swt.graphics.RGB backgroundRGB = null;
			boolean bold = store.getBoolean(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.BOLD));
			boolean italic = store.getBoolean(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.ITALIC));
			boolean strikethrough = store.getBoolean(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
			boolean underline = store.getBoolean(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.UNDERLINE));
			staticStyle = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
		}
		return staticStyle;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle getDynamicTokenStyle(genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle staticStyle) {
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentDynamicTokenStyler dynamicTokenStyler = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentDynamicTokenStyler();
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public org.eclipse.jface.text.TextAttribute getTextAttribute(genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle tokeStyle) {
		int[] foregroundColorArray = tokeStyle.getColorAsRGB();
		org.eclipse.swt.graphics.Color foregroundColor = null;
		if (colorManager != null) {
			foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
		}
		int[] backgroundColorArray = tokeStyle.getBackgroundColorAsRGB();
		org.eclipse.swt.graphics.Color backgroundColor = null;
		if (backgroundColorArray != null) {
			org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
			if (colorManager != null) {
				backgroundColor = colorManager.getColor(backgroundRGB);
			}
		}
		int style = org.eclipse.swt.SWT.NORMAL;
		if (tokeStyle.isBold()) {
			style = style | org.eclipse.swt.SWT.BOLD;
		}
		if (tokeStyle.isItalic()) {
			style = style | org.eclipse.swt.SWT.ITALIC;
		}
		if (tokeStyle.isStrikethrough()) {
			style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
		}
		if (tokeStyle.isUnderline()) {
			style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
		}
		return new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
	}
	
	/**
	 * Tries to split the current token if it contains task items.
	 */
	public void splitCurrentToken() {
		final String text = currentToken.getText();
		final String name = currentToken.getName();
		final int line = currentToken.getLine();
		final int charStart = currentToken.getOffset();
		final int column = currentToken.getColumn();
		
		java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTaskItem> taskItems = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		java.util.List<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextToken> newItems = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextToken>();
		for (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item (TODO if required)
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTextToken(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item (TODO if required)
			String textAfter = text.substring(offset - charStart);
			newItems.add(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}

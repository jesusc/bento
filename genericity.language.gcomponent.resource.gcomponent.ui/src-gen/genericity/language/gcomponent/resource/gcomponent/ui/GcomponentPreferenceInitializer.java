/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

/**
 * A class used to initialize default preference values.
 */
public class GcomponentPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static genericity.language.gcomponent.resource.gcomponent.ui.GcomponentAntlrTokenHelper tokenHelper = new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = genericity.language.gcomponent.resource.gcomponent.ui.GcomponentUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = genericity.language.gcomponent.resource.gcomponent.ui.GcomponentUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = genericity.language.gcomponent.resource.gcomponent.ui.GcomponentUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, genericity.language.gcomponent.resource.gcomponent.IGcomponentMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		genericity.language.gcomponent.resource.gcomponent.ui.GcomponentBracketSet bracketSet = new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentBracketSet(null, null);
		final java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (genericity.language.gcomponent.resource.gcomponent.IGcomponentBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + genericity.language.gcomponent.resource.gcomponent.ui.GcomponentPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, genericity.language.gcomponent.resource.gcomponent.IGcomponentMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}

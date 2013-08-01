/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

/**
 * A class used to initialize default preference values.
 */
public class GbindPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = gbind.resource.gbind.ui.GbindUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(gbind.resource.gbind.ui.GbindPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(gbind.resource.gbind.ui.GbindPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = gbind.resource.gbind.ui.GbindUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new genericity.language.gbind.mopp.GbindMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = gbind.resource.gbind.ui.GbindUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new genericity.language.gbind.mopp.GbindMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, genericity.language.gbind.IGbindMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		gbind.resource.gbind.ui.GbindBracketSet bracketSet = new gbind.resource.gbind.ui.GbindBracketSet(null, null);
		final java.util.Collection<genericity.language.gbind.IGbindBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (genericity.language.gbind.IGbindBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + gbind.resource.gbind.ui.GbindPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, genericity.language.gbind.mopp.GbindMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			genericity.language.gbind.IGbindTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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

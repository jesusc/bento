/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.ui;

/**
 * A class used to initialize default preference values.
 */
public class GbindPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.emftext.language.gbind.resource.gbind.ui.GbindAntlrTokenHelper tokenHelper = new org.emftext.language.gbind.resource.gbind.ui.GbindAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.emftext.language.gbind.resource.gbind.ui.GbindUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.emftext.language.gbind.resource.gbind.ui.GbindPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.emftext.language.gbind.resource.gbind.ui.GbindPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.emftext.language.gbind.resource.gbind.ui.GbindUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.emftext.language.gbind.resource.gbind.mopp.GbindMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.emftext.language.gbind.resource.gbind.ui.GbindUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.emftext.language.gbind.resource.gbind.mopp.GbindMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.emftext.language.gbind.resource.gbind.IGbindMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.emftext.language.gbind.resource.gbind.ui.GbindBracketSet bracketSet = new org.emftext.language.gbind.resource.gbind.ui.GbindBracketSet(null, null);
		final java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.emftext.language.gbind.resource.gbind.IGbindBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.emftext.language.gbind.resource.gbind.ui.GbindPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.emftext.language.gbind.resource.gbind.IGbindMetaInformation metaInformation) {
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
			org.emftext.language.gbind.resource.gbind.IGbindTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.gbind.resource.gbind.ui.GbindSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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

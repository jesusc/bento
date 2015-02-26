/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

/**
 * A class used to initialize default preference values.
 */
public class BentoPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = bento.language.bentocomp.resource.bento.ui.BentoUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(bento.language.bentocomp.resource.bento.ui.BentoPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(bento.language.bentocomp.resource.bento.ui.BentoPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = bento.language.bentocomp.resource.bento.ui.BentoUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new bento.language.bentocomp.resource.bento.mopp.BentoMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = bento.language.bentocomp.resource.bento.ui.BentoUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new bento.language.bentocomp.resource.bento.mopp.BentoMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, bento.language.bentocomp.resource.bento.IBentoMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		bento.language.bentocomp.resource.bento.ui.BentoBracketSet bracketSet = new bento.language.bentocomp.resource.bento.ui.BentoBracketSet(null, null);
		final java.util.Collection<bento.language.bentocomp.resource.bento.IBentoBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (bento.language.bentocomp.resource.bento.IBentoBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + bento.language.bentocomp.resource.bento.ui.BentoPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, bento.language.bentocomp.resource.bento.mopp.BentoMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			bento.language.bentocomp.resource.bento.IBentoTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, bento.language.bentocomp.resource.bento.ui.BentoSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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

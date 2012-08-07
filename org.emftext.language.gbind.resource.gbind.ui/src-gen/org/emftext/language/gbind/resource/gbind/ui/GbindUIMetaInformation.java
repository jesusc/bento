/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.ui;

public class GbindUIMetaInformation extends org.emftext.language.gbind.resource.gbind.mopp.GbindMetaInformation {
	
	public org.emftext.language.gbind.resource.gbind.IGbindHoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.gbind.resource.gbind.ui.GbindHoverTextProvider();
	}
	
	public org.emftext.language.gbind.resource.gbind.ui.GbindImageProvider getImageProvider() {
		return org.emftext.language.gbind.resource.gbind.ui.GbindImageProvider.INSTANCE;
	}
	
	public org.emftext.language.gbind.resource.gbind.ui.GbindColorManager createColorManager() {
		return new org.emftext.language.gbind.resource.gbind.ui.GbindColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.gbind.resource.gbind.IGbindTextResource,
	 * org.emftext.language.gbind.resource.gbind.ui.GbindColorManager) instead.
	 */
	public org.emftext.language.gbind.resource.gbind.ui.GbindTokenScanner createTokenScanner(org.emftext.language.gbind.resource.gbind.ui.GbindColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.gbind.resource.gbind.ui.GbindTokenScanner createTokenScanner(org.emftext.language.gbind.resource.gbind.IGbindTextResource resource, org.emftext.language.gbind.resource.gbind.ui.GbindColorManager colorManager) {
		return new org.emftext.language.gbind.resource.gbind.ui.GbindTokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.gbind.resource.gbind.ui.GbindCodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.gbind.resource.gbind.ui.GbindCodeCompletionHelper();
	}
	
}

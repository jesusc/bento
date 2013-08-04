/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.resource.gbind.ui;

public class GbindUIMetaInformation extends genericity.language.gbind.mopp.GbindMetaInformation {
	
	public genericity.language.gbind.IGbindHoverTextProvider getHoverTextProvider() {
		return new genericity.language.gbind.resource.gbind.ui.GbindHoverTextProvider();
	}
	
	public genericity.language.gbind.resource.gbind.ui.GbindImageProvider getImageProvider() {
		return genericity.language.gbind.resource.gbind.ui.GbindImageProvider.INSTANCE;
	}
	
	public genericity.language.gbind.resource.gbind.ui.GbindColorManager createColorManager() {
		return new genericity.language.gbind.resource.gbind.ui.GbindColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(genericity.language.gbind.IGbindTextResource,
	 * genericity.language.gbind.resource.gbind.ui.GbindColorManager) instead.
	 */
	public genericity.language.gbind.resource.gbind.ui.GbindTokenScanner createTokenScanner(genericity.language.gbind.resource.gbind.ui.GbindColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public genericity.language.gbind.resource.gbind.ui.GbindTokenScanner createTokenScanner(genericity.language.gbind.IGbindTextResource resource, genericity.language.gbind.resource.gbind.ui.GbindColorManager colorManager) {
		return new genericity.language.gbind.resource.gbind.ui.GbindTokenScanner(resource, colorManager);
	}
	
	public genericity.language.gbind.resource.gbind.ui.GbindCodeCompletionHelper createCodeCompletionHelper() {
		return new genericity.language.gbind.resource.gbind.ui.GbindCodeCompletionHelper();
	}
	
}

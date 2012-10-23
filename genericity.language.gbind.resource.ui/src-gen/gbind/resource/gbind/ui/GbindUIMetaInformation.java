/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

public class GbindUIMetaInformation extends genericity.language.gbind.mopp.GbindMetaInformation {
	
	public genericity.language.gbind.IGbindHoverTextProvider getHoverTextProvider() {
		return new gbind.resource.gbind.ui.GbindHoverTextProvider();
	}
	
	public gbind.resource.gbind.ui.GbindImageProvider getImageProvider() {
		return gbind.resource.gbind.ui.GbindImageProvider.INSTANCE;
	}
	
	public gbind.resource.gbind.ui.GbindColorManager createColorManager() {
		return new gbind.resource.gbind.ui.GbindColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(genericity.language.gbind.IGbindTextResource,
	 * gbind.resource.gbind.ui.GbindColorManager) instead.
	 */
	public gbind.resource.gbind.ui.GbindTokenScanner createTokenScanner(gbind.resource.gbind.ui.GbindColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public gbind.resource.gbind.ui.GbindTokenScanner createTokenScanner(genericity.language.gbind.IGbindTextResource resource, gbind.resource.gbind.ui.GbindColorManager colorManager) {
		return new gbind.resource.gbind.ui.GbindTokenScanner(resource, colorManager);
	}
	
	public gbind.resource.gbind.ui.GbindCodeCompletionHelper createCodeCompletionHelper() {
		return new gbind.resource.gbind.ui.GbindCodeCompletionHelper();
	}
	
}

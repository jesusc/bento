/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

public class GcomponentUIMetaInformation extends genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation {
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentHoverTextProvider getHoverTextProvider() {
		return new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentHoverTextProvider();
	}
	
	public genericity.language.gcomponent.resource.gcomponent.ui.GcomponentImageProvider getImageProvider() {
		return genericity.language.gcomponent.resource.gcomponent.ui.GcomponentImageProvider.INSTANCE;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.ui.GcomponentColorManager createColorManager() {
		return new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(genericity.language.gcomponent.resource.gcomponent.IGcomponen
	 * tTextResource,
	 * genericity.language.gcomponent.resource.gcomponent.ui.GcomponentColorManager)
	 * instead.
	 */
	public genericity.language.gcomponent.resource.gcomponent.ui.GcomponentTokenScanner createTokenScanner(genericity.language.gcomponent.resource.gcomponent.ui.GcomponentColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.ui.GcomponentTokenScanner createTokenScanner(genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource, genericity.language.gcomponent.resource.gcomponent.ui.GcomponentColorManager colorManager) {
		return new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentTokenScanner(resource, colorManager);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCodeCompletionHelper createCodeCompletionHelper() {
		return new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCodeCompletionHelper();
	}
	
}

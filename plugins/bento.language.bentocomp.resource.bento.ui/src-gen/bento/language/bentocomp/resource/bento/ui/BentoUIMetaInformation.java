/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

public class BentoUIMetaInformation extends bento.language.bentocomp.resource.bento.mopp.BentoMetaInformation {
	
	public bento.language.bentocomp.resource.bento.IBentoHoverTextProvider getHoverTextProvider() {
		return new bento.language.bentocomp.resource.bento.ui.BentoHoverTextProvider();
	}
	
	public bento.language.bentocomp.resource.bento.ui.BentoImageProvider getImageProvider() {
		return bento.language.bentocomp.resource.bento.ui.BentoImageProvider.INSTANCE;
	}
	
	public bento.language.bentocomp.resource.bento.ui.BentoColorManager createColorManager() {
		return new bento.language.bentocomp.resource.bento.ui.BentoColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(bento.language.bentocomp.resource.bento.IBentoTextResource,
	 * bento.language.bentocomp.resource.bento.ui.BentoColorManager) instead.
	 */
	public bento.language.bentocomp.resource.bento.ui.BentoTokenScanner createTokenScanner(bento.language.bentocomp.resource.bento.ui.BentoColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public bento.language.bentocomp.resource.bento.ui.BentoTokenScanner createTokenScanner(bento.language.bentocomp.resource.bento.IBentoTextResource resource, bento.language.bentocomp.resource.bento.ui.BentoColorManager colorManager) {
		return new bento.language.bentocomp.resource.bento.ui.BentoTokenScanner(resource, colorManager);
	}
	
	public bento.language.bentocomp.resource.bento.ui.BentoCodeCompletionHelper createCodeCompletionHelper() {
		return new bento.language.bentocomp.resource.bento.ui.BentoCodeCompletionHelper();
	}
	
}

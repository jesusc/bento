/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

public class GcomponentHoverTextProvider implements genericity.language.gcomponent.resource.gcomponent.IGcomponentHoverTextProvider {
	
	private genericity.language.gcomponent.resource.gcomponent.ui.GcomponentDefaultHoverTextProvider defaultProvider = new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}

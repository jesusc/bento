/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.ui;

public class GbindHoverTextProvider implements org.emftext.language.gbind.resource.gbind.IGbindHoverTextProvider {
	
	private org.emftext.language.gbind.resource.gbind.ui.GbindDefaultHoverTextProvider defaultProvider = new org.emftext.language.gbind.resource.gbind.ui.GbindDefaultHoverTextProvider();
	
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

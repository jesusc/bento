/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

public class GbindParseResult implements org.emftext.language.gbind.resource.gbind.IGbindParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindCommand<org.emftext.language.gbind.resource.gbind.IGbindTextResource>> commands = new java.util.ArrayList<org.emftext.language.gbind.resource.gbind.IGbindCommand<org.emftext.language.gbind.resource.gbind.IGbindTextResource>>();
	
	public GbindParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindCommand<org.emftext.language.gbind.resource.gbind.IGbindTextResource>> getPostParseCommands() {
		return commands;
	}
	
}

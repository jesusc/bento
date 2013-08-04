/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

public class GbindParseResult implements genericity.language.gbind.IGbindParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>> commands = new java.util.ArrayList<genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>>();
	
	public GbindParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>> getPostParseCommands() {
		return commands;
	}
	
}

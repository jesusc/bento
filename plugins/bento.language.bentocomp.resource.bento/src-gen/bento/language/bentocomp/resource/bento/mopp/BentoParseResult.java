/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoParseResult implements bento.language.bentocomp.resource.bento.IBentoParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>> commands = new java.util.ArrayList<bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>>();
	
	public BentoParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>> getPostParseCommands() {
		return commands;
	}
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IBentoParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoCommand<bento.language.bentocomp.resource.bento.IBentoTextResource>> getPostParseCommands();
	
}

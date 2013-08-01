/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IGbindParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<genericity.language.gbind.IGbindCommand<genericity.language.gbind.IGbindTextResource>> getPostParseCommands();
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IBentoCommand<ContextType> {
	
	public boolean execute(ContextType context);
}

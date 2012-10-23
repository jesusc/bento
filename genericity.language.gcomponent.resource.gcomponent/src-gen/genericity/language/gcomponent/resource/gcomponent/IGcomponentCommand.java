/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IGcomponentCommand<ContextType> {
	
	public boolean execute(ContextType context);
}

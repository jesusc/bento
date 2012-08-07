/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IGbindCommand<ContextType> {
	
	public boolean execute(ContextType context);
}

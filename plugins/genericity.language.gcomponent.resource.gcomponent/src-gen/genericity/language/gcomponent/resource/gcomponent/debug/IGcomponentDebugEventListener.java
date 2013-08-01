/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.debug;

public interface IGcomponentDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage message);
}

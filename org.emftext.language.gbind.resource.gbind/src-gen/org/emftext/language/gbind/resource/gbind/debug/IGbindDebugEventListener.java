/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.debug;

public interface IGbindDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(org.emftext.language.gbind.resource.gbind.debug.GbindDebugMessage message);
}

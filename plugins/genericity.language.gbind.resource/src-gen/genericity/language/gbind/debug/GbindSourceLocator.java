/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.debug;

public class GbindSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new genericity.language.gbind.debug.GbindSourceLookupParticipant()});
	}
	
}

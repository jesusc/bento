/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.debug;

public class GcomponentSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof genericity.language.gcomponent.resource.gcomponent.debug.GcomponentStackFrame) {
			genericity.language.gcomponent.resource.gcomponent.debug.GcomponentStackFrame frame = (genericity.language.gcomponent.resource.gcomponent.debug.GcomponentStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}

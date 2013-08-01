/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.debug;

public class GbindSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof genericity.language.gbind.debug.GbindStackFrame) {
			genericity.language.gbind.debug.GbindStackFrame frame = (genericity.language.gbind.debug.GbindStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}

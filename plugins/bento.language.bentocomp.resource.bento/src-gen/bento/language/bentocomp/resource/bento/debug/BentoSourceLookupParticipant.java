/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.debug;

public class BentoSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof bento.language.bentocomp.resource.bento.debug.BentoStackFrame) {
			bento.language.bentocomp.resource.bento.debug.BentoStackFrame frame = (bento.language.bentocomp.resource.bento.debug.BentoStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}

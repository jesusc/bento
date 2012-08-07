/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.debug;

public class GbindSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof org.emftext.language.gbind.resource.gbind.debug.GbindStackFrame) {
			org.emftext.language.gbind.resource.gbind.debug.GbindStackFrame frame = (org.emftext.language.gbind.resource.gbind.debug.GbindStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}

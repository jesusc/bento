/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind;

public interface IGbindBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.emftext.language.gbind.resource.gbind.mopp.GbindResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}

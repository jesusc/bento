/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent;

public interface IGcomponentBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}

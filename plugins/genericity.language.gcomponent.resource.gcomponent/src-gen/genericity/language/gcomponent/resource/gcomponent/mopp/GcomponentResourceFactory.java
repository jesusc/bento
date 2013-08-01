/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public GcomponentResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResource(uri);
	}
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

public class GbindResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public GbindResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new genericity.language.gbind.mopp.GbindResource(uri);
	}
	
}

/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public BentoResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new bento.language.bentocomp.resource.bento.mopp.BentoResource(uri);
	}
	
}

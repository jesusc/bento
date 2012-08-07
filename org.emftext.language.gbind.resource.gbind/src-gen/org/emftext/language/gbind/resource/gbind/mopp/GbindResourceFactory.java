/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

public class GbindResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public GbindResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindResource(uri);
	}
	
}

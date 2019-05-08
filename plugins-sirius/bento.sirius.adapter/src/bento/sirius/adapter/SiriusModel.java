package bento.sirius.adapter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class SiriusModel {

	private Resource resource;

	public SiriusModel(String uri) {
		ResourceSet rs = new ResourceSetImpl();
		this.resource = rs.getResource(URI.createURI(uri), true);
	}
	
	public SiriusModel(Resource siriusResource) {
		this.resource = siriusResource;
	}

	public Resource getResource() {
		return resource;
	}

}

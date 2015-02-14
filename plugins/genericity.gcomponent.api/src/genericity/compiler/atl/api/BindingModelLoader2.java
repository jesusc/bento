package genericity.compiler.atl.api;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class BindingModelLoader2 {
	private URI uri;

	public BindingModelLoader2(String uriString) {
		this.uri = URI.createURI(uriString);
	}
	
	public Resource load() {
		ResourceSet rs = new ResourceSetImpl();		
		Resource r = rs.getResource(uri, true);
		
		return r;
	}
}

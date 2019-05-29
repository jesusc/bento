package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class SiriusModel {

	private Resource resource;
	private Map<EClass, List<EObject>> elements = new HashMap<>();
	
	public SiriusModel(String uri) {
		ResourceSet rs = new ResourceSetImpl();
		this.resource = rs.getResource(URI.createURI(uri), true);
		setup(this.resource);
	}
	
	public SiriusModel(Resource siriusResource) {
		this.resource = siriusResource;
		setup(this.resource);
	}

	public Resource getResource() {
		return resource;
	}
	
	
	
	private void setup(Resource r) {
		TreeIterator<EObject> it = r.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			EClass c = obj.eClass();
			elements.computeIfAbsent(c, (c_) -> new ArrayList<>());
			elements.get(c).add(obj);
		}
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> allInstancesOf(Class<T> c) {
		List<T> result = new ArrayList<T>();
		for (Entry<EClass, List<EObject>> entry : elements.entrySet()) {
			Class<?> k = entry.getKey().getInstanceClass();
			if (c.isAssignableFrom(k)) {
				result.addAll((Collection<? extends T>) entry.getValue());
			}
		}
		
		return result;
	}

}

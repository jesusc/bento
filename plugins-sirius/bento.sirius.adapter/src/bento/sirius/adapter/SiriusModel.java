package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

public class SiriusModel {

	private Resource resource;
	private Map<EClass, List<EObject>> elements = new HashMap<>();
	private Set<EPackage> packages = new HashSet<>();
	
	public SiriusModel(String uri) {
		ResourceSet rs = new ResourceSetImpl();
		this.resource = rs.getResource(URI.createURI(uri), true);
		setup(this.resource);
	}
	
	public SiriusModel(@NonNull Resource siriusResource) {
		this.resource = siriusResource;
		setup(this.resource);
	}

	@NonNull
	public Resource getResource() {
		return resource;
	}

	@NonNull
	public EMFMetamodel getMetamodel() {
		return new EMFMetamodel(packages);
	}
	
	private void setup(Resource r) {
		TreeIterator<EObject> it = r.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof DiagramDescription) {
				DiagramDescription dd = (DiagramDescription) obj;
				packages.addAll(dd.getMetamodel());
			}
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
	
	@Nullable
	public NodeMapping findNodeById(@NonNull String id) {
		return findElement(NodeMapping.class, id);
	}
	
	public void flush() {
		elements.clear();
		setup(resource);
	}

	@Nullable
	public ToolEntry findToolById(@NonNull String id) {
		return findElement(ToolEntry.class, id);
	}
	
	@Nullable
	public DiagramDescription findRoot(@NonNull String id) {
		return findElement(DiagramDescription.class, id);
	}

	@Nullable
	private <T extends IdentifiedElement> T findElement(@NonNull Class<T> klass, @NonNull String id) {
		List<T> elements = allInstancesOf(klass);
		for (T element : elements) {
			if (id.equals(element.getName()))
				return element;
		}
		return null;		
	}
}

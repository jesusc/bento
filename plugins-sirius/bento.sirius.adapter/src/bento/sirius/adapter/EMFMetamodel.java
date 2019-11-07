package bento.sirius.adapter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Represents an EMF meta-model loaded through a resource.
 * 
 * It assumes that class names are unique in all the subpackages.
 * 
 * @author jesus
 *
 */
public class EMFMetamodel {

	@NonNull
	private final Resource resource;
	@NonNull
	private final Map<String, EClass> classes = new HashMap<>();
	
	public EMFMetamodel(@NonNull Resource resource) {
		this.resource = resource;
		load(resource);
	}

	private void load(@NonNull Resource resource) {
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof EClass) {
				EClass c = (EClass) obj;
				classes.put(c.getName(), c);
			}
		}
	}

	@Nullable
	public EClass findEClassOr(@NonNull String className) {
		return classes.get(className);		
	}

	@NonNull
	public EClass findEClass(@NonNull String className) {
		EClass c = findEClassOr(className);
		if (c == null)
			throw new IllegalArgumentException("Class " + className + " not found");
		return c;
	}
	
	
	
}

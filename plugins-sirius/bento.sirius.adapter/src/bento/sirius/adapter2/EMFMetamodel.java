package bento.sirius.adapter2;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
	private final Map<String, EClass> classes = new HashMap<>();
	@NonNull
	private final Map<String, EPackage> packages = new HashMap<>();
	
	public EMFMetamodel(@NonNull Resource resource) {
		load(resource);
	}

	public EMFMetamodel(@NonNull Iterable<? extends EPackage> packages) {
		packages.forEach(this::loadPackage);
	}

	private void load(@NonNull Resource resource) {
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof EPackage) {
				loadPackage((EPackage) obj);
			}
		}
	}
	
	private void loadPackage(@NonNull EPackage pkg) {
		packages.put(pkg.getName(), pkg);
		for (EObject obj : pkg.eContents()) {
			if (obj instanceof EClass) {
				EClass c = (EClass) obj;
				classes.put(c.getName(), c);
			} else if (obj instanceof EPackage) {
				loadPackage((EPackage) obj);
			}
		}
	}

	@NonNull
	public Collection<? extends EPackage> getPackages() {
		return packages.values();
	}
	
	@Nullable
	public EClass findEClassOrNull(@NonNull String className) {
		return classes.get(className);		
	}

	@NonNull
	public EClass findEClass(@NonNull String className) {
		EClass c = findEClassOrNull(className);
		if (c == null)
			throw new IllegalArgumentException("Class " + className + " not found");
		return c;
	}
	
	@Nullable
	public EClass findEClassInPackageOrNull(@NonNull String packageName, @NonNull String className) {
		EPackage pkg = packages.get(packageName);
		if (pkg == null)
			return null;
		return (EClass) pkg.getEClassifier(className);
	}
	
}

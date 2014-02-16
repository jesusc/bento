package genericity.compiler.atl.analyser;

import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Provides convenient functions to retrieve information about a meta-model.
 * 
 * @author jesus
 */
public class MetamodelHelper {

	private Resource	resource;
	private HashMap<String, EClassifier> classifiers = new HashMap<String, EClassifier>();
	
	public MetamodelHelper(Resource resource) {
		this.resource = resource;
		
		TreeIterator<EObject> it = resource.getAllContents();
		while ( it.hasNext() ) {
			EObject obj = it.next();
			
			if ( obj instanceof EClassifier ) {
				EClassifier c = (EClassifier) obj;
				classifiers.put(c.getName(), c);
			}
		}
	}

	/**
	 * Returns a type of the meta-model given its name.
	 * @param name
	 */
	public EClassifier getClassifier(String name) {
		return classifiers.get(name);
	}

}

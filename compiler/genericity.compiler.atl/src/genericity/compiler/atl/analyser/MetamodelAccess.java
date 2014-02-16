package genericity.compiler.atl.analyser;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.resource.Resource;

public class MetamodelAccess {
	HashSet<Resource> resources = new HashSet<Resource>();
	private HashMap<String, MetamodelHelper> namesToMetamodels = new HashMap<String, MetamodelHelper>();
	
	public MetamodelAccess(Collection<Resource> r, HashMap<String, Resource> logicalNamesToMetamodels) {
		for (Resource resource : r) {
			resources.add(resource);
		}
		
		for (String key : logicalNamesToMetamodels.keySet()) {
			namesToMetamodels.put(key, new MetamodelHelper(logicalNamesToMetamodels.get(key)));
		}
	}
	
	public MetamodelHelper getHelper(String name) {
		if ( namesToMetamodels.containsKey(name) ) 
			return namesToMetamodels.get(name);
		
		return null;
	}
	
}

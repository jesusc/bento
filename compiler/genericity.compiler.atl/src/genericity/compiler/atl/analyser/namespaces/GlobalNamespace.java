package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.EcoreTypeConverter;
import genericity.compiler.atl.analyser.ErrorModel;
import genericity.compiler.atl.analyser.TypingModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.resource.Resource;

public class GlobalNamespace {
	private HashSet<Resource> resources = new HashSet<Resource>();
	private HashMap<String, MetamodelNamespace> namesToMetamodels = new HashMap<String, MetamodelNamespace>();
	
	public static final String THIS_MODULE = "thisModule";
	private TransformationNamespace tspace = new TransformationNamespace();
	
	
	public GlobalNamespace(Collection<Resource> r, HashMap<String, Resource> logicalNamesToMetamodels) {
		for (Resource resource : r) {
			resources.add(resource);
		}
		
		for (String key : logicalNamesToMetamodels.keySet()) {
			namesToMetamodels.put(key, new MetamodelNamespace(key, logicalNamesToMetamodels.get(key)));
		}
	}
	
	public TransformationNamespace getTransformationNamespace() {
		return tspace;
	}
	
	public MetamodelNamespace getHelper(String name) {
		if ( namesToMetamodels.containsKey(name) ) 
			return namesToMetamodels.get(name);
		
		return null;
	}

	public void setDependencies(EcoreTypeConverter ecoreTypeConverter, TypingModel typ, ErrorModel errors) {
		for(MetamodelNamespace m : namesToMetamodels.values()) {
			m.setConverter(ecoreTypeConverter);
			m.setErrors(errors);
			m.setTypingModel(typ);
		}		
		tspace.setDependencies(errors);
	}
	
}

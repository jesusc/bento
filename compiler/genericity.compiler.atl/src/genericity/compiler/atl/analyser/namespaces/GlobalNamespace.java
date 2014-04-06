package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.EcoreTypeConverter;
import genericity.compiler.atl.analyser.ErrorModel;
import genericity.compiler.atl.analyser.TypingModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

public class GlobalNamespace {
	private HashSet<Resource> resources = new HashSet<Resource>();
	private HashMap<String, MetamodelNamespace> namesToMetamodels = new HashMap<String, MetamodelNamespace>();
	
	public static final String THIS_MODULE = "thisModule";
	private TransformationNamespace tspace;
	private Map<String, Resource>	logicalNamesToMetamodels;
	
	
	public GlobalNamespace(Collection<Resource> r, HashMap<String, Resource> logicalNamesToMetamodels) {
		for (Resource resource : r) {
			resources.add(resource);
		}
		
		for (String key : logicalNamesToMetamodels.keySet()) {
			namesToMetamodels.put(key, new MetamodelNamespace(key, logicalNamesToMetamodels.get(key)));
		}
		
		this.logicalNamesToMetamodels = Collections.unmodifiableMap(logicalNamesToMetamodels);
	}
	
	public Map<String, Resource> getLogicalNamesToMetamodels() {
		return logicalNamesToMetamodels;
	}
	
	public TransformationNamespace getTransformationNamespace() {
		if ( tspace == null ) {
			tspace  = new TransformationNamespace(); // Lazy initialization to ensure it is created in the thread's context
		}
		return tspace;
	}
	
	public MetamodelNamespace getNamespace(String name) {
		if ( namesToMetamodels.containsKey(name) ) 
			return namesToMetamodels.get(name);
		
		return null;
	}
	
	public List<MetamodelNamespace> getMetamodels() {
		return new ArrayList<MetamodelNamespace>(namesToMetamodels.values());
	}

	public void setDependencies(EcoreTypeConverter ecoreTypeConverter, TypingModel typ, ErrorModel errors) {
		for(MetamodelNamespace m : namesToMetamodels.values()) {
			m.setConverter(ecoreTypeConverter);
			m.setErrors(errors);
			m.setTypingModel(typ);
		}		
	}
	
}

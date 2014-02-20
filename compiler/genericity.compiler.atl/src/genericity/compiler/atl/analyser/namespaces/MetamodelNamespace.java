package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.EcoreTypeConverter;
import genericity.compiler.atl.analyser.ErrorModel;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.Metaclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;

import com.google.common.collect.HashMultimap;

/**
 * Provides convenient functions to retrieve information about a meta-model.
 * 
 * @author jesus
 */
public class MetamodelNamespace implements IMetamodelNamespace {

	private Resource	resource;
	private HashMap<String, ITypeNamespace> classifiers = new HashMap<String, ITypeNamespace>();
	private ArrayList<EClass> allClasses = new ArrayList<EClass>();
	
	// this is just to have a quick look before iterating over superclasses looking for virtual features
	protected Set<String> featureNames = new HashSet<String>(); 
	
	protected EcoreTypeConverter	converter;
	protected ErrorModel	errors;
	protected TypingModel	typ;
	private String	name;
	
	public MetamodelNamespace(String name, Resource resource) {
		this.name     = name;
		this.resource = resource;
		
		TreeIterator<EObject> it = resource.getAllContents();
		while ( it.hasNext() ) {
			EObject obj = it.next();
			
			if ( obj instanceof EClassifier ) {
				EClassifier c = (EClassifier) obj;
				if ( c instanceof EClass ) {
					classifiers.put(c.getName(), new ClassNamespace(this, (EClass) c));
					allClasses.add((EClass) c);
				} else {
					// System.out.println("MetamodelNamespace: Type " + c.getName() + " not supported ");
				}
				
				
				// classifiers.put(c.getName(), c);
			}
		}
	}

	public List<EClass> getAllClasses() {
		return allClasses;
	}
	
	public String getName() {
		return name;
	}
	
	/** 
	 * Sets the converter type converter. Obligatory dependency.
	 * @param ecoreTypeConverter
	 */
	public void setConverter(EcoreTypeConverter ecoreTypeConverter) {
		this.converter = ecoreTypeConverter;
	}
	
	/**
	 * Sets the error model. Obligatory dependency.
	 * @param errors
	 */
	public void setErrors(ErrorModel errors) {
		this.errors = errors;
	}

	/**
	 * Sets the typing model. Obligatory dependency.
	 * @param errors
	 */
	public void setTypingModel(TypingModel typ) {
		this.typ = typ;
	}

	/**
	 * Returns a type of the meta-model given its name.
	 * @param name
	 */
	@Override
	public ITypeNamespace getClassifier(String name) {
		return classifiers.get(name);
	}

	


}

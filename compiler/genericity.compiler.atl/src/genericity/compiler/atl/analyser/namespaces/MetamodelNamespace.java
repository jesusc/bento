package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.EcoreTypeConverter;
import genericity.compiler.atl.analyser.ErrorModel;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.AtlTypingFactory;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.Metaclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
	private ArrayList<EEnum> allEnums= new ArrayList<EEnum>();
	
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
				} else if ( c instanceof EEnum ) {
					allEnums.add((EEnum) c);
				} else {
					// System.out.println("MetamodelNamespace: Type " + c.getName() + " not supported ");
				}
				
				
				// classifiers.put(c.getName(), c);
			}
		}
		
		// To allow cross-references...
		for (EClass eClass : new ArrayList<EClass>(allClasses)) {
			for(EClass sup : eClass.getEAllSuperTypes()) {
				if ( classifiers.containsKey(sup.getName() )) 
					continue;		
				if ( sup.eIsProxy() )
					continue;
				
				classifiers.put(sup.getName(), new ClassNamespace(this, (EClass) sup));				
				allClasses.add(sup);
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
		ITypeNamespace tn = classifiers.get(name);
		return tn;
	}
	
	public Metaclass getMetaclass(EClass c) {
		return ((ClassNamespace) classifiers.get(c.getName())).getType();
	}

	public EnumType findEnumLiteral(String name) {
		for(EEnum eenum : allEnums) {
			EEnumLiteral literal = eenum.getEEnumLiteral(name);
			if ( literal != null ) {
				return typ.createEEnum(eenum);
			}
		}
		
		return null;
		// TODO: Check that the same literal is not repeated... (this is more a meta-model level check)
	}

	public boolean hasClass(EClass klass) {
		return allClasses.contains(klass);
	}

	public Collection<ClassNamespace> getAllSubclasses(EClass eClass) {
		ArrayList<ClassNamespace> result = new ArrayList<ClassNamespace>();
		for (EClass klass : allClasses) {
			if ( klass.getEAllSuperTypes().contains(eClass) ) {
				result.add((ClassNamespace) classifiers.get(klass.getName()));
			}
		}
		return result;
	}

	


}

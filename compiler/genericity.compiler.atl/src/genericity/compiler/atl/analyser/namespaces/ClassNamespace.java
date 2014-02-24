package genericity.compiler.atl.analyser.namespaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;
import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.compiler.atl.analyser.TypeUtils;
import genericity.typing.atl_types.AtlTypingPackage;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.UnknownFeature;

public class ClassNamespace extends AbstractTypeNamespace implements ITypeNamespace {
	private EClass	eClass;
	private MetamodelNamespace	metamodel;
	private HashMap<String, VirtualFeature<ClassNamespace, Attribute>> features = 
			new HashMap<String, VirtualFeature<ClassNamespace, Attribute>>();
	private HashMap<String, VirtualFeature<ClassNamespace, Operation>> operations = 
			new HashMap<String, VirtualFeature<ClassNamespace, Operation>>();
	private Metaclass	theType;

	
	public ClassNamespace(MetamodelNamespace metamodel, EClass eclass) {
		this.eClass = eclass;
		this.metamodel = metamodel;
	}


	public String getMetamodelName() {
		return this.metamodel.getName();
	}
	
	@Override
	public boolean hasFeature(String featureName) {
		return getExtendedFeature(featureName) != null ||
				 eClass.getEStructuralFeature(featureName) != null;
	}	
	
	public Type getFeature(String featureName, LocatedElement node) {
		Type t = getExtendedFeature(featureName);
		if ( t != null) 
			return t;
		
		EStructuralFeature f = eClass.getEStructuralFeature(featureName);
		if ( f == null ) {
			return tryRecovery(featureName, node);
		}
		
		return metamodel.converter.convert(f, metamodel);
	}


	private Type getExtendedFeature(String featureName) {
		if ( metamodel.featureNames.contains(featureName) ) {
			if ( features.containsKey(featureName) ) {
				return features.get(featureName).returnType;
			}

			for (EClass supertype : eClass.getEAllSuperTypes()) {
				ClassNamespace cn = (ClassNamespace) metamodel.getClassifier(supertype.getName());
				if ( cn.features.containsKey(featureName) ) {
					return cn.features.get(featureName).returnType;
				}
			}
		}
		return null;
	}
	
	private Type tryRecovery(String featureName, LocatedElement node) {
		List<EClass> allClasses = metamodel.getAllClasses();
		for (EClass subtype : allClasses) {
			// Es un subtipo 
			if (subtype.getEAllSuperTypes().contains(eClass)) {
				EStructuralFeature f = subtype.getEStructuralFeature(featureName);
				if (f != null) {
					// lastNavigatedFeature = f;
					Metaclass t = (Metaclass) metamodel.getClassifier(subtype.getName()).createType(false);
					metamodel.errors.warningFeatureFoundInSubType(getType(), t, featureName, node);
					return metamodel.converter.convert(f, metamodel);
				}
			}
		
		}
		
		/**

			// The feature not found in subclasses
			if (t == null) {
				UnknownFeature unknown = (UnknownFeature) types.createObject(UnknownFeature.class.getSimpleName());
				unknown.setTheContainingClass(clazz);
				unknown.setName(featureName);
				unknown.setEType(AtlTypingPackage.Literals.UNKNOWN);

				lastNavigatedFeature = unknown;
				t = (Type) types.createObject(Unknown.class.getSimpleName());
				
				errorMessage = errorMessage + ". Recovery tried by setting UnknownFeature.";
			}
			return signalError(errorMessage, location, t);
		}
		 */
		metamodel.errors.signalNoFeature(eClass, featureName, node);
		
		// TODO: Try to recover
		return null;
	}

	/**
	 * Extends the meta-model 
	 * 
	 * @param class
	 * @param featureName
	 * @param attrDefinition 
	 * @param type 
	 */
	@Override
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		features.put(featureName, new VirtualFeature<ClassNamespace, Attribute>(this, featureName, returnType, attrDefinition));
		metamodel.featureNames.add(featureName);
	}

	@Override
	public void extendType(String operationName, Type returnType, Operation opDefinition) {
		operations.put(operationName, new VirtualFeature<ClassNamespace, Operation>(this, operationName, returnType, opDefinition));
	}
	
	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return operations.containsKey(operationName);
	}
	
	protected Metaclass getType() {
		if ( this.theType == null )
			this.theType = (Metaclass) createType(true);		
		return this.theType;
	}
	
	@Override
	public Type createType(boolean explicitOcurrence) {
		// TODO: Not sure if this should cache the result... to have only one type
		// per metaclass
		
		Metaclass m = metamodel.converter.convertEClass(eClass, this);
		m.setExplicitOcurrence(explicitOcurrence);
		return m;
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		Type t = super.getOperationType(operationName, arguments, node);
		if ( t != null ) {
			return t;
		}
		
		if ( operationName.equals("allInstances") || operationName.equals("allInstancesFrom") ) {
			return metamodel.converter.convertAllInstancesOf(eClass, this);
		} else if ( operationName.equals("oclIsKindOf") || 
					operationName.equals("oclIsTypeOf")) {
			// TODO: Mark the boolean type so that it carries the "isKindOf" information
			return metamodel.typ.newBooleanType();
		} else if ( operationName.equals("oclIsUndefined") ) {
			return metamodel.typ.newBooleanType();
		} else if ( operationName.equals("oclType") ) {
			return metamodel.typ.newOclType();
		} else if ( operationName.equals("refImmediateComposite") ) {
			return findTypeOfContainer(node);
		}
		
		if ( this.hasOperation(operationName, arguments) ) {
			return operations.get(operationName).returnType;
		}
		
		
		// Not sure this is totally valid because of the traversal order
		EList<EClass> supertypes = eClass.getEAllSuperTypes();
		for (EClass c : supertypes) {
			ITypeNamespace n = metamodel.getClassifier(c.getName());
			if ( n.hasOperation(operationName, arguments) ){
				return n.getOperationType(operationName, arguments, node);
			}			
		}
		
		metamodel.errors.signalNoOperationFound(getType(), operationName, node);
		return null;
	}

	/**
	 * Implements the algorithm to find the container(s) that may hold
	 * the an object of the class when invoking "refImmediateComposite".
	 * 
	 * @param node
	 * @return
	 */
	private Type findTypeOfContainer(LocatedElement node) {
		ArrayList<EClass> possibleContainers = new ArrayList<EClass>();
		
		List<EClass> classes = metamodel.getAllClasses();
		for (EClass c : classes) {
			for(EReference r : c.getEReferences()) {
				if ( r.isContainment() ) {
					if ( r.getEReferenceType() == eClass || 
						 eClass.isSuperTypeOf(r.getEReferenceType()) || // This is to select every possible "pointed" subclass
						 r.getEReferenceType().isSuperTypeOf(eClass)    // This is the normaly polymorphic checking
					) {
						
						possibleContainers.add(r.getEContainingClass());
					}
				}
			}
		}
		
		if ( possibleContainers.size() == 0 ) {
			// TODO: How to recover from a not having a container???
			AnalyserContext.getErrorModel().signalNoContainerForRefImmediateComposite(getType(), node);
		} else if ( possibleContainers.size() == 1 ) {
			return metamodel.getMetaclass(possibleContainers.get(0));
		} else {
			Type t1 = metamodel.getMetaclass(possibleContainers.get(0));
			for(int i = 1; i < possibleContainers.size(); i++) {
				Type t2 = metamodel.getMetaclass(possibleContainers.get(i));
 				t1 = AnalyserContext.getTypingModel().getCommonType(t1, t2);
			}
			
			// throw new UnsupportedOperationException("TODO: For objects that may be contained in multiple classes, signal warning and return a union type");
			return t1;
		}
		throw new IllegalStateException(); // This should not happen (the compiler seems not see it...)
	}


	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		throw new UnsupportedOperationException("No symbol " + operatorSymbol + " supported");
	}


	@Override
	public void extendType(String ruleName, Type returnType, Rule rule) {
		throw new UnsupportedOperationException("TODO: ATTACH MATCHED RULES TO TYPES");
	}


	
}

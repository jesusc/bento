package genericity.compiler.atl.analyser.namespaces;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;
import genericity.typing.atl_types.AtlTypingPackage;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.UnknownFeature;

public class ClassNamespace implements ITypeNamespace {
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

	
	public Type getFeature(String featureName, LocatedElement node) {

		if ( metamodel.featureNames.contains(featureName) ) {
			throw new UnsupportedOperationException();
			// ITERATE OVER ALL SUPERCLASSES, CHECKING IF THE THERE IS A VIRTUAL FEATURE
			/*
			if ( virtualFeatures.containsKey(m..getKlass()) ) {
				Set<VirtualFeature<Metaclass>> features = virtualFeatures.get(m.eClass());
				for (VirtualFeature<Metaclass> virtualFeature : features) {
					
				}
			}
			*/
		}
		
		EStructuralFeature f = eClass.getEStructuralFeature(featureName);
		if ( f == null ) {
			return tryRecovery(featureName, node);
		}
		
		return metamodel.converter.convert(f, metamodel);
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
		if ( operationName.equals("allInstances") ) {
			return metamodel.converter.convertAllInstancesOf(eClass, this);
		} else if ( operationName.equals("oclIsKindOf") || 
					operationName.equals("oclIsTypeOf")) {
			// TODO: Mark the boolean type so that it carries the "isKindOf" information
			return metamodel.typ.newBooleanType();
		} else if ( operationName.equals("oclIsUndefined") ) {
			return metamodel.typ.newBooleanType();
		} else if ( operationName.equals("oclType") ) {
			return metamodel.typ.newOclType();
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

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		throw new UnsupportedOperationException("No symbol " + operatorSymbol + " supported");
	}

	

	
	
}

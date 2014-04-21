package genericity.compiler.atl.analyser.namespaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import bento.analysis.atl_analysis.atl_error.LocalProblem;

import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.OclFeature;
import atl.metamodel.OCL.Operation;
import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.compiler.atl.analyser.ErrorModel;
import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.analyser.recovery.IRecoveryAction;
import genericity.compiler.atl.analyser.recovery.RecoverOperationNotFound;
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


	public EStructuralFeature getFeatureInfo(String featureName) {
		return eClass.getEStructuralFeature(featureName);
	}
	
	public Type getFeatureType(String featureName, LocatedElement node) {
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
				if ( supertype.eIsProxy() ) {
					continue; // TODO: Don't know how to deal with proxies...
				}
				
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
				
				// Check extended features
				ClassNamespace cn = (ClassNamespace) metamodel.getClassifier(subtype.getName());
				if ( cn.hasFeature(featureName)) {
					metamodel.errors.warningFeatureFoundInSubType(getType(), cn.getType(), featureName, node);
					return cn.getFeatureType(featureName, node);
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
		
		return metamodel.errors.signalNoFeature(eClass, featureName, node);
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
		if ( super.hasOperation(operationName, arguments) )
			return true;
		if ( operationName.equals("allInstances") || operationName.equals("allInstancesFrom") ) 
			return true;

		return operations.containsKey(operationName);
	}
	
	public Operation getAttachedOperation(String operationName) {
		return operations.get(operationName).definition;
	}

	public boolean hasAttachedOperation(String operationName) {
		return operations.containsKey(operationName);
	}
	
	@Override
	public OclFeature getAttachedOclFeature(String attributeOrOperationName) {
		VirtualFeature<ClassNamespace, ? extends OclFeature> vf = operations.get(attributeOrOperationName);
		if ( vf == null ) {
			vf = features.get(attributeOrOperationName);
		}
		return vf == null ? null : vf.definition;
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
		} else if ( operationName.equals("oclIsUndefined") ) {
			return metamodel.typ.newBooleanType();
		} else if ( operationName.equals("oclType") ) {
			return metamodel.typ.newOclType();
		} else if ( operationName.equals("refImmediateComposite") ) {
			return findTypeOfContainer(node);
		} else if ( operationName.equals("refSetValue") ) {
			return getType(); // returns itself
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

		t = tryRecoveryGetOperation(operationName, arguments, node);
		if ( t != null ) {
			return t;
		}

		return metamodel.errors.signalNoOperationFound(getType(), operationName, node, 
				new RecoverOperationNotFound(this, operationName, node));
	}
	
	private Type tryRecoveryGetOperation(String operationName, Type[] arguments, LocatedElement node) {
		List<EClass> allClasses = metamodel.getAllClasses();
		for (EClass subtype : allClasses) {
			// Es un subtipo 
			if (subtype.getEAllSuperTypes().contains(eClass)) {
				ClassNamespace cn = (ClassNamespace) metamodel.getClassifier(subtype.getName());
				if ( cn.hasOperation(operationName, arguments)) {
					metamodel.errors.warningOperationFoundInSubType(getType(), cn.getType(), operationName, node);
					return cn.getOperationType(operationName, arguments, node);
				}		
			}
		}
		
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
			ArrayList<Type> containerTypes = new ArrayList<Type>();
			for(int i = 0; i < possibleContainers.size(); i++) {
				containerTypes.add(metamodel.getMetaclass(possibleContainers.get(i)));
			}

			return AnalyserContext.getTypingModel().getCommonType(containerTypes);
		}
		throw new IllegalStateException(); // This should not happen (the compiler seems not see it...)
	}


	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		if ( operatorSymbol.equals("=") || operatorSymbol.equals("<>") ) {
			return AnalyserContext.getTypingModel().newBooleanType();
		}
		
		throw new UnsupportedOperationException("No symbol " + operatorSymbol + " supported");
	}


	private ArrayList<MatchedRule> attachedRules = new ArrayList<MatchedRule>();

	@Override
	public void extendType(String ruleName, Type returnType, Rule rule) {
		if ( ! (rule instanceof MatchedRule) ) throw new IllegalArgumentException();
		
		attachedRules.add((MatchedRule) rule);
		
		for(EClass c : eClass.getESuperTypes()) {
			if ( c.eIsProxy() ) { 
				// TODO: Handle this: System.out.println("WARNING: Ignoring proxy (extendType, ClassNamespace)"); 
				continue; 
			}
			
			ClassNamespace ns = (ClassNamespace) metamodel.getClassifier(c.getName());
			ns.extendType(ruleName, returnType, rule);
		}
	}

	public List<MatchedRule> getAttachedRules() {
		return attachedRules;
	}


	public Collection<ClassNamespace> getAllSubclasses() {
		return metamodel.getAllSubclasses(eClass);
	}
}

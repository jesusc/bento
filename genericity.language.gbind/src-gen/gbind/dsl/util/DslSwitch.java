/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.util;

import gbind.dsl.*;

import gbind.simpleocl.LocatedElement;
import gbind.simpleocl.NamedElement;
import gbind.simpleocl.OclMetamodel;
import gbind.simpleocl.OclModel;
import gbind.simpleocl.VariableDeclaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gbind.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslSwitch() {
		if (modelPackage == null) {
			modelPackage = DslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DslPackage.BINDING_MODEL: {
				BindingModel bindingModel = (BindingModel)theEObject;
				T result = caseBindingModel(bindingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.METAMODEL_DECLARATION: {
				MetamodelDeclaration metamodelDeclaration = (MetamodelDeclaration)theEObject;
				T result = caseMetamodelDeclaration(metamodelDeclaration);
				if (result == null) result = caseOclMetamodel(metamodelDeclaration);
				if (result == null) result = caseOclModel(metamodelDeclaration);
				if (result == null) result = caseNamedElement(metamodelDeclaration);
				if (result == null) result = caseLocatedElement(metamodelDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.METACLASS: {
				Metaclass metaclass = (Metaclass)theEObject;
				T result = caseMetaclass(metaclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CONCEPT_METACLASS: {
				ConceptMetaclass conceptMetaclass = (ConceptMetaclass)theEObject;
				T result = caseConceptMetaclass(conceptMetaclass);
				if (result == null) result = caseMetaclass(conceptMetaclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CONCRETE_METACLASS: {
				ConcreteMetaclass concreteMetaclass = (ConcreteMetaclass)theEObject;
				T result = caseConcreteMetaclass(concreteMetaclass);
				if (result == null) result = caseMetaclass(concreteMetaclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CONCEPT_BINDING: {
				ConceptBinding conceptBinding = (ConceptBinding)theEObject;
				T result = caseConceptBinding(conceptBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CLASS_BINDING: {
				ClassBinding classBinding = (ClassBinding)theEObject;
				T result = caseClassBinding(classBinding);
				if (result == null) result = caseConceptBinding(classBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.INTERMEDIATE_CLASS_BINDING: {
				IntermediateClassBinding intermediateClassBinding = (IntermediateClassBinding)theEObject;
				T result = caseIntermediateClassBinding(intermediateClassBinding);
				if (result == null) result = caseConceptBinding(intermediateClassBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CONCRETE_REFERENC_DECLARING_VAR: {
				ConcreteReferencDeclaringVar concreteReferencDeclaringVar = (ConcreteReferencDeclaringVar)theEObject;
				T result = caseConcreteReferencDeclaringVar(concreteReferencDeclaringVar);
				if (result == null) result = caseVariableDeclaration(concreteReferencDeclaringVar);
				if (result == null) result = caseLocatedElement(concreteReferencDeclaringVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.VIRTUAL_METACLASS: {
				VirtualMetaclass virtualMetaclass = (VirtualMetaclass)theEObject;
				T result = caseVirtualMetaclass(virtualMetaclass);
				if (result == null) result = caseMetaclass(virtualMetaclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.VIRTUAL_FEATURE: {
				VirtualFeature virtualFeature = (VirtualFeature)theEObject;
				T result = caseVirtualFeature(virtualFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.VIRTUAL_REFERENCE: {
				VirtualReference virtualReference = (VirtualReference)theEObject;
				T result = caseVirtualReference(virtualReference);
				if (result == null) result = caseVirtualFeature(virtualReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.VIRTUAL_ATTRIBUTE: {
				VirtualAttribute virtualAttribute = (VirtualAttribute)theEObject;
				T result = caseVirtualAttribute(virtualAttribute);
				if (result == null) result = caseVirtualFeature(virtualAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.VIRTUAL_CLASS_BINDING: {
				VirtualClassBinding virtualClassBinding = (VirtualClassBinding)theEObject;
				T result = caseVirtualClassBinding(virtualClassBinding);
				if (result == null) result = caseConceptBinding(virtualClassBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CONCEPT_FEATURE_REF: {
				ConceptFeatureRef conceptFeatureRef = (ConceptFeatureRef)theEObject;
				T result = caseConceptFeatureRef(conceptFeatureRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.BASE_FEATURE_BINDING: {
				BaseFeatureBinding baseFeatureBinding = (BaseFeatureBinding)theEObject;
				T result = caseBaseFeatureBinding(baseFeatureBinding);
				if (result == null) result = caseConceptBinding(baseFeatureBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.RENAMING_FEATURE_BINDING: {
				RenamingFeatureBinding renamingFeatureBinding = (RenamingFeatureBinding)theEObject;
				T result = caseRenamingFeatureBinding(renamingFeatureBinding);
				if (result == null) result = caseBaseFeatureBinding(renamingFeatureBinding);
				if (result == null) result = caseConceptBinding(renamingFeatureBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.OCL_FEATURE_BINDING: {
				OclFeatureBinding oclFeatureBinding = (OclFeatureBinding)theEObject;
				T result = caseOclFeatureBinding(oclFeatureBinding);
				if (result == null) result = caseBaseFeatureBinding(oclFeatureBinding);
				if (result == null) result = caseConceptBinding(oclFeatureBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.BASE_HELPER: {
				BaseHelper baseHelper = (BaseHelper)theEObject;
				T result = caseBaseHelper(baseHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.CONCEPT_HELPER: {
				ConceptHelper conceptHelper = (ConceptHelper)theEObject;
				T result = caseConceptHelper(conceptHelper);
				if (result == null) result = caseBaseHelper(conceptHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.LOCAL_HELPER: {
				LocalHelper localHelper = (LocalHelper)theEObject;
				T result = caseLocalHelper(localHelper);
				if (result == null) result = caseBaseHelper(localHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPackage.HELPER_PARAMETER: {
				HelperParameter helperParameter = (HelperParameter)theEObject;
				T result = caseHelperParameter(helperParameter);
				if (result == null) result = caseVariableDeclaration(helperParameter);
				if (result == null) result = caseLocatedElement(helperParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingModel(BindingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelDeclaration(MetamodelDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metaclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metaclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaclass(Metaclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Metaclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Metaclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptMetaclass(ConceptMetaclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Metaclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Metaclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteMetaclass(ConcreteMetaclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptBinding(ConceptBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassBinding(ClassBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Class Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Class Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateClassBinding(IntermediateClassBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Referenc Declaring Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Referenc Declaring Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteReferencDeclaringVar(ConcreteReferencDeclaringVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Metaclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Metaclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMetaclass(VirtualMetaclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualFeature(VirtualFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualReference(VirtualReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualAttribute(VirtualAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Class Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Class Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualClassBinding(VirtualClassBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Feature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Feature Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptFeatureRef(ConceptFeatureRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Feature Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Feature Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseFeatureBinding(BaseFeatureBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renaming Feature Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renaming Feature Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenamingFeatureBinding(RenamingFeatureBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Feature Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Feature Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOclFeatureBinding(OclFeatureBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseHelper(BaseHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptHelper(ConceptHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalHelper(LocalHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelperParameter(HelperParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOclModel(OclModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOclMetamodel(OclMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DslSwitch

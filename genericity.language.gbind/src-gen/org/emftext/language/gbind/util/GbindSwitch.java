/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.gbind.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.gbind.*;

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
 * @see org.emftext.language.gbind.GbindPackage
 * @generated
 */
public class GbindSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GbindPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GbindSwitch() {
		if (modelPackage == null) {
			modelPackage = GbindPackage.eINSTANCE;
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
			case GbindPackage.BINDING_MODEL: {
				BindingModel bindingModel = (BindingModel)theEObject;
				T result = caseBindingModel(bindingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.METACLASS: {
				Metaclass metaclass = (Metaclass)theEObject;
				T result = caseMetaclass(metaclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.CONCEPT_METACLASS: {
				ConceptMetaclass conceptMetaclass = (ConceptMetaclass)theEObject;
				T result = caseConceptMetaclass(conceptMetaclass);
				if (result == null) result = caseMetaclass(conceptMetaclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.CONCRETE_METACLASS: {
				ConcreteMetaclass concreteMetaclass = (ConcreteMetaclass)theEObject;
				T result = caseConcreteMetaclass(concreteMetaclass);
				if (result == null) result = caseMetaclass(concreteMetaclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.CONCEPT_BINDING: {
				ConceptBinding conceptBinding = (ConceptBinding)theEObject;
				T result = caseConceptBinding(conceptBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.CLASS_BINDING: {
				ClassBinding classBinding = (ClassBinding)theEObject;
				T result = caseClassBinding(classBinding);
				if (result == null) result = caseConceptBinding(classBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.BASE_FEATURE_BINDING: {
				BaseFeatureBinding baseFeatureBinding = (BaseFeatureBinding)theEObject;
				T result = caseBaseFeatureBinding(baseFeatureBinding);
				if (result == null) result = caseConceptBinding(baseFeatureBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.RENAMING_FEATURE_BINDING: {
				RenamingFeatureBinding renamingFeatureBinding = (RenamingFeatureBinding)theEObject;
				T result = caseRenamingFeatureBinding(renamingFeatureBinding);
				if (result == null) result = caseBaseFeatureBinding(renamingFeatureBinding);
				if (result == null) result = caseConceptBinding(renamingFeatureBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.OCL_FEATURE_BINDING: {
				OclFeatureBinding oclFeatureBinding = (OclFeatureBinding)theEObject;
				T result = caseOclFeatureBinding(oclFeatureBinding);
				if (result == null) result = caseBaseFeatureBinding(oclFeatureBinding);
				if (result == null) result = caseConceptBinding(oclFeatureBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.BASE_HELPER: {
				BaseHelper baseHelper = (BaseHelper)theEObject;
				T result = caseBaseHelper(baseHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.CONCEPT_HELPER: {
				ConceptHelper conceptHelper = (ConceptHelper)theEObject;
				T result = caseConceptHelper(conceptHelper);
				if (result == null) result = caseBaseHelper(conceptHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GbindPackage.LOCAL_HELPER: {
				LocalHelper localHelper = (LocalHelper)theEObject;
				T result = caseLocalHelper(localHelper);
				if (result == null) result = caseBaseHelper(localHelper);
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

} //GbindSwitch

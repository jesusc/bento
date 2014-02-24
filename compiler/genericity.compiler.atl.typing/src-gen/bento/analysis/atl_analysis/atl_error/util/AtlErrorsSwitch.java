/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error.util;

import bento.analysis.atl_analysis.AnalysisInfo;
import bento.analysis.atl_analysis.Problem;

import bento.analysis.atl_analysis.atl_error.*;

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
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage
 * @generated
 */
public class AtlErrorsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtlErrorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlErrorsSwitch() {
		if (modelPackage == null) {
			modelPackage = AtlErrorsPackage.eINSTANCE;
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
			case AtlErrorsPackage.LOCAL_PROBLEM: {
				LocalProblem localProblem = (LocalProblem)theEObject;
				T result = caseLocalProblem(localProblem);
				if (result == null) result = caseProblem(localProblem);
				if (result == null) result = caseAnalysisInfo(localProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.NAVIGATION_PROBLEM: {
				NavigationProblem navigationProblem = (NavigationProblem)theEObject;
				T result = caseNavigationProblem(navigationProblem);
				if (result == null) result = caseLocalProblem(navigationProblem);
				if (result == null) result = caseProblem(navigationProblem);
				if (result == null) result = caseAnalysisInfo(navigationProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.INVALID_ARGUMENT_PROBLEM: {
				InvalidArgumentProblem invalidArgumentProblem = (InvalidArgumentProblem)theEObject;
				T result = caseInvalidArgumentProblem(invalidArgumentProblem);
				if (result == null) result = caseLocalProblem(invalidArgumentProblem);
				if (result == null) result = caseProblem(invalidArgumentProblem);
				if (result == null) result = caseAnalysisInfo(invalidArgumentProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR: {
				CollectionOperationOverNoCollectionError collectionOperationOverNoCollectionError = (CollectionOperationOverNoCollectionError)theEObject;
				T result = caseCollectionOperationOverNoCollectionError(collectionOperationOverNoCollectionError);
				if (result == null) result = caseNavigationProblem(collectionOperationOverNoCollectionError);
				if (result == null) result = caseLocalProblem(collectionOperationOverNoCollectionError);
				if (result == null) result = caseProblem(collectionOperationOverNoCollectionError);
				if (result == null) result = caseAnalysisInfo(collectionOperationOverNoCollectionError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.FEATURE_NOT_FOUND: {
				FeatureNotFound featureNotFound = (FeatureNotFound)theEObject;
				T result = caseFeatureNotFound(featureNotFound);
				if (result == null) result = caseNavigationProblem(featureNotFound);
				if (result == null) result = caseLocalProblem(featureNotFound);
				if (result == null) result = caseProblem(featureNotFound);
				if (result == null) result = caseAnalysisInfo(featureNotFound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.INVALID_OPERAND: {
				InvalidOperand invalidOperand = (InvalidOperand)theEObject;
				T result = caseInvalidOperand(invalidOperand);
				if (result == null) result = caseInvalidArgumentProblem(invalidOperand);
				if (result == null) result = caseLocalProblem(invalidOperand);
				if (result == null) result = caseProblem(invalidOperand);
				if (result == null) result = caseAnalysisInfo(invalidOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE: {
				NoContainerForRefImmediateComposite noContainerForRefImmediateComposite = (NoContainerForRefImmediateComposite)theEObject;
				T result = caseNoContainerForRefImmediateComposite(noContainerForRefImmediateComposite);
				if (result == null) result = caseNavigationProblem(noContainerForRefImmediateComposite);
				if (result == null) result = caseLocalProblem(noContainerForRefImmediateComposite);
				if (result == null) result = caseProblem(noContainerForRefImmediateComposite);
				if (result == null) result = caseAnalysisInfo(noContainerForRefImmediateComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalProblem(LocalProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationProblem(NavigationProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Argument Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Argument Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidArgumentProblem(InvalidArgumentProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Operation Over No Collection Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Operation Over No Collection Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionOperationOverNoCollectionError(CollectionOperationOverNoCollectionError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Not Found</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Not Found</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureNotFound(FeatureNotFound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidOperand(InvalidOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Container For Ref Immediate Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Container For Ref Immediate Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoContainerForRefImmediateComposite(NoContainerForRefImmediateComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisInfo(AnalysisInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblem(Problem object) {
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

} //AtlErrorsSwitch

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
			case AtlErrorsPackage.TARGET_MODEL_CONFORMANCE_PROBLEM: {
				TargetModelConformanceProblem targetModelConformanceProblem = (TargetModelConformanceProblem)theEObject;
				T result = caseTargetModelConformanceProblem(targetModelConformanceProblem);
				if (result == null) result = caseLocalProblem(targetModelConformanceProblem);
				if (result == null) result = caseProblem(targetModelConformanceProblem);
				if (result == null) result = caseAnalysisInfo(targetModelConformanceProblem);
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
			case AtlErrorsPackage.OPERATION_NOT_FOUND: {
				OperationNotFound operationNotFound = (OperationNotFound)theEObject;
				T result = caseOperationNotFound(operationNotFound);
				if (result == null) result = caseNavigationProblem(operationNotFound);
				if (result == null) result = caseLocalProblem(operationNotFound);
				if (result == null) result = caseProblem(operationNotFound);
				if (result == null) result = caseAnalysisInfo(operationNotFound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.FEATURE_NOT_FOUND_IN_UNION_TYPE: {
				FeatureNotFoundInUnionType featureNotFoundInUnionType = (FeatureNotFoundInUnionType)theEObject;
				T result = caseFeatureNotFoundInUnionType(featureNotFoundInUnionType);
				if (result == null) result = caseNavigationProblem(featureNotFoundInUnionType);
				if (result == null) result = caseLocalProblem(featureNotFoundInUnionType);
				if (result == null) result = caseProblem(featureNotFoundInUnionType);
				if (result == null) result = caseAnalysisInfo(featureNotFoundInUnionType);
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
			case AtlErrorsPackage.DIFFERENT_BRANCH_TYPES: {
				DifferentBranchTypes differentBranchTypes = (DifferentBranchTypes)theEObject;
				T result = caseDifferentBranchTypes(differentBranchTypes);
				if (result == null) result = caseNavigationProblem(differentBranchTypes);
				if (result == null) result = caseLocalProblem(differentBranchTypes);
				if (result == null) result = caseProblem(differentBranchTypes);
				if (result == null) result = caseAnalysisInfo(differentBranchTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.BINDING_PROBLEM: {
				BindingProblem bindingProblem = (BindingProblem)theEObject;
				T result = caseBindingProblem(bindingProblem);
				if (result == null) result = caseLocalProblem(bindingProblem);
				if (result == null) result = caseProblem(bindingProblem);
				if (result == null) result = caseAnalysisInfo(bindingProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.NO_BINDING_FOR_COMPULSORY_FEATURE: {
				NoBindingForCompulsoryFeature noBindingForCompulsoryFeature = (NoBindingForCompulsoryFeature)theEObject;
				T result = caseNoBindingForCompulsoryFeature(noBindingForCompulsoryFeature);
				if (result == null) result = caseTargetModelConformanceProblem(noBindingForCompulsoryFeature);
				if (result == null) result = caseBindingProblem(noBindingForCompulsoryFeature);
				if (result == null) result = caseLocalProblem(noBindingForCompulsoryFeature);
				if (result == null) result = caseProblem(noBindingForCompulsoryFeature);
				if (result == null) result = caseAnalysisInfo(noBindingForCompulsoryFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.BINDING_EXPECTED_ONE_ASSIGNED_MANY: {
				BindingExpectedOneAssignedMany bindingExpectedOneAssignedMany = (BindingExpectedOneAssignedMany)theEObject;
				T result = caseBindingExpectedOneAssignedMany(bindingExpectedOneAssignedMany);
				if (result == null) result = caseBindingProblem(bindingExpectedOneAssignedMany);
				if (result == null) result = caseLocalProblem(bindingExpectedOneAssignedMany);
				if (result == null) result = caseProblem(bindingExpectedOneAssignedMany);
				if (result == null) result = caseAnalysisInfo(bindingExpectedOneAssignedMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.FLATTEN_OVER_NON_NESTED_COLLECTION: {
				FlattenOverNonNestedCollection flattenOverNonNestedCollection = (FlattenOverNonNestedCollection)theEObject;
				T result = caseFlattenOverNonNestedCollection(flattenOverNonNestedCollection);
				if (result == null) result = caseLocalProblem(flattenOverNonNestedCollection);
				if (result == null) result = caseProblem(flattenOverNonNestedCollection);
				if (result == null) result = caseAnalysisInfo(flattenOverNonNestedCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtlErrorsPackage.ITERATOR_OVER_EMPTY_SEQUENCE: {
				IteratorOverEmptySequence iteratorOverEmptySequence = (IteratorOverEmptySequence)theEObject;
				T result = caseIteratorOverEmptySequence(iteratorOverEmptySequence);
				if (result == null) result = caseLocalProblem(iteratorOverEmptySequence);
				if (result == null) result = caseProblem(iteratorOverEmptySequence);
				if (result == null) result = caseAnalysisInfo(iteratorOverEmptySequence);
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
	 * Returns the result of interpreting the object as an instance of '<em>Target Model Conformance Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Model Conformance Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetModelConformanceProblem(TargetModelConformanceProblem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operation Not Found</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Not Found</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationNotFound(OperationNotFound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Not Found In Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Not Found In Union Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureNotFoundInUnionType(FeatureNotFoundInUnionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Different Branch Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Different Branch Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifferentBranchTypes(DifferentBranchTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingProblem(BindingProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Binding For Compulsory Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Binding For Compulsory Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoBindingForCompulsoryFeature(NoBindingForCompulsoryFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Expected One Assigned Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Expected One Assigned Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingExpectedOneAssignedMany(BindingExpectedOneAssignedMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flatten Over Non Nested Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flatten Over Non Nested Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlattenOverNonNestedCollection(FlattenOverNonNestedCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Over Empty Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Over Empty Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorOverEmptySequence(IteratorOverEmptySequence object) {
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

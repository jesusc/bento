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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage
 * @generated
 */
public class AtlErrorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtlErrorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlErrorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AtlErrorsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtlErrorsSwitch<Adapter> modelSwitch =
		new AtlErrorsSwitch<Adapter>() {
			@Override
			public Adapter caseLocalProblem(LocalProblem object) {
				return createLocalProblemAdapter();
			}
			@Override
			public Adapter caseNavigationProblem(NavigationProblem object) {
				return createNavigationProblemAdapter();
			}
			@Override
			public Adapter caseInvalidArgumentProblem(InvalidArgumentProblem object) {
				return createInvalidArgumentProblemAdapter();
			}
			@Override
			public Adapter caseTargetModelConformanceProblem(TargetModelConformanceProblem object) {
				return createTargetModelConformanceProblemAdapter();
			}
			@Override
			public Adapter caseCollectionOperationOverNoCollectionError(CollectionOperationOverNoCollectionError object) {
				return createCollectionOperationOverNoCollectionErrorAdapter();
			}
			@Override
			public Adapter caseFeatureNotFound(FeatureNotFound object) {
				return createFeatureNotFoundAdapter();
			}
			@Override
			public Adapter caseOperationNotFound(OperationNotFound object) {
				return createOperationNotFoundAdapter();
			}
			@Override
			public Adapter caseFeatureNotFoundInUnionType(FeatureNotFoundInUnionType object) {
				return createFeatureNotFoundInUnionTypeAdapter();
			}
			@Override
			public Adapter caseInvalidOperand(InvalidOperand object) {
				return createInvalidOperandAdapter();
			}
			@Override
			public Adapter caseNoContainerForRefImmediateComposite(NoContainerForRefImmediateComposite object) {
				return createNoContainerForRefImmediateCompositeAdapter();
			}
			@Override
			public Adapter caseDifferentBranchTypes(DifferentBranchTypes object) {
				return createDifferentBranchTypesAdapter();
			}
			@Override
			public Adapter caseBindingProblem(BindingProblem object) {
				return createBindingProblemAdapter();
			}
			@Override
			public Adapter caseNoBindingForCompulsoryFeature(NoBindingForCompulsoryFeature object) {
				return createNoBindingForCompulsoryFeatureAdapter();
			}
			@Override
			public Adapter caseBindingExpectedOneAssignedMany(BindingExpectedOneAssignedMany object) {
				return createBindingExpectedOneAssignedManyAdapter();
			}
			@Override
			public Adapter caseFlattenOverNonNestedCollection(FlattenOverNonNestedCollection object) {
				return createFlattenOverNonNestedCollectionAdapter();
			}
			@Override
			public Adapter caseAnalysisInfo(AnalysisInfo object) {
				return createAnalysisInfoAdapter();
			}
			@Override
			public Adapter caseProblem(Problem object) {
				return createProblemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.LocalProblem <em>Local Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.LocalProblem
	 * @generated
	 */
	public Adapter createLocalProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.NavigationProblem <em>Navigation Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.NavigationProblem
	 * @generated
	 */
	public Adapter createNavigationProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.InvalidArgumentProblem <em>Invalid Argument Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.InvalidArgumentProblem
	 * @generated
	 */
	public Adapter createInvalidArgumentProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.TargetModelConformanceProblem <em>Target Model Conformance Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.TargetModelConformanceProblem
	 * @generated
	 */
	public Adapter createTargetModelConformanceProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError <em>Collection Operation Over No Collection Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError
	 * @generated
	 */
	public Adapter createCollectionOperationOverNoCollectionErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFound <em>Feature Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureNotFound
	 * @generated
	 */
	public Adapter createFeatureNotFoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.OperationNotFound <em>Operation Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFound
	 * @generated
	 */
	public Adapter createOperationNotFoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType <em>Feature Not Found In Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType
	 * @generated
	 */
	public Adapter createFeatureNotFoundInUnionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.InvalidOperand <em>Invalid Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.InvalidOperand
	 * @generated
	 */
	public Adapter createInvalidOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite <em>No Container For Ref Immediate Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite
	 * @generated
	 */
	public Adapter createNoContainerForRefImmediateCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.DifferentBranchTypes <em>Different Branch Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.DifferentBranchTypes
	 * @generated
	 */
	public Adapter createDifferentBranchTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.BindingProblem <em>Binding Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.BindingProblem
	 * @generated
	 */
	public Adapter createBindingProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature <em>No Binding For Compulsory Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature
	 * @generated
	 */
	public Adapter createNoBindingForCompulsoryFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany <em>Binding Expected One Assigned Many</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany
	 * @generated
	 */
	public Adapter createBindingExpectedOneAssignedManyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.atl_error.FlattenOverNonNestedCollection <em>Flatten Over Non Nested Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.atl_error.FlattenOverNonNestedCollection
	 * @generated
	 */
	public Adapter createFlattenOverNonNestedCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.AnalysisInfo <em>Analysis Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.AnalysisInfo
	 * @generated
	 */
	public Adapter createAnalysisInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.analysis.atl_analysis.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.analysis.atl_analysis.Problem
	 * @generated
	 */
	public Adapter createProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AtlErrorsAdapterFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;

import bento.analysis.atl_analysis.AtlAnalysisPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsFactory
 * @model kind="package"
 * @generated
 */
public interface AtlErrorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atl_error";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/analysis/atl/analysis/errors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl_error";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlErrorsPackage eINSTANCE = bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.LocalProblemImpl <em>Local Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.LocalProblemImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getLocalProblem()
	 * @generated
	 */
	int LOCAL_PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM__LOCATION = AtlAnalysisPackage.PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM__ELEMENT = AtlAnalysisPackage.PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM__RECOVERY = AtlAnalysisPackage.PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Local Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM_FEATURE_COUNT = AtlAnalysisPackage.PROBLEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.NavigationProblemImpl <em>Navigation Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.NavigationProblemImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNavigationProblem()
	 * @generated
	 */
	int NAVIGATION_PROBLEM = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Navigation Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.InvalidArgumentProblemImpl <em>Invalid Argument Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.InvalidArgumentProblemImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getInvalidArgumentProblem()
	 * @generated
	 */
	int INVALID_ARGUMENT_PROBLEM = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Invalid Argument Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.CollectionOperationOverNoCollectionErrorImpl <em>Collection Operation Over No Collection Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.CollectionOperationOverNoCollectionErrorImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getCollectionOperationOverNoCollectionError()
	 * @generated
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Collection Operation Over No Collection Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundImpl <em>Feature Not Found</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFeatureNotFound()
	 * @generated
	 */
	int FEATURE_NOT_FOUND = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__FEATURE_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__CLASS_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__METAMODEL_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Not Found</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.InvalidOperandImpl <em>Invalid Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.InvalidOperandImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getInvalidOperand()
	 * @generated
	 */
	int INVALID_OPERAND = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__LOCATION = INVALID_ARGUMENT_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__ELEMENT = INVALID_ARGUMENT_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__RECOVERY = INVALID_ARGUMENT_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Operator Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__OPERATOR_SYMBOL = INVALID_ARGUMENT_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invalid Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND_FEATURE_COUNT = INVALID_ARGUMENT_PROBLEM_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoContainerForRefImmediateCompositeImpl <em>No Container For Ref Immediate Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.NoContainerForRefImmediateCompositeImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoContainerForRefImmediateComposite()
	 * @generated
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__CLASS_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__METAMODEL_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>No Container For Ref Immediate Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.LocalProblem <em>Local Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Problem</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.LocalProblem
	 * @generated
	 */
	EClass getLocalProblem();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.LocalProblem#getLocation()
	 * @see #getLocalProblem()
	 * @generated
	 */
	EAttribute getLocalProblem_Location();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.LocalProblem#getElement()
	 * @see #getLocalProblem()
	 * @generated
	 */
	EAttribute getLocalProblem_Element();

	/**
	 * Returns the meta object for the containment reference '{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getRecovery <em>Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recovery</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.LocalProblem#getRecovery()
	 * @see #getLocalProblem()
	 * @generated
	 */
	EReference getLocalProblem_Recovery();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.NavigationProblem <em>Navigation Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Problem</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NavigationProblem
	 * @generated
	 */
	EClass getNavigationProblem();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.InvalidArgumentProblem <em>Invalid Argument Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Argument Problem</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.InvalidArgumentProblem
	 * @generated
	 */
	EClass getInvalidArgumentProblem();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError <em>Collection Operation Over No Collection Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Operation Over No Collection Error</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError
	 * @generated
	 */
	EClass getCollectionOperationOverNoCollectionError();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFound <em>Feature Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Not Found</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureNotFound
	 * @generated
	 */
	EClass getFeatureNotFound();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFound#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureNotFound#getFeatureName()
	 * @see #getFeatureNotFound()
	 * @generated
	 */
	EAttribute getFeatureNotFound_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFound#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureNotFound#getClassName()
	 * @see #getFeatureNotFound()
	 * @generated
	 */
	EAttribute getFeatureNotFound_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFound#getMetamodelName <em>Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureNotFound#getMetamodelName()
	 * @see #getFeatureNotFound()
	 * @generated
	 */
	EAttribute getFeatureNotFound_MetamodelName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.InvalidOperand <em>Invalid Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Operand</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.InvalidOperand
	 * @generated
	 */
	EClass getInvalidOperand();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.InvalidOperand#getOperatorSymbol <em>Operator Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Symbol</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.InvalidOperand#getOperatorSymbol()
	 * @see #getInvalidOperand()
	 * @generated
	 */
	EAttribute getInvalidOperand_OperatorSymbol();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite <em>No Container For Ref Immediate Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Container For Ref Immediate Composite</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite
	 * @generated
	 */
	EClass getNoContainerForRefImmediateComposite();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite#getClassName()
	 * @see #getNoContainerForRefImmediateComposite()
	 * @generated
	 */
	EAttribute getNoContainerForRefImmediateComposite_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite#getMetamodelName <em>Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite#getMetamodelName()
	 * @see #getNoContainerForRefImmediateComposite()
	 * @generated
	 */
	EAttribute getNoContainerForRefImmediateComposite_MetamodelName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtlErrorsFactory getAtlErrorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.LocalProblemImpl <em>Local Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.LocalProblemImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getLocalProblem()
		 * @generated
		 */
		EClass LOCAL_PROBLEM = eINSTANCE.getLocalProblem();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_PROBLEM__LOCATION = eINSTANCE.getLocalProblem_Location();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_PROBLEM__ELEMENT = eINSTANCE.getLocalProblem_Element();

		/**
		 * The meta object literal for the '<em><b>Recovery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_PROBLEM__RECOVERY = eINSTANCE.getLocalProblem_Recovery();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.NavigationProblemImpl <em>Navigation Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.NavigationProblemImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNavigationProblem()
		 * @generated
		 */
		EClass NAVIGATION_PROBLEM = eINSTANCE.getNavigationProblem();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.InvalidArgumentProblemImpl <em>Invalid Argument Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.InvalidArgumentProblemImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getInvalidArgumentProblem()
		 * @generated
		 */
		EClass INVALID_ARGUMENT_PROBLEM = eINSTANCE.getInvalidArgumentProblem();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.CollectionOperationOverNoCollectionErrorImpl <em>Collection Operation Over No Collection Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.CollectionOperationOverNoCollectionErrorImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getCollectionOperationOverNoCollectionError()
		 * @generated
		 */
		EClass COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR = eINSTANCE.getCollectionOperationOverNoCollectionError();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundImpl <em>Feature Not Found</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFeatureNotFound()
		 * @generated
		 */
		EClass FEATURE_NOT_FOUND = eINSTANCE.getFeatureNotFound();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_NOT_FOUND__FEATURE_NAME = eINSTANCE.getFeatureNotFound_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_NOT_FOUND__CLASS_NAME = eINSTANCE.getFeatureNotFound_ClassName();

		/**
		 * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_NOT_FOUND__METAMODEL_NAME = eINSTANCE.getFeatureNotFound_MetamodelName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.InvalidOperandImpl <em>Invalid Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.InvalidOperandImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getInvalidOperand()
		 * @generated
		 */
		EClass INVALID_OPERAND = eINSTANCE.getInvalidOperand();

		/**
		 * The meta object literal for the '<em><b>Operator Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALID_OPERAND__OPERATOR_SYMBOL = eINSTANCE.getInvalidOperand_OperatorSymbol();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoContainerForRefImmediateCompositeImpl <em>No Container For Ref Immediate Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.NoContainerForRefImmediateCompositeImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoContainerForRefImmediateComposite()
		 * @generated
		 */
		EClass NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE = eINSTANCE.getNoContainerForRefImmediateComposite();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__CLASS_NAME = eINSTANCE.getNoContainerForRefImmediateComposite_ClassName();

		/**
		 * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__METAMODEL_NAME = eINSTANCE.getNoContainerForRefImmediateComposite_MetamodelName();

	}

} //AtlErrorsPackage

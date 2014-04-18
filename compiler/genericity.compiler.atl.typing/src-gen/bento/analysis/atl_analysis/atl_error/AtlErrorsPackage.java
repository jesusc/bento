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
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM__DEPENDENTS = AtlAnalysisPackage.PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM__LOCATION = AtlAnalysisPackage.PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
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
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
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
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
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
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.TargetModelConformanceProblemImpl <em>Target Model Conformance Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.TargetModelConformanceProblemImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getTargetModelConformanceProblem()
	 * @generated
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM = 3;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Target Model Conformance Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.CollectionOperationOverNoCollectionErrorImpl <em>Collection Operation Over No Collection Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.CollectionOperationOverNoCollectionErrorImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getCollectionOperationOverNoCollectionError()
	 * @generated
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR = 4;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
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
	int FEATURE_NOT_FOUND = 5;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
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
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.OperationNotFoundImpl <em>Operation Not Found</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.OperationNotFoundImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getOperationNotFound()
	 * @generated
	 */
	int OPERATION_NOT_FOUND = 6;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__OPERATION_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__TYPE = NAVIGATION_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Not Found</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundInUnionTypeImpl <em>Feature Not Found In Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundInUnionTypeImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFeatureNotFoundInUnionType()
	 * @generated
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__FEATURE_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Not Found In Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.InvalidOperandImpl <em>Invalid Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.InvalidOperandImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getInvalidOperand()
	 * @generated
	 */
	int INVALID_OPERAND = 8;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__DEPENDENTS = INVALID_ARGUMENT_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__LOCATION = INVALID_ARGUMENT_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
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
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE = 9;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
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
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.DifferentBranchTypesImpl <em>Different Branch Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.DifferentBranchTypesImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getDifferentBranchTypes()
	 * @generated
	 */
	int DIFFERENT_BRANCH_TYPES = 10;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Then Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__THEN_TYPE = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__ELSE_TYPE = NAVIGATION_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Different Branch Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingProblemImpl <em>Binding Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.BindingProblemImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingProblem()
	 * @generated
	 */
	int BINDING_PROBLEM = 11;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__FEATURE = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__FEATURE_NAME = LOCAL_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoBindingForCompulsoryFeatureImpl <em>No Binding For Compulsory Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.NoBindingForCompulsoryFeatureImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoBindingForCompulsoryFeature()
	 * @generated
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__DEPENDENTS = TARGET_MODEL_CONFORMANCE_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__LOCATION = TARGET_MODEL_CONFORMANCE_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__ELEMENT = TARGET_MODEL_CONFORMANCE_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__RECOVERY = TARGET_MODEL_CONFORMANCE_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__FEATURE = TARGET_MODEL_CONFORMANCE_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__FEATURE_NAME = TARGET_MODEL_CONFORMANCE_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>No Binding For Compulsory Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE_FEATURE_COUNT = TARGET_MODEL_CONFORMANCE_PROBLEM_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingExpectedOneAssignedManyImpl <em>Binding Expected One Assigned Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.BindingExpectedOneAssignedManyImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingExpectedOneAssignedMany()
	 * @generated
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY = 13;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__DEPENDENTS = BINDING_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__LOCATION = BINDING_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__ELEMENT = BINDING_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__RECOVERY = BINDING_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__FEATURE = BINDING_PROBLEM__FEATURE;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__FEATURE_NAME = BINDING_PROBLEM__FEATURE_NAME;

	/**
	 * The number of structural features of the '<em>Binding Expected One Assigned Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY_FEATURE_COUNT = BINDING_PROBLEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.FlattenOverNonNestedCollectionImpl <em>Flatten Over Non Nested Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.FlattenOverNonNestedCollectionImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFlattenOverNonNestedCollection()
	 * @generated
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION = 14;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Flatten Over Non Nested Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.IteratorOverEmptySequenceImpl <em>Iterator Over Empty Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.IteratorOverEmptySequenceImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getIteratorOverEmptySequence()
	 * @generated
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE = 15;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Iterator Over Empty Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.LocalProblem#getElement()
	 * @see #getLocalProblem()
	 * @generated
	 */
	EReference getLocalProblem_Element();

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
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.TargetModelConformanceProblem <em>Target Model Conformance Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Model Conformance Problem</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.TargetModelConformanceProblem
	 * @generated
	 */
	EClass getTargetModelConformanceProblem();

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
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.OperationNotFound <em>Operation Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Not Found</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFound
	 * @generated
	 */
	EClass getOperationNotFound();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.OperationNotFound#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFound#getOperationName()
	 * @see #getOperationNotFound()
	 * @generated
	 */
	EAttribute getOperationNotFound_OperationName();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.OperationNotFound#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFound#getType()
	 * @see #getOperationNotFound()
	 * @generated
	 */
	EReference getOperationNotFound_Type();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType <em>Feature Not Found In Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Not Found In Union Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType
	 * @generated
	 */
	EClass getFeatureNotFoundInUnionType();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType#getFeatureName()
	 * @see #getFeatureNotFoundInUnionType()
	 * @generated
	 */
	EAttribute getFeatureNotFoundInUnionType_FeatureName();

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
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.DifferentBranchTypes <em>Different Branch Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Different Branch Types</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.DifferentBranchTypes
	 * @generated
	 */
	EClass getDifferentBranchTypes();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.DifferentBranchTypes#getThenType <em>Then Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.DifferentBranchTypes#getThenType()
	 * @see #getDifferentBranchTypes()
	 * @generated
	 */
	EReference getDifferentBranchTypes_ThenType();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.DifferentBranchTypes#getElseType <em>Else Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.DifferentBranchTypes#getElseType()
	 * @see #getDifferentBranchTypes()
	 * @generated
	 */
	EReference getDifferentBranchTypes_ElseType();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.BindingProblem <em>Binding Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Problem</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingProblem
	 * @generated
	 */
	EClass getBindingProblem();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.BindingProblem#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingProblem#getFeature()
	 * @see #getBindingProblem()
	 * @generated
	 */
	EReference getBindingProblem_Feature();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.BindingProblem#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingProblem#getFeatureName()
	 * @see #getBindingProblem()
	 * @generated
	 */
	EAttribute getBindingProblem_FeatureName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature <em>No Binding For Compulsory Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Binding For Compulsory Feature</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature
	 * @generated
	 */
	EClass getNoBindingForCompulsoryFeature();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany <em>Binding Expected One Assigned Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Expected One Assigned Many</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany
	 * @generated
	 */
	EClass getBindingExpectedOneAssignedMany();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.FlattenOverNonNestedCollection <em>Flatten Over Non Nested Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flatten Over Non Nested Collection</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FlattenOverNonNestedCollection
	 * @generated
	 */
	EClass getFlattenOverNonNestedCollection();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.IteratorOverEmptySequence <em>Iterator Over Empty Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Over Empty Sequence</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.IteratorOverEmptySequence
	 * @generated
	 */
	EClass getIteratorOverEmptySequence();

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
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_PROBLEM__ELEMENT = eINSTANCE.getLocalProblem_Element();

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
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.TargetModelConformanceProblemImpl <em>Target Model Conformance Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.TargetModelConformanceProblemImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getTargetModelConformanceProblem()
		 * @generated
		 */
		EClass TARGET_MODEL_CONFORMANCE_PROBLEM = eINSTANCE.getTargetModelConformanceProblem();

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
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.OperationNotFoundImpl <em>Operation Not Found</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.OperationNotFoundImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getOperationNotFound()
		 * @generated
		 */
		EClass OPERATION_NOT_FOUND = eINSTANCE.getOperationNotFound();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_NOT_FOUND__OPERATION_NAME = eINSTANCE.getOperationNotFound_OperationName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_NOT_FOUND__TYPE = eINSTANCE.getOperationNotFound_Type();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundInUnionTypeImpl <em>Feature Not Found In Union Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundInUnionTypeImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFeatureNotFoundInUnionType()
		 * @generated
		 */
		EClass FEATURE_NOT_FOUND_IN_UNION_TYPE = eINSTANCE.getFeatureNotFoundInUnionType();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_NOT_FOUND_IN_UNION_TYPE__FEATURE_NAME = eINSTANCE.getFeatureNotFoundInUnionType_FeatureName();

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

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.DifferentBranchTypesImpl <em>Different Branch Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.DifferentBranchTypesImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getDifferentBranchTypes()
		 * @generated
		 */
		EClass DIFFERENT_BRANCH_TYPES = eINSTANCE.getDifferentBranchTypes();

		/**
		 * The meta object literal for the '<em><b>Then Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENT_BRANCH_TYPES__THEN_TYPE = eINSTANCE.getDifferentBranchTypes_ThenType();

		/**
		 * The meta object literal for the '<em><b>Else Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERENT_BRANCH_TYPES__ELSE_TYPE = eINSTANCE.getDifferentBranchTypes_ElseType();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingProblemImpl <em>Binding Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.BindingProblemImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingProblem()
		 * @generated
		 */
		EClass BINDING_PROBLEM = eINSTANCE.getBindingProblem();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_PROBLEM__FEATURE = eINSTANCE.getBindingProblem_Feature();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_PROBLEM__FEATURE_NAME = eINSTANCE.getBindingProblem_FeatureName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoBindingForCompulsoryFeatureImpl <em>No Binding For Compulsory Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.NoBindingForCompulsoryFeatureImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoBindingForCompulsoryFeature()
		 * @generated
		 */
		EClass NO_BINDING_FOR_COMPULSORY_FEATURE = eINSTANCE.getNoBindingForCompulsoryFeature();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingExpectedOneAssignedManyImpl <em>Binding Expected One Assigned Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.BindingExpectedOneAssignedManyImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingExpectedOneAssignedMany()
		 * @generated
		 */
		EClass BINDING_EXPECTED_ONE_ASSIGNED_MANY = eINSTANCE.getBindingExpectedOneAssignedMany();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.FlattenOverNonNestedCollectionImpl <em>Flatten Over Non Nested Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.FlattenOverNonNestedCollectionImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFlattenOverNonNestedCollection()
		 * @generated
		 */
		EClass FLATTEN_OVER_NON_NESTED_COLLECTION = eINSTANCE.getFlattenOverNonNestedCollection();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.IteratorOverEmptySequenceImpl <em>Iterator Over Empty Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.IteratorOverEmptySequenceImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getIteratorOverEmptySequence()
		 * @generated
		 */
		EClass ITERATOR_OVER_EMPTY_SEQUENCE = eINSTANCE.getIteratorOverEmptySequence();

	}

} //AtlErrorsPackage

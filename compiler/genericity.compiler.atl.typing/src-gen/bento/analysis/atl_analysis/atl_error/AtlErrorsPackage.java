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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM__DESCRIPTION = AtlAnalysisPackage.PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM__SEVERITY = AtlAnalysisPackage.PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBLEM__NEEDS_CSP = AtlAnalysisPackage.PROBLEM__NEEDS_CSP;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROBLEM__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_PROBLEM__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_CONFORMANCE_PROBLEM__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

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
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.FeatureAccessInCollectionImpl <em>Feature Access In Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.FeatureAccessInCollectionImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFeatureAccessInCollection()
	 * @generated
	 */
	int FEATURE_ACCESS_IN_COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION__FEATURE_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Access In Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ACCESS_IN_COLLECTION_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundImpl <em>Feature Not Found</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFeatureNotFound()
	 * @generated
	 */
	int FEATURE_NOT_FOUND = 6;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

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
	int OPERATION_NOT_FOUND = 7;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

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
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__CLASS_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND__METAMODEL_NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation Not Found</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.OperationNotFoundInThisModuleImpl <em>Operation Not Found In This Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.OperationNotFoundInThisModuleImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getOperationNotFoundInThisModule()
	 * @generated
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE = 8;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maybe Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE__MAYBE_RULE = NAVIGATION_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Not Found In This Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_NOT_FOUND_IN_THIS_MODULE_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.AttributeNotFoundInThisModuleImpl <em>Attribute Not Found In This Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.AttributeNotFoundInThisModuleImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getAttributeNotFoundInThisModule()
	 * @generated
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE = 9;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__LOCATION = NAVIGATION_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__ELEMENT = NAVIGATION_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__RECOVERY = NAVIGATION_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__NAME = NAVIGATION_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Not Found In This Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE_FEATURE_COUNT = NAVIGATION_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundInUnionTypeImpl <em>Feature Not Found In Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.FeatureNotFoundInUnionTypeImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFeatureNotFoundInUnionType()
	 * @generated
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NOT_FOUND_IN_UNION_TYPE__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

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
	int INVALID_OPERAND = 11;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__DEPENDENTS = INVALID_ARGUMENT_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__DESCRIPTION = INVALID_ARGUMENT_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__SEVERITY = INVALID_ARGUMENT_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_OPERAND__NEEDS_CSP = INVALID_ARGUMENT_PROBLEM__NEEDS_CSP;

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
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE = 12;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

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
	int DIFFERENT_BRANCH_TYPES = 13;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__DEPENDENTS = NAVIGATION_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__DESCRIPTION = NAVIGATION_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__SEVERITY = NAVIGATION_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_BRANCH_TYPES__NEEDS_CSP = NAVIGATION_PROBLEM__NEEDS_CSP;

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
	int BINDING_PROBLEM = 14;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROBLEM__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

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
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.ResolveTempProblemImpl <em>Resolve Temp Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.ResolveTempProblemImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getResolveTempProblem()
	 * @generated
	 */
	int RESOLVE_TEMP_PROBLEM = 15;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_PROBLEM__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_PROBLEM__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_PROBLEM__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_PROBLEM__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_PROBLEM__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_PROBLEM__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_PROBLEM__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Resolve Temp Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_PROBLEM_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoBindingForCompulsoryFeatureImpl <em>No Binding For Compulsory Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.NoBindingForCompulsoryFeatureImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoBindingForCompulsoryFeature()
	 * @generated
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE = 16;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__DEPENDENTS = TARGET_MODEL_CONFORMANCE_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__DESCRIPTION = TARGET_MODEL_CONFORMANCE_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__SEVERITY = TARGET_MODEL_CONFORMANCE_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_BINDING_FOR_COMPULSORY_FEATURE__NEEDS_CSP = TARGET_MODEL_CONFORMANCE_PROBLEM__NEEDS_CSP;

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
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY = 17;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__DEPENDENTS = BINDING_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__DESCRIPTION = BINDING_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__SEVERITY = BINDING_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_EXPECTED_ONE_ASSIGNED_MANY__NEEDS_CSP = BINDING_PROBLEM__NEEDS_CSP;

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
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingResolutionImpl <em>Binding Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.BindingResolutionImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingResolution()
	 * @generated
	 */
	int BINDING_RESOLUTION = 18;

	/**
	 * The feature id for the '<em><b>Right Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_RESOLUTION__RIGHT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_RESOLUTION__TARGET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_RESOLUTION__RULES = 2;

	/**
	 * The number of structural features of the '<em>Binding Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_RESOLUTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingWithoutRuleImpl <em>Binding Without Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.BindingWithoutRuleImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingWithoutRule()
	 * @generated
	 */
	int BINDING_WITHOUT_RULE = 19;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__DEPENDENTS = BINDING_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__DESCRIPTION = BINDING_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__SEVERITY = BINDING_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__NEEDS_CSP = BINDING_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__LOCATION = BINDING_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__ELEMENT = BINDING_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__RECOVERY = BINDING_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__FEATURE = BINDING_PROBLEM__FEATURE;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__FEATURE_NAME = BINDING_PROBLEM__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Right Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__RIGHT_TYPE = BINDING_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__TARGET_TYPE = BINDING_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE__RULES = BINDING_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binding Without Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITHOUT_RULE_FEATURE_COUNT = BINDING_PROBLEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingWithResolvedByIncompatibleRuleImpl <em>Binding With Resolved By Incompatible Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.BindingWithResolvedByIncompatibleRuleImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingWithResolvedByIncompatibleRule()
	 * @generated
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE = 20;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__DEPENDENTS = BINDING_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__DESCRIPTION = BINDING_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__SEVERITY = BINDING_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__NEEDS_CSP = BINDING_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__LOCATION = BINDING_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__ELEMENT = BINDING_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__RECOVERY = BINDING_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__FEATURE = BINDING_PROBLEM__FEATURE;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__FEATURE_NAME = BINDING_PROBLEM__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Right Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__RIGHT_TYPE = BINDING_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__TARGET_TYPE = BINDING_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE__RULES = BINDING_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binding With Resolved By Incompatible Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE_FEATURE_COUNT = BINDING_PROBLEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingPossiblyUnresolvedImpl <em>Binding Possibly Unresolved</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.BindingPossiblyUnresolvedImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingPossiblyUnresolved()
	 * @generated
	 */
	int BINDING_POSSIBLY_UNRESOLVED = 21;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__DEPENDENTS = BINDING_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__DESCRIPTION = BINDING_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__SEVERITY = BINDING_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__NEEDS_CSP = BINDING_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__LOCATION = BINDING_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__ELEMENT = BINDING_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__RECOVERY = BINDING_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__FEATURE = BINDING_PROBLEM__FEATURE;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__FEATURE_NAME = BINDING_PROBLEM__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Right Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__RIGHT_TYPE = BINDING_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__TARGET_TYPE = BINDING_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__RULES = BINDING_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Problematic Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED__PROBLEMATIC_CLASSES = BINDING_PROBLEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binding Possibly Unresolved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_POSSIBLY_UNRESOLVED_FEATURE_COUNT = BINDING_PROBLEM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.ResolvedRuleInfoImpl <em>Resolved Rule Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.ResolvedRuleInfoImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getResolvedRuleInfo()
	 * @generated
	 */
	int RESOLVED_RULE_INFO = 22;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_RULE_INFO__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_RULE_INFO__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>All Involved Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_RULE_INFO__ALL_INVOLVED_RULES = 2;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_RULE_INFO__RULE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_RULE_INFO__INPUT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_RULE_INFO__OUTPUT_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Resolved Rule Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVED_RULE_INFO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.ResolveTempWithoutRuleImpl <em>Resolve Temp Without Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.ResolveTempWithoutRuleImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getResolveTempWithoutRule()
	 * @generated
	 */
	int RESOLVE_TEMP_WITHOUT_RULE = 23;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE__DEPENDENTS = RESOLVE_TEMP_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE__DESCRIPTION = RESOLVE_TEMP_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE__SEVERITY = RESOLVE_TEMP_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE__NEEDS_CSP = RESOLVE_TEMP_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE__LOCATION = RESOLVE_TEMP_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE__ELEMENT = RESOLVE_TEMP_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE__RECOVERY = RESOLVE_TEMP_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE__SOURCE_TYPE = RESOLVE_TEMP_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolve Temp Without Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_WITHOUT_RULE_FEATURE_COUNT = RESOLVE_TEMP_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.ResolveTempOutputPatternElementNotFoundImpl <em>Resolve Temp Output Pattern Element Not Found</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.ResolveTempOutputPatternElementNotFoundImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getResolveTempOutputPatternElementNotFound()
	 * @generated
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND = 24;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__DEPENDENTS = RESOLVE_TEMP_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__DESCRIPTION = RESOLVE_TEMP_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__SEVERITY = RESOLVE_TEMP_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__NEEDS_CSP = RESOLVE_TEMP_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__LOCATION = RESOLVE_TEMP_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__ELEMENT = RESOLVE_TEMP_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__RECOVERY = RESOLVE_TEMP_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__SOURCE_TYPE = RESOLVE_TEMP_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__RULES = RESOLVE_TEMP_PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resolve Temp Output Pattern Element Not Found</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND_FEATURE_COUNT = RESOLVE_TEMP_PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.FlattenOverNonNestedCollectionImpl <em>Flatten Over Non Nested Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.FlattenOverNonNestedCollectionImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFlattenOverNonNestedCollection()
	 * @generated
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION = 25;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLATTEN_OVER_NON_NESTED_COLLECTION__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

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
	int ITERATOR_OVER_EMPTY_SEQUENCE = 26;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_EMPTY_SEQUENCE__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

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
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.ReadingTargetModelImpl <em>Reading Target Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.ReadingTargetModelImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getReadingTargetModel()
	 * @generated
	 */
	int READING_TARGET_MODEL = 27;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL__MODEL_NAME = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reading Target Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_TARGET_MODEL_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.AmbiguousTargetModelReferenceImpl <em>Ambiguous Target Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.AmbiguousTargetModelReferenceImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getAmbiguousTargetModelReference()
	 * @generated
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE = 28;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE__MODEL_NAME = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ambiguous Target Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIGUOUS_TARGET_MODEL_REFERENCE_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoModelFoundImpl <em>No Model Found</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.NoModelFoundImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoModelFound()
	 * @generated
	 */
	int NO_MODEL_FOUND = 29;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND__MODEL_NAME = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Model Found</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_MODEL_FOUND_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.WrongTypeImpl <em>Wrong Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.WrongTypeImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getWrongType()
	 * @generated
	 */
	int WRONG_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRONG_TYPE__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRONG_TYPE__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRONG_TYPE__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRONG_TYPE__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRONG_TYPE__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRONG_TYPE__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRONG_TYPE__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Wrong Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRONG_TYPE_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.IteratorBodyWrongTypeImpl <em>Iterator Body Wrong Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.IteratorBodyWrongTypeImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getIteratorBodyWrongType()
	 * @generated
	 */
	int ITERATOR_BODY_WRONG_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_BODY_WRONG_TYPE__DEPENDENTS = WRONG_TYPE__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_BODY_WRONG_TYPE__DESCRIPTION = WRONG_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_BODY_WRONG_TYPE__SEVERITY = WRONG_TYPE__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_BODY_WRONG_TYPE__NEEDS_CSP = WRONG_TYPE__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_BODY_WRONG_TYPE__LOCATION = WRONG_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_BODY_WRONG_TYPE__ELEMENT = WRONG_TYPE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_BODY_WRONG_TYPE__RECOVERY = WRONG_TYPE__RECOVERY;

	/**
	 * The number of structural features of the '<em>Iterator Body Wrong Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_BODY_WRONG_TYPE_FEATURE_COUNT = WRONG_TYPE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.MatchedRuleWithoutOutputPatternImpl <em>Matched Rule Without Output Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.MatchedRuleWithoutOutputPatternImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getMatchedRuleWithoutOutputPattern()
	 * @generated
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN = 32;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Matched Rule Without Output Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_WITHOUT_OUTPUT_PATTERN_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.ExpectedCollectionInForEachImpl <em>Expected Collection In For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.ExpectedCollectionInForEachImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getExpectedCollectionInForEach()
	 * @generated
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH = 33;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Expected Collection In For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_COLLECTION_IN_FOR_EACH_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoClassFoundInMetamodelImpl <em>No Class Found In Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.NoClassFoundInMetamodelImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoClassFoundInMetamodel()
	 * @generated
	 */
	int NO_CLASS_FOUND_IN_METAMODEL = 34;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL__CLASS_NAME = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Class Found In Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_CLASS_FOUND_IN_METAMODEL_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.InvalidArgumentImpl <em>Invalid Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.InvalidArgumentImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getInvalidArgument()
	 * @generated
	 */
	int INVALID_ARGUMENT = 35;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The number of structural features of the '<em>Invalid Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_ARGUMENT_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.CollectionOperationNotFoundImpl <em>Collection Operation Not Found</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.CollectionOperationNotFoundImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getCollectionOperationNotFound()
	 * @generated
	 */
	int COLLECTION_OPERATION_NOT_FOUND = 36;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND__OPERATION_NAME = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Operation Not Found</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_NOT_FOUND_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_error.impl.IteratorOverNoCollectionTypeImpl <em>Iterator Over No Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_error.impl.IteratorOverNoCollectionTypeImpl
	 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getIteratorOverNoCollectionType()
	 * @generated
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE__DEPENDENTS = LOCAL_PROBLEM__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE__DESCRIPTION = LOCAL_PROBLEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE__SEVERITY = LOCAL_PROBLEM__SEVERITY;

	/**
	 * The feature id for the '<em><b>Needs CSP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE__NEEDS_CSP = LOCAL_PROBLEM__NEEDS_CSP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE__LOCATION = LOCAL_PROBLEM__LOCATION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE__ELEMENT = LOCAL_PROBLEM__ELEMENT;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE__RECOVERY = LOCAL_PROBLEM__RECOVERY;

	/**
	 * The feature id for the '<em><b>Iterator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE__ITERATOR_NAME = LOCAL_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterator Over No Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_OVER_NO_COLLECTION_TYPE_FEATURE_COUNT = LOCAL_PROBLEM_FEATURE_COUNT + 1;


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
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.FeatureAccessInCollection <em>Feature Access In Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Access In Collection</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureAccessInCollection
	 * @generated
	 */
	EClass getFeatureAccessInCollection();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.FeatureAccessInCollection#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.FeatureAccessInCollection#getFeatureName()
	 * @see #getFeatureAccessInCollection()
	 * @generated
	 */
	EAttribute getFeatureAccessInCollection_FeatureName();

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
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.OperationNotFound#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFound#getClassName()
	 * @see #getOperationNotFound()
	 * @generated
	 */
	EAttribute getOperationNotFound_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.OperationNotFound#getMetamodelName <em>Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFound#getMetamodelName()
	 * @see #getOperationNotFound()
	 * @generated
	 */
	EAttribute getOperationNotFound_MetamodelName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.OperationNotFoundInThisModule <em>Operation Not Found In This Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Not Found In This Module</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFoundInThisModule
	 * @generated
	 */
	EClass getOperationNotFoundInThisModule();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.OperationNotFoundInThisModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFoundInThisModule#getName()
	 * @see #getOperationNotFoundInThisModule()
	 * @generated
	 */
	EAttribute getOperationNotFoundInThisModule_Name();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.OperationNotFoundInThisModule#isMaybeRule <em>Maybe Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maybe Rule</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.OperationNotFoundInThisModule#isMaybeRule()
	 * @see #getOperationNotFoundInThisModule()
	 * @generated
	 */
	EAttribute getOperationNotFoundInThisModule_MaybeRule();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.AttributeNotFoundInThisModule <em>Attribute Not Found In This Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Not Found In This Module</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.AttributeNotFoundInThisModule
	 * @generated
	 */
	EClass getAttributeNotFoundInThisModule();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.AttributeNotFoundInThisModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.AttributeNotFoundInThisModule#getName()
	 * @see #getAttributeNotFoundInThisModule()
	 * @generated
	 */
	EAttribute getAttributeNotFoundInThisModule_Name();

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
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.ResolveTempProblem <em>Resolve Temp Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Temp Problem</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolveTempProblem
	 * @generated
	 */
	EClass getResolveTempProblem();

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
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.BindingResolution <em>Binding Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Resolution</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingResolution
	 * @generated
	 */
	EClass getBindingResolution();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.BindingResolution#getRightType <em>Right Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingResolution#getRightType()
	 * @see #getBindingResolution()
	 * @generated
	 */
	EReference getBindingResolution_RightType();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.BindingResolution#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingResolution#getTargetType()
	 * @see #getBindingResolution()
	 * @generated
	 */
	EReference getBindingResolution_TargetType();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.analysis.atl_analysis.atl_error.BindingResolution#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingResolution#getRules()
	 * @see #getBindingResolution()
	 * @generated
	 */
	EReference getBindingResolution_Rules();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.BindingWithoutRule <em>Binding Without Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Without Rule</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingWithoutRule
	 * @generated
	 */
	EClass getBindingWithoutRule();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.BindingWithResolvedByIncompatibleRule <em>Binding With Resolved By Incompatible Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding With Resolved By Incompatible Rule</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingWithResolvedByIncompatibleRule
	 * @generated
	 */
	EClass getBindingWithResolvedByIncompatibleRule();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved <em>Binding Possibly Unresolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Possibly Unresolved</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved
	 * @generated
	 */
	EClass getBindingPossiblyUnresolved();

	/**
	 * Returns the meta object for the reference list '{@link bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved#getProblematicClasses <em>Problematic Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Problematic Classes</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved#getProblematicClasses()
	 * @see #getBindingPossiblyUnresolved()
	 * @generated
	 */
	EReference getBindingPossiblyUnresolved_ProblematicClasses();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo <em>Resolved Rule Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolved Rule Info</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo
	 * @generated
	 */
	EClass getResolvedRuleInfo();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getLocation()
	 * @see #getResolvedRuleInfo()
	 * @generated
	 */
	EAttribute getResolvedRuleInfo_Location();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getElement()
	 * @see #getResolvedRuleInfo()
	 * @generated
	 */
	EReference getResolvedRuleInfo_Element();

	/**
	 * Returns the meta object for the reference list '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getAllInvolvedRules <em>All Involved Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Involved Rules</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getAllInvolvedRules()
	 * @see #getResolvedRuleInfo()
	 * @generated
	 */
	EReference getResolvedRuleInfo_AllInvolvedRules();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getRuleName()
	 * @see #getResolvedRuleInfo()
	 * @generated
	 */
	EAttribute getResolvedRuleInfo_RuleName();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getInputType()
	 * @see #getResolvedRuleInfo()
	 * @generated
	 */
	EReference getResolvedRuleInfo_InputType();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getOutputType()
	 * @see #getResolvedRuleInfo()
	 * @generated
	 */
	EReference getResolvedRuleInfo_OutputType();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.ResolveTempWithoutRule <em>Resolve Temp Without Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Temp Without Rule</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolveTempWithoutRule
	 * @generated
	 */
	EClass getResolveTempWithoutRule();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.ResolveTempWithoutRule#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolveTempWithoutRule#getSourceType()
	 * @see #getResolveTempWithoutRule()
	 * @generated
	 */
	EReference getResolveTempWithoutRule_SourceType();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.ResolveTempOutputPatternElementNotFound <em>Resolve Temp Output Pattern Element Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Temp Output Pattern Element Not Found</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolveTempOutputPatternElementNotFound
	 * @generated
	 */
	EClass getResolveTempOutputPatternElementNotFound();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_error.ResolveTempOutputPatternElementNotFound#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolveTempOutputPatternElementNotFound#getSourceType()
	 * @see #getResolveTempOutputPatternElementNotFound()
	 * @generated
	 */
	EReference getResolveTempOutputPatternElementNotFound_SourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.analysis.atl_analysis.atl_error.ResolveTempOutputPatternElementNotFound#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ResolveTempOutputPatternElementNotFound#getRules()
	 * @see #getResolveTempOutputPatternElementNotFound()
	 * @generated
	 */
	EReference getResolveTempOutputPatternElementNotFound_Rules();

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
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.ReadingTargetModel <em>Reading Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Target Model</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ReadingTargetModel
	 * @generated
	 */
	EClass getReadingTargetModel();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.ReadingTargetModel#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ReadingTargetModel#getModelName()
	 * @see #getReadingTargetModel()
	 * @generated
	 */
	EAttribute getReadingTargetModel_ModelName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.AmbiguousTargetModelReference <em>Ambiguous Target Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambiguous Target Model Reference</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.AmbiguousTargetModelReference
	 * @generated
	 */
	EClass getAmbiguousTargetModelReference();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.AmbiguousTargetModelReference#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.AmbiguousTargetModelReference#getModelName()
	 * @see #getAmbiguousTargetModelReference()
	 * @generated
	 */
	EAttribute getAmbiguousTargetModelReference_ModelName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.NoModelFound <em>No Model Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Model Found</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NoModelFound
	 * @generated
	 */
	EClass getNoModelFound();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.NoModelFound#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NoModelFound#getModelName()
	 * @see #getNoModelFound()
	 * @generated
	 */
	EAttribute getNoModelFound_ModelName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.WrongType <em>Wrong Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrong Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.WrongType
	 * @generated
	 */
	EClass getWrongType();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.IteratorBodyWrongType <em>Iterator Body Wrong Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Body Wrong Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.IteratorBodyWrongType
	 * @generated
	 */
	EClass getIteratorBodyWrongType();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.MatchedRuleWithoutOutputPattern <em>Matched Rule Without Output Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Rule Without Output Pattern</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.MatchedRuleWithoutOutputPattern
	 * @generated
	 */
	EClass getMatchedRuleWithoutOutputPattern();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.ExpectedCollectionInForEach <em>Expected Collection In For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Collection In For Each</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.ExpectedCollectionInForEach
	 * @generated
	 */
	EClass getExpectedCollectionInForEach();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.NoClassFoundInMetamodel <em>No Class Found In Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Class Found In Metamodel</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NoClassFoundInMetamodel
	 * @generated
	 */
	EClass getNoClassFoundInMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.NoClassFoundInMetamodel#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.NoClassFoundInMetamodel#getClassName()
	 * @see #getNoClassFoundInMetamodel()
	 * @generated
	 */
	EAttribute getNoClassFoundInMetamodel_ClassName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.InvalidArgument <em>Invalid Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Argument</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.InvalidArgument
	 * @generated
	 */
	EClass getInvalidArgument();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.CollectionOperationNotFound <em>Collection Operation Not Found</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Operation Not Found</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.CollectionOperationNotFound
	 * @generated
	 */
	EClass getCollectionOperationNotFound();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.CollectionOperationNotFound#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.CollectionOperationNotFound#getOperationName()
	 * @see #getCollectionOperationNotFound()
	 * @generated
	 */
	EAttribute getCollectionOperationNotFound_OperationName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_error.IteratorOverNoCollectionType <em>Iterator Over No Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Over No Collection Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.IteratorOverNoCollectionType
	 * @generated
	 */
	EClass getIteratorOverNoCollectionType();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_error.IteratorOverNoCollectionType#getIteratorName <em>Iterator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_error.IteratorOverNoCollectionType#getIteratorName()
	 * @see #getIteratorOverNoCollectionType()
	 * @generated
	 */
	EAttribute getIteratorOverNoCollectionType_IteratorName();

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
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.FeatureAccessInCollectionImpl <em>Feature Access In Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.FeatureAccessInCollectionImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getFeatureAccessInCollection()
		 * @generated
		 */
		EClass FEATURE_ACCESS_IN_COLLECTION = eINSTANCE.getFeatureAccessInCollection();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_ACCESS_IN_COLLECTION__FEATURE_NAME = eINSTANCE.getFeatureAccessInCollection_FeatureName();

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
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_NOT_FOUND__CLASS_NAME = eINSTANCE.getOperationNotFound_ClassName();

		/**
		 * The meta object literal for the '<em><b>Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_NOT_FOUND__METAMODEL_NAME = eINSTANCE.getOperationNotFound_MetamodelName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.OperationNotFoundInThisModuleImpl <em>Operation Not Found In This Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.OperationNotFoundInThisModuleImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getOperationNotFoundInThisModule()
		 * @generated
		 */
		EClass OPERATION_NOT_FOUND_IN_THIS_MODULE = eINSTANCE.getOperationNotFoundInThisModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_NOT_FOUND_IN_THIS_MODULE__NAME = eINSTANCE.getOperationNotFoundInThisModule_Name();

		/**
		 * The meta object literal for the '<em><b>Maybe Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_NOT_FOUND_IN_THIS_MODULE__MAYBE_RULE = eINSTANCE.getOperationNotFoundInThisModule_MaybeRule();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.AttributeNotFoundInThisModuleImpl <em>Attribute Not Found In This Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.AttributeNotFoundInThisModuleImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getAttributeNotFoundInThisModule()
		 * @generated
		 */
		EClass ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE = eINSTANCE.getAttributeNotFoundInThisModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NOT_FOUND_IN_THIS_MODULE__NAME = eINSTANCE.getAttributeNotFoundInThisModule_Name();

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
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.ResolveTempProblemImpl <em>Resolve Temp Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.ResolveTempProblemImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getResolveTempProblem()
		 * @generated
		 */
		EClass RESOLVE_TEMP_PROBLEM = eINSTANCE.getResolveTempProblem();

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
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingResolutionImpl <em>Binding Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.BindingResolutionImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingResolution()
		 * @generated
		 */
		EClass BINDING_RESOLUTION = eINSTANCE.getBindingResolution();

		/**
		 * The meta object literal for the '<em><b>Right Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_RESOLUTION__RIGHT_TYPE = eINSTANCE.getBindingResolution_RightType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_RESOLUTION__TARGET_TYPE = eINSTANCE.getBindingResolution_TargetType();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_RESOLUTION__RULES = eINSTANCE.getBindingResolution_Rules();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingWithoutRuleImpl <em>Binding Without Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.BindingWithoutRuleImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingWithoutRule()
		 * @generated
		 */
		EClass BINDING_WITHOUT_RULE = eINSTANCE.getBindingWithoutRule();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingWithResolvedByIncompatibleRuleImpl <em>Binding With Resolved By Incompatible Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.BindingWithResolvedByIncompatibleRuleImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingWithResolvedByIncompatibleRule()
		 * @generated
		 */
		EClass BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE = eINSTANCE.getBindingWithResolvedByIncompatibleRule();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.BindingPossiblyUnresolvedImpl <em>Binding Possibly Unresolved</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.BindingPossiblyUnresolvedImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getBindingPossiblyUnresolved()
		 * @generated
		 */
		EClass BINDING_POSSIBLY_UNRESOLVED = eINSTANCE.getBindingPossiblyUnresolved();

		/**
		 * The meta object literal for the '<em><b>Problematic Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_POSSIBLY_UNRESOLVED__PROBLEMATIC_CLASSES = eINSTANCE.getBindingPossiblyUnresolved_ProblematicClasses();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.ResolvedRuleInfoImpl <em>Resolved Rule Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.ResolvedRuleInfoImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getResolvedRuleInfo()
		 * @generated
		 */
		EClass RESOLVED_RULE_INFO = eINSTANCE.getResolvedRuleInfo();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVED_RULE_INFO__LOCATION = eINSTANCE.getResolvedRuleInfo_Location();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_RULE_INFO__ELEMENT = eINSTANCE.getResolvedRuleInfo_Element();

		/**
		 * The meta object literal for the '<em><b>All Involved Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_RULE_INFO__ALL_INVOLVED_RULES = eINSTANCE.getResolvedRuleInfo_AllInvolvedRules();

		/**
		 * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVED_RULE_INFO__RULE_NAME = eINSTANCE.getResolvedRuleInfo_RuleName();

		/**
		 * The meta object literal for the '<em><b>Input Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_RULE_INFO__INPUT_TYPE = eINSTANCE.getResolvedRuleInfo_InputType();

		/**
		 * The meta object literal for the '<em><b>Output Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVED_RULE_INFO__OUTPUT_TYPE = eINSTANCE.getResolvedRuleInfo_OutputType();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.ResolveTempWithoutRuleImpl <em>Resolve Temp Without Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.ResolveTempWithoutRuleImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getResolveTempWithoutRule()
		 * @generated
		 */
		EClass RESOLVE_TEMP_WITHOUT_RULE = eINSTANCE.getResolveTempWithoutRule();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_TEMP_WITHOUT_RULE__SOURCE_TYPE = eINSTANCE.getResolveTempWithoutRule_SourceType();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.ResolveTempOutputPatternElementNotFoundImpl <em>Resolve Temp Output Pattern Element Not Found</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.ResolveTempOutputPatternElementNotFoundImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getResolveTempOutputPatternElementNotFound()
		 * @generated
		 */
		EClass RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND = eINSTANCE.getResolveTempOutputPatternElementNotFound();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__SOURCE_TYPE = eINSTANCE.getResolveTempOutputPatternElementNotFound_SourceType();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_TEMP_OUTPUT_PATTERN_ELEMENT_NOT_FOUND__RULES = eINSTANCE.getResolveTempOutputPatternElementNotFound_Rules();

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

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.ReadingTargetModelImpl <em>Reading Target Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.ReadingTargetModelImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getReadingTargetModel()
		 * @generated
		 */
		EClass READING_TARGET_MODEL = eINSTANCE.getReadingTargetModel();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READING_TARGET_MODEL__MODEL_NAME = eINSTANCE.getReadingTargetModel_ModelName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.AmbiguousTargetModelReferenceImpl <em>Ambiguous Target Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.AmbiguousTargetModelReferenceImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getAmbiguousTargetModelReference()
		 * @generated
		 */
		EClass AMBIGUOUS_TARGET_MODEL_REFERENCE = eINSTANCE.getAmbiguousTargetModelReference();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMBIGUOUS_TARGET_MODEL_REFERENCE__MODEL_NAME = eINSTANCE.getAmbiguousTargetModelReference_ModelName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoModelFoundImpl <em>No Model Found</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.NoModelFoundImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoModelFound()
		 * @generated
		 */
		EClass NO_MODEL_FOUND = eINSTANCE.getNoModelFound();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_MODEL_FOUND__MODEL_NAME = eINSTANCE.getNoModelFound_ModelName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.WrongTypeImpl <em>Wrong Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.WrongTypeImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getWrongType()
		 * @generated
		 */
		EClass WRONG_TYPE = eINSTANCE.getWrongType();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.IteratorBodyWrongTypeImpl <em>Iterator Body Wrong Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.IteratorBodyWrongTypeImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getIteratorBodyWrongType()
		 * @generated
		 */
		EClass ITERATOR_BODY_WRONG_TYPE = eINSTANCE.getIteratorBodyWrongType();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.MatchedRuleWithoutOutputPatternImpl <em>Matched Rule Without Output Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.MatchedRuleWithoutOutputPatternImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getMatchedRuleWithoutOutputPattern()
		 * @generated
		 */
		EClass MATCHED_RULE_WITHOUT_OUTPUT_PATTERN = eINSTANCE.getMatchedRuleWithoutOutputPattern();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.ExpectedCollectionInForEachImpl <em>Expected Collection In For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.ExpectedCollectionInForEachImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getExpectedCollectionInForEach()
		 * @generated
		 */
		EClass EXPECTED_COLLECTION_IN_FOR_EACH = eINSTANCE.getExpectedCollectionInForEach();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.NoClassFoundInMetamodelImpl <em>No Class Found In Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.NoClassFoundInMetamodelImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getNoClassFoundInMetamodel()
		 * @generated
		 */
		EClass NO_CLASS_FOUND_IN_METAMODEL = eINSTANCE.getNoClassFoundInMetamodel();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_CLASS_FOUND_IN_METAMODEL__CLASS_NAME = eINSTANCE.getNoClassFoundInMetamodel_ClassName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.InvalidArgumentImpl <em>Invalid Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.InvalidArgumentImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getInvalidArgument()
		 * @generated
		 */
		EClass INVALID_ARGUMENT = eINSTANCE.getInvalidArgument();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.CollectionOperationNotFoundImpl <em>Collection Operation Not Found</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.CollectionOperationNotFoundImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getCollectionOperationNotFound()
		 * @generated
		 */
		EClass COLLECTION_OPERATION_NOT_FOUND = eINSTANCE.getCollectionOperationNotFound();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_OPERATION_NOT_FOUND__OPERATION_NAME = eINSTANCE.getCollectionOperationNotFound_OperationName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_error.impl.IteratorOverNoCollectionTypeImpl <em>Iterator Over No Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_error.impl.IteratorOverNoCollectionTypeImpl
		 * @see bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl#getIteratorOverNoCollectionType()
		 * @generated
		 */
		EClass ITERATOR_OVER_NO_COLLECTION_TYPE = eINSTANCE.getIteratorOverNoCollectionType();

		/**
		 * The meta object literal for the '<em><b>Iterator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_OVER_NO_COLLECTION_TYPE__ITERATOR_NAME = eINSTANCE.getIteratorOverNoCollectionType_IteratorName();

	}

} //AtlErrorsPackage

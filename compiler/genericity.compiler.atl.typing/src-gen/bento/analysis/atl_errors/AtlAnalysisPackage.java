/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_errors;

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
 * @see bento.analysis.atl_errors.AtlAnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface AtlAnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atl_errors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/analysis/atl/errors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl_errors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlAnalysisPackage eINSTANCE = bento.analysis.atl_errors.impl.AtlAnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.analysis.atl_errors.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_errors.impl.AnalysisResultImpl
	 * @see bento.analysis.atl_errors.impl.AtlAnalysisPackageImpl#getAnalysisResult()
	 * @generated
	 */
	int ANALYSIS_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT__ERRORS = 0;

	/**
	 * The number of structural features of the '<em>Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_errors.impl.AnalysisInfoImpl <em>Analysis Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_errors.impl.AnalysisInfoImpl
	 * @see bento.analysis.atl_errors.impl.AtlAnalysisPackageImpl#getAnalysisInfo()
	 * @generated
	 */
	int ANALYSIS_INFO = 1;

	/**
	 * The number of structural features of the '<em>Analysis Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_INFO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_errors.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_errors.impl.ErrorImpl
	 * @see bento.analysis.atl_errors.impl.AtlAnalysisPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 2;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = ANALYSIS_INFO_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_errors.AnalysisResult <em>Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Result</em>'.
	 * @see bento.analysis.atl_errors.AnalysisResult
	 * @generated
	 */
	EClass getAnalysisResult();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.analysis.atl_errors.AnalysisResult#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errors</em>'.
	 * @see bento.analysis.atl_errors.AnalysisResult#getErrors()
	 * @see #getAnalysisResult()
	 * @generated
	 */
	EReference getAnalysisResult_Errors();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_errors.AnalysisInfo <em>Analysis Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Info</em>'.
	 * @see bento.analysis.atl_errors.AnalysisInfo
	 * @generated
	 */
	EClass getAnalysisInfo();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_errors.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see bento.analysis.atl_errors.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtlAnalysisFactory getAtlAnalysisFactory();

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
		 * The meta object literal for the '{@link bento.analysis.atl_errors.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_errors.impl.AnalysisResultImpl
		 * @see bento.analysis.atl_errors.impl.AtlAnalysisPackageImpl#getAnalysisResult()
		 * @generated
		 */
		EClass ANALYSIS_RESULT = eINSTANCE.getAnalysisResult();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_RESULT__ERRORS = eINSTANCE.getAnalysisResult_Errors();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_errors.impl.AnalysisInfoImpl <em>Analysis Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_errors.impl.AnalysisInfoImpl
		 * @see bento.analysis.atl_errors.impl.AtlAnalysisPackageImpl#getAnalysisInfo()
		 * @generated
		 */
		EClass ANALYSIS_INFO = eINSTANCE.getAnalysisInfo();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_errors.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_errors.impl.ErrorImpl
		 * @see bento.analysis.atl_errors.impl.AtlAnalysisPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

	}

} //AtlAnalysisPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis;

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
 * @see bento.analysis.atl_analysis.AtlAnalysisFactory
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
	String eNAME = "atl_analysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/analysis/atl/analysis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl_analysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlAnalysisPackage eINSTANCE = bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.impl.AnalysisResultImpl
	 * @see bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl#getAnalysisResult()
	 * @generated
	 */
	int ANALYSIS_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT__PROBLEMS = 0;

	/**
	 * The number of structural features of the '<em>Analysis Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_RESULT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.impl.AnalysisInfoImpl <em>Analysis Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.impl.AnalysisInfoImpl
	 * @see bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl#getAnalysisInfo()
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
	 * The meta object id for the '{@link bento.analysis.atl_analysis.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.impl.ProblemImpl
	 * @see bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 2;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = ANALYSIS_INFO_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.impl.RecoveryImpl <em>Recovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.impl.RecoveryImpl
	 * @see bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl#getRecovery()
	 * @generated
	 */
	int RECOVERY = 3;

	/**
	 * The number of structural features of the '<em>Recovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.AnalysisResult <em>Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Result</em>'.
	 * @see bento.analysis.atl_analysis.AnalysisResult
	 * @generated
	 */
	EClass getAnalysisResult();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.analysis.atl_analysis.AnalysisResult#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see bento.analysis.atl_analysis.AnalysisResult#getProblems()
	 * @see #getAnalysisResult()
	 * @generated
	 */
	EReference getAnalysisResult_Problems();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.AnalysisInfo <em>Analysis Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Info</em>'.
	 * @see bento.analysis.atl_analysis.AnalysisInfo
	 * @generated
	 */
	EClass getAnalysisInfo();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see bento.analysis.atl_analysis.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.Recovery <em>Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recovery</em>'.
	 * @see bento.analysis.atl_analysis.Recovery
	 * @generated
	 */
	EClass getRecovery();

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
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.impl.AnalysisResultImpl <em>Analysis Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.impl.AnalysisResultImpl
		 * @see bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl#getAnalysisResult()
		 * @generated
		 */
		EClass ANALYSIS_RESULT = eINSTANCE.getAnalysisResult();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_RESULT__PROBLEMS = eINSTANCE.getAnalysisResult_Problems();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.impl.AnalysisInfoImpl <em>Analysis Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.impl.AnalysisInfoImpl
		 * @see bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl#getAnalysisInfo()
		 * @generated
		 */
		EClass ANALYSIS_INFO = eINSTANCE.getAnalysisInfo();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.impl.ProblemImpl
		 * @see bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.impl.RecoveryImpl <em>Recovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.impl.RecoveryImpl
		 * @see bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl#getRecovery()
		 * @generated
		 */
		EClass RECOVERY = eINSTANCE.getRecovery();

	}

} //AtlAnalysisPackage

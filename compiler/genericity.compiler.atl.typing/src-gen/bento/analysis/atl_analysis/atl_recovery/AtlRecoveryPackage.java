/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_recovery;

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
 * @see bento.analysis.atl_analysis.atl_recovery.AtlRecoveryFactory
 * @model kind="package"
 * @generated
 */
public interface AtlRecoveryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atl_recovery";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/analysis/atl/analysis/recovery";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl_recovery";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlRecoveryPackage eINSTANCE = bento.analysis.atl_analysis.atl_recovery.impl.AtlRecoveryPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_recovery.impl.FeatureFoundInSubclassImpl <em>Feature Found In Subclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_recovery.impl.FeatureFoundInSubclassImpl
	 * @see bento.analysis.atl_analysis.atl_recovery.impl.AtlRecoveryPackageImpl#getFeatureFoundInSubclass()
	 * @generated
	 */
	int FEATURE_FOUND_IN_SUBCLASS = 0;

	/**
	 * The feature id for the '<em><b>Subclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FOUND_IN_SUBCLASS__SUBCLASS_NAME = AtlAnalysisPackage.RECOVERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Found In Subclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FOUND_IN_SUBCLASS_FEATURE_COUNT = AtlAnalysisPackage.RECOVERY_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.analysis.atl_analysis.atl_recovery.impl.TentativeTypeAssignedImpl <em>Tentative Type Assigned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.analysis.atl_analysis.atl_recovery.impl.TentativeTypeAssignedImpl
	 * @see bento.analysis.atl_analysis.atl_recovery.impl.AtlRecoveryPackageImpl#getTentativeTypeAssigned()
	 * @generated
	 */
	int TENTATIVE_TYPE_ASSIGNED = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTATIVE_TYPE_ASSIGNED__TYPE = AtlAnalysisPackage.RECOVERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tentative Type Assigned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTATIVE_TYPE_ASSIGNED_FEATURE_COUNT = AtlAnalysisPackage.RECOVERY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass <em>Feature Found In Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Found In Subclass</em>'.
	 * @see bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass
	 * @generated
	 */
	EClass getFeatureFoundInSubclass();

	/**
	 * Returns the meta object for the attribute '{@link bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass#getSubclassName <em>Subclass Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subclass Name</em>'.
	 * @see bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass#getSubclassName()
	 * @see #getFeatureFoundInSubclass()
	 * @generated
	 */
	EAttribute getFeatureFoundInSubclass_SubclassName();

	/**
	 * Returns the meta object for class '{@link bento.analysis.atl_analysis.atl_recovery.TentativeTypeAssigned <em>Tentative Type Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tentative Type Assigned</em>'.
	 * @see bento.analysis.atl_analysis.atl_recovery.TentativeTypeAssigned
	 * @generated
	 */
	EClass getTentativeTypeAssigned();

	/**
	 * Returns the meta object for the reference '{@link bento.analysis.atl_analysis.atl_recovery.TentativeTypeAssigned#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see bento.analysis.atl_analysis.atl_recovery.TentativeTypeAssigned#getType()
	 * @see #getTentativeTypeAssigned()
	 * @generated
	 */
	EReference getTentativeTypeAssigned_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtlRecoveryFactory getAtlRecoveryFactory();

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
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_recovery.impl.FeatureFoundInSubclassImpl <em>Feature Found In Subclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_recovery.impl.FeatureFoundInSubclassImpl
		 * @see bento.analysis.atl_analysis.atl_recovery.impl.AtlRecoveryPackageImpl#getFeatureFoundInSubclass()
		 * @generated
		 */
		EClass FEATURE_FOUND_IN_SUBCLASS = eINSTANCE.getFeatureFoundInSubclass();

		/**
		 * The meta object literal for the '<em><b>Subclass Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_FOUND_IN_SUBCLASS__SUBCLASS_NAME = eINSTANCE.getFeatureFoundInSubclass_SubclassName();

		/**
		 * The meta object literal for the '{@link bento.analysis.atl_analysis.atl_recovery.impl.TentativeTypeAssignedImpl <em>Tentative Type Assigned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.analysis.atl_analysis.atl_recovery.impl.TentativeTypeAssignedImpl
		 * @see bento.analysis.atl_analysis.atl_recovery.impl.AtlRecoveryPackageImpl#getTentativeTypeAssigned()
		 * @generated
		 */
		EClass TENTATIVE_TYPE_ASSIGNED = eINSTANCE.getTentativeTypeAssigned();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTATIVE_TYPE_ASSIGNED__TYPE = eINSTANCE.getTentativeTypeAssigned_Type();

	}

} //AtlRecoveryPackage

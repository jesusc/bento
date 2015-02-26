/**
 */
package bento.language.bentocomp.variants;

import bento.language.bentocomp.core.CorePackage;

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
 * @see bento.language.bentocomp.variants.VariantsFactory
 * @model kind="package"
 * @generated
 */
public interface VariantsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variants";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.miso.es/bento/bentocomp/variants";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bentocomp_variants";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariantsPackage eINSTANCE = bento.language.bentocomp.variants.impl.VariantsPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.variants.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.variants.impl.ParameterImpl
	 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.variants.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.variants.impl.FeatureImpl
	 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = PARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.variants.impl.SingleFeatureImpl <em>Single Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.variants.impl.SingleFeatureImpl
	 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getSingleFeature()
	 * @generated
	 */
	int SINGLE_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Single Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.variants.impl.CompositeFeatureImpl <em>Composite Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.variants.impl.CompositeFeatureImpl
	 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getCompositeFeature()
	 * @generated
	 */
	int COMPOSITE_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE__CHILDREN = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.variants.impl.XorFeatureImpl <em>Xor Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.variants.impl.XorFeatureImpl
	 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getXorFeature()
	 * @generated
	 */
	int XOR_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE__NAME = COMPOSITE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE__CHILDREN = COMPOSITE_FEATURE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Xor Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_FEATURE_COUNT = COMPOSITE_FEATURE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.variants.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see bento.language.bentocomp.variants.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.variants.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see bento.language.bentocomp.variants.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.variants.SingleFeature <em>Single Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Feature</em>'.
	 * @see bento.language.bentocomp.variants.SingleFeature
	 * @generated
	 */
	EClass getSingleFeature();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.variants.CompositeFeature <em>Composite Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Feature</em>'.
	 * @see bento.language.bentocomp.variants.CompositeFeature
	 * @generated
	 */
	EClass getCompositeFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.variants.CompositeFeature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see bento.language.bentocomp.variants.CompositeFeature#getChildren()
	 * @see #getCompositeFeature()
	 * @generated
	 */
	EReference getCompositeFeature_Children();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.variants.XorFeature <em>Xor Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Feature</em>'.
	 * @see bento.language.bentocomp.variants.XorFeature
	 * @generated
	 */
	EClass getXorFeature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariantsFactory getVariantsFactory();

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
		 * The meta object literal for the '{@link bento.language.bentocomp.variants.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.variants.impl.ParameterImpl
		 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.variants.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.variants.impl.FeatureImpl
		 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.variants.impl.SingleFeatureImpl <em>Single Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.variants.impl.SingleFeatureImpl
		 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getSingleFeature()
		 * @generated
		 */
		EClass SINGLE_FEATURE = eINSTANCE.getSingleFeature();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.variants.impl.CompositeFeatureImpl <em>Composite Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.variants.impl.CompositeFeatureImpl
		 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getCompositeFeature()
		 * @generated
		 */
		EClass COMPOSITE_FEATURE = eINSTANCE.getCompositeFeature();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_FEATURE__CHILDREN = eINSTANCE.getCompositeFeature_Children();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.variants.impl.XorFeatureImpl <em>Xor Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.variants.impl.XorFeatureImpl
		 * @see bento.language.bentocomp.variants.impl.VariantsPackageImpl#getXorFeature()
		 * @generated
		 */
		EClass XOR_FEATURE = eINSTANCE.getXorFeature();

	}

} //VariantsPackage

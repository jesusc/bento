/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see genericity.language.gcomponent.GcomponentFactory
 * @model kind="package"
 * @generated
 */
public interface GcomponentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gcomponent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/language/gcomponent";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gcomponent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GcomponentPackage eINSTANCE = genericity.language.gcomponent.impl.GcomponentPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.DummyClassImpl <em>Dummy Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.DummyClassImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getDummyClass()
	 * @generated
	 */
	int DUMMY_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Dummy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.DummyClass <em>Dummy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Class</em>'.
	 * @see genericity.language.gcomponent.DummyClass
	 * @generated
	 */
	EClass getDummyClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GcomponentFactory getGcomponentFactory();

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
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.DummyClassImpl <em>Dummy Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.DummyClassImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getDummyClass()
		 * @generated
		 */
		EClass DUMMY_CLASS = eINSTANCE.getDummyClass();

	}

} //GcomponentPackage

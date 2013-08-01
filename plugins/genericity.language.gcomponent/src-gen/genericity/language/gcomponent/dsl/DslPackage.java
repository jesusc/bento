/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.dsl;

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
 * @see genericity.language.gcomponent.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/language/gcomponent/dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gcomponent_dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslPackage eINSTANCE = genericity.language.gcomponent.dsl.impl.DslPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.dsl.impl.DefinitionRootImpl <em>Definition Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.dsl.impl.DefinitionRootImpl
	 * @see genericity.language.gcomponent.dsl.impl.DslPackageImpl#getDefinitionRoot()
	 * @generated
	 */
	int DEFINITION_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ROOT__COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Definition Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ROOT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.dsl.DefinitionRoot <em>Definition Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Root</em>'.
	 * @see genericity.language.gcomponent.dsl.DefinitionRoot
	 * @generated
	 */
	EClass getDefinitionRoot();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.language.gcomponent.dsl.DefinitionRoot#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see genericity.language.gcomponent.dsl.DefinitionRoot#getComponent()
	 * @see #getDefinitionRoot()
	 * @generated
	 */
	EReference getDefinitionRoot_Component();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslFactory getDslFactory();

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
		 * The meta object literal for the '{@link genericity.language.gcomponent.dsl.impl.DefinitionRootImpl <em>Definition Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.dsl.impl.DefinitionRootImpl
		 * @see genericity.language.gcomponent.dsl.impl.DslPackageImpl#getDefinitionRoot()
		 * @generated
		 */
		EClass DEFINITION_ROOT = eINSTANCE.getDefinitionRoot();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_ROOT__COMPONENT = eINSTANCE.getDefinitionRoot_Component();

	}

} //DslPackage

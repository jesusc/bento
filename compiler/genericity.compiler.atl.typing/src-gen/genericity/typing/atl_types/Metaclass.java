/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metaclass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.Metaclass#getName <em>Name</em>}</li>
 *   <li>{@link genericity.typing.atl_types.Metaclass#isExplicitOcurrence <em>Explicit Ocurrence</em>}</li>
 *   <li>{@link genericity.typing.atl_types.Metaclass#getKlass <em>Klass</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.AtlTypingPackage#getMetaclass()
 * @model
 * @generated
 */
public interface Metaclass extends RefType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see genericity.typing.atl_types.AtlTypingPackage#getMetaclass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.Metaclass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Explicit Ocurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Ocurrence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Ocurrence</em>' attribute.
	 * @see #setExplicitOcurrence(boolean)
	 * @see genericity.typing.atl_types.AtlTypingPackage#getMetaclass_ExplicitOcurrence()
	 * @model
	 * @generated
	 */
	boolean isExplicitOcurrence();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.Metaclass#isExplicitOcurrence <em>Explicit Ocurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Ocurrence</em>' attribute.
	 * @see #isExplicitOcurrence()
	 * @generated
	 */
	void setExplicitOcurrence(boolean value);

	/**
	 * Returns the value of the '<em><b>Klass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klass</em>' reference.
	 * @see #setKlass(EClass)
	 * @see genericity.typing.atl_types.AtlTypingPackage#getMetaclass_Klass()
	 * @model required="true"
	 * @generated
	 */
	EClass getKlass();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.Metaclass#getKlass <em>Klass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klass</em>' reference.
	 * @see #getKlass()
	 * @generated
	 */
	void setKlass(EClass value);

} // Metaclass
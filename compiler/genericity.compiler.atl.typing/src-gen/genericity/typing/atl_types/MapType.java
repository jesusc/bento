/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.MapType#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.MapType#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.AtlTypingPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends Type {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' reference.
	 * @see #setKeyType(Type)
	 * @see genericity.typing.atl_types.AtlTypingPackage#getMapType_KeyType()
	 * @model required="true"
	 * @generated
	 */
	Type getKeyType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.MapType#getKeyType <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(Type value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(Type)
	 * @see genericity.typing.atl_types.AtlTypingPackage#getMapType_ValueType()
	 * @model required="true"
	 * @generated
	 */
	Type getValueType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.MapType#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(Type value);

} // MapType

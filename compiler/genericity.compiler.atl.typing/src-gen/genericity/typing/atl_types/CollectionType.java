/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.CollectionType#getContainedType <em>Contained Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.AtlTypingPackage#getCollectionType()
 * @model abstract="true"
 * @generated
 */
public interface CollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Type</em>' reference.
	 * @see #setContainedType(Type)
	 * @see genericity.typing.atl_types.AtlTypingPackage#getCollectionType_ContainedType()
	 * @model required="true"
	 * @generated
	 */
	Type getContainedType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.CollectionType#getContainedType <em>Contained Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Type</em>' reference.
	 * @see #getContainedType()
	 * @generated
	 */
	void setContainedType(Type value);

} // CollectionType

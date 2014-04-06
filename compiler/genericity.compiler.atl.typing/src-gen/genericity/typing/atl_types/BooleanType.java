/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.BooleanType#getKindOfTypes <em>Kind Of Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.AtlTypingPackage#getBooleanType()
 * @model
 * @generated
 */
public interface BooleanType extends PrimitiveType {
	/**
	 * Returns the value of the '<em><b>Kind Of Types</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.Metaclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Of Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Types</em>' reference list.
	 * @see genericity.typing.atl_types.AtlTypingPackage#getBooleanType_KindOfTypes()
	 * @model
	 * @generated
	 */
	EList<Metaclass> getKindOfTypes();

} // BooleanType

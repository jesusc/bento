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
 * A representation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.UnionType#getPossibleTypes <em>Possible Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.AtlTypingPackage#getUnionType()
 * @model
 * @generated
 */
public interface UnionType extends Type {
	/**
	 * Returns the value of the '<em><b>Possible Types</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Types</em>' reference list.
	 * @see genericity.typing.atl_types.AtlTypingPackage#getUnionType_PossibleTypes()
	 * @model
	 * @generated
	 */
	EList<Type> getPossibleTypes();

} // UnionType

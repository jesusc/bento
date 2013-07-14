/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import gbind.simpleocl.Primitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.VirtualAttribute#getType_ <em>Type </em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getVirtualAttribute()
 * @model
 * @generated
 */
public interface VirtualAttribute extends VirtualFeature {
	/**
	 * Returns the value of the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type </em>' containment reference.
	 * @see #setType_(Primitive)
	 * @see gbind.dsl.DslPackage#getVirtualAttribute_Type_()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Primitive getType_();

	/**
	 * Sets the value of the '{@link gbind.dsl.VirtualAttribute#getType_ <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type </em>' containment reference.
	 * @see #getType_()
	 * @generated
	 */
	void setType_(Primitive value);

} // VirtualAttribute

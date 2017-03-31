/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.VirtualReference#getType_ <em>Type </em>}</li>
 * </ul>
 *
 * @see gbind.dsl.DslPackage#getVirtualReference()
 * @model
 * @generated
 */
public interface VirtualReference extends VirtualFeature {
	/**
	 * Returns the value of the '<em><b>Type </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type </em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type </em>' reference.
	 * @see #setType_(ConcreteMetaclass)
	 * @see gbind.dsl.DslPackage#getVirtualReference_Type_()
	 * @model required="true"
	 * @generated
	 */
	ConcreteMetaclass getType_();

	/**
	 * Sets the value of the '{@link gbind.dsl.VirtualReference#getType_ <em>Type </em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type </em>' reference.
	 * @see #getType_()
	 * @generated
	 */
	void setType_(ConcreteMetaclass value);

} // VirtualReference

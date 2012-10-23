/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.LocalHelper#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getLocalHelper()
 * @model
 * @generated
 */
public interface LocalHelper extends BaseHelper {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ConcreteMetaclass)
	 * @see gbind.dsl.DslPackage#getLocalHelper_Context()
	 * @model
	 * @generated
	 */
	ConcreteMetaclass getContext();

	/**
	 * Sets the value of the '{@link gbind.dsl.LocalHelper#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ConcreteMetaclass value);

} // LocalHelper

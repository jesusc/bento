/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.flowcontrol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getCalledModelName <em>Called Model Name</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getBindingName <em>Binding Name</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getCalleeModelName <em>Callee Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter()
 * @model
 * @generated
 */
public interface ApplyParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Called Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Model Name</em>' attribute.
	 * @see #setCalledModelName(String)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter_CalledModelName()
	 * @model required="true"
	 * @generated
	 */
	String getCalledModelName();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getCalledModelName <em>Called Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Model Name</em>' attribute.
	 * @see #getCalledModelName()
	 * @generated
	 */
	void setCalledModelName(String value);

	/**
	 * Returns the value of the '<em><b>Binding Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Name</em>' attribute.
	 * @see #setBindingName(String)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter_BindingName()
	 * @model required="true"
	 * @generated
	 */
	String getBindingName();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getBindingName <em>Binding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Name</em>' attribute.
	 * @see #getBindingName()
	 * @generated
	 */
	void setBindingName(String value);

	/**
	 * Returns the value of the '<em><b>Callee Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee Model Name</em>' attribute.
	 * @see #setCalleeModelName(String)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter_CalleeModelName()
	 * @model required="true"
	 * @generated
	 */
	String getCalleeModelName();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getCalleeModelName <em>Callee Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee Model Name</em>' attribute.
	 * @see #getCalleeModelName()
	 * @generated
	 */
	void setCalleeModelName(String value);

} // ApplyParameter

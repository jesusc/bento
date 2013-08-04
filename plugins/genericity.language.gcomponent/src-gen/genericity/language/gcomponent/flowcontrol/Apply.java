/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.flowcontrol;

import genericity.language.gcomponent.core.Component;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.Apply#getComponent <em>Component</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.Apply#getInputModels <em>Input Models</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.Apply#getOutputModels <em>Output Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApply()
 * @model
 * @generated
 */
public interface Apply extends CompositionStep {

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApply_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.Apply#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Input Models</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.flowcontrol.ApplyParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Models</em>' containment reference list.
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApply_InputModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyParameter> getInputModels();

	/**
	 * Returns the value of the '<em><b>Output Models</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.flowcontrol.ApplyParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Models</em>' containment reference list.
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApply_OutputModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyParameter> getOutputModels();
} // Apply

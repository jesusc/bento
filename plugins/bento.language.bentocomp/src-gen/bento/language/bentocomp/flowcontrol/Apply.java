/**
 */
package bento.language.bentocomp.flowcontrol;

import bento.language.bentocomp.core.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.flowcontrol.Apply#getComponent <em>Component</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.Apply#getInputModels <em>Input Models</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.Apply#getOutputModels <em>Output Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApply()
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
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApply_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.Apply#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Input Models</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.flowcontrol.ApplyParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Models</em>' containment reference list.
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApply_InputModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyParameter> getInputModels();

	/**
	 * Returns the value of the '<em><b>Output Models</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.flowcontrol.ApplyParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Models</em>' containment reference list.
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApply_OutputModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyParameter> getOutputModels();

} // Apply

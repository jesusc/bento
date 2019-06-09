/**
 */
package bento.sirius.tests.uiflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.uiflow.FlowTransition#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.uiflow.UiflowPackage#getFlowTransition()
 * @model
 * @generated
 */
public interface FlowTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(FlowElement)
	 * @see bento.sirius.tests.uiflow.UiflowPackage#getFlowTransition_Element()
	 * @model required="true"
	 * @generated
	 */
	FlowElement getElement();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.uiflow.FlowTransition#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(FlowElement value);

} // FlowTransition

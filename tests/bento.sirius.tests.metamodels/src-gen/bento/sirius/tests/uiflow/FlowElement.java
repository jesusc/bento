/**
 */
package bento.sirius.tests.uiflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.uiflow.FlowElement#getName <em>Name</em>}</li>
 *   <li>{@link bento.sirius.tests.uiflow.FlowElement#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.uiflow.UiflowPackage#getFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface FlowElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bento.sirius.tests.uiflow.UiflowPackage#getFlowElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.uiflow.FlowElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.uiflow.FlowTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference list.
	 * @see bento.sirius.tests.uiflow.UiflowPackage#getFlowElement_Next()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowTransition> getNext();

} // FlowElement

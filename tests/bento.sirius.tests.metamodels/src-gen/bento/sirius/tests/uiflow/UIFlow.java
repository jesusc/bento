/**
 */
package bento.sirius.tests.uiflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.uiflow.UIFlow#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.uiflow.UiflowPackage#getUIFlow()
 * @model
 * @generated
 */
public interface UIFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.uiflow.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see bento.sirius.tests.uiflow.UiflowPackage#getUIFlow_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getElements();

} // UIFlow

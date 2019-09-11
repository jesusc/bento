/**
 */
package workflow_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow_bdsl.FinalTask#isIsTerminating <em>Is Terminating</em>}</li>
 *   <li>{@link workflow_bdsl.FinalTask#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link workflow_bdsl.FinalTask#getContainsisTerminatingFinalTask <em>Containsis Terminating Final Task</em>}</li>
 *   <li>{@link workflow_bdsl.FinalTask#getContainsisMandatoryFinalTask <em>Containsis Mandatory Final Task</em>}</li>
 * </ul>
 *
 * @see workflow_bdsl.Workflow_bdslPackage#getFinalTask()
 * @model annotation="cardinality min='0' max='*'"
 * @generated
 */
public interface FinalTask extends Node, BindingElement {
	/**
	 * Returns the value of the '<em><b>Is Terminating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Terminating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Terminating</em>' attribute.
	 * @see #setIsTerminating(boolean)
	 * @see workflow_bdsl.Workflow_bdslPackage#getFinalTask_IsTerminating()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsTerminating();

	/**
	 * Sets the value of the '{@link workflow_bdsl.FinalTask#isIsTerminating <em>Is Terminating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Terminating</em>' attribute.
	 * @see #isIsTerminating()
	 * @generated
	 */
	void setIsTerminating(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(boolean)
	 * @see workflow_bdsl.Workflow_bdslPackage#getFinalTask_IsMandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link workflow_bdsl.FinalTask#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Containsis Terminating Final Task</b></em>' containment reference list.
	 * The list contents are of type {@link workflow_bdsl.isTerminatingFinalTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsis Terminating Final Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsis Terminating Final Task</em>' containment reference list.
	 * @see workflow_bdsl.Workflow_bdslPackage#getFinalTask_ContainsisTerminatingFinalTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<isTerminatingFinalTask> getContainsisTerminatingFinalTask();

	/**
	 * Returns the value of the '<em><b>Containsis Mandatory Final Task</b></em>' containment reference list.
	 * The list contents are of type {@link workflow_bdsl.isMandatoryFinalTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsis Mandatory Final Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsis Mandatory Final Task</em>' containment reference list.
	 * @see workflow_bdsl.Workflow_bdslPackage#getFinalTask_ContainsisMandatoryFinalTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<isMandatoryFinalTask> getContainsisMandatoryFinalTask();

} // FinalTask

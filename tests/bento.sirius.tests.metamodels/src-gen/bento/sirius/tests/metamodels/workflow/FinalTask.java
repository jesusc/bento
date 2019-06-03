/**
 */
package bento.sirius.tests.metamodels.workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.FinalTask#isIsTerminating <em>Is Terminating</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.FinalTask#isIsMandatory <em>Is Mandatory</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFinalTask()
 * @model annotation="cardinality min='0' max='*'"
 * @generated
 */
public interface FinalTask extends Node {
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
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFinalTask_IsTerminating()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsTerminating();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.workflow.FinalTask#isIsTerminating <em>Is Terminating</em>}' attribute.
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
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFinalTask_IsMandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.workflow.FinalTask#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

} // FinalTask

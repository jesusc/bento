/**
 */
package workflow_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workflow_bdsl.Task#getName <em>Name</em>}</li>
 *   <li>{@link workflow_bdsl.Task#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link workflow_bdsl.Task#getContainsnameTask <em>Containsname Task</em>}</li>
 *   <li>{@link workflow_bdsl.Task#getContainsisInitialTask <em>Containsis Initial Task</em>}</li>
 * </ul>
 *
 * @see workflow_bdsl.Workflow_bdslPackage#getTask()
 * @model annotation="cardinality min='0' max='*'"
 * @generated
 */
public interface Task extends Node, BindingElement {
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
	 * @see workflow_bdsl.Workflow_bdslPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow_bdsl.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see workflow_bdsl.Workflow_bdslPackage#getTask_IsInitial()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link workflow_bdsl.Task#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Containsname Task</b></em>' containment reference list.
	 * The list contents are of type {@link workflow_bdsl.nameTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Task</em>' containment reference list.
	 * @see workflow_bdsl.Workflow_bdslPackage#getTask_ContainsnameTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameTask> getContainsnameTask();

	/**
	 * Returns the value of the '<em><b>Containsis Initial Task</b></em>' containment reference list.
	 * The list contents are of type {@link workflow_bdsl.isInitialTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsis Initial Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsis Initial Task</em>' containment reference list.
	 * @see workflow_bdsl.Workflow_bdslPackage#getTask_ContainsisInitialTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<isInitialTask> getContainsisInitialTask();

} // Task

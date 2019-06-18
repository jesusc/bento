/**
 */
package bento.sirius.tests.metamodels.stepeasy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Easy Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.stepeasy.StepEasyMachine#getTasks <em>Tasks</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.stepeasy.StepEasyMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.stepeasy.StepeasyPackage#getStepEasyMachine()
 * @model annotation="http://www.eclipse.org/ocl/examples/OCL invName='self.tasks-&gt;select(t | t.oclIsKindOf(Task)) = 1'"
 * @generated
 */
public interface StepEasyMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.stepeasy.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.stepeasy.StepeasyPackage#getStepEasyMachine_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.stepeasy.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.stepeasy.StepeasyPackage#getStepEasyMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // StepEasyMachine

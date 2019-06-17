/**
 */
package bento.sirius.tests.metamodels.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.Node#getOuts <em>Outs</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.Node#getIns <em>Ins</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Outs</b></em>' reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.workflow.FlowEdge}.
	 * It is bidirectional and its opposite is '{@link bento.sirius.tests.metamodels.workflow.FlowEdge#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outs</em>' reference list.
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getNode_Outs()
	 * @see bento.sirius.tests.metamodels.workflow.FlowEdge#getIn
	 * @model opposite="in"
	 * @generated
	 */
	EList<FlowEdge> getOuts();

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.workflow.FlowEdge}.
	 * It is bidirectional and its opposite is '{@link bento.sirius.tests.metamodels.workflow.FlowEdge#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' reference list.
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getNode_Ins()
	 * @see bento.sirius.tests.metamodels.workflow.FlowEdge#getOut
	 * @model opposite="out"
	 * @generated
	 */
	EList<FlowEdge> getIns();

} // Node

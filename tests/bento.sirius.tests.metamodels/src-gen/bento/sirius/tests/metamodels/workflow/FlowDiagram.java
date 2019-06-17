/**
 */
package bento.sirius.tests.metamodels.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.FlowDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.FlowDiagram#getEdges <em>Edges</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.FlowDiagram#isIsFinalMandatory <em>Is Final Mandatory</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFlowDiagram()
 * @model
 * @generated
 */
public interface FlowDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.workflow.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFlowDiagram_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.workflow.FlowEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFlowDiagram_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Is Final Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final Mandatory</em>' attribute.
	 * @see #setIsFinalMandatory(boolean)
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFlowDiagram_IsFinalMandatory()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsFinalMandatory();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.workflow.FlowDiagram#isIsFinalMandatory <em>Is Final Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final Mandatory</em>' attribute.
	 * @see #isIsFinalMandatory()
	 * @generated
	 */
	void setIsFinalMandatory(boolean value);

} // FlowDiagram

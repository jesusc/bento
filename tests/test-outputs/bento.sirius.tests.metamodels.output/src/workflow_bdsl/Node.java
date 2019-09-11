/**
 */
package workflow_bdsl;

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
 *   <li>{@link workflow_bdsl.Node#getOuts <em>Outs</em>}</li>
 *   <li>{@link workflow_bdsl.Node#getIns <em>Ins</em>}</li>
 * </ul>
 *
 * @see workflow_bdsl.Workflow_bdslPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Outs</b></em>' reference list.
	 * The list contents are of type {@link workflow_bdsl.FlowEdge}.
	 * It is bidirectional and its opposite is '{@link workflow_bdsl.FlowEdge#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outs</em>' reference list.
	 * @see workflow_bdsl.Workflow_bdslPackage#getNode_Outs()
	 * @see workflow_bdsl.FlowEdge#getIn
	 * @model opposite="in"
	 * @generated
	 */
	EList<FlowEdge> getOuts();

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' reference list.
	 * The list contents are of type {@link workflow_bdsl.FlowEdge}.
	 * It is bidirectional and its opposite is '{@link workflow_bdsl.FlowEdge#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' reference list.
	 * @see workflow_bdsl.Workflow_bdslPackage#getNode_Ins()
	 * @see workflow_bdsl.FlowEdge#getOut
	 * @model opposite="out"
	 * @generated
	 */
	EList<FlowEdge> getIns();

} // Node

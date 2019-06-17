/**
 */
package bento.sirius.tests.metamodels.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.FlowEdge#getIn <em>In</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.FlowEdge#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFlowEdge()
 * @model
 * @generated
 */
public interface FlowEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bento.sirius.tests.metamodels.workflow.Node#getOuts <em>Outs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Node)
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFlowEdge_In()
	 * @see bento.sirius.tests.metamodels.workflow.Node#getOuts
	 * @model opposite="outs"
	 * @generated
	 */
	Node getIn();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.workflow.FlowEdge#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Node value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bento.sirius.tests.metamodels.workflow.Node#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(Node)
	 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage#getFlowEdge_Out()
	 * @see bento.sirius.tests.metamodels.workflow.Node#getIns
	 * @model opposite="ins"
	 * @generated
	 */
	Node getOut();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.workflow.FlowEdge#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(Node value);

} // FlowEdge

/**
 */
package bento.sirius.tests.metamodels.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.graph.GraphModel#getNode <em>Node</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.graph.GraphModel#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.graph.GraphPackage#getGraphModel()
 * @model
 * @generated
 */
public interface GraphModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.graph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.graph.GraphPackage#getGraphModel_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.graph.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.graph.GraphPackage#getGraphModel_Edge()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdge();

} // GraphModel

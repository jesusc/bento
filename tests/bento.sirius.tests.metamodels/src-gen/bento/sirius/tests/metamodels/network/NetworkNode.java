/**
 */
package bento.sirius.tests.metamodels.network;

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
 *   <li>{@link bento.sirius.tests.metamodels.network.NetworkNode#getNodeId <em>Node Id</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkNode()
 * @model abstract="true"
 * @generated
 */
public interface NetworkNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkNode_NodeId()
	 * @model required="true"
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.network.NetworkNode#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(String value);

} // NetworkNode

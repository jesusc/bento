/**
 */
package bento.sirius.tests.metamodels.network;

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
 *   <li>{@link bento.sirius.tests.metamodels.network.NetworkModel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.network.NetworkModel#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkModel()
 * @model
 * @generated
 */
public interface NetworkModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.network.NetworkNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkModel_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.network.NetworkConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkModel_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkConnection> getConnections();

} // NetworkModel

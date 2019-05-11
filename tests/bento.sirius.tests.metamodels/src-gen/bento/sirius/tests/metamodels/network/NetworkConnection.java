/**
 */
package bento.sirius.tests.metamodels.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.network.NetworkConnection#getConnectionId <em>Connection Id</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.network.NetworkConnection#getSource <em>Source</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.network.NetworkConnection#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkConnection()
 * @model
 * @generated
 */
public interface NetworkConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Id</em>' attribute.
	 * @see #setConnectionId(String)
	 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkConnection_ConnectionId()
	 * @model
	 * @generated
	 */
	String getConnectionId();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.network.NetworkConnection#getConnectionId <em>Connection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Id</em>' attribute.
	 * @see #getConnectionId()
	 * @generated
	 */
	void setConnectionId(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NetworkNode)
	 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkConnection_Source()
	 * @model required="true"
	 * @generated
	 */
	NetworkNode getSource();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.network.NetworkConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NetworkNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NetworkNode)
	 * @see bento.sirius.tests.metamodels.network.NetworkPackage#getNetworkConnection_Target()
	 * @model required="true"
	 * @generated
	 */
	NetworkNode getTarget();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.network.NetworkConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NetworkNode value);

} // NetworkConnection

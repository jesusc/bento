/**
 */
package bento.sirius.tests.metamodels.network;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bento.sirius.tests.metamodels.network.NetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "network";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/sirius/tests/network";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "network";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkPackage eINSTANCE = bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.network.impl.NetworkModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.network.impl.NetworkModelImpl
	 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getNetworkModel()
	 * @generated
	 */
	int NETWORK_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_MODEL__NODES = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_MODEL__CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.network.impl.NetworkNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.network.impl.NetworkNodeImpl
	 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getNetworkNode()
	 * @generated
	 */
	int NETWORK_NODE = 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE__NODE_ID = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.network.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.network.impl.ComputerImpl
	 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 2;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__NODE_ID = NETWORK_NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = NETWORK_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = NETWORK_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.network.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.network.impl.RouterImpl
	 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 3;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NODE_ID = NETWORK_NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = NETWORK_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = NETWORK_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.network.impl.NetworkConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.network.impl.NetworkConnectionImpl
	 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getNetworkConnection()
	 * @generated
	 */
	int NETWORK_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Connection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION__CONNECTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.network.NetworkModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkModel
	 * @generated
	 */
	EClass getNetworkModel();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.metamodels.network.NetworkModel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkModel#getNodes()
	 * @see #getNetworkModel()
	 * @generated
	 */
	EReference getNetworkModel_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.metamodels.network.NetworkModel#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkModel#getConnections()
	 * @see #getNetworkModel()
	 * @generated
	 */
	EReference getNetworkModel_Connections();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.network.NetworkNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkNode
	 * @generated
	 */
	EClass getNetworkNode();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.network.NetworkNode#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkNode#getNodeId()
	 * @see #getNetworkNode()
	 * @generated
	 */
	EAttribute getNetworkNode_NodeId();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.network.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see bento.sirius.tests.metamodels.network.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.network.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see bento.sirius.tests.metamodels.network.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.network.NetworkConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkConnection
	 * @generated
	 */
	EClass getNetworkConnection();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.network.NetworkConnection#getConnectionId <em>Connection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Id</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkConnection#getConnectionId()
	 * @see #getNetworkConnection()
	 * @generated
	 */
	EAttribute getNetworkConnection_ConnectionId();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.metamodels.network.NetworkConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkConnection#getSource()
	 * @see #getNetworkConnection()
	 * @generated
	 */
	EReference getNetworkConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.metamodels.network.NetworkConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bento.sirius.tests.metamodels.network.NetworkConnection#getTarget()
	 * @see #getNetworkConnection()
	 * @generated
	 */
	EReference getNetworkConnection_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkFactory getNetworkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.network.impl.NetworkModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.network.impl.NetworkModelImpl
		 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getNetworkModel()
		 * @generated
		 */
		EClass NETWORK_MODEL = eINSTANCE.getNetworkModel();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_MODEL__NODES = eINSTANCE.getNetworkModel_Nodes();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_MODEL__CONNECTIONS = eINSTANCE.getNetworkModel_Connections();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.network.impl.NetworkNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.network.impl.NetworkNodeImpl
		 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getNetworkNode()
		 * @generated
		 */
		EClass NETWORK_NODE = eINSTANCE.getNetworkNode();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_NODE__NODE_ID = eINSTANCE.getNetworkNode_NodeId();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.network.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.network.impl.ComputerImpl
		 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.network.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.network.impl.RouterImpl
		 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.network.impl.NetworkConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.network.impl.NetworkConnectionImpl
		 * @see bento.sirius.tests.metamodels.network.impl.NetworkPackageImpl#getNetworkConnection()
		 * @generated
		 */
		EClass NETWORK_CONNECTION = eINSTANCE.getNetworkConnection();

		/**
		 * The meta object literal for the '<em><b>Connection Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_CONNECTION__CONNECTION_ID = eINSTANCE.getNetworkConnection_ConnectionId();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTION__SOURCE = eINSTANCE.getNetworkConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTION__TARGET = eINSTANCE.getNetworkConnection_Target();

	}

} //NetworkPackage

/**
 */
package bento.sirius.tests.metamodels.linkedlist;

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
 * @see bento.sirius.tests.metamodels.linkedlist.LinkedlistFactory
 * @model kind="package"
 * @generated
 */
public interface LinkedlistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linkedlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/sirius/tests/linked_list";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "linked_list";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkedlistPackage eINSTANCE = bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.LinkedListImpl <em>Linked List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedListImpl
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getLinkedList()
	 * @generated
	 */
	int LINKED_LIST = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_LIST__NODES = 0;

	/**
	 * The number of structural features of the '<em>Linked List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Linked List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.AbstractListNodeImpl <em>Abstract List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.AbstractListNodeImpl
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getAbstractListNode()
	 * @generated
	 */
	int ABSTRACT_LIST_NODE = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIST_NODE__NEXT = 0;

	/**
	 * The number of structural features of the '<em>Abstract List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIST_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIST_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.InitialNodeImpl
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NEXT = ABSTRACT_LIST_NODE__NEXT;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = ABSTRACT_LIST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OPERATION_COUNT = ABSTRACT_LIST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.ListNodeImpl <em>List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.ListNodeImpl
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getListNode()
	 * @generated
	 */
	int LIST_NODE = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_NODE__NEXT = ABSTRACT_LIST_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_NODE__VALUE = ABSTRACT_LIST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_NODE_FEATURE_COUNT = ABSTRACT_LIST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_NODE_OPERATION_COUNT = ABSTRACT_LIST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.FinalNodeImpl
	 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NEXT = ABSTRACT_LIST_NODE__NEXT;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = ABSTRACT_LIST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_OPERATION_COUNT = ABSTRACT_LIST_NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.linkedlist.LinkedList <em>Linked List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked List</em>'.
	 * @see bento.sirius.tests.metamodels.linkedlist.LinkedList
	 * @generated
	 */
	EClass getLinkedList();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.metamodels.linkedlist.LinkedList#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see bento.sirius.tests.metamodels.linkedlist.LinkedList#getNodes()
	 * @see #getLinkedList()
	 * @generated
	 */
	EReference getLinkedList_Nodes();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.linkedlist.AbstractListNode <em>Abstract List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract List Node</em>'.
	 * @see bento.sirius.tests.metamodels.linkedlist.AbstractListNode
	 * @generated
	 */
	EClass getAbstractListNode();

	/**
	 * Returns the meta object for the containment reference '{@link bento.sirius.tests.metamodels.linkedlist.AbstractListNode#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see bento.sirius.tests.metamodels.linkedlist.AbstractListNode#getNext()
	 * @see #getAbstractListNode()
	 * @generated
	 */
	EReference getAbstractListNode_Next();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.linkedlist.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see bento.sirius.tests.metamodels.linkedlist.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.linkedlist.ListNode <em>List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Node</em>'.
	 * @see bento.sirius.tests.metamodels.linkedlist.ListNode
	 * @generated
	 */
	EClass getListNode();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.linkedlist.ListNode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bento.sirius.tests.metamodels.linkedlist.ListNode#getValue()
	 * @see #getListNode()
	 * @generated
	 */
	EAttribute getListNode_Value();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.linkedlist.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see bento.sirius.tests.metamodels.linkedlist.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinkedlistFactory getLinkedlistFactory();

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
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.LinkedListImpl <em>Linked List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedListImpl
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getLinkedList()
		 * @generated
		 */
		EClass LINKED_LIST = eINSTANCE.getLinkedList();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_LIST__NODES = eINSTANCE.getLinkedList_Nodes();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.AbstractListNodeImpl <em>Abstract List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.AbstractListNodeImpl
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getAbstractListNode()
		 * @generated
		 */
		EClass ABSTRACT_LIST_NODE = eINSTANCE.getAbstractListNode();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LIST_NODE__NEXT = eINSTANCE.getAbstractListNode_Next();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.InitialNodeImpl
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.ListNodeImpl <em>List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.ListNodeImpl
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getListNode()
		 * @generated
		 */
		EClass LIST_NODE = eINSTANCE.getListNode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_NODE__VALUE = eINSTANCE.getListNode_Value();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.linkedlist.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.FinalNodeImpl
		 * @see bento.sirius.tests.metamodels.linkedlist.impl.LinkedlistPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

	}

} //LinkedlistPackage

/**
 */
package bento.sirius.tests.metamodels.linkedlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.linkedlist.LinkedList#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage#getLinkedList()
 * @model
 * @generated
 */
public interface LinkedList extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.linkedlist.AbstractListNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage#getLinkedList_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractListNode> getNodes();

} // LinkedList

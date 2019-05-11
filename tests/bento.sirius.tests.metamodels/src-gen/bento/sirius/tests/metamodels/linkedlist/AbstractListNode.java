/**
 */
package bento.sirius.tests.metamodels.linkedlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract List Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.linkedlist.AbstractListNode#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage#getAbstractListNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractListNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(AbstractListNode)
	 * @see bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage#getAbstractListNode_Next()
	 * @model containment="true"
	 * @generated
	 */
	AbstractListNode getNext();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.linkedlist.AbstractListNode#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(AbstractListNode value);

} // AbstractListNode

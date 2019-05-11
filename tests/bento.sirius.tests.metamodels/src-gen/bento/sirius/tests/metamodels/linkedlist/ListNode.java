/**
 */
package bento.sirius.tests.metamodels.linkedlist;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.linkedlist.ListNode#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage#getListNode()
 * @model
 * @generated
 */
public interface ListNode extends AbstractListNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage#getListNode_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.linkedlist.ListNode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ListNode

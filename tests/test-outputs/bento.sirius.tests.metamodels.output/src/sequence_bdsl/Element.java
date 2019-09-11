/**
 */
package sequence_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.Element#getValue <em>Value</em>}</li>
 *   <li>{@link sequence_bdsl.Element#getNext <em>Next</em>}</li>
 *   <li>{@link sequence_bdsl.Element#getContainsvalueElement <em>Containsvalue Element</em>}</li>
 * </ul>
 *
 * @see sequence_bdsl.Sequence_bdslPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends BindingElement {
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
	 * @see sequence_bdsl.Sequence_bdslPackage#getElement_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link sequence_bdsl.Element#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Element)
	 * @see sequence_bdsl.Sequence_bdslPackage#getElement_Next()
	 * @model containment="true"
	 * @generated
	 */
	Element getNext();

	/**
	 * Sets the value of the '{@link sequence_bdsl.Element#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Element value);

	/**
	 * Returns the value of the '<em><b>Containsvalue Element</b></em>' containment reference list.
	 * The list contents are of type {@link sequence_bdsl.valueElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsvalue Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsvalue Element</em>' containment reference list.
	 * @see sequence_bdsl.Sequence_bdslPackage#getElement_ContainsvalueElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<valueElement> getContainsvalueElement();

} // Element

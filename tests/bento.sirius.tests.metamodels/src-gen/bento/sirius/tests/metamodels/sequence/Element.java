/**
 */
package bento.sirius.tests.metamodels.sequence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.sequence.Element#getValue <em>Value</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.sequence.Element#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.sequence.SequencePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
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
	 * @see bento.sirius.tests.metamodels.sequence.SequencePackage#getElement_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.sequence.Element#getValue <em>Value</em>}' attribute.
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
	 * @see bento.sirius.tests.metamodels.sequence.SequencePackage#getElement_Next()
	 * @model containment="true"
	 * @generated
	 */
	Element getNext();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.sequence.Element#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Element value);

} // Element

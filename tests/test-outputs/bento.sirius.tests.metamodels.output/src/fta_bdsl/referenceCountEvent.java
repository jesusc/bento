/**
 */
package fta_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>reference Count Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.referenceCountEvent#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fta_bdsl.Fta_bdslPackage#getreferenceCountEvent()
 * @model
 * @generated
 */
public interface referenceCountEvent extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fta_bdsl.Fta_bdslPackage#getreferenceCountEvent_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fta_bdsl.referenceCountEvent#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // referenceCountEvent

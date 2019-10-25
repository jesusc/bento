/**
 */
package fta_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.typeEvent#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fta_bdsl.Fta_bdslPackage#gettypeEvent()
 * @model
 * @generated
 */
public interface typeEvent extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fta_bdsl.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fta_bdsl.EventType
	 * @see #setValue(EventType)
	 * @see fta_bdsl.Fta_bdslPackage#gettypeEvent_Value()
	 * @model
	 * @generated
	 */
	EventType getValue();

	/**
	 * Sets the value of the '{@link fta_bdsl.typeEvent#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fta_bdsl.EventType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EventType value);

} // typeEvent

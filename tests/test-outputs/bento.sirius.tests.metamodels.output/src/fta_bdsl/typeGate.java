/**
 */
package fta_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.typeGate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fta_bdsl.Fta_bdslPackage#gettypeGate()
 * @model
 * @generated
 */
public interface typeGate extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link fta_bdsl.GateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see fta_bdsl.GateType
	 * @see #setValue(GateType)
	 * @see fta_bdsl.Fta_bdslPackage#gettypeGate_Value()
	 * @model
	 * @generated
	 */
	GateType getValue();

	/**
	 * Sets the value of the '{@link fta_bdsl.typeGate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see fta_bdsl.GateType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(GateType value);

} // typeGate

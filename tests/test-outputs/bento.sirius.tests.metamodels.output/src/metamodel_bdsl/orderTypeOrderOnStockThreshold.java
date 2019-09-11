/**
 */
package metamodel_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>order Type Order On Stock Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.orderTypeOrderOnStockThreshold#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getorderTypeOrderOnStockThreshold()
 * @model
 * @generated
 */
public interface orderTypeOrderOnStockThreshold extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel_bdsl.OrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see metamodel_bdsl.OrderType
	 * @see #setValue(OrderType)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getorderTypeOrderOnStockThreshold_Value()
	 * @model
	 * @generated
	 */
	OrderType getValue();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.orderTypeOrderOnStockThreshold#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see metamodel_bdsl.OrderType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OrderType value);

} // orderTypeOrderOnStockThreshold

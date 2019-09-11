/**
 */
package mindstorms_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>color Color Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.colorColorSensor#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getcolorColorSensor()
 * @model
 * @generated
 */
public interface colorColorSensor extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link mindstorms_bdsl.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see mindstorms_bdsl.Color
	 * @see #setValue(Color)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getcolorColorSensor_Value()
	 * @model
	 * @generated
	 */
	Color getValue();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.colorColorSensor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see mindstorms_bdsl.Color
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Color value);

} // colorColorSensor

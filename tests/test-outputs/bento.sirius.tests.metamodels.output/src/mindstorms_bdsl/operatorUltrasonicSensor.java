/**
 */
package mindstorms_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>operator Ultrasonic Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.operatorUltrasonicSensor#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getoperatorUltrasonicSensor()
 * @model
 * @generated
 */
public interface operatorUltrasonicSensor extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link mindstorms_bdsl.OperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see mindstorms_bdsl.OperatorKind
	 * @see #setValue(OperatorKind)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getoperatorUltrasonicSensor_Value()
	 * @model
	 * @generated
	 */
	OperatorKind getValue();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.operatorUltrasonicSensor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see mindstorms_bdsl.OperatorKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OperatorKind value);

} // operatorUltrasonicSensor

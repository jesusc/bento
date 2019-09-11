/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ultrasonic Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.UltrasonicSensor#getOperator <em>Operator</em>}</li>
 *   <li>{@link mindstorms_bdsl.UltrasonicSensor#getValue <em>Value</em>}</li>
 *   <li>{@link mindstorms_bdsl.UltrasonicSensor#getContainsnameUltrasonicSensor <em>Containsname Ultrasonic Sensor</em>}</li>
 *   <li>{@link mindstorms_bdsl.UltrasonicSensor#getContainsoperatorUltrasonicSensor <em>Containsoperator Ultrasonic Sensor</em>}</li>
 *   <li>{@link mindstorms_bdsl.UltrasonicSensor#getContainsvalueUltrasonicSensor <em>Containsvalue Ultrasonic Sensor</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getUltrasonicSensor()
 * @model
 * @generated
 */
public interface UltrasonicSensor extends Sensor, BindingElement {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link mindstorms_bdsl.OperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see mindstorms_bdsl.OperatorKind
	 * @see #setOperator(OperatorKind)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getUltrasonicSensor_Operator()
	 * @model
	 * @generated
	 */
	OperatorKind getOperator();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.UltrasonicSensor#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see mindstorms_bdsl.OperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorKind value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getUltrasonicSensor_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.UltrasonicSensor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Containsname Ultrasonic Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameUltrasonicSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Ultrasonic Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Ultrasonic Sensor</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getUltrasonicSensor_ContainsnameUltrasonicSensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameUltrasonicSensor> getContainsnameUltrasonicSensor();

	/**
	 * Returns the value of the '<em><b>Containsoperator Ultrasonic Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.operatorUltrasonicSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsoperator Ultrasonic Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsoperator Ultrasonic Sensor</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getUltrasonicSensor_ContainsoperatorUltrasonicSensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<operatorUltrasonicSensor> getContainsoperatorUltrasonicSensor();

	/**
	 * Returns the value of the '<em><b>Containsvalue Ultrasonic Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.valueUltrasonicSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsvalue Ultrasonic Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsvalue Ultrasonic Sensor</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getUltrasonicSensor_ContainsvalueUltrasonicSensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<valueUltrasonicSensor> getContainsvalueUltrasonicSensor();

} // UltrasonicSensor

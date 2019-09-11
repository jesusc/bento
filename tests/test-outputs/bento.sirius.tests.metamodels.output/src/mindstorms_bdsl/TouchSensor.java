/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touch Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.TouchSensor#isIsPressed <em>Is Pressed</em>}</li>
 *   <li>{@link mindstorms_bdsl.TouchSensor#getContainsnameTouchSensor <em>Containsname Touch Sensor</em>}</li>
 *   <li>{@link mindstorms_bdsl.TouchSensor#getContainsisPressedTouchSensor <em>Containsis Pressed Touch Sensor</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getTouchSensor()
 * @model
 * @generated
 */
public interface TouchSensor extends Sensor, BindingElement {
	/**
	 * Returns the value of the '<em><b>Is Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pressed</em>' attribute.
	 * @see #setIsPressed(boolean)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getTouchSensor_IsPressed()
	 * @model
	 * @generated
	 */
	boolean isIsPressed();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.TouchSensor#isIsPressed <em>Is Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pressed</em>' attribute.
	 * @see #isIsPressed()
	 * @generated
	 */
	void setIsPressed(boolean value);

	/**
	 * Returns the value of the '<em><b>Containsname Touch Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameTouchSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Touch Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Touch Sensor</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getTouchSensor_ContainsnameTouchSensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameTouchSensor> getContainsnameTouchSensor();

	/**
	 * Returns the value of the '<em><b>Containsis Pressed Touch Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.isPressedTouchSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsis Pressed Touch Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsis Pressed Touch Sensor</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getTouchSensor_ContainsisPressedTouchSensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<isPressedTouchSensor> getContainsisPressedTouchSensor();

} // TouchSensor

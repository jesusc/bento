/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.ColorSensor#getColor <em>Color</em>}</li>
 *   <li>{@link mindstorms_bdsl.ColorSensor#getContainsnameColorSensor <em>Containsname Color Sensor</em>}</li>
 *   <li>{@link mindstorms_bdsl.ColorSensor#getContainscolorColorSensor <em>Containscolor Color Sensor</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getColorSensor()
 * @model
 * @generated
 */
public interface ColorSensor extends Sensor, BindingElement {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link mindstorms_bdsl.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see mindstorms_bdsl.Color
	 * @see #setColor(Color)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getColorSensor_Color()
	 * @model default="NONE"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.ColorSensor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see mindstorms_bdsl.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Containsname Color Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameColorSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Color Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Color Sensor</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getColorSensor_ContainsnameColorSensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameColorSensor> getContainsnameColorSensor();

	/**
	 * Returns the value of the '<em><b>Containscolor Color Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.colorColorSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containscolor Color Sensor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containscolor Color Sensor</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getColorSensor_ContainscolorColorSensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<colorColorSensor> getContainscolorColorSensor();

} // ColorSensor

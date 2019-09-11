/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.Rotate#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link mindstorms_bdsl.Rotate#isRandom <em>Random</em>}</li>
 *   <li>{@link mindstorms_bdsl.Rotate#getContainsnameRotate <em>Containsname Rotate</em>}</li>
 *   <li>{@link mindstorms_bdsl.Rotate#getContainsdegreesRotate <em>Containsdegrees Rotate</em>}</li>
 *   <li>{@link mindstorms_bdsl.Rotate#getContainsrandomRotate <em>Containsrandom Rotate</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Action, BindingElement {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' attribute.
	 * @see #setDegrees(int)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getRotate_Degrees()
	 * @model
	 * @generated
	 */
	int getDegrees();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.Rotate#getDegrees <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' attribute.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(int value);

	/**
	 * Returns the value of the '<em><b>Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random</em>' attribute.
	 * @see #setRandom(boolean)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getRotate_Random()
	 * @model
	 * @generated
	 */
	boolean isRandom();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.Rotate#isRandom <em>Random</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random</em>' attribute.
	 * @see #isRandom()
	 * @generated
	 */
	void setRandom(boolean value);

	/**
	 * Returns the value of the '<em><b>Containsname Rotate</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameRotate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Rotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Rotate</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getRotate_ContainsnameRotate()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameRotate> getContainsnameRotate();

	/**
	 * Returns the value of the '<em><b>Containsdegrees Rotate</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.degreesRotate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsdegrees Rotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsdegrees Rotate</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getRotate_ContainsdegreesRotate()
	 * @model containment="true"
	 * @generated
	 */
	EList<degreesRotate> getContainsdegreesRotate();

	/**
	 * Returns the value of the '<em><b>Containsrandom Rotate</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.randomRotate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsrandom Rotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsrandom Rotate</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getRotate_ContainsrandomRotate()
	 * @model containment="true"
	 * @generated
	 */
	EList<randomRotate> getContainsrandomRotate();

} // Rotate

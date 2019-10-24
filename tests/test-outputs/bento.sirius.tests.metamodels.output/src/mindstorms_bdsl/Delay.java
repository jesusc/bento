/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.Delay#getMs <em>Ms</em>}</li>
 *   <li>{@link mindstorms_bdsl.Delay#getContainsnameDelay <em>Containsname Delay</em>}</li>
 *   <li>{@link mindstorms_bdsl.Delay#getContainsmsDelay <em>Containsms Delay</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getDelay()
 * @model
 * @generated
 */
public interface Delay extends Action, BindingElement {
	/**
	 * Returns the value of the '<em><b>Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ms</em>' attribute.
	 * @see #setMs(int)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getDelay_Ms()
	 * @model
	 * @generated
	 */
	int getMs();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.Delay#getMs <em>Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ms</em>' attribute.
	 * @see #getMs()
	 * @generated
	 */
	void setMs(int value);

	/**
	 * Returns the value of the '<em><b>Containsname Delay</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameDelay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Delay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Delay</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getDelay_ContainsnameDelay()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameDelay> getContainsnameDelay();

	/**
	 * Returns the value of the '<em><b>Containsms Delay</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.msDelay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsms Delay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsms Delay</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getDelay_ContainsmsDelay()
	 * @model containment="true"
	 * @generated
	 */
	EList<msDelay> getContainsmsDelay();

} // Delay

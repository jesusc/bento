/**
 */
package scenes_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.Place#getContainsnamePlace <em>Containsname Place</em>}</li>
 * </ul>
 *
 * @see scenes_bdsl.Scenes_bdslPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Element, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Place</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Place</em>' containment reference.
	 * @see #setContainsnamePlace(namePlace)
	 * @see scenes_bdsl.Scenes_bdslPackage#getPlace_ContainsnamePlace()
	 * @model containment="true"
	 * @generated
	 */
	namePlace getContainsnamePlace();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Place#getContainsnamePlace <em>Containsname Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containsname Place</em>' containment reference.
	 * @see #getContainsnamePlace()
	 * @generated
	 */
	void setContainsnamePlace(namePlace value);

} // Place

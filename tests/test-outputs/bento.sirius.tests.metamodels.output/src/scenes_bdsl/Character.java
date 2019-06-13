/**
 */
package scenes_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.Character#getContainsnameCharacter <em>Containsname Character</em>}</li>
 * </ul>
 *
 * @see scenes_bdsl.Scenes_bdslPackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends Element, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Character</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Character</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Character</em>' containment reference.
	 * @see #setContainsnameCharacter(nameCharacter)
	 * @see scenes_bdsl.Scenes_bdslPackage#getCharacter_ContainsnameCharacter()
	 * @model containment="true"
	 * @generated
	 */
	nameCharacter getContainsnameCharacter();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Character#getContainsnameCharacter <em>Containsname Character</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containsname Character</em>' containment reference.
	 * @see #getContainsnameCharacter()
	 * @generated
	 */
	void setContainsnameCharacter(nameCharacter value);

} // Character

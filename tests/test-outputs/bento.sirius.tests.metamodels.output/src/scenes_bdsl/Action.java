/**
 */
package scenes_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.Action#getCharacters <em>Characters</em>}</li>
 *   <li>{@link scenes_bdsl.Action#getType <em>Type</em>}</li>
 *   <li>{@link scenes_bdsl.Action#getContainsnameAction <em>Containsname Action</em>}</li>
 *   <li>{@link scenes_bdsl.Action#getContainstypeAction <em>Containstype Action</em>}</li>
 * </ul>
 *
 * @see scenes_bdsl.Scenes_bdslPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends NamedElement, BindingElement {
	/**
	 * Returns the value of the '<em><b>Characters</b></em>' reference list.
	 * The list contents are of type {@link scenes_bdsl.Character}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characters</em>' reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getAction_Characters()
	 * @model required="true"
	 * @generated
	 */
	EList<scenes_bdsl.Character> getCharacters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link scenes_bdsl.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see scenes_bdsl.ActionType
	 * @see #setType(ActionType)
	 * @see scenes_bdsl.Scenes_bdslPackage#getAction_Type()
	 * @model required="true"
	 * @generated
	 */
	ActionType getType();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Action#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see scenes_bdsl.ActionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Containsname Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Action</em>' containment reference.
	 * @see #setContainsnameAction(nameAction)
	 * @see scenes_bdsl.Scenes_bdslPackage#getAction_ContainsnameAction()
	 * @model containment="true"
	 * @generated
	 */
	nameAction getContainsnameAction();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Action#getContainsnameAction <em>Containsname Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containsname Action</em>' containment reference.
	 * @see #getContainsnameAction()
	 * @generated
	 */
	void setContainsnameAction(nameAction value);

	/**
	 * Returns the value of the '<em><b>Containstype Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containstype Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containstype Action</em>' containment reference.
	 * @see #setContainstypeAction(typeAction)
	 * @see scenes_bdsl.Scenes_bdslPackage#getAction_ContainstypeAction()
	 * @model containment="true"
	 * @generated
	 */
	typeAction getContainstypeAction();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Action#getContainstypeAction <em>Containstype Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containstype Action</em>' containment reference.
	 * @see #getContainstypeAction()
	 * @generated
	 */
	void setContainstypeAction(typeAction value);

} // Action

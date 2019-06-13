/**
 */
package scenes_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.Scene#getElements <em>Elements</em>}</li>
 *   <li>{@link scenes_bdsl.Scene#getNext <em>Next</em>}</li>
 *   <li>{@link scenes_bdsl.Scene#getActions <em>Actions</em>}</li>
 *   <li>{@link scenes_bdsl.Scene#getDescription <em>Description</em>}</li>
 *   <li>{@link scenes_bdsl.Scene#getContainsnameScene <em>Containsname Scene</em>}</li>
 * </ul>
 *
 * @see scenes_bdsl.Scenes_bdslPackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends NamedElement, BindingElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link scenes_bdsl.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getScene_Elements()
	 * @model
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Scene)
	 * @see scenes_bdsl.Scenes_bdslPackage#getScene_Next()
	 * @model
	 * @generated
	 */
	Scene getNext();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Scene#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Scene value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link scenes_bdsl.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getScene_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Comment)
	 * @see scenes_bdsl.Scenes_bdslPackage#getScene_Description()
	 * @model containment="true"
	 * @generated
	 */
	Comment getDescription();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Scene#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Comment value);

	/**
	 * Returns the value of the '<em><b>Containsname Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Scene</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Scene</em>' containment reference.
	 * @see #setContainsnameScene(nameScene)
	 * @see scenes_bdsl.Scenes_bdslPackage#getScene_ContainsnameScene()
	 * @model containment="true"
	 * @generated
	 */
	nameScene getContainsnameScene();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Scene#getContainsnameScene <em>Containsname Scene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containsname Scene</em>' containment reference.
	 * @see #getContainsnameScene()
	 * @generated
	 */
	void setContainsnameScene(nameScene value);

} // Scene

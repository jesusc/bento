/**
 */
package scenes_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.Comment#getText <em>Text</em>}</li>
 *   <li>{@link scenes_bdsl.Comment#getContainstextComment <em>Containstext Comment</em>}</li>
 * </ul>
 *
 * @see scenes_bdsl.Scenes_bdslPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends BindingElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see scenes_bdsl.Scenes_bdslPackage#getComment_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Comment#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Containstext Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containstext Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containstext Comment</em>' containment reference.
	 * @see #setContainstextComment(textComment)
	 * @see scenes_bdsl.Scenes_bdslPackage#getComment_ContainstextComment()
	 * @model containment="true"
	 * @generated
	 */
	textComment getContainstextComment();

	/**
	 * Sets the value of the '{@link scenes_bdsl.Comment#getContainstextComment <em>Containstext Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containstext Comment</em>' containment reference.
	 * @see #getContainstextComment()
	 * @generated
	 */
	void setContainstextComment(textComment value);

} // Comment

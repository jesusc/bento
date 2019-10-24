/**
 */
package dart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dart.Controller#getPublishAs <em>Publish As</em>}</li>
 *   <li>{@link dart.Controller#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see dart.DartPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends dart.Class, AngularType {
	/**
	 * Returns the value of the '<em><b>Publish As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish As</em>' attribute.
	 * @see #setPublishAs(String)
	 * @see dart.DartPackage#getController_PublishAs()
	 * @model
	 * @generated
	 */
	String getPublishAs();

	/**
	 * Sets the value of the '{@link dart.Controller#getPublishAs <em>Publish As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish As</em>' attribute.
	 * @see #getPublishAs()
	 * @generated
	 */
	void setPublishAs(String value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see dart.DartPackage#getController_Selector()
	 * @model
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link dart.Controller#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

} // Controller

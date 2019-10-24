/**
 */
package dart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dart.Component#getPublishAs <em>Publish As</em>}</li>
 *   <li>{@link dart.Component#getStylesheet <em>Stylesheet</em>}</li>
 *   <li>{@link dart.Component#getTemplate <em>Template</em>}</li>
 *   <li>{@link dart.Component#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see dart.DartPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends dart.Class, AngularType {
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
	 * @see dart.DartPackage#getComponent_PublishAs()
	 * @model
	 * @generated
	 */
	String getPublishAs();

	/**
	 * Sets the value of the '{@link dart.Component#getPublishAs <em>Publish As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish As</em>' attribute.
	 * @see #getPublishAs()
	 * @generated
	 */
	void setPublishAs(String value);

	/**
	 * Returns the value of the '<em><b>Stylesheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stylesheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stylesheet</em>' reference.
	 * @see #setStylesheet(Stylesheet)
	 * @see dart.DartPackage#getComponent_Stylesheet()
	 * @model
	 * @generated
	 */
	Stylesheet getStylesheet();

	/**
	 * Sets the value of the '{@link dart.Component#getStylesheet <em>Stylesheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stylesheet</em>' reference.
	 * @see #getStylesheet()
	 * @generated
	 */
	void setStylesheet(Stylesheet value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(HTML)
	 * @see dart.DartPackage#getComponent_Template()
	 * @model
	 * @generated
	 */
	HTML getTemplate();

	/**
	 * Sets the value of the '{@link dart.Component#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(HTML value);

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
	 * @see dart.DartPackage#getComponent_Selector()
	 * @model
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link dart.Component#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

} // Component

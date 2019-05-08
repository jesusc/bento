/**
 */
package bento.language.bentocomp.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Based Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.core.TemplateBasedComponent#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.core.CorePackage#getTemplateBasedComponent()
 * @model abstract="true"
 * @generated
 */
public interface TemplateBasedComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(Template)
	 * @see bento.language.bentocomp.core.CorePackage#getTemplateBasedComponent_Template()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.core.TemplateBasedComponent#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

} // TemplateBasedComponent

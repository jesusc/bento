/**
 */
package bento.language.bentocomp.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.core.ParameterModel#getType <em>Type</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.ParameterModel#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.core.CorePackage#getParameterModel()
 * @model
 * @generated
 */
public interface ParameterModel extends Model {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Concept)
	 * @see bento.language.bentocomp.core.CorePackage#getParameterModel_Type()
	 * @model required="true"
	 * @generated
	 */
	Concept getType();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.core.ParameterModel#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Concept value);

	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see bento.language.bentocomp.core.CorePackage#getParameterModel_ResourceName()
	 * @model
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.core.ParameterModel#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

} // ParameterModel

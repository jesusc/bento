/**
 */
package bento.analysis.atl_analysis.atl_error;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Not Found In This Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.AttributeNotFoundInThisModule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getAttributeNotFoundInThisModule()
 * @model
 * @generated
 */
public interface AttributeNotFoundInThisModule extends NavigationProblem {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getAttributeNotFoundInThisModule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.AttributeNotFoundInThisModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AttributeNotFoundInThisModule

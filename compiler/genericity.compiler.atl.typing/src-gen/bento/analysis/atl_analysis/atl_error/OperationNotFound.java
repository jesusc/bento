/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;

import genericity.typing.atl_types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Not Found</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.OperationNotFound#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.OperationNotFound#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getOperationNotFound()
 * @model
 * @generated
 */
public interface OperationNotFound extends NavigationProblem {
	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getOperationNotFound_OperationName()
	 * @model required="true"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.OperationNotFound#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getOperationNotFound_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.OperationNotFound#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // OperationNotFound

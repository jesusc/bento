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
 * A representation of the model object '<em><b>Different Branch Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.DifferentBranchTypes#getThenType <em>Then Type</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.DifferentBranchTypes#getElseType <em>Else Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getDifferentBranchTypes()
 * @model
 * @generated
 */
public interface DifferentBranchTypes extends NavigationProblem {
	/**
	 * Returns the value of the '<em><b>Then Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Type</em>' reference.
	 * @see #setThenType(Type)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getDifferentBranchTypes_ThenType()
	 * @model required="true"
	 * @generated
	 */
	Type getThenType();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.DifferentBranchTypes#getThenType <em>Then Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Type</em>' reference.
	 * @see #getThenType()
	 * @generated
	 */
	void setThenType(Type value);

	/**
	 * Returns the value of the '<em><b>Else Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Type</em>' reference.
	 * @see #setElseType(Type)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getDifferentBranchTypes_ElseType()
	 * @model required="true"
	 * @generated
	 */
	Type getElseType();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.DifferentBranchTypes#getElseType <em>Else Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Type</em>' reference.
	 * @see #getElseType()
	 * @generated
	 */
	void setElseType(Type value);

} // DifferentBranchTypes

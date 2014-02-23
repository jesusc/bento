/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_recovery;

import bento.analysis.atl_analysis.Recovery;
import genericity.typing.atl_types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tentative Type Assigned</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_recovery.TentativeTypeAssigned#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_recovery.AtlRecoveryPackage#getTentativeTypeAssigned()
 * @model
 * @generated
 */
public interface TentativeTypeAssigned extends Recovery {

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
	 * @see bento.analysis.atl_analysis.atl_recovery.AtlRecoveryPackage#getTentativeTypeAssigned_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_recovery.TentativeTypeAssigned#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);
} // TentativeTypeAssigned

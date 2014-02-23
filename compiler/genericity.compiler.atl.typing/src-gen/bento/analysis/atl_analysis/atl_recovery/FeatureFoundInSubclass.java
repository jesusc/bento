/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_recovery;

import bento.analysis.atl_analysis.Recovery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Found In Subclass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass#getSubclassName <em>Subclass Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_recovery.AtlRecoveryPackage#getFeatureFoundInSubclass()
 * @model
 * @generated
 */
public interface FeatureFoundInSubclass extends Recovery {
	/**
	 * Returns the value of the '<em><b>Subclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass Name</em>' attribute.
	 * @see #setSubclassName(String)
	 * @see bento.analysis.atl_analysis.atl_recovery.AtlRecoveryPackage#getFeatureFoundInSubclass_SubclassName()
	 * @model required="true"
	 * @generated
	 */
	String getSubclassName();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass#getSubclassName <em>Subclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclass Name</em>' attribute.
	 * @see #getSubclassName()
	 * @generated
	 */
	void setSubclassName(String value);

} // FeatureFoundInSubclass

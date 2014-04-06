/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import genericity.typing.atl_types.Metaclass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matched Rule One Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.MatchedRuleOneAnn#getInPatternType <em>In Pattern Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMatchedRuleOneAnn()
 * @model
 * @generated
 */
public interface MatchedRuleOneAnn extends MatchedRuleAnn {
	/**
	 * Returns the value of the '<em><b>In Pattern Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Pattern Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Pattern Type</em>' reference.
	 * @see #setInPatternType(Metaclass)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMatchedRuleOneAnn_InPatternType()
	 * @model required="true"
	 * @generated
	 */
	Metaclass getInPatternType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.MatchedRuleOneAnn#getInPatternType <em>In Pattern Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Pattern Type</em>' reference.
	 * @see #getInPatternType()
	 * @generated
	 */
	void setInPatternType(Metaclass value);

} // MatchedRuleOneAnn

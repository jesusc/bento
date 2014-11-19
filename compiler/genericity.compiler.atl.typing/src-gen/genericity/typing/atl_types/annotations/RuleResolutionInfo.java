/**
 */
package genericity.typing.atl_types.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Resolution Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.RuleResolutionInfo#getRule <em>Rule</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.RuleResolutionInfo#getAllInvolvedRules <em>All Involved Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getRuleResolutionInfo()
 * @model
 * @generated
 */
public interface RuleResolutionInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(MatchedRuleOneAnn)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getRuleResolutionInfo_Rule()
	 * @model required="true"
	 * @generated
	 */
	MatchedRuleOneAnn getRule();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.RuleResolutionInfo#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(MatchedRuleOneAnn value);

	/**
	 * Returns the value of the '<em><b>All Involved Rules</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.MatchedRuleOneAnn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Involved Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Involved Rules</em>' reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getRuleResolutionInfo_AllInvolvedRules()
	 * @model required="true"
	 * @generated
	 */
	EList<MatchedRuleOneAnn> getAllInvolvedRules();

} // RuleResolutionInfo

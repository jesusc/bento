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
 * A representation of the model object '<em><b>Matched Rule Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.MatchedRuleAnn#getFilter <em>Filter</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.MatchedRuleAnn#getOutputPatternType <em>Output Pattern Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMatchedRuleAnn()
 * @model abstract="true"
 * @generated
 */
public interface MatchedRuleAnn extends RuleAnn {

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMatchedRuleAnn_Filter()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionAnnotation getFilter();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.MatchedRuleAnn#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(ExpressionAnnotation value);

	/**
	 * Returns the value of the '<em><b>Output Pattern Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Pattern Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Pattern Type</em>' reference.
	 * @see #setOutputPatternType(Metaclass)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMatchedRuleAnn_OutputPatternType()
	 * @model required="true"
	 * @generated
	 */
	Metaclass getOutputPatternType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.MatchedRuleAnn#getOutputPatternType <em>Output Pattern Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Pattern Type</em>' reference.
	 * @see #getOutputPatternType()
	 * @generated
	 */
	void setOutputPatternType(Metaclass value);
} // MatchedRuleAnn

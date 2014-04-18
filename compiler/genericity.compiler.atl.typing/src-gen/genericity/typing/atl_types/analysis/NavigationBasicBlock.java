/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.analysis;

import genericity.typing.atl_types.annotations.ExpressionAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Basic Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.analysis.NavigationBasicBlock#getSubexprStart <em>Subexpr Start</em>}</li>
 *   <li>{@link genericity.typing.atl_types.analysis.NavigationBasicBlock#getSubexprEnd <em>Subexpr End</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getNavigationBasicBlock()
 * @model
 * @generated
 */
public interface NavigationBasicBlock extends BasicBlock {
	/**
	 * Returns the value of the '<em><b>Subexpr Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subexpr Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subexpr Start</em>' reference.
	 * @see #setSubexprStart(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getNavigationBasicBlock_SubexprStart()
	 * @model required="true"
	 * @generated
	 */
	ExpressionAnnotation getSubexprStart();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.NavigationBasicBlock#getSubexprStart <em>Subexpr Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subexpr Start</em>' reference.
	 * @see #getSubexprStart()
	 * @generated
	 */
	void setSubexprStart(ExpressionAnnotation value);

	/**
	 * Returns the value of the '<em><b>Subexpr End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subexpr End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subexpr End</em>' reference.
	 * @see #setSubexprEnd(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getNavigationBasicBlock_SubexprEnd()
	 * @model required="true"
	 * @generated
	 */
	ExpressionAnnotation getSubexprEnd();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.NavigationBasicBlock#getSubexprEnd <em>Subexpr End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subexpr End</em>' reference.
	 * @see #getSubexprEnd()
	 * @generated
	 */
	void setSubexprEnd(ExpressionAnnotation value);

} // NavigationBasicBlock

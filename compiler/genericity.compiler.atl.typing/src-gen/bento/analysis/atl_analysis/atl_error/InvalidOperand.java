/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invalid Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.InvalidOperand#getOperatorSymbol <em>Operator Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getInvalidOperand()
 * @model
 * @generated
 */
public interface InvalidOperand extends InvalidArgumentProblem {
	/**
	 * Returns the value of the '<em><b>Operator Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Symbol</em>' attribute.
	 * @see #setOperatorSymbol(String)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getInvalidOperand_OperatorSymbol()
	 * @model required="true"
	 * @generated
	 */
	String getOperatorSymbol();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.InvalidOperand#getOperatorSymbol <em>Operator Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Symbol</em>' attribute.
	 * @see #getOperatorSymbol()
	 * @generated
	 */
	void setOperatorSymbol(String value);

} // InvalidOperand

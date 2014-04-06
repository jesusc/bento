/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterate Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.IterateExprAnn#getResultVar <em>Result Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getIterateExprAnn()
 * @model
 * @generated
 */
public interface IterateExprAnn extends AbstractIteratorExprAnn {
	/**
	 * Returns the value of the '<em><b>Result Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Var</em>' containment reference.
	 * @see #setResultVar(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getIterateExprAnn_ResultVar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getResultVar();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.IterateExprAnn#getResultVar <em>Result Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Var</em>' containment reference.
	 * @see #getResultVar()
	 * @generated
	 */
	void setResultVar(ExpressionAnnotation value);

} // IterateExprAnn

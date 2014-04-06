/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.IfExprAnn#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.IfExprAnn#getThenPart <em>Then Part</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.IfExprAnn#getElsePart <em>Else Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getIfExprAnn()
 * @model
 * @generated
 */
public interface IfExprAnn extends ExpressionAnnotation {
	/**
	 * Returns the value of the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition</em>' containment reference.
	 * @see #setIfCondition(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getIfExprAnn_IfCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getIfCondition();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.IfExprAnn#getIfCondition <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition</em>' containment reference.
	 * @see #getIfCondition()
	 * @generated
	 */
	void setIfCondition(ExpressionAnnotation value);

	/**
	 * Returns the value of the '<em><b>Then Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Part</em>' containment reference.
	 * @see #setThenPart(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getIfExprAnn_ThenPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getThenPart();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.IfExprAnn#getThenPart <em>Then Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Part</em>' containment reference.
	 * @see #getThenPart()
	 * @generated
	 */
	void setThenPart(ExpressionAnnotation value);

	/**
	 * Returns the value of the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Part</em>' containment reference.
	 * @see #setElsePart(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getIfExprAnn_ElsePart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getElsePart();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.IfExprAnn#getElsePart <em>Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Part</em>' containment reference.
	 * @see #getElsePart()
	 * @generated
	 */
	void setElsePart(ExpressionAnnotation value);

} // IfExprAnn

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.LetExprAnn#getInit <em>Init</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.LetExprAnn#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getLetExprAnn()
 * @model
 * @generated
 */
public interface LetExprAnn extends ExpressionAnnotation {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getLetExprAnn_Init()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getInit();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.LetExprAnn#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(ExpressionAnnotation value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getLetExprAnn_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getBody();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.LetExprAnn#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ExpressionAnnotation value);

} // LetExprAnn

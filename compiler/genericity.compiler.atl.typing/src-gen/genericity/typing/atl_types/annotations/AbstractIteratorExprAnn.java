/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Iterator Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.AbstractIteratorExprAnn#getSource <em>Source</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.AbstractIteratorExprAnn#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getAbstractIteratorExprAnn()
 * @model abstract="true"
 * @generated
 */
public interface AbstractIteratorExprAnn extends ExpressionAnnotation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getAbstractIteratorExprAnn_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getSource();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.AbstractIteratorExprAnn#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExpressionAnnotation value);

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
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getAbstractIteratorExprAnn_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getBody();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.AbstractIteratorExprAnn#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ExpressionAnnotation value);

} // AbstractIteratorExprAnn

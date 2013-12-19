/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import genericity.typing.atl_types.Type;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getExpr <em>Expr</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getType <em>Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getUsedFeature <em>Used Feature</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getReceptorType <em>Receptor Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getExpressionAnnotation()
 * @model
 * @generated
 */
public interface ExpressionAnnotation extends AtlAnnotation {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' reference.
	 * @see #setExpr(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getExpressionAnnotation_Expr()
	 * @model
	 * @generated
	 */
	EObject getExpr();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getExpr <em>Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(EObject value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getExpressionAnnotation_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Feature</em>' reference.
	 * @see #setUsedFeature(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getExpressionAnnotation_UsedFeature()
	 * @model
	 * @generated
	 */
	EObject getUsedFeature();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getUsedFeature <em>Used Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Feature</em>' reference.
	 * @see #getUsedFeature()
	 * @generated
	 */
	void setUsedFeature(EObject value);

	/**
	 * Returns the value of the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor Type</em>' reference.
	 * @see #setReceptorType(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getExpressionAnnotation_ReceptorType()
	 * @model
	 * @generated
	 */
	EObject getReceptorType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getReceptorType <em>Receptor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor Type</em>' reference.
	 * @see #getReceptorType()
	 * @generated
	 */
	void setReceptorType(EObject value);

} // ExpressionAnnotation

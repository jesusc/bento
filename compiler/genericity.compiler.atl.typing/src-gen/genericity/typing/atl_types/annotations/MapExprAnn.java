/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.MapExprAnn#getKeyInitializers <em>Key Initializers</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.MapExprAnn#getValueInitializers <em>Value Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMapExprAnn()
 * @model
 * @generated
 */
public interface MapExprAnn extends ExpressionAnnotation {
	/**
	 * Returns the value of the '<em><b>Key Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.ExpressionAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Initializers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Initializers</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMapExprAnn_KeyInitializers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionAnnotation> getKeyInitializers();

	/**
	 * Returns the value of the '<em><b>Value Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.ExpressionAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Initializers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Initializers</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMapExprAnn_ValueInitializers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionAnnotation> getValueInitializers();

} // MapExprAnn

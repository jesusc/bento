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
 * A representation of the model object '<em><b>Collection Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.CollectionExprAnn#getInitializers <em>Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCollectionExprAnn()
 * @model
 * @generated
 */
public interface CollectionExprAnn extends ExpressionAnnotation {
	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.ExpressionAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializers</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCollectionExprAnn_Initializers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionAnnotation> getInitializers();

} // CollectionExprAnn

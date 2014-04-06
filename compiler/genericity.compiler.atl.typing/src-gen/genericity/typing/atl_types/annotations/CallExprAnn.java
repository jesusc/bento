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
 * A representation of the model object '<em><b>Call Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.CallExprAnn#getSource <em>Source</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.CallExprAnn#getArguments <em>Arguments</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.CallExprAnn#getStaticResolver <em>Static Resolver</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.CallExprAnn#getDynamicResolvers <em>Dynamic Resolvers</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCallExprAnn()
 * @model
 * @generated
 */
public interface CallExprAnn extends ExpressionAnnotation {
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
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCallExprAnn_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getSource();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.CallExprAnn#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExpressionAnnotation value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.ExpressionAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCallExprAnn_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionAnnotation> getArguments();

	/**
	 * Returns the value of the '<em><b>Static Resolver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Resolver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Resolver</em>' reference.
	 * @see #setStaticResolver(HelperAnn)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCallExprAnn_StaticResolver()
	 * @model required="true"
	 * @generated
	 */
	HelperAnn getStaticResolver();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.CallExprAnn#getStaticResolver <em>Static Resolver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Resolver</em>' reference.
	 * @see #getStaticResolver()
	 * @generated
	 */
	void setStaticResolver(HelperAnn value);

	/**
	 * Returns the value of the '<em><b>Dynamic Resolvers</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.ContextHelperAnn}.
	 * It is bidirectional and its opposite is '{@link genericity.typing.atl_types.annotations.ContextHelperAnn#getCalledBy <em>Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Resolvers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Resolvers</em>' reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCallExprAnn_DynamicResolvers()
	 * @see genericity.typing.atl_types.annotations.ContextHelperAnn#getCalledBy
	 * @model opposite="calledBy" required="true"
	 * @generated
	 */
	EList<ContextHelperAnn> getDynamicResolvers();

} // CallExprAnn

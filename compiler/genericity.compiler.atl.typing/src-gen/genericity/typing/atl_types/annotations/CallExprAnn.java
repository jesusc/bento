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
 *   <li>{@link genericity.typing.atl_types.annotations.CallExprAnn#isIsStaticCall <em>Is Static Call</em>}</li>
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
	 * Returns the value of the '<em><b>Is Static Call</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static Call</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static Call</em>' attribute.
	 * @see #setIsStaticCall(boolean)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCallExprAnn_IsStaticCall()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsStaticCall();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.CallExprAnn#isIsStaticCall <em>Is Static Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static Call</em>' attribute.
	 * @see #isIsStaticCall()
	 * @generated
	 */
	void setIsStaticCall(boolean value);

	/**
	 * Returns the value of the '<em><b>Static Resolver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link genericity.typing.atl_types.annotations.ModuleCallableAnn#getCalledBy <em>Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Resolver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Resolver</em>' reference.
	 * @see #setStaticResolver(ModuleCallableAnn)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCallExprAnn_StaticResolver()
	 * @see genericity.typing.atl_types.annotations.ModuleCallableAnn#getCalledBy
	 * @model opposite="calledBy" required="true"
	 * @generated
	 */
	ModuleCallableAnn getStaticResolver();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.CallExprAnn#getStaticResolver <em>Static Resolver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Resolver</em>' reference.
	 * @see #getStaticResolver()
	 * @generated
	 */
	void setStaticResolver(ModuleCallableAnn value);

	/**
	 * Returns the value of the '<em><b>Dynamic Resolvers</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.ContextHelperAnn}.
	 * It is bidirectional and its opposite is '{@link genericity.typing.atl_types.annotations.ContextHelperAnn#getPolymorphicCalledBy <em>Polymorphic Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Resolvers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Resolvers</em>' reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getCallExprAnn_DynamicResolvers()
	 * @see genericity.typing.atl_types.annotations.ContextHelperAnn#getPolymorphicCalledBy
	 * @model opposite="polymorphicCalledBy" required="true"
	 * @generated
	 */
	EList<ContextHelperAnn> getDynamicResolvers();

} // CallExprAnn

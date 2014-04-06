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
 * A representation of the model object '<em><b>Helper Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.HelperAnn#getHelper <em>Helper</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.HelperAnn#getName <em>Name</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.HelperAnn#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.HelperAnn#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getHelperAnn()
 * @model abstract="true"
 * @generated
 */
public interface HelperAnn extends AtlAnnotation {
	/**
	 * Returns the value of the '<em><b>Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper</em>' reference.
	 * @see #setHelper(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getHelperAnn_Helper()
	 * @model
	 * @generated
	 */
	EObject getHelper();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.HelperAnn#getHelper <em>Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper</em>' reference.
	 * @see #getHelper()
	 * @generated
	 */
	void setHelper(EObject value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getHelperAnn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.HelperAnn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getHelperAnn_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.HelperAnn#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getHelperAnn_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getExpr();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.HelperAnn#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(ExpressionAnnotation value);

} // HelperAnn

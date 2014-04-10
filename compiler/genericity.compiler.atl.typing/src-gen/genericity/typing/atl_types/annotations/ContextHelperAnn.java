/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import genericity.typing.atl_types.Type;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Helper Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.ContextHelperAnn#getContextType <em>Context Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.ContextHelperAnn#getPolymorphicCalledBy <em>Polymorphic Called By</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getContextHelperAnn()
 * @model
 * @generated
 */
public interface ContextHelperAnn extends HelperAnn {
	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' reference.
	 * @see #setContextType(Type)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getContextHelperAnn_ContextType()
	 * @model required="true"
	 * @generated
	 */
	Type getContextType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.ContextHelperAnn#getContextType <em>Context Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' reference.
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(Type value);

	/**
	 * Returns the value of the '<em><b>Polymorphic Called By</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.CallExprAnn}.
	 * It is bidirectional and its opposite is '{@link genericity.typing.atl_types.annotations.CallExprAnn#getDynamicResolvers <em>Dynamic Resolvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polymorphic Called By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polymorphic Called By</em>' reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getContextHelperAnn_PolymorphicCalledBy()
	 * @see genericity.typing.atl_types.annotations.CallExprAnn#getDynamicResolvers
	 * @model opposite="dynamicResolvers"
	 * @generated
	 */
	EList<CallExprAnn> getPolymorphicCalledBy();

} // ContextHelperAnn

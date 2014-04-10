/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Callable Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.ModuleCallableAnn#getCalledBy <em>Called By</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getModuleCallableAnn()
 * @model abstract="true"
 * @generated
 */
public interface ModuleCallableAnn extends AtlAnnotation {
	/**
	 * Returns the value of the '<em><b>Called By</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.CallExprAnn}.
	 * It is bidirectional and its opposite is '{@link genericity.typing.atl_types.annotations.CallExprAnn#getStaticResolver <em>Static Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called By</em>' reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getModuleCallableAnn_CalledBy()
	 * @see genericity.typing.atl_types.annotations.CallExprAnn#getStaticResolver
	 * @model opposite="staticResolver"
	 * @generated
	 */
	EList<CallExprAnn> getCalledBy();

} // ModuleCallableAnn

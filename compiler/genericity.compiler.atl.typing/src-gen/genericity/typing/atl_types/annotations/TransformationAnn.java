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
 * A representation of the model object '<em><b>Transformation Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.TransformationAnn#getModule <em>Module</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.TransformationAnn#getMatchedRules <em>Matched Rules</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.TransformationAnn#getCalledRules <em>Called Rules</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.TransformationAnn#getLazyRules <em>Lazy Rules</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.TransformationAnn#getHelpers <em>Helpers</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getTransformationAnn()
 * @model
 * @generated
 */
public interface TransformationAnn extends AtlAnnotation {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getTransformationAnn_Module()
	 * @model required="true"
	 * @generated
	 */
	EObject getModule();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.TransformationAnn#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(EObject value);

	/**
	 * Returns the value of the '<em><b>Matched Rules</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.MatchedRuleAnn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matched Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matched Rules</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getTransformationAnn_MatchedRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchedRuleAnn> getMatchedRules();

	/**
	 * Returns the value of the '<em><b>Called Rules</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.CalledRuleAnn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Rules</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getTransformationAnn_CalledRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CalledRuleAnn> getCalledRules();

	/**
	 * Returns the value of the '<em><b>Lazy Rules</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.LazyRuleAnn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy Rules</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getTransformationAnn_LazyRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<LazyRuleAnn> getLazyRules();

	/**
	 * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.HelperAnn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helpers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helpers</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getTransformationAnn_Helpers()
	 * @model containment="true"
	 * @generated
	 */
	EList<HelperAnn> getHelpers();

} // TransformationAnn

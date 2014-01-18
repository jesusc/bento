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
 * A representation of the model object '<em><b>Binding Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnnotation#getRule <em>Rule</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnnotation#getBinding <em>Binding</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnnotation#getName <em>Name</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnnotation#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnnotation#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnnotation()
 * @model
 * @generated
 */
public interface BindingAnnotation extends AtlAnnotation {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnnotation_Rule()
	 * @model
	 * @generated
	 */
	EObject getRule();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(EObject value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnnotation_Binding()
	 * @model
	 * @generated
	 */
	EObject getBinding();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(EObject value);

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
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnnotation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(Type)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnnotation_SourceType()
	 * @model required="true"
	 * @generated
	 */
	Type getSourceType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(Type value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see #setTargetType(Type)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnnotation_TargetType()
	 * @model required="true"
	 * @generated
	 */
	Type getTargetType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(Type value);

} // BindingAnnotation

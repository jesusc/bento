/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import genericity.typing.atl_types.Type;

import genericity.typing.atl_types.analysis.ControlFlow;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnn#getRule <em>Rule</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnn#getBinding <em>Binding</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnn#getName <em>Name</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnn#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnn#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnn#getValue <em>Value</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnn#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.BindingAnn#getControlFlow <em>Control Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn()
 * @model
 * @generated
 */
public interface BindingAnn extends AtlAnnotation {
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
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn_Rule()
	 * @model
	 * @generated
	 */
	EObject getRule();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnn#getRule <em>Rule</em>}' reference.
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
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn_Binding()
	 * @model
	 * @generated
	 */
	EObject getBinding();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnn#getBinding <em>Binding</em>}' reference.
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
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnn#getName <em>Name</em>}' attribute.
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
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn_SourceType()
	 * @model required="true"
	 * @generated
	 */
	Type getSourceType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnn#getSourceType <em>Source Type</em>}' reference.
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
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn_TargetType()
	 * @model required="true"
	 * @generated
	 */
	Type getTargetType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnn#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(Type value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionAnnotation getValue();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnn#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ExpressionAnnotation value);

	/**
	 * Returns the value of the '<em><b>Resolved By</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.MatchedRuleOneAnn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved By</em>' reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn_ResolvedBy()
	 * @model
	 * @generated
	 */
	EList<MatchedRuleOneAnn> getResolvedBy();

	/**
	 * Returns the value of the '<em><b>Control Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flow</em>' reference.
	 * @see #setControlFlow(ControlFlow)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getBindingAnn_ControlFlow()
	 * @model required="true"
	 * @generated
	 */
	ControlFlow getControlFlow();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.BindingAnn#getControlFlow <em>Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Flow</em>' reference.
	 * @see #getControlFlow()
	 * @generated
	 */
	void setControlFlow(ControlFlow value);

} // BindingAnn

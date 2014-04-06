/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import genericity.typing.atl_types.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Pattern Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.OutputPatternAnn#getOutputPatternElement <em>Output Pattern Element</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.OutputPatternAnn#getType <em>Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.OutputPatternAnn#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getOutputPatternAnn()
 * @model
 * @generated
 */
public interface OutputPatternAnn extends RuleAnn {
	/**
	 * Returns the value of the '<em><b>Output Pattern Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Pattern Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Pattern Element</em>' reference.
	 * @see #setOutputPatternElement(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getOutputPatternAnn_OutputPatternElement()
	 * @model
	 * @generated
	 */
	EObject getOutputPatternElement();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.OutputPatternAnn#getOutputPatternElement <em>Output Pattern Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Pattern Element</em>' reference.
	 * @see #getOutputPatternElement()
	 * @generated
	 */
	void setOutputPatternElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getOutputPatternAnn_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.OutputPatternAnn#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.BindingAnn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getOutputPatternAnn_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingAnn> getBindings();

} // OutputPatternAnn

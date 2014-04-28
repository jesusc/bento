/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.BindingResolution#getRightType <em>Right Type</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.BindingResolution#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.BindingResolution#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getBindingResolution()
 * @model abstract="true"
 * @generated
 */
public interface BindingResolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Right Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Type</em>' reference.
	 * @see #setRightType(EClass)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getBindingResolution_RightType()
	 * @model required="true"
	 * @generated
	 */
	EClass getRightType();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.BindingResolution#getRightType <em>Right Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Type</em>' reference.
	 * @see #getRightType()
	 * @generated
	 */
	void setRightType(EClass value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see #setTargetType(EClass)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getBindingResolution_TargetType()
	 * @model required="true"
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.BindingResolution#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(EClass value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getBindingResolution_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResolvedRuleInfo> getRules();

} // BindingResolution

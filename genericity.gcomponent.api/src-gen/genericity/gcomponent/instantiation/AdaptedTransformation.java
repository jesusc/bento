/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation;

import genericity.language.gcomponent.core.Template;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapted Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.gcomponent.instantiation.AdaptedTransformation#getTemplate <em>Template</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.AdaptedTransformation#getRequiredAdaptations <em>Required Adaptations</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptedTransformation()
 * @model
 * @generated
 */
public interface AdaptedTransformation extends ExecutableTransformation {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(Template)
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptedTransformation_Template()
	 * @model required="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.instantiation.AdaptedTransformation#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Required Adaptations</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.gcomponent.instantiation.AdaptWithBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Adaptations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Adaptations</em>' containment reference list.
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptedTransformation_RequiredAdaptations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdaptWithBinding> getRequiredAdaptations();

} // AdaptedTransformation

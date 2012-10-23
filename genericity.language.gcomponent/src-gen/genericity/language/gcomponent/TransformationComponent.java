/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.TransformationComponent#getSource <em>Source</em>}</li>
 *   <li>{@link genericity.language.gcomponent.TransformationComponent#getTarget <em>Target</em>}</li>
 *   <li>{@link genericity.language.gcomponent.TransformationComponent#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link genericity.language.gcomponent.TransformationComponent#isIsM2M <em>Is M2M</em>}</li>
 *   <li>{@link genericity.language.gcomponent.TransformationComponent#getTemplate <em>Template</em>}</li>
 *   <li>{@link genericity.language.gcomponent.TransformationComponent#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.GcomponentPackage#getTransformationComponent()
 * @model
 * @generated
 */
public interface TransformationComponent extends AbstractComponent, Tagged {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see genericity.language.gcomponent.GcomponentPackage#getTransformationComponent_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Concept> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see genericity.language.gcomponent.GcomponentPackage#getTransformationComponent_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concept> getTarget();

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see genericity.language.gcomponent.GcomponentPackage#getTransformationComponent_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getFormalParameters();

	/**
	 * Returns the value of the '<em><b>Is M2M</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is M2M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is M2M</em>' attribute.
	 * @see #setIsM2M(boolean)
	 * @see genericity.language.gcomponent.GcomponentPackage#getTransformationComponent_IsM2M()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsM2M();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.TransformationComponent#isIsM2M <em>Is M2M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is M2M</em>' attribute.
	 * @see #isIsM2M()
	 * @generated
	 */
	void setIsM2M(boolean value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(Template)
	 * @see genericity.language.gcomponent.GcomponentPackage#getTransformationComponent_Template()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.TransformationComponent#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see genericity.language.gcomponent.GcomponentPackage#getTransformationComponent_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // TransformationComponent

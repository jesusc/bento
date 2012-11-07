/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.flowcontrol;

import genericity.language.gcomponent.core.Component;
import genericity.language.gcomponent.core.Concept;
import genericity.language.gcomponent.core.Model;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getModel <em>Model</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getBoundConceptQualifier <em>Bound Concept Qualifier</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getBoundConcept <em>Bound Concept</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getBindingName <em>Binding Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter()
 * @model
 * @generated
 */
public interface ApplyParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Bound Concept Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Concept Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Concept Qualifier</em>' reference.
	 * @see #setBoundConceptQualifier(Component)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter_BoundConceptQualifier()
	 * @model
	 * @generated
	 */
	Component getBoundConceptQualifier();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getBoundConceptQualifier <em>Bound Concept Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Concept Qualifier</em>' reference.
	 * @see #getBoundConceptQualifier()
	 * @generated
	 */
	void setBoundConceptQualifier(Component value);

	/**
	 * Returns the value of the '<em><b>Bound Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Concept</em>' reference.
	 * @see #setBoundConcept(Concept)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter_BoundConcept()
	 * @model
	 * @generated
	 */
	Concept getBoundConcept();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getBoundConcept <em>Bound Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Concept</em>' reference.
	 * @see #getBoundConcept()
	 * @generated
	 */
	void setBoundConcept(Concept value);

	/**
	 * Returns the value of the '<em><b>Binding Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Name</em>' attribute.
	 * @see #setBindingName(String)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getApplyParameter_BindingName()
	 * @model required="true"
	 * @generated
	 */
	String getBindingName();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.ApplyParameter#getBindingName <em>Binding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Name</em>' attribute.
	 * @see #getBindingName()
	 * @generated
	 */
	void setBindingName(String value);

} // ApplyParameter

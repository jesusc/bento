/**
 */
package bento.language.bentocomp.flowcontrol;

import bento.language.bentocomp.core.BindingDeclaration;
import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.core.Concept;
import bento.language.bentocomp.core.Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getModel <em>Model</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBoundConceptQualifier <em>Bound Concept Qualifier</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBoundConcept <em>Bound Concept</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApplyParameter()
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
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApplyParameter_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getModel <em>Model</em>}' reference.
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
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApplyParameter_BoundConceptQualifier()
	 * @model
	 * @generated
	 */
	Component getBoundConceptQualifier();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBoundConceptQualifier <em>Bound Concept Qualifier</em>}' reference.
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
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApplyParameter_BoundConcept()
	 * @model
	 * @generated
	 */
	Concept getBoundConcept();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBoundConcept <em>Bound Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Concept</em>' reference.
	 * @see #getBoundConcept()
	 * @generated
	 */
	void setBoundConcept(Concept value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(BindingDeclaration)
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getApplyParameter_Binding()
	 * @model
	 * @generated
	 */
	BindingDeclaration getBinding();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BindingDeclaration value);

} // ApplyParameter

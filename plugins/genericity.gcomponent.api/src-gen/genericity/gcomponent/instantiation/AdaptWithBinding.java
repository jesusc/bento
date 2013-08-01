/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation;

import genericity.language.gcomponent.core.BindingDeclaration;
import genericity.language.gcomponent.core.ParameterModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapt With Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.gcomponent.instantiation.AdaptWithBinding#getParameterIndex <em>Parameter Index</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.AdaptWithBinding#getConcreteModel <em>Concrete Model</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.AdaptWithBinding#getConceptModel <em>Concept Model</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.AdaptWithBinding#getAppliedBinding <em>Applied Binding</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.AdaptWithBinding#getTemplateData <em>Template Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptWithBinding()
 * @model
 * @generated
 */
public interface AdaptWithBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Index</em>' attribute.
	 * @see #setParameterIndex(int)
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptWithBinding_ParameterIndex()
	 * @model required="true"
	 * @generated
	 */
	int getParameterIndex();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getParameterIndex <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Index</em>' attribute.
	 * @see #getParameterIndex()
	 * @generated
	 */
	void setParameterIndex(int value);

	/**
	 * Returns the value of the '<em><b>Concrete Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Model</em>' reference.
	 * @see #setConcreteModel(ParameterModel)
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptWithBinding_ConcreteModel()
	 * @model required="true"
	 * @generated
	 */
	ParameterModel getConcreteModel();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getConcreteModel <em>Concrete Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Model</em>' reference.
	 * @see #getConcreteModel()
	 * @generated
	 */
	void setConcreteModel(ParameterModel value);

	/**
	 * Returns the value of the '<em><b>Concept Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Model</em>' reference.
	 * @see #setConceptModel(ParameterModel)
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptWithBinding_ConceptModel()
	 * @model required="true"
	 * @generated
	 */
	ParameterModel getConceptModel();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getConceptModel <em>Concept Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Model</em>' reference.
	 * @see #getConceptModel()
	 * @generated
	 */
	void setConceptModel(ParameterModel value);

	/**
	 * Returns the value of the '<em><b>Applied Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Binding</em>' reference.
	 * @see #setAppliedBinding(BindingDeclaration)
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptWithBinding_AppliedBinding()
	 * @model required="true"
	 * @generated
	 */
	BindingDeclaration getAppliedBinding();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getAppliedBinding <em>Applied Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Binding</em>' reference.
	 * @see #getAppliedBinding()
	 * @generated
	 */
	void setAppliedBinding(BindingDeclaration value);

	/**
	 * Returns the value of the '<em><b>Template Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Data</em>' containment reference.
	 * @see #setTemplateData(TemplateSpecificData)
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getAdaptWithBinding_TemplateData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateSpecificData getTemplateData();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getTemplateData <em>Template Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Data</em>' containment reference.
	 * @see #getTemplateData()
	 * @generated
	 */
	void setTemplateData(TemplateSpecificData value);

} // AdaptWithBinding

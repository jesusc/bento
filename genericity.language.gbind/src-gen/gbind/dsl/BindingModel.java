/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.BindingModel#getBindings <em>Bindings</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getHelpers <em>Helpers</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getConceptMetaclasses <em>Concept Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getConcreteMetaclasses <em>Concrete Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getMetamodelURI <em>Metamodel URI</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getName <em>Name</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getComponentURI <em>Component URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getBindingModel()
 * @model
 * @generated
 */
public interface BindingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.ConceptBinding}.
	 * It is bidirectional and its opposite is '{@link gbind.dsl.ConceptBinding#getModel_ <em>Model </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getBindingModel_Bindings()
	 * @see gbind.dsl.ConceptBinding#getModel_
	 * @model opposite="model_" containment="true"
	 * @generated
	 */
	EList<ConceptBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.BaseHelper}.
	 * It is bidirectional and its opposite is '{@link gbind.dsl.BaseHelper#getModel_ <em>Model </em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helpers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helpers</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getBindingModel_Helpers()
	 * @see gbind.dsl.BaseHelper#getModel_
	 * @model opposite="model_" containment="true"
	 * @generated
	 */
	EList<BaseHelper> getHelpers();

	/**
	 * Returns the value of the '<em><b>Concept Metaclasses</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.ConceptMetaclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Metaclasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Metaclasses</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getBindingModel_ConceptMetaclasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptMetaclass> getConceptMetaclasses();

	/**
	 * Returns the value of the '<em><b>Concrete Metaclasses</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.ConcreteMetaclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Metaclasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Metaclasses</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getBindingModel_ConcreteMetaclasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcreteMetaclass> getConcreteMetaclasses();

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' attribute.
	 * @see #setMetamodel(String)
	 * @see gbind.dsl.DslPackage#getBindingModel_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	String getMetamodel();

	/**
	 * Sets the value of the '{@link gbind.dsl.BindingModel#getMetamodel <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' attribute.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel URI</em>' attribute.
	 * @see #setMetamodelURI(String)
	 * @see gbind.dsl.DslPackage#getBindingModel_MetamodelURI()
	 * @model
	 * @generated
	 */
	String getMetamodelURI();

	/**
	 * Sets the value of the '{@link gbind.dsl.BindingModel#getMetamodelURI <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel URI</em>' attribute.
	 * @see #getMetamodelURI()
	 * @generated
	 */
	void setMetamodelURI(String value);

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
	 * @see gbind.dsl.DslPackage#getBindingModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gbind.dsl.BindingModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component URI</em>' attribute.
	 * @see #setComponentURI(String)
	 * @see gbind.dsl.DslPackage#getBindingModel_ComponentURI()
	 * @model
	 * @generated
	 */
	String getComponentURI();

	/**
	 * Sets the value of the '{@link gbind.dsl.BindingModel#getComponentURI <em>Component URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component URI</em>' attribute.
	 * @see #getComponentURI()
	 * @generated
	 */
	void setComponentURI(String value);

} // BindingModel

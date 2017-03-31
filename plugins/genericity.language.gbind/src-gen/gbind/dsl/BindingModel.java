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
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.BindingModel#isTargetBinding <em>Target Binding</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getBindings <em>Bindings</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getHelpers <em>Helpers</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getConceptMetaclasses <em>Concept Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getConcreteMetaclasses <em>Concrete Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getVirtualMetaclasses <em>Virtual Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getBoundConcept <em>Bound Concept</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getBoundMetamodels <em>Bound Metamodels</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getName <em>Name</em>}</li>
 *   <li>{@link gbind.dsl.BindingModel#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see gbind.dsl.DslPackage#getBindingModel()
 * @model
 * @generated
 */
public interface BindingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Binding</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Binding</em>' attribute.
	 * @see #setTargetBinding(boolean)
	 * @see gbind.dsl.DslPackage#getBindingModel_TargetBinding()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isTargetBinding();

	/**
	 * Sets the value of the '{@link gbind.dsl.BindingModel#isTargetBinding <em>Target Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Binding</em>' attribute.
	 * @see #isTargetBinding()
	 * @generated
	 */
	void setTargetBinding(boolean value);

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
	 * Returns the value of the '<em><b>Virtual Metaclasses</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.VirtualMetaclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Metaclasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Metaclasses</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getBindingModel_VirtualMetaclasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualMetaclass> getVirtualMetaclasses();

	/**
	 * Returns the value of the '<em><b>Bound Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Concept</em>' containment reference.
	 * @see #setBoundConcept(MetamodelDeclaration)
	 * @see gbind.dsl.DslPackage#getBindingModel_BoundConcept()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MetamodelDeclaration getBoundConcept();

	/**
	 * Sets the value of the '{@link gbind.dsl.BindingModel#getBoundConcept <em>Bound Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Concept</em>' containment reference.
	 * @see #getBoundConcept()
	 * @generated
	 */
	void setBoundConcept(MetamodelDeclaration value);

	/**
	 * Returns the value of the '<em><b>Bound Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.MetamodelDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Metamodels</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getBindingModel_BoundMetamodels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MetamodelDeclaration> getBoundMetamodels();

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
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(BindingOptions)
	 * @see gbind.dsl.DslPackage#getBindingModel_Options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BindingOptions getOptions();

	/**
	 * Sets the value of the '{@link gbind.dsl.BindingModel#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(BindingOptions value);

} // BindingModel

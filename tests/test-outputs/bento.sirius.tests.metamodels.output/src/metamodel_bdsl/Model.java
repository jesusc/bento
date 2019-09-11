/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Model#getName <em>Name</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getQuery <em>Query</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getOrderOnStockThreshold <em>Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getComponent <em>Component</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getFlow <em>Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link metamodel_bdsl.Model#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_Query()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQuery();

	/**
	 * Returns the value of the '<em><b>Order On Stock Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.OrderOnStockThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order On Stock Threshold</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order On Stock Threshold</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_OrderOnStockThreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderOnStockThreshold> getOrderOnStockThreshold();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_Flow()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flow> getFlow();

	/**
	 * Returns the value of the '<em><b>Contains None Element</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.NoneElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains None Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains None Element</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_ContainsNoneElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<NoneElement> getContainsNoneElement();

	/**
	 * Returns the value of the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.BindingElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Binding Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Binding Element</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_ContainsBindingElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingElement> getContainsBindingElement();

	/**
	 * Returns the value of the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.IntermediateElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Intermediate Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Intermediate Element</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_ContainsIntermediateElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermediateElement> getContainsIntermediateElement();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.MetamodelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_ContainsMetamodelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElement> getContainsMetamodelElement();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.MetamodelElementFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element Feature</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_ContainsMetamodelElementFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElementFeature> getContainsMetamodelElementFeature();

	/**
	 * Returns the value of the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.BindingAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Binding Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Binding Attribute</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_ContainsBindingAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingAttribute> getContainsBindingAttribute();

	/**
	 * Returns the value of the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.VirtualAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Virtual Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Virtual Attribute</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getModel_ContainsVirtualAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualAttribute> getContainsVirtualAttribute();

} // Model

/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link mindstorms_bdsl.NamedElement#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.NamedElement#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.NamedElement#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.NamedElement#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.NamedElement#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link mindstorms_bdsl.NamedElement#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link mindstorms_bdsl.NamedElement#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
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
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains None Element</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.NoneElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains None Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains None Element</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement_ContainsNoneElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<NoneElement> getContainsNoneElement();

	/**
	 * Returns the value of the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.BindingElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Binding Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Binding Element</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement_ContainsBindingElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingElement> getContainsBindingElement();

	/**
	 * Returns the value of the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.IntermediateElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Intermediate Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Intermediate Element</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement_ContainsIntermediateElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermediateElement> getContainsIntermediateElement();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.MetamodelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement_ContainsMetamodelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElement> getContainsMetamodelElement();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.MetamodelElementFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element Feature</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement_ContainsMetamodelElementFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElementFeature> getContainsMetamodelElementFeature();

	/**
	 * Returns the value of the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.BindingAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Binding Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Binding Attribute</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement_ContainsBindingAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingAttribute> getContainsBindingAttribute();

	/**
	 * Returns the value of the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.VirtualAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Virtual Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Virtual Attribute</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getNamedElement_ContainsVirtualAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualAttribute> getContainsVirtualAttribute();

} // NamedElement

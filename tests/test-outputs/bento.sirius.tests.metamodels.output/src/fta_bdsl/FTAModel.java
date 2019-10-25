/**
 */
package fta_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTA Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.FTAModel#getName <em>Name</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getDescription <em>Description</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getComments <em>Comments</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getEvents <em>Events</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getGates <em>Gates</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 *   <li>{@link fta_bdsl.FTAModel#getSourceMM <em>Source MM</em>}</li>
 * </ul>
 *
 * @see fta_bdsl.Fta_bdslPackage#getFTAModel()
 * @model
 * @generated
 */
public interface FTAModel extends EObject {
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
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fta_bdsl.FTAModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fta_bdsl.FTAModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link fta_bdsl.FTAModel#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Contains None Element</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.NoneElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains None Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains None Element</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_ContainsNoneElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<NoneElement> getContainsNoneElement();

	/**
	 * Returns the value of the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.BindingElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Binding Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Binding Element</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_ContainsBindingElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingElement> getContainsBindingElement();

	/**
	 * Returns the value of the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.IntermediateElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Intermediate Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Intermediate Element</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_ContainsIntermediateElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermediateElement> getContainsIntermediateElement();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.MetamodelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_ContainsMetamodelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElement> getContainsMetamodelElement();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.MetamodelElementFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element Feature</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_ContainsMetamodelElementFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElementFeature> getContainsMetamodelElementFeature();

	/**
	 * Returns the value of the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.BindingAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Binding Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Binding Attribute</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_ContainsBindingAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingAttribute> getContainsBindingAttribute();

	/**
	 * Returns the value of the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.VirtualAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Virtual Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Virtual Attribute</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_ContainsVirtualAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualAttribute> getContainsVirtualAttribute();

	/**
	 * Returns the value of the '<em><b>Source MM</b></em>' attribute.
	 * The default value is <code>"www.wakame.es/fta_bdsl"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source MM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source MM</em>' attribute.
	 * @see #setSourceMM(String)
	 * @see fta_bdsl.Fta_bdslPackage#getFTAModel_SourceMM()
	 * @model default="www.wakame.es/fta_bdsl"
	 * @generated
	 */
	String getSourceMM();

	/**
	 * Sets the value of the '{@link fta_bdsl.FTAModel#getSourceMM <em>Source MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source MM</em>' attribute.
	 * @see #getSourceMM()
	 * @generated
	 */
	void setSourceMM(String value);

} // FTAModel

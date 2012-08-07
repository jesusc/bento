/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pou Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getActions <em>Actions</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getBody <em>Body</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.PouType1#getPouType <em>Pou Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1()
 * @model extendedMetaData="name='pou_._type' kind='elementOnly'"
 * @generated
 */
public interface PouType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(InterfaceType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interface' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceType getInterface();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(ActionsType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_Actions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actions' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionsType getActions();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(ActionsType value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference.
	 * @see #setTransitions(TransitionsType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_Transitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transitions' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionsType getTransitions();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getTransitions <em>Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions</em>' containment reference.
	 * @see #getTransitions()
	 * @generated
	 */
	void setTransitions(TransitionsType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.Body}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_Body()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Body> getBody();

	/**
	 * Returns the value of the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Data</em>' containment reference.
	 * @see #setAddData(AddData)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getAddData <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data</em>' containment reference.
	 * @see #getAddData()
	 * @generated
	 */
	void setAddData(AddData value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional userspecific information to the element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(FormattedText)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Id</em>' attribute.
	 * @see #setGlobalId(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getGlobalId <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Id</em>' attribute.
	 * @see #getGlobalId()
	 * @generated
	 */
	void setGlobalId(String value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pou Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.PouType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pou Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pou Type</em>' attribute.
	 * @see org.plcopen.xml.tc60201.PouType
	 * @see #isSetPouType()
	 * @see #unsetPouType()
	 * @see #setPouType(PouType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType1_PouType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='pouType'"
	 * @generated
	 */
	PouType getPouType();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getPouType <em>Pou Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pou Type</em>' attribute.
	 * @see org.plcopen.xml.tc60201.PouType
	 * @see #isSetPouType()
	 * @see #unsetPouType()
	 * @see #getPouType()
	 * @generated
	 */
	void setPouType(PouType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.PouType1#getPouType <em>Pou Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPouType()
	 * @see #getPouType()
	 * @see #setPouType(PouType)
	 * @generated
	 */
	void unsetPouType();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.PouType1#getPouType <em>Pou Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pou Type</em>' attribute is set.
	 * @see #unsetPouType()
	 * @see #getPouType()
	 * @see #setPouType(PouType)
	 * @generated
	 */
	boolean isSetPouType();

} // PouType1

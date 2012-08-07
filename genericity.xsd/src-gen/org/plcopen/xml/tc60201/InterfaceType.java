/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getLocalVars <em>Local Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getTempVars <em>Temp Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getInputVars <em>Input Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getOutputVars <em>Output Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getInOutVars <em>In Out Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getExternalVars <em>External Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getAccessVars <em>Access Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InterfaceType#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType()
 * @model extendedMetaData="name='interface_._type' kind='elementOnly'"
 * @generated
 */
public interface InterfaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(DataType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_ReturnType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='returnType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InterfaceType#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Local Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.LocalVarsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Vars</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_LocalVars()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='localVars' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<LocalVarsType> getLocalVars();

	/**
	 * Returns the value of the '<em><b>Temp Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.TempVarsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Vars</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_TempVars()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tempVars' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TempVarsType> getTempVars();

	/**
	 * Returns the value of the '<em><b>Input Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.InputVarsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Vars</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_InputVars()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inputVars' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InputVarsType> getInputVars();

	/**
	 * Returns the value of the '<em><b>Output Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.OutputVarsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Vars</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_OutputVars()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outputVars' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OutputVarsType> getOutputVars();

	/**
	 * Returns the value of the '<em><b>In Out Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.InOutVarsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Out Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Out Vars</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_InOutVars()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inOutVars' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InOutVarsType> getInOutVars();

	/**
	 * Returns the value of the '<em><b>External Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ExternalVarsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Vars</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_ExternalVars()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='externalVars' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ExternalVarsType> getExternalVars();

	/**
	 * Returns the value of the '<em><b>Global Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.GlobalVarsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Vars</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_GlobalVars()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='globalVars' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<GlobalVarsType> getGlobalVars();

	/**
	 * Returns the value of the '<em><b>Access Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.VarList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Vars</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_AccessVars()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='accessVars' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VarList> getAccessVars();

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InterfaceType#getAddData <em>Add Data</em>}' containment reference.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInterfaceType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InterfaceType#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

} // InterfaceType

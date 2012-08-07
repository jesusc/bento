/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a graphical object representing a call statement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getPosition <em>Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getInputVariables <em>Input Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getInOutVariables <em>In Out Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getOutputVariables <em>Output Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getExecutionOrderId <em>Execution Order Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.BlockType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType()
 * @model extendedMetaData="name='block_._type' kind='elementOnly'"
 * @generated
 */
public interface BlockType extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anchor position of the box. Top left corner excluding the instance name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Input Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of used input variables (consumers)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Variables</em>' containment reference.
	 * @see #setInputVariables(InputVariablesType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_InputVariables()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inputVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	InputVariablesType getInputVariables();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getInputVariables <em>Input Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Variables</em>' containment reference.
	 * @see #getInputVariables()
	 * @generated
	 */
	void setInputVariables(InputVariablesType value);

	/**
	 * Returns the value of the '<em><b>In Out Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of used inOut variables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Out Variables</em>' containment reference.
	 * @see #setInOutVariables(InOutVariablesType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_InOutVariables()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inOutVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	InOutVariablesType getInOutVariables();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getInOutVariables <em>In Out Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Out Variables</em>' containment reference.
	 * @see #getInOutVariables()
	 * @generated
	 */
	void setInOutVariables(InOutVariablesType value);

	/**
	 * Returns the value of the '<em><b>Output Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of used output variables (producers)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Variables</em>' containment reference.
	 * @see #setOutputVariables(OutputVariablesType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_OutputVariables()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outputVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputVariablesType getOutputVariables();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getOutputVariables <em>Output Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Variables</em>' containment reference.
	 * @see #getOutputVariables()
	 * @generated
	 */
	void setOutputVariables(OutputVariablesType value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getAddData <em>Add Data</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(FormattedText)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify the order of execution. Also used to identify one special block if there are several blocks with the same name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Order Id</em>' attribute.
	 * @see #setExecutionOrderId(BigInteger)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_ExecutionOrderId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='executionOrderId'"
	 * @generated
	 */
	BigInteger getExecutionOrderId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getExecutionOrderId <em>Execution Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Order Id</em>' attribute.
	 * @see #getExecutionOrderId()
	 * @generated
	 */
	void setExecutionOrderId(BigInteger value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getGlobalId <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Id</em>' attribute.
	 * @see #getGlobalId()
	 * @generated
	 */
	void setGlobalId(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(BigDecimal)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	BigDecimal getHeight();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_InstanceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Id</em>' attribute.
	 * @see #setLocalId(BigInteger)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_LocalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='localId'"
	 * @generated
	 */
	BigInteger getLocalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_TypeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='typeName'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(BigDecimal)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBlockType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	BigDecimal getWidth();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.BlockType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigDecimal value);

} // BlockType

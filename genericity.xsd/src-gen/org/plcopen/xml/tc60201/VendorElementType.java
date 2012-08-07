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
 * A representation of the model object '<em><b>Vendor Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a graphical object representing a call statement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getPosition <em>Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getAlternativeText <em>Alternative Text</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getInputVariables <em>Input Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getInOutVariables <em>In Out Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getOutputVariables <em>Output Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getExecutionOrderId <em>Execution Order Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VendorElementType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType()
 * @model extendedMetaData="name='vendorElement_._type' kind='elementOnly'"
 * @generated
 */
public interface VendorElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anchor position of the box. Top left corner excluding the instance name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Alternative Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An alternative text to be displayed in generic representation of unknown elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative Text</em>' containment reference.
	 * @see #setAlternativeText(FormattedText)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_AlternativeText()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='alternativeText' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getAlternativeText();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getAlternativeText <em>Alternative Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Text</em>' containment reference.
	 * @see #getAlternativeText()
	 * @generated
	 */
	void setAlternativeText(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Input Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of used input variables (consumers)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Variables</em>' containment reference.
	 * @see #setInputVariables(InputVariablesType1)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_InputVariables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	InputVariablesType1 getInputVariables();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getInputVariables <em>Input Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Variables</em>' containment reference.
	 * @see #getInputVariables()
	 * @generated
	 */
	void setInputVariables(InputVariablesType1 value);

	/**
	 * Returns the value of the '<em><b>In Out Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of used inOut variables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Out Variables</em>' containment reference.
	 * @see #setInOutVariables(InOutVariablesType1)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_InOutVariables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inOutVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	InOutVariablesType1 getInOutVariables();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getInOutVariables <em>In Out Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Out Variables</em>' containment reference.
	 * @see #getInOutVariables()
	 * @generated
	 */
	void setInOutVariables(InOutVariablesType1 value);

	/**
	 * Returns the value of the '<em><b>Output Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of used output variables (producers)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Variables</em>' containment reference.
	 * @see #setOutputVariables(OutputVariablesType1)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_OutputVariables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputVariables' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputVariablesType1 getOutputVariables();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getOutputVariables <em>Output Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Variables</em>' containment reference.
	 * @see #getOutputVariables()
	 * @generated
	 */
	void setOutputVariables(OutputVariablesType1 value);

	/**
	 * Returns the value of the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional, vendor specific data for the element. Also defines the vendor specific meaning of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Data</em>' containment reference.
	 * @see #setAddData(AddData)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_AddData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getAddData <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data</em>' containment reference.
	 * @see #getAddData()
	 * @generated
	 */
	void setAddData(AddData value);

	/**
	 * Returns the value of the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify the order of execution. Also used to identify one special block if there are several blocks with the same name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Order Id</em>' attribute.
	 * @see #setExecutionOrderId(BigInteger)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_ExecutionOrderId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='executionOrderId'"
	 * @generated
	 */
	BigInteger getExecutionOrderId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getExecutionOrderId <em>Execution Order Id</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getGlobalId <em>Global Id</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	BigDecimal getHeight();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BigDecimal value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_LocalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='localId'"
	 * @generated
	 */
	BigInteger getLocalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(BigInteger value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVendorElementType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	BigDecimal getWidth();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VendorElementType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigDecimal value);

} // VendorElementType

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
 * A representation of the model object '<em><b>In Variable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a graphical object representing a variable, literal or expression used as r-value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getPosition <em>Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getConnectionPointOut <em>Connection Point Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getExecutionOrderId <em>Execution Order Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#isNegated <em>Negated</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getStorage <em>Storage</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InVariableType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType()
 * @model extendedMetaData="name='inVariable_._type' kind='elementOnly'"
 * @generated
 */
public interface InVariableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point Out</em>' containment reference.
	 * @see #setConnectionPointOut(ConnectionPointOut)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_ConnectionPointOut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectionPointOut' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionPointOut getConnectionPointOut();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getConnectionPointOut <em>Connection Point Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Point Out</em>' containment reference.
	 * @see #getConnectionPointOut()
	 * @generated
	 */
	void setConnectionPointOut(ConnectionPointOut value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operand is a valid iec variable e.g. avar[0].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getAddData <em>Add Data</em>}' containment reference.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.EdgeModifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' attribute.
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @see #isSetEdge()
	 * @see #unsetEdge()
	 * @see #setEdge(EdgeModifierType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_Edge()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='edge'"
	 * @generated
	 */
	EdgeModifierType getEdge();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getEdge <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' attribute.
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @see #isSetEdge()
	 * @see #unsetEdge()
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(EdgeModifierType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getEdge <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdge()
	 * @see #getEdge()
	 * @see #setEdge(EdgeModifierType)
	 * @generated
	 */
	void unsetEdge();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getEdge <em>Edge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge</em>' attribute is set.
	 * @see #unsetEdge()
	 * @see #getEdge()
	 * @see #setEdge(EdgeModifierType)
	 * @generated
	 */
	boolean isSetEdge();

	/**
	 * Returns the value of the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Order Id</em>' attribute.
	 * @see #setExecutionOrderId(BigInteger)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_ExecutionOrderId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='executionOrderId'"
	 * @generated
	 */
	BigInteger getExecutionOrderId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getExecutionOrderId <em>Execution Order Id</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getGlobalId <em>Global Id</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	BigDecimal getHeight();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getHeight <em>Height</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_LocalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='localId'"
	 * @generated
	 */
	BigInteger getLocalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #isSetNegated()
	 * @see #unsetNegated()
	 * @see #setNegated(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_Negated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='negated'"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isSetNegated()
	 * @see #unsetNegated()
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNegated()
	 * @see #isNegated()
	 * @see #setNegated(boolean)
	 * @generated
	 */
	void unsetNegated();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InVariableType#isNegated <em>Negated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Negated</em>' attribute is set.
	 * @see #unsetNegated()
	 * @see #isNegated()
	 * @see #setNegated(boolean)
	 * @generated
	 */
	boolean isSetNegated();

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.StorageModifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @see #isSetStorage()
	 * @see #unsetStorage()
	 * @see #setStorage(StorageModifierType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_Storage()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='storage'"
	 * @generated
	 */
	StorageModifierType getStorage();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @see #isSetStorage()
	 * @see #unsetStorage()
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(StorageModifierType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStorage()
	 * @see #getStorage()
	 * @see #setStorage(StorageModifierType)
	 * @generated
	 */
	void unsetStorage();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getStorage <em>Storage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Storage</em>' attribute is set.
	 * @see #unsetStorage()
	 * @see #getStorage()
	 * @see #setStorage(StorageModifierType)
	 * @generated
	 */
	boolean isSetStorage();

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInVariableType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	BigDecimal getWidth();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InVariableType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigDecimal value);

} // InVariableType

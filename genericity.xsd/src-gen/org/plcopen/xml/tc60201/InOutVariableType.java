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
 * A representation of the model object '<em><b>In Out Variable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a graphical object representing a variable which can be used as l-value and r-value at the same time
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getPosition <em>Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getConnectionPointIn <em>Connection Point In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getConnectionPointOut <em>Connection Point Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeIn <em>Edge In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeOut <em>Edge Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getExecutionOrderId <em>Execution Order Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedIn <em>Negated In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedOut <em>Negated Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageIn <em>Storage In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageOut <em>Storage Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.InOutVariableType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType()
 * @model extendedMetaData="name='inOutVariable_._type' kind='elementOnly'"
 * @generated
 */
public interface InOutVariableType extends EObject {
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point In</em>' containment reference.
	 * @see #setConnectionPointIn(ConnectionPointIn)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_ConnectionPointIn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectionPointIn' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionPointIn getConnectionPointIn();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getConnectionPointIn <em>Connection Point In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Point In</em>' containment reference.
	 * @see #getConnectionPointIn()
	 * @generated
	 */
	void setConnectionPointIn(ConnectionPointIn value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_ConnectionPointOut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectionPointOut' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionPointOut getConnectionPointOut();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getConnectionPointOut <em>Connection Point Out</em>}' containment reference.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getExpression <em>Expression</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getAddData <em>Add Data</em>}' containment reference.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Edge In</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.EdgeModifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge In</em>' attribute.
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @see #isSetEdgeIn()
	 * @see #unsetEdgeIn()
	 * @see #setEdgeIn(EdgeModifierType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_EdgeIn()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='edgeIn'"
	 * @generated
	 */
	EdgeModifierType getEdgeIn();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeIn <em>Edge In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge In</em>' attribute.
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @see #isSetEdgeIn()
	 * @see #unsetEdgeIn()
	 * @see #getEdgeIn()
	 * @generated
	 */
	void setEdgeIn(EdgeModifierType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeIn <em>Edge In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeIn()
	 * @see #getEdgeIn()
	 * @see #setEdgeIn(EdgeModifierType)
	 * @generated
	 */
	void unsetEdgeIn();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeIn <em>Edge In</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge In</em>' attribute is set.
	 * @see #unsetEdgeIn()
	 * @see #getEdgeIn()
	 * @see #setEdgeIn(EdgeModifierType)
	 * @generated
	 */
	boolean isSetEdgeIn();

	/**
	 * Returns the value of the '<em><b>Edge Out</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.EdgeModifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Out</em>' attribute.
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @see #isSetEdgeOut()
	 * @see #unsetEdgeOut()
	 * @see #setEdgeOut(EdgeModifierType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_EdgeOut()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='edgeOut'"
	 * @generated
	 */
	EdgeModifierType getEdgeOut();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeOut <em>Edge Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Out</em>' attribute.
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @see #isSetEdgeOut()
	 * @see #unsetEdgeOut()
	 * @see #getEdgeOut()
	 * @generated
	 */
	void setEdgeOut(EdgeModifierType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeOut <em>Edge Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeOut()
	 * @see #getEdgeOut()
	 * @see #setEdgeOut(EdgeModifierType)
	 * @generated
	 */
	void unsetEdgeOut();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeOut <em>Edge Out</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge Out</em>' attribute is set.
	 * @see #unsetEdgeOut()
	 * @see #getEdgeOut()
	 * @see #setEdgeOut(EdgeModifierType)
	 * @generated
	 */
	boolean isSetEdgeOut();

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_ExecutionOrderId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='executionOrderId'"
	 * @generated
	 */
	BigInteger getExecutionOrderId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getExecutionOrderId <em>Execution Order Id</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getGlobalId <em>Global Id</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	BigDecimal getHeight();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getHeight <em>Height</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_LocalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='localId'"
	 * @generated
	 */
	BigInteger getLocalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Negated In</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated In</em>' attribute.
	 * @see #isSetNegatedIn()
	 * @see #unsetNegatedIn()
	 * @see #setNegatedIn(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_NegatedIn()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='negatedIn'"
	 * @generated
	 */
	boolean isNegatedIn();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedIn <em>Negated In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated In</em>' attribute.
	 * @see #isSetNegatedIn()
	 * @see #unsetNegatedIn()
	 * @see #isNegatedIn()
	 * @generated
	 */
	void setNegatedIn(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedIn <em>Negated In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNegatedIn()
	 * @see #isNegatedIn()
	 * @see #setNegatedIn(boolean)
	 * @generated
	 */
	void unsetNegatedIn();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedIn <em>Negated In</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Negated In</em>' attribute is set.
	 * @see #unsetNegatedIn()
	 * @see #isNegatedIn()
	 * @see #setNegatedIn(boolean)
	 * @generated
	 */
	boolean isSetNegatedIn();

	/**
	 * Returns the value of the '<em><b>Negated Out</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated Out</em>' attribute.
	 * @see #isSetNegatedOut()
	 * @see #unsetNegatedOut()
	 * @see #setNegatedOut(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_NegatedOut()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='negatedOut'"
	 * @generated
	 */
	boolean isNegatedOut();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedOut <em>Negated Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated Out</em>' attribute.
	 * @see #isSetNegatedOut()
	 * @see #unsetNegatedOut()
	 * @see #isNegatedOut()
	 * @generated
	 */
	void setNegatedOut(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedOut <em>Negated Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNegatedOut()
	 * @see #isNegatedOut()
	 * @see #setNegatedOut(boolean)
	 * @generated
	 */
	void unsetNegatedOut();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedOut <em>Negated Out</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Negated Out</em>' attribute is set.
	 * @see #unsetNegatedOut()
	 * @see #isNegatedOut()
	 * @see #setNegatedOut(boolean)
	 * @generated
	 */
	boolean isSetNegatedOut();

	/**
	 * Returns the value of the '<em><b>Storage In</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.StorageModifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage In</em>' attribute.
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @see #isSetStorageIn()
	 * @see #unsetStorageIn()
	 * @see #setStorageIn(StorageModifierType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_StorageIn()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='storageIn'"
	 * @generated
	 */
	StorageModifierType getStorageIn();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageIn <em>Storage In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage In</em>' attribute.
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @see #isSetStorageIn()
	 * @see #unsetStorageIn()
	 * @see #getStorageIn()
	 * @generated
	 */
	void setStorageIn(StorageModifierType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageIn <em>Storage In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStorageIn()
	 * @see #getStorageIn()
	 * @see #setStorageIn(StorageModifierType)
	 * @generated
	 */
	void unsetStorageIn();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageIn <em>Storage In</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Storage In</em>' attribute is set.
	 * @see #unsetStorageIn()
	 * @see #getStorageIn()
	 * @see #setStorageIn(StorageModifierType)
	 * @generated
	 */
	boolean isSetStorageIn();

	/**
	 * Returns the value of the '<em><b>Storage Out</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.StorageModifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Out</em>' attribute.
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @see #isSetStorageOut()
	 * @see #unsetStorageOut()
	 * @see #setStorageOut(StorageModifierType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_StorageOut()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='storageOut'"
	 * @generated
	 */
	StorageModifierType getStorageOut();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageOut <em>Storage Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Out</em>' attribute.
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @see #isSetStorageOut()
	 * @see #unsetStorageOut()
	 * @see #getStorageOut()
	 * @generated
	 */
	void setStorageOut(StorageModifierType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageOut <em>Storage Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStorageOut()
	 * @see #getStorageOut()
	 * @see #setStorageOut(StorageModifierType)
	 * @generated
	 */
	void unsetStorageOut();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageOut <em>Storage Out</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Storage Out</em>' attribute is set.
	 * @see #unsetStorageOut()
	 * @see #getStorageOut()
	 * @see #setStorageOut(StorageModifierType)
	 * @generated
	 */
	boolean isSetStorageOut();

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInOutVariableType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	BigDecimal getWidth();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InOutVariableType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigDecimal value);

} // InOutVariableType

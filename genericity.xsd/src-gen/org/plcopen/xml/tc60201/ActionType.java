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
 * A representation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Association of an action with qualifier
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getInline <em>Inline</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getConnectionPointOut <em>Connection Point Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getExecutionOrderId <em>Execution Order Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ActionType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType()
 * @model extendedMetaData="name='action_._type' kind='elementOnly'"
 * @generated
 */
public interface ActionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative position of the action. Origin is the anchor position of the action block.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Position</em>' containment reference.
	 * @see #setRelPosition(Position)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_RelPosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	Position getRelPosition();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getRelPosition <em>Rel Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Position</em>' containment reference.
	 * @see #getRelPosition()
	 * @generated
	 */
	void setRelPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of an action or boolean variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType1)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType1 getReference();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType1 value);

	/**
	 * Returns the value of the '<em><b>Inline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inline implementation of an action body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inline</em>' containment reference.
	 * @see #setInline(Body)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_Inline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inline' namespace='##targetNamespace'"
	 * @generated
	 */
	Body getInline();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getInline <em>Inline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline</em>' containment reference.
	 * @see #getInline()
	 * @generated
	 */
	void setInline(Body value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_ConnectionPointOut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectionPointOut' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionPointOut getConnectionPointOut();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getConnectionPointOut <em>Connection Point Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Point Out</em>' containment reference.
	 * @see #getConnectionPointOut()
	 * @generated
	 */
	void setConnectionPointOut(ConnectionPointOut value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getAddData <em>Add Data</em>}' containment reference.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='duration'"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify the order of execution. Also used to identify one special block if there are several blocks with the same name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Order Id</em>' attribute.
	 * @see #setExecutionOrderId(BigInteger)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_ExecutionOrderId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='executionOrderId'"
	 * @generated
	 */
	BigInteger getExecutionOrderId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getExecutionOrderId <em>Execution Order Id</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getGlobalId <em>Global Id</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	BigDecimal getHeight();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='indicator'"
	 * @generated
	 */
	String getIndicator();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getIndicator <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' attribute.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(String value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_LocalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='localId'"
	 * @generated
	 */
	BigInteger getLocalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getLocalId <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Id</em>' attribute.
	 * @see #getLocalId()
	 * @generated
	 */
	void setLocalId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * The default value is <code>"N"</code>.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.QualifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see org.plcopen.xml.tc60201.QualifierType
	 * @see #isSetQualifier()
	 * @see #unsetQualifier()
	 * @see #setQualifier(QualifierType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_Qualifier()
	 * @model default="N" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='qualifier'"
	 * @generated
	 */
	QualifierType getQualifier();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see org.plcopen.xml.tc60201.QualifierType
	 * @see #isSetQualifier()
	 * @see #unsetQualifier()
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(QualifierType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualifier()
	 * @see #getQualifier()
	 * @see #setQualifier(QualifierType)
	 * @generated
	 */
	void unsetQualifier();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.ActionType#getQualifier <em>Qualifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualifier</em>' attribute is set.
	 * @see #unsetQualifier()
	 * @see #getQualifier()
	 * @see #setQualifier(QualifierType)
	 * @generated
	 */
	boolean isSetQualifier();

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getActionType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	BigDecimal getWidth();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ActionType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigDecimal value);

} // ActionType

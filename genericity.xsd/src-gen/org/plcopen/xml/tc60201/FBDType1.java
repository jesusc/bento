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
 * A representation of the model object '<em><b>FBD Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getComment <em>Comment</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getError <em>Error</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getActionBlock <em>Action Block</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getVendorElement <em>Vendor Element</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getBlock <em>Block</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getInVariable <em>In Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getOutVariable <em>Out Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getInOutVariable <em>In Out Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getLabel <em>Label</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getJump <em>Jump</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FBDType1#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1()
 * @model extendedMetaData="name='FBD_._type' kind='elementOnly'"
 * @generated
 */
public interface FBDType1 extends EObject {
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.CommentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Comment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CommentType> getComment();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Error()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ErrorType> getError();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ConnectorType> getConnector();

	/**
	 * Returns the value of the '<em><b>Continuation</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ContinuationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Counterpart of the connector element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuation</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Continuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='continuation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ContinuationType> getContinuation();

	/**
	 * Returns the value of the '<em><b>Action Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ActionBlockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Block</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_ActionBlock()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actionBlock' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ActionBlockType> getActionBlock();

	/**
	 * Returns the value of the '<em><b>Vendor Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.VendorElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Element</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_VendorElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='vendorElement' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VendorElementType> getVendorElement();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.BlockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Block()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='block' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BlockType> getBlock();

	/**
	 * Returns the value of the '<em><b>In Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.InVariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression used as producer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Variable</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_InVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inVariable' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<InVariableType> getInVariable();

	/**
	 * Returns the value of the '<em><b>Out Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.OutVariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression used as consumer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Variable</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_OutVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outVariable' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OutVariableType> getOutVariable();

	/**
	 * Returns the value of the '<em><b>In Out Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.InOutVariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression used as producer and consumer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Out Variable</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_InOutVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inOutVariable' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<InOutVariableType> getInOutVariable();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.LabelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Label()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LabelType> getLabel();

	/**
	 * Returns the value of the '<em><b>Jump</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.JumpType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jump</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Jump()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jump' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JumpType> getJump();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFBDType1_Return()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='return' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReturnType> getReturn();

} // FBDType1

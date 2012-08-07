/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a connection between the consumer element (eg. input variable of a function block) and the producer element (eg. output variable of a function block). It may contain a list of positions that describes the path of the connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.Connection#getPosition <em>Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Connection#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Connection#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Connection#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Connection#getRefLocalId <em>Ref Local Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnection()
 * @model extendedMetaData="name='connection' kind='elementOnly'"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All positions of the directed connection path. If any positions are given, the list has to contain the first (input pin of the consumer element) as well as the last (output pin of the producer element).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnection_Position()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Position> getPosition();

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnection_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Connection#getAddData <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data</em>' containment reference.
	 * @see #getAddData()
	 * @generated
	 */
	void setAddData(AddData value);

	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present:
	 * 	  This attribute denotes the name of the VAR_OUTPUT / VAR_IN_OUTparameter of the pou block that is the start of the connection.
	 * 	  If not present:
	 * 	  If the refLocalId attribute refers to a pou block, the start of the connection is the first output of this block, which is not ENO.
	 * 	  If the refLocalId attribute refers to any other element type, the start of the connection is the elements single native output. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' attribute.
	 * @see #setFormalParameter(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnection_FormalParameter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='formalParameter'"
	 * @generated
	 */
	String getFormalParameter();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Connection#getFormalParameter <em>Formal Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameter</em>' attribute.
	 * @see #getFormalParameter()
	 * @generated
	 */
	void setFormalParameter(String value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnection_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Connection#getGlobalId <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Id</em>' attribute.
	 * @see #getGlobalId()
	 * @generated
	 */
	void setGlobalId(String value);

	/**
	 * Returns the value of the '<em><b>Ref Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the element the connection starts from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Local Id</em>' attribute.
	 * @see #setRefLocalId(BigInteger)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnection_RefLocalId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong" required="true"
	 *        extendedMetaData="kind='attribute' name='refLocalId'"
	 * @generated
	 */
	BigInteger getRefLocalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Connection#getRefLocalId <em>Ref Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Local Id</em>' attribute.
	 * @see #getRefLocalId()
	 * @generated
	 */
	void setRefLocalId(BigInteger value);

} // Connection

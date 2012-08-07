/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a connection point on the producer side
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ConnectionPointOut#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ConnectionPointOut#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ConnectionPointOut#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ConnectionPointOut#getGlobalId <em>Global Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnectionPointOut()
 * @model extendedMetaData="name='connectionPointOut' kind='elementOnly'"
 * @generated
 */
public interface ConnectionPointOut extends EObject {
	/**
	 * Returns the value of the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative position of the connection pin. Origin is the anchor position of the block.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Position</em>' containment reference.
	 * @see #setRelPosition(Position)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnectionPointOut_RelPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	Position getRelPosition();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConnectionPointOut#getRelPosition <em>Rel Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Position</em>' containment reference.
	 * @see #getRelPosition()
	 * @generated
	 */
	void setRelPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operand is a valid iec variable e.g. avar[0].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnectionPointOut_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConnectionPointOut#getExpression <em>Expression</em>}' attribute.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnectionPointOut_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConnectionPointOut#getAddData <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data</em>' containment reference.
	 * @see #getAddData()
	 * @generated
	 */
	void setAddData(AddData value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnectionPointOut_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConnectionPointOut#getGlobalId <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Id</em>' attribute.
	 * @see #getGlobalId()
	 * @generated
	 */
	void setGlobalId(String value);

} // ConnectionPointOut

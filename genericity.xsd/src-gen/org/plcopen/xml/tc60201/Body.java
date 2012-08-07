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
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Implementation part of a POU, action or transistion
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getIL <em>IL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getST <em>ST</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getFBD <em>FBD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getLD <em>LD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getSFC <em>SFC</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Body#getWorksheetName <em>Worksheet Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody()
 * @model extendedMetaData="name='body' kind='elementOnly'"
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>IL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IL</em>' containment reference.
	 * @see #setIL(FormattedText)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_IL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IL' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getIL();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getIL <em>IL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IL</em>' containment reference.
	 * @see #getIL()
	 * @generated
	 */
	void setIL(FormattedText value);

	/**
	 * Returns the value of the '<em><b>ST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ST</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ST</em>' containment reference.
	 * @see #setST(FormattedText)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_ST()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ST' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getST();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getST <em>ST</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ST</em>' containment reference.
	 * @see #getST()
	 * @generated
	 */
	void setST(FormattedText value);

	/**
	 * Returns the value of the '<em><b>FBD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FBD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FBD</em>' containment reference.
	 * @see #setFBD(FBDType1)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_FBD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FBD' namespace='##targetNamespace'"
	 * @generated
	 */
	FBDType1 getFBD();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getFBD <em>FBD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FBD</em>' containment reference.
	 * @see #getFBD()
	 * @generated
	 */
	void setFBD(FBDType1 value);

	/**
	 * Returns the value of the '<em><b>LD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LD</em>' containment reference.
	 * @see #setLD(LDType1)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_LD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LD' namespace='##targetNamespace'"
	 * @generated
	 */
	LDType1 getLD();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getLD <em>LD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LD</em>' containment reference.
	 * @see #getLD()
	 * @generated
	 */
	void setLD(LDType1 value);

	/**
	 * Returns the value of the '<em><b>SFC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFC</em>' containment reference.
	 * @see #setSFC(SFCType1)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_SFC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SFC' namespace='##targetNamespace'"
	 * @generated
	 */
	SFCType1 getSFC();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getSFC <em>SFC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SFC</em>' containment reference.
	 * @see #getSFC()
	 * @generated
	 */
	void setSFC(SFCType1 value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getAddData <em>Add Data</em>}' containment reference.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getDocumentation <em>Documentation</em>}' containment reference.
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getGlobalId <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Id</em>' attribute.
	 * @see #getGlobalId()
	 * @generated
	 */
	void setGlobalId(String value);

	/**
	 * Returns the value of the '<em><b>Worksheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksheet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksheet Name</em>' attribute.
	 * @see #setWorksheetName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getBody_WorksheetName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='WorksheetName'"
	 * @generated
	 */
	String getWorksheetName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Body#getWorksheetName <em>Worksheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksheet Name</em>' attribute.
	 * @see #getWorksheetName()
	 * @generated
	 */
	void setWorksheetName(String value);

} // Body

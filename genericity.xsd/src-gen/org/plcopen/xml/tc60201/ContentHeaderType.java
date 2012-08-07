/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Header Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getCoordinateInfo <em>Coordinate Info</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getAddDataInfo <em>Add Data Info</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getModificationDateTime <em>Modification Date Time</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ContentHeaderType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType()
 * @model extendedMetaData="name='contentHeader_._type' kind='elementOnly'"
 * @generated
 */
public interface ContentHeaderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Coordinate Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Info</em>' containment reference.
	 * @see #setCoordinateInfo(CoordinateInfoType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_CoordinateInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coordinateInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateInfoType getCoordinateInfo();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getCoordinateInfo <em>Coordinate Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Info</em>' containment reference.
	 * @see #getCoordinateInfo()
	 * @generated
	 */
	void setCoordinateInfo(CoordinateInfoType value);

	/**
	 * Returns the value of the '<em><b>Add Data Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Data Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Data Info</em>' containment reference.
	 * @see #setAddDataInfo(AddDataInfo)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_AddDataInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addDataInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	AddDataInfo getAddDataInfo();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getAddDataInfo <em>Add Data Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data Info</em>' containment reference.
	 * @see #getAddDataInfo()
	 * @generated
	 */
	void setAddDataInfo(AddDataInfo value);

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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getAddData <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data</em>' containment reference.
	 * @see #getAddData()
	 * @generated
	 */
	void setAddData(AddData value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='author'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation language of the project e.g. "en-US"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='language'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Modification Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Date Time</em>' attribute.
	 * @see #setModificationDateTime(XMLGregorianCalendar)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_ModificationDateTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='modificationDateTime'"
	 * @generated
	 */
	XMLGregorianCalendar getModificationDateTime();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getModificationDateTime <em>Modification Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Date Time</em>' attribute.
	 * @see #getModificationDateTime()
	 * @generated
	 */
	void setModificationDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_Organization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='organization'"
	 * @generated
	 */
	String getOrganization();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getContentHeaderType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ContentHeaderType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ContentHeaderType

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
 * A representation of the model object '<em><b>File Header Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.FileHeaderType#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FileHeaderType#getCompanyURL <em>Company URL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FileHeaderType#getContentDescription <em>Content Description</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FileHeaderType#getCreationDateTime <em>Creation Date Time</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FileHeaderType#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FileHeaderType#getProductRelease <em>Product Release</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.FileHeaderType#getProductVersion <em>Product Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getFileHeaderType()
 * @model extendedMetaData="name='fileHeader_._type' kind='empty'"
 * @generated
 */
public interface FileHeaderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFileHeaderType_CompanyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='companyName'"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.FileHeaderType#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Company URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company URL</em>' attribute.
	 * @see #setCompanyURL(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFileHeaderType_CompanyURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='companyURL'"
	 * @generated
	 */
	String getCompanyURL();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.FileHeaderType#getCompanyURL <em>Company URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company URL</em>' attribute.
	 * @see #getCompanyURL()
	 * @generated
	 */
	void setCompanyURL(String value);

	/**
	 * Returns the value of the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Description</em>' attribute.
	 * @see #setContentDescription(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFileHeaderType_ContentDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='contentDescription'"
	 * @generated
	 */
	String getContentDescription();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.FileHeaderType#getContentDescription <em>Content Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Description</em>' attribute.
	 * @see #getContentDescription()
	 * @generated
	 */
	void setContentDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date Time</em>' attribute.
	 * @see #setCreationDateTime(XMLGregorianCalendar)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFileHeaderType_CreationDateTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='creationDateTime'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDateTime();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.FileHeaderType#getCreationDateTime <em>Creation Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date Time</em>' attribute.
	 * @see #getCreationDateTime()
	 * @generated
	 */
	void setCreationDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFileHeaderType_ProductName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='productName'"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.FileHeaderType#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Product Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Release</em>' attribute.
	 * @see #setProductRelease(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFileHeaderType_ProductRelease()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='productRelease'"
	 * @generated
	 */
	String getProductRelease();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.FileHeaderType#getProductRelease <em>Product Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Release</em>' attribute.
	 * @see #getProductRelease()
	 * @generated
	 */
	void setProductRelease(String value);

	/**
	 * Returns the value of the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Version</em>' attribute.
	 * @see #setProductVersion(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFileHeaderType_ProductVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='productVersion'"
	 * @generated
	 */
	String getProductVersion();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.FileHeaderType#getProductVersion <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Version</em>' attribute.
	 * @see #getProductVersion()
	 * @generated
	 */
	void setProductVersion(String value);

} // FileHeaderType

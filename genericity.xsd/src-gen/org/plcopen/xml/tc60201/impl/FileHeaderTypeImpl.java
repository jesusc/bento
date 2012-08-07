/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.plcopen.xml.tc60201.FileHeaderType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl#getCompanyURL <em>Company URL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl#getContentDescription <em>Content Description</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl#getCreationDateTime <em>Creation Date Time</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl#getProductRelease <em>Product Release</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl#getProductVersion <em>Product Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileHeaderTypeImpl extends EObjectImpl implements FileHeaderType {
	/**
	 * The default value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String companyName = COMPANY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyURL() <em>Company URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyURL()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyURL() <em>Company URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyURL()
	 * @generated
	 * @ordered
	 */
	protected String companyURL = COMPANY_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentDescription() <em>Content Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentDescription() <em>Content Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDescription()
	 * @generated
	 * @ordered
	 */
	protected String contentDescription = CONTENT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDateTime() <em>Creation Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDateTime() <em>Creation Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDateTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDateTime = CREATION_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductRelease() <em>Product Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductRelease()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_RELEASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductRelease() <em>Product Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductRelease()
	 * @generated
	 * @ordered
	 */
	protected String productRelease = PRODUCT_RELEASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected String productVersion = PRODUCT_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileHeaderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getFileHeaderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyName(String newCompanyName) {
		String oldCompanyName = companyName;
		companyName = newCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.FILE_HEADER_TYPE__COMPANY_NAME, oldCompanyName, companyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyURL() {
		return companyURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyURL(String newCompanyURL) {
		String oldCompanyURL = companyURL;
		companyURL = newCompanyURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.FILE_HEADER_TYPE__COMPANY_URL, oldCompanyURL, companyURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentDescription() {
		return contentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentDescription(String newContentDescription) {
		String oldContentDescription = contentDescription;
		contentDescription = newContentDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.FILE_HEADER_TYPE__CONTENT_DESCRIPTION, oldContentDescription, contentDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDateTime() {
		return creationDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDateTime(XMLGregorianCalendar newCreationDateTime) {
		XMLGregorianCalendar oldCreationDateTime = creationDateTime;
		creationDateTime = newCreationDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.FILE_HEADER_TYPE__CREATION_DATE_TIME, oldCreationDateTime, creationDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.FILE_HEADER_TYPE__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductRelease() {
		return productRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductRelease(String newProductRelease) {
		String oldProductRelease = productRelease;
		productRelease = newProductRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.FILE_HEADER_TYPE__PRODUCT_RELEASE, oldProductRelease, productRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVersion(String newProductVersion) {
		String oldProductVersion = productVersion;
		productVersion = newProductVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.FILE_HEADER_TYPE__PRODUCT_VERSION, oldProductVersion, productVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tc60201Package.FILE_HEADER_TYPE__COMPANY_NAME:
				return getCompanyName();
			case Tc60201Package.FILE_HEADER_TYPE__COMPANY_URL:
				return getCompanyURL();
			case Tc60201Package.FILE_HEADER_TYPE__CONTENT_DESCRIPTION:
				return getContentDescription();
			case Tc60201Package.FILE_HEADER_TYPE__CREATION_DATE_TIME:
				return getCreationDateTime();
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_NAME:
				return getProductName();
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_RELEASE:
				return getProductRelease();
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_VERSION:
				return getProductVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tc60201Package.FILE_HEADER_TYPE__COMPANY_NAME:
				setCompanyName((String)newValue);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__COMPANY_URL:
				setCompanyURL((String)newValue);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__CONTENT_DESCRIPTION:
				setContentDescription((String)newValue);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__CREATION_DATE_TIME:
				setCreationDateTime((XMLGregorianCalendar)newValue);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_RELEASE:
				setProductRelease((String)newValue);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_VERSION:
				setProductVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tc60201Package.FILE_HEADER_TYPE__COMPANY_NAME:
				setCompanyName(COMPANY_NAME_EDEFAULT);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__COMPANY_URL:
				setCompanyURL(COMPANY_URL_EDEFAULT);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__CONTENT_DESCRIPTION:
				setContentDescription(CONTENT_DESCRIPTION_EDEFAULT);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__CREATION_DATE_TIME:
				setCreationDateTime(CREATION_DATE_TIME_EDEFAULT);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_RELEASE:
				setProductRelease(PRODUCT_RELEASE_EDEFAULT);
				return;
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_VERSION:
				setProductVersion(PRODUCT_VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tc60201Package.FILE_HEADER_TYPE__COMPANY_NAME:
				return COMPANY_NAME_EDEFAULT == null ? companyName != null : !COMPANY_NAME_EDEFAULT.equals(companyName);
			case Tc60201Package.FILE_HEADER_TYPE__COMPANY_URL:
				return COMPANY_URL_EDEFAULT == null ? companyURL != null : !COMPANY_URL_EDEFAULT.equals(companyURL);
			case Tc60201Package.FILE_HEADER_TYPE__CONTENT_DESCRIPTION:
				return CONTENT_DESCRIPTION_EDEFAULT == null ? contentDescription != null : !CONTENT_DESCRIPTION_EDEFAULT.equals(contentDescription);
			case Tc60201Package.FILE_HEADER_TYPE__CREATION_DATE_TIME:
				return CREATION_DATE_TIME_EDEFAULT == null ? creationDateTime != null : !CREATION_DATE_TIME_EDEFAULT.equals(creationDateTime);
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_RELEASE:
				return PRODUCT_RELEASE_EDEFAULT == null ? productRelease != null : !PRODUCT_RELEASE_EDEFAULT.equals(productRelease);
			case Tc60201Package.FILE_HEADER_TYPE__PRODUCT_VERSION:
				return PRODUCT_VERSION_EDEFAULT == null ? productVersion != null : !PRODUCT_VERSION_EDEFAULT.equals(productVersion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (companyName: ");
		result.append(companyName);
		result.append(", companyURL: ");
		result.append(companyURL);
		result.append(", contentDescription: ");
		result.append(contentDescription);
		result.append(", creationDateTime: ");
		result.append(creationDateTime);
		result.append(", productName: ");
		result.append(productName);
		result.append(", productRelease: ");
		result.append(productRelease);
		result.append(", productVersion: ");
		result.append(productVersion);
		result.append(')');
		return result.toString();
	}

} //FileHeaderTypeImpl

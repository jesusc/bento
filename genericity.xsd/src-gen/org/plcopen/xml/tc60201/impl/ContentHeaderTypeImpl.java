/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.AddDataInfo;
import org.plcopen.xml.tc60201.ContentHeaderType;
import org.plcopen.xml.tc60201.CoordinateInfoType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getCoordinateInfo <em>Coordinate Info</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getAddDataInfo <em>Add Data Info</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getModificationDateTime <em>Modification Date Time</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentHeaderTypeImpl extends EObjectImpl implements ContentHeaderType {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinateInfo() <em>Coordinate Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateInfo()
	 * @generated
	 * @ordered
	 */
	protected CoordinateInfoType coordinateInfo;

	/**
	 * The cached value of the '{@link #getAddDataInfo() <em>Add Data Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddDataInfo()
	 * @generated
	 * @ordered
	 */
	protected AddDataInfo addDataInfo;

	/**
	 * The cached value of the '{@link #getAddData() <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddData()
	 * @generated
	 * @ordered
	 */
	protected AddData addData;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModificationDateTime() <em>Modification Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MODIFICATION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModificationDateTime() <em>Modification Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDateTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar modificationDateTime = MODIFICATION_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected String organization = ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentHeaderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getContentHeaderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateInfoType getCoordinateInfo() {
		return coordinateInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateInfo(CoordinateInfoType newCoordinateInfo, NotificationChain msgs) {
		CoordinateInfoType oldCoordinateInfo = coordinateInfo;
		coordinateInfo = newCoordinateInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO, oldCoordinateInfo, newCoordinateInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateInfo(CoordinateInfoType newCoordinateInfo) {
		if (newCoordinateInfo != coordinateInfo) {
			NotificationChain msgs = null;
			if (coordinateInfo != null)
				msgs = ((InternalEObject)coordinateInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO, null, msgs);
			if (newCoordinateInfo != null)
				msgs = ((InternalEObject)newCoordinateInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO, null, msgs);
			msgs = basicSetCoordinateInfo(newCoordinateInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO, newCoordinateInfo, newCoordinateInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddDataInfo getAddDataInfo() {
		return addDataInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddDataInfo(AddDataInfo newAddDataInfo, NotificationChain msgs) {
		AddDataInfo oldAddDataInfo = addDataInfo;
		addDataInfo = newAddDataInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO, oldAddDataInfo, newAddDataInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddDataInfo(AddDataInfo newAddDataInfo) {
		if (newAddDataInfo != addDataInfo) {
			NotificationChain msgs = null;
			if (addDataInfo != null)
				msgs = ((InternalEObject)addDataInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO, null, msgs);
			if (newAddDataInfo != null)
				msgs = ((InternalEObject)newAddDataInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO, null, msgs);
			msgs = basicSetAddDataInfo(newAddDataInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO, newAddDataInfo, newAddDataInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddData getAddData() {
		return addData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddData(AddData newAddData, NotificationChain msgs) {
		AddData oldAddData = addData;
		addData = newAddData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA, oldAddData, newAddData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddData(AddData newAddData) {
		if (newAddData != addData) {
			NotificationChain msgs = null;
			if (addData != null)
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA, newAddData, newAddData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getModificationDateTime() {
		return modificationDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationDateTime(XMLGregorianCalendar newModificationDateTime) {
		XMLGregorianCalendar oldModificationDateTime = modificationDateTime;
		modificationDateTime = newModificationDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__MODIFICATION_DATE_TIME, oldModificationDateTime, modificationDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(String newOrganization) {
		String oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONTENT_HEADER_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO:
				return basicSetCoordinateInfo(null, msgs);
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO:
				return basicSetAddDataInfo(null, msgs);
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA:
				return basicSetAddData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tc60201Package.CONTENT_HEADER_TYPE__COMMENT:
				return getComment();
			case Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO:
				return getCoordinateInfo();
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO:
				return getAddDataInfo();
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA:
				return getAddData();
			case Tc60201Package.CONTENT_HEADER_TYPE__AUTHOR:
				return getAuthor();
			case Tc60201Package.CONTENT_HEADER_TYPE__LANGUAGE:
				return getLanguage();
			case Tc60201Package.CONTENT_HEADER_TYPE__MODIFICATION_DATE_TIME:
				return getModificationDateTime();
			case Tc60201Package.CONTENT_HEADER_TYPE__NAME:
				return getName();
			case Tc60201Package.CONTENT_HEADER_TYPE__ORGANIZATION:
				return getOrganization();
			case Tc60201Package.CONTENT_HEADER_TYPE__VERSION:
				return getVersion();
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
			case Tc60201Package.CONTENT_HEADER_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO:
				setCoordinateInfo((CoordinateInfoType)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO:
				setAddDataInfo((AddDataInfo)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__MODIFICATION_DATE_TIME:
				setModificationDateTime((XMLGregorianCalendar)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__NAME:
				setName((String)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__VERSION:
				setVersion((String)newValue);
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
			case Tc60201Package.CONTENT_HEADER_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO:
				setCoordinateInfo((CoordinateInfoType)null);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO:
				setAddDataInfo((AddDataInfo)null);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__MODIFICATION_DATE_TIME:
				setModificationDateTime(MODIFICATION_DATE_TIME_EDEFAULT);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case Tc60201Package.CONTENT_HEADER_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case Tc60201Package.CONTENT_HEADER_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Tc60201Package.CONTENT_HEADER_TYPE__COORDINATE_INFO:
				return coordinateInfo != null;
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA_INFO:
				return addDataInfo != null;
			case Tc60201Package.CONTENT_HEADER_TYPE__ADD_DATA:
				return addData != null;
			case Tc60201Package.CONTENT_HEADER_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case Tc60201Package.CONTENT_HEADER_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case Tc60201Package.CONTENT_HEADER_TYPE__MODIFICATION_DATE_TIME:
				return MODIFICATION_DATE_TIME_EDEFAULT == null ? modificationDateTime != null : !MODIFICATION_DATE_TIME_EDEFAULT.equals(modificationDateTime);
			case Tc60201Package.CONTENT_HEADER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tc60201Package.CONTENT_HEADER_TYPE__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case Tc60201Package.CONTENT_HEADER_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", author: ");
		result.append(author);
		result.append(", language: ");
		result.append(language);
		result.append(", modificationDateTime: ");
		result.append(modificationDateTime);
		result.append(", name: ");
		result.append(name);
		result.append(", organization: ");
		result.append(organization);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ContentHeaderTypeImpl

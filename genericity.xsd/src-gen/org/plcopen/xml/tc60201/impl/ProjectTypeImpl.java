/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.ContentHeaderType;
import org.plcopen.xml.tc60201.FileHeaderType;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.InstancesType;
import org.plcopen.xml.tc60201.ProjectType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.TypesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ProjectTypeImpl#getFileHeader <em>File Header</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ProjectTypeImpl#getContentHeader <em>Content Header</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ProjectTypeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ProjectTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ProjectTypeImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ProjectTypeImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectTypeImpl extends EObjectImpl implements ProjectType {
	/**
	 * The cached value of the '{@link #getFileHeader() <em>File Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileHeader()
	 * @generated
	 * @ordered
	 */
	protected FileHeaderType fileHeader;

	/**
	 * The cached value of the '{@link #getContentHeader() <em>Content Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHeader()
	 * @generated
	 * @ordered
	 */
	protected ContentHeaderType contentHeader;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected TypesType types;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected InstancesType instances;

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
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected FormattedText documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getProjectType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileHeaderType getFileHeader() {
		return fileHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileHeader(FileHeaderType newFileHeader, NotificationChain msgs) {
		FileHeaderType oldFileHeader = fileHeader;
		fileHeader = newFileHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__FILE_HEADER, oldFileHeader, newFileHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileHeader(FileHeaderType newFileHeader) {
		if (newFileHeader != fileHeader) {
			NotificationChain msgs = null;
			if (fileHeader != null)
				msgs = ((InternalEObject)fileHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__FILE_HEADER, null, msgs);
			if (newFileHeader != null)
				msgs = ((InternalEObject)newFileHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__FILE_HEADER, null, msgs);
			msgs = basicSetFileHeader(newFileHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__FILE_HEADER, newFileHeader, newFileHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentHeaderType getContentHeader() {
		return contentHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentHeader(ContentHeaderType newContentHeader, NotificationChain msgs) {
		ContentHeaderType oldContentHeader = contentHeader;
		contentHeader = newContentHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__CONTENT_HEADER, oldContentHeader, newContentHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentHeader(ContentHeaderType newContentHeader) {
		if (newContentHeader != contentHeader) {
			NotificationChain msgs = null;
			if (contentHeader != null)
				msgs = ((InternalEObject)contentHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__CONTENT_HEADER, null, msgs);
			if (newContentHeader != null)
				msgs = ((InternalEObject)newContentHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__CONTENT_HEADER, null, msgs);
			msgs = basicSetContentHeader(newContentHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__CONTENT_HEADER, newContentHeader, newContentHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypes(TypesType newTypes, NotificationChain msgs) {
		TypesType oldTypes = types;
		types = newTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__TYPES, oldTypes, newTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(TypesType newTypes) {
		if (newTypes != types) {
			NotificationChain msgs = null;
			if (types != null)
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__TYPES, newTypes, newTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesType getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstances(InstancesType newInstances, NotificationChain msgs) {
		InstancesType oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__INSTANCES, oldInstances, newInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(InstancesType newInstances) {
		if (newInstances != instances) {
			NotificationChain msgs = null;
			if (instances != null)
				msgs = ((InternalEObject)instances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__INSTANCES, null, msgs);
			if (newInstances != null)
				msgs = ((InternalEObject)newInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__INSTANCES, null, msgs);
			msgs = basicSetInstances(newInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__INSTANCES, newInstances, newInstances));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__ADD_DATA, oldAddData, newAddData);
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
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__ADD_DATA, newAddData, newAddData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(FormattedText newDocumentation, NotificationChain msgs) {
		FormattedText oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(FormattedText newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.PROJECT_TYPE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.PROJECT_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.PROJECT_TYPE__FILE_HEADER:
				return basicSetFileHeader(null, msgs);
			case Tc60201Package.PROJECT_TYPE__CONTENT_HEADER:
				return basicSetContentHeader(null, msgs);
			case Tc60201Package.PROJECT_TYPE__TYPES:
				return basicSetTypes(null, msgs);
			case Tc60201Package.PROJECT_TYPE__INSTANCES:
				return basicSetInstances(null, msgs);
			case Tc60201Package.PROJECT_TYPE__ADD_DATA:
				return basicSetAddData(null, msgs);
			case Tc60201Package.PROJECT_TYPE__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case Tc60201Package.PROJECT_TYPE__FILE_HEADER:
				return getFileHeader();
			case Tc60201Package.PROJECT_TYPE__CONTENT_HEADER:
				return getContentHeader();
			case Tc60201Package.PROJECT_TYPE__TYPES:
				return getTypes();
			case Tc60201Package.PROJECT_TYPE__INSTANCES:
				return getInstances();
			case Tc60201Package.PROJECT_TYPE__ADD_DATA:
				return getAddData();
			case Tc60201Package.PROJECT_TYPE__DOCUMENTATION:
				return getDocumentation();
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
			case Tc60201Package.PROJECT_TYPE__FILE_HEADER:
				setFileHeader((FileHeaderType)newValue);
				return;
			case Tc60201Package.PROJECT_TYPE__CONTENT_HEADER:
				setContentHeader((ContentHeaderType)newValue);
				return;
			case Tc60201Package.PROJECT_TYPE__TYPES:
				setTypes((TypesType)newValue);
				return;
			case Tc60201Package.PROJECT_TYPE__INSTANCES:
				setInstances((InstancesType)newValue);
				return;
			case Tc60201Package.PROJECT_TYPE__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.PROJECT_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
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
			case Tc60201Package.PROJECT_TYPE__FILE_HEADER:
				setFileHeader((FileHeaderType)null);
				return;
			case Tc60201Package.PROJECT_TYPE__CONTENT_HEADER:
				setContentHeader((ContentHeaderType)null);
				return;
			case Tc60201Package.PROJECT_TYPE__TYPES:
				setTypes((TypesType)null);
				return;
			case Tc60201Package.PROJECT_TYPE__INSTANCES:
				setInstances((InstancesType)null);
				return;
			case Tc60201Package.PROJECT_TYPE__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.PROJECT_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)null);
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
			case Tc60201Package.PROJECT_TYPE__FILE_HEADER:
				return fileHeader != null;
			case Tc60201Package.PROJECT_TYPE__CONTENT_HEADER:
				return contentHeader != null;
			case Tc60201Package.PROJECT_TYPE__TYPES:
				return types != null;
			case Tc60201Package.PROJECT_TYPE__INSTANCES:
				return instances != null;
			case Tc60201Package.PROJECT_TYPE__ADD_DATA:
				return addData != null;
			case Tc60201Package.PROJECT_TYPE__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectTypeImpl

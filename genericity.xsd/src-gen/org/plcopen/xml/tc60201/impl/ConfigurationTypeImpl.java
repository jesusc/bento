/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.ConfigurationType;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.ResourceType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.VarList;
import org.plcopen.xml.tc60201.VarListAccess;
import org.plcopen.xml.tc60201.VarListConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl#getAccessVars <em>Access Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl#getConfigVars <em>Config Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationTypeImpl extends EObjectImpl implements ConfigurationType {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> resource;

	/**
	 * The cached value of the '{@link #getGlobalVars() <em>Global Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVars()
	 * @generated
	 * @ordered
	 */
	protected EList<VarList> globalVars;

	/**
	 * The cached value of the '{@link #getAccessVars() <em>Access Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessVars()
	 * @generated
	 * @ordered
	 */
	protected VarListAccess accessVars;

	/**
	 * The cached value of the '{@link #getConfigVars() <em>Config Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigVars()
	 * @generated
	 * @ordered
	 */
	protected VarListConfig configVars;

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
	 * The default value of the '{@link #getGlobalId() <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalId() <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected String globalId = GLOBAL_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, Tc60201Package.CONFIGURATION_TYPE__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarList> getGlobalVars() {
		if (globalVars == null) {
			globalVars = new EObjectContainmentEList<VarList>(VarList.class, this, Tc60201Package.CONFIGURATION_TYPE__GLOBAL_VARS);
		}
		return globalVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarListAccess getAccessVars() {
		return accessVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessVars(VarListAccess newAccessVars, NotificationChain msgs) {
		VarListAccess oldAccessVars = accessVars;
		accessVars = newAccessVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS, oldAccessVars, newAccessVars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessVars(VarListAccess newAccessVars) {
		if (newAccessVars != accessVars) {
			NotificationChain msgs = null;
			if (accessVars != null)
				msgs = ((InternalEObject)accessVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS, null, msgs);
			if (newAccessVars != null)
				msgs = ((InternalEObject)newAccessVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS, null, msgs);
			msgs = basicSetAccessVars(newAccessVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS, newAccessVars, newAccessVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarListConfig getConfigVars() {
		return configVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigVars(VarListConfig newConfigVars, NotificationChain msgs) {
		VarListConfig oldConfigVars = configVars;
		configVars = newConfigVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS, oldConfigVars, newConfigVars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigVars(VarListConfig newConfigVars) {
		if (newConfigVars != configVars) {
			NotificationChain msgs = null;
			if (configVars != null)
				msgs = ((InternalEObject)configVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS, null, msgs);
			if (newConfigVars != null)
				msgs = ((InternalEObject)newConfigVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS, null, msgs);
			msgs = basicSetConfigVars(newConfigVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS, newConfigVars, newConfigVars));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__ADD_DATA, oldAddData, newAddData);
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
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONFIGURATION_TYPE__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONFIGURATION_TYPE__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__ADD_DATA, newAddData, newAddData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalId(String newGlobalId) {
		String oldGlobalId = globalId;
		globalId = newGlobalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__GLOBAL_ID, oldGlobalId, globalId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONFIGURATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.CONFIGURATION_TYPE__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_VARS:
				return ((InternalEList<?>)getGlobalVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS:
				return basicSetAccessVars(null, msgs);
			case Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS:
				return basicSetConfigVars(null, msgs);
			case Tc60201Package.CONFIGURATION_TYPE__ADD_DATA:
				return basicSetAddData(null, msgs);
			case Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION:
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
			case Tc60201Package.CONFIGURATION_TYPE__RESOURCE:
				return getResource();
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_VARS:
				return getGlobalVars();
			case Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS:
				return getAccessVars();
			case Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS:
				return getConfigVars();
			case Tc60201Package.CONFIGURATION_TYPE__ADD_DATA:
				return getAddData();
			case Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION:
				return getDocumentation();
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_ID:
				return getGlobalId();
			case Tc60201Package.CONFIGURATION_TYPE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tc60201Package.CONFIGURATION_TYPE__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_VARS:
				getGlobalVars().clear();
				getGlobalVars().addAll((Collection<? extends VarList>)newValue);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS:
				setAccessVars((VarListAccess)newValue);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS:
				setConfigVars((VarListConfig)newValue);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_ID:
				setGlobalId((String)newValue);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__NAME:
				setName((String)newValue);
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
			case Tc60201Package.CONFIGURATION_TYPE__RESOURCE:
				getResource().clear();
				return;
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_VARS:
				getGlobalVars().clear();
				return;
			case Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS:
				setAccessVars((VarListAccess)null);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS:
				setConfigVars((VarListConfig)null);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)null);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_ID:
				setGlobalId(GLOBAL_ID_EDEFAULT);
				return;
			case Tc60201Package.CONFIGURATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case Tc60201Package.CONFIGURATION_TYPE__RESOURCE:
				return resource != null && !resource.isEmpty();
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_VARS:
				return globalVars != null && !globalVars.isEmpty();
			case Tc60201Package.CONFIGURATION_TYPE__ACCESS_VARS:
				return accessVars != null;
			case Tc60201Package.CONFIGURATION_TYPE__CONFIG_VARS:
				return configVars != null;
			case Tc60201Package.CONFIGURATION_TYPE__ADD_DATA:
				return addData != null;
			case Tc60201Package.CONFIGURATION_TYPE__DOCUMENTATION:
				return documentation != null;
			case Tc60201Package.CONFIGURATION_TYPE__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalId != null : !GLOBAL_ID_EDEFAULT.equals(globalId);
			case Tc60201Package.CONFIGURATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (globalId: ");
		result.append(globalId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConfigurationTypeImpl

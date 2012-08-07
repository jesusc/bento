/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import java.math.BigInteger;

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
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.PouInstance;
import org.plcopen.xml.tc60201.TaskType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl#getPouInstance <em>Pou Instance</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl#getSingle <em>Single</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskTypeImpl extends EObjectImpl implements TaskType {
	/**
	 * The cached value of the '{@link #getPouInstance() <em>Pou Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPouInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<PouInstance> pouInstance;

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
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected String interval = INTERVAL_EDEFAULT;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingle() <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingle()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingle() <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingle()
	 * @generated
	 * @ordered
	 */
	protected String single = SINGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getTaskType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PouInstance> getPouInstance() {
		if (pouInstance == null) {
			pouInstance = new EObjectContainmentEList<PouInstance>(PouInstance.class, this, Tc60201Package.TASK_TYPE__POU_INSTANCE);
		}
		return pouInstance;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__ADD_DATA, oldAddData, newAddData);
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
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.TASK_TYPE__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.TASK_TYPE__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__ADD_DATA, newAddData, newAddData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.TASK_TYPE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.TASK_TYPE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__GLOBAL_ID, oldGlobalId, globalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(String newInterval) {
		String oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__INTERVAL, oldInterval, interval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(BigInteger newPriority) {
		BigInteger oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSingle() {
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingle(String newSingle) {
		String oldSingle = single;
		single = newSingle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TASK_TYPE__SINGLE, oldSingle, single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.TASK_TYPE__POU_INSTANCE:
				return ((InternalEList<?>)getPouInstance()).basicRemove(otherEnd, msgs);
			case Tc60201Package.TASK_TYPE__ADD_DATA:
				return basicSetAddData(null, msgs);
			case Tc60201Package.TASK_TYPE__DOCUMENTATION:
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
			case Tc60201Package.TASK_TYPE__POU_INSTANCE:
				return getPouInstance();
			case Tc60201Package.TASK_TYPE__ADD_DATA:
				return getAddData();
			case Tc60201Package.TASK_TYPE__DOCUMENTATION:
				return getDocumentation();
			case Tc60201Package.TASK_TYPE__GLOBAL_ID:
				return getGlobalId();
			case Tc60201Package.TASK_TYPE__INTERVAL:
				return getInterval();
			case Tc60201Package.TASK_TYPE__NAME:
				return getName();
			case Tc60201Package.TASK_TYPE__PRIORITY:
				return getPriority();
			case Tc60201Package.TASK_TYPE__SINGLE:
				return getSingle();
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
			case Tc60201Package.TASK_TYPE__POU_INSTANCE:
				getPouInstance().clear();
				getPouInstance().addAll((Collection<? extends PouInstance>)newValue);
				return;
			case Tc60201Package.TASK_TYPE__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.TASK_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
				return;
			case Tc60201Package.TASK_TYPE__GLOBAL_ID:
				setGlobalId((String)newValue);
				return;
			case Tc60201Package.TASK_TYPE__INTERVAL:
				setInterval((String)newValue);
				return;
			case Tc60201Package.TASK_TYPE__NAME:
				setName((String)newValue);
				return;
			case Tc60201Package.TASK_TYPE__PRIORITY:
				setPriority((BigInteger)newValue);
				return;
			case Tc60201Package.TASK_TYPE__SINGLE:
				setSingle((String)newValue);
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
			case Tc60201Package.TASK_TYPE__POU_INSTANCE:
				getPouInstance().clear();
				return;
			case Tc60201Package.TASK_TYPE__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.TASK_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)null);
				return;
			case Tc60201Package.TASK_TYPE__GLOBAL_ID:
				setGlobalId(GLOBAL_ID_EDEFAULT);
				return;
			case Tc60201Package.TASK_TYPE__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case Tc60201Package.TASK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tc60201Package.TASK_TYPE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Tc60201Package.TASK_TYPE__SINGLE:
				setSingle(SINGLE_EDEFAULT);
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
			case Tc60201Package.TASK_TYPE__POU_INSTANCE:
				return pouInstance != null && !pouInstance.isEmpty();
			case Tc60201Package.TASK_TYPE__ADD_DATA:
				return addData != null;
			case Tc60201Package.TASK_TYPE__DOCUMENTATION:
				return documentation != null;
			case Tc60201Package.TASK_TYPE__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalId != null : !GLOBAL_ID_EDEFAULT.equals(globalId);
			case Tc60201Package.TASK_TYPE__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
			case Tc60201Package.TASK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tc60201Package.TASK_TYPE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case Tc60201Package.TASK_TYPE__SINGLE:
				return SINGLE_EDEFAULT == null ? single != null : !SINGLE_EDEFAULT.equals(single);
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
		result.append(", interval: ");
		result.append(interval);
		result.append(", name: ");
		result.append(name);
		result.append(", priority: ");
		result.append(priority);
		result.append(", single: ");
		result.append(single);
		result.append(')');
		return result.toString();
	}

} //TaskTypeImpl

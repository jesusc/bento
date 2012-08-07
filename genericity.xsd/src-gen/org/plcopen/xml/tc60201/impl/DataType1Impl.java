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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.plcopen.xml.tc60201.DataType1;
import org.plcopen.xml.tc60201.HandleUnknownType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataType1Impl#getAny <em>Any</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataType1Impl#getHandleUnknown <em>Handle Unknown</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.DataType1Impl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataType1Impl extends EObjectImpl implements DataType1 {
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getHandleUnknown() <em>Handle Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final HandleUnknownType HANDLE_UNKNOWN_EDEFAULT = HandleUnknownType.PRESERVE;

	/**
	 * The cached value of the '{@link #getHandleUnknown() <em>Handle Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleUnknown()
	 * @generated
	 * @ordered
	 */
	protected HandleUnknownType handleUnknown = HANDLE_UNKNOWN_EDEFAULT;

	/**
	 * This is true if the Handle Unknown attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean handleUnknownESet;

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
	protected DataType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getDataType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, Tc60201Package.DATA_TYPE1__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleUnknownType getHandleUnknown() {
		return handleUnknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleUnknown(HandleUnknownType newHandleUnknown) {
		HandleUnknownType oldHandleUnknown = handleUnknown;
		handleUnknown = newHandleUnknown == null ? HANDLE_UNKNOWN_EDEFAULT : newHandleUnknown;
		boolean oldHandleUnknownESet = handleUnknownESet;
		handleUnknownESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE1__HANDLE_UNKNOWN, oldHandleUnknown, handleUnknown, !oldHandleUnknownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandleUnknown() {
		HandleUnknownType oldHandleUnknown = handleUnknown;
		boolean oldHandleUnknownESet = handleUnknownESet;
		handleUnknown = HANDLE_UNKNOWN_EDEFAULT;
		handleUnknownESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.DATA_TYPE1__HANDLE_UNKNOWN, oldHandleUnknown, HANDLE_UNKNOWN_EDEFAULT, oldHandleUnknownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandleUnknown() {
		return handleUnknownESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.DATA_TYPE1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.DATA_TYPE1__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case Tc60201Package.DATA_TYPE1__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case Tc60201Package.DATA_TYPE1__HANDLE_UNKNOWN:
				return getHandleUnknown();
			case Tc60201Package.DATA_TYPE1__NAME:
				return getName();
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
			case Tc60201Package.DATA_TYPE1__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case Tc60201Package.DATA_TYPE1__HANDLE_UNKNOWN:
				setHandleUnknown((HandleUnknownType)newValue);
				return;
			case Tc60201Package.DATA_TYPE1__NAME:
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
			case Tc60201Package.DATA_TYPE1__ANY:
				getAny().clear();
				return;
			case Tc60201Package.DATA_TYPE1__HANDLE_UNKNOWN:
				unsetHandleUnknown();
				return;
			case Tc60201Package.DATA_TYPE1__NAME:
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
			case Tc60201Package.DATA_TYPE1__ANY:
				return any != null && !any.isEmpty();
			case Tc60201Package.DATA_TYPE1__HANDLE_UNKNOWN:
				return isSetHandleUnknown();
			case Tc60201Package.DATA_TYPE1__NAME:
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
		result.append(" (any: ");
		result.append(any);
		result.append(", handleUnknown: ");
		if (handleUnknownESet) result.append(handleUnknown); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataType1Impl

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

import org.plcopen.xml.tc60201.DataTypesType;
import org.plcopen.xml.tc60201.PousType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.TypesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TypesTypeImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.TypesTypeImpl#getPous <em>Pous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypesTypeImpl extends EObjectImpl implements TypesType {
	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected DataTypesType dataTypes;

	/**
	 * The cached value of the '{@link #getPous() <em>Pous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPous()
	 * @generated
	 * @ordered
	 */
	protected PousType pous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getTypesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesType getDataTypes() {
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypes(DataTypesType newDataTypes, NotificationChain msgs) {
		DataTypesType oldDataTypes = dataTypes;
		dataTypes = newDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.TYPES_TYPE__DATA_TYPES, oldDataTypes, newDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypes(DataTypesType newDataTypes) {
		if (newDataTypes != dataTypes) {
			NotificationChain msgs = null;
			if (dataTypes != null)
				msgs = ((InternalEObject)dataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.TYPES_TYPE__DATA_TYPES, null, msgs);
			if (newDataTypes != null)
				msgs = ((InternalEObject)newDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.TYPES_TYPE__DATA_TYPES, null, msgs);
			msgs = basicSetDataTypes(newDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TYPES_TYPE__DATA_TYPES, newDataTypes, newDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PousType getPous() {
		return pous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPous(PousType newPous, NotificationChain msgs) {
		PousType oldPous = pous;
		pous = newPous;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.TYPES_TYPE__POUS, oldPous, newPous);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPous(PousType newPous) {
		if (newPous != pous) {
			NotificationChain msgs = null;
			if (pous != null)
				msgs = ((InternalEObject)pous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.TYPES_TYPE__POUS, null, msgs);
			if (newPous != null)
				msgs = ((InternalEObject)newPous).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.TYPES_TYPE__POUS, null, msgs);
			msgs = basicSetPous(newPous, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.TYPES_TYPE__POUS, newPous, newPous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.TYPES_TYPE__DATA_TYPES:
				return basicSetDataTypes(null, msgs);
			case Tc60201Package.TYPES_TYPE__POUS:
				return basicSetPous(null, msgs);
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
			case Tc60201Package.TYPES_TYPE__DATA_TYPES:
				return getDataTypes();
			case Tc60201Package.TYPES_TYPE__POUS:
				return getPous();
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
			case Tc60201Package.TYPES_TYPE__DATA_TYPES:
				setDataTypes((DataTypesType)newValue);
				return;
			case Tc60201Package.TYPES_TYPE__POUS:
				setPous((PousType)newValue);
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
			case Tc60201Package.TYPES_TYPE__DATA_TYPES:
				setDataTypes((DataTypesType)null);
				return;
			case Tc60201Package.TYPES_TYPE__POUS:
				setPous((PousType)null);
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
			case Tc60201Package.TYPES_TYPE__DATA_TYPES:
				return dataTypes != null;
			case Tc60201Package.TYPES_TYPE__POUS:
				return pous != null;
		}
		return super.eIsSet(featureID);
	}

} //TypesTypeImpl

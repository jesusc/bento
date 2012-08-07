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

import org.plcopen.xml.tc60201.ArrayValueType;
import org.plcopen.xml.tc60201.SimpleValueType;
import org.plcopen.xml.tc60201.StructValueType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ValueImpl#getSimpleValue <em>Simple Value</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ValueImpl#getArrayValue <em>Array Value</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ValueImpl#getStructValue <em>Struct Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends EObjectImpl implements Value {
	/**
	 * The cached value of the '{@link #getSimpleValue() <em>Simple Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleValue()
	 * @generated
	 * @ordered
	 */
	protected SimpleValueType simpleValue;

	/**
	 * The cached value of the '{@link #getArrayValue() <em>Array Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayValue()
	 * @generated
	 * @ordered
	 */
	protected ArrayValueType arrayValue;

	/**
	 * The cached value of the '{@link #getStructValue() <em>Struct Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructValue()
	 * @generated
	 * @ordered
	 */
	protected StructValueType structValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleValueType getSimpleValue() {
		return simpleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleValue(SimpleValueType newSimpleValue, NotificationChain msgs) {
		SimpleValueType oldSimpleValue = simpleValue;
		simpleValue = newSimpleValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VALUE__SIMPLE_VALUE, oldSimpleValue, newSimpleValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleValue(SimpleValueType newSimpleValue) {
		if (newSimpleValue != simpleValue) {
			NotificationChain msgs = null;
			if (simpleValue != null)
				msgs = ((InternalEObject)simpleValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VALUE__SIMPLE_VALUE, null, msgs);
			if (newSimpleValue != null)
				msgs = ((InternalEObject)newSimpleValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VALUE__SIMPLE_VALUE, null, msgs);
			msgs = basicSetSimpleValue(newSimpleValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VALUE__SIMPLE_VALUE, newSimpleValue, newSimpleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValueType getArrayValue() {
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayValue(ArrayValueType newArrayValue, NotificationChain msgs) {
		ArrayValueType oldArrayValue = arrayValue;
		arrayValue = newArrayValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VALUE__ARRAY_VALUE, oldArrayValue, newArrayValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayValue(ArrayValueType newArrayValue) {
		if (newArrayValue != arrayValue) {
			NotificationChain msgs = null;
			if (arrayValue != null)
				msgs = ((InternalEObject)arrayValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VALUE__ARRAY_VALUE, null, msgs);
			if (newArrayValue != null)
				msgs = ((InternalEObject)newArrayValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VALUE__ARRAY_VALUE, null, msgs);
			msgs = basicSetArrayValue(newArrayValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VALUE__ARRAY_VALUE, newArrayValue, newArrayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructValueType getStructValue() {
		return structValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructValue(StructValueType newStructValue, NotificationChain msgs) {
		StructValueType oldStructValue = structValue;
		structValue = newStructValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VALUE__STRUCT_VALUE, oldStructValue, newStructValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructValue(StructValueType newStructValue) {
		if (newStructValue != structValue) {
			NotificationChain msgs = null;
			if (structValue != null)
				msgs = ((InternalEObject)structValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VALUE__STRUCT_VALUE, null, msgs);
			if (newStructValue != null)
				msgs = ((InternalEObject)newStructValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VALUE__STRUCT_VALUE, null, msgs);
			msgs = basicSetStructValue(newStructValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VALUE__STRUCT_VALUE, newStructValue, newStructValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.VALUE__SIMPLE_VALUE:
				return basicSetSimpleValue(null, msgs);
			case Tc60201Package.VALUE__ARRAY_VALUE:
				return basicSetArrayValue(null, msgs);
			case Tc60201Package.VALUE__STRUCT_VALUE:
				return basicSetStructValue(null, msgs);
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
			case Tc60201Package.VALUE__SIMPLE_VALUE:
				return getSimpleValue();
			case Tc60201Package.VALUE__ARRAY_VALUE:
				return getArrayValue();
			case Tc60201Package.VALUE__STRUCT_VALUE:
				return getStructValue();
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
			case Tc60201Package.VALUE__SIMPLE_VALUE:
				setSimpleValue((SimpleValueType)newValue);
				return;
			case Tc60201Package.VALUE__ARRAY_VALUE:
				setArrayValue((ArrayValueType)newValue);
				return;
			case Tc60201Package.VALUE__STRUCT_VALUE:
				setStructValue((StructValueType)newValue);
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
			case Tc60201Package.VALUE__SIMPLE_VALUE:
				setSimpleValue((SimpleValueType)null);
				return;
			case Tc60201Package.VALUE__ARRAY_VALUE:
				setArrayValue((ArrayValueType)null);
				return;
			case Tc60201Package.VALUE__STRUCT_VALUE:
				setStructValue((StructValueType)null);
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
			case Tc60201Package.VALUE__SIMPLE_VALUE:
				return simpleValue != null;
			case Tc60201Package.VALUE__ARRAY_VALUE:
				return arrayValue != null;
			case Tc60201Package.VALUE__STRUCT_VALUE:
				return structValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueImpl

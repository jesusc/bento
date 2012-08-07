/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.ValueType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ValueType1Impl#getRepetitionValue <em>Repetition Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueType1Impl extends ValueImpl implements ValueType1 {
	/**
	 * The default value of the '{@link #getRepetitionValue() <em>Repetition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String REPETITION_VALUE_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getRepetitionValue() <em>Repetition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionValue()
	 * @generated
	 * @ordered
	 */
	protected String repetitionValue = REPETITION_VALUE_EDEFAULT;

	/**
	 * This is true if the Repetition Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repetitionValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getValueType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepetitionValue() {
		return repetitionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitionValue(String newRepetitionValue) {
		String oldRepetitionValue = repetitionValue;
		repetitionValue = newRepetitionValue;
		boolean oldRepetitionValueESet = repetitionValueESet;
		repetitionValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VALUE_TYPE1__REPETITION_VALUE, oldRepetitionValue, repetitionValue, !oldRepetitionValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepetitionValue() {
		String oldRepetitionValue = repetitionValue;
		boolean oldRepetitionValueESet = repetitionValueESet;
		repetitionValue = REPETITION_VALUE_EDEFAULT;
		repetitionValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VALUE_TYPE1__REPETITION_VALUE, oldRepetitionValue, REPETITION_VALUE_EDEFAULT, oldRepetitionValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepetitionValue() {
		return repetitionValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tc60201Package.VALUE_TYPE1__REPETITION_VALUE:
				return getRepetitionValue();
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
			case Tc60201Package.VALUE_TYPE1__REPETITION_VALUE:
				setRepetitionValue((String)newValue);
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
			case Tc60201Package.VALUE_TYPE1__REPETITION_VALUE:
				unsetRepetitionValue();
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
			case Tc60201Package.VALUE_TYPE1__REPETITION_VALUE:
				return isSetRepetitionValue();
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
		result.append(" (repetitionValue: ");
		if (repetitionValueESet) result.append(repetitionValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ValueType1Impl

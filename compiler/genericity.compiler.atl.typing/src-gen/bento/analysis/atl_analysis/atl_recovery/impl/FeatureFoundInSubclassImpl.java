/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_recovery.impl;

import bento.analysis.atl_analysis.atl_recovery.AtlRecoveryPackage;
import bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass;

import bento.analysis.atl_analysis.impl.RecoveryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Found In Subclass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_recovery.impl.FeatureFoundInSubclassImpl#getSubclassName <em>Subclass Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureFoundInSubclassImpl extends RecoveryImpl implements FeatureFoundInSubclass {
	/**
	 * The default value of the '{@link #getSubclassName() <em>Subclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBCLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubclassName() <em>Subclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclassName()
	 * @generated
	 * @ordered
	 */
	protected String subclassName = SUBCLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureFoundInSubclassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlRecoveryPackage.Literals.FEATURE_FOUND_IN_SUBCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubclassName() {
		return subclassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubclassName(String newSubclassName) {
		String oldSubclassName = subclassName;
		subclassName = newSubclassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlRecoveryPackage.FEATURE_FOUND_IN_SUBCLASS__SUBCLASS_NAME, oldSubclassName, subclassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtlRecoveryPackage.FEATURE_FOUND_IN_SUBCLASS__SUBCLASS_NAME:
				return getSubclassName();
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
			case AtlRecoveryPackage.FEATURE_FOUND_IN_SUBCLASS__SUBCLASS_NAME:
				setSubclassName((String)newValue);
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
			case AtlRecoveryPackage.FEATURE_FOUND_IN_SUBCLASS__SUBCLASS_NAME:
				setSubclassName(SUBCLASS_NAME_EDEFAULT);
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
			case AtlRecoveryPackage.FEATURE_FOUND_IN_SUBCLASS__SUBCLASS_NAME:
				return SUBCLASS_NAME_EDEFAULT == null ? subclassName != null : !SUBCLASS_NAME_EDEFAULT.equals(subclassName);
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
		result.append(" (subclassName: ");
		result.append(subclassName);
		result.append(')');
		return result.toString();
	}

} //FeatureFoundInSubclassImpl

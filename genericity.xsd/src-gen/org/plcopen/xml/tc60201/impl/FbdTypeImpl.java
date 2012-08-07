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

import org.plcopen.xml.tc60201.FbdType;
import org.plcopen.xml.tc60201.ScalingType2;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fbd Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FbdTypeImpl#getScaling <em>Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FbdTypeImpl extends EObjectImpl implements FbdType {
	/**
	 * The cached value of the '{@link #getScaling() <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaling()
	 * @generated
	 * @ordered
	 */
	protected ScalingType2 scaling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FbdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getFbdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingType2 getScaling() {
		return scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaling(ScalingType2 newScaling, NotificationChain msgs) {
		ScalingType2 oldScaling = scaling;
		scaling = newScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.FBD_TYPE__SCALING, oldScaling, newScaling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaling(ScalingType2 newScaling) {
		if (newScaling != scaling) {
			NotificationChain msgs = null;
			if (scaling != null)
				msgs = ((InternalEObject)scaling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.FBD_TYPE__SCALING, null, msgs);
			if (newScaling != null)
				msgs = ((InternalEObject)newScaling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.FBD_TYPE__SCALING, null, msgs);
			msgs = basicSetScaling(newScaling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.FBD_TYPE__SCALING, newScaling, newScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.FBD_TYPE__SCALING:
				return basicSetScaling(null, msgs);
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
			case Tc60201Package.FBD_TYPE__SCALING:
				return getScaling();
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
			case Tc60201Package.FBD_TYPE__SCALING:
				setScaling((ScalingType2)newValue);
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
			case Tc60201Package.FBD_TYPE__SCALING:
				setScaling((ScalingType2)null);
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
			case Tc60201Package.FBD_TYPE__SCALING:
				return scaling != null;
		}
		return super.eIsSet(featureID);
	}

} //FbdTypeImpl

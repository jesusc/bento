/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error.impl;

import bento.analysis.atl_analysis.Recovery;
import bento.analysis.atl_analysis.atl_error.AtlErrorsPackage;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

import bento.analysis.atl_analysis.impl.ProblemImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.impl.LocalProblemImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.impl.LocalProblemImpl#getElement <em>Element</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.impl.LocalProblemImpl#getRecovery <em>Recovery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocalProblemImpl extends ProblemImpl implements LocalProblem {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EObject element;

	/**
	 * The cached value of the '{@link #getRecovery() <em>Recovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecovery()
	 * @generated
	 * @ordered
	 */
	protected Recovery recovery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlErrorsPackage.Literals.LOCAL_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlErrorsPackage.LOCAL_PROBLEM__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlErrorsPackage.LOCAL_PROBLEM__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EObject newElement) {
		EObject oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlErrorsPackage.LOCAL_PROBLEM__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recovery getRecovery() {
		return recovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecovery(Recovery newRecovery, NotificationChain msgs) {
		Recovery oldRecovery = recovery;
		recovery = newRecovery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY, oldRecovery, newRecovery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecovery(Recovery newRecovery) {
		if (newRecovery != recovery) {
			NotificationChain msgs = null;
			if (recovery != null)
				msgs = ((InternalEObject)recovery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY, null, msgs);
			if (newRecovery != null)
				msgs = ((InternalEObject)newRecovery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY, null, msgs);
			msgs = basicSetRecovery(newRecovery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY, newRecovery, newRecovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY:
				return basicSetRecovery(null, msgs);
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
			case AtlErrorsPackage.LOCAL_PROBLEM__LOCATION:
				return getLocation();
			case AtlErrorsPackage.LOCAL_PROBLEM__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY:
				return getRecovery();
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
			case AtlErrorsPackage.LOCAL_PROBLEM__LOCATION:
				setLocation((String)newValue);
				return;
			case AtlErrorsPackage.LOCAL_PROBLEM__ELEMENT:
				setElement((EObject)newValue);
				return;
			case AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY:
				setRecovery((Recovery)newValue);
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
			case AtlErrorsPackage.LOCAL_PROBLEM__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AtlErrorsPackage.LOCAL_PROBLEM__ELEMENT:
				setElement((EObject)null);
				return;
			case AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY:
				setRecovery((Recovery)null);
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
			case AtlErrorsPackage.LOCAL_PROBLEM__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case AtlErrorsPackage.LOCAL_PROBLEM__ELEMENT:
				return element != null;
			case AtlErrorsPackage.LOCAL_PROBLEM__RECOVERY:
				return recovery != null;
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
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //LocalProblemImpl
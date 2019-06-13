/**
 */
package scenes_bdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scenes_bdsl.Place;
import scenes_bdsl.Scenes_bdslPackage;
import scenes_bdsl.namePlace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.impl.PlaceImpl#getContainsnamePlace <em>Containsname Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends ElementImpl implements Place {
	/**
	 * The cached value of the '{@link #getContainsnamePlace() <em>Containsname Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnamePlace()
	 * @generated
	 * @ordered
	 */
	protected namePlace containsnamePlace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenes_bdslPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public namePlace getContainsnamePlace() {
		return containsnamePlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsnamePlace(namePlace newContainsnamePlace, NotificationChain msgs) {
		namePlace oldContainsnamePlace = containsnamePlace;
		containsnamePlace = newContainsnamePlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE, oldContainsnamePlace, newContainsnamePlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsnamePlace(namePlace newContainsnamePlace) {
		if (newContainsnamePlace != containsnamePlace) {
			NotificationChain msgs = null;
			if (containsnamePlace != null)
				msgs = ((InternalEObject)containsnamePlace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE, null, msgs);
			if (newContainsnamePlace != null)
				msgs = ((InternalEObject)newContainsnamePlace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE, null, msgs);
			msgs = basicSetContainsnamePlace(newContainsnamePlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE, newContainsnamePlace, newContainsnamePlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE:
				return basicSetContainsnamePlace(null, msgs);
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
			case Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE:
				return getContainsnamePlace();
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
			case Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE:
				setContainsnamePlace((namePlace)newValue);
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
			case Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE:
				setContainsnamePlace((namePlace)null);
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
			case Scenes_bdslPackage.PLACE__CONTAINSNAME_PLACE:
				return containsnamePlace != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl

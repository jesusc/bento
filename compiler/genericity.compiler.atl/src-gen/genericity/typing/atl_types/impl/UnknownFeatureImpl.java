/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.impl;

import genericity.typing.atl_types.AtlTypingPackage;
import genericity.typing.atl_types.UnknownFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.impl.UnknownFeatureImpl#getTheContainingClass <em>The Containing Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnknownFeatureImpl extends EStructuralFeatureImpl implements UnknownFeature {
	/**
	 * The cached value of the '{@link #getTheContainingClass() <em>The Containing Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContainingClass()
	 * @generated
	 * @ordered
	 */
	protected EClass theContainingClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlTypingPackage.Literals.UNKNOWN_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheContainingClass() {
		if (theContainingClass != null && theContainingClass.eIsProxy()) {
			InternalEObject oldTheContainingClass = (InternalEObject)theContainingClass;
			theContainingClass = (EClass)eResolveProxy(oldTheContainingClass);
			if (theContainingClass != oldTheContainingClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlTypingPackage.UNKNOWN_FEATURE__THE_CONTAINING_CLASS, oldTheContainingClass, theContainingClass));
			}
		}
		return theContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTheContainingClass() {
		return theContainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContainingClass(EClass newTheContainingClass) {
		EClass oldTheContainingClass = theContainingClass;
		theContainingClass = newTheContainingClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlTypingPackage.UNKNOWN_FEATURE__THE_CONTAINING_CLASS, oldTheContainingClass, theContainingClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtlTypingPackage.UNKNOWN_FEATURE__THE_CONTAINING_CLASS:
				if (resolve) return getTheContainingClass();
				return basicGetTheContainingClass();
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
			case AtlTypingPackage.UNKNOWN_FEATURE__THE_CONTAINING_CLASS:
				setTheContainingClass((EClass)newValue);
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
			case AtlTypingPackage.UNKNOWN_FEATURE__THE_CONTAINING_CLASS:
				setTheContainingClass((EClass)null);
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
			case AtlTypingPackage.UNKNOWN_FEATURE__THE_CONTAINING_CLASS:
				return theContainingClass != null;
		}
		return super.eIsSet(featureID);
	}

} //UnknownFeatureImpl

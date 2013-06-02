/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.DslPackage;
import gbind.dsl.Metaclass;
import gbind.dsl.VirtualReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.VirtualReferenceImpl#getType_ <em>Type </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualReferenceImpl extends VirtualFeatureImpl implements VirtualReference {
	/**
	 * The cached value of the '{@link #getType_() <em>Type </em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected ConcreteMetaclass type_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.VIRTUAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass getType_() {
		if (type_ != null && type_.eIsProxy()) {
			InternalEObject oldType_ = (InternalEObject)type_;
			type_ = (ConcreteMetaclass)eResolveProxy(oldType_);
			if (type_ != oldType_) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.VIRTUAL_REFERENCE__TYPE_, oldType_, type_));
			}
		}
		return type_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass basicGetType_() {
		return type_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_(ConcreteMetaclass newType_) {
		ConcreteMetaclass oldType_ = type_;
		type_ = newType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VIRTUAL_REFERENCE__TYPE_, oldType_, type_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.VIRTUAL_REFERENCE__TYPE_:
				if (resolve) return getType_();
				return basicGetType_();
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
			case DslPackage.VIRTUAL_REFERENCE__TYPE_:
				setType_((ConcreteMetaclass)newValue);
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
			case DslPackage.VIRTUAL_REFERENCE__TYPE_:
				setType_((ConcreteMetaclass)null);
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
			case DslPackage.VIRTUAL_REFERENCE__TYPE_:
				return type_ != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualReferenceImpl

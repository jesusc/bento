/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.DslPackage;
import gbind.dsl.VirtualAttribute;

import gbind.simpleocl.Primitive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.impl.VirtualAttributeImpl#getType_ <em>Type </em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualAttributeImpl extends VirtualFeatureImpl implements VirtualAttribute {
	/**
	 * The cached value of the '{@link #getType_() <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected Primitive type_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.VIRTUAL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive getType_() {
		return type_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType_(Primitive newType_, NotificationChain msgs) {
		Primitive oldType_ = type_;
		type_ = newType_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.VIRTUAL_ATTRIBUTE__TYPE_, oldType_, newType_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_(Primitive newType_) {
		if (newType_ != type_) {
			NotificationChain msgs = null;
			if (type_ != null)
				msgs = ((InternalEObject)type_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.VIRTUAL_ATTRIBUTE__TYPE_, null, msgs);
			if (newType_ != null)
				msgs = ((InternalEObject)newType_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.VIRTUAL_ATTRIBUTE__TYPE_, null, msgs);
			msgs = basicSetType_(newType_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VIRTUAL_ATTRIBUTE__TYPE_, newType_, newType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.VIRTUAL_ATTRIBUTE__TYPE_:
				return basicSetType_(null, msgs);
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
			case DslPackage.VIRTUAL_ATTRIBUTE__TYPE_:
				return getType_();
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
			case DslPackage.VIRTUAL_ATTRIBUTE__TYPE_:
				setType_((Primitive)newValue);
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
			case DslPackage.VIRTUAL_ATTRIBUTE__TYPE_:
				setType_((Primitive)null);
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
			case DslPackage.VIRTUAL_ATTRIBUTE__TYPE_:
				return type_ != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualAttributeImpl

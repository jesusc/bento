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

import org.plcopen.xml.tc60201.CoordinateInfoType;
import org.plcopen.xml.tc60201.FbdType;
import org.plcopen.xml.tc60201.LdType;
import org.plcopen.xml.tc60201.PageSizeType;
import org.plcopen.xml.tc60201.SfcType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.CoordinateInfoTypeImpl#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.CoordinateInfoTypeImpl#getFbd <em>Fbd</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.CoordinateInfoTypeImpl#getLd <em>Ld</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.CoordinateInfoTypeImpl#getSfc <em>Sfc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinateInfoTypeImpl extends EObjectImpl implements CoordinateInfoType {
	/**
	 * The cached value of the '{@link #getPageSize() <em>Page Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSize()
	 * @generated
	 * @ordered
	 */
	protected PageSizeType pageSize;

	/**
	 * The cached value of the '{@link #getFbd() <em>Fbd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFbd()
	 * @generated
	 * @ordered
	 */
	protected FbdType fbd;

	/**
	 * The cached value of the '{@link #getLd() <em>Ld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLd()
	 * @generated
	 * @ordered
	 */
	protected LdType ld;

	/**
	 * The cached value of the '{@link #getSfc() <em>Sfc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfc()
	 * @generated
	 * @ordered
	 */
	protected SfcType sfc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getCoordinateInfoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageSizeType getPageSize() {
		return pageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageSize(PageSizeType newPageSize, NotificationChain msgs) {
		PageSizeType oldPageSize = pageSize;
		pageSize = newPageSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE, oldPageSize, newPageSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageSize(PageSizeType newPageSize) {
		if (newPageSize != pageSize) {
			NotificationChain msgs = null;
			if (pageSize != null)
				msgs = ((InternalEObject)pageSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE, null, msgs);
			if (newPageSize != null)
				msgs = ((InternalEObject)newPageSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE, null, msgs);
			msgs = basicSetPageSize(newPageSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE, newPageSize, newPageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FbdType getFbd() {
		return fbd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFbd(FbdType newFbd, NotificationChain msgs) {
		FbdType oldFbd = fbd;
		fbd = newFbd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.COORDINATE_INFO_TYPE__FBD, oldFbd, newFbd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFbd(FbdType newFbd) {
		if (newFbd != fbd) {
			NotificationChain msgs = null;
			if (fbd != null)
				msgs = ((InternalEObject)fbd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.COORDINATE_INFO_TYPE__FBD, null, msgs);
			if (newFbd != null)
				msgs = ((InternalEObject)newFbd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.COORDINATE_INFO_TYPE__FBD, null, msgs);
			msgs = basicSetFbd(newFbd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.COORDINATE_INFO_TYPE__FBD, newFbd, newFbd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LdType getLd() {
		return ld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLd(LdType newLd, NotificationChain msgs) {
		LdType oldLd = ld;
		ld = newLd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.COORDINATE_INFO_TYPE__LD, oldLd, newLd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLd(LdType newLd) {
		if (newLd != ld) {
			NotificationChain msgs = null;
			if (ld != null)
				msgs = ((InternalEObject)ld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.COORDINATE_INFO_TYPE__LD, null, msgs);
			if (newLd != null)
				msgs = ((InternalEObject)newLd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.COORDINATE_INFO_TYPE__LD, null, msgs);
			msgs = basicSetLd(newLd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.COORDINATE_INFO_TYPE__LD, newLd, newLd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SfcType getSfc() {
		return sfc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSfc(SfcType newSfc, NotificationChain msgs) {
		SfcType oldSfc = sfc;
		sfc = newSfc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.COORDINATE_INFO_TYPE__SFC, oldSfc, newSfc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfc(SfcType newSfc) {
		if (newSfc != sfc) {
			NotificationChain msgs = null;
			if (sfc != null)
				msgs = ((InternalEObject)sfc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.COORDINATE_INFO_TYPE__SFC, null, msgs);
			if (newSfc != null)
				msgs = ((InternalEObject)newSfc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.COORDINATE_INFO_TYPE__SFC, null, msgs);
			msgs = basicSetSfc(newSfc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.COORDINATE_INFO_TYPE__SFC, newSfc, newSfc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE:
				return basicSetPageSize(null, msgs);
			case Tc60201Package.COORDINATE_INFO_TYPE__FBD:
				return basicSetFbd(null, msgs);
			case Tc60201Package.COORDINATE_INFO_TYPE__LD:
				return basicSetLd(null, msgs);
			case Tc60201Package.COORDINATE_INFO_TYPE__SFC:
				return basicSetSfc(null, msgs);
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
			case Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE:
				return getPageSize();
			case Tc60201Package.COORDINATE_INFO_TYPE__FBD:
				return getFbd();
			case Tc60201Package.COORDINATE_INFO_TYPE__LD:
				return getLd();
			case Tc60201Package.COORDINATE_INFO_TYPE__SFC:
				return getSfc();
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
			case Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE:
				setPageSize((PageSizeType)newValue);
				return;
			case Tc60201Package.COORDINATE_INFO_TYPE__FBD:
				setFbd((FbdType)newValue);
				return;
			case Tc60201Package.COORDINATE_INFO_TYPE__LD:
				setLd((LdType)newValue);
				return;
			case Tc60201Package.COORDINATE_INFO_TYPE__SFC:
				setSfc((SfcType)newValue);
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
			case Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE:
				setPageSize((PageSizeType)null);
				return;
			case Tc60201Package.COORDINATE_INFO_TYPE__FBD:
				setFbd((FbdType)null);
				return;
			case Tc60201Package.COORDINATE_INFO_TYPE__LD:
				setLd((LdType)null);
				return;
			case Tc60201Package.COORDINATE_INFO_TYPE__SFC:
				setSfc((SfcType)null);
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
			case Tc60201Package.COORDINATE_INFO_TYPE__PAGE_SIZE:
				return pageSize != null;
			case Tc60201Package.COORDINATE_INFO_TYPE__FBD:
				return fbd != null;
			case Tc60201Package.COORDINATE_INFO_TYPE__LD:
				return ld != null;
			case Tc60201Package.COORDINATE_INFO_TYPE__SFC:
				return sfc != null;
		}
		return super.eIsSet(featureID);
	}

} //CoordinateInfoTypeImpl

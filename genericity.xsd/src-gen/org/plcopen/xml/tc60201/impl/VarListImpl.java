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
import org.plcopen.xml.tc60201.VarList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VarListImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VarListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VarListImpl#isNonpersistent <em>Nonpersistent</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VarListImpl#isNonretain <em>Nonretain</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VarListImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VarListImpl#isRetain <em>Retain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarListImpl extends VarListPlainImpl implements VarList {
	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * This is true if the Constant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constantESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isNonpersistent() <em>Nonpersistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonpersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NONPERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNonpersistent() <em>Nonpersistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonpersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean nonpersistent = NONPERSISTENT_EDEFAULT;

	/**
	 * This is true if the Nonpersistent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nonpersistentESet;

	/**
	 * The default value of the '{@link #isNonretain() <em>Nonretain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonretain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NONRETAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNonretain() <em>Nonretain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonretain()
	 * @generated
	 * @ordered
	 */
	protected boolean nonretain = NONRETAIN_EDEFAULT;

	/**
	 * This is true if the Nonretain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nonretainESet;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * This is true if the Persistent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean persistentESet;

	/**
	 * The default value of the '{@link #isRetain() <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetain() <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetain()
	 * @generated
	 * @ordered
	 */
	protected boolean retain = RETAIN_EDEFAULT;

	/**
	 * This is true if the Retain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retainESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getVarList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		boolean oldConstantESet = constantESet;
		constantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VAR_LIST__CONSTANT, oldConstant, constant, !oldConstantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstant() {
		boolean oldConstant = constant;
		boolean oldConstantESet = constantESet;
		constant = CONSTANT_EDEFAULT;
		constantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VAR_LIST__CONSTANT, oldConstant, CONSTANT_EDEFAULT, oldConstantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstant() {
		return constantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VAR_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonpersistent() {
		return nonpersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonpersistent(boolean newNonpersistent) {
		boolean oldNonpersistent = nonpersistent;
		nonpersistent = newNonpersistent;
		boolean oldNonpersistentESet = nonpersistentESet;
		nonpersistentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VAR_LIST__NONPERSISTENT, oldNonpersistent, nonpersistent, !oldNonpersistentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNonpersistent() {
		boolean oldNonpersistent = nonpersistent;
		boolean oldNonpersistentESet = nonpersistentESet;
		nonpersistent = NONPERSISTENT_EDEFAULT;
		nonpersistentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VAR_LIST__NONPERSISTENT, oldNonpersistent, NONPERSISTENT_EDEFAULT, oldNonpersistentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNonpersistent() {
		return nonpersistentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonretain() {
		return nonretain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonretain(boolean newNonretain) {
		boolean oldNonretain = nonretain;
		nonretain = newNonretain;
		boolean oldNonretainESet = nonretainESet;
		nonretainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VAR_LIST__NONRETAIN, oldNonretain, nonretain, !oldNonretainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNonretain() {
		boolean oldNonretain = nonretain;
		boolean oldNonretainESet = nonretainESet;
		nonretain = NONRETAIN_EDEFAULT;
		nonretainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VAR_LIST__NONRETAIN, oldNonretain, NONRETAIN_EDEFAULT, oldNonretainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNonretain() {
		return nonretainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		boolean oldPersistentESet = persistentESet;
		persistentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VAR_LIST__PERSISTENT, oldPersistent, persistent, !oldPersistentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistent() {
		boolean oldPersistent = persistent;
		boolean oldPersistentESet = persistentESet;
		persistent = PERSISTENT_EDEFAULT;
		persistentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VAR_LIST__PERSISTENT, oldPersistent, PERSISTENT_EDEFAULT, oldPersistentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersistent() {
		return persistentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetain() {
		return retain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetain(boolean newRetain) {
		boolean oldRetain = retain;
		retain = newRetain;
		boolean oldRetainESet = retainESet;
		retainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VAR_LIST__RETAIN, oldRetain, retain, !oldRetainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRetain() {
		boolean oldRetain = retain;
		boolean oldRetainESet = retainESet;
		retain = RETAIN_EDEFAULT;
		retainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VAR_LIST__RETAIN, oldRetain, RETAIN_EDEFAULT, oldRetainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRetain() {
		return retainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tc60201Package.VAR_LIST__CONSTANT:
				return isConstant();
			case Tc60201Package.VAR_LIST__NAME:
				return getName();
			case Tc60201Package.VAR_LIST__NONPERSISTENT:
				return isNonpersistent();
			case Tc60201Package.VAR_LIST__NONRETAIN:
				return isNonretain();
			case Tc60201Package.VAR_LIST__PERSISTENT:
				return isPersistent();
			case Tc60201Package.VAR_LIST__RETAIN:
				return isRetain();
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
			case Tc60201Package.VAR_LIST__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case Tc60201Package.VAR_LIST__NAME:
				setName((String)newValue);
				return;
			case Tc60201Package.VAR_LIST__NONPERSISTENT:
				setNonpersistent((Boolean)newValue);
				return;
			case Tc60201Package.VAR_LIST__NONRETAIN:
				setNonretain((Boolean)newValue);
				return;
			case Tc60201Package.VAR_LIST__PERSISTENT:
				setPersistent((Boolean)newValue);
				return;
			case Tc60201Package.VAR_LIST__RETAIN:
				setRetain((Boolean)newValue);
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
			case Tc60201Package.VAR_LIST__CONSTANT:
				unsetConstant();
				return;
			case Tc60201Package.VAR_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tc60201Package.VAR_LIST__NONPERSISTENT:
				unsetNonpersistent();
				return;
			case Tc60201Package.VAR_LIST__NONRETAIN:
				unsetNonretain();
				return;
			case Tc60201Package.VAR_LIST__PERSISTENT:
				unsetPersistent();
				return;
			case Tc60201Package.VAR_LIST__RETAIN:
				unsetRetain();
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
			case Tc60201Package.VAR_LIST__CONSTANT:
				return isSetConstant();
			case Tc60201Package.VAR_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tc60201Package.VAR_LIST__NONPERSISTENT:
				return isSetNonpersistent();
			case Tc60201Package.VAR_LIST__NONRETAIN:
				return isSetNonretain();
			case Tc60201Package.VAR_LIST__PERSISTENT:
				return isSetPersistent();
			case Tc60201Package.VAR_LIST__RETAIN:
				return isSetRetain();
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
		result.append(" (constant: ");
		if (constantESet) result.append(constant); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nonpersistent: ");
		if (nonpersistentESet) result.append(nonpersistent); else result.append("<unset>");
		result.append(", nonretain: ");
		if (nonretainESet) result.append(nonretain); else result.append("<unset>");
		result.append(", persistent: ");
		if (persistentESet) result.append(persistent); else result.append("<unset>");
		result.append(", retain: ");
		if (retainESet) result.append(retain); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VarListImpl

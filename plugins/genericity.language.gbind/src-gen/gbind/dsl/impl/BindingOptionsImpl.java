/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.BindingOptions;
import gbind.dsl.DslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.BindingOptionsImpl#isEnableClassMerge <em>Enable Class Merge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingOptionsImpl extends EObjectImpl implements BindingOptions {
	/**
	 * The default value of the '{@link #isEnableClassMerge() <em>Enable Class Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableClassMerge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_CLASS_MERGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableClassMerge() <em>Enable Class Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableClassMerge()
	 * @generated
	 * @ordered
	 */
	protected boolean enableClassMerge = ENABLE_CLASS_MERGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.BINDING_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableClassMerge() {
		return enableClassMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableClassMerge(boolean newEnableClassMerge) {
		boolean oldEnableClassMerge = enableClassMerge;
		enableClassMerge = newEnableClassMerge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_OPTIONS__ENABLE_CLASS_MERGE, oldEnableClassMerge, enableClassMerge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.BINDING_OPTIONS__ENABLE_CLASS_MERGE:
				return isEnableClassMerge();
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
			case DslPackage.BINDING_OPTIONS__ENABLE_CLASS_MERGE:
				setEnableClassMerge((Boolean)newValue);
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
			case DslPackage.BINDING_OPTIONS__ENABLE_CLASS_MERGE:
				setEnableClassMerge(ENABLE_CLASS_MERGE_EDEFAULT);
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
			case DslPackage.BINDING_OPTIONS__ENABLE_CLASS_MERGE:
				return enableClassMerge != ENABLE_CLASS_MERGE_EDEFAULT;
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
		result.append(" (enableClassMerge: ");
		result.append(enableClassMerge);
		result.append(')');
		return result.toString();
	}

} //BindingOptionsImpl

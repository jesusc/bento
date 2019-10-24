/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.ReturnBottleToBase;
import mindstorms_bdsl.nameReturnBottleToBase;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Bottle To Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.ReturnBottleToBaseImpl#getContainsnameReturnBottleToBase <em>Containsname Return Bottle To Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnBottleToBaseImpl extends BehaviorImpl implements ReturnBottleToBase {
	/**
	 * The cached value of the '{@link #getContainsnameReturnBottleToBase() <em>Containsname Return Bottle To Base</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameReturnBottleToBase()
	 * @generated
	 * @ordered
	 */
	protected EList<nameReturnBottleToBase> containsnameReturnBottleToBase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnBottleToBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.RETURN_BOTTLE_TO_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameReturnBottleToBase> getContainsnameReturnBottleToBase() {
		if (containsnameReturnBottleToBase == null) {
			containsnameReturnBottleToBase = new EObjectContainmentEList<nameReturnBottleToBase>(nameReturnBottleToBase.class, this, Mindstorms_bdslPackage.RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE);
		}
		return containsnameReturnBottleToBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE:
				return ((InternalEList<?>)getContainsnameReturnBottleToBase()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE:
				return getContainsnameReturnBottleToBase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mindstorms_bdslPackage.RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE:
				getContainsnameReturnBottleToBase().clear();
				getContainsnameReturnBottleToBase().addAll((Collection<? extends nameReturnBottleToBase>)newValue);
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
			case Mindstorms_bdslPackage.RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE:
				getContainsnameReturnBottleToBase().clear();
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
			case Mindstorms_bdslPackage.RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE:
				return containsnameReturnBottleToBase != null && !containsnameReturnBottleToBase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReturnBottleToBaseImpl

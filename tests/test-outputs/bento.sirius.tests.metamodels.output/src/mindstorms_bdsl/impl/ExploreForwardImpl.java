/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.ExploreForward;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.nameExploreForward;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explore Forward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.ExploreForwardImpl#getContainsnameExploreForward <em>Containsname Explore Forward</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExploreForwardImpl extends BehaviorImpl implements ExploreForward {
	/**
	 * The cached value of the '{@link #getContainsnameExploreForward() <em>Containsname Explore Forward</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameExploreForward()
	 * @generated
	 * @ordered
	 */
	protected EList<nameExploreForward> containsnameExploreForward;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExploreForwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.EXPLORE_FORWARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameExploreForward> getContainsnameExploreForward() {
		if (containsnameExploreForward == null) {
			containsnameExploreForward = new EObjectContainmentEList<nameExploreForward>(nameExploreForward.class, this, Mindstorms_bdslPackage.EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD);
		}
		return containsnameExploreForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD:
				return ((InternalEList<?>)getContainsnameExploreForward()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD:
				return getContainsnameExploreForward();
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
			case Mindstorms_bdslPackage.EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD:
				getContainsnameExploreForward().clear();
				getContainsnameExploreForward().addAll((Collection<? extends nameExploreForward>)newValue);
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
			case Mindstorms_bdslPackage.EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD:
				getContainsnameExploreForward().clear();
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
			case Mindstorms_bdslPackage.EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD:
				return containsnameExploreForward != null && !containsnameExploreForward.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExploreForwardImpl

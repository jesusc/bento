/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.AvoidObstacle;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.nameAvoidObstacle;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Avoid Obstacle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.AvoidObstacleImpl#getContainsnameAvoidObstacle <em>Containsname Avoid Obstacle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvoidObstacleImpl extends BehaviorImpl implements AvoidObstacle {
	/**
	 * The cached value of the '{@link #getContainsnameAvoidObstacle() <em>Containsname Avoid Obstacle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameAvoidObstacle()
	 * @generated
	 * @ordered
	 */
	protected EList<nameAvoidObstacle> containsnameAvoidObstacle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvoidObstacleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.AVOID_OBSTACLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameAvoidObstacle> getContainsnameAvoidObstacle() {
		if (containsnameAvoidObstacle == null) {
			containsnameAvoidObstacle = new EObjectContainmentEList<nameAvoidObstacle>(nameAvoidObstacle.class, this, Mindstorms_bdslPackage.AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE);
		}
		return containsnameAvoidObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE:
				return ((InternalEList<?>)getContainsnameAvoidObstacle()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE:
				return getContainsnameAvoidObstacle();
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
			case Mindstorms_bdslPackage.AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE:
				getContainsnameAvoidObstacle().clear();
				getContainsnameAvoidObstacle().addAll((Collection<? extends nameAvoidObstacle>)newValue);
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
			case Mindstorms_bdslPackage.AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE:
				getContainsnameAvoidObstacle().clear();
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
			case Mindstorms_bdslPackage.AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE:
				return containsnameAvoidObstacle != null && !containsnameAvoidObstacle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AvoidObstacleImpl

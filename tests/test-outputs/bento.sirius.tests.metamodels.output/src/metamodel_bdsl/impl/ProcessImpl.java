/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.Probability;
import metamodel_bdsl.StorageOutputFlow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.ProcessImpl#getStorageOutputFlow <em>Storage Output Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessImpl extends ComponentImpl implements metamodel_bdsl.Process {
	/**
	 * The cached value of the '{@link #getStorageOutputFlow() <em>Storage Output Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageOutputFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageOutputFlow> storageOutputFlow;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Probability duration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StorageOutputFlow> getStorageOutputFlow() {
		if (storageOutputFlow == null) {
			storageOutputFlow = new EObjectWithInverseResolvingEList<StorageOutputFlow>(StorageOutputFlow.class, this, Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION);
		}
		return storageOutputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probability getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Probability newDuration, NotificationChain msgs) {
		Probability oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Probability newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStorageOutputFlow()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW:
				return ((InternalEList<?>)getStorageOutputFlow()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.PROCESS__DURATION:
				return basicSetDuration(null, msgs);
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
			case Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW:
				return getStorageOutputFlow();
			case Metamodel_bdslPackage.PROCESS__DURATION:
				return getDuration();
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
			case Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW:
				getStorageOutputFlow().clear();
				getStorageOutputFlow().addAll((Collection<? extends StorageOutputFlow>)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS__DURATION:
				setDuration((Probability)newValue);
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
			case Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW:
				getStorageOutputFlow().clear();
				return;
			case Metamodel_bdslPackage.PROCESS__DURATION:
				setDuration((Probability)null);
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
			case Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW:
				return storageOutputFlow != null && !storageOutputFlow.isEmpty();
			case Metamodel_bdslPackage.PROCESS__DURATION:
				return duration != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl

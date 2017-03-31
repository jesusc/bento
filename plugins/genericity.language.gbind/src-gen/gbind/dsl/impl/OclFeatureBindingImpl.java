/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.DslPackage;
import gbind.dsl.OclFeatureBinding;

import gbind.simpleocl.OclExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Feature Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.impl.OclFeatureBindingImpl#getConcrete <em>Concrete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OclFeatureBindingImpl extends BaseFeatureBindingImpl implements OclFeatureBinding {
	/**
	 * The cached value of the '{@link #getConcrete() <em>Concrete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcrete()
	 * @generated
	 * @ordered
	 */
	protected OclExpression concrete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclFeatureBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.OCL_FEATURE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getConcrete() {
		return concrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcrete(OclExpression newConcrete, NotificationChain msgs) {
		OclExpression oldConcrete = concrete;
		concrete = newConcrete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.OCL_FEATURE_BINDING__CONCRETE, oldConcrete, newConcrete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcrete(OclExpression newConcrete) {
		if (newConcrete != concrete) {
			NotificationChain msgs = null;
			if (concrete != null)
				msgs = ((InternalEObject)concrete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.OCL_FEATURE_BINDING__CONCRETE, null, msgs);
			if (newConcrete != null)
				msgs = ((InternalEObject)newConcrete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.OCL_FEATURE_BINDING__CONCRETE, null, msgs);
			msgs = basicSetConcrete(newConcrete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.OCL_FEATURE_BINDING__CONCRETE, newConcrete, newConcrete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.OCL_FEATURE_BINDING__CONCRETE:
				return basicSetConcrete(null, msgs);
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
			case DslPackage.OCL_FEATURE_BINDING__CONCRETE:
				return getConcrete();
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
			case DslPackage.OCL_FEATURE_BINDING__CONCRETE:
				setConcrete((OclExpression)newValue);
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
			case DslPackage.OCL_FEATURE_BINDING__CONCRETE:
				setConcrete((OclExpression)null);
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
			case DslPackage.OCL_FEATURE_BINDING__CONCRETE:
				return concrete != null;
		}
		return super.eIsSet(featureID);
	}

} //OclFeatureBindingImpl

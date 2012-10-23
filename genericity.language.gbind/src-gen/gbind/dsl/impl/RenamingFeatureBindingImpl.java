/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.DslPackage;
import gbind.dsl.RenamingFeatureBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renaming Feature Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.RenamingFeatureBindingImpl#getConcreteFeature <em>Concrete Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamingFeatureBindingImpl extends BaseFeatureBindingImpl implements RenamingFeatureBinding {
	/**
	 * The default value of the '{@link #getConcreteFeature() <em>Concrete Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCRETE_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcreteFeature() <em>Concrete Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteFeature()
	 * @generated
	 * @ordered
	 */
	protected String concreteFeature = CONCRETE_FEATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenamingFeatureBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.RENAMING_FEATURE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcreteFeature() {
		return concreteFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteFeature(String newConcreteFeature) {
		String oldConcreteFeature = concreteFeature;
		concreteFeature = newConcreteFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE, oldConcreteFeature, concreteFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE:
				return getConcreteFeature();
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
			case DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE:
				setConcreteFeature((String)newValue);
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
			case DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE:
				setConcreteFeature(CONCRETE_FEATURE_EDEFAULT);
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
			case DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE:
				return CONCRETE_FEATURE_EDEFAULT == null ? concreteFeature != null : !CONCRETE_FEATURE_EDEFAULT.equals(concreteFeature);
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
		result.append(" (concreteFeature: ");
		result.append(concreteFeature);
		result.append(')');
		return result.toString();
	}

} //RenamingFeatureBindingImpl

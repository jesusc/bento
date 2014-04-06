/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.Metaclass;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.LazyRuleAnn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lazy Rule Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.LazyRuleAnnImpl#getInPatternType <em>In Pattern Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.LazyRuleAnnImpl#getOutputPatternType <em>Output Pattern Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LazyRuleAnnImpl extends RuleAnnImpl implements LazyRuleAnn {
	/**
	 * The cached value of the '{@link #getInPatternType() <em>In Pattern Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPatternType()
	 * @generated
	 * @ordered
	 */
	protected Metaclass inPatternType;

	/**
	 * The cached value of the '{@link #getOutputPatternType() <em>Output Pattern Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPatternType()
	 * @generated
	 * @ordered
	 */
	protected Metaclass outputPatternType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LazyRuleAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.LAZY_RULE_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass getInPatternType() {
		if (inPatternType != null && inPatternType.eIsProxy()) {
			InternalEObject oldInPatternType = (InternalEObject)inPatternType;
			inPatternType = (Metaclass)eResolveProxy(oldInPatternType);
			if (inPatternType != oldInPatternType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.LAZY_RULE_ANN__IN_PATTERN_TYPE, oldInPatternType, inPatternType));
			}
		}
		return inPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass basicGetInPatternType() {
		return inPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPatternType(Metaclass newInPatternType) {
		Metaclass oldInPatternType = inPatternType;
		inPatternType = newInPatternType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.LAZY_RULE_ANN__IN_PATTERN_TYPE, oldInPatternType, inPatternType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass getOutputPatternType() {
		if (outputPatternType != null && outputPatternType.eIsProxy()) {
			InternalEObject oldOutputPatternType = (InternalEObject)outputPatternType;
			outputPatternType = (Metaclass)eResolveProxy(oldOutputPatternType);
			if (outputPatternType != oldOutputPatternType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE, oldOutputPatternType, outputPatternType));
			}
		}
		return outputPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass basicGetOutputPatternType() {
		return outputPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPatternType(Metaclass newOutputPatternType) {
		Metaclass oldOutputPatternType = outputPatternType;
		outputPatternType = newOutputPatternType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE, oldOutputPatternType, outputPatternType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.LAZY_RULE_ANN__IN_PATTERN_TYPE:
				if (resolve) return getInPatternType();
				return basicGetInPatternType();
			case AnnotationsPackage.LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE:
				if (resolve) return getOutputPatternType();
				return basicGetOutputPatternType();
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
			case AnnotationsPackage.LAZY_RULE_ANN__IN_PATTERN_TYPE:
				setInPatternType((Metaclass)newValue);
				return;
			case AnnotationsPackage.LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE:
				setOutputPatternType((Metaclass)newValue);
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
			case AnnotationsPackage.LAZY_RULE_ANN__IN_PATTERN_TYPE:
				setInPatternType((Metaclass)null);
				return;
			case AnnotationsPackage.LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE:
				setOutputPatternType((Metaclass)null);
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
			case AnnotationsPackage.LAZY_RULE_ANN__IN_PATTERN_TYPE:
				return inPatternType != null;
			case AnnotationsPackage.LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE:
				return outputPatternType != null;
		}
		return super.eIsSet(featureID);
	}

} //LazyRuleAnnImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.Metaclass;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matched Rule One Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.MatchedRuleOneAnnImpl#getInPatternType <em>In Pattern Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchedRuleOneAnnImpl extends MatchedRuleAnnImpl implements MatchedRuleOneAnn {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchedRuleOneAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.MATCHED_RULE_ONE_ANN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE, oldInPatternType, inPatternType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE, oldInPatternType, inPatternType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE:
				if (resolve) return getInPatternType();
				return basicGetInPatternType();
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
			case AnnotationsPackage.MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE:
				setInPatternType((Metaclass)newValue);
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
			case AnnotationsPackage.MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE:
				setInPatternType((Metaclass)null);
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
			case AnnotationsPackage.MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE:
				return inPatternType != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchedRuleOneAnnImpl

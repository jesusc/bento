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
import genericity.typing.atl_types.annotations.MatchedRuleAnn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matched Rule Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.MatchedRuleAnnImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.MatchedRuleAnnImpl#getOutputPatternType <em>Output Pattern Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MatchedRuleAnnImpl extends RuleAnnImpl implements MatchedRuleAnn {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation filter;

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
	protected MatchedRuleAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.MATCHED_RULE_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(ExpressionAnnotation newFilter, NotificationChain msgs) {
		ExpressionAnnotation oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.MATCHED_RULE_ANN__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(ExpressionAnnotation newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.MATCHED_RULE_ANN__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.MATCHED_RULE_ANN__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.MATCHED_RULE_ANN__FILTER, newFilter, newFilter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE, oldOutputPatternType, outputPatternType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE, oldOutputPatternType, outputPatternType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.MATCHED_RULE_ANN__FILTER:
				return basicSetFilter(null, msgs);
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
			case AnnotationsPackage.MATCHED_RULE_ANN__FILTER:
				return getFilter();
			case AnnotationsPackage.MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE:
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
			case AnnotationsPackage.MATCHED_RULE_ANN__FILTER:
				setFilter((ExpressionAnnotation)newValue);
				return;
			case AnnotationsPackage.MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE:
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
			case AnnotationsPackage.MATCHED_RULE_ANN__FILTER:
				setFilter((ExpressionAnnotation)null);
				return;
			case AnnotationsPackage.MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE:
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
			case AnnotationsPackage.MATCHED_RULE_ANN__FILTER:
				return filter != null;
			case AnnotationsPackage.MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE:
				return outputPatternType != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchedRuleAnnImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.Type;

import genericity.typing.atl_types.analysis.ControlFlow;
import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;
import genericity.typing.atl_types.annotations.RuleResolutionInfo;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getName <em>Name</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getWrittenFeature <em>Written Feature</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getValue <em>Value</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl#getControlFlow <em>Control Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingAnnImpl extends AtlAnnotationImpl implements BindingAnn {
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EObject rule;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EObject binding;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected Type sourceType;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected Type targetType;

	/**
	 * The cached value of the '{@link #getWrittenFeature() <em>Written Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrittenFeature()
	 * @generated
	 * @ordered
	 */
	protected EObject writtenFeature;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation value;

	/**
	 * The cached value of the '{@link #getResolvedBy() <em>Resolved By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleResolutionInfo> resolvedBy;

	/**
	 * The cached value of the '{@link #getControlFlow() <em>Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlow()
	 * @generated
	 * @ordered
	 */
	protected ControlFlow controlFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.BINDING_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRule() {
		if (rule != null && rule.eIsProxy()) {
			InternalEObject oldRule = (InternalEObject)rule;
			rule = eResolveProxy(oldRule);
			if (rule != oldRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.BINDING_ANN__RULE, oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(EObject newRule) {
		EObject oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__RULE, oldRule, rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject)binding;
			binding = eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.BINDING_ANN__BINDING, oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(EObject newBinding) {
		EObject oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSourceType() {
		if (sourceType != null && sourceType.eIsProxy()) {
			InternalEObject oldSourceType = (InternalEObject)sourceType;
			sourceType = (Type)eResolveProxy(oldSourceType);
			if (sourceType != oldSourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.BINDING_ANN__SOURCE_TYPE, oldSourceType, sourceType));
			}
		}
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(Type newSourceType) {
		Type oldSourceType = sourceType;
		sourceType = newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTargetType() {
		if (targetType != null && targetType.eIsProxy()) {
			InternalEObject oldTargetType = (InternalEObject)targetType;
			targetType = (Type)eResolveProxy(oldTargetType);
			if (targetType != oldTargetType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.BINDING_ANN__TARGET_TYPE, oldTargetType, targetType));
			}
		}
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(Type newTargetType) {
		Type oldTargetType = targetType;
		targetType = newTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__TARGET_TYPE, oldTargetType, targetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWrittenFeature() {
		if (writtenFeature != null && writtenFeature.eIsProxy()) {
			InternalEObject oldWrittenFeature = (InternalEObject)writtenFeature;
			writtenFeature = eResolveProxy(oldWrittenFeature);
			if (writtenFeature != oldWrittenFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.BINDING_ANN__WRITTEN_FEATURE, oldWrittenFeature, writtenFeature));
			}
		}
		return writtenFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetWrittenFeature() {
		return writtenFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrittenFeature(EObject newWrittenFeature) {
		EObject oldWrittenFeature = writtenFeature;
		writtenFeature = newWrittenFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__WRITTEN_FEATURE, oldWrittenFeature, writtenFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ExpressionAnnotation newValue, NotificationChain msgs) {
		ExpressionAnnotation oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ExpressionAnnotation newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.BINDING_ANN__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.BINDING_ANN__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleResolutionInfo> getResolvedBy() {
		if (resolvedBy == null) {
			resolvedBy = new EObjectContainmentEList<RuleResolutionInfo>(RuleResolutionInfo.class, this, AnnotationsPackage.BINDING_ANN__RESOLVED_BY);
		}
		return resolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow getControlFlow() {
		if (controlFlow != null && controlFlow.eIsProxy()) {
			InternalEObject oldControlFlow = (InternalEObject)controlFlow;
			controlFlow = (ControlFlow)eResolveProxy(oldControlFlow);
			if (controlFlow != oldControlFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.BINDING_ANN__CONTROL_FLOW, oldControlFlow, controlFlow));
			}
		}
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow basicGetControlFlow() {
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlFlow(ControlFlow newControlFlow) {
		ControlFlow oldControlFlow = controlFlow;
		controlFlow = newControlFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.BINDING_ANN__CONTROL_FLOW, oldControlFlow, controlFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.BINDING_ANN__VALUE:
				return basicSetValue(null, msgs);
			case AnnotationsPackage.BINDING_ANN__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.BINDING_ANN__RULE:
				if (resolve) return getRule();
				return basicGetRule();
			case AnnotationsPackage.BINDING_ANN__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
			case AnnotationsPackage.BINDING_ANN__NAME:
				return getName();
			case AnnotationsPackage.BINDING_ANN__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case AnnotationsPackage.BINDING_ANN__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case AnnotationsPackage.BINDING_ANN__WRITTEN_FEATURE:
				if (resolve) return getWrittenFeature();
				return basicGetWrittenFeature();
			case AnnotationsPackage.BINDING_ANN__VALUE:
				return getValue();
			case AnnotationsPackage.BINDING_ANN__RESOLVED_BY:
				return getResolvedBy();
			case AnnotationsPackage.BINDING_ANN__CONTROL_FLOW:
				if (resolve) return getControlFlow();
				return basicGetControlFlow();
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
			case AnnotationsPackage.BINDING_ANN__RULE:
				setRule((EObject)newValue);
				return;
			case AnnotationsPackage.BINDING_ANN__BINDING:
				setBinding((EObject)newValue);
				return;
			case AnnotationsPackage.BINDING_ANN__NAME:
				setName((String)newValue);
				return;
			case AnnotationsPackage.BINDING_ANN__SOURCE_TYPE:
				setSourceType((Type)newValue);
				return;
			case AnnotationsPackage.BINDING_ANN__TARGET_TYPE:
				setTargetType((Type)newValue);
				return;
			case AnnotationsPackage.BINDING_ANN__WRITTEN_FEATURE:
				setWrittenFeature((EObject)newValue);
				return;
			case AnnotationsPackage.BINDING_ANN__VALUE:
				setValue((ExpressionAnnotation)newValue);
				return;
			case AnnotationsPackage.BINDING_ANN__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends RuleResolutionInfo>)newValue);
				return;
			case AnnotationsPackage.BINDING_ANN__CONTROL_FLOW:
				setControlFlow((ControlFlow)newValue);
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
			case AnnotationsPackage.BINDING_ANN__RULE:
				setRule((EObject)null);
				return;
			case AnnotationsPackage.BINDING_ANN__BINDING:
				setBinding((EObject)null);
				return;
			case AnnotationsPackage.BINDING_ANN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnnotationsPackage.BINDING_ANN__SOURCE_TYPE:
				setSourceType((Type)null);
				return;
			case AnnotationsPackage.BINDING_ANN__TARGET_TYPE:
				setTargetType((Type)null);
				return;
			case AnnotationsPackage.BINDING_ANN__WRITTEN_FEATURE:
				setWrittenFeature((EObject)null);
				return;
			case AnnotationsPackage.BINDING_ANN__VALUE:
				setValue((ExpressionAnnotation)null);
				return;
			case AnnotationsPackage.BINDING_ANN__RESOLVED_BY:
				getResolvedBy().clear();
				return;
			case AnnotationsPackage.BINDING_ANN__CONTROL_FLOW:
				setControlFlow((ControlFlow)null);
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
			case AnnotationsPackage.BINDING_ANN__RULE:
				return rule != null;
			case AnnotationsPackage.BINDING_ANN__BINDING:
				return binding != null;
			case AnnotationsPackage.BINDING_ANN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnnotationsPackage.BINDING_ANN__SOURCE_TYPE:
				return sourceType != null;
			case AnnotationsPackage.BINDING_ANN__TARGET_TYPE:
				return targetType != null;
			case AnnotationsPackage.BINDING_ANN__WRITTEN_FEATURE:
				return writtenFeature != null;
			case AnnotationsPackage.BINDING_ANN__VALUE:
				return value != null;
			case AnnotationsPackage.BINDING_ANN__RESOLVED_BY:
				return resolvedBy != null && !resolvedBy.isEmpty();
			case AnnotationsPackage.BINDING_ANN__CONTROL_FLOW:
				return controlFlow != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BindingAnnImpl

/**
 */
package bento.language.bentocomp.flowcontrol.impl;

import bento.language.bentocomp.core.Component;

import bento.language.bentocomp.flowcontrol.Apply;
import bento.language.bentocomp.flowcontrol.ApplyParameter;
import bento.language.bentocomp.flowcontrol.FlowcontrolPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.flowcontrol.impl.ApplyImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.impl.ApplyImpl#getInputModels <em>Input Models</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.impl.ApplyImpl#getOutputModels <em>Output Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplyImpl extends CompositionStepImpl implements Apply {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getInputModels() <em>Input Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyParameter> inputModels;

	/**
	 * The cached value of the '{@link #getOutputModels() <em>Output Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyParameter> outputModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowcontrolPackage.Literals.APPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowcontrolPackage.APPLY__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowcontrolPackage.APPLY__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyParameter> getInputModels() {
		if (inputModels == null) {
			inputModels = new EObjectContainmentEList<ApplyParameter>(ApplyParameter.class, this, FlowcontrolPackage.APPLY__INPUT_MODELS);
		}
		return inputModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyParameter> getOutputModels() {
		if (outputModels == null) {
			outputModels = new EObjectContainmentEList<ApplyParameter>(ApplyParameter.class, this, FlowcontrolPackage.APPLY__OUTPUT_MODELS);
		}
		return outputModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowcontrolPackage.APPLY__INPUT_MODELS:
				return ((InternalEList<?>)getInputModels()).basicRemove(otherEnd, msgs);
			case FlowcontrolPackage.APPLY__OUTPUT_MODELS:
				return ((InternalEList<?>)getOutputModels()).basicRemove(otherEnd, msgs);
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
			case FlowcontrolPackage.APPLY__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case FlowcontrolPackage.APPLY__INPUT_MODELS:
				return getInputModels();
			case FlowcontrolPackage.APPLY__OUTPUT_MODELS:
				return getOutputModels();
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
			case FlowcontrolPackage.APPLY__COMPONENT:
				setComponent((Component)newValue);
				return;
			case FlowcontrolPackage.APPLY__INPUT_MODELS:
				getInputModels().clear();
				getInputModels().addAll((Collection<? extends ApplyParameter>)newValue);
				return;
			case FlowcontrolPackage.APPLY__OUTPUT_MODELS:
				getOutputModels().clear();
				getOutputModels().addAll((Collection<? extends ApplyParameter>)newValue);
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
			case FlowcontrolPackage.APPLY__COMPONENT:
				setComponent((Component)null);
				return;
			case FlowcontrolPackage.APPLY__INPUT_MODELS:
				getInputModels().clear();
				return;
			case FlowcontrolPackage.APPLY__OUTPUT_MODELS:
				getOutputModels().clear();
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
			case FlowcontrolPackage.APPLY__COMPONENT:
				return component != null;
			case FlowcontrolPackage.APPLY__INPUT_MODELS:
				return inputModels != null && !inputModels.isEmpty();
			case FlowcontrolPackage.APPLY__OUTPUT_MODELS:
				return outputModels != null && !outputModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplyImpl

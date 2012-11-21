/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation.impl;

import genericity.gcomponent.instantiation.AdaptWithBinding;
import genericity.gcomponent.instantiation.AdaptedTransformation;
import genericity.gcomponent.instantiation.ComponentInstantiationPackage;

import genericity.language.gcomponent.core.Template;

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
 * An implementation of the model object '<em><b>Adapted Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.gcomponent.instantiation.impl.AdaptedTransformationImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.impl.AdaptedTransformationImpl#getRequiredAdaptations <em>Required Adaptations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptedTransformationImpl extends ExecutableTransformationImpl implements AdaptedTransformation {
	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template template;

	/**
	 * The cached value of the '{@link #getRequiredAdaptations() <em>Required Adaptations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAdaptations()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptWithBinding> requiredAdaptations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptedTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInstantiationPackage.Literals.ADAPTED_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (Template)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		Template oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptWithBinding> getRequiredAdaptations() {
		if (requiredAdaptations == null) {
			requiredAdaptations = new EObjectContainmentEList<AdaptWithBinding>(AdaptWithBinding.class, this, ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS);
		}
		return requiredAdaptations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS:
				return ((InternalEList<?>)getRequiredAdaptations()).basicRemove(otherEnd, msgs);
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
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS:
				return getRequiredAdaptations();
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
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__TEMPLATE:
				setTemplate((Template)newValue);
				return;
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS:
				getRequiredAdaptations().clear();
				getRequiredAdaptations().addAll((Collection<? extends AdaptWithBinding>)newValue);
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
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__TEMPLATE:
				setTemplate((Template)null);
				return;
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS:
				getRequiredAdaptations().clear();
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
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__TEMPLATE:
				return template != null;
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS:
				return requiredAdaptations != null && !requiredAdaptations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdaptedTransformationImpl

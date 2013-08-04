/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation.impl;

import genericity.gcomponent.instantiation.AdaptWithBinding;
import genericity.gcomponent.instantiation.ComponentInstantiationPackage;

import genericity.gcomponent.instantiation.TemplateSpecificData;
import genericity.language.gcomponent.core.BindingDeclaration;
import genericity.language.gcomponent.core.ParameterModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapt With Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl#getParameterIndex <em>Parameter Index</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl#getConcreteModel <em>Concrete Model</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl#getConceptModel <em>Concept Model</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl#getAppliedBinding <em>Applied Binding</em>}</li>
 *   <li>{@link genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl#getTemplateData <em>Template Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptWithBindingImpl extends EObjectImpl implements AdaptWithBinding {
	/**
	 * The default value of the '{@link #getParameterIndex() <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAMETER_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParameterIndex() <em>Parameter Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterIndex()
	 * @generated
	 * @ordered
	 */
	protected int parameterIndex = PARAMETER_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcreteModel() <em>Concrete Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteModel()
	 * @generated
	 * @ordered
	 */
	protected ParameterModel concreteModel;

	/**
	 * The cached value of the '{@link #getConceptModel() <em>Concept Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptModel()
	 * @generated
	 * @ordered
	 */
	protected ParameterModel conceptModel;

	/**
	 * The cached value of the '{@link #getAppliedBinding() <em>Applied Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedBinding()
	 * @generated
	 * @ordered
	 */
	protected BindingDeclaration appliedBinding;

	/**
	 * The cached value of the '{@link #getTemplateData() <em>Template Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateData()
	 * @generated
	 * @ordered
	 */
	protected TemplateSpecificData templateData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptWithBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInstantiationPackage.Literals.ADAPT_WITH_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParameterIndex() {
		return parameterIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterIndex(int newParameterIndex) {
		int oldParameterIndex = parameterIndex;
		parameterIndex = newParameterIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInstantiationPackage.ADAPT_WITH_BINDING__PARAMETER_INDEX, oldParameterIndex, parameterIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterModel getConcreteModel() {
		if (concreteModel != null && concreteModel.eIsProxy()) {
			InternalEObject oldConcreteModel = (InternalEObject)concreteModel;
			concreteModel = (ParameterModel)eResolveProxy(oldConcreteModel);
			if (concreteModel != oldConcreteModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCRETE_MODEL, oldConcreteModel, concreteModel));
			}
		}
		return concreteModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterModel basicGetConcreteModel() {
		return concreteModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteModel(ParameterModel newConcreteModel) {
		ParameterModel oldConcreteModel = concreteModel;
		concreteModel = newConcreteModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCRETE_MODEL, oldConcreteModel, concreteModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterModel getConceptModel() {
		if (conceptModel != null && conceptModel.eIsProxy()) {
			InternalEObject oldConceptModel = (InternalEObject)conceptModel;
			conceptModel = (ParameterModel)eResolveProxy(oldConceptModel);
			if (conceptModel != oldConceptModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCEPT_MODEL, oldConceptModel, conceptModel));
			}
		}
		return conceptModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterModel basicGetConceptModel() {
		return conceptModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptModel(ParameterModel newConceptModel) {
		ParameterModel oldConceptModel = conceptModel;
		conceptModel = newConceptModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCEPT_MODEL, oldConceptModel, conceptModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDeclaration getAppliedBinding() {
		if (appliedBinding != null && appliedBinding.eIsProxy()) {
			InternalEObject oldAppliedBinding = (InternalEObject)appliedBinding;
			appliedBinding = (BindingDeclaration)eResolveProxy(oldAppliedBinding);
			if (appliedBinding != oldAppliedBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInstantiationPackage.ADAPT_WITH_BINDING__APPLIED_BINDING, oldAppliedBinding, appliedBinding));
			}
		}
		return appliedBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDeclaration basicGetAppliedBinding() {
		return appliedBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedBinding(BindingDeclaration newAppliedBinding) {
		BindingDeclaration oldAppliedBinding = appliedBinding;
		appliedBinding = newAppliedBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInstantiationPackage.ADAPT_WITH_BINDING__APPLIED_BINDING, oldAppliedBinding, appliedBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecificData getTemplateData() {
		return templateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateData(TemplateSpecificData newTemplateData, NotificationChain msgs) {
		TemplateSpecificData oldTemplateData = templateData;
		templateData = newTemplateData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA, oldTemplateData, newTemplateData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateData(TemplateSpecificData newTemplateData) {
		if (newTemplateData != templateData) {
			NotificationChain msgs = null;
			if (templateData != null)
				msgs = ((InternalEObject)templateData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA, null, msgs);
			if (newTemplateData != null)
				msgs = ((InternalEObject)newTemplateData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA, null, msgs);
			msgs = basicSetTemplateData(newTemplateData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA, newTemplateData, newTemplateData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA:
				return basicSetTemplateData(null, msgs);
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
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__PARAMETER_INDEX:
				return getParameterIndex();
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCRETE_MODEL:
				if (resolve) return getConcreteModel();
				return basicGetConcreteModel();
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCEPT_MODEL:
				if (resolve) return getConceptModel();
				return basicGetConceptModel();
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__APPLIED_BINDING:
				if (resolve) return getAppliedBinding();
				return basicGetAppliedBinding();
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA:
				return getTemplateData();
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
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__PARAMETER_INDEX:
				setParameterIndex((Integer)newValue);
				return;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCRETE_MODEL:
				setConcreteModel((ParameterModel)newValue);
				return;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCEPT_MODEL:
				setConceptModel((ParameterModel)newValue);
				return;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__APPLIED_BINDING:
				setAppliedBinding((BindingDeclaration)newValue);
				return;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA:
				setTemplateData((TemplateSpecificData)newValue);
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
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__PARAMETER_INDEX:
				setParameterIndex(PARAMETER_INDEX_EDEFAULT);
				return;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCRETE_MODEL:
				setConcreteModel((ParameterModel)null);
				return;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCEPT_MODEL:
				setConceptModel((ParameterModel)null);
				return;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__APPLIED_BINDING:
				setAppliedBinding((BindingDeclaration)null);
				return;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA:
				setTemplateData((TemplateSpecificData)null);
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
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__PARAMETER_INDEX:
				return parameterIndex != PARAMETER_INDEX_EDEFAULT;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCRETE_MODEL:
				return concreteModel != null;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__CONCEPT_MODEL:
				return conceptModel != null;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__APPLIED_BINDING:
				return appliedBinding != null;
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING__TEMPLATE_DATA:
				return templateData != null;
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
		result.append(" (parameterIndex: ");
		result.append(parameterIndex);
		result.append(')');
		return result.toString();
	}

} //AdaptWithBindingImpl

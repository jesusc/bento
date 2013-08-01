/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.flowcontrol.impl;

import genericity.language.gcomponent.core.BindingDeclaration;
import genericity.language.gcomponent.core.Component;
import genericity.language.gcomponent.core.Concept;
import genericity.language.gcomponent.core.Model;
import genericity.language.gcomponent.flowcontrol.ApplyParameter;
import genericity.language.gcomponent.flowcontrol.FlowcontrolPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.impl.ApplyParameterImpl#getModel <em>Model</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.impl.ApplyParameterImpl#getBoundConceptQualifier <em>Bound Concept Qualifier</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.impl.ApplyParameterImpl#getBoundConcept <em>Bound Concept</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.impl.ApplyParameterImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyParameterImpl extends EObjectImpl implements ApplyParameter {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getBoundConceptQualifier() <em>Bound Concept Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundConceptQualifier()
	 * @generated
	 * @ordered
	 */
	protected Component boundConceptQualifier;

	/**
	 * The cached value of the '{@link #getBoundConcept() <em>Bound Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept boundConcept;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected BindingDeclaration binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowcontrolPackage.Literals.APPLY_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowcontrolPackage.APPLY_PARAMETER__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowcontrolPackage.APPLY_PARAMETER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBoundConceptQualifier() {
		if (boundConceptQualifier != null && boundConceptQualifier.eIsProxy()) {
			InternalEObject oldBoundConceptQualifier = (InternalEObject)boundConceptQualifier;
			boundConceptQualifier = (Component)eResolveProxy(oldBoundConceptQualifier);
			if (boundConceptQualifier != oldBoundConceptQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER, oldBoundConceptQualifier, boundConceptQualifier));
			}
		}
		return boundConceptQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBoundConceptQualifier() {
		return boundConceptQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundConceptQualifier(Component newBoundConceptQualifier) {
		Component oldBoundConceptQualifier = boundConceptQualifier;
		boundConceptQualifier = newBoundConceptQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER, oldBoundConceptQualifier, boundConceptQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getBoundConcept() {
		if (boundConcept != null && boundConcept.eIsProxy()) {
			InternalEObject oldBoundConcept = (InternalEObject)boundConcept;
			boundConcept = (Concept)eResolveProxy(oldBoundConcept);
			if (boundConcept != oldBoundConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT, oldBoundConcept, boundConcept));
			}
		}
		return boundConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetBoundConcept() {
		return boundConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundConcept(Concept newBoundConcept) {
		Concept oldBoundConcept = boundConcept;
		boundConcept = newBoundConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT, oldBoundConcept, boundConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDeclaration getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject)binding;
			binding = (BindingDeclaration)eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowcontrolPackage.APPLY_PARAMETER__BINDING, oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDeclaration basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(BindingDeclaration newBinding) {
		BindingDeclaration oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowcontrolPackage.APPLY_PARAMETER__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowcontrolPackage.APPLY_PARAMETER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER:
				if (resolve) return getBoundConceptQualifier();
				return basicGetBoundConceptQualifier();
			case FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT:
				if (resolve) return getBoundConcept();
				return basicGetBoundConcept();
			case FlowcontrolPackage.APPLY_PARAMETER__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
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
			case FlowcontrolPackage.APPLY_PARAMETER__MODEL:
				setModel((Model)newValue);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER:
				setBoundConceptQualifier((Component)newValue);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT:
				setBoundConcept((Concept)newValue);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__BINDING:
				setBinding((BindingDeclaration)newValue);
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
			case FlowcontrolPackage.APPLY_PARAMETER__MODEL:
				setModel((Model)null);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER:
				setBoundConceptQualifier((Component)null);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT:
				setBoundConcept((Concept)null);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__BINDING:
				setBinding((BindingDeclaration)null);
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
			case FlowcontrolPackage.APPLY_PARAMETER__MODEL:
				return model != null;
			case FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER:
				return boundConceptQualifier != null;
			case FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT:
				return boundConcept != null;
			case FlowcontrolPackage.APPLY_PARAMETER__BINDING:
				return binding != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplyParameterImpl

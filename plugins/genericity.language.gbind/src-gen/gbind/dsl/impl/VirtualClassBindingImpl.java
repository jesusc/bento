/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.ConceptFeatureRef;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.DslPackage;
import gbind.dsl.VirtualClassBinding;
import gbind.dsl.VirtualMetaclass;

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
 * An implementation of the model object '<em><b>Virtual Class Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.impl.VirtualClassBindingImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link gbind.dsl.impl.VirtualClassBindingImpl#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link gbind.dsl.impl.VirtualClassBindingImpl#getRefFeatures <em>Ref Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualClassBindingImpl extends ConceptBindingImpl implements VirtualClassBinding {
	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected ConceptMetaclass concept;

	/**
	 * The cached value of the '{@link #getVirtual() <em>Virtual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtual()
	 * @generated
	 * @ordered
	 */
	protected VirtualMetaclass virtual;

	/**
	 * The cached value of the '{@link #getRefFeatures() <em>Ref Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptFeatureRef> refFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualClassBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.VIRTUAL_CLASS_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass getConcept() {
		if (concept != null && concept.eIsProxy()) {
			InternalEObject oldConcept = (InternalEObject)concept;
			concept = (ConceptMetaclass)eResolveProxy(oldConcept);
			if (concept != oldConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT, oldConcept, concept));
			}
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass basicGetConcept() {
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(ConceptMetaclass newConcept) {
		ConceptMetaclass oldConcept = concept;
		concept = newConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT, oldConcept, concept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMetaclass getVirtual() {
		if (virtual != null && virtual.eIsProxy()) {
			InternalEObject oldVirtual = (InternalEObject)virtual;
			virtual = (VirtualMetaclass)eResolveProxy(oldVirtual);
			if (virtual != oldVirtual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL, oldVirtual, virtual));
			}
		}
		return virtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMetaclass basicGetVirtual() {
		return virtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtual(VirtualMetaclass newVirtual) {
		VirtualMetaclass oldVirtual = virtual;
		virtual = newVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL, oldVirtual, virtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptFeatureRef> getRefFeatures() {
		if (refFeatures == null) {
			refFeatures = new EObjectContainmentEList<ConceptFeatureRef>(ConceptFeatureRef.class, this, DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES);
		}
		return refFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES:
				return ((InternalEList<?>)getRefFeatures()).basicRemove(otherEnd, msgs);
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
			case DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT:
				if (resolve) return getConcept();
				return basicGetConcept();
			case DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL:
				if (resolve) return getVirtual();
				return basicGetVirtual();
			case DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES:
				return getRefFeatures();
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
			case DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT:
				setConcept((ConceptMetaclass)newValue);
				return;
			case DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL:
				setVirtual((VirtualMetaclass)newValue);
				return;
			case DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES:
				getRefFeatures().clear();
				getRefFeatures().addAll((Collection<? extends ConceptFeatureRef>)newValue);
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
			case DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT:
				setConcept((ConceptMetaclass)null);
				return;
			case DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL:
				setVirtual((VirtualMetaclass)null);
				return;
			case DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES:
				getRefFeatures().clear();
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
			case DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT:
				return concept != null;
			case DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL:
				return virtual != null;
			case DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES:
				return refFeatures != null && !refFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualClassBindingImpl

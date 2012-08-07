/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.gbind.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.gbind.BaseFeatureBinding;
import org.emftext.language.gbind.ConceptMetaclass;
import org.emftext.language.gbind.ConcreteMetaclass;
import org.emftext.language.gbind.GbindPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Feature Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.gbind.impl.BaseFeatureBindingImpl#getConceptFeature <em>Concept Feature</em>}</li>
 *   <li>{@link org.emftext.language.gbind.impl.BaseFeatureBindingImpl#getConceptClass <em>Concept Class</em>}</li>
 *   <li>{@link org.emftext.language.gbind.impl.BaseFeatureBindingImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseFeatureBindingImpl extends ConceptBindingImpl implements BaseFeatureBinding {
	/**
	 * The default value of the '{@link #getConceptFeature() <em>Concept Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCEPT_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConceptFeature() <em>Concept Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptFeature()
	 * @generated
	 * @ordered
	 */
	protected String conceptFeature = CONCEPT_FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConceptClass() <em>Concept Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptClass()
	 * @generated
	 * @ordered
	 */
	protected ConceptMetaclass conceptClass;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected ConcreteMetaclass qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseFeatureBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GbindPackage.Literals.BASE_FEATURE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConceptFeature() {
		return conceptFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptFeature(String newConceptFeature) {
		String oldConceptFeature = conceptFeature;
		conceptFeature = newConceptFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GbindPackage.BASE_FEATURE_BINDING__CONCEPT_FEATURE, oldConceptFeature, conceptFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass getConceptClass() {
		if (conceptClass != null && conceptClass.eIsProxy()) {
			InternalEObject oldConceptClass = (InternalEObject)conceptClass;
			conceptClass = (ConceptMetaclass)eResolveProxy(oldConceptClass);
			if (conceptClass != oldConceptClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GbindPackage.BASE_FEATURE_BINDING__CONCEPT_CLASS, oldConceptClass, conceptClass));
			}
		}
		return conceptClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass basicGetConceptClass() {
		return conceptClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptClass(ConceptMetaclass newConceptClass) {
		ConceptMetaclass oldConceptClass = conceptClass;
		conceptClass = newConceptClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GbindPackage.BASE_FEATURE_BINDING__CONCEPT_CLASS, oldConceptClass, conceptClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass getQualifier() {
		if (qualifier != null && qualifier.eIsProxy()) {
			InternalEObject oldQualifier = (InternalEObject)qualifier;
			qualifier = (ConcreteMetaclass)eResolveProxy(oldQualifier);
			if (qualifier != oldQualifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GbindPackage.BASE_FEATURE_BINDING__QUALIFIER, oldQualifier, qualifier));
			}
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass basicGetQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(ConcreteMetaclass newQualifier) {
		ConcreteMetaclass oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GbindPackage.BASE_FEATURE_BINDING__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GbindPackage.BASE_FEATURE_BINDING__CONCEPT_FEATURE:
				return getConceptFeature();
			case GbindPackage.BASE_FEATURE_BINDING__CONCEPT_CLASS:
				if (resolve) return getConceptClass();
				return basicGetConceptClass();
			case GbindPackage.BASE_FEATURE_BINDING__QUALIFIER:
				if (resolve) return getQualifier();
				return basicGetQualifier();
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
			case GbindPackage.BASE_FEATURE_BINDING__CONCEPT_FEATURE:
				setConceptFeature((String)newValue);
				return;
			case GbindPackage.BASE_FEATURE_BINDING__CONCEPT_CLASS:
				setConceptClass((ConceptMetaclass)newValue);
				return;
			case GbindPackage.BASE_FEATURE_BINDING__QUALIFIER:
				setQualifier((ConcreteMetaclass)newValue);
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
			case GbindPackage.BASE_FEATURE_BINDING__CONCEPT_FEATURE:
				setConceptFeature(CONCEPT_FEATURE_EDEFAULT);
				return;
			case GbindPackage.BASE_FEATURE_BINDING__CONCEPT_CLASS:
				setConceptClass((ConceptMetaclass)null);
				return;
			case GbindPackage.BASE_FEATURE_BINDING__QUALIFIER:
				setQualifier((ConcreteMetaclass)null);
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
			case GbindPackage.BASE_FEATURE_BINDING__CONCEPT_FEATURE:
				return CONCEPT_FEATURE_EDEFAULT == null ? conceptFeature != null : !CONCEPT_FEATURE_EDEFAULT.equals(conceptFeature);
			case GbindPackage.BASE_FEATURE_BINDING__CONCEPT_CLASS:
				return conceptClass != null;
			case GbindPackage.BASE_FEATURE_BINDING__QUALIFIER:
				return qualifier != null;
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
		result.append(" (conceptFeature: ");
		result.append(conceptFeature);
		result.append(')');
		return result.toString();
	}

} //BaseFeatureBindingImpl

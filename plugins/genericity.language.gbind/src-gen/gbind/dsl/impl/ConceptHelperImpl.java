/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.ConceptHelper;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.DslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.impl.ConceptHelperImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link gbind.dsl.impl.ConceptHelperImpl#getContextClass <em>Context Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptHelperImpl extends BaseHelperImpl implements ConceptHelper {
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
	 * The cached value of the '{@link #getContextClass() <em>Context Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextClass()
	 * @generated
	 * @ordered
	 */
	protected ConceptMetaclass contextClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.CONCEPT_HELPER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.CONCEPT_HELPER__QUALIFIER, oldQualifier, qualifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONCEPT_HELPER__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass getContextClass() {
		if (contextClass != null && contextClass.eIsProxy()) {
			InternalEObject oldContextClass = (InternalEObject)contextClass;
			contextClass = (ConceptMetaclass)eResolveProxy(oldContextClass);
			if (contextClass != oldContextClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.CONCEPT_HELPER__CONTEXT_CLASS, oldContextClass, contextClass));
			}
		}
		return contextClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass basicGetContextClass() {
		return contextClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextClass(ConceptMetaclass newContextClass) {
		ConceptMetaclass oldContextClass = contextClass;
		contextClass = newContextClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONCEPT_HELPER__CONTEXT_CLASS, oldContextClass, contextClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.CONCEPT_HELPER__QUALIFIER:
				if (resolve) return getQualifier();
				return basicGetQualifier();
			case DslPackage.CONCEPT_HELPER__CONTEXT_CLASS:
				if (resolve) return getContextClass();
				return basicGetContextClass();
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
			case DslPackage.CONCEPT_HELPER__QUALIFIER:
				setQualifier((ConcreteMetaclass)newValue);
				return;
			case DslPackage.CONCEPT_HELPER__CONTEXT_CLASS:
				setContextClass((ConceptMetaclass)newValue);
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
			case DslPackage.CONCEPT_HELPER__QUALIFIER:
				setQualifier((ConcreteMetaclass)null);
				return;
			case DslPackage.CONCEPT_HELPER__CONTEXT_CLASS:
				setContextClass((ConceptMetaclass)null);
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
			case DslPackage.CONCEPT_HELPER__QUALIFIER:
				return qualifier != null;
			case DslPackage.CONCEPT_HELPER__CONTEXT_CLASS:
				return contextClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptHelperImpl

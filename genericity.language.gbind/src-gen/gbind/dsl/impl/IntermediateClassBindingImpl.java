/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.DslPackage;
import gbind.dsl.IntermediateClassBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Class Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConcreteSource <em>Concrete Source</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConcreteReferenceSource <em>Concrete Reference Source</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConcreteTarget <em>Concrete Target</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConcreteReferenceTarget <em>Concrete Reference Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntermediateClassBindingImpl extends ConceptBindingImpl implements IntermediateClassBinding {
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
	 * The cached value of the '{@link #getConcreteSource() <em>Concrete Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteSource()
	 * @generated
	 * @ordered
	 */
	protected ConcreteMetaclass concreteSource;

	/**
	 * The default value of the '{@link #getConcreteReferenceSource() <em>Concrete Reference Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteReferenceSource()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCRETE_REFERENCE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcreteReferenceSource() <em>Concrete Reference Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteReferenceSource()
	 * @generated
	 * @ordered
	 */
	protected String concreteReferenceSource = CONCRETE_REFERENCE_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcreteTarget() <em>Concrete Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteTarget()
	 * @generated
	 * @ordered
	 */
	protected ConcreteMetaclass concreteTarget;

	/**
	 * The default value of the '{@link #getConcreteReferenceTarget() <em>Concrete Reference Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteReferenceTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCRETE_REFERENCE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcreteReferenceTarget() <em>Concrete Reference Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteReferenceTarget()
	 * @generated
	 * @ordered
	 */
	protected String concreteReferenceTarget = CONCRETE_REFERENCE_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateClassBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.INTERMEDIATE_CLASS_BINDING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT, oldConcept, concept));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT, oldConcept, concept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass getConcreteSource() {
		if (concreteSource != null && concreteSource.eIsProxy()) {
			InternalEObject oldConcreteSource = (InternalEObject)concreteSource;
			concreteSource = (ConcreteMetaclass)eResolveProxy(oldConcreteSource);
			if (concreteSource != oldConcreteSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_SOURCE, oldConcreteSource, concreteSource));
			}
		}
		return concreteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass basicGetConcreteSource() {
		return concreteSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteSource(ConcreteMetaclass newConcreteSource) {
		ConcreteMetaclass oldConcreteSource = concreteSource;
		concreteSource = newConcreteSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_SOURCE, oldConcreteSource, concreteSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcreteReferenceSource() {
		return concreteReferenceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteReferenceSource(String newConcreteReferenceSource) {
		String oldConcreteReferenceSource = concreteReferenceSource;
		concreteReferenceSource = newConcreteReferenceSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_SOURCE, oldConcreteReferenceSource, concreteReferenceSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass getConcreteTarget() {
		if (concreteTarget != null && concreteTarget.eIsProxy()) {
			InternalEObject oldConcreteTarget = (InternalEObject)concreteTarget;
			concreteTarget = (ConcreteMetaclass)eResolveProxy(oldConcreteTarget);
			if (concreteTarget != oldConcreteTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_TARGET, oldConcreteTarget, concreteTarget));
			}
		}
		return concreteTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass basicGetConcreteTarget() {
		return concreteTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteTarget(ConcreteMetaclass newConcreteTarget) {
		ConcreteMetaclass oldConcreteTarget = concreteTarget;
		concreteTarget = newConcreteTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_TARGET, oldConcreteTarget, concreteTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcreteReferenceTarget() {
		return concreteReferenceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteReferenceTarget(String newConcreteReferenceTarget) {
		String oldConcreteReferenceTarget = concreteReferenceTarget;
		concreteReferenceTarget = newConcreteReferenceTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_TARGET, oldConcreteReferenceTarget, concreteReferenceTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT:
				if (resolve) return getConcept();
				return basicGetConcept();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_SOURCE:
				if (resolve) return getConcreteSource();
				return basicGetConcreteSource();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_SOURCE:
				return getConcreteReferenceSource();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_TARGET:
				if (resolve) return getConcreteTarget();
				return basicGetConcreteTarget();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_TARGET:
				return getConcreteReferenceTarget();
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
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT:
				setConcept((ConceptMetaclass)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_SOURCE:
				setConcreteSource((ConcreteMetaclass)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_SOURCE:
				setConcreteReferenceSource((String)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_TARGET:
				setConcreteTarget((ConcreteMetaclass)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_TARGET:
				setConcreteReferenceTarget((String)newValue);
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
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT:
				setConcept((ConceptMetaclass)null);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_SOURCE:
				setConcreteSource((ConcreteMetaclass)null);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_SOURCE:
				setConcreteReferenceSource(CONCRETE_REFERENCE_SOURCE_EDEFAULT);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_TARGET:
				setConcreteTarget((ConcreteMetaclass)null);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_TARGET:
				setConcreteReferenceTarget(CONCRETE_REFERENCE_TARGET_EDEFAULT);
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
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT:
				return concept != null;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_SOURCE:
				return concreteSource != null;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_SOURCE:
				return CONCRETE_REFERENCE_SOURCE_EDEFAULT == null ? concreteReferenceSource != null : !CONCRETE_REFERENCE_SOURCE_EDEFAULT.equals(concreteReferenceSource);
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_TARGET:
				return concreteTarget != null;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_TARGET:
				return CONCRETE_REFERENCE_TARGET_EDEFAULT == null ? concreteReferenceTarget != null : !CONCRETE_REFERENCE_TARGET_EDEFAULT.equals(concreteReferenceTarget);
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
		result.append(" (concreteReferenceSource: ");
		result.append(concreteReferenceSource);
		result.append(", concreteReferenceTarget: ");
		result.append(concreteReferenceTarget);
		result.append(')');
		return result.toString();
	}

} //IntermediateClassBindingImpl

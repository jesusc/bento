/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.ConcreteReferencDeclaringVar;
import gbind.dsl.DslPackage;
import gbind.dsl.IntermediateClassBinding;

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
 * An implementation of the model object '<em><b>Intermediate Class Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConcreteClass <em>Concrete Class</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConcreteReference <em>Concrete Reference</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConceptContext <em>Concept Context</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getConceptReferenceName <em>Concept Reference Name</em>}</li>
 *   <li>{@link gbind.dsl.impl.IntermediateClassBindingImpl#getFeatureBindings <em>Feature Bindings</em>}</li>
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
	 * The cached value of the '{@link #getConcreteClass() <em>Concrete Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteClass()
	 * @generated
	 * @ordered
	 */
	protected ConcreteMetaclass concreteClass;

	/**
	 * The cached value of the '{@link #getConcreteReference() <em>Concrete Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteReference()
	 * @generated
	 * @ordered
	 */
	protected ConcreteReferencDeclaringVar concreteReference;

	/**
	 * The cached value of the '{@link #getConceptContext() <em>Concept Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptContext()
	 * @generated
	 * @ordered
	 */
	protected ConceptMetaclass conceptContext;

	/**
	 * The default value of the '{@link #getConceptReferenceName() <em>Concept Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCEPT_REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConceptReferenceName() <em>Concept Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String conceptReferenceName = CONCEPT_REFERENCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureBindings() <em>Feature Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseFeatureBinding> featureBindings;

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
	public ConcreteMetaclass getConcreteClass() {
		if (concreteClass != null && concreteClass.eIsProxy()) {
			InternalEObject oldConcreteClass = (InternalEObject)concreteClass;
			concreteClass = (ConcreteMetaclass)eResolveProxy(oldConcreteClass);
			if (concreteClass != oldConcreteClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS, oldConcreteClass, concreteClass));
			}
		}
		return concreteClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass basicGetConcreteClass() {
		return concreteClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteClass(ConcreteMetaclass newConcreteClass) {
		ConcreteMetaclass oldConcreteClass = concreteClass;
		concreteClass = newConcreteClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS, oldConcreteClass, concreteClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteReferencDeclaringVar getConcreteReference() {
		return concreteReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcreteReference(ConcreteReferencDeclaringVar newConcreteReference, NotificationChain msgs) {
		ConcreteReferencDeclaringVar oldConcreteReference = concreteReference;
		concreteReference = newConcreteReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE, oldConcreteReference, newConcreteReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteReference(ConcreteReferencDeclaringVar newConcreteReference) {
		if (newConcreteReference != concreteReference) {
			NotificationChain msgs = null;
			if (concreteReference != null)
				msgs = ((InternalEObject)concreteReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE, null, msgs);
			if (newConcreteReference != null)
				msgs = ((InternalEObject)newConcreteReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE, null, msgs);
			msgs = basicSetConcreteReference(newConcreteReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE, newConcreteReference, newConcreteReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass getConceptContext() {
		if (conceptContext != null && conceptContext.eIsProxy()) {
			InternalEObject oldConceptContext = (InternalEObject)conceptContext;
			conceptContext = (ConceptMetaclass)eResolveProxy(oldConceptContext);
			if (conceptContext != oldConceptContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT, oldConceptContext, conceptContext));
			}
		}
		return conceptContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass basicGetConceptContext() {
		return conceptContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptContext(ConceptMetaclass newConceptContext) {
		ConceptMetaclass oldConceptContext = conceptContext;
		conceptContext = newConceptContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT, oldConceptContext, conceptContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConceptReferenceName() {
		return conceptReferenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptReferenceName(String newConceptReferenceName) {
		String oldConceptReferenceName = conceptReferenceName;
		conceptReferenceName = newConceptReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME, oldConceptReferenceName, conceptReferenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseFeatureBinding> getFeatureBindings() {
		if (featureBindings == null) {
			featureBindings = new EObjectContainmentEList<BaseFeatureBinding>(BaseFeatureBinding.class, this, DslPackage.INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS);
		}
		return featureBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE:
				return basicSetConcreteReference(null, msgs);
			case DslPackage.INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS:
				return ((InternalEList<?>)getFeatureBindings()).basicRemove(otherEnd, msgs);
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
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT:
				if (resolve) return getConcept();
				return basicGetConcept();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS:
				if (resolve) return getConcreteClass();
				return basicGetConcreteClass();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE:
				return getConcreteReference();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT:
				if (resolve) return getConceptContext();
				return basicGetConceptContext();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME:
				return getConceptReferenceName();
			case DslPackage.INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS:
				return getFeatureBindings();
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
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT:
				setConcept((ConceptMetaclass)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS:
				setConcreteClass((ConcreteMetaclass)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE:
				setConcreteReference((ConcreteReferencDeclaringVar)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT:
				setConceptContext((ConceptMetaclass)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME:
				setConceptReferenceName((String)newValue);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS:
				getFeatureBindings().clear();
				getFeatureBindings().addAll((Collection<? extends BaseFeatureBinding>)newValue);
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
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS:
				setConcreteClass((ConcreteMetaclass)null);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE:
				setConcreteReference((ConcreteReferencDeclaringVar)null);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT:
				setConceptContext((ConceptMetaclass)null);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME:
				setConceptReferenceName(CONCEPT_REFERENCE_NAME_EDEFAULT);
				return;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS:
				getFeatureBindings().clear();
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
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS:
				return concreteClass != null;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE:
				return concreteReference != null;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT:
				return conceptContext != null;
			case DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME:
				return CONCEPT_REFERENCE_NAME_EDEFAULT == null ? conceptReferenceName != null : !CONCEPT_REFERENCE_NAME_EDEFAULT.equals(conceptReferenceName);
			case DslPackage.INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS:
				return featureBindings != null && !featureBindings.isEmpty();
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
		result.append(" (conceptReferenceName: ");
		result.append(conceptReferenceName);
		result.append(')');
		return result.toString();
	}

} //IntermediateClassBindingImpl

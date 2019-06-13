/**
 */
package sequence_bdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sequence_bdsl.Element;
import sequence_bdsl.FeatureClass;
import sequence_bdsl.IntemediateElement;
import sequence_bdsl.MetamodelElement;
import sequence_bdsl.SequenceModel;
import sequence_bdsl.Sequence_bdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsFeatureClass <em>Contains Feature Class</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceModelImpl extends MinimalEObjectImpl.Container implements SequenceModel {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getContainsMetamodelElement() <em>Contains Metamodel Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsMetamodelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelElement> containsMetamodelElement;

	/**
	 * The cached value of the '{@link #getContainsIntermediateElement() <em>Contains Intermediate Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsIntermediateElement()
	 * @generated
	 * @ordered
	 */
	protected EList<IntemediateElement> containsIntermediateElement;

	/**
	 * The cached value of the '{@link #getContainsFeatureClass() <em>Contains Feature Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsFeatureClass()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureClass> containsFeatureClass;

	/**
	 * The cached value of the '{@link #getContainsMetamodelElementFeature() <em>Contains Metamodel Element Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsMetamodelElementFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureClass> containsMetamodelElementFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_bdslPackage.Literals.SEQUENCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetamodelElement> getContainsMetamodelElement() {
		if (containsMetamodelElement == null) {
			containsMetamodelElement = new EObjectContainmentEList<MetamodelElement>(MetamodelElement.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT);
		}
		return containsMetamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntemediateElement> getContainsIntermediateElement() {
		if (containsIntermediateElement == null) {
			containsIntermediateElement = new EObjectContainmentEList<IntemediateElement>(IntemediateElement.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT);
		}
		return containsIntermediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureClass> getContainsFeatureClass() {
		if (containsFeatureClass == null) {
			containsFeatureClass = new EObjectContainmentEList<FeatureClass>(FeatureClass.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS);
		}
		return containsFeatureClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureClass> getContainsMetamodelElementFeature() {
		if (containsMetamodelElementFeature == null) {
			containsMetamodelElementFeature = new EObjectContainmentEList<FeatureClass>(FeatureClass.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		}
		return containsMetamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sequence_bdslPackage.SEQUENCE_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return ((InternalEList<?>)getContainsMetamodelElement()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return ((InternalEList<?>)getContainsIntermediateElement()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS:
				return ((InternalEList<?>)getContainsFeatureClass()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return ((InternalEList<?>)getContainsMetamodelElementFeature()).basicRemove(otherEnd, msgs);
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__ELEMENTS:
				return getElements();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return getContainsMetamodelElement();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return getContainsIntermediateElement();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS:
				return getContainsFeatureClass();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return getContainsMetamodelElementFeature();
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				getContainsMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				getContainsIntermediateElement().addAll((Collection<? extends IntemediateElement>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS:
				getContainsFeatureClass().clear();
				getContainsFeatureClass().addAll((Collection<? extends FeatureClass>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				getContainsMetamodelElementFeature().addAll((Collection<? extends FeatureClass>)newValue);
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__ELEMENTS:
				getElements().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS:
				getContainsFeatureClass().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return containsMetamodelElement != null && !containsMetamodelElement.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return containsIntermediateElement != null && !containsIntermediateElement.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS:
				return containsFeatureClass != null && !containsFeatureClass.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return containsMetamodelElementFeature != null && !containsMetamodelElementFeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceModelImpl

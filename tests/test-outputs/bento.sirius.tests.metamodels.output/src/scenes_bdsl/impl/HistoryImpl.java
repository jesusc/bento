/**
 */
package scenes_bdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenes_bdsl.Element;
import scenes_bdsl.FeatureClass;
import scenes_bdsl.History;
import scenes_bdsl.IntemediateElement;
import scenes_bdsl.MetamodelElement;
import scenes_bdsl.Scene;
import scenes_bdsl.Scenes_bdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.impl.HistoryImpl#getScenes <em>Scenes</em>}</li>
 *   <li>{@link scenes_bdsl.impl.HistoryImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link scenes_bdsl.impl.HistoryImpl#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link scenes_bdsl.impl.HistoryImpl#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link scenes_bdsl.impl.HistoryImpl#getContainsFeatureClass <em>Contains Feature Class</em>}</li>
 *   <li>{@link scenes_bdsl.impl.HistoryImpl#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryImpl extends MinimalEObjectImpl.Container implements History {
	/**
	 * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> scenes;

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
	protected HistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenes_bdslPackage.Literals.HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scene> getScenes() {
		if (scenes == null) {
			scenes = new EObjectContainmentEList<Scene>(Scene.class, this, Scenes_bdslPackage.HISTORY__SCENES);
		}
		return scenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, Scenes_bdslPackage.HISTORY__ELEMENTS);
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
			containsMetamodelElement = new EObjectContainmentEList<MetamodelElement>(MetamodelElement.class, this, Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT);
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
			containsIntermediateElement = new EObjectContainmentEList<IntemediateElement>(IntemediateElement.class, this, Scenes_bdslPackage.HISTORY__CONTAINS_INTERMEDIATE_ELEMENT);
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
			containsFeatureClass = new EObjectContainmentEList<FeatureClass>(FeatureClass.class, this, Scenes_bdslPackage.HISTORY__CONTAINS_FEATURE_CLASS);
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
			containsMetamodelElementFeature = new EObjectContainmentEList<FeatureClass>(FeatureClass.class, this, Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE);
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
			case Scenes_bdslPackage.HISTORY__SCENES:
				return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
			case Scenes_bdslPackage.HISTORY__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT:
				return ((InternalEList<?>)getContainsMetamodelElement()).basicRemove(otherEnd, msgs);
			case Scenes_bdslPackage.HISTORY__CONTAINS_INTERMEDIATE_ELEMENT:
				return ((InternalEList<?>)getContainsIntermediateElement()).basicRemove(otherEnd, msgs);
			case Scenes_bdslPackage.HISTORY__CONTAINS_FEATURE_CLASS:
				return ((InternalEList<?>)getContainsFeatureClass()).basicRemove(otherEnd, msgs);
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE:
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
			case Scenes_bdslPackage.HISTORY__SCENES:
				return getScenes();
			case Scenes_bdslPackage.HISTORY__ELEMENTS:
				return getElements();
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT:
				return getContainsMetamodelElement();
			case Scenes_bdslPackage.HISTORY__CONTAINS_INTERMEDIATE_ELEMENT:
				return getContainsIntermediateElement();
			case Scenes_bdslPackage.HISTORY__CONTAINS_FEATURE_CLASS:
				return getContainsFeatureClass();
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE:
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
			case Scenes_bdslPackage.HISTORY__SCENES:
				getScenes().clear();
				getScenes().addAll((Collection<? extends Scene>)newValue);
				return;
			case Scenes_bdslPackage.HISTORY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				getContainsMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Scenes_bdslPackage.HISTORY__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				getContainsIntermediateElement().addAll((Collection<? extends IntemediateElement>)newValue);
				return;
			case Scenes_bdslPackage.HISTORY__CONTAINS_FEATURE_CLASS:
				getContainsFeatureClass().clear();
				getContainsFeatureClass().addAll((Collection<? extends FeatureClass>)newValue);
				return;
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE:
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
			case Scenes_bdslPackage.HISTORY__SCENES:
				getScenes().clear();
				return;
			case Scenes_bdslPackage.HISTORY__ELEMENTS:
				getElements().clear();
				return;
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				return;
			case Scenes_bdslPackage.HISTORY__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				return;
			case Scenes_bdslPackage.HISTORY__CONTAINS_FEATURE_CLASS:
				getContainsFeatureClass().clear();
				return;
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE:
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
			case Scenes_bdslPackage.HISTORY__SCENES:
				return scenes != null && !scenes.isEmpty();
			case Scenes_bdslPackage.HISTORY__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT:
				return containsMetamodelElement != null && !containsMetamodelElement.isEmpty();
			case Scenes_bdslPackage.HISTORY__CONTAINS_INTERMEDIATE_ELEMENT:
				return containsIntermediateElement != null && !containsIntermediateElement.isEmpty();
			case Scenes_bdslPackage.HISTORY__CONTAINS_FEATURE_CLASS:
				return containsFeatureClass != null && !containsFeatureClass.isEmpty();
			case Scenes_bdslPackage.HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return containsMetamodelElementFeature != null && !containsMetamodelElementFeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HistoryImpl

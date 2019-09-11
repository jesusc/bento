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

import sequence_bdsl.BindingAttribute;
import sequence_bdsl.BindingElement;
import sequence_bdsl.Element;
import sequence_bdsl.IntermediateElement;
import sequence_bdsl.MetamodelElement;
import sequence_bdsl.MetamodelElementFeature;
import sequence_bdsl.NoneElement;
import sequence_bdsl.SequenceModel;
import sequence_bdsl.Sequence_bdslPackage;
import sequence_bdsl.VirtualAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link sequence_bdsl.impl.SequenceModelImpl#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
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
	 * The cached value of the '{@link #getContainsNoneElement() <em>Contains None Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsNoneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NoneElement> containsNoneElement;

	/**
	 * The cached value of the '{@link #getContainsBindingElement() <em>Contains Binding Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsBindingElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingElement> containsBindingElement;

	/**
	 * The cached value of the '{@link #getContainsIntermediateElement() <em>Contains Intermediate Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsIntermediateElement()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermediateElement> containsIntermediateElement;

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
	 * The cached value of the '{@link #getContainsMetamodelElementFeature() <em>Contains Metamodel Element Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsMetamodelElementFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelElementFeature> containsMetamodelElementFeature;

	/**
	 * The cached value of the '{@link #getContainsBindingAttribute() <em>Contains Binding Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsBindingAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingAttribute> containsBindingAttribute;

	/**
	 * The cached value of the '{@link #getContainsVirtualAttribute() <em>Contains Virtual Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsVirtualAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualAttribute> containsVirtualAttribute;

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
	public EList<NoneElement> getContainsNoneElement() {
		if (containsNoneElement == null) {
			containsNoneElement = new EObjectContainmentEList<NoneElement>(NoneElement.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_NONE_ELEMENT);
		}
		return containsNoneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingElement> getContainsBindingElement() {
		if (containsBindingElement == null) {
			containsBindingElement = new EObjectContainmentEList<BindingElement>(BindingElement.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ELEMENT);
		}
		return containsBindingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntermediateElement> getContainsIntermediateElement() {
		if (containsIntermediateElement == null) {
			containsIntermediateElement = new EObjectContainmentEList<IntermediateElement>(IntermediateElement.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT);
		}
		return containsIntermediateElement;
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
	public EList<MetamodelElementFeature> getContainsMetamodelElementFeature() {
		if (containsMetamodelElementFeature == null) {
			containsMetamodelElementFeature = new EObjectContainmentEList<MetamodelElementFeature>(MetamodelElementFeature.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		}
		return containsMetamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingAttribute> getContainsBindingAttribute() {
		if (containsBindingAttribute == null) {
			containsBindingAttribute = new EObjectContainmentEList<BindingAttribute>(BindingAttribute.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ATTRIBUTE);
		}
		return containsBindingAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualAttribute> getContainsVirtualAttribute() {
		if (containsVirtualAttribute == null) {
			containsVirtualAttribute = new EObjectContainmentEList<VirtualAttribute>(VirtualAttribute.class, this, Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE);
		}
		return containsVirtualAttribute;
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_NONE_ELEMENT:
				return ((InternalEList<?>)getContainsNoneElement()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ELEMENT:
				return ((InternalEList<?>)getContainsBindingElement()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return ((InternalEList<?>)getContainsIntermediateElement()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return ((InternalEList<?>)getContainsMetamodelElement()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return ((InternalEList<?>)getContainsMetamodelElementFeature()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return ((InternalEList<?>)getContainsBindingAttribute()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return ((InternalEList<?>)getContainsVirtualAttribute()).basicRemove(otherEnd, msgs);
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_NONE_ELEMENT:
				return getContainsNoneElement();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ELEMENT:
				return getContainsBindingElement();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return getContainsIntermediateElement();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return getContainsMetamodelElement();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return getContainsMetamodelElementFeature();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return getContainsBindingAttribute();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return getContainsVirtualAttribute();
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				getContainsNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				getContainsBindingElement().addAll((Collection<? extends BindingElement>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				getContainsIntermediateElement().addAll((Collection<? extends IntermediateElement>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				getContainsMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				getContainsMetamodelElementFeature().addAll((Collection<? extends MetamodelElementFeature>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				getContainsBindingAttribute().addAll((Collection<? extends BindingAttribute>)newValue);
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
				getContainsVirtualAttribute().addAll((Collection<? extends VirtualAttribute>)newValue);
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				return;
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
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
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_NONE_ELEMENT:
				return containsNoneElement != null && !containsNoneElement.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ELEMENT:
				return containsBindingElement != null && !containsBindingElement.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return containsIntermediateElement != null && !containsIntermediateElement.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return containsMetamodelElement != null && !containsMetamodelElement.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return containsMetamodelElementFeature != null && !containsMetamodelElementFeature.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return containsBindingAttribute != null && !containsBindingAttribute.isEmpty();
			case Sequence_bdslPackage.SEQUENCE_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return containsVirtualAttribute != null && !containsVirtualAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceModelImpl

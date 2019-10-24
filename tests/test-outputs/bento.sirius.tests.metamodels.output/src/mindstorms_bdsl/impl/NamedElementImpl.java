/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingAttribute;
import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.IntermediateElement;
import mindstorms_bdsl.MetamodelElement;
import mindstorms_bdsl.MetamodelElementFeature;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NamedElement;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.VirtualAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.NamedElementImpl#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.NamedElementImpl#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.NamedElementImpl#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.NamedElementImpl#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.NamedElementImpl#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.NamedElementImpl#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.NamedElementImpl#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl extends MinimalEObjectImpl.Container implements NamedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getContainsNoneElement() {
		if (containsNoneElement == null) {
			containsNoneElement = new EObjectContainmentEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_NONE_ELEMENT);
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
			containsBindingElement = new EObjectContainmentEList<BindingElement>(BindingElement.class, this, Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT);
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
			containsIntermediateElement = new EObjectContainmentEList<IntermediateElement>(IntermediateElement.class, this, Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT);
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
			containsMetamodelElement = new EObjectContainmentEList<MetamodelElement>(MetamodelElement.class, this, Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT);
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
			containsMetamodelElementFeature = new EObjectContainmentEList<MetamodelElementFeature>(MetamodelElementFeature.class, this, Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE);
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
			containsBindingAttribute = new EObjectContainmentEList<BindingAttribute>(BindingAttribute.class, this, Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE);
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
			containsVirtualAttribute = new EObjectContainmentEList<VirtualAttribute>(VirtualAttribute.class, this, Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE);
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
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_NONE_ELEMENT:
				return ((InternalEList<?>)getContainsNoneElement()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT:
				return ((InternalEList<?>)getContainsBindingElement()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT:
				return ((InternalEList<?>)getContainsIntermediateElement()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT:
				return ((InternalEList<?>)getContainsMetamodelElement()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return ((InternalEList<?>)getContainsMetamodelElementFeature()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE:
				return ((InternalEList<?>)getContainsBindingAttribute()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE:
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
			case Mindstorms_bdslPackage.NAMED_ELEMENT__NAME:
				return getName();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_NONE_ELEMENT:
				return getContainsNoneElement();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT:
				return getContainsBindingElement();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT:
				return getContainsIntermediateElement();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT:
				return getContainsMetamodelElement();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return getContainsMetamodelElementFeature();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE:
				return getContainsBindingAttribute();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE:
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
			case Mindstorms_bdslPackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				getContainsNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				getContainsBindingElement().addAll((Collection<? extends BindingElement>)newValue);
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				getContainsIntermediateElement().addAll((Collection<? extends IntermediateElement>)newValue);
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				getContainsMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				getContainsMetamodelElementFeature().addAll((Collection<? extends MetamodelElementFeature>)newValue);
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				getContainsBindingAttribute().addAll((Collection<? extends BindingAttribute>)newValue);
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE:
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
			case Mindstorms_bdslPackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				return;
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE:
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
			case Mindstorms_bdslPackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_NONE_ELEMENT:
				return containsNoneElement != null && !containsNoneElement.isEmpty();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT:
				return containsBindingElement != null && !containsBindingElement.isEmpty();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT:
				return containsIntermediateElement != null && !containsIntermediateElement.isEmpty();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT:
				return containsMetamodelElement != null && !containsMetamodelElement.isEmpty();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return containsMetamodelElementFeature != null && !containsMetamodelElementFeature.isEmpty();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE:
				return containsBindingAttribute != null && !containsBindingAttribute.isEmpty();
			case Mindstorms_bdslPackage.NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE:
				return containsVirtualAttribute != null && !containsVirtualAttribute.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl

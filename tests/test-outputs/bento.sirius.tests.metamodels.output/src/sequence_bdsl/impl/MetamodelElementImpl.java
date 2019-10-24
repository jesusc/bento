/**
 */
package sequence_bdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sequence_bdsl.MetamodelElement;
import sequence_bdsl.MetamodelElementFeature;
import sequence_bdsl.Sequence_bdslPackage;
import sequence_bdsl.VirtualAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.impl.MetamodelElementImpl#getVirtualAttribute <em>Virtual Attribute</em>}</li>
 *   <li>{@link sequence_bdsl.impl.MetamodelElementImpl#getMetamodelElementFeature <em>Metamodel Element Feature</em>}</li>
 *   <li>{@link sequence_bdsl.impl.MetamodelElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelElementImpl extends MinimalEObjectImpl.Container implements MetamodelElement {
	/**
	 * The cached value of the '{@link #getVirtualAttribute() <em>Virtual Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualAttribute> virtualAttribute;

	/**
	 * The cached value of the '{@link #getMetamodelElementFeature() <em>Metamodel Element Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelElementFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelElementFeature> metamodelElementFeature;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_bdslPackage.Literals.METAMODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualAttribute> getVirtualAttribute() {
		if (virtualAttribute == null) {
			virtualAttribute = new EObjectContainmentEList<VirtualAttribute>(VirtualAttribute.class, this, Sequence_bdslPackage.METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE);
		}
		return virtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetamodelElementFeature> getMetamodelElementFeature() {
		if (metamodelElementFeature == null) {
			metamodelElementFeature = new EObjectContainmentEList<MetamodelElementFeature>(MetamodelElementFeature.class, this, Sequence_bdslPackage.METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE);
		}
		return metamodelElementFeature;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_bdslPackage.METAMODEL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sequence_bdslPackage.METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE:
				return ((InternalEList<?>)getVirtualAttribute()).basicRemove(otherEnd, msgs);
			case Sequence_bdslPackage.METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE:
				return ((InternalEList<?>)getMetamodelElementFeature()).basicRemove(otherEnd, msgs);
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
			case Sequence_bdslPackage.METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE:
				return getVirtualAttribute();
			case Sequence_bdslPackage.METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE:
				return getMetamodelElementFeature();
			case Sequence_bdslPackage.METAMODEL_ELEMENT__NAME:
				return getName();
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
			case Sequence_bdslPackage.METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE:
				getVirtualAttribute().clear();
				getVirtualAttribute().addAll((Collection<? extends VirtualAttribute>)newValue);
				return;
			case Sequence_bdslPackage.METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE:
				getMetamodelElementFeature().clear();
				getMetamodelElementFeature().addAll((Collection<? extends MetamodelElementFeature>)newValue);
				return;
			case Sequence_bdslPackage.METAMODEL_ELEMENT__NAME:
				setName((String)newValue);
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
			case Sequence_bdslPackage.METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE:
				getVirtualAttribute().clear();
				return;
			case Sequence_bdslPackage.METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE:
				getMetamodelElementFeature().clear();
				return;
			case Sequence_bdslPackage.METAMODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case Sequence_bdslPackage.METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE:
				return virtualAttribute != null && !virtualAttribute.isEmpty();
			case Sequence_bdslPackage.METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE:
				return metamodelElementFeature != null && !metamodelElementFeature.isEmpty();
			case Sequence_bdslPackage.METAMODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //MetamodelElementImpl

/**
 */
package sequence_bdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sequence_bdsl.FeatureClass;
import sequence_bdsl.MetamodelElementFeature;
import sequence_bdsl.Sequence_bdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Element Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.impl.MetamodelElementFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link sequence_bdsl.impl.MetamodelElementFeatureImpl#getFeatureClass <em>Feature Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelElementFeatureImpl extends MinimalEObjectImpl.Container implements MetamodelElementFeature {
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
	 * The cached value of the '{@link #getFeatureClass() <em>Feature Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureClass()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureClass> featureClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelElementFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_bdslPackage.Literals.METAMODEL_ELEMENT_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureClass> getFeatureClass() {
		if (featureClass == null) {
			featureClass = new EObjectResolvingEList<FeatureClass>(FeatureClass.class, this, Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS);
		}
		return featureClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME:
				return getName();
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS:
				return getFeatureClass();
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
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME:
				setName((String)newValue);
				return;
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS:
				getFeatureClass().clear();
				getFeatureClass().addAll((Collection<? extends FeatureClass>)newValue);
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
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS:
				getFeatureClass().clear();
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
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS:
				return featureClass != null && !featureClass.isEmpty();
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

} //MetamodelElementFeatureImpl

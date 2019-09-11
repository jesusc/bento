/**
 */
package workflow_bdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import workflow_bdsl.BindingAttribute;
import workflow_bdsl.MetamodelElementFeature;
import workflow_bdsl.Workflow_bdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Element Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow_bdsl.impl.MetamodelElementFeatureImpl#getFeatureClass <em>Feature Class</em>}</li>
 *   <li>{@link workflow_bdsl.impl.MetamodelElementFeatureImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelElementFeatureImpl extends MinimalEObjectImpl.Container implements MetamodelElementFeature {
	/**
	 * The cached value of the '{@link #getFeatureClass() <em>Feature Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureClass()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingAttribute> featureClass;

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
		return Workflow_bdslPackage.Literals.METAMODEL_ELEMENT_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingAttribute> getFeatureClass() {
		if (featureClass == null) {
			featureClass = new EObjectResolvingEList<BindingAttribute>(BindingAttribute.class, this, Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS);
		}
		return featureClass;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS:
				return getFeatureClass();
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME:
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
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS:
				getFeatureClass().clear();
				getFeatureClass().addAll((Collection<? extends BindingAttribute>)newValue);
				return;
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME:
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
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS:
				getFeatureClass().clear();
				return;
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME:
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
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS:
				return featureClass != null && !featureClass.isEmpty();
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE__NAME:
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

} //MetamodelElementFeatureImpl

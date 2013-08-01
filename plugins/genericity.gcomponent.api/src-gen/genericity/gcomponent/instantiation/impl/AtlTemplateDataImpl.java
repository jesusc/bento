/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation.impl;

import genericity.gcomponent.instantiation.AtlTemplateData;
import genericity.gcomponent.instantiation.ComponentInstantiationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atl Template Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.gcomponent.instantiation.impl.AtlTemplateDataImpl#getAtlDeclaredMetamodelName <em>Atl Declared Metamodel Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtlTemplateDataImpl extends TemplateSpecificDataImpl implements AtlTemplateData {
	/**
	 * The default value of the '{@link #getAtlDeclaredMetamodelName() <em>Atl Declared Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtlDeclaredMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATL_DECLARED_METAMODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtlDeclaredMetamodelName() <em>Atl Declared Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtlDeclaredMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected String atlDeclaredMetamodelName = ATL_DECLARED_METAMODEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtlTemplateDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInstantiationPackage.Literals.ATL_TEMPLATE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtlDeclaredMetamodelName() {
		return atlDeclaredMetamodelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtlDeclaredMetamodelName(String newAtlDeclaredMetamodelName) {
		String oldAtlDeclaredMetamodelName = atlDeclaredMetamodelName;
		atlDeclaredMetamodelName = newAtlDeclaredMetamodelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInstantiationPackage.ATL_TEMPLATE_DATA__ATL_DECLARED_METAMODEL_NAME, oldAtlDeclaredMetamodelName, atlDeclaredMetamodelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInstantiationPackage.ATL_TEMPLATE_DATA__ATL_DECLARED_METAMODEL_NAME:
				return getAtlDeclaredMetamodelName();
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
			case ComponentInstantiationPackage.ATL_TEMPLATE_DATA__ATL_DECLARED_METAMODEL_NAME:
				setAtlDeclaredMetamodelName((String)newValue);
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
			case ComponentInstantiationPackage.ATL_TEMPLATE_DATA__ATL_DECLARED_METAMODEL_NAME:
				setAtlDeclaredMetamodelName(ATL_DECLARED_METAMODEL_NAME_EDEFAULT);
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
			case ComponentInstantiationPackage.ATL_TEMPLATE_DATA__ATL_DECLARED_METAMODEL_NAME:
				return ATL_DECLARED_METAMODEL_NAME_EDEFAULT == null ? atlDeclaredMetamodelName != null : !ATL_DECLARED_METAMODEL_NAME_EDEFAULT.equals(atlDeclaredMetamodelName);
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
		result.append(" (atlDeclaredMetamodelName: ");
		result.append(atlDeclaredMetamodelName);
		result.append(')');
		return result.toString();
	}

} //AtlTemplateDataImpl

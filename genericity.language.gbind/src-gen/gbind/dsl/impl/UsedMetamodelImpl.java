/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.DslPackage;
import gbind.dsl.UsedMetamodel;

import gbind.simpleocl.impl.OclMetamodelImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.UsedMetamodelImpl#getMetamodelURI <em>Metamodel URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsedMetamodelImpl extends OclMetamodelImpl implements UsedMetamodel {
	/**
	 * The default value of the '{@link #getMetamodelURI() <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMetamodelURI() <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelURI()
	 * @generated
	 * @ordered
	 */
	protected String metamodelURI = METAMODEL_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.USED_METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelURI() {
		return metamodelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelURI(String newMetamodelURI) {
		String oldMetamodelURI = metamodelURI;
		metamodelURI = newMetamodelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.USED_METAMODEL__METAMODEL_URI, oldMetamodelURI, metamodelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.USED_METAMODEL__METAMODEL_URI:
				return getMetamodelURI();
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
			case DslPackage.USED_METAMODEL__METAMODEL_URI:
				setMetamodelURI((String)newValue);
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
			case DslPackage.USED_METAMODEL__METAMODEL_URI:
				setMetamodelURI(METAMODEL_URI_EDEFAULT);
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
			case DslPackage.USED_METAMODEL__METAMODEL_URI:
				return METAMODEL_URI_EDEFAULT == null ? metamodelURI != null : !METAMODEL_URI_EDEFAULT.equals(metamodelURI);
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
		result.append(" (metamodelURI: ");
		result.append(metamodelURI);
		result.append(')');
		return result.toString();
	}

} //UsedMetamodelImpl

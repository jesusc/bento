/**
 */
package bento.language.bentocomp.technologies.impl;

import bento.language.bentocomp.core.Model;

import bento.language.bentocomp.technologies.AtlParameter;
import bento.language.bentocomp.technologies.TechnologiesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atl Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.technologies.impl.AtlParameterImpl#getAtlModelName <em>Atl Model Name</em>}</li>
 *   <li>{@link bento.language.bentocomp.technologies.impl.AtlParameterImpl#getAtlMetamodelName <em>Atl Metamodel Name</em>}</li>
 *   <li>{@link bento.language.bentocomp.technologies.impl.AtlParameterImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtlParameterImpl extends EObjectImpl implements AtlParameter {
	/**
	 * The default value of the '{@link #getAtlModelName() <em>Atl Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtlModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATL_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtlModelName() <em>Atl Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtlModelName()
	 * @generated
	 * @ordered
	 */
	protected String atlModelName = ATL_MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAtlMetamodelName() <em>Atl Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtlMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATL_METAMODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtlMetamodelName() <em>Atl Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtlMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected String atlMetamodelName = ATL_METAMODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtlParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologiesPackage.Literals.ATL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtlModelName() {
		return atlModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtlModelName(String newAtlModelName) {
		String oldAtlModelName = atlModelName;
		atlModelName = newAtlModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME, oldAtlModelName, atlModelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtlMetamodelName() {
		return atlMetamodelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtlMetamodelName(String newAtlMetamodelName) {
		String oldAtlMetamodelName = atlMetamodelName;
		atlMetamodelName = newAtlMetamodelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologiesPackage.ATL_PARAMETER__ATL_METAMODEL_NAME, oldAtlMetamodelName, atlMetamodelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TechnologiesPackage.ATL_PARAMETER__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologiesPackage.ATL_PARAMETER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME:
				return getAtlModelName();
			case TechnologiesPackage.ATL_PARAMETER__ATL_METAMODEL_NAME:
				return getAtlMetamodelName();
			case TechnologiesPackage.ATL_PARAMETER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME:
				setAtlModelName((String)newValue);
				return;
			case TechnologiesPackage.ATL_PARAMETER__ATL_METAMODEL_NAME:
				setAtlMetamodelName((String)newValue);
				return;
			case TechnologiesPackage.ATL_PARAMETER__MODEL:
				setModel((Model)newValue);
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
			case TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME:
				setAtlModelName(ATL_MODEL_NAME_EDEFAULT);
				return;
			case TechnologiesPackage.ATL_PARAMETER__ATL_METAMODEL_NAME:
				setAtlMetamodelName(ATL_METAMODEL_NAME_EDEFAULT);
				return;
			case TechnologiesPackage.ATL_PARAMETER__MODEL:
				setModel((Model)null);
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
			case TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME:
				return ATL_MODEL_NAME_EDEFAULT == null ? atlModelName != null : !ATL_MODEL_NAME_EDEFAULT.equals(atlModelName);
			case TechnologiesPackage.ATL_PARAMETER__ATL_METAMODEL_NAME:
				return ATL_METAMODEL_NAME_EDEFAULT == null ? atlMetamodelName != null : !ATL_METAMODEL_NAME_EDEFAULT.equals(atlMetamodelName);
			case TechnologiesPackage.ATL_PARAMETER__MODEL:
				return model != null;
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
		result.append(" (atlModelName: ");
		result.append(atlModelName);
		result.append(", atlMetamodelName: ");
		result.append(atlMetamodelName);
		result.append(')');
		return result.toString();
	}

} //AtlParameterImpl

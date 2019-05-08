/**
 */
package bento.language.bentocomp.technologies.impl;

import bento.language.bentocomp.core.impl.TemplateImpl;

import bento.language.bentocomp.technologies.SiriusTemplate;
import bento.language.bentocomp.technologies.TechnologiesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sirius Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.technologies.impl.SiriusTemplateImpl#getODesignFile <em>ODesign File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiriusTemplateImpl extends TemplateImpl implements SiriusTemplate {
	/**
	 * The default value of the '{@link #getODesignFile() <em>ODesign File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODesignFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ODESIGN_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getODesignFile() <em>ODesign File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODesignFile()
	 * @generated
	 * @ordered
	 */
	protected String oDesignFile = ODESIGN_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiriusTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologiesPackage.Literals.SIRIUS_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getODesignFile() {
		return oDesignFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setODesignFile(String newODesignFile) {
		String oldODesignFile = oDesignFile;
		oDesignFile = newODesignFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologiesPackage.SIRIUS_TEMPLATE__ODESIGN_FILE, oldODesignFile, oDesignFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologiesPackage.SIRIUS_TEMPLATE__ODESIGN_FILE:
				return getODesignFile();
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
			case TechnologiesPackage.SIRIUS_TEMPLATE__ODESIGN_FILE:
				setODesignFile((String)newValue);
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
			case TechnologiesPackage.SIRIUS_TEMPLATE__ODESIGN_FILE:
				setODesignFile(ODESIGN_FILE_EDEFAULT);
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
			case TechnologiesPackage.SIRIUS_TEMPLATE__ODESIGN_FILE:
				return ODESIGN_FILE_EDEFAULT == null ? oDesignFile != null : !ODESIGN_FILE_EDEFAULT.equals(oDesignFile);
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
		result.append(" (oDesignFile: ");
		result.append(oDesignFile);
		result.append(')');
		return result.toString();
	}

} //SiriusTemplateImpl

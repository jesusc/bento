/**
 */
package dart.impl;

import dart.DartPackage;
import dart.Formatter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formatter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dart.impl.FormatterImpl#getFormatterName <em>Formatter Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormatterImpl extends ClassImpl implements Formatter {
	/**
	 * The default value of the '{@link #getFormatterName() <em>Formatter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMATTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatterName() <em>Formatter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatterName()
	 * @generated
	 * @ordered
	 */
	protected String formatterName = FORMATTER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormatterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.FORMATTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatterName() {
		return formatterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatterName(String newFormatterName) {
		String oldFormatterName = formatterName;
		formatterName = newFormatterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.FORMATTER__FORMATTER_NAME, oldFormatterName, formatterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.FORMATTER__FORMATTER_NAME:
				return getFormatterName();
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
			case DartPackage.FORMATTER__FORMATTER_NAME:
				setFormatterName((String)newValue);
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
			case DartPackage.FORMATTER__FORMATTER_NAME:
				setFormatterName(FORMATTER_NAME_EDEFAULT);
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
			case DartPackage.FORMATTER__FORMATTER_NAME:
				return FORMATTER_NAME_EDEFAULT == null ? formatterName != null : !FORMATTER_NAME_EDEFAULT.equals(formatterName);
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
		result.append(" (formatterName: ");
		result.append(formatterName);
		result.append(')');
		return result.toString();
	}

} //FormatterImpl

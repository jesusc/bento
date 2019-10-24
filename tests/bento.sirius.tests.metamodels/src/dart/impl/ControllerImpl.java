/**
 */
package dart.impl;

import dart.Controller;
import dart.DartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dart.impl.ControllerImpl#getPublishAs <em>Publish As</em>}</li>
 *   <li>{@link dart.impl.ControllerImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends ClassImpl implements Controller {
	/**
	 * The default value of the '{@link #getPublishAs() <em>Publish As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishAs()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISH_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishAs() <em>Publish As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishAs()
	 * @generated
	 * @ordered
	 */
	protected String publishAs = PUBLISH_AS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected String selector = SELECTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishAs() {
		return publishAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishAs(String newPublishAs) {
		String oldPublishAs = publishAs;
		publishAs = newPublishAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.CONTROLLER__PUBLISH_AS, oldPublishAs, publishAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		String oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.CONTROLLER__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.CONTROLLER__PUBLISH_AS:
				return getPublishAs();
			case DartPackage.CONTROLLER__SELECTOR:
				return getSelector();
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
			case DartPackage.CONTROLLER__PUBLISH_AS:
				setPublishAs((String)newValue);
				return;
			case DartPackage.CONTROLLER__SELECTOR:
				setSelector((String)newValue);
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
			case DartPackage.CONTROLLER__PUBLISH_AS:
				setPublishAs(PUBLISH_AS_EDEFAULT);
				return;
			case DartPackage.CONTROLLER__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
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
			case DartPackage.CONTROLLER__PUBLISH_AS:
				return PUBLISH_AS_EDEFAULT == null ? publishAs != null : !PUBLISH_AS_EDEFAULT.equals(publishAs);
			case DartPackage.CONTROLLER__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
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
		result.append(" (publishAs: ");
		result.append(publishAs);
		result.append(", selector: ");
		result.append(selector);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl

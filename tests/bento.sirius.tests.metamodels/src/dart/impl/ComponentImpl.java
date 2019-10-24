/**
 */
package dart.impl;

import dart.Component;
import dart.DartPackage;
import dart.HTML;
import dart.Stylesheet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dart.impl.ComponentImpl#getPublishAs <em>Publish As</em>}</li>
 *   <li>{@link dart.impl.ComponentImpl#getStylesheet <em>Stylesheet</em>}</li>
 *   <li>{@link dart.impl.ComponentImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link dart.impl.ComponentImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ClassImpl implements Component {
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
	 * The cached value of the '{@link #getStylesheet() <em>Stylesheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStylesheet()
	 * @generated
	 * @ordered
	 */
	protected Stylesheet stylesheet;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected HTML template;

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
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DartPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.COMPONENT__PUBLISH_AS, oldPublishAs, publishAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stylesheet getStylesheet() {
		if (stylesheet != null && stylesheet.eIsProxy()) {
			InternalEObject oldStylesheet = (InternalEObject)stylesheet;
			stylesheet = (Stylesheet)eResolveProxy(oldStylesheet);
			if (stylesheet != oldStylesheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DartPackage.COMPONENT__STYLESHEET, oldStylesheet, stylesheet));
			}
		}
		return stylesheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stylesheet basicGetStylesheet() {
		return stylesheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStylesheet(Stylesheet newStylesheet) {
		Stylesheet oldStylesheet = stylesheet;
		stylesheet = newStylesheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.COMPONENT__STYLESHEET, oldStylesheet, stylesheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (HTML)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DartPackage.COMPONENT__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(HTML newTemplate) {
		HTML oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.COMPONENT__TEMPLATE, oldTemplate, template));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DartPackage.COMPONENT__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DartPackage.COMPONENT__PUBLISH_AS:
				return getPublishAs();
			case DartPackage.COMPONENT__STYLESHEET:
				if (resolve) return getStylesheet();
				return basicGetStylesheet();
			case DartPackage.COMPONENT__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case DartPackage.COMPONENT__SELECTOR:
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
			case DartPackage.COMPONENT__PUBLISH_AS:
				setPublishAs((String)newValue);
				return;
			case DartPackage.COMPONENT__STYLESHEET:
				setStylesheet((Stylesheet)newValue);
				return;
			case DartPackage.COMPONENT__TEMPLATE:
				setTemplate((HTML)newValue);
				return;
			case DartPackage.COMPONENT__SELECTOR:
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
			case DartPackage.COMPONENT__PUBLISH_AS:
				setPublishAs(PUBLISH_AS_EDEFAULT);
				return;
			case DartPackage.COMPONENT__STYLESHEET:
				setStylesheet((Stylesheet)null);
				return;
			case DartPackage.COMPONENT__TEMPLATE:
				setTemplate((HTML)null);
				return;
			case DartPackage.COMPONENT__SELECTOR:
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
			case DartPackage.COMPONENT__PUBLISH_AS:
				return PUBLISH_AS_EDEFAULT == null ? publishAs != null : !PUBLISH_AS_EDEFAULT.equals(publishAs);
			case DartPackage.COMPONENT__STYLESHEET:
				return stylesheet != null;
			case DartPackage.COMPONENT__TEMPLATE:
				return template != null;
			case DartPackage.COMPONENT__SELECTOR:
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

} //ComponentImpl

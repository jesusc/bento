/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.TouchSensor;
import mindstorms_bdsl.isPressedTouchSensor;
import mindstorms_bdsl.nameTouchSensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touch Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.TouchSensorImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.TouchSensorImpl#isIsPressed <em>Is Pressed</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.TouchSensorImpl#getContainsnameTouchSensor <em>Containsname Touch Sensor</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.TouchSensorImpl#getContainsisPressedTouchSensor <em>Containsis Pressed Touch Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TouchSensorImpl extends SensorImpl implements TouchSensor {
	/**
	 * The cached value of the '{@link #getNoneElement() <em>None Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NoneElement> noneElement;

	/**
	 * The default value of the '{@link #isIsPressed() <em>Is Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPressed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPressed() <em>Is Pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPressed()
	 * @generated
	 * @ordered
	 */
	protected boolean isPressed = IS_PRESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameTouchSensor() <em>Containsname Touch Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameTouchSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<nameTouchSensor> containsnameTouchSensor;

	/**
	 * The cached value of the '{@link #getContainsisPressedTouchSensor() <em>Containsis Pressed Touch Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsisPressedTouchSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<isPressedTouchSensor> containsisPressedTouchSensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.TOUCH_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.TOUCH_SENSOR__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPressed() {
		return isPressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPressed(boolean newIsPressed) {
		boolean oldIsPressed = isPressed;
		isPressed = newIsPressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.TOUCH_SENSOR__IS_PRESSED, oldIsPressed, isPressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameTouchSensor> getContainsnameTouchSensor() {
		if (containsnameTouchSensor == null) {
			containsnameTouchSensor = new EObjectContainmentEList<nameTouchSensor>(nameTouchSensor.class, this, Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR);
		}
		return containsnameTouchSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<isPressedTouchSensor> getContainsisPressedTouchSensor() {
		if (containsisPressedTouchSensor == null) {
			containsisPressedTouchSensor = new EObjectContainmentEList<isPressedTouchSensor>(isPressedTouchSensor.class, this, Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR);
		}
		return containsisPressedTouchSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR:
				return ((InternalEList<?>)getContainsnameTouchSensor()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR:
				return ((InternalEList<?>)getContainsisPressedTouchSensor()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.TOUCH_SENSOR__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.TOUCH_SENSOR__IS_PRESSED:
				return isIsPressed();
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR:
				return getContainsnameTouchSensor();
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR:
				return getContainsisPressedTouchSensor();
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
			case Mindstorms_bdslPackage.TOUCH_SENSOR__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.TOUCH_SENSOR__IS_PRESSED:
				setIsPressed((Boolean)newValue);
				return;
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR:
				getContainsnameTouchSensor().clear();
				getContainsnameTouchSensor().addAll((Collection<? extends nameTouchSensor>)newValue);
				return;
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR:
				getContainsisPressedTouchSensor().clear();
				getContainsisPressedTouchSensor().addAll((Collection<? extends isPressedTouchSensor>)newValue);
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
			case Mindstorms_bdslPackage.TOUCH_SENSOR__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.TOUCH_SENSOR__IS_PRESSED:
				setIsPressed(IS_PRESSED_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR:
				getContainsnameTouchSensor().clear();
				return;
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR:
				getContainsisPressedTouchSensor().clear();
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
			case Mindstorms_bdslPackage.TOUCH_SENSOR__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.TOUCH_SENSOR__IS_PRESSED:
				return isPressed != IS_PRESSED_EDEFAULT;
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR:
				return containsnameTouchSensor != null && !containsnameTouchSensor.isEmpty();
			case Mindstorms_bdslPackage.TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR:
				return containsisPressedTouchSensor != null && !containsisPressedTouchSensor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BindingElement.class) {
			switch (derivedFeatureID) {
				case Mindstorms_bdslPackage.TOUCH_SENSOR__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BindingElement.class) {
			switch (baseFeatureID) {
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.TOUCH_SENSOR__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isPressed: ");
		result.append(isPressed);
		result.append(')');
		return result.toString();
	}

} //TouchSensorImpl

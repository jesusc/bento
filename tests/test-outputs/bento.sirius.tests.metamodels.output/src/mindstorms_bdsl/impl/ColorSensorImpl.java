/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Color;
import mindstorms_bdsl.ColorSensor;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.colorColorSensor;
import mindstorms_bdsl.nameColorSensor;

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
 * An implementation of the model object '<em><b>Color Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.ColorSensorImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ColorSensorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ColorSensorImpl#getContainsnameColorSensor <em>Containsname Color Sensor</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ColorSensorImpl#getContainscolorColorSensor <em>Containscolor Color Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorSensorImpl extends SensorImpl implements ColorSensor {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.NONE;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameColorSensor() <em>Containsname Color Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameColorSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<nameColorSensor> containsnameColorSensor;

	/**
	 * The cached value of the '{@link #getContainscolorColorSensor() <em>Containscolor Color Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainscolorColorSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<colorColorSensor> containscolorColorSensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.COLOR_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.COLOR_SENSOR__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.COLOR_SENSOR__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameColorSensor> getContainsnameColorSensor() {
		if (containsnameColorSensor == null) {
			containsnameColorSensor = new EObjectContainmentEList<nameColorSensor>(nameColorSensor.class, this, Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR);
		}
		return containsnameColorSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<colorColorSensor> getContainscolorColorSensor() {
		if (containscolorColorSensor == null) {
			containscolorColorSensor = new EObjectContainmentEList<colorColorSensor>(colorColorSensor.class, this, Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR);
		}
		return containscolorColorSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR:
				return ((InternalEList<?>)getContainsnameColorSensor()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR:
				return ((InternalEList<?>)getContainscolorColorSensor()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.COLOR_SENSOR__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.COLOR_SENSOR__COLOR:
				return getColor();
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR:
				return getContainsnameColorSensor();
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR:
				return getContainscolorColorSensor();
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
			case Mindstorms_bdslPackage.COLOR_SENSOR__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.COLOR_SENSOR__COLOR:
				setColor((Color)newValue);
				return;
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR:
				getContainsnameColorSensor().clear();
				getContainsnameColorSensor().addAll((Collection<? extends nameColorSensor>)newValue);
				return;
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR:
				getContainscolorColorSensor().clear();
				getContainscolorColorSensor().addAll((Collection<? extends colorColorSensor>)newValue);
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
			case Mindstorms_bdslPackage.COLOR_SENSOR__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.COLOR_SENSOR__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR:
				getContainsnameColorSensor().clear();
				return;
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR:
				getContainscolorColorSensor().clear();
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
			case Mindstorms_bdslPackage.COLOR_SENSOR__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.COLOR_SENSOR__COLOR:
				return color != COLOR_EDEFAULT;
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR:
				return containsnameColorSensor != null && !containsnameColorSensor.isEmpty();
			case Mindstorms_bdslPackage.COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR:
				return containscolorColorSensor != null && !containscolorColorSensor.isEmpty();
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
				case Mindstorms_bdslPackage.COLOR_SENSOR__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.COLOR_SENSOR__NONE_ELEMENT;
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
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //ColorSensorImpl

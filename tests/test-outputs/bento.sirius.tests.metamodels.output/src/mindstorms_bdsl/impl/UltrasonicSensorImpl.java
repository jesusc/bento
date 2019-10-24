/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.OperatorKind;
import mindstorms_bdsl.UltrasonicSensor;
import mindstorms_bdsl.nameUltrasonicSensor;
import mindstorms_bdsl.operatorUltrasonicSensor;
import mindstorms_bdsl.valueUltrasonicSensor;

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
 * An implementation of the model object '<em><b>Ultrasonic Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.UltrasonicSensorImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.UltrasonicSensorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.UltrasonicSensorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.UltrasonicSensorImpl#getContainsnameUltrasonicSensor <em>Containsname Ultrasonic Sensor</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.UltrasonicSensorImpl#getContainsoperatorUltrasonicSensor <em>Containsoperator Ultrasonic Sensor</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.UltrasonicSensorImpl#getContainsvalueUltrasonicSensor <em>Containsvalue Ultrasonic Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UltrasonicSensorImpl extends SensorImpl implements UltrasonicSensor {
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
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorKind OPERATOR_EDEFAULT = OperatorKind.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected OperatorKind operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameUltrasonicSensor() <em>Containsname Ultrasonic Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameUltrasonicSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<nameUltrasonicSensor> containsnameUltrasonicSensor;

	/**
	 * The cached value of the '{@link #getContainsoperatorUltrasonicSensor() <em>Containsoperator Ultrasonic Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsoperatorUltrasonicSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<operatorUltrasonicSensor> containsoperatorUltrasonicSensor;

	/**
	 * The cached value of the '{@link #getContainsvalueUltrasonicSensor() <em>Containsvalue Ultrasonic Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsvalueUltrasonicSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<valueUltrasonicSensor> containsvalueUltrasonicSensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UltrasonicSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.ULTRASONIC_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.ULTRASONIC_SENSOR__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorKind getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(OperatorKind newOperator) {
		OperatorKind oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.ULTRASONIC_SENSOR__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.ULTRASONIC_SENSOR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameUltrasonicSensor> getContainsnameUltrasonicSensor() {
		if (containsnameUltrasonicSensor == null) {
			containsnameUltrasonicSensor = new EObjectContainmentEList<nameUltrasonicSensor>(nameUltrasonicSensor.class, this, Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR);
		}
		return containsnameUltrasonicSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<operatorUltrasonicSensor> getContainsoperatorUltrasonicSensor() {
		if (containsoperatorUltrasonicSensor == null) {
			containsoperatorUltrasonicSensor = new EObjectContainmentEList<operatorUltrasonicSensor>(operatorUltrasonicSensor.class, this, Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR);
		}
		return containsoperatorUltrasonicSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<valueUltrasonicSensor> getContainsvalueUltrasonicSensor() {
		if (containsvalueUltrasonicSensor == null) {
			containsvalueUltrasonicSensor = new EObjectContainmentEList<valueUltrasonicSensor>(valueUltrasonicSensor.class, this, Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR);
		}
		return containsvalueUltrasonicSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR:
				return ((InternalEList<?>)getContainsnameUltrasonicSensor()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR:
				return ((InternalEList<?>)getContainsoperatorUltrasonicSensor()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR:
				return ((InternalEList<?>)getContainsvalueUltrasonicSensor()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__OPERATOR:
				return getOperator();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__VALUE:
				return getValue();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR:
				return getContainsnameUltrasonicSensor();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR:
				return getContainsoperatorUltrasonicSensor();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR:
				return getContainsvalueUltrasonicSensor();
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
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__OPERATOR:
				setOperator((OperatorKind)newValue);
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__VALUE:
				setValue((Float)newValue);
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR:
				getContainsnameUltrasonicSensor().clear();
				getContainsnameUltrasonicSensor().addAll((Collection<? extends nameUltrasonicSensor>)newValue);
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR:
				getContainsoperatorUltrasonicSensor().clear();
				getContainsoperatorUltrasonicSensor().addAll((Collection<? extends operatorUltrasonicSensor>)newValue);
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR:
				getContainsvalueUltrasonicSensor().clear();
				getContainsvalueUltrasonicSensor().addAll((Collection<? extends valueUltrasonicSensor>)newValue);
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
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR:
				getContainsnameUltrasonicSensor().clear();
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR:
				getContainsoperatorUltrasonicSensor().clear();
				return;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR:
				getContainsvalueUltrasonicSensor().clear();
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
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__VALUE:
				return value != VALUE_EDEFAULT;
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR:
				return containsnameUltrasonicSensor != null && !containsnameUltrasonicSensor.isEmpty();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR:
				return containsoperatorUltrasonicSensor != null && !containsoperatorUltrasonicSensor.isEmpty();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR:
				return containsvalueUltrasonicSensor != null && !containsvalueUltrasonicSensor.isEmpty();
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
				case Mindstorms_bdslPackage.ULTRASONIC_SENSOR__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.ULTRASONIC_SENSOR__NONE_ELEMENT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //UltrasonicSensorImpl

/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.SiriusTag;
import metamodel_bdsl.Uniform;
import metamodel_bdsl.maximumUniform;
import metamodel_bdsl.minimumUniform;

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
 * An implementation of the model object '<em><b>Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.UniformImpl#getContainsSiriusTag <em>Contains Sirius Tag</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.UniformImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.UniformImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.UniformImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.UniformImpl#getContainsminimumUniform <em>Containsminimum Uniform</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.UniformImpl#getContainsmaximumUniform <em>Containsmaximum Uniform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniformImpl extends DistributionImpl implements Uniform {
	/**
	 * The cached value of the '{@link #getContainsSiriusTag() <em>Contains Sirius Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSiriusTag()
	 * @generated
	 * @ordered
	 */
	protected EList<SiriusTag> containsSiriusTag;

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
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected double minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected double maximum = MAXIMUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsminimumUniform() <em>Containsminimum Uniform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsminimumUniform()
	 * @generated
	 * @ordered
	 */
	protected EList<minimumUniform> containsminimumUniform;

	/**
	 * The cached value of the '{@link #getContainsmaximumUniform() <em>Containsmaximum Uniform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsmaximumUniform()
	 * @generated
	 * @ordered
	 */
	protected EList<maximumUniform> containsmaximumUniform;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.UNIFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiriusTag> getContainsSiriusTag() {
		if (containsSiriusTag == null) {
			containsSiriusTag = new EObjectContainmentEList<SiriusTag>(SiriusTag.class, this, Metamodel_bdslPackage.UNIFORM__CONTAINS_SIRIUS_TAG);
		}
		return containsSiriusTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.UNIFORM__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(double newMinimum) {
		double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.UNIFORM__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(double newMaximum) {
		double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.UNIFORM__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<minimumUniform> getContainsminimumUniform() {
		if (containsminimumUniform == null) {
			containsminimumUniform = new EObjectContainmentEList<minimumUniform>(minimumUniform.class, this, Metamodel_bdslPackage.UNIFORM__CONTAINSMINIMUM_UNIFORM);
		}
		return containsminimumUniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<maximumUniform> getContainsmaximumUniform() {
		if (containsmaximumUniform == null) {
			containsmaximumUniform = new EObjectContainmentEList<maximumUniform>(maximumUniform.class, this, Metamodel_bdslPackage.UNIFORM__CONTAINSMAXIMUM_UNIFORM);
		}
		return containsmaximumUniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.UNIFORM__CONTAINS_SIRIUS_TAG:
				return ((InternalEList<?>)getContainsSiriusTag()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMINIMUM_UNIFORM:
				return ((InternalEList<?>)getContainsminimumUniform()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMAXIMUM_UNIFORM:
				return ((InternalEList<?>)getContainsmaximumUniform()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.UNIFORM__CONTAINS_SIRIUS_TAG:
				return getContainsSiriusTag();
			case Metamodel_bdslPackage.UNIFORM__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.UNIFORM__MINIMUM:
				return getMinimum();
			case Metamodel_bdslPackage.UNIFORM__MAXIMUM:
				return getMaximum();
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMINIMUM_UNIFORM:
				return getContainsminimumUniform();
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMAXIMUM_UNIFORM:
				return getContainsmaximumUniform();
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
			case Metamodel_bdslPackage.UNIFORM__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				getContainsSiriusTag().addAll((Collection<? extends SiriusTag>)newValue);
				return;
			case Metamodel_bdslPackage.UNIFORM__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.UNIFORM__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case Metamodel_bdslPackage.UNIFORM__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMINIMUM_UNIFORM:
				getContainsminimumUniform().clear();
				getContainsminimumUniform().addAll((Collection<? extends minimumUniform>)newValue);
				return;
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMAXIMUM_UNIFORM:
				getContainsmaximumUniform().clear();
				getContainsmaximumUniform().addAll((Collection<? extends maximumUniform>)newValue);
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
			case Metamodel_bdslPackage.UNIFORM__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				return;
			case Metamodel_bdslPackage.UNIFORM__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Metamodel_bdslPackage.UNIFORM__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case Metamodel_bdslPackage.UNIFORM__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMINIMUM_UNIFORM:
				getContainsminimumUniform().clear();
				return;
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMAXIMUM_UNIFORM:
				getContainsmaximumUniform().clear();
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
			case Metamodel_bdslPackage.UNIFORM__CONTAINS_SIRIUS_TAG:
				return containsSiriusTag != null && !containsSiriusTag.isEmpty();
			case Metamodel_bdslPackage.UNIFORM__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.UNIFORM__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case Metamodel_bdslPackage.UNIFORM__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMINIMUM_UNIFORM:
				return containsminimumUniform != null && !containsminimumUniform.isEmpty();
			case Metamodel_bdslPackage.UNIFORM__CONTAINSMAXIMUM_UNIFORM:
				return containsmaximumUniform != null && !containsmaximumUniform.isEmpty();
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
				case Metamodel_bdslPackage.UNIFORM__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.UNIFORM__NONE_ELEMENT: return Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.UNIFORM__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Metamodel_bdslPackage.UNIFORM__NONE_ELEMENT;
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
		result.append(" (minimum: ");
		result.append(minimum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(')');
		return result.toString();
	}

} //UniformImpl

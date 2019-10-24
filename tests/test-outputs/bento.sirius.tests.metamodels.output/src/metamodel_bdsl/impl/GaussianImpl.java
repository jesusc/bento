/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Gaussian;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.SiriusTag;
import metamodel_bdsl.locationGaussian;
import metamodel_bdsl.scaleGaussian;

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
 * An implementation of the model object '<em><b>Gaussian</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.GaussianImpl#getContainsSiriusTag <em>Contains Sirius Tag</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.GaussianImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.GaussianImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.GaussianImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.GaussianImpl#getContainslocationGaussian <em>Containslocation Gaussian</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.GaussianImpl#getContainsscaleGaussian <em>Containsscale Gaussian</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaussianImpl extends DistributionImpl implements Gaussian {
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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final double LOCATION_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected double location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Double scale = SCALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainslocationGaussian() <em>Containslocation Gaussian</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainslocationGaussian()
	 * @generated
	 * @ordered
	 */
	protected EList<locationGaussian> containslocationGaussian;

	/**
	 * The cached value of the '{@link #getContainsscaleGaussian() <em>Containsscale Gaussian</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsscaleGaussian()
	 * @generated
	 * @ordered
	 */
	protected EList<scaleGaussian> containsscaleGaussian;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaussianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.GAUSSIAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiriusTag> getContainsSiriusTag() {
		if (containsSiriusTag == null) {
			containsSiriusTag = new EObjectContainmentEList<SiriusTag>(SiriusTag.class, this, Metamodel_bdslPackage.GAUSSIAN__CONTAINS_SIRIUS_TAG);
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
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.GAUSSIAN__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(double newLocation) {
		double oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.GAUSSIAN__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Double newScale) {
		Double oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.GAUSSIAN__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<locationGaussian> getContainslocationGaussian() {
		if (containslocationGaussian == null) {
			containslocationGaussian = new EObjectContainmentEList<locationGaussian>(locationGaussian.class, this, Metamodel_bdslPackage.GAUSSIAN__CONTAINSLOCATION_GAUSSIAN);
		}
		return containslocationGaussian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<scaleGaussian> getContainsscaleGaussian() {
		if (containsscaleGaussian == null) {
			containsscaleGaussian = new EObjectContainmentEList<scaleGaussian>(scaleGaussian.class, this, Metamodel_bdslPackage.GAUSSIAN__CONTAINSSCALE_GAUSSIAN);
		}
		return containsscaleGaussian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINS_SIRIUS_TAG:
				return ((InternalEList<?>)getContainsSiriusTag()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSLOCATION_GAUSSIAN:
				return ((InternalEList<?>)getContainslocationGaussian()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSSCALE_GAUSSIAN:
				return ((InternalEList<?>)getContainsscaleGaussian()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINS_SIRIUS_TAG:
				return getContainsSiriusTag();
			case Metamodel_bdslPackage.GAUSSIAN__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.GAUSSIAN__LOCATION:
				return getLocation();
			case Metamodel_bdslPackage.GAUSSIAN__SCALE:
				return getScale();
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSLOCATION_GAUSSIAN:
				return getContainslocationGaussian();
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSSCALE_GAUSSIAN:
				return getContainsscaleGaussian();
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
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				getContainsSiriusTag().addAll((Collection<? extends SiriusTag>)newValue);
				return;
			case Metamodel_bdslPackage.GAUSSIAN__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.GAUSSIAN__LOCATION:
				setLocation((Double)newValue);
				return;
			case Metamodel_bdslPackage.GAUSSIAN__SCALE:
				setScale((Double)newValue);
				return;
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSLOCATION_GAUSSIAN:
				getContainslocationGaussian().clear();
				getContainslocationGaussian().addAll((Collection<? extends locationGaussian>)newValue);
				return;
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSSCALE_GAUSSIAN:
				getContainsscaleGaussian().clear();
				getContainsscaleGaussian().addAll((Collection<? extends scaleGaussian>)newValue);
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
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				return;
			case Metamodel_bdslPackage.GAUSSIAN__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Metamodel_bdslPackage.GAUSSIAN__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case Metamodel_bdslPackage.GAUSSIAN__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSLOCATION_GAUSSIAN:
				getContainslocationGaussian().clear();
				return;
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSSCALE_GAUSSIAN:
				getContainsscaleGaussian().clear();
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
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINS_SIRIUS_TAG:
				return containsSiriusTag != null && !containsSiriusTag.isEmpty();
			case Metamodel_bdslPackage.GAUSSIAN__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.GAUSSIAN__LOCATION:
				return location != LOCATION_EDEFAULT;
			case Metamodel_bdslPackage.GAUSSIAN__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSLOCATION_GAUSSIAN:
				return containslocationGaussian != null && !containslocationGaussian.isEmpty();
			case Metamodel_bdslPackage.GAUSSIAN__CONTAINSSCALE_GAUSSIAN:
				return containsscaleGaussian != null && !containsscaleGaussian.isEmpty();
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
				case Metamodel_bdslPackage.GAUSSIAN__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.GAUSSIAN__NONE_ELEMENT: return Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.GAUSSIAN__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Metamodel_bdslPackage.GAUSSIAN__NONE_ELEMENT;
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
		result.append(" (location: ");
		result.append(location);
		result.append(", scale: ");
		result.append(scale);
		result.append(')');
		return result.toString();
	}

} //GaussianImpl

/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.Rotate;
import mindstorms_bdsl.degreesRotate;
import mindstorms_bdsl.nameRotate;
import mindstorms_bdsl.randomRotate;

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
 * An implementation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.RotateImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.RotateImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.RotateImpl#isRandom <em>Random</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.RotateImpl#getContainsnameRotate <em>Containsname Rotate</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.RotateImpl#getContainsdegreesRotate <em>Containsdegrees Rotate</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.RotateImpl#getContainsrandomRotate <em>Containsrandom Rotate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotateImpl extends ActionImpl implements Rotate {
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
	 * The default value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGREES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected int degrees = DEGREES_EDEFAULT;

	/**
	 * The default value of the '{@link #isRandom() <em>Random</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RANDOM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRandom() <em>Random</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandom()
	 * @generated
	 * @ordered
	 */
	protected boolean random = RANDOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameRotate() <em>Containsname Rotate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameRotate()
	 * @generated
	 * @ordered
	 */
	protected EList<nameRotate> containsnameRotate;

	/**
	 * The cached value of the '{@link #getContainsdegreesRotate() <em>Containsdegrees Rotate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsdegreesRotate()
	 * @generated
	 * @ordered
	 */
	protected EList<degreesRotate> containsdegreesRotate;

	/**
	 * The cached value of the '{@link #getContainsrandomRotate() <em>Containsrandom Rotate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsrandomRotate()
	 * @generated
	 * @ordered
	 */
	protected EList<randomRotate> containsrandomRotate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.ROTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.ROTATE__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDegrees() {
		return degrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegrees(int newDegrees) {
		int oldDegrees = degrees;
		degrees = newDegrees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.ROTATE__DEGREES, oldDegrees, degrees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRandom() {
		return random;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandom(boolean newRandom) {
		boolean oldRandom = random;
		random = newRandom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.ROTATE__RANDOM, oldRandom, random));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameRotate> getContainsnameRotate() {
		if (containsnameRotate == null) {
			containsnameRotate = new EObjectContainmentEList<nameRotate>(nameRotate.class, this, Mindstorms_bdslPackage.ROTATE__CONTAINSNAME_ROTATE);
		}
		return containsnameRotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<degreesRotate> getContainsdegreesRotate() {
		if (containsdegreesRotate == null) {
			containsdegreesRotate = new EObjectContainmentEList<degreesRotate>(degreesRotate.class, this, Mindstorms_bdslPackage.ROTATE__CONTAINSDEGREES_ROTATE);
		}
		return containsdegreesRotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<randomRotate> getContainsrandomRotate() {
		if (containsrandomRotate == null) {
			containsrandomRotate = new EObjectContainmentEList<randomRotate>(randomRotate.class, this, Mindstorms_bdslPackage.ROTATE__CONTAINSRANDOM_ROTATE);
		}
		return containsrandomRotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.ROTATE__CONTAINSNAME_ROTATE:
				return ((InternalEList<?>)getContainsnameRotate()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.ROTATE__CONTAINSDEGREES_ROTATE:
				return ((InternalEList<?>)getContainsdegreesRotate()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.ROTATE__CONTAINSRANDOM_ROTATE:
				return ((InternalEList<?>)getContainsrandomRotate()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.ROTATE__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.ROTATE__DEGREES:
				return getDegrees();
			case Mindstorms_bdslPackage.ROTATE__RANDOM:
				return isRandom();
			case Mindstorms_bdslPackage.ROTATE__CONTAINSNAME_ROTATE:
				return getContainsnameRotate();
			case Mindstorms_bdslPackage.ROTATE__CONTAINSDEGREES_ROTATE:
				return getContainsdegreesRotate();
			case Mindstorms_bdslPackage.ROTATE__CONTAINSRANDOM_ROTATE:
				return getContainsrandomRotate();
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
			case Mindstorms_bdslPackage.ROTATE__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.ROTATE__DEGREES:
				setDegrees((Integer)newValue);
				return;
			case Mindstorms_bdslPackage.ROTATE__RANDOM:
				setRandom((Boolean)newValue);
				return;
			case Mindstorms_bdslPackage.ROTATE__CONTAINSNAME_ROTATE:
				getContainsnameRotate().clear();
				getContainsnameRotate().addAll((Collection<? extends nameRotate>)newValue);
				return;
			case Mindstorms_bdslPackage.ROTATE__CONTAINSDEGREES_ROTATE:
				getContainsdegreesRotate().clear();
				getContainsdegreesRotate().addAll((Collection<? extends degreesRotate>)newValue);
				return;
			case Mindstorms_bdslPackage.ROTATE__CONTAINSRANDOM_ROTATE:
				getContainsrandomRotate().clear();
				getContainsrandomRotate().addAll((Collection<? extends randomRotate>)newValue);
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
			case Mindstorms_bdslPackage.ROTATE__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.ROTATE__DEGREES:
				setDegrees(DEGREES_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.ROTATE__RANDOM:
				setRandom(RANDOM_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.ROTATE__CONTAINSNAME_ROTATE:
				getContainsnameRotate().clear();
				return;
			case Mindstorms_bdslPackage.ROTATE__CONTAINSDEGREES_ROTATE:
				getContainsdegreesRotate().clear();
				return;
			case Mindstorms_bdslPackage.ROTATE__CONTAINSRANDOM_ROTATE:
				getContainsrandomRotate().clear();
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
			case Mindstorms_bdslPackage.ROTATE__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.ROTATE__DEGREES:
				return degrees != DEGREES_EDEFAULT;
			case Mindstorms_bdslPackage.ROTATE__RANDOM:
				return random != RANDOM_EDEFAULT;
			case Mindstorms_bdslPackage.ROTATE__CONTAINSNAME_ROTATE:
				return containsnameRotate != null && !containsnameRotate.isEmpty();
			case Mindstorms_bdslPackage.ROTATE__CONTAINSDEGREES_ROTATE:
				return containsdegreesRotate != null && !containsdegreesRotate.isEmpty();
			case Mindstorms_bdslPackage.ROTATE__CONTAINSRANDOM_ROTATE:
				return containsrandomRotate != null && !containsrandomRotate.isEmpty();
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
				case Mindstorms_bdslPackage.ROTATE__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.ROTATE__NONE_ELEMENT;
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
		result.append(" (degrees: ");
		result.append(degrees);
		result.append(", random: ");
		result.append(random);
		result.append(')');
		return result.toString();
	}

} //RotateImpl

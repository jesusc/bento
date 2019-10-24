/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Delay;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.msDelay;
import mindstorms_bdsl.nameDelay;

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
 * An implementation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.DelayImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.DelayImpl#getMs <em>Ms</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.DelayImpl#getContainsnameDelay <em>Containsname Delay</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.DelayImpl#getContainsmsDelay <em>Containsms Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayImpl extends ActionImpl implements Delay {
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
	 * The default value of the '{@link #getMs() <em>Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMs()
	 * @generated
	 * @ordered
	 */
	protected static final int MS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMs() <em>Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMs()
	 * @generated
	 * @ordered
	 */
	protected int ms = MS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameDelay() <em>Containsname Delay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameDelay()
	 * @generated
	 * @ordered
	 */
	protected EList<nameDelay> containsnameDelay;

	/**
	 * The cached value of the '{@link #getContainsmsDelay() <em>Containsms Delay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsmsDelay()
	 * @generated
	 * @ordered
	 */
	protected EList<msDelay> containsmsDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.DELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.DELAY__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMs() {
		return ms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMs(int newMs) {
		int oldMs = ms;
		ms = newMs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.DELAY__MS, oldMs, ms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameDelay> getContainsnameDelay() {
		if (containsnameDelay == null) {
			containsnameDelay = new EObjectContainmentEList<nameDelay>(nameDelay.class, this, Mindstorms_bdslPackage.DELAY__CONTAINSNAME_DELAY);
		}
		return containsnameDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<msDelay> getContainsmsDelay() {
		if (containsmsDelay == null) {
			containsmsDelay = new EObjectContainmentEList<msDelay>(msDelay.class, this, Mindstorms_bdslPackage.DELAY__CONTAINSMS_DELAY);
		}
		return containsmsDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.DELAY__CONTAINSNAME_DELAY:
				return ((InternalEList<?>)getContainsnameDelay()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.DELAY__CONTAINSMS_DELAY:
				return ((InternalEList<?>)getContainsmsDelay()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.DELAY__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.DELAY__MS:
				return getMs();
			case Mindstorms_bdslPackage.DELAY__CONTAINSNAME_DELAY:
				return getContainsnameDelay();
			case Mindstorms_bdslPackage.DELAY__CONTAINSMS_DELAY:
				return getContainsmsDelay();
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
			case Mindstorms_bdslPackage.DELAY__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.DELAY__MS:
				setMs((Integer)newValue);
				return;
			case Mindstorms_bdslPackage.DELAY__CONTAINSNAME_DELAY:
				getContainsnameDelay().clear();
				getContainsnameDelay().addAll((Collection<? extends nameDelay>)newValue);
				return;
			case Mindstorms_bdslPackage.DELAY__CONTAINSMS_DELAY:
				getContainsmsDelay().clear();
				getContainsmsDelay().addAll((Collection<? extends msDelay>)newValue);
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
			case Mindstorms_bdslPackage.DELAY__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.DELAY__MS:
				setMs(MS_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.DELAY__CONTAINSNAME_DELAY:
				getContainsnameDelay().clear();
				return;
			case Mindstorms_bdslPackage.DELAY__CONTAINSMS_DELAY:
				getContainsmsDelay().clear();
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
			case Mindstorms_bdslPackage.DELAY__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.DELAY__MS:
				return ms != MS_EDEFAULT;
			case Mindstorms_bdslPackage.DELAY__CONTAINSNAME_DELAY:
				return containsnameDelay != null && !containsnameDelay.isEmpty();
			case Mindstorms_bdslPackage.DELAY__CONTAINSMS_DELAY:
				return containsmsDelay != null && !containsmsDelay.isEmpty();
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
				case Mindstorms_bdslPackage.DELAY__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.DELAY__NONE_ELEMENT;
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
		result.append(" (ms: ");
		result.append(ms);
		result.append(')');
		return result.toString();
	}

} //DelayImpl

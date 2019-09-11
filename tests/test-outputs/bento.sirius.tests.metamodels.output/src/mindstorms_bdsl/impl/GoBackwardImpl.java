/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.GoBackward;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.cmGoBackward;
import mindstorms_bdsl.infiniteGoBackward;
import mindstorms_bdsl.nameGoBackward;

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
 * An implementation of the model object '<em><b>Go Backward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.GoBackwardImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoBackwardImpl#getCm <em>Cm</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoBackwardImpl#isInfinite <em>Infinite</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoBackwardImpl#getContainsnameGoBackward <em>Containsname Go Backward</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoBackwardImpl#getContainscmGoBackward <em>Containscm Go Backward</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoBackwardImpl#getContainsinfiniteGoBackward <em>Containsinfinite Go Backward</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoBackwardImpl extends ActionImpl implements GoBackward {
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
	 * The default value of the '{@link #getCm() <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected static final int CM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCm() <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCm()
	 * @generated
	 * @ordered
	 */
	protected int cm = CM_EDEFAULT;

	/**
	 * The default value of the '{@link #isInfinite() <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfinite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFINITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInfinite() <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfinite()
	 * @generated
	 * @ordered
	 */
	protected boolean infinite = INFINITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameGoBackward() <em>Containsname Go Backward</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameGoBackward()
	 * @generated
	 * @ordered
	 */
	protected EList<nameGoBackward> containsnameGoBackward;

	/**
	 * The cached value of the '{@link #getContainscmGoBackward() <em>Containscm Go Backward</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainscmGoBackward()
	 * @generated
	 * @ordered
	 */
	protected EList<cmGoBackward> containscmGoBackward;

	/**
	 * The cached value of the '{@link #getContainsinfiniteGoBackward() <em>Containsinfinite Go Backward</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsinfiniteGoBackward()
	 * @generated
	 * @ordered
	 */
	protected EList<infiniteGoBackward> containsinfiniteGoBackward;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoBackwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.GO_BACKWARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.GO_BACKWARD__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCm() {
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCm(int newCm) {
		int oldCm = cm;
		cm = newCm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.GO_BACKWARD__CM, oldCm, cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInfinite() {
		return infinite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfinite(boolean newInfinite) {
		boolean oldInfinite = infinite;
		infinite = newInfinite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.GO_BACKWARD__INFINITE, oldInfinite, infinite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameGoBackward> getContainsnameGoBackward() {
		if (containsnameGoBackward == null) {
			containsnameGoBackward = new EObjectContainmentEList<nameGoBackward>(nameGoBackward.class, this, Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSNAME_GO_BACKWARD);
		}
		return containsnameGoBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cmGoBackward> getContainscmGoBackward() {
		if (containscmGoBackward == null) {
			containscmGoBackward = new EObjectContainmentEList<cmGoBackward>(cmGoBackward.class, this, Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSCM_GO_BACKWARD);
		}
		return containscmGoBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<infiniteGoBackward> getContainsinfiniteGoBackward() {
		if (containsinfiniteGoBackward == null) {
			containsinfiniteGoBackward = new EObjectContainmentEList<infiniteGoBackward>(infiniteGoBackward.class, this, Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD);
		}
		return containsinfiniteGoBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSNAME_GO_BACKWARD:
				return ((InternalEList<?>)getContainsnameGoBackward()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSCM_GO_BACKWARD:
				return ((InternalEList<?>)getContainscmGoBackward()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD:
				return ((InternalEList<?>)getContainsinfiniteGoBackward()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.GO_BACKWARD__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.GO_BACKWARD__CM:
				return getCm();
			case Mindstorms_bdslPackage.GO_BACKWARD__INFINITE:
				return isInfinite();
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSNAME_GO_BACKWARD:
				return getContainsnameGoBackward();
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSCM_GO_BACKWARD:
				return getContainscmGoBackward();
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD:
				return getContainsinfiniteGoBackward();
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
			case Mindstorms_bdslPackage.GO_BACKWARD__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__CM:
				setCm((Integer)newValue);
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__INFINITE:
				setInfinite((Boolean)newValue);
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSNAME_GO_BACKWARD:
				getContainsnameGoBackward().clear();
				getContainsnameGoBackward().addAll((Collection<? extends nameGoBackward>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSCM_GO_BACKWARD:
				getContainscmGoBackward().clear();
				getContainscmGoBackward().addAll((Collection<? extends cmGoBackward>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD:
				getContainsinfiniteGoBackward().clear();
				getContainsinfiniteGoBackward().addAll((Collection<? extends infiniteGoBackward>)newValue);
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
			case Mindstorms_bdslPackage.GO_BACKWARD__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__CM:
				setCm(CM_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__INFINITE:
				setInfinite(INFINITE_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSNAME_GO_BACKWARD:
				getContainsnameGoBackward().clear();
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSCM_GO_BACKWARD:
				getContainscmGoBackward().clear();
				return;
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD:
				getContainsinfiniteGoBackward().clear();
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
			case Mindstorms_bdslPackage.GO_BACKWARD__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.GO_BACKWARD__CM:
				return cm != CM_EDEFAULT;
			case Mindstorms_bdslPackage.GO_BACKWARD__INFINITE:
				return infinite != INFINITE_EDEFAULT;
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSNAME_GO_BACKWARD:
				return containsnameGoBackward != null && !containsnameGoBackward.isEmpty();
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSCM_GO_BACKWARD:
				return containscmGoBackward != null && !containscmGoBackward.isEmpty();
			case Mindstorms_bdslPackage.GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD:
				return containsinfiniteGoBackward != null && !containsinfiniteGoBackward.isEmpty();
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
				case Mindstorms_bdslPackage.GO_BACKWARD__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.GO_BACKWARD__NONE_ELEMENT;
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
		result.append(" (cm: ");
		result.append(cm);
		result.append(", infinite: ");
		result.append(infinite);
		result.append(')');
		return result.toString();
	}

} //GoBackwardImpl

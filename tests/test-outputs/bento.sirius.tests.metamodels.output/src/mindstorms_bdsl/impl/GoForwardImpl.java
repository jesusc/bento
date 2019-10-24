/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.GoForward;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.cmGoForward;
import mindstorms_bdsl.infiniteGoForward;
import mindstorms_bdsl.nameGoForward;

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
 * An implementation of the model object '<em><b>Go Forward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.GoForwardImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoForwardImpl#getCm <em>Cm</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoForwardImpl#isInfinite <em>Infinite</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoForwardImpl#getContainsnameGoForward <em>Containsname Go Forward</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoForwardImpl#getContainscmGoForward <em>Containscm Go Forward</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoForwardImpl#getContainsinfiniteGoForward <em>Containsinfinite Go Forward</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoForwardImpl extends ActionImpl implements GoForward {
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
	 * The cached value of the '{@link #getContainsnameGoForward() <em>Containsname Go Forward</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameGoForward()
	 * @generated
	 * @ordered
	 */
	protected EList<nameGoForward> containsnameGoForward;

	/**
	 * The cached value of the '{@link #getContainscmGoForward() <em>Containscm Go Forward</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainscmGoForward()
	 * @generated
	 * @ordered
	 */
	protected EList<cmGoForward> containscmGoForward;

	/**
	 * The cached value of the '{@link #getContainsinfiniteGoForward() <em>Containsinfinite Go Forward</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsinfiniteGoForward()
	 * @generated
	 * @ordered
	 */
	protected EList<infiniteGoForward> containsinfiniteGoForward;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoForwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.GO_FORWARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.GO_FORWARD__NONE_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.GO_FORWARD__CM, oldCm, cm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.GO_FORWARD__INFINITE, oldInfinite, infinite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameGoForward> getContainsnameGoForward() {
		if (containsnameGoForward == null) {
			containsnameGoForward = new EObjectContainmentEList<nameGoForward>(nameGoForward.class, this, Mindstorms_bdslPackage.GO_FORWARD__CONTAINSNAME_GO_FORWARD);
		}
		return containsnameGoForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cmGoForward> getContainscmGoForward() {
		if (containscmGoForward == null) {
			containscmGoForward = new EObjectContainmentEList<cmGoForward>(cmGoForward.class, this, Mindstorms_bdslPackage.GO_FORWARD__CONTAINSCM_GO_FORWARD);
		}
		return containscmGoForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<infiniteGoForward> getContainsinfiniteGoForward() {
		if (containsinfiniteGoForward == null) {
			containsinfiniteGoForward = new EObjectContainmentEList<infiniteGoForward>(infiniteGoForward.class, this, Mindstorms_bdslPackage.GO_FORWARD__CONTAINSINFINITE_GO_FORWARD);
		}
		return containsinfiniteGoForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSNAME_GO_FORWARD:
				return ((InternalEList<?>)getContainsnameGoForward()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSCM_GO_FORWARD:
				return ((InternalEList<?>)getContainscmGoForward()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSINFINITE_GO_FORWARD:
				return ((InternalEList<?>)getContainsinfiniteGoForward()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.GO_FORWARD__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.GO_FORWARD__CM:
				return getCm();
			case Mindstorms_bdslPackage.GO_FORWARD__INFINITE:
				return isInfinite();
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSNAME_GO_FORWARD:
				return getContainsnameGoForward();
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSCM_GO_FORWARD:
				return getContainscmGoForward();
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSINFINITE_GO_FORWARD:
				return getContainsinfiniteGoForward();
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
			case Mindstorms_bdslPackage.GO_FORWARD__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__CM:
				setCm((Integer)newValue);
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__INFINITE:
				setInfinite((Boolean)newValue);
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSNAME_GO_FORWARD:
				getContainsnameGoForward().clear();
				getContainsnameGoForward().addAll((Collection<? extends nameGoForward>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSCM_GO_FORWARD:
				getContainscmGoForward().clear();
				getContainscmGoForward().addAll((Collection<? extends cmGoForward>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSINFINITE_GO_FORWARD:
				getContainsinfiniteGoForward().clear();
				getContainsinfiniteGoForward().addAll((Collection<? extends infiniteGoForward>)newValue);
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
			case Mindstorms_bdslPackage.GO_FORWARD__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__CM:
				setCm(CM_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__INFINITE:
				setInfinite(INFINITE_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSNAME_GO_FORWARD:
				getContainsnameGoForward().clear();
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSCM_GO_FORWARD:
				getContainscmGoForward().clear();
				return;
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSINFINITE_GO_FORWARD:
				getContainsinfiniteGoForward().clear();
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
			case Mindstorms_bdslPackage.GO_FORWARD__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.GO_FORWARD__CM:
				return cm != CM_EDEFAULT;
			case Mindstorms_bdslPackage.GO_FORWARD__INFINITE:
				return infinite != INFINITE_EDEFAULT;
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSNAME_GO_FORWARD:
				return containsnameGoForward != null && !containsnameGoForward.isEmpty();
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSCM_GO_FORWARD:
				return containscmGoForward != null && !containscmGoForward.isEmpty();
			case Mindstorms_bdslPackage.GO_FORWARD__CONTAINSINFINITE_GO_FORWARD:
				return containsinfiniteGoForward != null && !containsinfiniteGoForward.isEmpty();
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
				case Mindstorms_bdslPackage.GO_FORWARD__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.GO_FORWARD__NONE_ELEMENT;
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

} //GoForwardImpl

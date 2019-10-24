/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.GoTo;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.nameGoTo;
import mindstorms_bdsl.xGoTo;
import mindstorms_bdsl.yGoTo;

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
 * An implementation of the model object '<em><b>Go To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.GoToImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoToImpl#getX <em>X</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoToImpl#getY <em>Y</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoToImpl#getContainsnameGoTo <em>Containsname Go To</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoToImpl#getContainsxGoTo <em>Containsx Go To</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.GoToImpl#getContainsyGoTo <em>Containsy Go To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoToImpl extends ActionImpl implements GoTo {
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
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameGoTo() <em>Containsname Go To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameGoTo()
	 * @generated
	 * @ordered
	 */
	protected EList<nameGoTo> containsnameGoTo;

	/**
	 * The cached value of the '{@link #getContainsxGoTo() <em>Containsx Go To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsxGoTo()
	 * @generated
	 * @ordered
	 */
	protected EList<xGoTo> containsxGoTo;

	/**
	 * The cached value of the '{@link #getContainsyGoTo() <em>Containsy Go To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsyGoTo()
	 * @generated
	 * @ordered
	 */
	protected EList<yGoTo> containsyGoTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.GO_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.GO_TO__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.GO_TO__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.GO_TO__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameGoTo> getContainsnameGoTo() {
		if (containsnameGoTo == null) {
			containsnameGoTo = new EObjectContainmentEList<nameGoTo>(nameGoTo.class, this, Mindstorms_bdslPackage.GO_TO__CONTAINSNAME_GO_TO);
		}
		return containsnameGoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<xGoTo> getContainsxGoTo() {
		if (containsxGoTo == null) {
			containsxGoTo = new EObjectContainmentEList<xGoTo>(xGoTo.class, this, Mindstorms_bdslPackage.GO_TO__CONTAINSX_GO_TO);
		}
		return containsxGoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<yGoTo> getContainsyGoTo() {
		if (containsyGoTo == null) {
			containsyGoTo = new EObjectContainmentEList<yGoTo>(yGoTo.class, this, Mindstorms_bdslPackage.GO_TO__CONTAINSY_GO_TO);
		}
		return containsyGoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.GO_TO__CONTAINSNAME_GO_TO:
				return ((InternalEList<?>)getContainsnameGoTo()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.GO_TO__CONTAINSX_GO_TO:
				return ((InternalEList<?>)getContainsxGoTo()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.GO_TO__CONTAINSY_GO_TO:
				return ((InternalEList<?>)getContainsyGoTo()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.GO_TO__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.GO_TO__X:
				return getX();
			case Mindstorms_bdslPackage.GO_TO__Y:
				return getY();
			case Mindstorms_bdslPackage.GO_TO__CONTAINSNAME_GO_TO:
				return getContainsnameGoTo();
			case Mindstorms_bdslPackage.GO_TO__CONTAINSX_GO_TO:
				return getContainsxGoTo();
			case Mindstorms_bdslPackage.GO_TO__CONTAINSY_GO_TO:
				return getContainsyGoTo();
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
			case Mindstorms_bdslPackage.GO_TO__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_TO__X:
				setX((Integer)newValue);
				return;
			case Mindstorms_bdslPackage.GO_TO__Y:
				setY((Integer)newValue);
				return;
			case Mindstorms_bdslPackage.GO_TO__CONTAINSNAME_GO_TO:
				getContainsnameGoTo().clear();
				getContainsnameGoTo().addAll((Collection<? extends nameGoTo>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_TO__CONTAINSX_GO_TO:
				getContainsxGoTo().clear();
				getContainsxGoTo().addAll((Collection<? extends xGoTo>)newValue);
				return;
			case Mindstorms_bdslPackage.GO_TO__CONTAINSY_GO_TO:
				getContainsyGoTo().clear();
				getContainsyGoTo().addAll((Collection<? extends yGoTo>)newValue);
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
			case Mindstorms_bdslPackage.GO_TO__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.GO_TO__X:
				setX(X_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.GO_TO__Y:
				setY(Y_EDEFAULT);
				return;
			case Mindstorms_bdslPackage.GO_TO__CONTAINSNAME_GO_TO:
				getContainsnameGoTo().clear();
				return;
			case Mindstorms_bdslPackage.GO_TO__CONTAINSX_GO_TO:
				getContainsxGoTo().clear();
				return;
			case Mindstorms_bdslPackage.GO_TO__CONTAINSY_GO_TO:
				getContainsyGoTo().clear();
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
			case Mindstorms_bdslPackage.GO_TO__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.GO_TO__X:
				return x != X_EDEFAULT;
			case Mindstorms_bdslPackage.GO_TO__Y:
				return y != Y_EDEFAULT;
			case Mindstorms_bdslPackage.GO_TO__CONTAINSNAME_GO_TO:
				return containsnameGoTo != null && !containsnameGoTo.isEmpty();
			case Mindstorms_bdslPackage.GO_TO__CONTAINSX_GO_TO:
				return containsxGoTo != null && !containsxGoTo.isEmpty();
			case Mindstorms_bdslPackage.GO_TO__CONTAINSY_GO_TO:
				return containsyGoTo != null && !containsyGoTo.isEmpty();
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
				case Mindstorms_bdslPackage.GO_TO__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.GO_TO__NONE_ELEMENT;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //GoToImpl

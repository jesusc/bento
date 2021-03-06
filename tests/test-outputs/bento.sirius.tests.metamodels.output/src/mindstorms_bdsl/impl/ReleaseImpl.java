/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.Release;
import mindstorms_bdsl.nameRelease;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.ReleaseImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ReleaseImpl#getContainsnameRelease <em>Containsname Release</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseImpl extends ActionImpl implements Release {
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
	 * The cached value of the '{@link #getContainsnameRelease() <em>Containsname Release</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameRelease()
	 * @generated
	 * @ordered
	 */
	protected EList<nameRelease> containsnameRelease;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.RELEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.RELEASE__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameRelease> getContainsnameRelease() {
		if (containsnameRelease == null) {
			containsnameRelease = new EObjectContainmentEList<nameRelease>(nameRelease.class, this, Mindstorms_bdslPackage.RELEASE__CONTAINSNAME_RELEASE);
		}
		return containsnameRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.RELEASE__CONTAINSNAME_RELEASE:
				return ((InternalEList<?>)getContainsnameRelease()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.RELEASE__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.RELEASE__CONTAINSNAME_RELEASE:
				return getContainsnameRelease();
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
			case Mindstorms_bdslPackage.RELEASE__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.RELEASE__CONTAINSNAME_RELEASE:
				getContainsnameRelease().clear();
				getContainsnameRelease().addAll((Collection<? extends nameRelease>)newValue);
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
			case Mindstorms_bdslPackage.RELEASE__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.RELEASE__CONTAINSNAME_RELEASE:
				getContainsnameRelease().clear();
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
			case Mindstorms_bdslPackage.RELEASE__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.RELEASE__CONTAINSNAME_RELEASE:
				return containsnameRelease != null && !containsnameRelease.isEmpty();
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
				case Mindstorms_bdslPackage.RELEASE__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.RELEASE__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReleaseImpl

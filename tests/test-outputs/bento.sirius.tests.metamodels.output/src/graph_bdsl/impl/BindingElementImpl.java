/**
 */
package graph_bdsl.impl;

import graph_bdsl.BindingElement;
import graph_bdsl.Graph_bdslPackage;
import graph_bdsl.NoneElement;
import graph_bdsl.SiriusTag;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.impl.BindingElementImpl#getContainsSiriusTag <em>Contains Sirius Tag</em>}</li>
 *   <li>{@link graph_bdsl.impl.BindingElementImpl#getNoneElement <em>None Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BindingElementImpl extends MinimalEObjectImpl.Container implements BindingElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graph_bdslPackage.Literals.BINDING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SiriusTag> getContainsSiriusTag() {
		if (containsSiriusTag == null) {
			containsSiriusTag = new EObjectContainmentEList<SiriusTag>(SiriusTag.class, this, Graph_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG);
		}
		return containsSiriusTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Graph_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graph_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG:
				return ((InternalEList<?>)getContainsSiriusTag()).basicRemove(otherEnd, msgs);
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
			case Graph_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG:
				return getContainsSiriusTag();
			case Graph_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT:
				return getNoneElement();
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
			case Graph_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				getContainsSiriusTag().addAll((Collection<? extends SiriusTag>)newValue);
				return;
			case Graph_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
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
			case Graph_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				return;
			case Graph_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT:
				getNoneElement().clear();
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
			case Graph_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG:
				return containsSiriusTag != null && !containsSiriusTag.isEmpty();
			case Graph_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BindingElementImpl

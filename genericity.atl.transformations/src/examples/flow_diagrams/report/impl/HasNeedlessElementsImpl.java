/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package examples.flow_diagrams.report.impl;

import examples.flow_diagrams.report.HasNeedlessElements;
import examples.flow_diagrams.report.Place;
import examples.flow_diagrams.report.ReportPackage;
import examples.flow_diagrams.report.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Needless Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link examples.flow_diagrams.report.impl.HasNeedlessElementsImpl#getNeedlessPlaces <em>Needless Places</em>}</li>
 *   <li>{@link examples.flow_diagrams.report.impl.HasNeedlessElementsImpl#getNeedlessTransitions <em>Needless Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasNeedlessElementsImpl extends ProblemImpl implements HasNeedlessElements {
	/**
	 * The cached value of the '{@link #getNeedlessPlaces() <em>Needless Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedlessPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList needlessPlaces;

	/**
	 * The cached value of the '{@link #getNeedlessTransitions() <em>Needless Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedlessTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList needlessTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasNeedlessElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ReportPackage.Literals.HAS_NEEDLESS_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNeedlessPlaces() {
		if (needlessPlaces == null) {
			needlessPlaces = new EObjectContainmentEList(Place.class, this, ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_PLACES);
		}
		return needlessPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNeedlessTransitions() {
		if (needlessTransitions == null) {
			needlessTransitions = new EObjectContainmentEList(Transition.class, this, ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_TRANSITIONS);
		}
		return needlessTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_PLACES:
				return ((InternalEList)getNeedlessPlaces()).basicRemove(otherEnd, msgs);
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_TRANSITIONS:
				return ((InternalEList)getNeedlessTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_PLACES:
				return getNeedlessPlaces();
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_TRANSITIONS:
				return getNeedlessTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_PLACES:
				getNeedlessPlaces().clear();
				getNeedlessPlaces().addAll((Collection)newValue);
				return;
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_TRANSITIONS:
				getNeedlessTransitions().clear();
				getNeedlessTransitions().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_PLACES:
				getNeedlessPlaces().clear();
				return;
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_TRANSITIONS:
				getNeedlessTransitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_PLACES:
				return needlessPlaces != null && !needlessPlaces.isEmpty();
			case ReportPackage.HAS_NEEDLESS_ELEMENTS__NEEDLESS_TRANSITIONS:
				return needlessTransitions != null && !needlessTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HasNeedlessElementsImpl

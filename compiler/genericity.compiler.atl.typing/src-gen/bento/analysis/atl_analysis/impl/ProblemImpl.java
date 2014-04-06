/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.impl;

import bento.analysis.atl_analysis.AtlAnalysisPackage;
import bento.analysis.atl_analysis.Problem;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.impl.ProblemImpl#getDependents <em>Dependents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProblemImpl extends AnalysisInfoImpl implements Problem {
	/**
	 * The cached value of the '{@link #getDependents() <em>Dependents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected EList<Problem> dependents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlAnalysisPackage.Literals.PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getDependents() {
		if (dependents == null) {
			dependents = new EObjectContainmentEList<Problem>(Problem.class, this, AtlAnalysisPackage.PROBLEM__DEPENDENTS);
		}
		return dependents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtlAnalysisPackage.PROBLEM__DEPENDENTS:
				return ((InternalEList<?>)getDependents()).basicRemove(otherEnd, msgs);
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
			case AtlAnalysisPackage.PROBLEM__DEPENDENTS:
				return getDependents();
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
			case AtlAnalysisPackage.PROBLEM__DEPENDENTS:
				getDependents().clear();
				getDependents().addAll((Collection<? extends Problem>)newValue);
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
			case AtlAnalysisPackage.PROBLEM__DEPENDENTS:
				getDependents().clear();
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
			case AtlAnalysisPackage.PROBLEM__DEPENDENTS:
				return dependents != null && !dependents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProblemImpl

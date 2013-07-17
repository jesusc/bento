/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package examples.flow_diagrams.report.impl;

import examples.flow_diagrams.report.Problem;
import examples.flow_diagrams.report.ProblemKind;
import examples.flow_diagrams.report.ReportPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link examples.flow_diagrams.report.impl.ProblemImpl#getProblemKind <em>Problem Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProblemImpl extends EObjectImpl implements Problem {
	/**
	 * The default value of the '{@link #getProblemKind() <em>Problem Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemKind()
	 * @generated
	 * @ordered
	 */
	protected static final ProblemKind PROBLEM_KIND_EDEFAULT = ProblemKind.ERROR_LITERAL;

	/**
	 * The cached value of the '{@link #getProblemKind() <em>Problem Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemKind()
	 * @generated
	 * @ordered
	 */
	protected ProblemKind problemKind = PROBLEM_KIND_EDEFAULT;

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
	protected EClass eStaticClass() {
		return ReportPackage.Literals.PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemKind getProblemKind() {
		return problemKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemKind(ProblemKind newProblemKind) {
		ProblemKind oldProblemKind = problemKind;
		problemKind = newProblemKind == null ? PROBLEM_KIND_EDEFAULT : newProblemKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.PROBLEM__PROBLEM_KIND, oldProblemKind, problemKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.PROBLEM__PROBLEM_KIND:
				return getProblemKind();
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
			case ReportPackage.PROBLEM__PROBLEM_KIND:
				setProblemKind((ProblemKind)newValue);
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
			case ReportPackage.PROBLEM__PROBLEM_KIND:
				setProblemKind(PROBLEM_KIND_EDEFAULT);
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
			case ReportPackage.PROBLEM__PROBLEM_KIND:
				return problemKind != PROBLEM_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (problemKind: ");
		result.append(problemKind);
		result.append(')');
		return result.toString();
	}

} //ProblemImpl

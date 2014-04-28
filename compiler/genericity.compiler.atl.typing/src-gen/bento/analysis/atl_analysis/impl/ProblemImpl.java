/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.impl;

import bento.analysis.atl_analysis.AtlAnalysisPackage;
import bento.analysis.atl_analysis.Problem;

import bento.analysis.atl_analysis.SeverityKind;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link bento.analysis.atl_analysis.impl.ProblemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.impl.ProblemImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.impl.ProblemImpl#isNeedsCSP <em>Needs CSP</em>}</li>
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityKind SEVERITY_EDEFAULT = SeverityKind.ERROR;
	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityKind severity = SEVERITY_EDEFAULT;
	/**
	 * The default value of the '{@link #isNeedsCSP() <em>Needs CSP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsCSP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_CSP_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNeedsCSP() <em>Needs CSP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsCSP()
	 * @generated
	 * @ordered
	 */
	protected boolean needsCSP = NEEDS_CSP_EDEFAULT;

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
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlAnalysisPackage.PROBLEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityKind getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(SeverityKind newSeverity) {
		SeverityKind oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlAnalysisPackage.PROBLEM__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsCSP() {
		return needsCSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsCSP(boolean newNeedsCSP) {
		boolean oldNeedsCSP = needsCSP;
		needsCSP = newNeedsCSP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlAnalysisPackage.PROBLEM__NEEDS_CSP, oldNeedsCSP, needsCSP));
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
			case AtlAnalysisPackage.PROBLEM__DESCRIPTION:
				return getDescription();
			case AtlAnalysisPackage.PROBLEM__SEVERITY:
				return getSeverity();
			case AtlAnalysisPackage.PROBLEM__NEEDS_CSP:
				return isNeedsCSP();
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
			case AtlAnalysisPackage.PROBLEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AtlAnalysisPackage.PROBLEM__SEVERITY:
				setSeverity((SeverityKind)newValue);
				return;
			case AtlAnalysisPackage.PROBLEM__NEEDS_CSP:
				setNeedsCSP((Boolean)newValue);
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
			case AtlAnalysisPackage.PROBLEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AtlAnalysisPackage.PROBLEM__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case AtlAnalysisPackage.PROBLEM__NEEDS_CSP:
				setNeedsCSP(NEEDS_CSP_EDEFAULT);
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
			case AtlAnalysisPackage.PROBLEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AtlAnalysisPackage.PROBLEM__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case AtlAnalysisPackage.PROBLEM__NEEDS_CSP:
				return needsCSP != NEEDS_CSP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", severity: ");
		result.append(severity);
		result.append(", needsCSP: ");
		result.append(needsCSP);
		result.append(')');
		return result.toString();
	}

} //ProblemImpl

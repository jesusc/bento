/**
 */
package bento.sirius.tests.metamodels.workflow.impl;

import bento.sirius.tests.metamodels.workflow.FinalTask;
import bento.sirius.tests.metamodels.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.impl.FinalTaskImpl#isIsTerminating <em>Is Terminating</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.impl.FinalTaskImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalTaskImpl extends NodeImpl implements FinalTask {
	/**
	 * The default value of the '{@link #isIsTerminating() <em>Is Terminating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TERMINATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTerminating() <em>Is Terminating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTerminating()
	 * @generated
	 * @ordered
	 */
	protected boolean isTerminating = IS_TERMINATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.FINAL_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTerminating() {
		return isTerminating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTerminating(boolean newIsTerminating) {
		boolean oldIsTerminating = isTerminating;
		isTerminating = newIsTerminating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.FINAL_TASK__IS_TERMINATING, oldIsTerminating, isTerminating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.FINAL_TASK__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.FINAL_TASK__IS_TERMINATING:
				return isIsTerminating();
			case WorkflowPackage.FINAL_TASK__IS_MANDATORY:
				return isIsMandatory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.FINAL_TASK__IS_TERMINATING:
				setIsTerminating((Boolean)newValue);
				return;
			case WorkflowPackage.FINAL_TASK__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
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
			case WorkflowPackage.FINAL_TASK__IS_TERMINATING:
				setIsTerminating(IS_TERMINATING_EDEFAULT);
				return;
			case WorkflowPackage.FINAL_TASK__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
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
			case WorkflowPackage.FINAL_TASK__IS_TERMINATING:
				return isTerminating != IS_TERMINATING_EDEFAULT;
			case WorkflowPackage.FINAL_TASK__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isTerminating: ");
		result.append(isTerminating);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(')');
		return result.toString();
	}

} //FinalTaskImpl

/**
 */
package workflow_bdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow_bdsl.BindingElement;
import workflow_bdsl.FinalTask;
import workflow_bdsl.NoneElement;
import workflow_bdsl.Workflow_bdslPackage;
import workflow_bdsl.isMandatoryFinalTask;
import workflow_bdsl.isTerminatingFinalTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow_bdsl.impl.FinalTaskImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FinalTaskImpl#isIsTerminating <em>Is Terminating</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FinalTaskImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FinalTaskImpl#getContainsisTerminatingFinalTask <em>Containsis Terminating Final Task</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FinalTaskImpl#getContainsisMandatoryFinalTask <em>Containsis Mandatory Final Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalTaskImpl extends NodeImpl implements FinalTask {
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
	 * The cached value of the '{@link #getContainsisTerminatingFinalTask() <em>Containsis Terminating Final Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsisTerminatingFinalTask()
	 * @generated
	 * @ordered
	 */
	protected EList<isTerminatingFinalTask> containsisTerminatingFinalTask;

	/**
	 * The cached value of the '{@link #getContainsisMandatoryFinalTask() <em>Containsis Mandatory Final Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsisMandatoryFinalTask()
	 * @generated
	 * @ordered
	 */
	protected EList<isMandatoryFinalTask> containsisMandatoryFinalTask;

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
		return Workflow_bdslPackage.Literals.FINAL_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Workflow_bdslPackage.FINAL_TASK__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTerminating() {
		return isTerminating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTerminating(boolean newIsTerminating) {
		boolean oldIsTerminating = isTerminating;
		isTerminating = newIsTerminating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Workflow_bdslPackage.FINAL_TASK__IS_TERMINATING, oldIsTerminating, isTerminating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Workflow_bdslPackage.FINAL_TASK__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<isTerminatingFinalTask> getContainsisTerminatingFinalTask() {
		if (containsisTerminatingFinalTask == null) {
			containsisTerminatingFinalTask = new EObjectContainmentEList<isTerminatingFinalTask>(isTerminatingFinalTask.class, this, Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_TERMINATING_FINAL_TASK);
		}
		return containsisTerminatingFinalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<isMandatoryFinalTask> getContainsisMandatoryFinalTask() {
		if (containsisMandatoryFinalTask == null) {
			containsisMandatoryFinalTask = new EObjectContainmentEList<isMandatoryFinalTask>(isMandatoryFinalTask.class, this, Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_MANDATORY_FINAL_TASK);
		}
		return containsisMandatoryFinalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_TERMINATING_FINAL_TASK:
				return ((InternalEList<?>)getContainsisTerminatingFinalTask()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_MANDATORY_FINAL_TASK:
				return ((InternalEList<?>)getContainsisMandatoryFinalTask()).basicRemove(otherEnd, msgs);
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
			case Workflow_bdslPackage.FINAL_TASK__NONE_ELEMENT:
				return getNoneElement();
			case Workflow_bdslPackage.FINAL_TASK__IS_TERMINATING:
				return isIsTerminating();
			case Workflow_bdslPackage.FINAL_TASK__IS_MANDATORY:
				return isIsMandatory();
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_TERMINATING_FINAL_TASK:
				return getContainsisTerminatingFinalTask();
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_MANDATORY_FINAL_TASK:
				return getContainsisMandatoryFinalTask();
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
			case Workflow_bdslPackage.FINAL_TASK__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Workflow_bdslPackage.FINAL_TASK__IS_TERMINATING:
				setIsTerminating((Boolean)newValue);
				return;
			case Workflow_bdslPackage.FINAL_TASK__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_TERMINATING_FINAL_TASK:
				getContainsisTerminatingFinalTask().clear();
				getContainsisTerminatingFinalTask().addAll((Collection<? extends isTerminatingFinalTask>)newValue);
				return;
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_MANDATORY_FINAL_TASK:
				getContainsisMandatoryFinalTask().clear();
				getContainsisMandatoryFinalTask().addAll((Collection<? extends isMandatoryFinalTask>)newValue);
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
			case Workflow_bdslPackage.FINAL_TASK__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Workflow_bdslPackage.FINAL_TASK__IS_TERMINATING:
				setIsTerminating(IS_TERMINATING_EDEFAULT);
				return;
			case Workflow_bdslPackage.FINAL_TASK__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_TERMINATING_FINAL_TASK:
				getContainsisTerminatingFinalTask().clear();
				return;
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_MANDATORY_FINAL_TASK:
				getContainsisMandatoryFinalTask().clear();
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
			case Workflow_bdslPackage.FINAL_TASK__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Workflow_bdslPackage.FINAL_TASK__IS_TERMINATING:
				return isTerminating != IS_TERMINATING_EDEFAULT;
			case Workflow_bdslPackage.FINAL_TASK__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_TERMINATING_FINAL_TASK:
				return containsisTerminatingFinalTask != null && !containsisTerminatingFinalTask.isEmpty();
			case Workflow_bdslPackage.FINAL_TASK__CONTAINSIS_MANDATORY_FINAL_TASK:
				return containsisMandatoryFinalTask != null && !containsisMandatoryFinalTask.isEmpty();
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
				case Workflow_bdslPackage.FINAL_TASK__NONE_ELEMENT: return Workflow_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Workflow_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Workflow_bdslPackage.FINAL_TASK__NONE_ELEMENT;
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
		result.append(" (isTerminating: ");
		result.append(isTerminating);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(')');
		return result.toString();
	}

} //FinalTaskImpl

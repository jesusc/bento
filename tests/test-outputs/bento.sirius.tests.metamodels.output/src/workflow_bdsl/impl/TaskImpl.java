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
import workflow_bdsl.NoneElement;
import workflow_bdsl.Task;
import workflow_bdsl.Workflow_bdslPackage;
import workflow_bdsl.isInitialTask;
import workflow_bdsl.nameTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow_bdsl.impl.TaskImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link workflow_bdsl.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow_bdsl.impl.TaskImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link workflow_bdsl.impl.TaskImpl#getContainsnameTask <em>Containsname Task</em>}</li>
 *   <li>{@link workflow_bdsl.impl.TaskImpl#getContainsisInitialTask <em>Containsis Initial Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NodeImpl implements Task {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameTask() <em>Containsname Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameTask()
	 * @generated
	 * @ordered
	 */
	protected EList<nameTask> containsnameTask;

	/**
	 * The cached value of the '{@link #getContainsisInitialTask() <em>Containsis Initial Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsisInitialTask()
	 * @generated
	 * @ordered
	 */
	protected EList<isInitialTask> containsisInitialTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Workflow_bdslPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Workflow_bdslPackage.TASK__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Workflow_bdslPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInitial() {
		return isInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Workflow_bdslPackage.TASK__IS_INITIAL, oldIsInitial, isInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameTask> getContainsnameTask() {
		if (containsnameTask == null) {
			containsnameTask = new EObjectContainmentEList<nameTask>(nameTask.class, this, Workflow_bdslPackage.TASK__CONTAINSNAME_TASK);
		}
		return containsnameTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<isInitialTask> getContainsisInitialTask() {
		if (containsisInitialTask == null) {
			containsisInitialTask = new EObjectContainmentEList<isInitialTask>(isInitialTask.class, this, Workflow_bdslPackage.TASK__CONTAINSIS_INITIAL_TASK);
		}
		return containsisInitialTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Workflow_bdslPackage.TASK__CONTAINSNAME_TASK:
				return ((InternalEList<?>)getContainsnameTask()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.TASK__CONTAINSIS_INITIAL_TASK:
				return ((InternalEList<?>)getContainsisInitialTask()).basicRemove(otherEnd, msgs);
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
			case Workflow_bdslPackage.TASK__NONE_ELEMENT:
				return getNoneElement();
			case Workflow_bdslPackage.TASK__NAME:
				return getName();
			case Workflow_bdslPackage.TASK__IS_INITIAL:
				return isIsInitial();
			case Workflow_bdslPackage.TASK__CONTAINSNAME_TASK:
				return getContainsnameTask();
			case Workflow_bdslPackage.TASK__CONTAINSIS_INITIAL_TASK:
				return getContainsisInitialTask();
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
			case Workflow_bdslPackage.TASK__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Workflow_bdslPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case Workflow_bdslPackage.TASK__IS_INITIAL:
				setIsInitial((Boolean)newValue);
				return;
			case Workflow_bdslPackage.TASK__CONTAINSNAME_TASK:
				getContainsnameTask().clear();
				getContainsnameTask().addAll((Collection<? extends nameTask>)newValue);
				return;
			case Workflow_bdslPackage.TASK__CONTAINSIS_INITIAL_TASK:
				getContainsisInitialTask().clear();
				getContainsisInitialTask().addAll((Collection<? extends isInitialTask>)newValue);
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
			case Workflow_bdslPackage.TASK__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Workflow_bdslPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Workflow_bdslPackage.TASK__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
				return;
			case Workflow_bdslPackage.TASK__CONTAINSNAME_TASK:
				getContainsnameTask().clear();
				return;
			case Workflow_bdslPackage.TASK__CONTAINSIS_INITIAL_TASK:
				getContainsisInitialTask().clear();
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
			case Workflow_bdslPackage.TASK__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Workflow_bdslPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Workflow_bdslPackage.TASK__IS_INITIAL:
				return isInitial != IS_INITIAL_EDEFAULT;
			case Workflow_bdslPackage.TASK__CONTAINSNAME_TASK:
				return containsnameTask != null && !containsnameTask.isEmpty();
			case Workflow_bdslPackage.TASK__CONTAINSIS_INITIAL_TASK:
				return containsisInitialTask != null && !containsisInitialTask.isEmpty();
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
				case Workflow_bdslPackage.TASK__NONE_ELEMENT: return Workflow_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Workflow_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Workflow_bdslPackage.TASK__NONE_ELEMENT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isInitial: ");
		result.append(isInitial);
		result.append(')');
		return result.toString();
	}

} //TaskImpl

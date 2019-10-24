/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.Output;
import metamodel_bdsl.OutputType;
import metamodel_bdsl.ProcessOutputFlow;
import metamodel_bdsl.descriptionOutput;
import metamodel_bdsl.processOutputFlowOutput51;
import metamodel_bdsl.typeOutput;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.OutputImpl#getType <em>Type</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OutputImpl#getProcessOutputFlow <em>Process Output Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OutputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OutputImpl#getEref_processOutputFlowOutput51 <em>Eref process Output Flow Output51</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OutputImpl#getContainstypeOutput <em>Containstype Output</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OutputImpl#getContainsdescriptionOutput <em>Containsdescription Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends BindingElementImpl implements Output {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OutputType TYPE_EDEFAULT = OutputType.SUCCESS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OutputType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessOutputFlow() <em>Process Output Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessOutputFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessOutputFlow> processOutputFlow;

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
	 * The cached value of the '{@link #getEref_processOutputFlowOutput51() <em>Eref process Output Flow Output51</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_processOutputFlowOutput51()
	 * @generated
	 * @ordered
	 */
	protected processOutputFlowOutput51 eref_processOutputFlowOutput51;

	/**
	 * The cached value of the '{@link #getContainstypeOutput() <em>Containstype Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainstypeOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<typeOutput> containstypeOutput;

	/**
	 * The cached value of the '{@link #getContainsdescriptionOutput() <em>Containsdescription Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsdescriptionOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<descriptionOutput> containsdescriptionOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OutputType newType) {
		OutputType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.OUTPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessOutputFlow> getProcessOutputFlow() {
		if (processOutputFlow == null) {
			processOutputFlow = new EObjectWithInverseResolvingEList<ProcessOutputFlow>(ProcessOutputFlow.class, this, Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE);
		}
		return processOutputFlow;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.OUTPUT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processOutputFlowOutput51 getEref_processOutputFlowOutput51() {
		return eref_processOutputFlowOutput51;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_processOutputFlowOutput51(processOutputFlowOutput51 newEref_processOutputFlowOutput51, NotificationChain msgs) {
		processOutputFlowOutput51 oldEref_processOutputFlowOutput51 = eref_processOutputFlowOutput51;
		eref_processOutputFlowOutput51 = newEref_processOutputFlowOutput51;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51, oldEref_processOutputFlowOutput51, newEref_processOutputFlowOutput51);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_processOutputFlowOutput51(processOutputFlowOutput51 newEref_processOutputFlowOutput51) {
		if (newEref_processOutputFlowOutput51 != eref_processOutputFlowOutput51) {
			NotificationChain msgs = null;
			if (eref_processOutputFlowOutput51 != null)
				msgs = ((InternalEObject)eref_processOutputFlowOutput51).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51, null, msgs);
			if (newEref_processOutputFlowOutput51 != null)
				msgs = ((InternalEObject)newEref_processOutputFlowOutput51).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51, null, msgs);
			msgs = basicSetEref_processOutputFlowOutput51(newEref_processOutputFlowOutput51, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51, newEref_processOutputFlowOutput51, newEref_processOutputFlowOutput51));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<typeOutput> getContainstypeOutput() {
		if (containstypeOutput == null) {
			containstypeOutput = new EObjectContainmentEList<typeOutput>(typeOutput.class, this, Metamodel_bdslPackage.OUTPUT__CONTAINSTYPE_OUTPUT);
		}
		return containstypeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<descriptionOutput> getContainsdescriptionOutput() {
		if (containsdescriptionOutput == null) {
			containsdescriptionOutput = new EObjectContainmentEList<descriptionOutput>(descriptionOutput.class, this, Metamodel_bdslPackage.OUTPUT__CONTAINSDESCRIPTION_OUTPUT);
		}
		return containsdescriptionOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessOutputFlow()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW:
				return ((InternalEList<?>)getProcessOutputFlow()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51:
				return basicSetEref_processOutputFlowOutput51(null, msgs);
			case Metamodel_bdslPackage.OUTPUT__CONTAINSTYPE_OUTPUT:
				return ((InternalEList<?>)getContainstypeOutput()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.OUTPUT__CONTAINSDESCRIPTION_OUTPUT:
				return ((InternalEList<?>)getContainsdescriptionOutput()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.OUTPUT__TYPE:
				return getType();
			case Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW:
				return getProcessOutputFlow();
			case Metamodel_bdslPackage.OUTPUT__DESCRIPTION:
				return getDescription();
			case Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51:
				return getEref_processOutputFlowOutput51();
			case Metamodel_bdslPackage.OUTPUT__CONTAINSTYPE_OUTPUT:
				return getContainstypeOutput();
			case Metamodel_bdslPackage.OUTPUT__CONTAINSDESCRIPTION_OUTPUT:
				return getContainsdescriptionOutput();
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
			case Metamodel_bdslPackage.OUTPUT__TYPE:
				setType((OutputType)newValue);
				return;
			case Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW:
				getProcessOutputFlow().clear();
				getProcessOutputFlow().addAll((Collection<? extends ProcessOutputFlow>)newValue);
				return;
			case Metamodel_bdslPackage.OUTPUT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51:
				setEref_processOutputFlowOutput51((processOutputFlowOutput51)newValue);
				return;
			case Metamodel_bdslPackage.OUTPUT__CONTAINSTYPE_OUTPUT:
				getContainstypeOutput().clear();
				getContainstypeOutput().addAll((Collection<? extends typeOutput>)newValue);
				return;
			case Metamodel_bdslPackage.OUTPUT__CONTAINSDESCRIPTION_OUTPUT:
				getContainsdescriptionOutput().clear();
				getContainsdescriptionOutput().addAll((Collection<? extends descriptionOutput>)newValue);
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
			case Metamodel_bdslPackage.OUTPUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW:
				getProcessOutputFlow().clear();
				return;
			case Metamodel_bdslPackage.OUTPUT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51:
				setEref_processOutputFlowOutput51((processOutputFlowOutput51)null);
				return;
			case Metamodel_bdslPackage.OUTPUT__CONTAINSTYPE_OUTPUT:
				getContainstypeOutput().clear();
				return;
			case Metamodel_bdslPackage.OUTPUT__CONTAINSDESCRIPTION_OUTPUT:
				getContainsdescriptionOutput().clear();
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
			case Metamodel_bdslPackage.OUTPUT__TYPE:
				return type != TYPE_EDEFAULT;
			case Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW:
				return processOutputFlow != null && !processOutputFlow.isEmpty();
			case Metamodel_bdslPackage.OUTPUT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Metamodel_bdslPackage.OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51:
				return eref_processOutputFlowOutput51 != null;
			case Metamodel_bdslPackage.OUTPUT__CONTAINSTYPE_OUTPUT:
				return containstypeOutput != null && !containstypeOutput.isEmpty();
			case Metamodel_bdslPackage.OUTPUT__CONTAINSDESCRIPTION_OUTPUT:
				return containsdescriptionOutput != null && !containsdescriptionOutput.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //OutputImpl

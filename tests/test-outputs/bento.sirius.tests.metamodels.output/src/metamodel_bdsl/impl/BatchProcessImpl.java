/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BatchProcess;
import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.Output;
import metamodel_bdsl.nameBatchProcess;
import metamodel_bdsl.numberOfChainsBatchProcess;
import metamodel_bdsl.percentageOfSuccessBatchProcess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batch Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.BatchProcessImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.BatchProcessImpl#getPercentageOfSuccess <em>Percentage Of Success</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.BatchProcessImpl#getNumberOfChains <em>Number Of Chains</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.BatchProcessImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.BatchProcessImpl#getContainsnameBatchProcess <em>Containsname Batch Process</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.BatchProcessImpl#getContainspercentageOfSuccessBatchProcess <em>Containspercentage Of Success Batch Process</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.BatchProcessImpl#getContainsnumberOfChainsBatchProcess <em>Containsnumber Of Chains Batch Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatchProcessImpl extends ProcessImpl implements BatchProcess {
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
	 * The default value of the '{@link #getPercentageOfSuccess() <em>Percentage Of Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final Double PERCENTAGE_OF_SUCCESS_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getPercentageOfSuccess() <em>Percentage Of Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfSuccess()
	 * @generated
	 * @ordered
	 */
	protected Double percentageOfSuccess = PERCENTAGE_OF_SUCCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfChains() <em>Number Of Chains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfChains()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_CHAINS_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getNumberOfChains() <em>Number Of Chains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfChains()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfChains = NUMBER_OF_CHAINS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getContainsnameBatchProcess() <em>Containsname Batch Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameBatchProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<nameBatchProcess> containsnameBatchProcess;

	/**
	 * The cached value of the '{@link #getContainspercentageOfSuccessBatchProcess() <em>Containspercentage Of Success Batch Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainspercentageOfSuccessBatchProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<percentageOfSuccessBatchProcess> containspercentageOfSuccessBatchProcess;

	/**
	 * The cached value of the '{@link #getContainsnumberOfChainsBatchProcess() <em>Containsnumber Of Chains Batch Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnumberOfChainsBatchProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<numberOfChainsBatchProcess> containsnumberOfChainsBatchProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatchProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.BATCH_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.BATCH_PROCESS__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPercentageOfSuccess() {
		return percentageOfSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfSuccess(Double newPercentageOfSuccess) {
		Double oldPercentageOfSuccess = percentageOfSuccess;
		percentageOfSuccess = newPercentageOfSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.BATCH_PROCESS__PERCENTAGE_OF_SUCCESS, oldPercentageOfSuccess, percentageOfSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfChains() {
		return numberOfChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfChains(Integer newNumberOfChains) {
		Integer oldNumberOfChains = numberOfChains;
		numberOfChains = newNumberOfChains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.BATCH_PROCESS__NUMBER_OF_CHAINS, oldNumberOfChains, numberOfChains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, Metamodel_bdslPackage.BATCH_PROCESS__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameBatchProcess> getContainsnameBatchProcess() {
		if (containsnameBatchProcess == null) {
			containsnameBatchProcess = new EObjectContainmentEList<nameBatchProcess>(nameBatchProcess.class, this, Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS);
		}
		return containsnameBatchProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<percentageOfSuccessBatchProcess> getContainspercentageOfSuccessBatchProcess() {
		if (containspercentageOfSuccessBatchProcess == null) {
			containspercentageOfSuccessBatchProcess = new EObjectContainmentEList<percentageOfSuccessBatchProcess>(percentageOfSuccessBatchProcess.class, this, Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS);
		}
		return containspercentageOfSuccessBatchProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<numberOfChainsBatchProcess> getContainsnumberOfChainsBatchProcess() {
		if (containsnumberOfChainsBatchProcess == null) {
			containsnumberOfChainsBatchProcess = new EObjectContainmentEList<numberOfChainsBatchProcess>(numberOfChainsBatchProcess.class, this, Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS);
		}
		return containsnumberOfChainsBatchProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.BATCH_PROCESS__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS:
				return ((InternalEList<?>)getContainsnameBatchProcess()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS:
				return ((InternalEList<?>)getContainspercentageOfSuccessBatchProcess()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS:
				return ((InternalEList<?>)getContainsnumberOfChainsBatchProcess()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.BATCH_PROCESS__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.BATCH_PROCESS__PERCENTAGE_OF_SUCCESS:
				return getPercentageOfSuccess();
			case Metamodel_bdslPackage.BATCH_PROCESS__NUMBER_OF_CHAINS:
				return getNumberOfChains();
			case Metamodel_bdslPackage.BATCH_PROCESS__OUTPUTS:
				return getOutputs();
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS:
				return getContainsnameBatchProcess();
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS:
				return getContainspercentageOfSuccessBatchProcess();
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS:
				return getContainsnumberOfChainsBatchProcess();
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
			case Metamodel_bdslPackage.BATCH_PROCESS__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__PERCENTAGE_OF_SUCCESS:
				setPercentageOfSuccess((Double)newValue);
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__NUMBER_OF_CHAINS:
				setNumberOfChains((Integer)newValue);
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Output>)newValue);
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS:
				getContainsnameBatchProcess().clear();
				getContainsnameBatchProcess().addAll((Collection<? extends nameBatchProcess>)newValue);
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS:
				getContainspercentageOfSuccessBatchProcess().clear();
				getContainspercentageOfSuccessBatchProcess().addAll((Collection<? extends percentageOfSuccessBatchProcess>)newValue);
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS:
				getContainsnumberOfChainsBatchProcess().clear();
				getContainsnumberOfChainsBatchProcess().addAll((Collection<? extends numberOfChainsBatchProcess>)newValue);
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
			case Metamodel_bdslPackage.BATCH_PROCESS__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__PERCENTAGE_OF_SUCCESS:
				setPercentageOfSuccess(PERCENTAGE_OF_SUCCESS_EDEFAULT);
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__NUMBER_OF_CHAINS:
				setNumberOfChains(NUMBER_OF_CHAINS_EDEFAULT);
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__OUTPUTS:
				getOutputs().clear();
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS:
				getContainsnameBatchProcess().clear();
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS:
				getContainspercentageOfSuccessBatchProcess().clear();
				return;
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS:
				getContainsnumberOfChainsBatchProcess().clear();
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
			case Metamodel_bdslPackage.BATCH_PROCESS__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.BATCH_PROCESS__PERCENTAGE_OF_SUCCESS:
				return PERCENTAGE_OF_SUCCESS_EDEFAULT == null ? percentageOfSuccess != null : !PERCENTAGE_OF_SUCCESS_EDEFAULT.equals(percentageOfSuccess);
			case Metamodel_bdslPackage.BATCH_PROCESS__NUMBER_OF_CHAINS:
				return NUMBER_OF_CHAINS_EDEFAULT == null ? numberOfChains != null : !NUMBER_OF_CHAINS_EDEFAULT.equals(numberOfChains);
			case Metamodel_bdslPackage.BATCH_PROCESS__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS:
				return containsnameBatchProcess != null && !containsnameBatchProcess.isEmpty();
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS:
				return containspercentageOfSuccessBatchProcess != null && !containspercentageOfSuccessBatchProcess.isEmpty();
			case Metamodel_bdslPackage.BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS:
				return containsnumberOfChainsBatchProcess != null && !containsnumberOfChainsBatchProcess.isEmpty();
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
				case Metamodel_bdslPackage.BATCH_PROCESS__NONE_ELEMENT: return Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Metamodel_bdslPackage.BATCH_PROCESS__NONE_ELEMENT;
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
		result.append(" (percentageOfSuccess: ");
		result.append(percentageOfSuccess);
		result.append(", numberOfChains: ");
		result.append(numberOfChains);
		result.append(')');
		return result.toString();
	}

} //BatchProcessImpl

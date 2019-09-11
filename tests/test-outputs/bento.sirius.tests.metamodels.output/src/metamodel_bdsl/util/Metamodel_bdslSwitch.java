/**
 */
package metamodel_bdsl.util;

import metamodel_bdsl.BatchProcess;
import metamodel_bdsl.BindingAttribute;
import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Component;
import metamodel_bdsl.ConveyorBelt;
import metamodel_bdsl.Distribution;
import metamodel_bdsl.Flow;
import metamodel_bdsl.Gaussian;
import metamodel_bdsl.IntermediateElement;
import metamodel_bdsl.MetamodelElement;
import metamodel_bdsl.MetamodelElementFeature;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.Model;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.OrderOnStockThreshold;
import metamodel_bdsl.Output;
import metamodel_bdsl.Poisson;
import metamodel_bdsl.Probability;
import metamodel_bdsl.ProcessOutputFlow;
import metamodel_bdsl.Query;
import metamodel_bdsl.Scalar;
import metamodel_bdsl.Storage;
import metamodel_bdsl.StorageOutputFlow;
import metamodel_bdsl.Supplier;
import metamodel_bdsl.Uniform;
import metamodel_bdsl.VirtualAttribute;
import metamodel_bdsl.deliveredPercentageSupplier;
import metamodel_bdsl.descriptionOutput;
import metamodel_bdsl.errorQuery;
import metamodel_bdsl.initialContentStorage;
import metamodel_bdsl.intervalPoisson;
import metamodel_bdsl.locationGaussian;
import metamodel_bdsl.maximumUniform;
import metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt;
import metamodel_bdsl.minimumUniform;
import metamodel_bdsl.nameBatchProcess;
import metamodel_bdsl.nameConveyorBelt;
import metamodel_bdsl.nameOrderOnStockThreshold;
import metamodel_bdsl.nameQuery;
import metamodel_bdsl.nameStorage;
import metamodel_bdsl.nameSupplier;
import metamodel_bdsl.numberOfChainsBatchProcess;
import metamodel_bdsl.orderQuantityOrderOnStockThreshold;
import metamodel_bdsl.orderTypeOrderOnStockThreshold;
import metamodel_bdsl.overflowStorage;
import metamodel_bdsl.percentageOfSuccessBatchProcess;
import metamodel_bdsl.periodOrderOnStockThreshold;
import metamodel_bdsl.scaleGaussian;
import metamodel_bdsl.sizeStorage;
import metamodel_bdsl.systemQuery;
import metamodel_bdsl.thresholdOrderOnStockThreshold;
import metamodel_bdsl.typeOutput;
import metamodel_bdsl.typeQuery;
import metamodel_bdsl.valueQuery;
import metamodel_bdsl.valueScalar;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metamodel_bdsl.Metamodel_bdslPackage
 * @generated
 */
public class Metamodel_bdslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Metamodel_bdslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel_bdslSwitch() {
		if (modelPackage == null) {
			modelPackage = Metamodel_bdslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Metamodel_bdslPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseBindingElement(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseComponent(storage);
				if (result == null) result = caseBindingElement(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SUPPLIER: {
				Supplier supplier = (Supplier)theEObject;
				T result = caseSupplier(supplier);
				if (result == null) result = caseComponent(supplier);
				if (result == null) result = caseBindingElement(supplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.BATCH_PROCESS: {
				BatchProcess batchProcess = (BatchProcess)theEObject;
				T result = caseBatchProcess(batchProcess);
				if (result == null) result = caseProcess(batchProcess);
				if (result == null) result = caseBindingElement(batchProcess);
				if (result == null) result = caseComponent(batchProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseBindingElement(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW: {
				StorageOutputFlow storageOutputFlow = (StorageOutputFlow)theEObject;
				T result = caseStorageOutputFlow(storageOutputFlow);
				if (result == null) result = caseFlow(storageOutputFlow);
				if (result == null) result = caseBindingElement(storageOutputFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW: {
				ProcessOutputFlow processOutputFlow = (ProcessOutputFlow)theEObject;
				T result = caseProcessOutputFlow(processOutputFlow);
				if (result == null) result = caseFlow(processOutputFlow);
				if (result == null) result = caseBindingElement(processOutputFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.PROCESS: {
				metamodel_bdsl.Process process = (metamodel_bdsl.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseComponent(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD: {
				OrderOnStockThreshold orderOnStockThreshold = (OrderOnStockThreshold)theEObject;
				T result = caseOrderOnStockThreshold(orderOnStockThreshold);
				if (result == null) result = caseBindingElement(orderOnStockThreshold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.PROBABILITY: {
				Probability probability = (Probability)theEObject;
				T result = caseProbability(probability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.DISTRIBUTION: {
				Distribution distribution = (Distribution)theEObject;
				T result = caseDistribution(distribution);
				if (result == null) result = caseProbability(distribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SCALAR: {
				Scalar scalar = (Scalar)theEObject;
				T result = caseScalar(scalar);
				if (result == null) result = caseProbability(scalar);
				if (result == null) result = caseBindingElement(scalar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.GAUSSIAN: {
				Gaussian gaussian = (Gaussian)theEObject;
				T result = caseGaussian(gaussian);
				if (result == null) result = caseDistribution(gaussian);
				if (result == null) result = caseBindingElement(gaussian);
				if (result == null) result = caseProbability(gaussian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.POISSON: {
				Poisson poisson = (Poisson)theEObject;
				T result = casePoisson(poisson);
				if (result == null) result = caseDistribution(poisson);
				if (result == null) result = caseBindingElement(poisson);
				if (result == null) result = caseProbability(poisson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.UNIFORM: {
				Uniform uniform = (Uniform)theEObject;
				T result = caseUniform(uniform);
				if (result == null) result = caseDistribution(uniform);
				if (result == null) result = caseBindingElement(uniform);
				if (result == null) result = caseProbability(uniform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.CONVEYOR_BELT: {
				ConveyorBelt conveyorBelt = (ConveyorBelt)theEObject;
				T result = caseConveyorBelt(conveyorBelt);
				if (result == null) result = caseProcess(conveyorBelt);
				if (result == null) result = caseBindingElement(conveyorBelt);
				if (result == null) result = caseComponent(conveyorBelt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.NAME_QUERY: {
				nameQuery nameQuery = (nameQuery)theEObject;
				T result = casenameQuery(nameQuery);
				if (result == null) result = caseBindingAttribute(nameQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.VALUE_QUERY: {
				valueQuery valueQuery = (valueQuery)theEObject;
				T result = casevalueQuery(valueQuery);
				if (result == null) result = caseBindingAttribute(valueQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.ERROR_QUERY: {
				errorQuery errorQuery = (errorQuery)theEObject;
				T result = caseerrorQuery(errorQuery);
				if (result == null) result = caseBindingAttribute(errorQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.TYPE_QUERY: {
				typeQuery typeQuery = (typeQuery)theEObject;
				T result = casetypeQuery(typeQuery);
				if (result == null) result = caseBindingAttribute(typeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SYSTEM_QUERY: {
				systemQuery systemQuery = (systemQuery)theEObject;
				T result = casesystemQuery(systemQuery);
				if (result == null) result = caseBindingAttribute(systemQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.NAME_STORAGE: {
				nameStorage nameStorage = (nameStorage)theEObject;
				T result = casenameStorage(nameStorage);
				if (result == null) result = caseBindingAttribute(nameStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SIZE_STORAGE: {
				sizeStorage sizeStorage = (sizeStorage)theEObject;
				T result = casesizeStorage(sizeStorage);
				if (result == null) result = caseBindingAttribute(sizeStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.INITIAL_CONTENT_STORAGE: {
				initialContentStorage initialContentStorage = (initialContentStorage)theEObject;
				T result = caseinitialContentStorage(initialContentStorage);
				if (result == null) result = caseBindingAttribute(initialContentStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.OVERFLOW_STORAGE: {
				overflowStorage overflowStorage = (overflowStorage)theEObject;
				T result = caseoverflowStorage(overflowStorage);
				if (result == null) result = caseBindingAttribute(overflowStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.NAME_SUPPLIER: {
				nameSupplier nameSupplier = (nameSupplier)theEObject;
				T result = casenameSupplier(nameSupplier);
				if (result == null) result = caseBindingAttribute(nameSupplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.DELIVERED_PERCENTAGE_SUPPLIER: {
				deliveredPercentageSupplier deliveredPercentageSupplier = (deliveredPercentageSupplier)theEObject;
				T result = casedeliveredPercentageSupplier(deliveredPercentageSupplier);
				if (result == null) result = caseBindingAttribute(deliveredPercentageSupplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.NAME_BATCH_PROCESS: {
				nameBatchProcess nameBatchProcess = (nameBatchProcess)theEObject;
				T result = casenameBatchProcess(nameBatchProcess);
				if (result == null) result = caseBindingAttribute(nameBatchProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.PERCENTAGE_OF_SUCCESS_BATCH_PROCESS: {
				percentageOfSuccessBatchProcess percentageOfSuccessBatchProcess = (percentageOfSuccessBatchProcess)theEObject;
				T result = casepercentageOfSuccessBatchProcess(percentageOfSuccessBatchProcess);
				if (result == null) result = caseBindingAttribute(percentageOfSuccessBatchProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.NUMBER_OF_CHAINS_BATCH_PROCESS: {
				numberOfChainsBatchProcess numberOfChainsBatchProcess = (numberOfChainsBatchProcess)theEObject;
				T result = casenumberOfChainsBatchProcess(numberOfChainsBatchProcess);
				if (result == null) result = caseBindingAttribute(numberOfChainsBatchProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.TYPE_OUTPUT: {
				typeOutput typeOutput = (typeOutput)theEObject;
				T result = casetypeOutput(typeOutput);
				if (result == null) result = caseBindingAttribute(typeOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.DESCRIPTION_OUTPUT: {
				descriptionOutput descriptionOutput = (descriptionOutput)theEObject;
				T result = casedescriptionOutput(descriptionOutput);
				if (result == null) result = caseBindingAttribute(descriptionOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.PERIOD_ORDER_ON_STOCK_THRESHOLD: {
				periodOrderOnStockThreshold periodOrderOnStockThreshold = (periodOrderOnStockThreshold)theEObject;
				T result = caseperiodOrderOnStockThreshold(periodOrderOnStockThreshold);
				if (result == null) result = caseBindingAttribute(periodOrderOnStockThreshold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.THRESHOLD_ORDER_ON_STOCK_THRESHOLD: {
				thresholdOrderOnStockThreshold thresholdOrderOnStockThreshold = (thresholdOrderOnStockThreshold)theEObject;
				T result = casethresholdOrderOnStockThreshold(thresholdOrderOnStockThreshold);
				if (result == null) result = caseBindingAttribute(thresholdOrderOnStockThreshold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.NAME_ORDER_ON_STOCK_THRESHOLD: {
				nameOrderOnStockThreshold nameOrderOnStockThreshold = (nameOrderOnStockThreshold)theEObject;
				T result = casenameOrderOnStockThreshold(nameOrderOnStockThreshold);
				if (result == null) result = caseBindingAttribute(nameOrderOnStockThreshold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD: {
				orderQuantityOrderOnStockThreshold orderQuantityOrderOnStockThreshold = (orderQuantityOrderOnStockThreshold)theEObject;
				T result = caseorderQuantityOrderOnStockThreshold(orderQuantityOrderOnStockThreshold);
				if (result == null) result = caseBindingAttribute(orderQuantityOrderOnStockThreshold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD: {
				orderTypeOrderOnStockThreshold orderTypeOrderOnStockThreshold = (orderTypeOrderOnStockThreshold)theEObject;
				T result = caseorderTypeOrderOnStockThreshold(orderTypeOrderOnStockThreshold);
				if (result == null) result = caseBindingAttribute(orderTypeOrderOnStockThreshold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.VALUE_SCALAR: {
				valueScalar valueScalar = (valueScalar)theEObject;
				T result = casevalueScalar(valueScalar);
				if (result == null) result = caseBindingAttribute(valueScalar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.LOCATION_GAUSSIAN: {
				locationGaussian locationGaussian = (locationGaussian)theEObject;
				T result = caselocationGaussian(locationGaussian);
				if (result == null) result = caseBindingAttribute(locationGaussian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SCALE_GAUSSIAN: {
				scaleGaussian scaleGaussian = (scaleGaussian)theEObject;
				T result = casescaleGaussian(scaleGaussian);
				if (result == null) result = caseBindingAttribute(scaleGaussian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.INTERVAL_POISSON: {
				intervalPoisson intervalPoisson = (intervalPoisson)theEObject;
				T result = caseintervalPoisson(intervalPoisson);
				if (result == null) result = caseBindingAttribute(intervalPoisson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.MINIMUM_UNIFORM: {
				minimumUniform minimumUniform = (minimumUniform)theEObject;
				T result = caseminimumUniform(minimumUniform);
				if (result == null) result = caseBindingAttribute(minimumUniform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.MAXIMUM_UNIFORM: {
				maximumUniform maximumUniform = (maximumUniform)theEObject;
				T result = casemaximumUniform(maximumUniform);
				if (result == null) result = caseBindingAttribute(maximumUniform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.NAME_CONVEYOR_BELT: {
				nameConveyorBelt nameConveyorBelt = (nameConveyorBelt)theEObject;
				T result = casenameConveyorBelt(nameConveyorBelt);
				if (result == null) result = caseBindingAttribute(nameConveyorBelt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT: {
				minimalSeparationBetweenBatchesConveyorBelt minimalSeparationBetweenBatchesConveyorBelt = (minimalSeparationBetweenBatchesConveyorBelt)theEObject;
				T result = caseminimalSeparationBetweenBatchesConveyorBelt(minimalSeparationBetweenBatchesConveyorBelt);
				if (result == null) result = caseBindingAttribute(minimalSeparationBetweenBatchesConveyorBelt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.NONE_ELEMENT: {
				NoneElement noneElement = (NoneElement)theEObject;
				T result = caseNoneElement(noneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.BINDING_ELEMENT: {
				BindingElement bindingElement = (BindingElement)theEObject;
				T result = caseBindingElement(bindingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.INTERMEDIATE_ELEMENT: {
				IntermediateElement intermediateElement = (IntermediateElement)theEObject;
				T result = caseIntermediateElement(intermediateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.METAMODEL_ELEMENT: {
				MetamodelElement metamodelElement = (MetamodelElement)theEObject;
				T result = caseMetamodelElement(metamodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.METAMODEL_ELEMENT_FEATURE: {
				MetamodelElementFeature metamodelElementFeature = (MetamodelElementFeature)theEObject;
				T result = caseMetamodelElementFeature(metamodelElementFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.BINDING_ATTRIBUTE: {
				BindingAttribute bindingAttribute = (BindingAttribute)theEObject;
				T result = caseBindingAttribute(bindingAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.VIRTUAL_ATTRIBUTE: {
				VirtualAttribute virtualAttribute = (VirtualAttribute)theEObject;
				T result = caseVirtualAttribute(virtualAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplier(Supplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batch Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batch Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatchProcess(BatchProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Output Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Output Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageOutputFlow(StorageOutputFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Output Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Output Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessOutputFlow(ProcessOutputFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(metamodel_bdsl.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order On Stock Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderOnStockThreshold(OrderOnStockThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbability(Probability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistribution(Distribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalar(Scalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gaussian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gaussian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGaussian(Gaussian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poisson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poisson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoisson(Poisson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniform(Uniform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor Belt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyorBelt(ConveyorBelt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameQuery(nameQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>value Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>value Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalueQuery(valueQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>error Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>error Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseerrorQuery(errorQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>type Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>type Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetypeQuery(typeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>system Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>system Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesystemQuery(systemQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameStorage(nameStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>size Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>size Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesizeStorage(sizeStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>initial Content Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>initial Content Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinitialContentStorage(initialContentStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>overflow Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>overflow Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoverflowStorage(overflowStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameSupplier(nameSupplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>delivered Percentage Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>delivered Percentage Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedeliveredPercentageSupplier(deliveredPercentageSupplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Batch Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Batch Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameBatchProcess(nameBatchProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>percentage Of Success Batch Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>percentage Of Success Batch Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepercentageOfSuccessBatchProcess(percentageOfSuccessBatchProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>number Of Chains Batch Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>number Of Chains Batch Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenumberOfChainsBatchProcess(numberOfChainsBatchProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>type Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>type Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetypeOutput(typeOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>description Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>description Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedescriptionOutput(descriptionOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>period Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>period Order On Stock Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseperiodOrderOnStockThreshold(periodOrderOnStockThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>threshold Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>threshold Order On Stock Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casethresholdOrderOnStockThreshold(thresholdOrderOnStockThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Order On Stock Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameOrderOnStockThreshold(nameOrderOnStockThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>order Quantity Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>order Quantity Order On Stock Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseorderQuantityOrderOnStockThreshold(orderQuantityOrderOnStockThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>order Type Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>order Type Order On Stock Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseorderTypeOrderOnStockThreshold(orderTypeOrderOnStockThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>value Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>value Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalueScalar(valueScalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>location Gaussian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>location Gaussian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselocationGaussian(locationGaussian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>scale Gaussian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>scale Gaussian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casescaleGaussian(scaleGaussian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>interval Poisson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>interval Poisson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseintervalPoisson(intervalPoisson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>minimum Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>minimum Uniform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseminimumUniform(minimumUniform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>maximum Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>maximum Uniform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemaximumUniform(maximumUniform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Conveyor Belt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameConveyorBelt(nameConveyorBelt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>minimal Separation Between Batches Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>minimal Separation Between Batches Conveyor Belt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseminimalSeparationBetweenBatchesConveyorBelt(minimalSeparationBetweenBatchesConveyorBelt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneElement(NoneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingElement(BindingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateElement(IntermediateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElement(MetamodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElementFeature(MetamodelElementFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingAttribute(BindingAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualAttribute(VirtualAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Metamodel_bdslSwitch

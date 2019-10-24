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
import metamodel_bdsl.SiriusTag;
import metamodel_bdsl.Storage;
import metamodel_bdsl.StorageOutputFlow;
import metamodel_bdsl.Supplier;
import metamodel_bdsl.Uniform;
import metamodel_bdsl.VirtualAttribute;
import metamodel_bdsl.deliveredPercentageSupplier;
import metamodel_bdsl.descriptionOutput;
import metamodel_bdsl.destinationProcessOutputFlow74;
import metamodel_bdsl.destinationStorageOutputFlow63;
import metamodel_bdsl.durationBatchProcess42;
import metamodel_bdsl.durationConveyorBelt132;
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
import metamodel_bdsl.orderOnStockThresholdStorage22;
import metamodel_bdsl.orderQuantityOrderOnStockThreshold;
import metamodel_bdsl.orderTypeOrderOnStockThreshold;
import metamodel_bdsl.outputConveyorBelt133;
import metamodel_bdsl.outputsBatchProcess43;
import metamodel_bdsl.overflowStorage;
import metamodel_bdsl.percentageOfSuccessBatchProcess;
import metamodel_bdsl.periodOrderOnStockThreshold;
import metamodel_bdsl.processOutputFlowDelayProcessOutputFlow73;
import metamodel_bdsl.processOutputFlowOutput51;
import metamodel_bdsl.processOutputFlowStorage23;
import metamodel_bdsl.quantityProcessOutputFlow71;
import metamodel_bdsl.quantityStorageOutputFlow61;
import metamodel_bdsl.refillPolicySupplier31;
import metamodel_bdsl.scaleGaussian;
import metamodel_bdsl.sizeStorage;
import metamodel_bdsl.sourceProcessOutputFlow72;
import metamodel_bdsl.sourceStorageOutputFlow62;
import metamodel_bdsl.storageOrderOnStockThreshold82;
import metamodel_bdsl.storageOutputFlowBatchProcess41;
import metamodel_bdsl.storageOutputFlowConveyorBelt131;
import metamodel_bdsl.storageOutputFlowStorage21;
import metamodel_bdsl.supplierDelaySupplier32;
import metamodel_bdsl.supplierOrderOnStockThreshold81;
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
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW_STORAGE21: {
				storageOutputFlowStorage21 storageOutputFlowStorage21 = (storageOutputFlowStorage21)theEObject;
				T result = casestorageOutputFlowStorage21(storageOutputFlowStorage21);
				if (result == null) result = caseBindingAttribute(storageOutputFlowStorage21);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD_STORAGE22: {
				orderOnStockThresholdStorage22 orderOnStockThresholdStorage22 = (orderOnStockThresholdStorage22)theEObject;
				T result = caseorderOnStockThresholdStorage22(orderOnStockThresholdStorage22);
				if (result == null) result = caseBindingAttribute(orderOnStockThresholdStorage22);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW_STORAGE23: {
				processOutputFlowStorage23 processOutputFlowStorage23 = (processOutputFlowStorage23)theEObject;
				T result = caseprocessOutputFlowStorage23(processOutputFlowStorage23);
				if (result == null) result = caseBindingAttribute(processOutputFlowStorage23);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.REFILL_POLICY_SUPPLIER31: {
				refillPolicySupplier31 refillPolicySupplier31 = (refillPolicySupplier31)theEObject;
				T result = caserefillPolicySupplier31(refillPolicySupplier31);
				if (result == null) result = caseBindingAttribute(refillPolicySupplier31);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SUPPLIER_DELAY_SUPPLIER32: {
				supplierDelaySupplier32 supplierDelaySupplier32 = (supplierDelaySupplier32)theEObject;
				T result = casesupplierDelaySupplier32(supplierDelaySupplier32);
				if (result == null) result = caseBindingAttribute(supplierDelaySupplier32);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW_BATCH_PROCESS41: {
				storageOutputFlowBatchProcess41 storageOutputFlowBatchProcess41 = (storageOutputFlowBatchProcess41)theEObject;
				T result = casestorageOutputFlowBatchProcess41(storageOutputFlowBatchProcess41);
				if (result == null) result = caseBindingAttribute(storageOutputFlowBatchProcess41);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.DURATION_BATCH_PROCESS42: {
				durationBatchProcess42 durationBatchProcess42 = (durationBatchProcess42)theEObject;
				T result = casedurationBatchProcess42(durationBatchProcess42);
				if (result == null) result = caseBindingAttribute(durationBatchProcess42);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.OUTPUTS_BATCH_PROCESS43: {
				outputsBatchProcess43 outputsBatchProcess43 = (outputsBatchProcess43)theEObject;
				T result = caseoutputsBatchProcess43(outputsBatchProcess43);
				if (result == null) result = caseBindingAttribute(outputsBatchProcess43);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW_OUTPUT51: {
				processOutputFlowOutput51 processOutputFlowOutput51 = (processOutputFlowOutput51)theEObject;
				T result = caseprocessOutputFlowOutput51(processOutputFlowOutput51);
				if (result == null) result = caseBindingAttribute(processOutputFlowOutput51);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.QUANTITY_STORAGE_OUTPUT_FLOW61: {
				quantityStorageOutputFlow61 quantityStorageOutputFlow61 = (quantityStorageOutputFlow61)theEObject;
				T result = casequantityStorageOutputFlow61(quantityStorageOutputFlow61);
				if (result == null) result = caseBindingAttribute(quantityStorageOutputFlow61);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SOURCE_STORAGE_OUTPUT_FLOW62: {
				sourceStorageOutputFlow62 sourceStorageOutputFlow62 = (sourceStorageOutputFlow62)theEObject;
				T result = casesourceStorageOutputFlow62(sourceStorageOutputFlow62);
				if (result == null) result = caseBindingAttribute(sourceStorageOutputFlow62);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.DESTINATION_STORAGE_OUTPUT_FLOW63: {
				destinationStorageOutputFlow63 destinationStorageOutputFlow63 = (destinationStorageOutputFlow63)theEObject;
				T result = casedestinationStorageOutputFlow63(destinationStorageOutputFlow63);
				if (result == null) result = caseBindingAttribute(destinationStorageOutputFlow63);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.QUANTITY_PROCESS_OUTPUT_FLOW71: {
				quantityProcessOutputFlow71 quantityProcessOutputFlow71 = (quantityProcessOutputFlow71)theEObject;
				T result = casequantityProcessOutputFlow71(quantityProcessOutputFlow71);
				if (result == null) result = caseBindingAttribute(quantityProcessOutputFlow71);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SOURCE_PROCESS_OUTPUT_FLOW72: {
				sourceProcessOutputFlow72 sourceProcessOutputFlow72 = (sourceProcessOutputFlow72)theEObject;
				T result = casesourceProcessOutputFlow72(sourceProcessOutputFlow72);
				if (result == null) result = caseBindingAttribute(sourceProcessOutputFlow72);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73: {
				processOutputFlowDelayProcessOutputFlow73 processOutputFlowDelayProcessOutputFlow73 = (processOutputFlowDelayProcessOutputFlow73)theEObject;
				T result = caseprocessOutputFlowDelayProcessOutputFlow73(processOutputFlowDelayProcessOutputFlow73);
				if (result == null) result = caseBindingAttribute(processOutputFlowDelayProcessOutputFlow73);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.DESTINATION_PROCESS_OUTPUT_FLOW74: {
				destinationProcessOutputFlow74 destinationProcessOutputFlow74 = (destinationProcessOutputFlow74)theEObject;
				T result = casedestinationProcessOutputFlow74(destinationProcessOutputFlow74);
				if (result == null) result = caseBindingAttribute(destinationProcessOutputFlow74);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.SUPPLIER_ORDER_ON_STOCK_THRESHOLD81: {
				supplierOrderOnStockThreshold81 supplierOrderOnStockThreshold81 = (supplierOrderOnStockThreshold81)theEObject;
				T result = casesupplierOrderOnStockThreshold81(supplierOrderOnStockThreshold81);
				if (result == null) result = caseBindingAttribute(supplierOrderOnStockThreshold81);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.STORAGE_ORDER_ON_STOCK_THRESHOLD82: {
				storageOrderOnStockThreshold82 storageOrderOnStockThreshold82 = (storageOrderOnStockThreshold82)theEObject;
				T result = casestorageOrderOnStockThreshold82(storageOrderOnStockThreshold82);
				if (result == null) result = caseBindingAttribute(storageOrderOnStockThreshold82);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131: {
				storageOutputFlowConveyorBelt131 storageOutputFlowConveyorBelt131 = (storageOutputFlowConveyorBelt131)theEObject;
				T result = casestorageOutputFlowConveyorBelt131(storageOutputFlowConveyorBelt131);
				if (result == null) result = caseBindingAttribute(storageOutputFlowConveyorBelt131);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.DURATION_CONVEYOR_BELT132: {
				durationConveyorBelt132 durationConveyorBelt132 = (durationConveyorBelt132)theEObject;
				T result = casedurationConveyorBelt132(durationConveyorBelt132);
				if (result == null) result = caseBindingAttribute(durationConveyorBelt132);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metamodel_bdslPackage.OUTPUT_CONVEYOR_BELT133: {
				outputConveyorBelt133 outputConveyorBelt133 = (outputConveyorBelt133)theEObject;
				T result = caseoutputConveyorBelt133(outputConveyorBelt133);
				if (result == null) result = caseBindingAttribute(outputConveyorBelt133);
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
			case Metamodel_bdslPackage.SIRIUS_TAG: {
				SiriusTag siriusTag = (SiriusTag)theEObject;
				T result = caseSiriusTag(siriusTag);
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
	 * Returns the result of interpreting the object as an instance of '<em>storage Output Flow Storage21</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>storage Output Flow Storage21</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestorageOutputFlowStorage21(storageOutputFlowStorage21 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>order On Stock Threshold Storage22</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>order On Stock Threshold Storage22</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseorderOnStockThresholdStorage22(orderOnStockThresholdStorage22 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>process Output Flow Storage23</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>process Output Flow Storage23</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprocessOutputFlowStorage23(processOutputFlowStorage23 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>refill Policy Supplier31</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>refill Policy Supplier31</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserefillPolicySupplier31(refillPolicySupplier31 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>supplier Delay Supplier32</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>supplier Delay Supplier32</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesupplierDelaySupplier32(supplierDelaySupplier32 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>storage Output Flow Batch Process41</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>storage Output Flow Batch Process41</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestorageOutputFlowBatchProcess41(storageOutputFlowBatchProcess41 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>duration Batch Process42</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>duration Batch Process42</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedurationBatchProcess42(durationBatchProcess42 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>outputs Batch Process43</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>outputs Batch Process43</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoutputsBatchProcess43(outputsBatchProcess43 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>process Output Flow Output51</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>process Output Flow Output51</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprocessOutputFlowOutput51(processOutputFlowOutput51 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>quantity Storage Output Flow61</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>quantity Storage Output Flow61</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casequantityStorageOutputFlow61(quantityStorageOutputFlow61 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>source Storage Output Flow62</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>source Storage Output Flow62</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesourceStorageOutputFlow62(sourceStorageOutputFlow62 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>destination Storage Output Flow63</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>destination Storage Output Flow63</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedestinationStorageOutputFlow63(destinationStorageOutputFlow63 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>quantity Process Output Flow71</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>quantity Process Output Flow71</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casequantityProcessOutputFlow71(quantityProcessOutputFlow71 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>source Process Output Flow72</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>source Process Output Flow72</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesourceProcessOutputFlow72(sourceProcessOutputFlow72 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>process Output Flow Delay Process Output Flow73</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>process Output Flow Delay Process Output Flow73</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprocessOutputFlowDelayProcessOutputFlow73(processOutputFlowDelayProcessOutputFlow73 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>destination Process Output Flow74</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>destination Process Output Flow74</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedestinationProcessOutputFlow74(destinationProcessOutputFlow74 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>supplier Order On Stock Threshold81</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>supplier Order On Stock Threshold81</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesupplierOrderOnStockThreshold81(supplierOrderOnStockThreshold81 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>storage Order On Stock Threshold82</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>storage Order On Stock Threshold82</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestorageOrderOnStockThreshold82(storageOrderOnStockThreshold82 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>storage Output Flow Conveyor Belt131</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>storage Output Flow Conveyor Belt131</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestorageOutputFlowConveyorBelt131(storageOutputFlowConveyorBelt131 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>duration Conveyor Belt132</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>duration Conveyor Belt132</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedurationConveyorBelt132(durationConveyorBelt132 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>output Conveyor Belt133</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>output Conveyor Belt133</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoutputConveyorBelt133(outputConveyorBelt133 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sirius Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sirius Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiriusTag(SiriusTag object) {
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

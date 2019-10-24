/**
 */
package metamodel_bdsl.impl;

import metamodel_bdsl.BatchProcess;
import metamodel_bdsl.ConveyorBelt;
import metamodel_bdsl.Gaussian;
import metamodel_bdsl.IntermediateElement;
import metamodel_bdsl.MetamodelElement;
import metamodel_bdsl.MetamodelElementFeature;
import metamodel_bdsl.Metamodel_bdslFactory;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.Model;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.OrderOnStockThreshold;
import metamodel_bdsl.OrderType;
import metamodel_bdsl.Output;
import metamodel_bdsl.OutputType;
import metamodel_bdsl.Poisson;
import metamodel_bdsl.ProcessOutputFlow;
import metamodel_bdsl.Query;
import metamodel_bdsl.QueryType;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Metamodel_bdslFactoryImpl extends EFactoryImpl implements Metamodel_bdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metamodel_bdslFactory init() {
		try {
			Metamodel_bdslFactory theMetamodel_bdslFactory = (Metamodel_bdslFactory)EPackage.Registry.INSTANCE.getEFactory(Metamodel_bdslPackage.eNS_URI);
			if (theMetamodel_bdslFactory != null) {
				return theMetamodel_bdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Metamodel_bdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel_bdslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Metamodel_bdslPackage.MODEL: return createModel();
			case Metamodel_bdslPackage.QUERY: return createQuery();
			case Metamodel_bdslPackage.STORAGE: return createStorage();
			case Metamodel_bdslPackage.SUPPLIER: return createSupplier();
			case Metamodel_bdslPackage.BATCH_PROCESS: return createBatchProcess();
			case Metamodel_bdslPackage.OUTPUT: return createOutput();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW: return createStorageOutputFlow();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW: return createProcessOutputFlow();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD: return createOrderOnStockThreshold();
			case Metamodel_bdslPackage.SCALAR: return createScalar();
			case Metamodel_bdslPackage.GAUSSIAN: return createGaussian();
			case Metamodel_bdslPackage.POISSON: return createPoisson();
			case Metamodel_bdslPackage.UNIFORM: return createUniform();
			case Metamodel_bdslPackage.CONVEYOR_BELT: return createConveyorBelt();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW_STORAGE21: return createstorageOutputFlowStorage21();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD_STORAGE22: return createorderOnStockThresholdStorage22();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW_STORAGE23: return createprocessOutputFlowStorage23();
			case Metamodel_bdslPackage.REFILL_POLICY_SUPPLIER31: return createrefillPolicySupplier31();
			case Metamodel_bdslPackage.SUPPLIER_DELAY_SUPPLIER32: return createsupplierDelaySupplier32();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW_BATCH_PROCESS41: return createstorageOutputFlowBatchProcess41();
			case Metamodel_bdslPackage.DURATION_BATCH_PROCESS42: return createdurationBatchProcess42();
			case Metamodel_bdslPackage.OUTPUTS_BATCH_PROCESS43: return createoutputsBatchProcess43();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW_OUTPUT51: return createprocessOutputFlowOutput51();
			case Metamodel_bdslPackage.QUANTITY_STORAGE_OUTPUT_FLOW61: return createquantityStorageOutputFlow61();
			case Metamodel_bdslPackage.SOURCE_STORAGE_OUTPUT_FLOW62: return createsourceStorageOutputFlow62();
			case Metamodel_bdslPackage.DESTINATION_STORAGE_OUTPUT_FLOW63: return createdestinationStorageOutputFlow63();
			case Metamodel_bdslPackage.QUANTITY_PROCESS_OUTPUT_FLOW71: return createquantityProcessOutputFlow71();
			case Metamodel_bdslPackage.SOURCE_PROCESS_OUTPUT_FLOW72: return createsourceProcessOutputFlow72();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73: return createprocessOutputFlowDelayProcessOutputFlow73();
			case Metamodel_bdslPackage.DESTINATION_PROCESS_OUTPUT_FLOW74: return createdestinationProcessOutputFlow74();
			case Metamodel_bdslPackage.SUPPLIER_ORDER_ON_STOCK_THRESHOLD81: return createsupplierOrderOnStockThreshold81();
			case Metamodel_bdslPackage.STORAGE_ORDER_ON_STOCK_THRESHOLD82: return createstorageOrderOnStockThreshold82();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131: return createstorageOutputFlowConveyorBelt131();
			case Metamodel_bdslPackage.DURATION_CONVEYOR_BELT132: return createdurationConveyorBelt132();
			case Metamodel_bdslPackage.OUTPUT_CONVEYOR_BELT133: return createoutputConveyorBelt133();
			case Metamodel_bdslPackage.NAME_QUERY: return createnameQuery();
			case Metamodel_bdslPackage.VALUE_QUERY: return createvalueQuery();
			case Metamodel_bdslPackage.ERROR_QUERY: return createerrorQuery();
			case Metamodel_bdslPackage.TYPE_QUERY: return createtypeQuery();
			case Metamodel_bdslPackage.SYSTEM_QUERY: return createsystemQuery();
			case Metamodel_bdslPackage.NAME_STORAGE: return createnameStorage();
			case Metamodel_bdslPackage.SIZE_STORAGE: return createsizeStorage();
			case Metamodel_bdslPackage.INITIAL_CONTENT_STORAGE: return createinitialContentStorage();
			case Metamodel_bdslPackage.OVERFLOW_STORAGE: return createoverflowStorage();
			case Metamodel_bdslPackage.NAME_SUPPLIER: return createnameSupplier();
			case Metamodel_bdslPackage.DELIVERED_PERCENTAGE_SUPPLIER: return createdeliveredPercentageSupplier();
			case Metamodel_bdslPackage.NAME_BATCH_PROCESS: return createnameBatchProcess();
			case Metamodel_bdslPackage.PERCENTAGE_OF_SUCCESS_BATCH_PROCESS: return createpercentageOfSuccessBatchProcess();
			case Metamodel_bdslPackage.NUMBER_OF_CHAINS_BATCH_PROCESS: return createnumberOfChainsBatchProcess();
			case Metamodel_bdslPackage.TYPE_OUTPUT: return createtypeOutput();
			case Metamodel_bdslPackage.DESCRIPTION_OUTPUT: return createdescriptionOutput();
			case Metamodel_bdslPackage.PERIOD_ORDER_ON_STOCK_THRESHOLD: return createperiodOrderOnStockThreshold();
			case Metamodel_bdslPackage.THRESHOLD_ORDER_ON_STOCK_THRESHOLD: return createthresholdOrderOnStockThreshold();
			case Metamodel_bdslPackage.NAME_ORDER_ON_STOCK_THRESHOLD: return createnameOrderOnStockThreshold();
			case Metamodel_bdslPackage.ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD: return createorderQuantityOrderOnStockThreshold();
			case Metamodel_bdslPackage.ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD: return createorderTypeOrderOnStockThreshold();
			case Metamodel_bdslPackage.VALUE_SCALAR: return createvalueScalar();
			case Metamodel_bdslPackage.LOCATION_GAUSSIAN: return createlocationGaussian();
			case Metamodel_bdslPackage.SCALE_GAUSSIAN: return createscaleGaussian();
			case Metamodel_bdslPackage.INTERVAL_POISSON: return createintervalPoisson();
			case Metamodel_bdslPackage.MINIMUM_UNIFORM: return createminimumUniform();
			case Metamodel_bdslPackage.MAXIMUM_UNIFORM: return createmaximumUniform();
			case Metamodel_bdslPackage.NAME_CONVEYOR_BELT: return createnameConveyorBelt();
			case Metamodel_bdslPackage.MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT: return createminimalSeparationBetweenBatchesConveyorBelt();
			case Metamodel_bdslPackage.NONE_ELEMENT: return createNoneElement();
			case Metamodel_bdslPackage.INTERMEDIATE_ELEMENT: return createIntermediateElement();
			case Metamodel_bdslPackage.METAMODEL_ELEMENT: return createMetamodelElement();
			case Metamodel_bdslPackage.METAMODEL_ELEMENT_FEATURE: return createMetamodelElementFeature();
			case Metamodel_bdslPackage.VIRTUAL_ATTRIBUTE: return createVirtualAttribute();
			case Metamodel_bdslPackage.SIRIUS_TAG: return createSiriusTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Metamodel_bdslPackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case Metamodel_bdslPackage.OUTPUT_TYPE:
				return createOutputTypeFromString(eDataType, initialValue);
			case Metamodel_bdslPackage.QUERY_TYPE:
				return createQueryTypeFromString(eDataType, initialValue);
			case Metamodel_bdslPackage.PERCENT:
				return createPercentFromString(eDataType, initialValue);
			case Metamodel_bdslPackage.POSITIVE_INT:
				return createPositiveIntFromString(eDataType, initialValue);
			case Metamodel_bdslPackage.POSITIVE_DOUBLE:
				return createPositiveDoubleFromString(eDataType, initialValue);
			case Metamodel_bdslPackage.POSITIVE_INT_NOT_NULL:
				return createPositiveIntNotNullFromString(eDataType, initialValue);
			case Metamodel_bdslPackage.POSITIVE_DOUBLE_NOT_NULL:
				return createPositiveDoubleNotNullFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Metamodel_bdslPackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case Metamodel_bdslPackage.OUTPUT_TYPE:
				return convertOutputTypeToString(eDataType, instanceValue);
			case Metamodel_bdslPackage.QUERY_TYPE:
				return convertQueryTypeToString(eDataType, instanceValue);
			case Metamodel_bdslPackage.PERCENT:
				return convertPercentToString(eDataType, instanceValue);
			case Metamodel_bdslPackage.POSITIVE_INT:
				return convertPositiveIntToString(eDataType, instanceValue);
			case Metamodel_bdslPackage.POSITIVE_DOUBLE:
				return convertPositiveDoubleToString(eDataType, instanceValue);
			case Metamodel_bdslPackage.POSITIVE_INT_NOT_NULL:
				return convertPositiveIntNotNullToString(eDataType, instanceValue);
			case Metamodel_bdslPackage.POSITIVE_DOUBLE_NOT_NULL:
				return convertPositiveDoubleNotNullToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier createSupplier() {
		SupplierImpl supplier = new SupplierImpl();
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatchProcess createBatchProcess() {
		BatchProcessImpl batchProcess = new BatchProcessImpl();
		return batchProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageOutputFlow createStorageOutputFlow() {
		StorageOutputFlowImpl storageOutputFlow = new StorageOutputFlowImpl();
		return storageOutputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessOutputFlow createProcessOutputFlow() {
		ProcessOutputFlowImpl processOutputFlow = new ProcessOutputFlowImpl();
		return processOutputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderOnStockThreshold createOrderOnStockThreshold() {
		OrderOnStockThresholdImpl orderOnStockThreshold = new OrderOnStockThresholdImpl();
		return orderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scalar createScalar() {
		ScalarImpl scalar = new ScalarImpl();
		return scalar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gaussian createGaussian() {
		GaussianImpl gaussian = new GaussianImpl();
		return gaussian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poisson createPoisson() {
		PoissonImpl poisson = new PoissonImpl();
		return poisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uniform createUniform() {
		UniformImpl uniform = new UniformImpl();
		return uniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConveyorBelt createConveyorBelt() {
		ConveyorBeltImpl conveyorBelt = new ConveyorBeltImpl();
		return conveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storageOutputFlowStorage21 createstorageOutputFlowStorage21() {
		storageOutputFlowStorage21Impl storageOutputFlowStorage21 = new storageOutputFlowStorage21Impl();
		return storageOutputFlowStorage21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orderOnStockThresholdStorage22 createorderOnStockThresholdStorage22() {
		orderOnStockThresholdStorage22Impl orderOnStockThresholdStorage22 = new orderOnStockThresholdStorage22Impl();
		return orderOnStockThresholdStorage22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processOutputFlowStorage23 createprocessOutputFlowStorage23() {
		processOutputFlowStorage23Impl processOutputFlowStorage23 = new processOutputFlowStorage23Impl();
		return processOutputFlowStorage23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public refillPolicySupplier31 createrefillPolicySupplier31() {
		refillPolicySupplier31Impl refillPolicySupplier31 = new refillPolicySupplier31Impl();
		return refillPolicySupplier31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public supplierDelaySupplier32 createsupplierDelaySupplier32() {
		supplierDelaySupplier32Impl supplierDelaySupplier32 = new supplierDelaySupplier32Impl();
		return supplierDelaySupplier32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storageOutputFlowBatchProcess41 createstorageOutputFlowBatchProcess41() {
		storageOutputFlowBatchProcess41Impl storageOutputFlowBatchProcess41 = new storageOutputFlowBatchProcess41Impl();
		return storageOutputFlowBatchProcess41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public durationBatchProcess42 createdurationBatchProcess42() {
		durationBatchProcess42Impl durationBatchProcess42 = new durationBatchProcess42Impl();
		return durationBatchProcess42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outputsBatchProcess43 createoutputsBatchProcess43() {
		outputsBatchProcess43Impl outputsBatchProcess43 = new outputsBatchProcess43Impl();
		return outputsBatchProcess43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processOutputFlowOutput51 createprocessOutputFlowOutput51() {
		processOutputFlowOutput51Impl processOutputFlowOutput51 = new processOutputFlowOutput51Impl();
		return processOutputFlowOutput51;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public quantityStorageOutputFlow61 createquantityStorageOutputFlow61() {
		quantityStorageOutputFlow61Impl quantityStorageOutputFlow61 = new quantityStorageOutputFlow61Impl();
		return quantityStorageOutputFlow61;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sourceStorageOutputFlow62 createsourceStorageOutputFlow62() {
		sourceStorageOutputFlow62Impl sourceStorageOutputFlow62 = new sourceStorageOutputFlow62Impl();
		return sourceStorageOutputFlow62;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public destinationStorageOutputFlow63 createdestinationStorageOutputFlow63() {
		destinationStorageOutputFlow63Impl destinationStorageOutputFlow63 = new destinationStorageOutputFlow63Impl();
		return destinationStorageOutputFlow63;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public quantityProcessOutputFlow71 createquantityProcessOutputFlow71() {
		quantityProcessOutputFlow71Impl quantityProcessOutputFlow71 = new quantityProcessOutputFlow71Impl();
		return quantityProcessOutputFlow71;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sourceProcessOutputFlow72 createsourceProcessOutputFlow72() {
		sourceProcessOutputFlow72Impl sourceProcessOutputFlow72 = new sourceProcessOutputFlow72Impl();
		return sourceProcessOutputFlow72;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processOutputFlowDelayProcessOutputFlow73 createprocessOutputFlowDelayProcessOutputFlow73() {
		processOutputFlowDelayProcessOutputFlow73Impl processOutputFlowDelayProcessOutputFlow73 = new processOutputFlowDelayProcessOutputFlow73Impl();
		return processOutputFlowDelayProcessOutputFlow73;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public destinationProcessOutputFlow74 createdestinationProcessOutputFlow74() {
		destinationProcessOutputFlow74Impl destinationProcessOutputFlow74 = new destinationProcessOutputFlow74Impl();
		return destinationProcessOutputFlow74;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public supplierOrderOnStockThreshold81 createsupplierOrderOnStockThreshold81() {
		supplierOrderOnStockThreshold81Impl supplierOrderOnStockThreshold81 = new supplierOrderOnStockThreshold81Impl();
		return supplierOrderOnStockThreshold81;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storageOrderOnStockThreshold82 createstorageOrderOnStockThreshold82() {
		storageOrderOnStockThreshold82Impl storageOrderOnStockThreshold82 = new storageOrderOnStockThreshold82Impl();
		return storageOrderOnStockThreshold82;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storageOutputFlowConveyorBelt131 createstorageOutputFlowConveyorBelt131() {
		storageOutputFlowConveyorBelt131Impl storageOutputFlowConveyorBelt131 = new storageOutputFlowConveyorBelt131Impl();
		return storageOutputFlowConveyorBelt131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public durationConveyorBelt132 createdurationConveyorBelt132() {
		durationConveyorBelt132Impl durationConveyorBelt132 = new durationConveyorBelt132Impl();
		return durationConveyorBelt132;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outputConveyorBelt133 createoutputConveyorBelt133() {
		outputConveyorBelt133Impl outputConveyorBelt133 = new outputConveyorBelt133Impl();
		return outputConveyorBelt133;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameQuery createnameQuery() {
		nameQueryImpl nameQuery = new nameQueryImpl();
		return nameQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public valueQuery createvalueQuery() {
		valueQueryImpl valueQuery = new valueQueryImpl();
		return valueQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public errorQuery createerrorQuery() {
		errorQueryImpl errorQuery = new errorQueryImpl();
		return errorQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeQuery createtypeQuery() {
		typeQueryImpl typeQuery = new typeQueryImpl();
		return typeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public systemQuery createsystemQuery() {
		systemQueryImpl systemQuery = new systemQueryImpl();
		return systemQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameStorage createnameStorage() {
		nameStorageImpl nameStorage = new nameStorageImpl();
		return nameStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sizeStorage createsizeStorage() {
		sizeStorageImpl sizeStorage = new sizeStorageImpl();
		return sizeStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public initialContentStorage createinitialContentStorage() {
		initialContentStorageImpl initialContentStorage = new initialContentStorageImpl();
		return initialContentStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public overflowStorage createoverflowStorage() {
		overflowStorageImpl overflowStorage = new overflowStorageImpl();
		return overflowStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameSupplier createnameSupplier() {
		nameSupplierImpl nameSupplier = new nameSupplierImpl();
		return nameSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deliveredPercentageSupplier createdeliveredPercentageSupplier() {
		deliveredPercentageSupplierImpl deliveredPercentageSupplier = new deliveredPercentageSupplierImpl();
		return deliveredPercentageSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameBatchProcess createnameBatchProcess() {
		nameBatchProcessImpl nameBatchProcess = new nameBatchProcessImpl();
		return nameBatchProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public percentageOfSuccessBatchProcess createpercentageOfSuccessBatchProcess() {
		percentageOfSuccessBatchProcessImpl percentageOfSuccessBatchProcess = new percentageOfSuccessBatchProcessImpl();
		return percentageOfSuccessBatchProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public numberOfChainsBatchProcess createnumberOfChainsBatchProcess() {
		numberOfChainsBatchProcessImpl numberOfChainsBatchProcess = new numberOfChainsBatchProcessImpl();
		return numberOfChainsBatchProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeOutput createtypeOutput() {
		typeOutputImpl typeOutput = new typeOutputImpl();
		return typeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public descriptionOutput createdescriptionOutput() {
		descriptionOutputImpl descriptionOutput = new descriptionOutputImpl();
		return descriptionOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public periodOrderOnStockThreshold createperiodOrderOnStockThreshold() {
		periodOrderOnStockThresholdImpl periodOrderOnStockThreshold = new periodOrderOnStockThresholdImpl();
		return periodOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public thresholdOrderOnStockThreshold createthresholdOrderOnStockThreshold() {
		thresholdOrderOnStockThresholdImpl thresholdOrderOnStockThreshold = new thresholdOrderOnStockThresholdImpl();
		return thresholdOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameOrderOnStockThreshold createnameOrderOnStockThreshold() {
		nameOrderOnStockThresholdImpl nameOrderOnStockThreshold = new nameOrderOnStockThresholdImpl();
		return nameOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orderQuantityOrderOnStockThreshold createorderQuantityOrderOnStockThreshold() {
		orderQuantityOrderOnStockThresholdImpl orderQuantityOrderOnStockThreshold = new orderQuantityOrderOnStockThresholdImpl();
		return orderQuantityOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orderTypeOrderOnStockThreshold createorderTypeOrderOnStockThreshold() {
		orderTypeOrderOnStockThresholdImpl orderTypeOrderOnStockThreshold = new orderTypeOrderOnStockThresholdImpl();
		return orderTypeOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public valueScalar createvalueScalar() {
		valueScalarImpl valueScalar = new valueScalarImpl();
		return valueScalar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public locationGaussian createlocationGaussian() {
		locationGaussianImpl locationGaussian = new locationGaussianImpl();
		return locationGaussian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scaleGaussian createscaleGaussian() {
		scaleGaussianImpl scaleGaussian = new scaleGaussianImpl();
		return scaleGaussian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intervalPoisson createintervalPoisson() {
		intervalPoissonImpl intervalPoisson = new intervalPoissonImpl();
		return intervalPoisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public minimumUniform createminimumUniform() {
		minimumUniformImpl minimumUniform = new minimumUniformImpl();
		return minimumUniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public maximumUniform createmaximumUniform() {
		maximumUniformImpl maximumUniform = new maximumUniformImpl();
		return maximumUniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameConveyorBelt createnameConveyorBelt() {
		nameConveyorBeltImpl nameConveyorBelt = new nameConveyorBeltImpl();
		return nameConveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public minimalSeparationBetweenBatchesConveyorBelt createminimalSeparationBetweenBatchesConveyorBelt() {
		minimalSeparationBetweenBatchesConveyorBeltImpl minimalSeparationBetweenBatchesConveyorBelt = new minimalSeparationBetweenBatchesConveyorBeltImpl();
		return minimalSeparationBetweenBatchesConveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoneElement createNoneElement() {
		NoneElementImpl noneElement = new NoneElementImpl();
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateElement createIntermediateElement() {
		IntermediateElementImpl intermediateElement = new IntermediateElementImpl();
		return intermediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelElement createMetamodelElement() {
		MetamodelElementImpl metamodelElement = new MetamodelElementImpl();
		return metamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelElementFeature createMetamodelElementFeature() {
		MetamodelElementFeatureImpl metamodelElementFeature = new MetamodelElementFeatureImpl();
		return metamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualAttribute createVirtualAttribute() {
		VirtualAttributeImpl virtualAttribute = new VirtualAttributeImpl();
		return virtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiriusTag createSiriusTag() {
		SiriusTagImpl siriusTag = new SiriusTagImpl();
		return siriusTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType createOutputTypeFromString(EDataType eDataType, String initialValue) {
		OutputType result = OutputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType createQueryTypeFromString(EDataType eDataType, String initialValue) {
		QueryType result = QueryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPercentFromString(EDataType eDataType, String initialValue) {
		return (Double)EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentToString(EDataType eDataType, Object instanceValue) {
		return EcoreFactory.eINSTANCE.convertToString(EcorePackage.Literals.EDOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EINT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntToString(EDataType eDataType, Object instanceValue) {
		return EcoreFactory.eINSTANCE.convertToString(EcorePackage.Literals.EINT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPositiveDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveDoubleToString(EDataType eDataType, Object instanceValue) {
		return EcoreFactory.eINSTANCE.convertToString(EcorePackage.Literals.EDOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntNotNullFromString(EDataType eDataType, String initialValue) {
		return (Integer)EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EINT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntNotNullToString(EDataType eDataType, Object instanceValue) {
		return EcoreFactory.eINSTANCE.convertToString(EcorePackage.Literals.EINT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPositiveDoubleNotNullFromString(EDataType eDataType, String initialValue) {
		return (Double)EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveDoubleNotNullToString(EDataType eDataType, Object instanceValue) {
		return EcoreFactory.eINSTANCE.convertToString(EcorePackage.Literals.EDOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel_bdslPackage getMetamodel_bdslPackage() {
		return (Metamodel_bdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Metamodel_bdslPackage getPackage() {
		return Metamodel_bdslPackage.eINSTANCE;
	}

} //Metamodel_bdslFactoryImpl

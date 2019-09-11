/**
 */
package metamodel_bdsl.util;

import java.util.Map;

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
import metamodel_bdsl.OrderType;
import metamodel_bdsl.Output;
import metamodel_bdsl.OutputType;
import metamodel_bdsl.Poisson;
import metamodel_bdsl.Probability;
import metamodel_bdsl.ProcessOutputFlow;
import metamodel_bdsl.Query;
import metamodel_bdsl.QueryType;
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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see metamodel_bdsl.Metamodel_bdslPackage
 * @generated
 */
public class Metamodel_bdslValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Metamodel_bdslValidator INSTANCE = new Metamodel_bdslValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "metamodel_bdsl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel_bdslValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Metamodel_bdslPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Metamodel_bdslPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case Metamodel_bdslPackage.QUERY:
				return validateQuery((Query)value, diagnostics, context);
			case Metamodel_bdslPackage.STORAGE:
				return validateStorage((Storage)value, diagnostics, context);
			case Metamodel_bdslPackage.SUPPLIER:
				return validateSupplier((Supplier)value, diagnostics, context);
			case Metamodel_bdslPackage.BATCH_PROCESS:
				return validateBatchProcess((BatchProcess)value, diagnostics, context);
			case Metamodel_bdslPackage.OUTPUT:
				return validateOutput((Output)value, diagnostics, context);
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW:
				return validateStorageOutputFlow((StorageOutputFlow)value, diagnostics, context);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW:
				return validateProcessOutputFlow((ProcessOutputFlow)value, diagnostics, context);
			case Metamodel_bdslPackage.PROCESS:
				return validateProcess((metamodel_bdsl.Process)value, diagnostics, context);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD:
				return validateOrderOnStockThreshold((OrderOnStockThreshold)value, diagnostics, context);
			case Metamodel_bdslPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case Metamodel_bdslPackage.FLOW:
				return validateFlow((Flow)value, diagnostics, context);
			case Metamodel_bdslPackage.PROBABILITY:
				return validateProbability((Probability)value, diagnostics, context);
			case Metamodel_bdslPackage.DISTRIBUTION:
				return validateDistribution((Distribution)value, diagnostics, context);
			case Metamodel_bdslPackage.SCALAR:
				return validateScalar((Scalar)value, diagnostics, context);
			case Metamodel_bdslPackage.GAUSSIAN:
				return validateGaussian((Gaussian)value, diagnostics, context);
			case Metamodel_bdslPackage.POISSON:
				return validatePoisson((Poisson)value, diagnostics, context);
			case Metamodel_bdslPackage.UNIFORM:
				return validateUniform((Uniform)value, diagnostics, context);
			case Metamodel_bdslPackage.CONVEYOR_BELT:
				return validateConveyorBelt((ConveyorBelt)value, diagnostics, context);
			case Metamodel_bdslPackage.NAME_QUERY:
				return validatenameQuery((nameQuery)value, diagnostics, context);
			case Metamodel_bdslPackage.VALUE_QUERY:
				return validatevalueQuery((valueQuery)value, diagnostics, context);
			case Metamodel_bdslPackage.ERROR_QUERY:
				return validateerrorQuery((errorQuery)value, diagnostics, context);
			case Metamodel_bdslPackage.TYPE_QUERY:
				return validatetypeQuery((typeQuery)value, diagnostics, context);
			case Metamodel_bdslPackage.SYSTEM_QUERY:
				return validatesystemQuery((systemQuery)value, diagnostics, context);
			case Metamodel_bdslPackage.NAME_STORAGE:
				return validatenameStorage((nameStorage)value, diagnostics, context);
			case Metamodel_bdslPackage.SIZE_STORAGE:
				return validatesizeStorage((sizeStorage)value, diagnostics, context);
			case Metamodel_bdslPackage.INITIAL_CONTENT_STORAGE:
				return validateinitialContentStorage((initialContentStorage)value, diagnostics, context);
			case Metamodel_bdslPackage.OVERFLOW_STORAGE:
				return validateoverflowStorage((overflowStorage)value, diagnostics, context);
			case Metamodel_bdslPackage.NAME_SUPPLIER:
				return validatenameSupplier((nameSupplier)value, diagnostics, context);
			case Metamodel_bdslPackage.DELIVERED_PERCENTAGE_SUPPLIER:
				return validatedeliveredPercentageSupplier((deliveredPercentageSupplier)value, diagnostics, context);
			case Metamodel_bdslPackage.NAME_BATCH_PROCESS:
				return validatenameBatchProcess((nameBatchProcess)value, diagnostics, context);
			case Metamodel_bdslPackage.PERCENTAGE_OF_SUCCESS_BATCH_PROCESS:
				return validatepercentageOfSuccessBatchProcess((percentageOfSuccessBatchProcess)value, diagnostics, context);
			case Metamodel_bdslPackage.NUMBER_OF_CHAINS_BATCH_PROCESS:
				return validatenumberOfChainsBatchProcess((numberOfChainsBatchProcess)value, diagnostics, context);
			case Metamodel_bdslPackage.TYPE_OUTPUT:
				return validatetypeOutput((typeOutput)value, diagnostics, context);
			case Metamodel_bdslPackage.DESCRIPTION_OUTPUT:
				return validatedescriptionOutput((descriptionOutput)value, diagnostics, context);
			case Metamodel_bdslPackage.PERIOD_ORDER_ON_STOCK_THRESHOLD:
				return validateperiodOrderOnStockThreshold((periodOrderOnStockThreshold)value, diagnostics, context);
			case Metamodel_bdslPackage.THRESHOLD_ORDER_ON_STOCK_THRESHOLD:
				return validatethresholdOrderOnStockThreshold((thresholdOrderOnStockThreshold)value, diagnostics, context);
			case Metamodel_bdslPackage.NAME_ORDER_ON_STOCK_THRESHOLD:
				return validatenameOrderOnStockThreshold((nameOrderOnStockThreshold)value, diagnostics, context);
			case Metamodel_bdslPackage.ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD:
				return validateorderQuantityOrderOnStockThreshold((orderQuantityOrderOnStockThreshold)value, diagnostics, context);
			case Metamodel_bdslPackage.ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD:
				return validateorderTypeOrderOnStockThreshold((orderTypeOrderOnStockThreshold)value, diagnostics, context);
			case Metamodel_bdslPackage.VALUE_SCALAR:
				return validatevalueScalar((valueScalar)value, diagnostics, context);
			case Metamodel_bdslPackage.LOCATION_GAUSSIAN:
				return validatelocationGaussian((locationGaussian)value, diagnostics, context);
			case Metamodel_bdslPackage.SCALE_GAUSSIAN:
				return validatescaleGaussian((scaleGaussian)value, diagnostics, context);
			case Metamodel_bdslPackage.INTERVAL_POISSON:
				return validateintervalPoisson((intervalPoisson)value, diagnostics, context);
			case Metamodel_bdslPackage.MINIMUM_UNIFORM:
				return validateminimumUniform((minimumUniform)value, diagnostics, context);
			case Metamodel_bdslPackage.MAXIMUM_UNIFORM:
				return validatemaximumUniform((maximumUniform)value, diagnostics, context);
			case Metamodel_bdslPackage.NAME_CONVEYOR_BELT:
				return validatenameConveyorBelt((nameConveyorBelt)value, diagnostics, context);
			case Metamodel_bdslPackage.MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT:
				return validateminimalSeparationBetweenBatchesConveyorBelt((minimalSeparationBetweenBatchesConveyorBelt)value, diagnostics, context);
			case Metamodel_bdslPackage.NONE_ELEMENT:
				return validateNoneElement((NoneElement)value, diagnostics, context);
			case Metamodel_bdslPackage.BINDING_ELEMENT:
				return validateBindingElement((BindingElement)value, diagnostics, context);
			case Metamodel_bdslPackage.INTERMEDIATE_ELEMENT:
				return validateIntermediateElement((IntermediateElement)value, diagnostics, context);
			case Metamodel_bdslPackage.METAMODEL_ELEMENT:
				return validateMetamodelElement((MetamodelElement)value, diagnostics, context);
			case Metamodel_bdslPackage.METAMODEL_ELEMENT_FEATURE:
				return validateMetamodelElementFeature((MetamodelElementFeature)value, diagnostics, context);
			case Metamodel_bdslPackage.BINDING_ATTRIBUTE:
				return validateBindingAttribute((BindingAttribute)value, diagnostics, context);
			case Metamodel_bdslPackage.VIRTUAL_ATTRIBUTE:
				return validateVirtualAttribute((VirtualAttribute)value, diagnostics, context);
			case Metamodel_bdslPackage.ORDER_TYPE:
				return validateOrderType((OrderType)value, diagnostics, context);
			case Metamodel_bdslPackage.OUTPUT_TYPE:
				return validateOutputType((OutputType)value, diagnostics, context);
			case Metamodel_bdslPackage.QUERY_TYPE:
				return validateQueryType((QueryType)value, diagnostics, context);
			case Metamodel_bdslPackage.PERCENT:
				return validatePercent((Double)value, diagnostics, context);
			case Metamodel_bdslPackage.POSITIVE_INT:
				return validatePositiveInt((Integer)value, diagnostics, context);
			case Metamodel_bdslPackage.POSITIVE_DOUBLE:
				return validatePositiveDouble((Double)value, diagnostics, context);
			case Metamodel_bdslPackage.POSITIVE_INT_NOT_NULL:
				return validatePositiveIntNotNull((Integer)value, diagnostics, context);
			case Metamodel_bdslPackage.POSITIVE_DOUBLE_NOT_NULL:
				return validatePositiveDoubleNotNull((Double)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuery(Query query, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(query, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplier(Supplier supplier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatchProcess(BatchProcess batchProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(batchProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(output, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageOutputFlow(StorageOutputFlow storageOutputFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storageOutputFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessOutputFlow(ProcessOutputFlow processOutputFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processOutputFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(metamodel_bdsl.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(process, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderOnStockThreshold(OrderOnStockThreshold orderOnStockThreshold, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderOnStockThreshold, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlow(Flow flow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbability(Probability probability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(probability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistribution(Distribution distribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalar(Scalar scalar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGaussian(Gaussian gaussian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gaussian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoisson(Poisson poisson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(poisson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniform(Uniform uniform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uniform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyorBelt(ConveyorBelt conveyorBelt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conveyorBelt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenameQuery(nameQuery nameQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatevalueQuery(valueQuery valueQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateerrorQuery(errorQuery errorQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetypeQuery(typeQuery typeQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesystemQuery(systemQuery systemQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenameStorage(nameStorage nameStorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameStorage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesizeStorage(sizeStorage sizeStorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sizeStorage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateinitialContentStorage(initialContentStorage initialContentStorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialContentStorage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateoverflowStorage(overflowStorage overflowStorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(overflowStorage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenameSupplier(nameSupplier nameSupplier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameSupplier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedeliveredPercentageSupplier(deliveredPercentageSupplier deliveredPercentageSupplier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deliveredPercentageSupplier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenameBatchProcess(nameBatchProcess nameBatchProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameBatchProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatepercentageOfSuccessBatchProcess(percentageOfSuccessBatchProcess percentageOfSuccessBatchProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(percentageOfSuccessBatchProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenumberOfChainsBatchProcess(numberOfChainsBatchProcess numberOfChainsBatchProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberOfChainsBatchProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetypeOutput(typeOutput typeOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedescriptionOutput(descriptionOutput descriptionOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateperiodOrderOnStockThreshold(periodOrderOnStockThreshold periodOrderOnStockThreshold, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(periodOrderOnStockThreshold, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatethresholdOrderOnStockThreshold(thresholdOrderOnStockThreshold thresholdOrderOnStockThreshold, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thresholdOrderOnStockThreshold, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenameOrderOnStockThreshold(nameOrderOnStockThreshold nameOrderOnStockThreshold, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameOrderOnStockThreshold, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateorderQuantityOrderOnStockThreshold(orderQuantityOrderOnStockThreshold orderQuantityOrderOnStockThreshold, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderQuantityOrderOnStockThreshold, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateorderTypeOrderOnStockThreshold(orderTypeOrderOnStockThreshold orderTypeOrderOnStockThreshold, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderTypeOrderOnStockThreshold, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatevalueScalar(valueScalar valueScalar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueScalar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatelocationGaussian(locationGaussian locationGaussian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationGaussian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatescaleGaussian(scaleGaussian scaleGaussian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaleGaussian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateintervalPoisson(intervalPoisson intervalPoisson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intervalPoisson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateminimumUniform(minimumUniform minimumUniform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minimumUniform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatemaximumUniform(maximumUniform maximumUniform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maximumUniform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenameConveyorBelt(nameConveyorBelt nameConveyorBelt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameConveyorBelt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateminimalSeparationBetweenBatchesConveyorBelt(minimalSeparationBetweenBatchesConveyorBelt minimalSeparationBetweenBatchesConveyorBelt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minimalSeparationBetweenBatchesConveyorBelt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoneElement(NoneElement noneElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noneElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingElement(BindingElement bindingElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateElement(IntermediateElement intermediateElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intermediateElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetamodelElement(MetamodelElement metamodelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metamodelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetamodelElementFeature(MetamodelElementFeature metamodelElementFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metamodelElementFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingAttribute(BindingAttribute bindingAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualAttribute(VirtualAttribute virtualAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(virtualAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderType(OrderType orderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType(OutputType outputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueryType(QueryType queryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercent(Double percent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercent_Min(percent, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercent_Max(percent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercent_Min
	 */
	public static final Double PERCENT__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Percent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercent_Min(Double percent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percent.compareTo(PERCENT__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Metamodel_bdslPackage.Literals.PERCENT, percent, PERCENT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercent_Max
	 */
	public static final Double PERCENT__MAX__VALUE = 100.0;

	/**
	 * Validates the Max constraint of '<em>Percent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercent_Max(Double percent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percent.compareTo(PERCENT__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Metamodel_bdslPackage.Literals.PERCENT, percent, PERCENT__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(Integer positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveInt_Min(positiveInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveInt_Min
	 */
	public static final Integer POSITIVE_INT__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt_Min(Integer positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveInt.compareTo(POSITIVE_INT__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Metamodel_bdslPackage.Literals.POSITIVE_INT, positiveInt, POSITIVE_INT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDouble(Double positiveDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveDouble_Min(positiveDouble, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveDouble_Min
	 */
	public static final Double POSITIVE_DOUBLE__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Positive Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDouble_Min(Double positiveDouble, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveDouble.compareTo(POSITIVE_DOUBLE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Metamodel_bdslPackage.Literals.POSITIVE_DOUBLE, positiveDouble, POSITIVE_DOUBLE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntNotNull(Integer positiveIntNotNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveIntNotNull_Min(positiveIntNotNull, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveIntNotNull_Min
	 */
	public static final Integer POSITIVE_INT_NOT_NULL__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Positive Int Not Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntNotNull_Min(Integer positiveIntNotNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveIntNotNull.compareTo(POSITIVE_INT_NOT_NULL__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Metamodel_bdslPackage.Literals.POSITIVE_INT_NOT_NULL, positiveIntNotNull, POSITIVE_INT_NOT_NULL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDoubleNotNull(Double positiveDoubleNotNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveDoubleNotNull_Min(positiveDoubleNotNull, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveDoubleNotNull_Min
	 */
	public static final Double POSITIVE_DOUBLE_NOT_NULL__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Positive Double Not Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDoubleNotNull_Min(Double positiveDoubleNotNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveDoubleNotNull.compareTo(POSITIVE_DOUBLE_NOT_NULL__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(Metamodel_bdslPackage.Literals.POSITIVE_DOUBLE_NOT_NULL, positiveDoubleNotNull, POSITIVE_DOUBLE_NOT_NULL__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Metamodel_bdslValidator

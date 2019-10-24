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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metamodel_bdsl.Metamodel_bdslPackage
 * @generated
 */
public class Metamodel_bdslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Metamodel_bdslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel_bdslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Metamodel_bdslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Metamodel_bdslSwitch<Adapter> modelSwitch =
		new Metamodel_bdslSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseSupplier(Supplier object) {
				return createSupplierAdapter();
			}
			@Override
			public Adapter caseBatchProcess(BatchProcess object) {
				return createBatchProcessAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseStorageOutputFlow(StorageOutputFlow object) {
				return createStorageOutputFlowAdapter();
			}
			@Override
			public Adapter caseProcessOutputFlow(ProcessOutputFlow object) {
				return createProcessOutputFlowAdapter();
			}
			@Override
			public Adapter caseProcess(metamodel_bdsl.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseOrderOnStockThreshold(OrderOnStockThreshold object) {
				return createOrderOnStockThresholdAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseProbability(Probability object) {
				return createProbabilityAdapter();
			}
			@Override
			public Adapter caseDistribution(Distribution object) {
				return createDistributionAdapter();
			}
			@Override
			public Adapter caseScalar(Scalar object) {
				return createScalarAdapter();
			}
			@Override
			public Adapter caseGaussian(Gaussian object) {
				return createGaussianAdapter();
			}
			@Override
			public Adapter casePoisson(Poisson object) {
				return createPoissonAdapter();
			}
			@Override
			public Adapter caseUniform(Uniform object) {
				return createUniformAdapter();
			}
			@Override
			public Adapter caseConveyorBelt(ConveyorBelt object) {
				return createConveyorBeltAdapter();
			}
			@Override
			public Adapter casestorageOutputFlowStorage21(storageOutputFlowStorage21 object) {
				return createstorageOutputFlowStorage21Adapter();
			}
			@Override
			public Adapter caseorderOnStockThresholdStorage22(orderOnStockThresholdStorage22 object) {
				return createorderOnStockThresholdStorage22Adapter();
			}
			@Override
			public Adapter caseprocessOutputFlowStorage23(processOutputFlowStorage23 object) {
				return createprocessOutputFlowStorage23Adapter();
			}
			@Override
			public Adapter caserefillPolicySupplier31(refillPolicySupplier31 object) {
				return createrefillPolicySupplier31Adapter();
			}
			@Override
			public Adapter casesupplierDelaySupplier32(supplierDelaySupplier32 object) {
				return createsupplierDelaySupplier32Adapter();
			}
			@Override
			public Adapter casestorageOutputFlowBatchProcess41(storageOutputFlowBatchProcess41 object) {
				return createstorageOutputFlowBatchProcess41Adapter();
			}
			@Override
			public Adapter casedurationBatchProcess42(durationBatchProcess42 object) {
				return createdurationBatchProcess42Adapter();
			}
			@Override
			public Adapter caseoutputsBatchProcess43(outputsBatchProcess43 object) {
				return createoutputsBatchProcess43Adapter();
			}
			@Override
			public Adapter caseprocessOutputFlowOutput51(processOutputFlowOutput51 object) {
				return createprocessOutputFlowOutput51Adapter();
			}
			@Override
			public Adapter casequantityStorageOutputFlow61(quantityStorageOutputFlow61 object) {
				return createquantityStorageOutputFlow61Adapter();
			}
			@Override
			public Adapter casesourceStorageOutputFlow62(sourceStorageOutputFlow62 object) {
				return createsourceStorageOutputFlow62Adapter();
			}
			@Override
			public Adapter casedestinationStorageOutputFlow63(destinationStorageOutputFlow63 object) {
				return createdestinationStorageOutputFlow63Adapter();
			}
			@Override
			public Adapter casequantityProcessOutputFlow71(quantityProcessOutputFlow71 object) {
				return createquantityProcessOutputFlow71Adapter();
			}
			@Override
			public Adapter casesourceProcessOutputFlow72(sourceProcessOutputFlow72 object) {
				return createsourceProcessOutputFlow72Adapter();
			}
			@Override
			public Adapter caseprocessOutputFlowDelayProcessOutputFlow73(processOutputFlowDelayProcessOutputFlow73 object) {
				return createprocessOutputFlowDelayProcessOutputFlow73Adapter();
			}
			@Override
			public Adapter casedestinationProcessOutputFlow74(destinationProcessOutputFlow74 object) {
				return createdestinationProcessOutputFlow74Adapter();
			}
			@Override
			public Adapter casesupplierOrderOnStockThreshold81(supplierOrderOnStockThreshold81 object) {
				return createsupplierOrderOnStockThreshold81Adapter();
			}
			@Override
			public Adapter casestorageOrderOnStockThreshold82(storageOrderOnStockThreshold82 object) {
				return createstorageOrderOnStockThreshold82Adapter();
			}
			@Override
			public Adapter casestorageOutputFlowConveyorBelt131(storageOutputFlowConveyorBelt131 object) {
				return createstorageOutputFlowConveyorBelt131Adapter();
			}
			@Override
			public Adapter casedurationConveyorBelt132(durationConveyorBelt132 object) {
				return createdurationConveyorBelt132Adapter();
			}
			@Override
			public Adapter caseoutputConveyorBelt133(outputConveyorBelt133 object) {
				return createoutputConveyorBelt133Adapter();
			}
			@Override
			public Adapter casenameQuery(nameQuery object) {
				return createnameQueryAdapter();
			}
			@Override
			public Adapter casevalueQuery(valueQuery object) {
				return createvalueQueryAdapter();
			}
			@Override
			public Adapter caseerrorQuery(errorQuery object) {
				return createerrorQueryAdapter();
			}
			@Override
			public Adapter casetypeQuery(typeQuery object) {
				return createtypeQueryAdapter();
			}
			@Override
			public Adapter casesystemQuery(systemQuery object) {
				return createsystemQueryAdapter();
			}
			@Override
			public Adapter casenameStorage(nameStorage object) {
				return createnameStorageAdapter();
			}
			@Override
			public Adapter casesizeStorage(sizeStorage object) {
				return createsizeStorageAdapter();
			}
			@Override
			public Adapter caseinitialContentStorage(initialContentStorage object) {
				return createinitialContentStorageAdapter();
			}
			@Override
			public Adapter caseoverflowStorage(overflowStorage object) {
				return createoverflowStorageAdapter();
			}
			@Override
			public Adapter casenameSupplier(nameSupplier object) {
				return createnameSupplierAdapter();
			}
			@Override
			public Adapter casedeliveredPercentageSupplier(deliveredPercentageSupplier object) {
				return createdeliveredPercentageSupplierAdapter();
			}
			@Override
			public Adapter casenameBatchProcess(nameBatchProcess object) {
				return createnameBatchProcessAdapter();
			}
			@Override
			public Adapter casepercentageOfSuccessBatchProcess(percentageOfSuccessBatchProcess object) {
				return createpercentageOfSuccessBatchProcessAdapter();
			}
			@Override
			public Adapter casenumberOfChainsBatchProcess(numberOfChainsBatchProcess object) {
				return createnumberOfChainsBatchProcessAdapter();
			}
			@Override
			public Adapter casetypeOutput(typeOutput object) {
				return createtypeOutputAdapter();
			}
			@Override
			public Adapter casedescriptionOutput(descriptionOutput object) {
				return createdescriptionOutputAdapter();
			}
			@Override
			public Adapter caseperiodOrderOnStockThreshold(periodOrderOnStockThreshold object) {
				return createperiodOrderOnStockThresholdAdapter();
			}
			@Override
			public Adapter casethresholdOrderOnStockThreshold(thresholdOrderOnStockThreshold object) {
				return createthresholdOrderOnStockThresholdAdapter();
			}
			@Override
			public Adapter casenameOrderOnStockThreshold(nameOrderOnStockThreshold object) {
				return createnameOrderOnStockThresholdAdapter();
			}
			@Override
			public Adapter caseorderQuantityOrderOnStockThreshold(orderQuantityOrderOnStockThreshold object) {
				return createorderQuantityOrderOnStockThresholdAdapter();
			}
			@Override
			public Adapter caseorderTypeOrderOnStockThreshold(orderTypeOrderOnStockThreshold object) {
				return createorderTypeOrderOnStockThresholdAdapter();
			}
			@Override
			public Adapter casevalueScalar(valueScalar object) {
				return createvalueScalarAdapter();
			}
			@Override
			public Adapter caselocationGaussian(locationGaussian object) {
				return createlocationGaussianAdapter();
			}
			@Override
			public Adapter casescaleGaussian(scaleGaussian object) {
				return createscaleGaussianAdapter();
			}
			@Override
			public Adapter caseintervalPoisson(intervalPoisson object) {
				return createintervalPoissonAdapter();
			}
			@Override
			public Adapter caseminimumUniform(minimumUniform object) {
				return createminimumUniformAdapter();
			}
			@Override
			public Adapter casemaximumUniform(maximumUniform object) {
				return createmaximumUniformAdapter();
			}
			@Override
			public Adapter casenameConveyorBelt(nameConveyorBelt object) {
				return createnameConveyorBeltAdapter();
			}
			@Override
			public Adapter caseminimalSeparationBetweenBatchesConveyorBelt(minimalSeparationBetweenBatchesConveyorBelt object) {
				return createminimalSeparationBetweenBatchesConveyorBeltAdapter();
			}
			@Override
			public Adapter caseNoneElement(NoneElement object) {
				return createNoneElementAdapter();
			}
			@Override
			public Adapter caseBindingElement(BindingElement object) {
				return createBindingElementAdapter();
			}
			@Override
			public Adapter caseIntermediateElement(IntermediateElement object) {
				return createIntermediateElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElement(MetamodelElement object) {
				return createMetamodelElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElementFeature(MetamodelElementFeature object) {
				return createMetamodelElementFeatureAdapter();
			}
			@Override
			public Adapter caseBindingAttribute(BindingAttribute object) {
				return createBindingAttributeAdapter();
			}
			@Override
			public Adapter caseVirtualAttribute(VirtualAttribute object) {
				return createVirtualAttributeAdapter();
			}
			@Override
			public Adapter caseSiriusTag(SiriusTag object) {
				return createSiriusTagAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Supplier
	 * @generated
	 */
	public Adapter createSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.BatchProcess <em>Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.BatchProcess
	 * @generated
	 */
	public Adapter createBatchProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.StorageOutputFlow <em>Storage Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.StorageOutputFlow
	 * @generated
	 */
	public Adapter createStorageOutputFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.ProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.ProcessOutputFlow
	 * @generated
	 */
	public Adapter createProcessOutputFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.OrderOnStockThreshold <em>Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.OrderOnStockThreshold
	 * @generated
	 */
	public Adapter createOrderOnStockThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Probability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Probability
	 * @generated
	 */
	public Adapter createProbabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Distribution
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Scalar <em>Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Scalar
	 * @generated
	 */
	public Adapter createScalarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Gaussian <em>Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Gaussian
	 * @generated
	 */
	public Adapter createGaussianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Poisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Poisson
	 * @generated
	 */
	public Adapter createPoissonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.Uniform
	 * @generated
	 */
	public Adapter createUniformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.ConveyorBelt
	 * @generated
	 */
	public Adapter createConveyorBeltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.storageOutputFlowStorage21 <em>storage Output Flow Storage21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.storageOutputFlowStorage21
	 * @generated
	 */
	public Adapter createstorageOutputFlowStorage21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.orderOnStockThresholdStorage22 <em>order On Stock Threshold Storage22</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.orderOnStockThresholdStorage22
	 * @generated
	 */
	public Adapter createorderOnStockThresholdStorage22Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.processOutputFlowStorage23 <em>process Output Flow Storage23</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.processOutputFlowStorage23
	 * @generated
	 */
	public Adapter createprocessOutputFlowStorage23Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.refillPolicySupplier31 <em>refill Policy Supplier31</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.refillPolicySupplier31
	 * @generated
	 */
	public Adapter createrefillPolicySupplier31Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.supplierDelaySupplier32 <em>supplier Delay Supplier32</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.supplierDelaySupplier32
	 * @generated
	 */
	public Adapter createsupplierDelaySupplier32Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.storageOutputFlowBatchProcess41 <em>storage Output Flow Batch Process41</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.storageOutputFlowBatchProcess41
	 * @generated
	 */
	public Adapter createstorageOutputFlowBatchProcess41Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.durationBatchProcess42 <em>duration Batch Process42</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.durationBatchProcess42
	 * @generated
	 */
	public Adapter createdurationBatchProcess42Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.outputsBatchProcess43 <em>outputs Batch Process43</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.outputsBatchProcess43
	 * @generated
	 */
	public Adapter createoutputsBatchProcess43Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.processOutputFlowOutput51 <em>process Output Flow Output51</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.processOutputFlowOutput51
	 * @generated
	 */
	public Adapter createprocessOutputFlowOutput51Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.quantityStorageOutputFlow61 <em>quantity Storage Output Flow61</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.quantityStorageOutputFlow61
	 * @generated
	 */
	public Adapter createquantityStorageOutputFlow61Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.sourceStorageOutputFlow62 <em>source Storage Output Flow62</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.sourceStorageOutputFlow62
	 * @generated
	 */
	public Adapter createsourceStorageOutputFlow62Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.destinationStorageOutputFlow63 <em>destination Storage Output Flow63</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.destinationStorageOutputFlow63
	 * @generated
	 */
	public Adapter createdestinationStorageOutputFlow63Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.quantityProcessOutputFlow71 <em>quantity Process Output Flow71</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.quantityProcessOutputFlow71
	 * @generated
	 */
	public Adapter createquantityProcessOutputFlow71Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.sourceProcessOutputFlow72 <em>source Process Output Flow72</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.sourceProcessOutputFlow72
	 * @generated
	 */
	public Adapter createsourceProcessOutputFlow72Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.processOutputFlowDelayProcessOutputFlow73 <em>process Output Flow Delay Process Output Flow73</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.processOutputFlowDelayProcessOutputFlow73
	 * @generated
	 */
	public Adapter createprocessOutputFlowDelayProcessOutputFlow73Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.destinationProcessOutputFlow74 <em>destination Process Output Flow74</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.destinationProcessOutputFlow74
	 * @generated
	 */
	public Adapter createdestinationProcessOutputFlow74Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.supplierOrderOnStockThreshold81 <em>supplier Order On Stock Threshold81</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.supplierOrderOnStockThreshold81
	 * @generated
	 */
	public Adapter createsupplierOrderOnStockThreshold81Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.storageOrderOnStockThreshold82 <em>storage Order On Stock Threshold82</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.storageOrderOnStockThreshold82
	 * @generated
	 */
	public Adapter createstorageOrderOnStockThreshold82Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.storageOutputFlowConveyorBelt131 <em>storage Output Flow Conveyor Belt131</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.storageOutputFlowConveyorBelt131
	 * @generated
	 */
	public Adapter createstorageOutputFlowConveyorBelt131Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.durationConveyorBelt132 <em>duration Conveyor Belt132</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.durationConveyorBelt132
	 * @generated
	 */
	public Adapter createdurationConveyorBelt132Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.outputConveyorBelt133 <em>output Conveyor Belt133</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.outputConveyorBelt133
	 * @generated
	 */
	public Adapter createoutputConveyorBelt133Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.nameQuery <em>name Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.nameQuery
	 * @generated
	 */
	public Adapter createnameQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.valueQuery <em>value Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.valueQuery
	 * @generated
	 */
	public Adapter createvalueQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.errorQuery <em>error Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.errorQuery
	 * @generated
	 */
	public Adapter createerrorQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.typeQuery <em>type Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.typeQuery
	 * @generated
	 */
	public Adapter createtypeQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.systemQuery <em>system Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.systemQuery
	 * @generated
	 */
	public Adapter createsystemQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.nameStorage <em>name Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.nameStorage
	 * @generated
	 */
	public Adapter createnameStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.sizeStorage <em>size Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.sizeStorage
	 * @generated
	 */
	public Adapter createsizeStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.initialContentStorage <em>initial Content Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.initialContentStorage
	 * @generated
	 */
	public Adapter createinitialContentStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.overflowStorage <em>overflow Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.overflowStorage
	 * @generated
	 */
	public Adapter createoverflowStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.nameSupplier <em>name Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.nameSupplier
	 * @generated
	 */
	public Adapter createnameSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.deliveredPercentageSupplier <em>delivered Percentage Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.deliveredPercentageSupplier
	 * @generated
	 */
	public Adapter createdeliveredPercentageSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.nameBatchProcess <em>name Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.nameBatchProcess
	 * @generated
	 */
	public Adapter createnameBatchProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.percentageOfSuccessBatchProcess <em>percentage Of Success Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.percentageOfSuccessBatchProcess
	 * @generated
	 */
	public Adapter createpercentageOfSuccessBatchProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.numberOfChainsBatchProcess <em>number Of Chains Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.numberOfChainsBatchProcess
	 * @generated
	 */
	public Adapter createnumberOfChainsBatchProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.typeOutput <em>type Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.typeOutput
	 * @generated
	 */
	public Adapter createtypeOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.descriptionOutput <em>description Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.descriptionOutput
	 * @generated
	 */
	public Adapter createdescriptionOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.periodOrderOnStockThreshold <em>period Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.periodOrderOnStockThreshold
	 * @generated
	 */
	public Adapter createperiodOrderOnStockThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.thresholdOrderOnStockThreshold <em>threshold Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.thresholdOrderOnStockThreshold
	 * @generated
	 */
	public Adapter createthresholdOrderOnStockThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.nameOrderOnStockThreshold <em>name Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.nameOrderOnStockThreshold
	 * @generated
	 */
	public Adapter createnameOrderOnStockThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.orderQuantityOrderOnStockThreshold <em>order Quantity Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.orderQuantityOrderOnStockThreshold
	 * @generated
	 */
	public Adapter createorderQuantityOrderOnStockThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.orderTypeOrderOnStockThreshold <em>order Type Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.orderTypeOrderOnStockThreshold
	 * @generated
	 */
	public Adapter createorderTypeOrderOnStockThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.valueScalar <em>value Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.valueScalar
	 * @generated
	 */
	public Adapter createvalueScalarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.locationGaussian <em>location Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.locationGaussian
	 * @generated
	 */
	public Adapter createlocationGaussianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.scaleGaussian <em>scale Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.scaleGaussian
	 * @generated
	 */
	public Adapter createscaleGaussianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.intervalPoisson <em>interval Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.intervalPoisson
	 * @generated
	 */
	public Adapter createintervalPoissonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.minimumUniform <em>minimum Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.minimumUniform
	 * @generated
	 */
	public Adapter createminimumUniformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.maximumUniform <em>maximum Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.maximumUniform
	 * @generated
	 */
	public Adapter createmaximumUniformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.nameConveyorBelt <em>name Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.nameConveyorBelt
	 * @generated
	 */
	public Adapter createnameConveyorBeltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt <em>minimal Separation Between Batches Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt
	 * @generated
	 */
	public Adapter createminimalSeparationBetweenBatchesConveyorBeltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.NoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.NoneElement
	 * @generated
	 */
	public Adapter createNoneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.BindingElement
	 * @generated
	 */
	public Adapter createBindingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.IntermediateElement <em>Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.IntermediateElement
	 * @generated
	 */
	public Adapter createIntermediateElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.MetamodelElement
	 * @generated
	 */
	public Adapter createMetamodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.MetamodelElementFeature
	 * @generated
	 */
	public Adapter createMetamodelElementFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.BindingAttribute <em>Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.BindingAttribute
	 * @generated
	 */
	public Adapter createBindingAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.VirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.VirtualAttribute
	 * @generated
	 */
	public Adapter createVirtualAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel_bdsl.SiriusTag <em>Sirius Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel_bdsl.SiriusTag
	 * @generated
	 */
	public Adapter createSiriusTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Metamodel_bdslAdapterFactory

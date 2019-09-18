/**
 */
package metamodel_bdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metamodel_bdsl.Metamodel_bdslPackage
 * @generated
 */
public interface Metamodel_bdslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Metamodel_bdslFactory eINSTANCE = metamodel_bdsl.impl.Metamodel_bdslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier</em>'.
	 * @generated
	 */
	Supplier createSupplier();

	/**
	 * Returns a new object of class '<em>Batch Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Batch Process</em>'.
	 * @generated
	 */
	BatchProcess createBatchProcess();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns a new object of class '<em>Storage Output Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Output Flow</em>'.
	 * @generated
	 */
	StorageOutputFlow createStorageOutputFlow();

	/**
	 * Returns a new object of class '<em>Process Output Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Output Flow</em>'.
	 * @generated
	 */
	ProcessOutputFlow createProcessOutputFlow();

	/**
	 * Returns a new object of class '<em>Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order On Stock Threshold</em>'.
	 * @generated
	 */
	OrderOnStockThreshold createOrderOnStockThreshold();

	/**
	 * Returns a new object of class '<em>Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar</em>'.
	 * @generated
	 */
	Scalar createScalar();

	/**
	 * Returns a new object of class '<em>Gaussian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gaussian</em>'.
	 * @generated
	 */
	Gaussian createGaussian();

	/**
	 * Returns a new object of class '<em>Poisson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poisson</em>'.
	 * @generated
	 */
	Poisson createPoisson();

	/**
	 * Returns a new object of class '<em>Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniform</em>'.
	 * @generated
	 */
	Uniform createUniform();

	/**
	 * Returns a new object of class '<em>Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor Belt</em>'.
	 * @generated
	 */
	ConveyorBelt createConveyorBelt();

	/**
	 * Returns a new object of class '<em>storage Output Flow Storage21</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>storage Output Flow Storage21</em>'.
	 * @generated
	 */
	storageOutputFlowStorage21 createstorageOutputFlowStorage21();

	/**
	 * Returns a new object of class '<em>order On Stock Threshold Storage22</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>order On Stock Threshold Storage22</em>'.
	 * @generated
	 */
	orderOnStockThresholdStorage22 createorderOnStockThresholdStorage22();

	/**
	 * Returns a new object of class '<em>process Output Flow Storage23</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>process Output Flow Storage23</em>'.
	 * @generated
	 */
	processOutputFlowStorage23 createprocessOutputFlowStorage23();

	/**
	 * Returns a new object of class '<em>refill Policy Supplier31</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>refill Policy Supplier31</em>'.
	 * @generated
	 */
	refillPolicySupplier31 createrefillPolicySupplier31();

	/**
	 * Returns a new object of class '<em>supplier Delay Supplier32</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>supplier Delay Supplier32</em>'.
	 * @generated
	 */
	supplierDelaySupplier32 createsupplierDelaySupplier32();

	/**
	 * Returns a new object of class '<em>storage Output Flow Batch Process41</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>storage Output Flow Batch Process41</em>'.
	 * @generated
	 */
	storageOutputFlowBatchProcess41 createstorageOutputFlowBatchProcess41();

	/**
	 * Returns a new object of class '<em>duration Batch Process42</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>duration Batch Process42</em>'.
	 * @generated
	 */
	durationBatchProcess42 createdurationBatchProcess42();

	/**
	 * Returns a new object of class '<em>outputs Batch Process43</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>outputs Batch Process43</em>'.
	 * @generated
	 */
	outputsBatchProcess43 createoutputsBatchProcess43();

	/**
	 * Returns a new object of class '<em>process Output Flow Output51</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>process Output Flow Output51</em>'.
	 * @generated
	 */
	processOutputFlowOutput51 createprocessOutputFlowOutput51();

	/**
	 * Returns a new object of class '<em>quantity Storage Output Flow61</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>quantity Storage Output Flow61</em>'.
	 * @generated
	 */
	quantityStorageOutputFlow61 createquantityStorageOutputFlow61();

	/**
	 * Returns a new object of class '<em>source Storage Output Flow62</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>source Storage Output Flow62</em>'.
	 * @generated
	 */
	sourceStorageOutputFlow62 createsourceStorageOutputFlow62();

	/**
	 * Returns a new object of class '<em>destination Storage Output Flow63</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>destination Storage Output Flow63</em>'.
	 * @generated
	 */
	destinationStorageOutputFlow63 createdestinationStorageOutputFlow63();

	/**
	 * Returns a new object of class '<em>quantity Process Output Flow71</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>quantity Process Output Flow71</em>'.
	 * @generated
	 */
	quantityProcessOutputFlow71 createquantityProcessOutputFlow71();

	/**
	 * Returns a new object of class '<em>source Process Output Flow72</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>source Process Output Flow72</em>'.
	 * @generated
	 */
	sourceProcessOutputFlow72 createsourceProcessOutputFlow72();

	/**
	 * Returns a new object of class '<em>process Output Flow Delay Process Output Flow73</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>process Output Flow Delay Process Output Flow73</em>'.
	 * @generated
	 */
	processOutputFlowDelayProcessOutputFlow73 createprocessOutputFlowDelayProcessOutputFlow73();

	/**
	 * Returns a new object of class '<em>destination Process Output Flow74</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>destination Process Output Flow74</em>'.
	 * @generated
	 */
	destinationProcessOutputFlow74 createdestinationProcessOutputFlow74();

	/**
	 * Returns a new object of class '<em>supplier Order On Stock Threshold81</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>supplier Order On Stock Threshold81</em>'.
	 * @generated
	 */
	supplierOrderOnStockThreshold81 createsupplierOrderOnStockThreshold81();

	/**
	 * Returns a new object of class '<em>storage Order On Stock Threshold82</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>storage Order On Stock Threshold82</em>'.
	 * @generated
	 */
	storageOrderOnStockThreshold82 createstorageOrderOnStockThreshold82();

	/**
	 * Returns a new object of class '<em>storage Output Flow Conveyor Belt131</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>storage Output Flow Conveyor Belt131</em>'.
	 * @generated
	 */
	storageOutputFlowConveyorBelt131 createstorageOutputFlowConveyorBelt131();

	/**
	 * Returns a new object of class '<em>duration Conveyor Belt132</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>duration Conveyor Belt132</em>'.
	 * @generated
	 */
	durationConveyorBelt132 createdurationConveyorBelt132();

	/**
	 * Returns a new object of class '<em>output Conveyor Belt133</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>output Conveyor Belt133</em>'.
	 * @generated
	 */
	outputConveyorBelt133 createoutputConveyorBelt133();

	/**
	 * Returns a new object of class '<em>name Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Query</em>'.
	 * @generated
	 */
	nameQuery createnameQuery();

	/**
	 * Returns a new object of class '<em>value Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>value Query</em>'.
	 * @generated
	 */
	valueQuery createvalueQuery();

	/**
	 * Returns a new object of class '<em>error Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>error Query</em>'.
	 * @generated
	 */
	errorQuery createerrorQuery();

	/**
	 * Returns a new object of class '<em>type Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>type Query</em>'.
	 * @generated
	 */
	typeQuery createtypeQuery();

	/**
	 * Returns a new object of class '<em>system Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>system Query</em>'.
	 * @generated
	 */
	systemQuery createsystemQuery();

	/**
	 * Returns a new object of class '<em>name Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Storage</em>'.
	 * @generated
	 */
	nameStorage createnameStorage();

	/**
	 * Returns a new object of class '<em>size Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>size Storage</em>'.
	 * @generated
	 */
	sizeStorage createsizeStorage();

	/**
	 * Returns a new object of class '<em>initial Content Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>initial Content Storage</em>'.
	 * @generated
	 */
	initialContentStorage createinitialContentStorage();

	/**
	 * Returns a new object of class '<em>overflow Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>overflow Storage</em>'.
	 * @generated
	 */
	overflowStorage createoverflowStorage();

	/**
	 * Returns a new object of class '<em>name Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Supplier</em>'.
	 * @generated
	 */
	nameSupplier createnameSupplier();

	/**
	 * Returns a new object of class '<em>delivered Percentage Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>delivered Percentage Supplier</em>'.
	 * @generated
	 */
	deliveredPercentageSupplier createdeliveredPercentageSupplier();

	/**
	 * Returns a new object of class '<em>name Batch Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Batch Process</em>'.
	 * @generated
	 */
	nameBatchProcess createnameBatchProcess();

	/**
	 * Returns a new object of class '<em>percentage Of Success Batch Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>percentage Of Success Batch Process</em>'.
	 * @generated
	 */
	percentageOfSuccessBatchProcess createpercentageOfSuccessBatchProcess();

	/**
	 * Returns a new object of class '<em>number Of Chains Batch Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>number Of Chains Batch Process</em>'.
	 * @generated
	 */
	numberOfChainsBatchProcess createnumberOfChainsBatchProcess();

	/**
	 * Returns a new object of class '<em>type Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>type Output</em>'.
	 * @generated
	 */
	typeOutput createtypeOutput();

	/**
	 * Returns a new object of class '<em>description Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>description Output</em>'.
	 * @generated
	 */
	descriptionOutput createdescriptionOutput();

	/**
	 * Returns a new object of class '<em>period Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>period Order On Stock Threshold</em>'.
	 * @generated
	 */
	periodOrderOnStockThreshold createperiodOrderOnStockThreshold();

	/**
	 * Returns a new object of class '<em>threshold Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>threshold Order On Stock Threshold</em>'.
	 * @generated
	 */
	thresholdOrderOnStockThreshold createthresholdOrderOnStockThreshold();

	/**
	 * Returns a new object of class '<em>name Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Order On Stock Threshold</em>'.
	 * @generated
	 */
	nameOrderOnStockThreshold createnameOrderOnStockThreshold();

	/**
	 * Returns a new object of class '<em>order Quantity Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>order Quantity Order On Stock Threshold</em>'.
	 * @generated
	 */
	orderQuantityOrderOnStockThreshold createorderQuantityOrderOnStockThreshold();

	/**
	 * Returns a new object of class '<em>order Type Order On Stock Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>order Type Order On Stock Threshold</em>'.
	 * @generated
	 */
	orderTypeOrderOnStockThreshold createorderTypeOrderOnStockThreshold();

	/**
	 * Returns a new object of class '<em>value Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>value Scalar</em>'.
	 * @generated
	 */
	valueScalar createvalueScalar();

	/**
	 * Returns a new object of class '<em>location Gaussian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>location Gaussian</em>'.
	 * @generated
	 */
	locationGaussian createlocationGaussian();

	/**
	 * Returns a new object of class '<em>scale Gaussian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>scale Gaussian</em>'.
	 * @generated
	 */
	scaleGaussian createscaleGaussian();

	/**
	 * Returns a new object of class '<em>interval Poisson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>interval Poisson</em>'.
	 * @generated
	 */
	intervalPoisson createintervalPoisson();

	/**
	 * Returns a new object of class '<em>minimum Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>minimum Uniform</em>'.
	 * @generated
	 */
	minimumUniform createminimumUniform();

	/**
	 * Returns a new object of class '<em>maximum Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>maximum Uniform</em>'.
	 * @generated
	 */
	maximumUniform createmaximumUniform();

	/**
	 * Returns a new object of class '<em>name Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Conveyor Belt</em>'.
	 * @generated
	 */
	nameConveyorBelt createnameConveyorBelt();

	/**
	 * Returns a new object of class '<em>minimal Separation Between Batches Conveyor Belt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>minimal Separation Between Batches Conveyor Belt</em>'.
	 * @generated
	 */
	minimalSeparationBetweenBatchesConveyorBelt createminimalSeparationBetweenBatchesConveyorBelt();

	/**
	 * Returns a new object of class '<em>None Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Element</em>'.
	 * @generated
	 */
	NoneElement createNoneElement();

	/**
	 * Returns a new object of class '<em>Intermediate Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Element</em>'.
	 * @generated
	 */
	IntermediateElement createIntermediateElement();

	/**
	 * Returns a new object of class '<em>Metamodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Element</em>'.
	 * @generated
	 */
	MetamodelElement createMetamodelElement();

	/**
	 * Returns a new object of class '<em>Metamodel Element Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Element Feature</em>'.
	 * @generated
	 */
	MetamodelElementFeature createMetamodelElementFeature();

	/**
	 * Returns a new object of class '<em>Virtual Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Attribute</em>'.
	 * @generated
	 */
	VirtualAttribute createVirtualAttribute();

	/**
	 * Returns a new object of class '<em>Sirius Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sirius Tag</em>'.
	 * @generated
	 */
	SiriusTag createSiriusTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Metamodel_bdslPackage getMetamodel_bdslPackage();

} //Metamodel_bdslFactory

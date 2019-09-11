/**
 */
package metamodel_bdsl.impl;

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
import metamodel_bdsl.Metamodel_bdslFactory;
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

import metamodel_bdsl.util.Metamodel_bdslValidator;

import metamodel_bdsl.valueQuery;
import metamodel_bdsl.valueScalar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Metamodel_bdslPackageImpl extends EPackageImpl implements Metamodel_bdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageOutputFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processOutputFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderOnStockThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaussianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poissonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorBeltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialContentStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overflowStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameSupplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveredPercentageSupplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameBatchProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageOfSuccessBatchProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfChainsBatchProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodOrderOnStockThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdOrderOnStockThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameOrderOnStockThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderQuantityOrderOnStockThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTypeOrderOnStockThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueScalarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationGaussianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleGaussianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalPoissonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimumUniformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumUniformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameConveyorBeltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimalSeparationBetweenBatchesConveyorBeltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntNotNullEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveDoubleNotNullEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see metamodel_bdsl.Metamodel_bdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Metamodel_bdslPackageImpl() {
		super(eNS_URI, Metamodel_bdslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Metamodel_bdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Metamodel_bdslPackage init() {
		if (isInited) return (Metamodel_bdslPackage)EPackage.Registry.INSTANCE.getEPackage(Metamodel_bdslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetamodel_bdslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Metamodel_bdslPackageImpl theMetamodel_bdslPackage = registeredMetamodel_bdslPackage instanceof Metamodel_bdslPackageImpl ? (Metamodel_bdslPackageImpl)registeredMetamodel_bdslPackage : new Metamodel_bdslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetamodel_bdslPackage.createPackageContents();

		// Initialize created meta-data
		theMetamodel_bdslPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMetamodel_bdslPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Metamodel_bdslValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMetamodel_bdslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Metamodel_bdslPackage.eNS_URI, theMetamodel_bdslPackage);
		return theMetamodel_bdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Query() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_OrderOnStockThreshold() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Component() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Flow() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ContainsNoneElement() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ContainsBindingElement() {
		return (EReference)modelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ContainsIntermediateElement() {
		return (EReference)modelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ContainsMetamodelElement() {
		return (EReference)modelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ContainsMetamodelElementFeature() {
		return (EReference)modelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ContainsBindingAttribute() {
		return (EReference)modelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ContainsVirtualAttribute() {
		return (EReference)modelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Name() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Value() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Error() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Type() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_System() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ContainsnameQuery() {
		return (EReference)queryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ContainsvalueQuery() {
		return (EReference)queryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ContainserrorQuery() {
		return (EReference)queryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ContainstypeQuery() {
		return (EReference)queryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ContainssystemQuery() {
		return (EReference)queryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_Size() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_InitialContent() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_Overflow() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_StorageOutputFlow() {
		return (EReference)storageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_OrderOnStockThreshold() {
		return (EReference)storageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_ProcessOutputFlow() {
		return (EReference)storageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_ContainsnameStorage() {
		return (EReference)storageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_ContainssizeStorage() {
		return (EReference)storageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_ContainsinitialContentStorage() {
		return (EReference)storageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_ContainsoverflowStorage() {
		return (EReference)storageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplier() {
		return supplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplier_DeliveredPercentage() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplier_RefillPolicy() {
		return (EReference)supplierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplier_SupplierDelay() {
		return (EReference)supplierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplier_ContainsnameSupplier() {
		return (EReference)supplierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplier_ContainsdeliveredPercentageSupplier() {
		return (EReference)supplierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchProcess() {
		return batchProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchProcess_PercentageOfSuccess() {
		return (EAttribute)batchProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchProcess_NumberOfChains() {
		return (EAttribute)batchProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchProcess_Outputs() {
		return (EReference)batchProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchProcess_ContainsnameBatchProcess() {
		return (EReference)batchProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchProcess_ContainspercentageOfSuccessBatchProcess() {
		return (EReference)batchProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchProcess_ContainsnumberOfChainsBatchProcess() {
		return (EReference)batchProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Type() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_ProcessOutputFlow() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Description() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_ContainstypeOutput() {
		return (EReference)outputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_ContainsdescriptionOutput() {
		return (EReference)outputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageOutputFlow() {
		return storageOutputFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageOutputFlow_Source() {
		return (EReference)storageOutputFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageOutputFlow_Destination() {
		return (EReference)storageOutputFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessOutputFlow() {
		return processOutputFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessOutputFlow_Source() {
		return (EReference)processOutputFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessOutputFlow_ProcessOutputFlowDelay() {
		return (EReference)processOutputFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessOutputFlow_Destination() {
		return (EReference)processOutputFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_StorageOutputFlow() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Duration() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderOnStockThreshold() {
		return orderOnStockThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderOnStockThreshold_Period() {
		return (EAttribute)orderOnStockThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderOnStockThreshold_Threshold() {
		return (EAttribute)orderOnStockThresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderOnStockThreshold_Name() {
		return (EAttribute)orderOnStockThresholdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderOnStockThreshold_OrderQuantity() {
		return (EAttribute)orderOnStockThresholdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderOnStockThreshold_OrderType() {
		return (EAttribute)orderOnStockThresholdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderOnStockThreshold_Supplier() {
		return (EReference)orderOnStockThresholdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderOnStockThreshold_Storage() {
		return (EReference)orderOnStockThresholdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderOnStockThreshold_ContainsperiodOrderOnStockThreshold() {
		return (EReference)orderOnStockThresholdEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderOnStockThreshold_ContainsthresholdOrderOnStockThreshold() {
		return (EReference)orderOnStockThresholdEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderOnStockThreshold_ContainsnameOrderOnStockThreshold() {
		return (EReference)orderOnStockThresholdEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderOnStockThreshold_ContainsorderQuantityOrderOnStockThreshold() {
		return (EReference)orderOnStockThresholdEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderOnStockThreshold_ContainsorderTypeOrderOnStockThreshold() {
		return (EReference)orderOnStockThresholdEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Quantity() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbability() {
		return probabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistribution() {
		return distributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScalar() {
		return scalarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScalar_Value() {
		return (EAttribute)scalarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScalar_ContainsvalueScalar() {
		return (EReference)scalarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaussian() {
		return gaussianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGaussian_Location() {
		return (EAttribute)gaussianEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGaussian_Scale() {
		return (EAttribute)gaussianEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaussian_ContainslocationGaussian() {
		return (EReference)gaussianEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaussian_ContainsscaleGaussian() {
		return (EReference)gaussianEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoisson() {
		return poissonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoisson_Interval() {
		return (EAttribute)poissonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoisson_ContainsintervalPoisson() {
		return (EReference)poissonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniform() {
		return uniformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniform_Minimum() {
		return (EAttribute)uniformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniform_Maximum() {
		return (EAttribute)uniformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniform_ContainsminimumUniform() {
		return (EReference)uniformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniform_ContainsmaximumUniform() {
		return (EReference)uniformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyorBelt() {
		return conveyorBeltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyorBelt_MinimalSeparationBetweenBatches() {
		return (EAttribute)conveyorBeltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_Output() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_ContainsnameConveyorBelt() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyorBelt_ContainsminimalSeparationBetweenBatchesConveyorBelt() {
		return (EReference)conveyorBeltEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameQuery() {
		return nameQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameQuery_Value() {
		return (EAttribute)nameQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvalueQuery() {
		return valueQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvalueQuery_Value() {
		return (EAttribute)valueQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass geterrorQuery() {
		return errorQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute geterrorQuery_Value() {
		return (EAttribute)errorQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettypeQuery() {
		return typeQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettypeQuery_Value() {
		return (EAttribute)typeQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsystemQuery() {
		return systemQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsystemQuery_Value() {
		return (EAttribute)systemQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameStorage() {
		return nameStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameStorage_Value() {
		return (EAttribute)nameStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsizeStorage() {
		return sizeStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsizeStorage_Value() {
		return (EAttribute)sizeStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinitialContentStorage() {
		return initialContentStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getinitialContentStorage_Value() {
		return (EAttribute)initialContentStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoverflowStorage() {
		return overflowStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoverflowStorage_Value() {
		return (EAttribute)overflowStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameSupplier() {
		return nameSupplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameSupplier_Value() {
		return (EAttribute)nameSupplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdeliveredPercentageSupplier() {
		return deliveredPercentageSupplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdeliveredPercentageSupplier_Value() {
		return (EAttribute)deliveredPercentageSupplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameBatchProcess() {
		return nameBatchProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameBatchProcess_Value() {
		return (EAttribute)nameBatchProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpercentageOfSuccessBatchProcess() {
		return percentageOfSuccessBatchProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpercentageOfSuccessBatchProcess_Value() {
		return (EAttribute)percentageOfSuccessBatchProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnumberOfChainsBatchProcess() {
		return numberOfChainsBatchProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnumberOfChainsBatchProcess_Value() {
		return (EAttribute)numberOfChainsBatchProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettypeOutput() {
		return typeOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettypeOutput_Value() {
		return (EAttribute)typeOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdescriptionOutput() {
		return descriptionOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdescriptionOutput_Value() {
		return (EAttribute)descriptionOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getperiodOrderOnStockThreshold() {
		return periodOrderOnStockThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getperiodOrderOnStockThreshold_Value() {
		return (EAttribute)periodOrderOnStockThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getthresholdOrderOnStockThreshold() {
		return thresholdOrderOnStockThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getthresholdOrderOnStockThreshold_Value() {
		return (EAttribute)thresholdOrderOnStockThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameOrderOnStockThreshold() {
		return nameOrderOnStockThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameOrderOnStockThreshold_Value() {
		return (EAttribute)nameOrderOnStockThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getorderQuantityOrderOnStockThreshold() {
		return orderQuantityOrderOnStockThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getorderQuantityOrderOnStockThreshold_Value() {
		return (EAttribute)orderQuantityOrderOnStockThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getorderTypeOrderOnStockThreshold() {
		return orderTypeOrderOnStockThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getorderTypeOrderOnStockThreshold_Value() {
		return (EAttribute)orderTypeOrderOnStockThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvalueScalar() {
		return valueScalarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvalueScalar_Value() {
		return (EAttribute)valueScalarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlocationGaussian() {
		return locationGaussianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlocationGaussian_Value() {
		return (EAttribute)locationGaussianEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscaleGaussian() {
		return scaleGaussianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getscaleGaussian_Value() {
		return (EAttribute)scaleGaussianEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getintervalPoisson() {
		return intervalPoissonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getintervalPoisson_Value() {
		return (EAttribute)intervalPoissonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getminimumUniform() {
		return minimumUniformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getminimumUniform_Value() {
		return (EAttribute)minimumUniformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmaximumUniform() {
		return maximumUniformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmaximumUniform_Value() {
		return (EAttribute)maximumUniformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameConveyorBelt() {
		return nameConveyorBeltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameConveyorBelt_Value() {
		return (EAttribute)nameConveyorBeltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getminimalSeparationBetweenBatchesConveyorBelt() {
		return minimalSeparationBetweenBatchesConveyorBeltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getminimalSeparationBetweenBatchesConveyorBelt_Value() {
		return (EAttribute)minimalSeparationBetweenBatchesConveyorBeltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoneElement() {
		return noneElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingElement() {
		return bindingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingElement_NoneElement() {
		return (EReference)bindingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateElement() {
		return intermediateElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateElement_BindingElement() {
		return (EReference)intermediateElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateElement_MetamodelElement() {
		return (EReference)intermediateElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelElement() {
		return metamodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElement_VirtualAttribute() {
		return (EReference)metamodelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElement_MetamodelElementFeature() {
		return (EReference)metamodelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElement_Name() {
		return (EAttribute)metamodelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelElementFeature() {
		return metamodelElementFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElementFeature_FeatureClass() {
		return (EReference)metamodelElementFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementFeature_Name() {
		return (EAttribute)metamodelElementFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingAttribute() {
		return bindingAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualAttribute() {
		return virtualAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualAttribute_To_virtualAttribute() {
		return (EReference)virtualAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualAttribute_Name() {
		return (EAttribute)virtualAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualAttribute_Expression() {
		return (EAttribute)virtualAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderType() {
		return orderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOutputType() {
		return outputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueryType() {
		return queryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercent() {
		return percentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveInt() {
		return positiveIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveDouble() {
		return positiveDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveIntNotNull() {
		return positiveIntNotNullEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveDoubleNotNull() {
		return positiveDoubleNotNullEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel_bdslFactory getMetamodel_bdslFactory() {
		return (Metamodel_bdslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__QUERY);
		createEReference(modelEClass, MODEL__ORDER_ON_STOCK_THRESHOLD);
		createEReference(modelEClass, MODEL__COMPONENT);
		createEReference(modelEClass, MODEL__FLOW);
		createEReference(modelEClass, MODEL__CONTAINS_NONE_ELEMENT);
		createEReference(modelEClass, MODEL__CONTAINS_BINDING_ELEMENT);
		createEReference(modelEClass, MODEL__CONTAINS_INTERMEDIATE_ELEMENT);
		createEReference(modelEClass, MODEL__CONTAINS_METAMODEL_ELEMENT);
		createEReference(modelEClass, MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		createEReference(modelEClass, MODEL__CONTAINS_BINDING_ATTRIBUTE);
		createEReference(modelEClass, MODEL__CONTAINS_VIRTUAL_ATTRIBUTE);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__NAME);
		createEAttribute(queryEClass, QUERY__VALUE);
		createEAttribute(queryEClass, QUERY__ERROR);
		createEAttribute(queryEClass, QUERY__TYPE);
		createEAttribute(queryEClass, QUERY__SYSTEM);
		createEReference(queryEClass, QUERY__CONTAINSNAME_QUERY);
		createEReference(queryEClass, QUERY__CONTAINSVALUE_QUERY);
		createEReference(queryEClass, QUERY__CONTAINSERROR_QUERY);
		createEReference(queryEClass, QUERY__CONTAINSTYPE_QUERY);
		createEReference(queryEClass, QUERY__CONTAINSSYSTEM_QUERY);

		storageEClass = createEClass(STORAGE);
		createEAttribute(storageEClass, STORAGE__SIZE);
		createEAttribute(storageEClass, STORAGE__INITIAL_CONTENT);
		createEAttribute(storageEClass, STORAGE__OVERFLOW);
		createEReference(storageEClass, STORAGE__STORAGE_OUTPUT_FLOW);
		createEReference(storageEClass, STORAGE__ORDER_ON_STOCK_THRESHOLD);
		createEReference(storageEClass, STORAGE__PROCESS_OUTPUT_FLOW);
		createEReference(storageEClass, STORAGE__CONTAINSNAME_STORAGE);
		createEReference(storageEClass, STORAGE__CONTAINSSIZE_STORAGE);
		createEReference(storageEClass, STORAGE__CONTAINSINITIAL_CONTENT_STORAGE);
		createEReference(storageEClass, STORAGE__CONTAINSOVERFLOW_STORAGE);

		supplierEClass = createEClass(SUPPLIER);
		createEAttribute(supplierEClass, SUPPLIER__DELIVERED_PERCENTAGE);
		createEReference(supplierEClass, SUPPLIER__REFILL_POLICY);
		createEReference(supplierEClass, SUPPLIER__SUPPLIER_DELAY);
		createEReference(supplierEClass, SUPPLIER__CONTAINSNAME_SUPPLIER);
		createEReference(supplierEClass, SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER);

		batchProcessEClass = createEClass(BATCH_PROCESS);
		createEAttribute(batchProcessEClass, BATCH_PROCESS__PERCENTAGE_OF_SUCCESS);
		createEAttribute(batchProcessEClass, BATCH_PROCESS__NUMBER_OF_CHAINS);
		createEReference(batchProcessEClass, BATCH_PROCESS__OUTPUTS);
		createEReference(batchProcessEClass, BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS);
		createEReference(batchProcessEClass, BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS);
		createEReference(batchProcessEClass, BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__TYPE);
		createEReference(outputEClass, OUTPUT__PROCESS_OUTPUT_FLOW);
		createEAttribute(outputEClass, OUTPUT__DESCRIPTION);
		createEReference(outputEClass, OUTPUT__CONTAINSTYPE_OUTPUT);
		createEReference(outputEClass, OUTPUT__CONTAINSDESCRIPTION_OUTPUT);

		storageOutputFlowEClass = createEClass(STORAGE_OUTPUT_FLOW);
		createEReference(storageOutputFlowEClass, STORAGE_OUTPUT_FLOW__SOURCE);
		createEReference(storageOutputFlowEClass, STORAGE_OUTPUT_FLOW__DESTINATION);

		processOutputFlowEClass = createEClass(PROCESS_OUTPUT_FLOW);
		createEReference(processOutputFlowEClass, PROCESS_OUTPUT_FLOW__SOURCE);
		createEReference(processOutputFlowEClass, PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY);
		createEReference(processOutputFlowEClass, PROCESS_OUTPUT_FLOW__DESTINATION);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__STORAGE_OUTPUT_FLOW);
		createEReference(processEClass, PROCESS__DURATION);

		orderOnStockThresholdEClass = createEClass(ORDER_ON_STOCK_THRESHOLD);
		createEAttribute(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__PERIOD);
		createEAttribute(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__THRESHOLD);
		createEAttribute(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__NAME);
		createEAttribute(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__ORDER_QUANTITY);
		createEAttribute(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__ORDER_TYPE);
		createEReference(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__SUPPLIER);
		createEReference(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__STORAGE);
		createEReference(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD);
		createEReference(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD);
		createEReference(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD);
		createEReference(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD);
		createEReference(orderOnStockThresholdEClass, ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__QUANTITY);

		probabilityEClass = createEClass(PROBABILITY);

		distributionEClass = createEClass(DISTRIBUTION);

		scalarEClass = createEClass(SCALAR);
		createEAttribute(scalarEClass, SCALAR__VALUE);
		createEReference(scalarEClass, SCALAR__CONTAINSVALUE_SCALAR);

		gaussianEClass = createEClass(GAUSSIAN);
		createEAttribute(gaussianEClass, GAUSSIAN__LOCATION);
		createEAttribute(gaussianEClass, GAUSSIAN__SCALE);
		createEReference(gaussianEClass, GAUSSIAN__CONTAINSLOCATION_GAUSSIAN);
		createEReference(gaussianEClass, GAUSSIAN__CONTAINSSCALE_GAUSSIAN);

		poissonEClass = createEClass(POISSON);
		createEAttribute(poissonEClass, POISSON__INTERVAL);
		createEReference(poissonEClass, POISSON__CONTAINSINTERVAL_POISSON);

		uniformEClass = createEClass(UNIFORM);
		createEAttribute(uniformEClass, UNIFORM__MINIMUM);
		createEAttribute(uniformEClass, UNIFORM__MAXIMUM);
		createEReference(uniformEClass, UNIFORM__CONTAINSMINIMUM_UNIFORM);
		createEReference(uniformEClass, UNIFORM__CONTAINSMAXIMUM_UNIFORM);

		conveyorBeltEClass = createEClass(CONVEYOR_BELT);
		createEAttribute(conveyorBeltEClass, CONVEYOR_BELT__MINIMAL_SEPARATION_BETWEEN_BATCHES);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__OUTPUT);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT);
		createEReference(conveyorBeltEClass, CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT);

		nameQueryEClass = createEClass(NAME_QUERY);
		createEAttribute(nameQueryEClass, NAME_QUERY__VALUE);

		valueQueryEClass = createEClass(VALUE_QUERY);
		createEAttribute(valueQueryEClass, VALUE_QUERY__VALUE);

		errorQueryEClass = createEClass(ERROR_QUERY);
		createEAttribute(errorQueryEClass, ERROR_QUERY__VALUE);

		typeQueryEClass = createEClass(TYPE_QUERY);
		createEAttribute(typeQueryEClass, TYPE_QUERY__VALUE);

		systemQueryEClass = createEClass(SYSTEM_QUERY);
		createEAttribute(systemQueryEClass, SYSTEM_QUERY__VALUE);

		nameStorageEClass = createEClass(NAME_STORAGE);
		createEAttribute(nameStorageEClass, NAME_STORAGE__VALUE);

		sizeStorageEClass = createEClass(SIZE_STORAGE);
		createEAttribute(sizeStorageEClass, SIZE_STORAGE__VALUE);

		initialContentStorageEClass = createEClass(INITIAL_CONTENT_STORAGE);
		createEAttribute(initialContentStorageEClass, INITIAL_CONTENT_STORAGE__VALUE);

		overflowStorageEClass = createEClass(OVERFLOW_STORAGE);
		createEAttribute(overflowStorageEClass, OVERFLOW_STORAGE__VALUE);

		nameSupplierEClass = createEClass(NAME_SUPPLIER);
		createEAttribute(nameSupplierEClass, NAME_SUPPLIER__VALUE);

		deliveredPercentageSupplierEClass = createEClass(DELIVERED_PERCENTAGE_SUPPLIER);
		createEAttribute(deliveredPercentageSupplierEClass, DELIVERED_PERCENTAGE_SUPPLIER__VALUE);

		nameBatchProcessEClass = createEClass(NAME_BATCH_PROCESS);
		createEAttribute(nameBatchProcessEClass, NAME_BATCH_PROCESS__VALUE);

		percentageOfSuccessBatchProcessEClass = createEClass(PERCENTAGE_OF_SUCCESS_BATCH_PROCESS);
		createEAttribute(percentageOfSuccessBatchProcessEClass, PERCENTAGE_OF_SUCCESS_BATCH_PROCESS__VALUE);

		numberOfChainsBatchProcessEClass = createEClass(NUMBER_OF_CHAINS_BATCH_PROCESS);
		createEAttribute(numberOfChainsBatchProcessEClass, NUMBER_OF_CHAINS_BATCH_PROCESS__VALUE);

		typeOutputEClass = createEClass(TYPE_OUTPUT);
		createEAttribute(typeOutputEClass, TYPE_OUTPUT__VALUE);

		descriptionOutputEClass = createEClass(DESCRIPTION_OUTPUT);
		createEAttribute(descriptionOutputEClass, DESCRIPTION_OUTPUT__VALUE);

		periodOrderOnStockThresholdEClass = createEClass(PERIOD_ORDER_ON_STOCK_THRESHOLD);
		createEAttribute(periodOrderOnStockThresholdEClass, PERIOD_ORDER_ON_STOCK_THRESHOLD__VALUE);

		thresholdOrderOnStockThresholdEClass = createEClass(THRESHOLD_ORDER_ON_STOCK_THRESHOLD);
		createEAttribute(thresholdOrderOnStockThresholdEClass, THRESHOLD_ORDER_ON_STOCK_THRESHOLD__VALUE);

		nameOrderOnStockThresholdEClass = createEClass(NAME_ORDER_ON_STOCK_THRESHOLD);
		createEAttribute(nameOrderOnStockThresholdEClass, NAME_ORDER_ON_STOCK_THRESHOLD__VALUE);

		orderQuantityOrderOnStockThresholdEClass = createEClass(ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD);
		createEAttribute(orderQuantityOrderOnStockThresholdEClass, ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD__VALUE);

		orderTypeOrderOnStockThresholdEClass = createEClass(ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD);
		createEAttribute(orderTypeOrderOnStockThresholdEClass, ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD__VALUE);

		valueScalarEClass = createEClass(VALUE_SCALAR);
		createEAttribute(valueScalarEClass, VALUE_SCALAR__VALUE);

		locationGaussianEClass = createEClass(LOCATION_GAUSSIAN);
		createEAttribute(locationGaussianEClass, LOCATION_GAUSSIAN__VALUE);

		scaleGaussianEClass = createEClass(SCALE_GAUSSIAN);
		createEAttribute(scaleGaussianEClass, SCALE_GAUSSIAN__VALUE);

		intervalPoissonEClass = createEClass(INTERVAL_POISSON);
		createEAttribute(intervalPoissonEClass, INTERVAL_POISSON__VALUE);

		minimumUniformEClass = createEClass(MINIMUM_UNIFORM);
		createEAttribute(minimumUniformEClass, MINIMUM_UNIFORM__VALUE);

		maximumUniformEClass = createEClass(MAXIMUM_UNIFORM);
		createEAttribute(maximumUniformEClass, MAXIMUM_UNIFORM__VALUE);

		nameConveyorBeltEClass = createEClass(NAME_CONVEYOR_BELT);
		createEAttribute(nameConveyorBeltEClass, NAME_CONVEYOR_BELT__VALUE);

		minimalSeparationBetweenBatchesConveyorBeltEClass = createEClass(MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT);
		createEAttribute(minimalSeparationBetweenBatchesConveyorBeltEClass, MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT__VALUE);

		noneElementEClass = createEClass(NONE_ELEMENT);

		bindingElementEClass = createEClass(BINDING_ELEMENT);
		createEReference(bindingElementEClass, BINDING_ELEMENT__NONE_ELEMENT);

		intermediateElementEClass = createEClass(INTERMEDIATE_ELEMENT);
		createEReference(intermediateElementEClass, INTERMEDIATE_ELEMENT__BINDING_ELEMENT);
		createEReference(intermediateElementEClass, INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT);

		metamodelElementEClass = createEClass(METAMODEL_ELEMENT);
		createEReference(metamodelElementEClass, METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE);
		createEReference(metamodelElementEClass, METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE);
		createEAttribute(metamodelElementEClass, METAMODEL_ELEMENT__NAME);

		metamodelElementFeatureEClass = createEClass(METAMODEL_ELEMENT_FEATURE);
		createEReference(metamodelElementFeatureEClass, METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS);
		createEAttribute(metamodelElementFeatureEClass, METAMODEL_ELEMENT_FEATURE__NAME);

		bindingAttributeEClass = createEClass(BINDING_ATTRIBUTE);

		virtualAttributeEClass = createEClass(VIRTUAL_ATTRIBUTE);
		createEReference(virtualAttributeEClass, VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE);
		createEAttribute(virtualAttributeEClass, VIRTUAL_ATTRIBUTE__NAME);
		createEAttribute(virtualAttributeEClass, VIRTUAL_ATTRIBUTE__EXPRESSION);

		// Create enums
		orderTypeEEnum = createEEnum(ORDER_TYPE);
		outputTypeEEnum = createEEnum(OUTPUT_TYPE);
		queryTypeEEnum = createEEnum(QUERY_TYPE);

		// Create data types
		percentEDataType = createEDataType(PERCENT);
		positiveIntEDataType = createEDataType(POSITIVE_INT);
		positiveDoubleEDataType = createEDataType(POSITIVE_DOUBLE);
		positiveIntNotNullEDataType = createEDataType(POSITIVE_INT_NOT_NULL);
		positiveDoubleNotNullEDataType = createEDataType(POSITIVE_DOUBLE_NOT_NULL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		queryEClass.getESuperTypes().add(this.getBindingElement());
		storageEClass.getESuperTypes().add(this.getComponent());
		storageEClass.getESuperTypes().add(this.getBindingElement());
		supplierEClass.getESuperTypes().add(this.getComponent());
		supplierEClass.getESuperTypes().add(this.getBindingElement());
		batchProcessEClass.getESuperTypes().add(this.getProcess());
		batchProcessEClass.getESuperTypes().add(this.getBindingElement());
		outputEClass.getESuperTypes().add(this.getBindingElement());
		storageOutputFlowEClass.getESuperTypes().add(this.getFlow());
		storageOutputFlowEClass.getESuperTypes().add(this.getBindingElement());
		processOutputFlowEClass.getESuperTypes().add(this.getFlow());
		processOutputFlowEClass.getESuperTypes().add(this.getBindingElement());
		processEClass.getESuperTypes().add(this.getComponent());
		orderOnStockThresholdEClass.getESuperTypes().add(this.getBindingElement());
		distributionEClass.getESuperTypes().add(this.getProbability());
		scalarEClass.getESuperTypes().add(this.getProbability());
		scalarEClass.getESuperTypes().add(this.getBindingElement());
		gaussianEClass.getESuperTypes().add(this.getDistribution());
		gaussianEClass.getESuperTypes().add(this.getBindingElement());
		poissonEClass.getESuperTypes().add(this.getDistribution());
		poissonEClass.getESuperTypes().add(this.getBindingElement());
		uniformEClass.getESuperTypes().add(this.getDistribution());
		uniformEClass.getESuperTypes().add(this.getBindingElement());
		conveyorBeltEClass.getESuperTypes().add(this.getProcess());
		conveyorBeltEClass.getESuperTypes().add(this.getBindingElement());
		nameQueryEClass.getESuperTypes().add(this.getBindingAttribute());
		valueQueryEClass.getESuperTypes().add(this.getBindingAttribute());
		errorQueryEClass.getESuperTypes().add(this.getBindingAttribute());
		typeQueryEClass.getESuperTypes().add(this.getBindingAttribute());
		systemQueryEClass.getESuperTypes().add(this.getBindingAttribute());
		nameStorageEClass.getESuperTypes().add(this.getBindingAttribute());
		sizeStorageEClass.getESuperTypes().add(this.getBindingAttribute());
		initialContentStorageEClass.getESuperTypes().add(this.getBindingAttribute());
		overflowStorageEClass.getESuperTypes().add(this.getBindingAttribute());
		nameSupplierEClass.getESuperTypes().add(this.getBindingAttribute());
		deliveredPercentageSupplierEClass.getESuperTypes().add(this.getBindingAttribute());
		nameBatchProcessEClass.getESuperTypes().add(this.getBindingAttribute());
		percentageOfSuccessBatchProcessEClass.getESuperTypes().add(this.getBindingAttribute());
		numberOfChainsBatchProcessEClass.getESuperTypes().add(this.getBindingAttribute());
		typeOutputEClass.getESuperTypes().add(this.getBindingAttribute());
		descriptionOutputEClass.getESuperTypes().add(this.getBindingAttribute());
		periodOrderOnStockThresholdEClass.getESuperTypes().add(this.getBindingAttribute());
		thresholdOrderOnStockThresholdEClass.getESuperTypes().add(this.getBindingAttribute());
		nameOrderOnStockThresholdEClass.getESuperTypes().add(this.getBindingAttribute());
		orderQuantityOrderOnStockThresholdEClass.getESuperTypes().add(this.getBindingAttribute());
		orderTypeOrderOnStockThresholdEClass.getESuperTypes().add(this.getBindingAttribute());
		valueScalarEClass.getESuperTypes().add(this.getBindingAttribute());
		locationGaussianEClass.getESuperTypes().add(this.getBindingAttribute());
		scaleGaussianEClass.getESuperTypes().add(this.getBindingAttribute());
		intervalPoissonEClass.getESuperTypes().add(this.getBindingAttribute());
		minimumUniformEClass.getESuperTypes().add(this.getBindingAttribute());
		maximumUniformEClass.getESuperTypes().add(this.getBindingAttribute());
		nameConveyorBeltEClass.getESuperTypes().add(this.getBindingAttribute());
		minimalSeparationBetweenBatchesConveyorBeltEClass.getESuperTypes().add(this.getBindingAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Query(), this.getQuery(), null, "query", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_OrderOnStockThreshold(), this.getOrderOnStockThreshold(), null, "orderOnStockThreshold", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Component(), this.getComponent(), null, "component", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Flow(), this.getFlow(), null, "flow", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ContainsNoneElement(), this.getNoneElement(), null, "containsNoneElement", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ContainsBindingElement(), this.getBindingElement(), null, "containsBindingElement", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ContainsIntermediateElement(), this.getIntermediateElement(), null, "containsIntermediateElement", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ContainsMetamodelElement(), this.getMetamodelElement(), null, "containsMetamodelElement", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ContainsMetamodelElementFeature(), this.getMetamodelElementFeature(), null, "containsMetamodelElementFeature", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ContainsBindingAttribute(), this.getBindingAttribute(), null, "containsBindingAttribute", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ContainsVirtualAttribute(), this.getVirtualAttribute(), null, "containsVirtualAttribute", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Name(), ecorePackage.getEString(), "name", "query", 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Value(), ecorePackage.getEString(), "value", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Error(), ecorePackage.getEString(), "error", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_Type(), this.getQueryType(), "type", "UNDEFINED", 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_System(), ecorePackage.getEBoolean(), "system", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ContainsnameQuery(), this.getnameQuery(), null, "containsnameQuery", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ContainsvalueQuery(), this.getvalueQuery(), null, "containsvalueQuery", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ContainserrorQuery(), this.geterrorQuery(), null, "containserrorQuery", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ContainstypeQuery(), this.gettypeQuery(), null, "containstypeQuery", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_ContainssystemQuery(), this.getsystemQuery(), null, "containssystemQuery", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorage_Size(), this.getPositiveIntNotNull(), "size", "100", 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_InitialContent(), this.getPositiveInt(), "initialContent", "100", 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_Overflow(), ecorePackage.getEBoolean(), "overflow", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorage_StorageOutputFlow(), this.getStorageOutputFlow(), this.getStorageOutputFlow_Source(), "storageOutputFlow", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorage_OrderOnStockThreshold(), this.getOrderOnStockThreshold(), this.getOrderOnStockThreshold_Storage(), "orderOnStockThreshold", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorage_ProcessOutputFlow(), this.getProcessOutputFlow(), this.getProcessOutputFlow_Destination(), "processOutputFlow", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorage_ContainsnameStorage(), this.getnameStorage(), null, "containsnameStorage", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorage_ContainssizeStorage(), this.getsizeStorage(), null, "containssizeStorage", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorage_ContainsinitialContentStorage(), this.getinitialContentStorage(), null, "containsinitialContentStorage", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorage_ContainsoverflowStorage(), this.getoverflowStorage(), null, "containsoverflowStorage", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplierEClass, Supplier.class, "Supplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplier_DeliveredPercentage(), this.getPercent(), "deliveredPercentage", "100", 0, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplier_RefillPolicy(), this.getOrderOnStockThreshold(), this.getOrderOnStockThreshold_Supplier(), "refillPolicy", null, 0, -1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplier_SupplierDelay(), this.getProbability(), null, "supplierDelay", null, 1, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplier_ContainsnameSupplier(), this.getnameSupplier(), null, "containsnameSupplier", null, 0, -1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplier_ContainsdeliveredPercentageSupplier(), this.getdeliveredPercentageSupplier(), null, "containsdeliveredPercentageSupplier", null, 0, -1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batchProcessEClass, BatchProcess.class, "BatchProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatchProcess_PercentageOfSuccess(), this.getPercent(), "percentageOfSuccess", "100", 0, 1, BatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchProcess_NumberOfChains(), this.getPositiveIntNotNull(), "numberOfChains", "3", 0, 1, BatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBatchProcess_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, BatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBatchProcess_ContainsnameBatchProcess(), this.getnameBatchProcess(), null, "containsnameBatchProcess", null, 0, -1, BatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBatchProcess_ContainspercentageOfSuccessBatchProcess(), this.getpercentageOfSuccessBatchProcess(), null, "containspercentageOfSuccessBatchProcess", null, 0, -1, BatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBatchProcess_ContainsnumberOfChainsBatchProcess(), this.getnumberOfChainsBatchProcess(), null, "containsnumberOfChainsBatchProcess", null, 0, -1, BatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Type(), this.getOutputType(), "type", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_ProcessOutputFlow(), this.getProcessOutputFlow(), this.getProcessOutputFlow_Source(), "processOutputFlow", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutput_Description(), ecorePackage.getEString(), "description", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_ContainstypeOutput(), this.gettypeOutput(), null, "containstypeOutput", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_ContainsdescriptionOutput(), this.getdescriptionOutput(), null, "containsdescriptionOutput", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageOutputFlowEClass, StorageOutputFlow.class, "StorageOutputFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageOutputFlow_Source(), this.getStorage(), this.getStorage_StorageOutputFlow(), "source", null, 1, 1, StorageOutputFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorageOutputFlow_Destination(), this.getProcess(), this.getProcess_StorageOutputFlow(), "destination", null, 1, 1, StorageOutputFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processOutputFlowEClass, ProcessOutputFlow.class, "ProcessOutputFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessOutputFlow_Source(), this.getOutput(), this.getOutput_ProcessOutputFlow(), "source", null, 1, 1, ProcessOutputFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessOutputFlow_ProcessOutputFlowDelay(), this.getProbability(), null, "processOutputFlowDelay", null, 1, 1, ProcessOutputFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessOutputFlow_Destination(), this.getStorage(), this.getStorage_ProcessOutputFlow(), "destination", null, 1, 1, ProcessOutputFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, metamodel_bdsl.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_StorageOutputFlow(), this.getStorageOutputFlow(), this.getStorageOutputFlow_Destination(), "storageOutputFlow", null, 0, -1, metamodel_bdsl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Duration(), this.getProbability(), null, "duration", null, 1, 1, metamodel_bdsl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderOnStockThresholdEClass, OrderOnStockThreshold.class, "OrderOnStockThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderOnStockThreshold_Period(), this.getPositiveDouble(), "period", "0", 0, 1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderOnStockThreshold_Threshold(), this.getPositiveInt(), "threshold", "0", 0, 1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderOnStockThreshold_Name(), ecorePackage.getEString(), "name", null, 0, 1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderOnStockThreshold_OrderQuantity(), this.getPositiveInt(), "orderQuantity", "0", 0, 1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderOnStockThreshold_OrderType(), this.getOrderType(), "orderType", null, 0, 1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderOnStockThreshold_Supplier(), this.getSupplier(), this.getSupplier_RefillPolicy(), "supplier", null, 1, 1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderOnStockThreshold_Storage(), this.getStorage(), this.getStorage_OrderOnStockThreshold(), "storage", null, 1, 1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderOnStockThreshold_ContainsperiodOrderOnStockThreshold(), this.getperiodOrderOnStockThreshold(), null, "containsperiodOrderOnStockThreshold", null, 0, -1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderOnStockThreshold_ContainsthresholdOrderOnStockThreshold(), this.getthresholdOrderOnStockThreshold(), null, "containsthresholdOrderOnStockThreshold", null, 0, -1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderOnStockThreshold_ContainsnameOrderOnStockThreshold(), this.getnameOrderOnStockThreshold(), null, "containsnameOrderOnStockThreshold", null, 0, -1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderOnStockThreshold_ContainsorderQuantityOrderOnStockThreshold(), this.getorderQuantityOrderOnStockThreshold(), null, "containsorderQuantityOrderOnStockThreshold", null, 0, -1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderOnStockThreshold_ContainsorderTypeOrderOnStockThreshold(), this.getorderTypeOrderOnStockThreshold(), null, "containsorderTypeOrderOnStockThreshold", null, 0, -1, OrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_Quantity(), this.getProbability(), null, "quantity", null, 1, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilityEClass, Probability.class, "Probability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distributionEClass, Distribution.class, "Distribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalarEClass, Scalar.class, "Scalar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalar_Value(), this.getPositiveDouble(), "value", "1.0", 0, 1, Scalar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalar_ContainsvalueScalar(), this.getvalueScalar(), null, "containsvalueScalar", null, 0, -1, Scalar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gaussianEClass, Gaussian.class, "Gaussian", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGaussian_Location(), ecorePackage.getEDouble(), "location", "1", 0, 1, Gaussian.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGaussian_Scale(), this.getPositiveDoubleNotNull(), "scale", "1", 0, 1, Gaussian.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGaussian_ContainslocationGaussian(), this.getlocationGaussian(), null, "containslocationGaussian", null, 0, -1, Gaussian.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGaussian_ContainsscaleGaussian(), this.getscaleGaussian(), null, "containsscaleGaussian", null, 0, -1, Gaussian.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poissonEClass, Poisson.class, "Poisson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoisson_Interval(), this.getPositiveDoubleNotNull(), "interval", "1", 0, 1, Poisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoisson_ContainsintervalPoisson(), this.getintervalPoisson(), null, "containsintervalPoisson", null, 0, -1, Poisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniformEClass, Uniform.class, "Uniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniform_Minimum(), ecorePackage.getEDouble(), "minimum", "0.0", 0, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniform_Maximum(), ecorePackage.getEDouble(), "maximum", "0.0", 0, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniform_ContainsminimumUniform(), this.getminimumUniform(), null, "containsminimumUniform", null, 0, -1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniform_ContainsmaximumUniform(), this.getmaximumUniform(), null, "containsmaximumUniform", null, 0, -1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conveyorBeltEClass, ConveyorBelt.class, "ConveyorBelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConveyorBelt_MinimalSeparationBetweenBatches(), this.getPositiveDouble(), "minimalSeparationBetweenBatches", "1", 0, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBelt_Output(), this.getOutput(), null, "output", null, 0, 1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBelt_ContainsnameConveyorBelt(), this.getnameConveyorBelt(), null, "containsnameConveyorBelt", null, 0, -1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyorBelt_ContainsminimalSeparationBetweenBatchesConveyorBelt(), this.getminimalSeparationBetweenBatchesConveyorBelt(), null, "containsminimalSeparationBetweenBatchesConveyorBelt", null, 0, -1, ConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameQueryEClass, nameQuery.class, "nameQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameQuery_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueQueryEClass, valueQuery.class, "valueQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getvalueQuery_Value(), ecorePackage.getEString(), "value", null, 0, 1, valueQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorQueryEClass, errorQuery.class, "errorQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(geterrorQuery_Value(), ecorePackage.getEString(), "value", null, 0, 1, errorQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeQueryEClass, typeQuery.class, "typeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettypeQuery_Value(), this.getQueryType(), "value", null, 0, 1, typeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemQueryEClass, systemQuery.class, "systemQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsystemQuery_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, systemQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameStorageEClass, nameStorage.class, "nameStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameStorage_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeStorageEClass, sizeStorage.class, "sizeStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsizeStorage_Value(), this.getPositiveIntNotNull(), "value", null, 0, 1, sizeStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialContentStorageEClass, initialContentStorage.class, "initialContentStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getinitialContentStorage_Value(), this.getPositiveInt(), "value", null, 0, 1, initialContentStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overflowStorageEClass, overflowStorage.class, "overflowStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getoverflowStorage_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, overflowStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameSupplierEClass, nameSupplier.class, "nameSupplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameSupplier_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameSupplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveredPercentageSupplierEClass, deliveredPercentageSupplier.class, "deliveredPercentageSupplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdeliveredPercentageSupplier_Value(), this.getPercent(), "value", null, 0, 1, deliveredPercentageSupplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameBatchProcessEClass, nameBatchProcess.class, "nameBatchProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameBatchProcess_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameBatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(percentageOfSuccessBatchProcessEClass, percentageOfSuccessBatchProcess.class, "percentageOfSuccessBatchProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpercentageOfSuccessBatchProcess_Value(), this.getPercent(), "value", null, 0, 1, percentageOfSuccessBatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberOfChainsBatchProcessEClass, numberOfChainsBatchProcess.class, "numberOfChainsBatchProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnumberOfChainsBatchProcess_Value(), this.getPositiveIntNotNull(), "value", null, 0, 1, numberOfChainsBatchProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeOutputEClass, typeOutput.class, "typeOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettypeOutput_Value(), this.getOutputType(), "value", null, 0, 1, typeOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionOutputEClass, descriptionOutput.class, "descriptionOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdescriptionOutput_Value(), ecorePackage.getEString(), "value", null, 0, 1, descriptionOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodOrderOnStockThresholdEClass, periodOrderOnStockThreshold.class, "periodOrderOnStockThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getperiodOrderOnStockThreshold_Value(), this.getPositiveDouble(), "value", null, 0, 1, periodOrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thresholdOrderOnStockThresholdEClass, thresholdOrderOnStockThreshold.class, "thresholdOrderOnStockThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getthresholdOrderOnStockThreshold_Value(), this.getPositiveInt(), "value", null, 0, 1, thresholdOrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameOrderOnStockThresholdEClass, nameOrderOnStockThreshold.class, "nameOrderOnStockThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameOrderOnStockThreshold_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameOrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderQuantityOrderOnStockThresholdEClass, orderQuantityOrderOnStockThreshold.class, "orderQuantityOrderOnStockThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getorderQuantityOrderOnStockThreshold_Value(), this.getPositiveInt(), "value", null, 0, 1, orderQuantityOrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTypeOrderOnStockThresholdEClass, orderTypeOrderOnStockThreshold.class, "orderTypeOrderOnStockThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getorderTypeOrderOnStockThreshold_Value(), this.getOrderType(), "value", null, 0, 1, orderTypeOrderOnStockThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueScalarEClass, valueScalar.class, "valueScalar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getvalueScalar_Value(), this.getPositiveDouble(), "value", null, 0, 1, valueScalar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationGaussianEClass, locationGaussian.class, "locationGaussian", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getlocationGaussian_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, locationGaussian.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleGaussianEClass, scaleGaussian.class, "scaleGaussian", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getscaleGaussian_Value(), this.getPositiveDoubleNotNull(), "value", null, 0, 1, scaleGaussian.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalPoissonEClass, intervalPoisson.class, "intervalPoisson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getintervalPoisson_Value(), this.getPositiveDoubleNotNull(), "value", null, 0, 1, intervalPoisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimumUniformEClass, minimumUniform.class, "minimumUniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getminimumUniform_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, minimumUniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximumUniformEClass, maximumUniform.class, "maximumUniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmaximumUniform_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, maximumUniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameConveyorBeltEClass, nameConveyorBelt.class, "nameConveyorBelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameConveyorBelt_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimalSeparationBetweenBatchesConveyorBeltEClass, minimalSeparationBetweenBatchesConveyorBelt.class, "minimalSeparationBetweenBatchesConveyorBelt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getminimalSeparationBetweenBatchesConveyorBelt_Value(), this.getPositiveDouble(), "value", null, 0, 1, minimalSeparationBetweenBatchesConveyorBelt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noneElementEClass, NoneElement.class, "NoneElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingElementEClass, BindingElement.class, "BindingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingElement_NoneElement(), this.getNoneElement(), null, "noneElement", null, 0, -1, BindingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateElementEClass, IntermediateElement.class, "IntermediateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermediateElement_BindingElement(), this.getBindingElement(), null, "bindingElement", null, 0, 1, IntermediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateElement_MetamodelElement(), this.getMetamodelElement(), null, "metamodelElement", null, 0, -1, IntermediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelElementEClass, MetamodelElement.class, "MetamodelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetamodelElement_VirtualAttribute(), this.getVirtualAttribute(), null, "virtualAttribute", null, 0, -1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelElement_MetamodelElementFeature(), this.getMetamodelElementFeature(), null, "metamodelElementFeature", null, 0, -1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelElementFeatureEClass, MetamodelElementFeature.class, "MetamodelElementFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetamodelElementFeature_FeatureClass(), this.getBindingAttribute(), null, "featureClass", null, 0, -1, MetamodelElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelElementFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingAttributeEClass, BindingAttribute.class, "BindingAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualAttributeEClass, VirtualAttribute.class, "VirtualAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualAttribute_To_virtualAttribute(), this.getBindingAttribute(), null, "to_virtualAttribute", null, 0, 1, VirtualAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualAttribute_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, VirtualAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderTypeEEnum, OrderType.class, "OrderType");
		addEEnumLiteral(orderTypeEEnum, OrderType.FIXED);
		addEEnumLiteral(orderTypeEEnum, OrderType.REFILL);

		initEEnum(outputTypeEEnum, OutputType.class, "OutputType");
		addEEnumLiteral(outputTypeEEnum, OutputType.SUCCESS);
		addEEnumLiteral(outputTypeEEnum, OutputType.FAILURE);
		addEEnumLiteral(outputTypeEEnum, OutputType.LOWER_QUALITY);
		addEEnumLiteral(outputTypeEEnum, OutputType.TRASH);

		initEEnum(queryTypeEEnum, QueryType.class, "QueryType");
		addEEnumLiteral(queryTypeEEnum, QueryType.DELAY);
		addEEnumLiteral(queryTypeEEnum, QueryType.QUANTITY);
		addEEnumLiteral(queryTypeEEnum, QueryType.QUALITY);
		addEEnumLiteral(queryTypeEEnum, QueryType.UNDEFINED);

		// Initialize data types
		initEDataType(percentEDataType, Double.class, "Percent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntEDataType, Integer.class, "PositiveInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveDoubleEDataType, Double.class, "PositiveDouble", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntNotNullEDataType, Integer.class, "PositiveIntNotNull", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveDoubleNotNullEDataType, Double.class, "PositiveDoubleNotNull", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (percentEDataType,
		   source,
		   new String[] {
			   "baseType", "http://www.eclipse.org/emf/2002/Ecore#EDouble",
			   "minInclusive", "0",
			   "maxInclusive", "100"
		   });
		addAnnotation
		  (positiveIntEDataType,
		   source,
		   new String[] {
			   "baseType", "http://www.eclipse.org/emf/2002/Ecore#EInt",
			   "minInclusive", "0",
			   "name", "PositiveInt"
		   });
		addAnnotation
		  (positiveDoubleEDataType,
		   source,
		   new String[] {
			   "minInclusive", "0",
			   "baseType", "http://www.eclipse.org/emf/2002/Ecore#EDouble"
		   });
		addAnnotation
		  (positiveIntNotNullEDataType,
		   source,
		   new String[] {
			   "baseType", "http://www.eclipse.org/emf/2002/Ecore#EInt",
			   "minInclusive", "1"
		   });
		addAnnotation
		  (positiveDoubleNotNullEDataType,
		   source,
		   new String[] {
			   "name", "PositiveDoubleNotNull",
			   "minExclusive", "0",
			   "baseType", "http://www.eclipse.org/emf/2002/Ecore#EDouble"
		   });
	}

} //Metamodel_bdslPackageImpl

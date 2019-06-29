/**
 */
package metamodel.util;

import metamodel.BatchProcess;
import metamodel.Component;
import metamodel.ConveyorBelt;
import metamodel.Distribution;
import metamodel.Flow;
import metamodel.Gaussian;
import metamodel.MetamodelPackage;
import metamodel.Model;
import metamodel.OrderOnStockThreshold;
import metamodel.Output;
import metamodel.Poisson;
import metamodel.Probability;
import metamodel.ProcessOutputFlow;
import metamodel.Query;
import metamodel.Scalar;
import metamodel.Storage;
import metamodel.StorageOutputFlow;
import metamodel.Supplier;
import metamodel.Uniform;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
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
	protected MetamodelSwitch<Adapter> modelSwitch =
		new MetamodelSwitch<Adapter>() {
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
			public Adapter caseProcess(metamodel.Process object) {
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
	 * Creates a new adapter for an object of class '{@link metamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Supplier
	 * @generated
	 */
	public Adapter createSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.BatchProcess <em>Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.BatchProcess
	 * @generated
	 */
	public Adapter createBatchProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.StorageOutputFlow <em>Storage Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.StorageOutputFlow
	 * @generated
	 */
	public Adapter createStorageOutputFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.ProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.ProcessOutputFlow
	 * @generated
	 */
	public Adapter createProcessOutputFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.OrderOnStockThreshold <em>Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.OrderOnStockThreshold
	 * @generated
	 */
	public Adapter createOrderOnStockThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Probability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Probability
	 * @generated
	 */
	public Adapter createProbabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Distribution
	 * @generated
	 */
	public Adapter createDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Scalar <em>Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Scalar
	 * @generated
	 */
	public Adapter createScalarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Gaussian <em>Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Gaussian
	 * @generated
	 */
	public Adapter createGaussianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Poisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Poisson
	 * @generated
	 */
	public Adapter createPoissonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.Uniform
	 * @generated
	 */
	public Adapter createUniformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.ConveyorBelt
	 * @generated
	 */
	public Adapter createConveyorBeltAdapter() {
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

} //MetamodelAdapterFactory

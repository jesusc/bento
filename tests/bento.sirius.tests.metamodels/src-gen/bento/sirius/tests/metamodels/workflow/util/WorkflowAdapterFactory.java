/**
 */
package bento.sirius.tests.metamodels.workflow.util;

import bento.sirius.tests.metamodels.workflow.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bento.sirius.tests.metamodels.workflow.WorkflowPackage
 * @generated
 */
public class WorkflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
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
	protected WorkflowSwitch<Adapter> modelSwitch =
		new WorkflowSwitch<Adapter>() {
			@Override
			public Adapter caseFlowDiagram(FlowDiagram object) {
				return createFlowDiagramAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseFinalTask(FinalTask object) {
				return createFinalTaskAdapter();
			}
			@Override
			public Adapter caseParallelSplit(ParallelSplit object) {
				return createParallelSplitAdapter();
			}
			@Override
			public Adapter caseSynchronization(Synchronization object) {
				return createSynchronizationAdapter();
			}
			@Override
			public Adapter caseExclusiveChoice(ExclusiveChoice object) {
				return createExclusiveChoiceAdapter();
			}
			@Override
			public Adapter caseSimpleMerge(SimpleMerge object) {
				return createSimpleMergeAdapter();
			}
			@Override
			public Adapter caseMultiChoice(MultiChoice object) {
				return createMultiChoiceAdapter();
			}
			@Override
			public Adapter caseFlowEdge(FlowEdge object) {
				return createFlowEdgeAdapter();
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
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.FlowDiagram <em>Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.FlowDiagram
	 * @generated
	 */
	public Adapter createFlowDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.FinalTask <em>Final Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.FinalTask
	 * @generated
	 */
	public Adapter createFinalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.ParallelSplit <em>Parallel Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.ParallelSplit
	 * @generated
	 */
	public Adapter createParallelSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.Synchronization
	 * @generated
	 */
	public Adapter createSynchronizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.ExclusiveChoice <em>Exclusive Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.ExclusiveChoice
	 * @generated
	 */
	public Adapter createExclusiveChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.SimpleMerge <em>Simple Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.SimpleMerge
	 * @generated
	 */
	public Adapter createSimpleMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.MultiChoice
	 * @generated
	 */
	public Adapter createMultiChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bento.sirius.tests.metamodels.workflow.FlowEdge <em>Flow Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bento.sirius.tests.metamodels.workflow.FlowEdge
	 * @generated
	 */
	public Adapter createFlowEdgeAdapter() {
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

} //WorkflowAdapterFactory

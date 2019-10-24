/**
 */
package workflow_bdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workflow_bdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Workflow_bdslFactoryImpl extends EFactoryImpl implements Workflow_bdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Workflow_bdslFactory init() {
		try {
			Workflow_bdslFactory theWorkflow_bdslFactory = (Workflow_bdslFactory)EPackage.Registry.INSTANCE.getEFactory(Workflow_bdslPackage.eNS_URI);
			if (theWorkflow_bdslFactory != null) {
				return theWorkflow_bdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Workflow_bdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow_bdslFactoryImpl() {
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
			case Workflow_bdslPackage.FLOW_DIAGRAM: return createFlowDiagram();
			case Workflow_bdslPackage.TASK: return createTask();
			case Workflow_bdslPackage.FINAL_TASK: return createFinalTask();
			case Workflow_bdslPackage.PARALLEL_SPLIT: return createParallelSplit();
			case Workflow_bdslPackage.SYNCHRONIZATION: return createSynchronization();
			case Workflow_bdslPackage.EXCLUSIVE_CHOICE: return createExclusiveChoice();
			case Workflow_bdslPackage.SIMPLE_MERGE: return createSimpleMerge();
			case Workflow_bdslPackage.MULTI_CHOICE: return createMultiChoice();
			case Workflow_bdslPackage.FLOW_EDGE: return createFlowEdge();
			case Workflow_bdslPackage.NAME_TASK: return createnameTask();
			case Workflow_bdslPackage.IS_INITIAL_TASK: return createisInitialTask();
			case Workflow_bdslPackage.IS_TERMINATING_FINAL_TASK: return createisTerminatingFinalTask();
			case Workflow_bdslPackage.IS_MANDATORY_FINAL_TASK: return createisMandatoryFinalTask();
			case Workflow_bdslPackage.NONE_ELEMENT: return createNoneElement();
			case Workflow_bdslPackage.INTERMEDIATE_ELEMENT: return createIntermediateElement();
			case Workflow_bdslPackage.METAMODEL_ELEMENT: return createMetamodelElement();
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE: return createMetamodelElementFeature();
			case Workflow_bdslPackage.VIRTUAL_ATTRIBUTE: return createVirtualAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowDiagram createFlowDiagram() {
		FlowDiagramImpl flowDiagram = new FlowDiagramImpl();
		return flowDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalTask createFinalTask() {
		FinalTaskImpl finalTask = new FinalTaskImpl();
		return finalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelSplit createParallelSplit() {
		ParallelSplitImpl parallelSplit = new ParallelSplitImpl();
		return parallelSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveChoice createExclusiveChoice() {
		ExclusiveChoiceImpl exclusiveChoice = new ExclusiveChoiceImpl();
		return exclusiveChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMerge createSimpleMerge() {
		SimpleMergeImpl simpleMerge = new SimpleMergeImpl();
		return simpleMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiChoice createMultiChoice() {
		MultiChoiceImpl multiChoice = new MultiChoiceImpl();
		return multiChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowEdge createFlowEdge() {
		FlowEdgeImpl flowEdge = new FlowEdgeImpl();
		return flowEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameTask createnameTask() {
		nameTaskImpl nameTask = new nameTaskImpl();
		return nameTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isInitialTask createisInitialTask() {
		isInitialTaskImpl isInitialTask = new isInitialTaskImpl();
		return isInitialTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isTerminatingFinalTask createisTerminatingFinalTask() {
		isTerminatingFinalTaskImpl isTerminatingFinalTask = new isTerminatingFinalTaskImpl();
		return isTerminatingFinalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isMandatoryFinalTask createisMandatoryFinalTask() {
		isMandatoryFinalTaskImpl isMandatoryFinalTask = new isMandatoryFinalTaskImpl();
		return isMandatoryFinalTask;
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
	public Workflow_bdslPackage getWorkflow_bdslPackage() {
		return (Workflow_bdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Workflow_bdslPackage getPackage() {
		return Workflow_bdslPackage.eINSTANCE;
	}

} //Workflow_bdslFactoryImpl

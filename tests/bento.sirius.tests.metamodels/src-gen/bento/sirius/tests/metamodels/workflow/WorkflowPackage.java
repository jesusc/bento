/**
 */
package bento.sirius.tests.metamodels.workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bento.sirius.tests.metamodels.workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/flow_concept";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flow_concept";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.FlowDiagramImpl <em>Flow Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.FlowDiagramImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getFlowDiagram()
	 * @generated
	 */
	int FLOW_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DIAGRAM__NODES = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DIAGRAM__EDGES = 1;

	/**
	 * The feature id for the '<em><b>Is Final Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DIAGRAM__IS_FINAL_MANDATORY = 2;

	/**
	 * The number of structural features of the '<em>Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.NodeImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTS = 0;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INS = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.TaskImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTS = NODE__OUTS;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INS = NODE__INS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_INITIAL = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.FinalTaskImpl <em>Final Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.FinalTaskImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getFinalTask()
	 * @generated
	 */
	int FINAL_TASK = 3;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK__OUTS = NODE__OUTS;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK__INS = NODE__INS;

	/**
	 * The feature id for the '<em><b>Is Terminating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK__IS_TERMINATING = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK__IS_MANDATORY = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Final Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_TASK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.ParallelSplitImpl <em>Parallel Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.ParallelSplitImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getParallelSplit()
	 * @generated
	 */
	int PARALLEL_SPLIT = 4;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__OUTS = NODE__OUTS;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__INS = NODE__INS;

	/**
	 * The number of structural features of the '<em>Parallel Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.SynchronizationImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 5;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__OUTS = NODE__OUTS;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__INS = NODE__INS;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.ExclusiveChoiceImpl <em>Exclusive Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.ExclusiveChoiceImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getExclusiveChoice()
	 * @generated
	 */
	int EXCLUSIVE_CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE__OUTS = NODE__OUTS;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE__INS = NODE__INS;

	/**
	 * The number of structural features of the '<em>Exclusive Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusive Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_CHOICE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.SimpleMergeImpl <em>Simple Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.SimpleMergeImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getSimpleMerge()
	 * @generated
	 */
	int SIMPLE_MERGE = 7;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE__OUTS = NODE__OUTS;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE__INS = NODE__INS;

	/**
	 * The number of structural features of the '<em>Simple Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.MultiChoiceImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getMultiChoice()
	 * @generated
	 */
	int MULTI_CHOICE = 8;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__OUTS = NODE__OUTS;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__INS = NODE__INS;

	/**
	 * The number of structural features of the '<em>Multi Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.workflow.impl.FlowEdgeImpl <em>Flow Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.workflow.impl.FlowEdgeImpl
	 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getFlowEdge()
	 * @generated
	 */
	int FLOW_EDGE = 9;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__IN = 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE__OUT = 1;

	/**
	 * The number of structural features of the '<em>Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_EDGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.FlowDiagram <em>Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Diagram</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FlowDiagram
	 * @generated
	 */
	EClass getFlowDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.metamodels.workflow.FlowDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FlowDiagram#getNodes()
	 * @see #getFlowDiagram()
	 * @generated
	 */
	EReference getFlowDiagram_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.metamodels.workflow.FlowDiagram#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FlowDiagram#getEdges()
	 * @see #getFlowDiagram()
	 * @generated
	 */
	EReference getFlowDiagram_Edges();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.workflow.FlowDiagram#isIsFinalMandatory <em>Is Final Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final Mandatory</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FlowDiagram#isIsFinalMandatory()
	 * @see #getFlowDiagram()
	 * @generated
	 */
	EAttribute getFlowDiagram_IsFinalMandatory();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link bento.sirius.tests.metamodels.workflow.Node#getOuts <em>Outs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outs</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.Node#getOuts()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outs();

	/**
	 * Returns the meta object for the reference list '{@link bento.sirius.tests.metamodels.workflow.Node#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ins</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.Node#getIns()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Ins();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.workflow.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.workflow.Task#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.Task#isIsInitial()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsInitial();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.FinalTask <em>Final Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Task</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FinalTask
	 * @generated
	 */
	EClass getFinalTask();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.workflow.FinalTask#isIsTerminating <em>Is Terminating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Terminating</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FinalTask#isIsTerminating()
	 * @see #getFinalTask()
	 * @generated
	 */
	EAttribute getFinalTask_IsTerminating();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.workflow.FinalTask#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FinalTask#isIsMandatory()
	 * @see #getFinalTask()
	 * @generated
	 */
	EAttribute getFinalTask_IsMandatory();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.ParallelSplit <em>Parallel Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Split</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.ParallelSplit
	 * @generated
	 */
	EClass getParallelSplit();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.ExclusiveChoice <em>Exclusive Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Choice</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.ExclusiveChoice
	 * @generated
	 */
	EClass getExclusiveChoice();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.SimpleMerge <em>Simple Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Merge</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.SimpleMerge
	 * @generated
	 */
	EClass getSimpleMerge();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.MultiChoice
	 * @generated
	 */
	EClass getMultiChoice();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.workflow.FlowEdge <em>Flow Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Edge</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FlowEdge
	 * @generated
	 */
	EClass getFlowEdge();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.metamodels.workflow.FlowEdge#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FlowEdge#getIn()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_In();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.metamodels.workflow.FlowEdge#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see bento.sirius.tests.metamodels.workflow.FlowEdge#getOut()
	 * @see #getFlowEdge()
	 * @generated
	 */
	EReference getFlowEdge_Out();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.FlowDiagramImpl <em>Flow Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.FlowDiagramImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getFlowDiagram()
		 * @generated
		 */
		EClass FLOW_DIAGRAM = eINSTANCE.getFlowDiagram();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_DIAGRAM__NODES = eINSTANCE.getFlowDiagram_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_DIAGRAM__EDGES = eINSTANCE.getFlowDiagram_Edges();

		/**
		 * The meta object literal for the '<em><b>Is Final Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_DIAGRAM__IS_FINAL_MANDATORY = eINSTANCE.getFlowDiagram_IsFinalMandatory();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.NodeImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Outs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTS = eINSTANCE.getNode_Outs();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INS = eINSTANCE.getNode_Ins();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.TaskImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_INITIAL = eINSTANCE.getTask_IsInitial();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.FinalTaskImpl <em>Final Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.FinalTaskImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getFinalTask()
		 * @generated
		 */
		EClass FINAL_TASK = eINSTANCE.getFinalTask();

		/**
		 * The meta object literal for the '<em><b>Is Terminating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL_TASK__IS_TERMINATING = eINSTANCE.getFinalTask_IsTerminating();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL_TASK__IS_MANDATORY = eINSTANCE.getFinalTask_IsMandatory();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.ParallelSplitImpl <em>Parallel Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.ParallelSplitImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getParallelSplit()
		 * @generated
		 */
		EClass PARALLEL_SPLIT = eINSTANCE.getParallelSplit();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.SynchronizationImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.ExclusiveChoiceImpl <em>Exclusive Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.ExclusiveChoiceImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getExclusiveChoice()
		 * @generated
		 */
		EClass EXCLUSIVE_CHOICE = eINSTANCE.getExclusiveChoice();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.SimpleMergeImpl <em>Simple Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.SimpleMergeImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getSimpleMerge()
		 * @generated
		 */
		EClass SIMPLE_MERGE = eINSTANCE.getSimpleMerge();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.MultiChoiceImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getMultiChoice()
		 * @generated
		 */
		EClass MULTI_CHOICE = eINSTANCE.getMultiChoice();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.workflow.impl.FlowEdgeImpl <em>Flow Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.workflow.impl.FlowEdgeImpl
		 * @see bento.sirius.tests.metamodels.workflow.impl.WorkflowPackageImpl#getFlowEdge()
		 * @generated
		 */
		EClass FLOW_EDGE = eINSTANCE.getFlowEdge();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__IN = eINSTANCE.getFlowEdge_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_EDGE__OUT = eINSTANCE.getFlowEdge_Out();

	}

} //WorkflowPackage

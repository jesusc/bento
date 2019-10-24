/**
 */
package workflow_bdsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import workflow_bdsl.BindingAttribute;
import workflow_bdsl.BindingElement;
import workflow_bdsl.ExclusiveChoice;
import workflow_bdsl.FinalTask;
import workflow_bdsl.FlowDiagram;
import workflow_bdsl.FlowEdge;
import workflow_bdsl.IntermediateElement;
import workflow_bdsl.MetamodelElement;
import workflow_bdsl.MetamodelElementFeature;
import workflow_bdsl.MultiChoice;
import workflow_bdsl.Node;
import workflow_bdsl.NoneElement;
import workflow_bdsl.ParallelSplit;
import workflow_bdsl.SimpleMerge;
import workflow_bdsl.Synchronization;
import workflow_bdsl.Task;
import workflow_bdsl.VirtualAttribute;
import workflow_bdsl.Workflow_bdslFactory;
import workflow_bdsl.Workflow_bdslPackage;
import workflow_bdsl.isInitialTask;
import workflow_bdsl.isMandatoryFinalTask;
import workflow_bdsl.isTerminatingFinalTask;
import workflow_bdsl.nameTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Workflow_bdslPackageImpl extends EPackageImpl implements Workflow_bdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isInitialTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTerminatingFinalTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isMandatoryFinalTaskEClass = null;

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
	 * @see workflow_bdsl.Workflow_bdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Workflow_bdslPackageImpl() {
		super(eNS_URI, Workflow_bdslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Workflow_bdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Workflow_bdslPackage init() {
		if (isInited) return (Workflow_bdslPackage)EPackage.Registry.INSTANCE.getEPackage(Workflow_bdslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWorkflow_bdslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Workflow_bdslPackageImpl theWorkflow_bdslPackage = registeredWorkflow_bdslPackage instanceof Workflow_bdslPackageImpl ? (Workflow_bdslPackageImpl)registeredWorkflow_bdslPackage : new Workflow_bdslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWorkflow_bdslPackage.createPackageContents();

		// Initialize created meta-data
		theWorkflow_bdslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkflow_bdslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Workflow_bdslPackage.eNS_URI, theWorkflow_bdslPackage);
		return theWorkflow_bdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowDiagram() {
		return flowDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_Nodes() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_Edges() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowDiagram_IsFinalMandatory() {
		return (EAttribute)flowDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_ContainsNoneElement() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_ContainsBindingElement() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_ContainsIntermediateElement() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_ContainsMetamodelElement() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_ContainsMetamodelElementFeature() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_ContainsBindingAttribute() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowDiagram_ContainsVirtualAttribute() {
		return (EReference)flowDiagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Outs() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Ins() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_IsInitial() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ContainsnameTask() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ContainsisInitialTask() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalTask() {
		return finalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinalTask_IsTerminating() {
		return (EAttribute)finalTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinalTask_IsMandatory() {
		return (EAttribute)finalTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalTask_ContainsisTerminatingFinalTask() {
		return (EReference)finalTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalTask_ContainsisMandatoryFinalTask() {
		return (EReference)finalTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelSplit() {
		return parallelSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveChoice() {
		return exclusiveChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMerge() {
		return simpleMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiChoice() {
		return multiChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowEdge() {
		return flowEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_In() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowEdge_Out() {
		return (EReference)flowEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameTask() {
		return nameTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameTask_Value() {
		return (EAttribute)nameTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getisInitialTask() {
		return isInitialTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getisInitialTask_Value() {
		return (EAttribute)isInitialTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getisTerminatingFinalTask() {
		return isTerminatingFinalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getisTerminatingFinalTask_Value() {
		return (EAttribute)isTerminatingFinalTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getisMandatoryFinalTask() {
		return isMandatoryFinalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getisMandatoryFinalTask_Value() {
		return (EAttribute)isMandatoryFinalTaskEClass.getEStructuralFeatures().get(0);
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
	public Workflow_bdslFactory getWorkflow_bdslFactory() {
		return (Workflow_bdslFactory)getEFactoryInstance();
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
		flowDiagramEClass = createEClass(FLOW_DIAGRAM);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__NODES);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__EDGES);
		createEAttribute(flowDiagramEClass, FLOW_DIAGRAM__IS_FINAL_MANDATORY);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__CONTAINS_NONE_ELEMENT);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__CONTAINS_BINDING_ELEMENT);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__CONTAINS_INTERMEDIATE_ELEMENT);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__CONTAINS_BINDING_ATTRIBUTE);
		createEReference(flowDiagramEClass, FLOW_DIAGRAM__CONTAINS_VIRTUAL_ATTRIBUTE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUTS);
		createEReference(nodeEClass, NODE__INS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__IS_INITIAL);
		createEReference(taskEClass, TASK__CONTAINSNAME_TASK);
		createEReference(taskEClass, TASK__CONTAINSIS_INITIAL_TASK);

		finalTaskEClass = createEClass(FINAL_TASK);
		createEAttribute(finalTaskEClass, FINAL_TASK__IS_TERMINATING);
		createEAttribute(finalTaskEClass, FINAL_TASK__IS_MANDATORY);
		createEReference(finalTaskEClass, FINAL_TASK__CONTAINSIS_TERMINATING_FINAL_TASK);
		createEReference(finalTaskEClass, FINAL_TASK__CONTAINSIS_MANDATORY_FINAL_TASK);

		parallelSplitEClass = createEClass(PARALLEL_SPLIT);

		synchronizationEClass = createEClass(SYNCHRONIZATION);

		exclusiveChoiceEClass = createEClass(EXCLUSIVE_CHOICE);

		simpleMergeEClass = createEClass(SIMPLE_MERGE);

		multiChoiceEClass = createEClass(MULTI_CHOICE);

		flowEdgeEClass = createEClass(FLOW_EDGE);
		createEReference(flowEdgeEClass, FLOW_EDGE__IN);
		createEReference(flowEdgeEClass, FLOW_EDGE__OUT);

		nameTaskEClass = createEClass(NAME_TASK);
		createEAttribute(nameTaskEClass, NAME_TASK__VALUE);

		isInitialTaskEClass = createEClass(IS_INITIAL_TASK);
		createEAttribute(isInitialTaskEClass, IS_INITIAL_TASK__VALUE);

		isTerminatingFinalTaskEClass = createEClass(IS_TERMINATING_FINAL_TASK);
		createEAttribute(isTerminatingFinalTaskEClass, IS_TERMINATING_FINAL_TASK__VALUE);

		isMandatoryFinalTaskEClass = createEClass(IS_MANDATORY_FINAL_TASK);
		createEAttribute(isMandatoryFinalTaskEClass, IS_MANDATORY_FINAL_TASK__VALUE);

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
		taskEClass.getESuperTypes().add(this.getNode());
		taskEClass.getESuperTypes().add(this.getBindingElement());
		finalTaskEClass.getESuperTypes().add(this.getNode());
		finalTaskEClass.getESuperTypes().add(this.getBindingElement());
		parallelSplitEClass.getESuperTypes().add(this.getNode());
		parallelSplitEClass.getESuperTypes().add(this.getBindingElement());
		synchronizationEClass.getESuperTypes().add(this.getNode());
		synchronizationEClass.getESuperTypes().add(this.getBindingElement());
		exclusiveChoiceEClass.getESuperTypes().add(this.getNode());
		exclusiveChoiceEClass.getESuperTypes().add(this.getBindingElement());
		simpleMergeEClass.getESuperTypes().add(this.getNode());
		simpleMergeEClass.getESuperTypes().add(this.getBindingElement());
		multiChoiceEClass.getESuperTypes().add(this.getNode());
		multiChoiceEClass.getESuperTypes().add(this.getBindingElement());
		flowEdgeEClass.getESuperTypes().add(this.getBindingElement());
		nameTaskEClass.getESuperTypes().add(this.getBindingAttribute());
		isInitialTaskEClass.getESuperTypes().add(this.getBindingAttribute());
		isTerminatingFinalTaskEClass.getESuperTypes().add(this.getBindingAttribute());
		isMandatoryFinalTaskEClass.getESuperTypes().add(this.getBindingAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(flowDiagramEClass, FlowDiagram.class, "FlowDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowDiagram_Nodes(), this.getNode(), null, "nodes", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowDiagram_Edges(), this.getFlowEdge(), null, "edges", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowDiagram_IsFinalMandatory(), ecorePackage.getEBoolean(), "isFinalMandatory", null, 1, 1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowDiagram_ContainsNoneElement(), this.getNoneElement(), null, "containsNoneElement", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowDiagram_ContainsBindingElement(), this.getBindingElement(), null, "containsBindingElement", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowDiagram_ContainsIntermediateElement(), this.getIntermediateElement(), null, "containsIntermediateElement", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowDiagram_ContainsMetamodelElement(), this.getMetamodelElement(), null, "containsMetamodelElement", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowDiagram_ContainsMetamodelElementFeature(), this.getMetamodelElementFeature(), null, "containsMetamodelElementFeature", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowDiagram_ContainsBindingAttribute(), this.getBindingAttribute(), null, "containsBindingAttribute", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowDiagram_ContainsVirtualAttribute(), this.getVirtualAttribute(), null, "containsVirtualAttribute", null, 0, -1, FlowDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Outs(), this.getFlowEdge(), this.getFlowEdge_In(), "outs", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Ins(), this.getFlowEdge(), this.getFlowEdge_Out(), "ins", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ContainsnameTask(), this.getnameTask(), null, "containsnameTask", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ContainsisInitialTask(), this.getisInitialTask(), null, "containsisInitialTask", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalTaskEClass, FinalTask.class, "FinalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinalTask_IsTerminating(), ecorePackage.getEBoolean(), "isTerminating", null, 1, 1, FinalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinalTask_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 1, 1, FinalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinalTask_ContainsisTerminatingFinalTask(), this.getisTerminatingFinalTask(), null, "containsisTerminatingFinalTask", null, 0, -1, FinalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinalTask_ContainsisMandatoryFinalTask(), this.getisMandatoryFinalTask(), null, "containsisMandatoryFinalTask", null, 0, -1, FinalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelSplitEClass, ParallelSplit.class, "ParallelSplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveChoiceEClass, ExclusiveChoice.class, "ExclusiveChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleMergeEClass, SimpleMerge.class, "SimpleMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiChoiceEClass, MultiChoice.class, "MultiChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEdgeEClass, FlowEdge.class, "FlowEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowEdge_In(), this.getNode(), this.getNode_Outs(), "in", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowEdge_Out(), this.getNode(), this.getNode_Ins(), "out", null, 0, 1, FlowEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameTaskEClass, nameTask.class, "nameTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameTask_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isInitialTaskEClass, isInitialTask.class, "isInitialTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getisInitialTask_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, isInitialTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isTerminatingFinalTaskEClass, isTerminatingFinalTask.class, "isTerminatingFinalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getisTerminatingFinalTask_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, isTerminatingFinalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isMandatoryFinalTaskEClass, isMandatoryFinalTask.class, "isMandatoryFinalTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getisMandatoryFinalTask_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, isMandatoryFinalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// cardinality
		createCardinalityAnnotations();
	}

	/**
	 * Initializes the annotations for <b>cardinality</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCardinalityAnnotations() {
		String source = "cardinality";
		addAnnotation
		  (taskEClass,
		   source,
		   new String[] {
			   "min", "0",
			   "max", "*"
		   });
		addAnnotation
		  (finalTaskEClass,
		   source,
		   new String[] {
			   "min", "0",
			   "max", "*"
		   });
		addAnnotation
		  (parallelSplitEClass,
		   source,
		   new String[] {
			   "min", "0",
			   "max", "1"
		   });
		addAnnotation
		  (synchronizationEClass,
		   source,
		   new String[] {
			   "min", "0",
			   "max", "1"
		   });
		addAnnotation
		  (exclusiveChoiceEClass,
		   source,
		   new String[] {
			   "min", "0",
			   "max", "1"
		   });
		addAnnotation
		  (simpleMergeEClass,
		   source,
		   new String[] {
			   "min", "0",
			   "max", "1"
		   });
		addAnnotation
		  (multiChoiceEClass,
		   source,
		   new String[] {
			   "min", "0",
			   "max", "1"
		   });
	}

} //Workflow_bdslPackageImpl

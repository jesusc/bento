/**
 */
package workflow_bdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see workflow_bdsl.Workflow_bdslPackage
 * @generated
 */
public interface Workflow_bdslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Workflow_bdslFactory eINSTANCE = workflow_bdsl.impl.Workflow_bdslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flow Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Diagram</em>'.
	 * @generated
	 */
	FlowDiagram createFlowDiagram();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Final Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Task</em>'.
	 * @generated
	 */
	FinalTask createFinalTask();

	/**
	 * Returns a new object of class '<em>Parallel Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Split</em>'.
	 * @generated
	 */
	ParallelSplit createParallelSplit();

	/**
	 * Returns a new object of class '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization</em>'.
	 * @generated
	 */
	Synchronization createSynchronization();

	/**
	 * Returns a new object of class '<em>Exclusive Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Choice</em>'.
	 * @generated
	 */
	ExclusiveChoice createExclusiveChoice();

	/**
	 * Returns a new object of class '<em>Simple Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Merge</em>'.
	 * @generated
	 */
	SimpleMerge createSimpleMerge();

	/**
	 * Returns a new object of class '<em>Multi Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Choice</em>'.
	 * @generated
	 */
	MultiChoice createMultiChoice();

	/**
	 * Returns a new object of class '<em>Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Edge</em>'.
	 * @generated
	 */
	FlowEdge createFlowEdge();

	/**
	 * Returns a new object of class '<em>name Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Task</em>'.
	 * @generated
	 */
	nameTask createnameTask();

	/**
	 * Returns a new object of class '<em>is Initial Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>is Initial Task</em>'.
	 * @generated
	 */
	isInitialTask createisInitialTask();

	/**
	 * Returns a new object of class '<em>is Terminating Final Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>is Terminating Final Task</em>'.
	 * @generated
	 */
	isTerminatingFinalTask createisTerminatingFinalTask();

	/**
	 * Returns a new object of class '<em>is Mandatory Final Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>is Mandatory Final Task</em>'.
	 * @generated
	 */
	isMandatoryFinalTask createisMandatoryFinalTask();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Workflow_bdslPackage getWorkflow_bdslPackage();

} //Workflow_bdslFactory

/**
 */
package workflow_bdsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import workflow_bdsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see workflow_bdsl.Workflow_bdslPackage
 * @generated
 */
public class Workflow_bdslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Workflow_bdslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow_bdslSwitch() {
		if (modelPackage == null) {
			modelPackage = Workflow_bdslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Workflow_bdslPackage.FLOW_DIAGRAM: {
				FlowDiagram flowDiagram = (FlowDiagram)theEObject;
				T result = caseFlowDiagram(flowDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseNode(task);
				if (result == null) result = caseBindingElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.FINAL_TASK: {
				FinalTask finalTask = (FinalTask)theEObject;
				T result = caseFinalTask(finalTask);
				if (result == null) result = caseNode(finalTask);
				if (result == null) result = caseBindingElement(finalTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.PARALLEL_SPLIT: {
				ParallelSplit parallelSplit = (ParallelSplit)theEObject;
				T result = caseParallelSplit(parallelSplit);
				if (result == null) result = caseNode(parallelSplit);
				if (result == null) result = caseBindingElement(parallelSplit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.SYNCHRONIZATION: {
				Synchronization synchronization = (Synchronization)theEObject;
				T result = caseSynchronization(synchronization);
				if (result == null) result = caseNode(synchronization);
				if (result == null) result = caseBindingElement(synchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.EXCLUSIVE_CHOICE: {
				ExclusiveChoice exclusiveChoice = (ExclusiveChoice)theEObject;
				T result = caseExclusiveChoice(exclusiveChoice);
				if (result == null) result = caseNode(exclusiveChoice);
				if (result == null) result = caseBindingElement(exclusiveChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.SIMPLE_MERGE: {
				SimpleMerge simpleMerge = (SimpleMerge)theEObject;
				T result = caseSimpleMerge(simpleMerge);
				if (result == null) result = caseNode(simpleMerge);
				if (result == null) result = caseBindingElement(simpleMerge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.MULTI_CHOICE: {
				MultiChoice multiChoice = (MultiChoice)theEObject;
				T result = caseMultiChoice(multiChoice);
				if (result == null) result = caseNode(multiChoice);
				if (result == null) result = caseBindingElement(multiChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.FLOW_EDGE: {
				FlowEdge flowEdge = (FlowEdge)theEObject;
				T result = caseFlowEdge(flowEdge);
				if (result == null) result = caseBindingElement(flowEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.NAME_TASK: {
				nameTask nameTask = (nameTask)theEObject;
				T result = casenameTask(nameTask);
				if (result == null) result = caseBindingAttribute(nameTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.IS_INITIAL_TASK: {
				isInitialTask isInitialTask = (isInitialTask)theEObject;
				T result = caseisInitialTask(isInitialTask);
				if (result == null) result = caseBindingAttribute(isInitialTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.IS_TERMINATING_FINAL_TASK: {
				isTerminatingFinalTask isTerminatingFinalTask = (isTerminatingFinalTask)theEObject;
				T result = caseisTerminatingFinalTask(isTerminatingFinalTask);
				if (result == null) result = caseBindingAttribute(isTerminatingFinalTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.IS_MANDATORY_FINAL_TASK: {
				isMandatoryFinalTask isMandatoryFinalTask = (isMandatoryFinalTask)theEObject;
				T result = caseisMandatoryFinalTask(isMandatoryFinalTask);
				if (result == null) result = caseBindingAttribute(isMandatoryFinalTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.NONE_ELEMENT: {
				NoneElement noneElement = (NoneElement)theEObject;
				T result = caseNoneElement(noneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.BINDING_ELEMENT: {
				BindingElement bindingElement = (BindingElement)theEObject;
				T result = caseBindingElement(bindingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.INTERMEDIATE_ELEMENT: {
				IntermediateElement intermediateElement = (IntermediateElement)theEObject;
				T result = caseIntermediateElement(intermediateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.METAMODEL_ELEMENT: {
				MetamodelElement metamodelElement = (MetamodelElement)theEObject;
				T result = caseMetamodelElement(metamodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.METAMODEL_ELEMENT_FEATURE: {
				MetamodelElementFeature metamodelElementFeature = (MetamodelElementFeature)theEObject;
				T result = caseMetamodelElementFeature(metamodelElementFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.BINDING_ATTRIBUTE: {
				BindingAttribute bindingAttribute = (BindingAttribute)theEObject;
				T result = caseBindingAttribute(bindingAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Workflow_bdslPackage.VIRTUAL_ATTRIBUTE: {
				VirtualAttribute virtualAttribute = (VirtualAttribute)theEObject;
				T result = caseVirtualAttribute(virtualAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowDiagram(FlowDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalTask(FinalTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelSplit(ParallelSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronization(Synchronization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveChoice(ExclusiveChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMerge(SimpleMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiChoice(MultiChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowEdge(FlowEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameTask(nameTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is Initial Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is Initial Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisInitialTask(isInitialTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is Terminating Final Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is Terminating Final Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisTerminatingFinalTask(isTerminatingFinalTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is Mandatory Final Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is Mandatory Final Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisMandatoryFinalTask(isMandatoryFinalTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneElement(NoneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingElement(BindingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateElement(IntermediateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElement(MetamodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElementFeature(MetamodelElementFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingAttribute(BindingAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualAttribute(VirtualAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Workflow_bdslSwitch

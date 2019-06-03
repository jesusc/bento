/**
 */
package bento.sirius.tests.metamodels.stepeasy;

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
 * @see bento.sirius.tests.metamodels.stepeasy.StepeasyFactory
 * @model kind="package"
 * @generated
 */
public interface StepeasyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stepeasy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/sirius/stepeasy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stepeasy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepeasyPackage eINSTANCE = bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.StepEasyMachineImpl <em>Step Easy Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepEasyMachineImpl
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getStepEasyMachine()
	 * @generated
	 */
	int STEP_EASY_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EASY_MACHINE__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EASY_MACHINE__TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Step Easy Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EASY_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Step Easy Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EASY_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.TaskImpl
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.InitialTaskImpl <em>Initial Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.InitialTaskImpl
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getInitialTask()
	 * @generated
	 */
	int INITIAL_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TASK__NAME = TASK__NAME;

	/**
	 * The number of structural features of the '<em>Initial Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.AwsLambdaTaskImpl <em>Aws Lambda Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.AwsLambdaTaskImpl
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getAwsLambdaTask()
	 * @generated
	 */
	int AWS_LAMBDA_TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_LAMBDA_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Arn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_LAMBDA_TASK__ARN = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_LAMBDA_TASK__FUNCTION_TIMEOUT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aws Lambda Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_LAMBDA_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aws Lambda Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_LAMBDA_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.TransitionImpl
	 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.stepeasy.StepEasyMachine <em>Step Easy Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Easy Machine</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.StepEasyMachine
	 * @generated
	 */
	EClass getStepEasyMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.metamodels.stepeasy.StepEasyMachine#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.StepEasyMachine#getTasks()
	 * @see #getStepEasyMachine()
	 * @generated
	 */
	EReference getStepEasyMachine_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.metamodels.stepeasy.StepEasyMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.StepEasyMachine#getTransitions()
	 * @see #getStepEasyMachine()
	 * @generated
	 */
	EReference getStepEasyMachine_Transitions();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.stepeasy.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.stepeasy.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.stepeasy.InitialTask <em>Initial Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Task</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.InitialTask
	 * @generated
	 */
	EClass getInitialTask();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask <em>Aws Lambda Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aws Lambda Task</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask
	 * @generated
	 */
	EClass getAwsLambdaTask();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask#getArn <em>Arn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arn</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask#getArn()
	 * @see #getAwsLambdaTask()
	 * @generated
	 */
	EAttribute getAwsLambdaTask_Arn();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask#getFunctionTimeout <em>Function Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Timeout</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask#getFunctionTimeout()
	 * @see #getAwsLambdaTask()
	 * @generated
	 */
	EAttribute getAwsLambdaTask_FunctionTimeout();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.stepeasy.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.stepeasy.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.metamodels.stepeasy.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.metamodels.stepeasy.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see bento.sirius.tests.metamodels.stepeasy.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepeasyFactory getStepeasyFactory();

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
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.StepEasyMachineImpl <em>Step Easy Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepEasyMachineImpl
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getStepEasyMachine()
		 * @generated
		 */
		EClass STEP_EASY_MACHINE = eINSTANCE.getStepEasyMachine();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_EASY_MACHINE__TASKS = eINSTANCE.getStepEasyMachine_Tasks();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_EASY_MACHINE__TRANSITIONS = eINSTANCE.getStepEasyMachine_Transitions();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.TaskImpl
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getTask()
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
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.InitialTaskImpl <em>Initial Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.InitialTaskImpl
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getInitialTask()
		 * @generated
		 */
		EClass INITIAL_TASK = eINSTANCE.getInitialTask();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.AwsLambdaTaskImpl <em>Aws Lambda Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.AwsLambdaTaskImpl
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getAwsLambdaTask()
		 * @generated
		 */
		EClass AWS_LAMBDA_TASK = eINSTANCE.getAwsLambdaTask();

		/**
		 * The meta object literal for the '<em><b>Arn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_LAMBDA_TASK__ARN = eINSTANCE.getAwsLambdaTask_Arn();

		/**
		 * The meta object literal for the '<em><b>Function Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_LAMBDA_TASK__FUNCTION_TIMEOUT = eINSTANCE.getAwsLambdaTask_FunctionTimeout();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.stepeasy.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.TransitionImpl
		 * @see bento.sirius.tests.metamodels.stepeasy.impl.StepeasyPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

	}

} //StepeasyPackage

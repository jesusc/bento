/**
 */
package bento.sirius.tests.metamodels.stepeasy.impl;

import bento.sirius.tests.metamodels.stepeasy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepeasyFactoryImpl extends EFactoryImpl implements StepeasyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepeasyFactory init() {
		try {
			StepeasyFactory theStepeasyFactory = (StepeasyFactory)EPackage.Registry.INSTANCE.getEFactory(StepeasyPackage.eNS_URI);
			if (theStepeasyFactory != null) {
				return theStepeasyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepeasyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepeasyFactoryImpl() {
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
			case StepeasyPackage.STEP_EASY_MACHINE: return createStepEasyMachine();
			case StepeasyPackage.INITIAL_TASK: return createInitialTask();
			case StepeasyPackage.AWS_LAMBDA_TASK: return createAwsLambdaTask();
			case StepeasyPackage.TRANSITION: return createTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepEasyMachine createStepEasyMachine() {
		StepEasyMachineImpl stepEasyMachine = new StepEasyMachineImpl();
		return stepEasyMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialTask createInitialTask() {
		InitialTaskImpl initialTask = new InitialTaskImpl();
		return initialTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwsLambdaTask createAwsLambdaTask() {
		AwsLambdaTaskImpl awsLambdaTask = new AwsLambdaTaskImpl();
		return awsLambdaTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepeasyPackage getStepeasyPackage() {
		return (StepeasyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepeasyPackage getPackage() {
		return StepeasyPackage.eINSTANCE;
	}

} //StepeasyFactoryImpl

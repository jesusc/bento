/**
 */
package bento.sirius.tests.metamodels.stepeasy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bento.sirius.tests.metamodels.stepeasy.StepeasyPackage
 * @generated
 */
public interface StepeasyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepeasyFactory eINSTANCE = bento.sirius.tests.metamodels.stepeasy.impl.StepeasyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Step Easy Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Easy Machine</em>'.
	 * @generated
	 */
	StepEasyMachine createStepEasyMachine();

	/**
	 * Returns a new object of class '<em>Initial Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Task</em>'.
	 * @generated
	 */
	InitialTask createInitialTask();

	/**
	 * Returns a new object of class '<em>Aws Lambda Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aws Lambda Task</em>'.
	 * @generated
	 */
	AwsLambdaTask createAwsLambdaTask();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepeasyPackage getStepeasyPackage();

} //StepeasyFactory

/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mindstorms_bdsl.Mindstorms_bdslPackage
 * @generated
 */
public interface Mindstorms_bdslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mindstorms_bdslFactory eINSTANCE = mindstorms_bdsl.impl.Mindstorms_bdslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main</em>'.
	 * @generated
	 */
	Main createMain();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	Procedure createProcedure();

	/**
	 * Returns a new object of class '<em>Arbitrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitrator</em>'.
	 * @generated
	 */
	Arbitrator createArbitrator();

	/**
	 * Returns a new object of class '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior</em>'.
	 * @generated
	 */
	Behavior createBehavior();

	/**
	 * Returns a new object of class '<em>Reuse Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reuse Instruction</em>'.
	 * @generated
	 */
	ReuseInstruction createReuseInstruction();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While</em>'.
	 * @generated
	 */
	While createWhile();

	/**
	 * Returns a new object of class '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go Forward</em>'.
	 * @generated
	 */
	GoForward createGoForward();

	/**
	 * Returns a new object of class '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go Backward</em>'.
	 * @generated
	 */
	GoBackward createGoBackward();

	/**
	 * Returns a new object of class '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate</em>'.
	 * @generated
	 */
	Rotate createRotate();

	/**
	 * Returns a new object of class '<em>Go To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To</em>'.
	 * @generated
	 */
	GoTo createGoTo();

	/**
	 * Returns a new object of class '<em>Return To Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return To Base</em>'.
	 * @generated
	 */
	ReturnToBase createReturnToBase();

	/**
	 * Returns a new object of class '<em>Grab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grab</em>'.
	 * @generated
	 */
	Grab createGrab();

	/**
	 * Returns a new object of class '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release</em>'.
	 * @generated
	 */
	Release createRelease();

	/**
	 * Returns a new object of class '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay</em>'.
	 * @generated
	 */
	Delay createDelay();

	/**
	 * Returns a new object of class '<em>Avoid Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avoid Obstacle</em>'.
	 * @generated
	 */
	AvoidObstacle createAvoidObstacle();

	/**
	 * Returns a new object of class '<em>Return Bottle To Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Bottle To Base</em>'.
	 * @generated
	 */
	ReturnBottleToBase createReturnBottleToBase();

	/**
	 * Returns a new object of class '<em>Explore Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explore Forward</em>'.
	 * @generated
	 */
	ExploreForward createExploreForward();

	/**
	 * Returns a new object of class '<em>Touch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touch Sensor</em>'.
	 * @generated
	 */
	TouchSensor createTouchSensor();

	/**
	 * Returns a new object of class '<em>Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ultrasonic Sensor</em>'.
	 * @generated
	 */
	UltrasonicSensor createUltrasonicSensor();

	/**
	 * Returns a new object of class '<em>Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Sensor</em>'.
	 * @generated
	 */
	ColorSensor createColorSensor();

	/**
	 * Returns a new object of class '<em>Go To Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To Enemy</em>'.
	 * @generated
	 */
	GoToEnemy createGoToEnemy();

	/**
	 * Returns a new object of class '<em>name Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Procedure</em>'.
	 * @generated
	 */
	nameProcedure createnameProcedure();

	/**
	 * Returns a new object of class '<em>name Arbitrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Arbitrator</em>'.
	 * @generated
	 */
	nameArbitrator createnameArbitrator();

	/**
	 * Returns a new object of class '<em>name Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Behavior</em>'.
	 * @generated
	 */
	nameBehavior createnameBehavior();

	/**
	 * Returns a new object of class '<em>name Reuse Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Reuse Instruction</em>'.
	 * @generated
	 */
	nameReuseInstruction createnameReuseInstruction();

	/**
	 * Returns a new object of class '<em>name If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name If</em>'.
	 * @generated
	 */
	nameIf createnameIf();

	/**
	 * Returns a new object of class '<em>name While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name While</em>'.
	 * @generated
	 */
	nameWhile createnameWhile();

	/**
	 * Returns a new object of class '<em>name Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Go Forward</em>'.
	 * @generated
	 */
	nameGoForward createnameGoForward();

	/**
	 * Returns a new object of class '<em>cm Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cm Go Forward</em>'.
	 * @generated
	 */
	cmGoForward createcmGoForward();

	/**
	 * Returns a new object of class '<em>infinite Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>infinite Go Forward</em>'.
	 * @generated
	 */
	infiniteGoForward createinfiniteGoForward();

	/**
	 * Returns a new object of class '<em>name Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Go Backward</em>'.
	 * @generated
	 */
	nameGoBackward createnameGoBackward();

	/**
	 * Returns a new object of class '<em>cm Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>cm Go Backward</em>'.
	 * @generated
	 */
	cmGoBackward createcmGoBackward();

	/**
	 * Returns a new object of class '<em>infinite Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>infinite Go Backward</em>'.
	 * @generated
	 */
	infiniteGoBackward createinfiniteGoBackward();

	/**
	 * Returns a new object of class '<em>name Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Rotate</em>'.
	 * @generated
	 */
	nameRotate createnameRotate();

	/**
	 * Returns a new object of class '<em>degrees Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>degrees Rotate</em>'.
	 * @generated
	 */
	degreesRotate createdegreesRotate();

	/**
	 * Returns a new object of class '<em>random Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>random Rotate</em>'.
	 * @generated
	 */
	randomRotate createrandomRotate();

	/**
	 * Returns a new object of class '<em>name Go To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Go To</em>'.
	 * @generated
	 */
	nameGoTo createnameGoTo();

	/**
	 * Returns a new object of class '<em>xGo To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xGo To</em>'.
	 * @generated
	 */
	xGoTo createxGoTo();

	/**
	 * Returns a new object of class '<em>yGo To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>yGo To</em>'.
	 * @generated
	 */
	yGoTo createyGoTo();

	/**
	 * Returns a new object of class '<em>name Return To Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Return To Base</em>'.
	 * @generated
	 */
	nameReturnToBase createnameReturnToBase();

	/**
	 * Returns a new object of class '<em>name Grab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Grab</em>'.
	 * @generated
	 */
	nameGrab createnameGrab();

	/**
	 * Returns a new object of class '<em>name Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Release</em>'.
	 * @generated
	 */
	nameRelease createnameRelease();

	/**
	 * Returns a new object of class '<em>name Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Delay</em>'.
	 * @generated
	 */
	nameDelay createnameDelay();

	/**
	 * Returns a new object of class '<em>ms Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ms Delay</em>'.
	 * @generated
	 */
	msDelay createmsDelay();

	/**
	 * Returns a new object of class '<em>name Avoid Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Avoid Obstacle</em>'.
	 * @generated
	 */
	nameAvoidObstacle createnameAvoidObstacle();

	/**
	 * Returns a new object of class '<em>name Return Bottle To Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Return Bottle To Base</em>'.
	 * @generated
	 */
	nameReturnBottleToBase createnameReturnBottleToBase();

	/**
	 * Returns a new object of class '<em>name Explore Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Explore Forward</em>'.
	 * @generated
	 */
	nameExploreForward createnameExploreForward();

	/**
	 * Returns a new object of class '<em>name Touch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Touch Sensor</em>'.
	 * @generated
	 */
	nameTouchSensor createnameTouchSensor();

	/**
	 * Returns a new object of class '<em>is Pressed Touch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>is Pressed Touch Sensor</em>'.
	 * @generated
	 */
	isPressedTouchSensor createisPressedTouchSensor();

	/**
	 * Returns a new object of class '<em>name Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Ultrasonic Sensor</em>'.
	 * @generated
	 */
	nameUltrasonicSensor createnameUltrasonicSensor();

	/**
	 * Returns a new object of class '<em>operator Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operator Ultrasonic Sensor</em>'.
	 * @generated
	 */
	operatorUltrasonicSensor createoperatorUltrasonicSensor();

	/**
	 * Returns a new object of class '<em>value Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>value Ultrasonic Sensor</em>'.
	 * @generated
	 */
	valueUltrasonicSensor createvalueUltrasonicSensor();

	/**
	 * Returns a new object of class '<em>name Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Color Sensor</em>'.
	 * @generated
	 */
	nameColorSensor createnameColorSensor();

	/**
	 * Returns a new object of class '<em>color Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>color Color Sensor</em>'.
	 * @generated
	 */
	colorColorSensor createcolorColorSensor();

	/**
	 * Returns a new object of class '<em>name Go To Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Go To Enemy</em>'.
	 * @generated
	 */
	nameGoToEnemy createnameGoToEnemy();

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
	Mindstorms_bdslPackage getMindstorms_bdslPackage();

} //Mindstorms_bdslFactory

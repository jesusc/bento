/**
 */
package mindstorms_bdsl.impl;

import mindstorms_bdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Mindstorms_bdslFactoryImpl extends EFactoryImpl implements Mindstorms_bdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mindstorms_bdslFactory init() {
		try {
			Mindstorms_bdslFactory theMindstorms_bdslFactory = (Mindstorms_bdslFactory)EPackage.Registry.INSTANCE.getEFactory(Mindstorms_bdslPackage.eNS_URI);
			if (theMindstorms_bdslFactory != null) {
				return theMindstorms_bdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mindstorms_bdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mindstorms_bdslFactoryImpl() {
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
			case Mindstorms_bdslPackage.MAIN: return createMain();
			case Mindstorms_bdslPackage.PROCEDURE: return createProcedure();
			case Mindstorms_bdslPackage.ARBITRATOR: return createArbitrator();
			case Mindstorms_bdslPackage.BEHAVIOR: return createBehavior();
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION: return createReuseInstruction();
			case Mindstorms_bdslPackage.IF: return createIf();
			case Mindstorms_bdslPackage.WHILE: return createWhile();
			case Mindstorms_bdslPackage.GO_FORWARD: return createGoForward();
			case Mindstorms_bdslPackage.GO_BACKWARD: return createGoBackward();
			case Mindstorms_bdslPackage.ROTATE: return createRotate();
			case Mindstorms_bdslPackage.GO_TO: return createGoTo();
			case Mindstorms_bdslPackage.RETURN_TO_BASE: return createReturnToBase();
			case Mindstorms_bdslPackage.GRAB: return createGrab();
			case Mindstorms_bdslPackage.RELEASE: return createRelease();
			case Mindstorms_bdslPackage.DELAY: return createDelay();
			case Mindstorms_bdslPackage.AVOID_OBSTACLE: return createAvoidObstacle();
			case Mindstorms_bdslPackage.RETURN_BOTTLE_TO_BASE: return createReturnBottleToBase();
			case Mindstorms_bdslPackage.EXPLORE_FORWARD: return createExploreForward();
			case Mindstorms_bdslPackage.TOUCH_SENSOR: return createTouchSensor();
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR: return createUltrasonicSensor();
			case Mindstorms_bdslPackage.COLOR_SENSOR: return createColorSensor();
			case Mindstorms_bdslPackage.GO_TO_ENEMY: return createGoToEnemy();
			case Mindstorms_bdslPackage.NAME_PROCEDURE: return createnameProcedure();
			case Mindstorms_bdslPackage.NAME_ARBITRATOR: return createnameArbitrator();
			case Mindstorms_bdslPackage.NAME_BEHAVIOR: return createnameBehavior();
			case Mindstorms_bdslPackage.NAME_REUSE_INSTRUCTION: return createnameReuseInstruction();
			case Mindstorms_bdslPackage.NAME_IF: return createnameIf();
			case Mindstorms_bdslPackage.NAME_WHILE: return createnameWhile();
			case Mindstorms_bdslPackage.NAME_GO_FORWARD: return createnameGoForward();
			case Mindstorms_bdslPackage.CM_GO_FORWARD: return createcmGoForward();
			case Mindstorms_bdslPackage.INFINITE_GO_FORWARD: return createinfiniteGoForward();
			case Mindstorms_bdslPackage.NAME_GO_BACKWARD: return createnameGoBackward();
			case Mindstorms_bdslPackage.CM_GO_BACKWARD: return createcmGoBackward();
			case Mindstorms_bdslPackage.INFINITE_GO_BACKWARD: return createinfiniteGoBackward();
			case Mindstorms_bdslPackage.NAME_ROTATE: return createnameRotate();
			case Mindstorms_bdslPackage.DEGREES_ROTATE: return createdegreesRotate();
			case Mindstorms_bdslPackage.RANDOM_ROTATE: return createrandomRotate();
			case Mindstorms_bdslPackage.NAME_GO_TO: return createnameGoTo();
			case Mindstorms_bdslPackage.XGO_TO: return createxGoTo();
			case Mindstorms_bdslPackage.YGO_TO: return createyGoTo();
			case Mindstorms_bdslPackage.NAME_RETURN_TO_BASE: return createnameReturnToBase();
			case Mindstorms_bdslPackage.NAME_GRAB: return createnameGrab();
			case Mindstorms_bdslPackage.NAME_RELEASE: return createnameRelease();
			case Mindstorms_bdslPackage.NAME_DELAY: return createnameDelay();
			case Mindstorms_bdslPackage.MS_DELAY: return createmsDelay();
			case Mindstorms_bdslPackage.NAME_AVOID_OBSTACLE: return createnameAvoidObstacle();
			case Mindstorms_bdslPackage.NAME_RETURN_BOTTLE_TO_BASE: return createnameReturnBottleToBase();
			case Mindstorms_bdslPackage.NAME_EXPLORE_FORWARD: return createnameExploreForward();
			case Mindstorms_bdslPackage.NAME_TOUCH_SENSOR: return createnameTouchSensor();
			case Mindstorms_bdslPackage.IS_PRESSED_TOUCH_SENSOR: return createisPressedTouchSensor();
			case Mindstorms_bdslPackage.NAME_ULTRASONIC_SENSOR: return createnameUltrasonicSensor();
			case Mindstorms_bdslPackage.OPERATOR_ULTRASONIC_SENSOR: return createoperatorUltrasonicSensor();
			case Mindstorms_bdslPackage.VALUE_ULTRASONIC_SENSOR: return createvalueUltrasonicSensor();
			case Mindstorms_bdslPackage.NAME_COLOR_SENSOR: return createnameColorSensor();
			case Mindstorms_bdslPackage.COLOR_COLOR_SENSOR: return createcolorColorSensor();
			case Mindstorms_bdslPackage.NAME_GO_TO_ENEMY: return createnameGoToEnemy();
			case Mindstorms_bdslPackage.NONE_ELEMENT: return createNoneElement();
			case Mindstorms_bdslPackage.INTERMEDIATE_ELEMENT: return createIntermediateElement();
			case Mindstorms_bdslPackage.METAMODEL_ELEMENT: return createMetamodelElement();
			case Mindstorms_bdslPackage.METAMODEL_ELEMENT_FEATURE: return createMetamodelElementFeature();
			case Mindstorms_bdslPackage.VIRTUAL_ATTRIBUTE: return createVirtualAttribute();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Mindstorms_bdslPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case Mindstorms_bdslPackage.OPERATOR_KIND:
				return createOperatorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Mindstorms_bdslPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case Mindstorms_bdslPackage.OPERATOR_KIND:
				return convertOperatorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arbitrator createArbitrator() {
		ArbitratorImpl arbitrator = new ArbitratorImpl();
		return arbitrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior() {
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReuseInstruction createReuseInstruction() {
		ReuseInstructionImpl reuseInstruction = new ReuseInstructionImpl();
		return reuseInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoForward createGoForward() {
		GoForwardImpl goForward = new GoForwardImpl();
		return goForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoBackward createGoBackward() {
		GoBackwardImpl goBackward = new GoBackwardImpl();
		return goBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTo createGoTo() {
		GoToImpl goTo = new GoToImpl();
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnToBase createReturnToBase() {
		ReturnToBaseImpl returnToBase = new ReturnToBaseImpl();
		return returnToBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grab createGrab() {
		GrabImpl grab = new GrabImpl();
		return grab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvoidObstacle createAvoidObstacle() {
		AvoidObstacleImpl avoidObstacle = new AvoidObstacleImpl();
		return avoidObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnBottleToBase createReturnBottleToBase() {
		ReturnBottleToBaseImpl returnBottleToBase = new ReturnBottleToBaseImpl();
		return returnBottleToBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExploreForward createExploreForward() {
		ExploreForwardImpl exploreForward = new ExploreForwardImpl();
		return exploreForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchSensor createTouchSensor() {
		TouchSensorImpl touchSensor = new TouchSensorImpl();
		return touchSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UltrasonicSensor createUltrasonicSensor() {
		UltrasonicSensorImpl ultrasonicSensor = new UltrasonicSensorImpl();
		return ultrasonicSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSensor createColorSensor() {
		ColorSensorImpl colorSensor = new ColorSensorImpl();
		return colorSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoToEnemy createGoToEnemy() {
		GoToEnemyImpl goToEnemy = new GoToEnemyImpl();
		return goToEnemy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameProcedure createnameProcedure() {
		nameProcedureImpl nameProcedure = new nameProcedureImpl();
		return nameProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameArbitrator createnameArbitrator() {
		nameArbitratorImpl nameArbitrator = new nameArbitratorImpl();
		return nameArbitrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameBehavior createnameBehavior() {
		nameBehaviorImpl nameBehavior = new nameBehaviorImpl();
		return nameBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameReuseInstruction createnameReuseInstruction() {
		nameReuseInstructionImpl nameReuseInstruction = new nameReuseInstructionImpl();
		return nameReuseInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameIf createnameIf() {
		nameIfImpl nameIf = new nameIfImpl();
		return nameIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameWhile createnameWhile() {
		nameWhileImpl nameWhile = new nameWhileImpl();
		return nameWhile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameGoForward createnameGoForward() {
		nameGoForwardImpl nameGoForward = new nameGoForwardImpl();
		return nameGoForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cmGoForward createcmGoForward() {
		cmGoForwardImpl cmGoForward = new cmGoForwardImpl();
		return cmGoForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public infiniteGoForward createinfiniteGoForward() {
		infiniteGoForwardImpl infiniteGoForward = new infiniteGoForwardImpl();
		return infiniteGoForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameGoBackward createnameGoBackward() {
		nameGoBackwardImpl nameGoBackward = new nameGoBackwardImpl();
		return nameGoBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cmGoBackward createcmGoBackward() {
		cmGoBackwardImpl cmGoBackward = new cmGoBackwardImpl();
		return cmGoBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public infiniteGoBackward createinfiniteGoBackward() {
		infiniteGoBackwardImpl infiniteGoBackward = new infiniteGoBackwardImpl();
		return infiniteGoBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameRotate createnameRotate() {
		nameRotateImpl nameRotate = new nameRotateImpl();
		return nameRotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public degreesRotate createdegreesRotate() {
		degreesRotateImpl degreesRotate = new degreesRotateImpl();
		return degreesRotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public randomRotate createrandomRotate() {
		randomRotateImpl randomRotate = new randomRotateImpl();
		return randomRotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameGoTo createnameGoTo() {
		nameGoToImpl nameGoTo = new nameGoToImpl();
		return nameGoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xGoTo createxGoTo() {
		xGoToImpl xGoTo = new xGoToImpl();
		return xGoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yGoTo createyGoTo() {
		yGoToImpl yGoTo = new yGoToImpl();
		return yGoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameReturnToBase createnameReturnToBase() {
		nameReturnToBaseImpl nameReturnToBase = new nameReturnToBaseImpl();
		return nameReturnToBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameGrab createnameGrab() {
		nameGrabImpl nameGrab = new nameGrabImpl();
		return nameGrab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameRelease createnameRelease() {
		nameReleaseImpl nameRelease = new nameReleaseImpl();
		return nameRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameDelay createnameDelay() {
		nameDelayImpl nameDelay = new nameDelayImpl();
		return nameDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public msDelay createmsDelay() {
		msDelayImpl msDelay = new msDelayImpl();
		return msDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameAvoidObstacle createnameAvoidObstacle() {
		nameAvoidObstacleImpl nameAvoidObstacle = new nameAvoidObstacleImpl();
		return nameAvoidObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameReturnBottleToBase createnameReturnBottleToBase() {
		nameReturnBottleToBaseImpl nameReturnBottleToBase = new nameReturnBottleToBaseImpl();
		return nameReturnBottleToBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameExploreForward createnameExploreForward() {
		nameExploreForwardImpl nameExploreForward = new nameExploreForwardImpl();
		return nameExploreForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameTouchSensor createnameTouchSensor() {
		nameTouchSensorImpl nameTouchSensor = new nameTouchSensorImpl();
		return nameTouchSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isPressedTouchSensor createisPressedTouchSensor() {
		isPressedTouchSensorImpl isPressedTouchSensor = new isPressedTouchSensorImpl();
		return isPressedTouchSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameUltrasonicSensor createnameUltrasonicSensor() {
		nameUltrasonicSensorImpl nameUltrasonicSensor = new nameUltrasonicSensorImpl();
		return nameUltrasonicSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operatorUltrasonicSensor createoperatorUltrasonicSensor() {
		operatorUltrasonicSensorImpl operatorUltrasonicSensor = new operatorUltrasonicSensorImpl();
		return operatorUltrasonicSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public valueUltrasonicSensor createvalueUltrasonicSensor() {
		valueUltrasonicSensorImpl valueUltrasonicSensor = new valueUltrasonicSensorImpl();
		return valueUltrasonicSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameColorSensor createnameColorSensor() {
		nameColorSensorImpl nameColorSensor = new nameColorSensorImpl();
		return nameColorSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colorColorSensor createcolorColorSensor() {
		colorColorSensorImpl colorColorSensor = new colorColorSensorImpl();
		return colorColorSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameGoToEnemy createnameGoToEnemy() {
		nameGoToEnemyImpl nameGoToEnemy = new nameGoToEnemyImpl();
		return nameGoToEnemy;
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
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorKind createOperatorKindFromString(EDataType eDataType, String initialValue) {
		OperatorKind result = OperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mindstorms_bdslPackage getMindstorms_bdslPackage() {
		return (Mindstorms_bdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mindstorms_bdslPackage getPackage() {
		return Mindstorms_bdslPackage.eINSTANCE;
	}

} //Mindstorms_bdslFactoryImpl

/**
 */
package mindstorms_bdsl.impl;

import mindstorms_bdsl.Action;
import mindstorms_bdsl.Arbitrator;
import mindstorms_bdsl.AvoidObstacle;
import mindstorms_bdsl.Behavior;
import mindstorms_bdsl.BindingAttribute;
import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Block;
import mindstorms_bdsl.BlockContainer;
import mindstorms_bdsl.Color;
import mindstorms_bdsl.ColorSensor;
import mindstorms_bdsl.Condition;
import mindstorms_bdsl.ConditionContainer;
import mindstorms_bdsl.Delay;
import mindstorms_bdsl.ExploreForward;
import mindstorms_bdsl.Flow;
import mindstorms_bdsl.GoBackward;
import mindstorms_bdsl.GoForward;
import mindstorms_bdsl.GoTo;
import mindstorms_bdsl.GoToEnemy;
import mindstorms_bdsl.Grab;
import mindstorms_bdsl.If;
import mindstorms_bdsl.Instruction;
import mindstorms_bdsl.IntermediateElement;
import mindstorms_bdsl.Main;
import mindstorms_bdsl.MetamodelElement;
import mindstorms_bdsl.MetamodelElementFeature;
import mindstorms_bdsl.Mindstorms_bdslFactory;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NamedElement;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.OperatorKind;
import mindstorms_bdsl.Procedure;
import mindstorms_bdsl.Release;
import mindstorms_bdsl.ReturnBottleToBase;
import mindstorms_bdsl.ReturnToBase;
import mindstorms_bdsl.ReuseInstruction;
import mindstorms_bdsl.Rotate;
import mindstorms_bdsl.Sensor;
import mindstorms_bdsl.TouchSensor;
import mindstorms_bdsl.UltrasonicSensor;
import mindstorms_bdsl.VirtualAttribute;
import mindstorms_bdsl.While;
import mindstorms_bdsl.cmGoBackward;
import mindstorms_bdsl.cmGoForward;
import mindstorms_bdsl.colorColorSensor;
import mindstorms_bdsl.degreesRotate;
import mindstorms_bdsl.infiniteGoBackward;
import mindstorms_bdsl.infiniteGoForward;
import mindstorms_bdsl.isPressedTouchSensor;
import mindstorms_bdsl.msDelay;
import mindstorms_bdsl.nameArbitrator;
import mindstorms_bdsl.nameAvoidObstacle;
import mindstorms_bdsl.nameBehavior;
import mindstorms_bdsl.nameColorSensor;
import mindstorms_bdsl.nameDelay;
import mindstorms_bdsl.nameExploreForward;
import mindstorms_bdsl.nameGoBackward;
import mindstorms_bdsl.nameGoForward;
import mindstorms_bdsl.nameGoTo;
import mindstorms_bdsl.nameGoToEnemy;
import mindstorms_bdsl.nameGrab;
import mindstorms_bdsl.nameIf;
import mindstorms_bdsl.nameProcedure;
import mindstorms_bdsl.nameRelease;
import mindstorms_bdsl.nameReturnBottleToBase;
import mindstorms_bdsl.nameReturnToBase;
import mindstorms_bdsl.nameReuseInstruction;
import mindstorms_bdsl.nameRotate;
import mindstorms_bdsl.nameTouchSensor;
import mindstorms_bdsl.nameUltrasonicSensor;
import mindstorms_bdsl.nameWhile;
import mindstorms_bdsl.operatorUltrasonicSensor;
import mindstorms_bdsl.randomRotate;
import mindstorms_bdsl.valueUltrasonicSensor;
import mindstorms_bdsl.xGoTo;
import mindstorms_bdsl.yGoTo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mindstorms_bdslPackageImpl extends EPackageImpl implements Mindstorms_bdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reuseInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goBackwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnToBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avoidObstacleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnBottleToBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exploreForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ultrasonicSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goToEnemyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameArbitratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameReuseInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameWhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameGoForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmGoForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infiniteGoForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameGoBackwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmGoBackwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infiniteGoBackwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameRotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreesRotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomRotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameGoToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xGoToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGoToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameReturnToBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameGrabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameReleaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameAvoidObstacleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameReturnBottleToBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameExploreForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTouchSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isPressedTouchSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameUltrasonicSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorUltrasonicSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueUltrasonicSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameColorSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorColorSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameGoToEnemyEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorKindEEnum = null;

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
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mindstorms_bdslPackageImpl() {
		super(eNS_URI, Mindstorms_bdslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Mindstorms_bdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mindstorms_bdslPackage init() {
		if (isInited) return (Mindstorms_bdslPackage)EPackage.Registry.INSTANCE.getEPackage(Mindstorms_bdslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMindstorms_bdslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Mindstorms_bdslPackageImpl theMindstorms_bdslPackage = registeredMindstorms_bdslPackage instanceof Mindstorms_bdslPackageImpl ? (Mindstorms_bdslPackageImpl)registeredMindstorms_bdslPackage : new Mindstorms_bdslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMindstorms_bdslPackage.createPackageContents();

		// Initialize created meta-data
		theMindstorms_bdslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMindstorms_bdslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mindstorms_bdslPackage.eNS_URI, theMindstorms_bdslPackage);
		return theMindstorms_bdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ContainsNoneElement() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ContainsBindingElement() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ContainsIntermediateElement() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ContainsMetamodelElement() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ContainsMetamodelElementFeature() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ContainsBindingAttribute() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ContainsVirtualAttribute() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Instructions() {
		return (EReference)mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockContainer() {
		return blockContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockContainer_Blocks() {
		return (EReference)blockContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_ContainsnameProcedure() {
		return (EReference)procedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitrator() {
		return arbitratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitrator_Behaviors() {
		return (EReference)arbitratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitrator_Reuse() {
		return (EReference)arbitratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArbitrator_ContainsnameArbitrator() {
		return (EReference)arbitratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_ContainsnameBehavior() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReuseInstruction() {
		return reuseInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReuseInstruction_Reuse() {
		return (EReference)reuseInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReuseInstruction_ContainsnameReuseInstruction() {
		return (EReference)reuseInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_ContainsnameIf() {
		return (EReference)ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_ContainsnameWhile() {
		return (EReference)whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoForward() {
		return goForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoForward_Cm() {
		return (EAttribute)goForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoForward_Infinite() {
		return (EAttribute)goForwardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoForward_ContainsnameGoForward() {
		return (EReference)goForwardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoForward_ContainscmGoForward() {
		return (EReference)goForwardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoForward_ContainsinfiniteGoForward() {
		return (EReference)goForwardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoBackward() {
		return goBackwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoBackward_Cm() {
		return (EAttribute)goBackwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoBackward_Infinite() {
		return (EAttribute)goBackwardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoBackward_ContainsnameGoBackward() {
		return (EReference)goBackwardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoBackward_ContainscmGoBackward() {
		return (EReference)goBackwardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoBackward_ContainsinfiniteGoBackward() {
		return (EReference)goBackwardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_Degrees() {
		return (EAttribute)rotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_Random() {
		return (EAttribute)rotateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotate_ContainsnameRotate() {
		return (EReference)rotateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotate_ContainsdegreesRotate() {
		return (EReference)rotateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotate_ContainsrandomRotate() {
		return (EReference)rotateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoTo() {
		return goToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoTo_X() {
		return (EAttribute)goToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoTo_Y() {
		return (EAttribute)goToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoTo_ContainsnameGoTo() {
		return (EReference)goToEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoTo_ContainsxGoTo() {
		return (EReference)goToEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoTo_ContainsyGoTo() {
		return (EReference)goToEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnToBase() {
		return returnToBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnToBase_ContainsnameReturnToBase() {
		return (EReference)returnToBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrab() {
		return grabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrab_ContainsnameGrab() {
		return (EReference)grabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelease_ContainsnameRelease() {
		return (EReference)releaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_Ms() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelay_ContainsnameDelay() {
		return (EReference)delayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelay_ContainsmsDelay() {
		return (EReference)delayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvoidObstacle() {
		return avoidObstacleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvoidObstacle_ContainsnameAvoidObstacle() {
		return (EReference)avoidObstacleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnBottleToBase() {
		return returnBottleToBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnBottleToBase_ContainsnameReturnBottleToBase() {
		return (EReference)returnBottleToBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExploreForward() {
		return exploreForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExploreForward_ContainsnameExploreForward() {
		return (EReference)exploreForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchSensor() {
		return touchSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchSensor_IsPressed() {
		return (EAttribute)touchSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchSensor_ContainsnameTouchSensor() {
		return (EReference)touchSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchSensor_ContainsisPressedTouchSensor() {
		return (EReference)touchSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUltrasonicSensor() {
		return ultrasonicSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUltrasonicSensor_Operator() {
		return (EAttribute)ultrasonicSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUltrasonicSensor_Value() {
		return (EAttribute)ultrasonicSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUltrasonicSensor_ContainsnameUltrasonicSensor() {
		return (EReference)ultrasonicSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUltrasonicSensor_ContainsoperatorUltrasonicSensor() {
		return (EReference)ultrasonicSensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUltrasonicSensor_ContainsvalueUltrasonicSensor() {
		return (EReference)ultrasonicSensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorSensor() {
		return colorSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorSensor_Color() {
		return (EAttribute)colorSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorSensor_ContainsnameColorSensor() {
		return (EReference)colorSensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorSensor_ContainscolorColorSensor() {
		return (EReference)colorSensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionContainer() {
		return conditionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionContainer_Condition() {
		return (EReference)conditionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoToEnemy() {
		return goToEnemyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoToEnemy_ContainsnameGoToEnemy() {
		return (EReference)goToEnemyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameProcedure() {
		return nameProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameProcedure_Value() {
		return (EAttribute)nameProcedureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameArbitrator() {
		return nameArbitratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameArbitrator_Value() {
		return (EAttribute)nameArbitratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameBehavior() {
		return nameBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameBehavior_Value() {
		return (EAttribute)nameBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameReuseInstruction() {
		return nameReuseInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameReuseInstruction_Value() {
		return (EAttribute)nameReuseInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameIf() {
		return nameIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameIf_Value() {
		return (EAttribute)nameIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameWhile() {
		return nameWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameWhile_Value() {
		return (EAttribute)nameWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameGoForward() {
		return nameGoForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameGoForward_Value() {
		return (EAttribute)nameGoForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcmGoForward() {
		return cmGoForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcmGoForward_Value() {
		return (EAttribute)cmGoForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinfiniteGoForward() {
		return infiniteGoForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getinfiniteGoForward_Value() {
		return (EAttribute)infiniteGoForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameGoBackward() {
		return nameGoBackwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameGoBackward_Value() {
		return (EAttribute)nameGoBackwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcmGoBackward() {
		return cmGoBackwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcmGoBackward_Value() {
		return (EAttribute)cmGoBackwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinfiniteGoBackward() {
		return infiniteGoBackwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getinfiniteGoBackward_Value() {
		return (EAttribute)infiniteGoBackwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameRotate() {
		return nameRotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameRotate_Value() {
		return (EAttribute)nameRotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdegreesRotate() {
		return degreesRotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdegreesRotate_Value() {
		return (EAttribute)degreesRotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrandomRotate() {
		return randomRotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getrandomRotate_Value() {
		return (EAttribute)randomRotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameGoTo() {
		return nameGoToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameGoTo_Value() {
		return (EAttribute)nameGoToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxGoTo() {
		return xGoToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getxGoTo_Value() {
		return (EAttribute)xGoToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getyGoTo() {
		return yGoToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getyGoTo_Value() {
		return (EAttribute)yGoToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameReturnToBase() {
		return nameReturnToBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameReturnToBase_Value() {
		return (EAttribute)nameReturnToBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameGrab() {
		return nameGrabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameGrab_Value() {
		return (EAttribute)nameGrabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameRelease() {
		return nameReleaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameRelease_Value() {
		return (EAttribute)nameReleaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameDelay() {
		return nameDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameDelay_Value() {
		return (EAttribute)nameDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmsDelay() {
		return msDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmsDelay_Value() {
		return (EAttribute)msDelayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameAvoidObstacle() {
		return nameAvoidObstacleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameAvoidObstacle_Value() {
		return (EAttribute)nameAvoidObstacleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameReturnBottleToBase() {
		return nameReturnBottleToBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameReturnBottleToBase_Value() {
		return (EAttribute)nameReturnBottleToBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameExploreForward() {
		return nameExploreForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameExploreForward_Value() {
		return (EAttribute)nameExploreForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameTouchSensor() {
		return nameTouchSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameTouchSensor_Value() {
		return (EAttribute)nameTouchSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getisPressedTouchSensor() {
		return isPressedTouchSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getisPressedTouchSensor_Value() {
		return (EAttribute)isPressedTouchSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameUltrasonicSensor() {
		return nameUltrasonicSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameUltrasonicSensor_Value() {
		return (EAttribute)nameUltrasonicSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoperatorUltrasonicSensor() {
		return operatorUltrasonicSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoperatorUltrasonicSensor_Value() {
		return (EAttribute)operatorUltrasonicSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvalueUltrasonicSensor() {
		return valueUltrasonicSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvalueUltrasonicSensor_Value() {
		return (EAttribute)valueUltrasonicSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameColorSensor() {
		return nameColorSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameColorSensor_Value() {
		return (EAttribute)nameColorSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcolorColorSensor() {
		return colorColorSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcolorColorSensor_Value() {
		return (EAttribute)colorColorSensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameGoToEnemy() {
		return nameGoToEnemyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameGoToEnemy_Value() {
		return (EAttribute)nameGoToEnemyEClass.getEStructuralFeatures().get(0);
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
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorKind() {
		return operatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mindstorms_bdslFactory getMindstorms_bdslFactory() {
		return (Mindstorms_bdslFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__CONTAINS_NONE_ELEMENT);
		createEReference(namedElementEClass, NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT);
		createEReference(namedElementEClass, NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT);
		createEReference(namedElementEClass, NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT);
		createEReference(namedElementEClass, NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		createEReference(namedElementEClass, NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE);
		createEReference(namedElementEClass, NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE);

		mainEClass = createEClass(MAIN);
		createEReference(mainEClass, MAIN__INSTRUCTIONS);

		instructionEClass = createEClass(INSTRUCTION);

		blockContainerEClass = createEClass(BLOCK_CONTAINER);
		createEReference(blockContainerEClass, BLOCK_CONTAINER__BLOCKS);

		procedureEClass = createEClass(PROCEDURE);
		createEReference(procedureEClass, PROCEDURE__CONTAINSNAME_PROCEDURE);

		arbitratorEClass = createEClass(ARBITRATOR);
		createEReference(arbitratorEClass, ARBITRATOR__BEHAVIORS);
		createEReference(arbitratorEClass, ARBITRATOR__REUSE);
		createEReference(arbitratorEClass, ARBITRATOR__CONTAINSNAME_ARBITRATOR);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__CONTAINSNAME_BEHAVIOR);

		reuseInstructionEClass = createEClass(REUSE_INSTRUCTION);
		createEReference(reuseInstructionEClass, REUSE_INSTRUCTION__REUSE);
		createEReference(reuseInstructionEClass, REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION);

		blockEClass = createEClass(BLOCK);

		actionEClass = createEClass(ACTION);

		flowEClass = createEClass(FLOW);

		sensorEClass = createEClass(SENSOR);

		conditionEClass = createEClass(CONDITION);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__CONTAINSNAME_IF);

		whileEClass = createEClass(WHILE);
		createEReference(whileEClass, WHILE__CONTAINSNAME_WHILE);

		goForwardEClass = createEClass(GO_FORWARD);
		createEAttribute(goForwardEClass, GO_FORWARD__CM);
		createEAttribute(goForwardEClass, GO_FORWARD__INFINITE);
		createEReference(goForwardEClass, GO_FORWARD__CONTAINSNAME_GO_FORWARD);
		createEReference(goForwardEClass, GO_FORWARD__CONTAINSCM_GO_FORWARD);
		createEReference(goForwardEClass, GO_FORWARD__CONTAINSINFINITE_GO_FORWARD);

		goBackwardEClass = createEClass(GO_BACKWARD);
		createEAttribute(goBackwardEClass, GO_BACKWARD__CM);
		createEAttribute(goBackwardEClass, GO_BACKWARD__INFINITE);
		createEReference(goBackwardEClass, GO_BACKWARD__CONTAINSNAME_GO_BACKWARD);
		createEReference(goBackwardEClass, GO_BACKWARD__CONTAINSCM_GO_BACKWARD);
		createEReference(goBackwardEClass, GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD);

		rotateEClass = createEClass(ROTATE);
		createEAttribute(rotateEClass, ROTATE__DEGREES);
		createEAttribute(rotateEClass, ROTATE__RANDOM);
		createEReference(rotateEClass, ROTATE__CONTAINSNAME_ROTATE);
		createEReference(rotateEClass, ROTATE__CONTAINSDEGREES_ROTATE);
		createEReference(rotateEClass, ROTATE__CONTAINSRANDOM_ROTATE);

		goToEClass = createEClass(GO_TO);
		createEAttribute(goToEClass, GO_TO__X);
		createEAttribute(goToEClass, GO_TO__Y);
		createEReference(goToEClass, GO_TO__CONTAINSNAME_GO_TO);
		createEReference(goToEClass, GO_TO__CONTAINSX_GO_TO);
		createEReference(goToEClass, GO_TO__CONTAINSY_GO_TO);

		returnToBaseEClass = createEClass(RETURN_TO_BASE);
		createEReference(returnToBaseEClass, RETURN_TO_BASE__CONTAINSNAME_RETURN_TO_BASE);

		grabEClass = createEClass(GRAB);
		createEReference(grabEClass, GRAB__CONTAINSNAME_GRAB);

		releaseEClass = createEClass(RELEASE);
		createEReference(releaseEClass, RELEASE__CONTAINSNAME_RELEASE);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__MS);
		createEReference(delayEClass, DELAY__CONTAINSNAME_DELAY);
		createEReference(delayEClass, DELAY__CONTAINSMS_DELAY);

		avoidObstacleEClass = createEClass(AVOID_OBSTACLE);
		createEReference(avoidObstacleEClass, AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE);

		returnBottleToBaseEClass = createEClass(RETURN_BOTTLE_TO_BASE);
		createEReference(returnBottleToBaseEClass, RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE);

		exploreForwardEClass = createEClass(EXPLORE_FORWARD);
		createEReference(exploreForwardEClass, EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD);

		touchSensorEClass = createEClass(TOUCH_SENSOR);
		createEAttribute(touchSensorEClass, TOUCH_SENSOR__IS_PRESSED);
		createEReference(touchSensorEClass, TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR);
		createEReference(touchSensorEClass, TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR);

		ultrasonicSensorEClass = createEClass(ULTRASONIC_SENSOR);
		createEAttribute(ultrasonicSensorEClass, ULTRASONIC_SENSOR__OPERATOR);
		createEAttribute(ultrasonicSensorEClass, ULTRASONIC_SENSOR__VALUE);
		createEReference(ultrasonicSensorEClass, ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR);
		createEReference(ultrasonicSensorEClass, ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR);
		createEReference(ultrasonicSensorEClass, ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR);

		colorSensorEClass = createEClass(COLOR_SENSOR);
		createEAttribute(colorSensorEClass, COLOR_SENSOR__COLOR);
		createEReference(colorSensorEClass, COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR);
		createEReference(colorSensorEClass, COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR);

		conditionContainerEClass = createEClass(CONDITION_CONTAINER);
		createEReference(conditionContainerEClass, CONDITION_CONTAINER__CONDITION);

		goToEnemyEClass = createEClass(GO_TO_ENEMY);
		createEReference(goToEnemyEClass, GO_TO_ENEMY__CONTAINSNAME_GO_TO_ENEMY);

		nameProcedureEClass = createEClass(NAME_PROCEDURE);
		createEAttribute(nameProcedureEClass, NAME_PROCEDURE__VALUE);

		nameArbitratorEClass = createEClass(NAME_ARBITRATOR);
		createEAttribute(nameArbitratorEClass, NAME_ARBITRATOR__VALUE);

		nameBehaviorEClass = createEClass(NAME_BEHAVIOR);
		createEAttribute(nameBehaviorEClass, NAME_BEHAVIOR__VALUE);

		nameReuseInstructionEClass = createEClass(NAME_REUSE_INSTRUCTION);
		createEAttribute(nameReuseInstructionEClass, NAME_REUSE_INSTRUCTION__VALUE);

		nameIfEClass = createEClass(NAME_IF);
		createEAttribute(nameIfEClass, NAME_IF__VALUE);

		nameWhileEClass = createEClass(NAME_WHILE);
		createEAttribute(nameWhileEClass, NAME_WHILE__VALUE);

		nameGoForwardEClass = createEClass(NAME_GO_FORWARD);
		createEAttribute(nameGoForwardEClass, NAME_GO_FORWARD__VALUE);

		cmGoForwardEClass = createEClass(CM_GO_FORWARD);
		createEAttribute(cmGoForwardEClass, CM_GO_FORWARD__VALUE);

		infiniteGoForwardEClass = createEClass(INFINITE_GO_FORWARD);
		createEAttribute(infiniteGoForwardEClass, INFINITE_GO_FORWARD__VALUE);

		nameGoBackwardEClass = createEClass(NAME_GO_BACKWARD);
		createEAttribute(nameGoBackwardEClass, NAME_GO_BACKWARD__VALUE);

		cmGoBackwardEClass = createEClass(CM_GO_BACKWARD);
		createEAttribute(cmGoBackwardEClass, CM_GO_BACKWARD__VALUE);

		infiniteGoBackwardEClass = createEClass(INFINITE_GO_BACKWARD);
		createEAttribute(infiniteGoBackwardEClass, INFINITE_GO_BACKWARD__VALUE);

		nameRotateEClass = createEClass(NAME_ROTATE);
		createEAttribute(nameRotateEClass, NAME_ROTATE__VALUE);

		degreesRotateEClass = createEClass(DEGREES_ROTATE);
		createEAttribute(degreesRotateEClass, DEGREES_ROTATE__VALUE);

		randomRotateEClass = createEClass(RANDOM_ROTATE);
		createEAttribute(randomRotateEClass, RANDOM_ROTATE__VALUE);

		nameGoToEClass = createEClass(NAME_GO_TO);
		createEAttribute(nameGoToEClass, NAME_GO_TO__VALUE);

		xGoToEClass = createEClass(XGO_TO);
		createEAttribute(xGoToEClass, XGO_TO__VALUE);

		yGoToEClass = createEClass(YGO_TO);
		createEAttribute(yGoToEClass, YGO_TO__VALUE);

		nameReturnToBaseEClass = createEClass(NAME_RETURN_TO_BASE);
		createEAttribute(nameReturnToBaseEClass, NAME_RETURN_TO_BASE__VALUE);

		nameGrabEClass = createEClass(NAME_GRAB);
		createEAttribute(nameGrabEClass, NAME_GRAB__VALUE);

		nameReleaseEClass = createEClass(NAME_RELEASE);
		createEAttribute(nameReleaseEClass, NAME_RELEASE__VALUE);

		nameDelayEClass = createEClass(NAME_DELAY);
		createEAttribute(nameDelayEClass, NAME_DELAY__VALUE);

		msDelayEClass = createEClass(MS_DELAY);
		createEAttribute(msDelayEClass, MS_DELAY__VALUE);

		nameAvoidObstacleEClass = createEClass(NAME_AVOID_OBSTACLE);
		createEAttribute(nameAvoidObstacleEClass, NAME_AVOID_OBSTACLE__VALUE);

		nameReturnBottleToBaseEClass = createEClass(NAME_RETURN_BOTTLE_TO_BASE);
		createEAttribute(nameReturnBottleToBaseEClass, NAME_RETURN_BOTTLE_TO_BASE__VALUE);

		nameExploreForwardEClass = createEClass(NAME_EXPLORE_FORWARD);
		createEAttribute(nameExploreForwardEClass, NAME_EXPLORE_FORWARD__VALUE);

		nameTouchSensorEClass = createEClass(NAME_TOUCH_SENSOR);
		createEAttribute(nameTouchSensorEClass, NAME_TOUCH_SENSOR__VALUE);

		isPressedTouchSensorEClass = createEClass(IS_PRESSED_TOUCH_SENSOR);
		createEAttribute(isPressedTouchSensorEClass, IS_PRESSED_TOUCH_SENSOR__VALUE);

		nameUltrasonicSensorEClass = createEClass(NAME_ULTRASONIC_SENSOR);
		createEAttribute(nameUltrasonicSensorEClass, NAME_ULTRASONIC_SENSOR__VALUE);

		operatorUltrasonicSensorEClass = createEClass(OPERATOR_ULTRASONIC_SENSOR);
		createEAttribute(operatorUltrasonicSensorEClass, OPERATOR_ULTRASONIC_SENSOR__VALUE);

		valueUltrasonicSensorEClass = createEClass(VALUE_ULTRASONIC_SENSOR);
		createEAttribute(valueUltrasonicSensorEClass, VALUE_ULTRASONIC_SENSOR__VALUE);

		nameColorSensorEClass = createEClass(NAME_COLOR_SENSOR);
		createEAttribute(nameColorSensorEClass, NAME_COLOR_SENSOR__VALUE);

		colorColorSensorEClass = createEClass(COLOR_COLOR_SENSOR);
		createEAttribute(colorColorSensorEClass, COLOR_COLOR_SENSOR__VALUE);

		nameGoToEnemyEClass = createEClass(NAME_GO_TO_ENEMY);
		createEAttribute(nameGoToEnemyEClass, NAME_GO_TO_ENEMY__VALUE);

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

		// Create enums
		colorEEnum = createEEnum(COLOR);
		operatorKindEEnum = createEEnum(OPERATOR_KIND);
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
		mainEClass.getESuperTypes().add(this.getBindingElement());
		instructionEClass.getESuperTypes().add(this.getNamedElement());
		procedureEClass.getESuperTypes().add(this.getInstruction());
		procedureEClass.getESuperTypes().add(this.getBlockContainer());
		procedureEClass.getESuperTypes().add(this.getBindingElement());
		arbitratorEClass.getESuperTypes().add(this.getInstruction());
		arbitratorEClass.getESuperTypes().add(this.getConditionContainer());
		arbitratorEClass.getESuperTypes().add(this.getBindingElement());
		behaviorEClass.getESuperTypes().add(this.getNamedElement());
		behaviorEClass.getESuperTypes().add(this.getBlockContainer());
		behaviorEClass.getESuperTypes().add(this.getConditionContainer());
		behaviorEClass.getESuperTypes().add(this.getBindingElement());
		reuseInstructionEClass.getESuperTypes().add(this.getInstruction());
		reuseInstructionEClass.getESuperTypes().add(this.getBindingElement());
		blockEClass.getESuperTypes().add(this.getInstruction());
		actionEClass.getESuperTypes().add(this.getBlock());
		flowEClass.getESuperTypes().add(this.getBlock());
		flowEClass.getESuperTypes().add(this.getBlockContainer());
		flowEClass.getESuperTypes().add(this.getConditionContainer());
		sensorEClass.getESuperTypes().add(this.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getCondition());
		ifEClass.getESuperTypes().add(this.getFlow());
		ifEClass.getESuperTypes().add(this.getBindingElement());
		whileEClass.getESuperTypes().add(this.getFlow());
		whileEClass.getESuperTypes().add(this.getBindingElement());
		goForwardEClass.getESuperTypes().add(this.getAction());
		goForwardEClass.getESuperTypes().add(this.getBindingElement());
		goBackwardEClass.getESuperTypes().add(this.getAction());
		goBackwardEClass.getESuperTypes().add(this.getBindingElement());
		rotateEClass.getESuperTypes().add(this.getAction());
		rotateEClass.getESuperTypes().add(this.getBindingElement());
		goToEClass.getESuperTypes().add(this.getAction());
		goToEClass.getESuperTypes().add(this.getBindingElement());
		returnToBaseEClass.getESuperTypes().add(this.getAction());
		returnToBaseEClass.getESuperTypes().add(this.getBindingElement());
		grabEClass.getESuperTypes().add(this.getAction());
		grabEClass.getESuperTypes().add(this.getBindingElement());
		releaseEClass.getESuperTypes().add(this.getAction());
		releaseEClass.getESuperTypes().add(this.getBindingElement());
		delayEClass.getESuperTypes().add(this.getAction());
		delayEClass.getESuperTypes().add(this.getBindingElement());
		avoidObstacleEClass.getESuperTypes().add(this.getBehavior());
		avoidObstacleEClass.getESuperTypes().add(this.getBindingElement());
		returnBottleToBaseEClass.getESuperTypes().add(this.getBehavior());
		returnBottleToBaseEClass.getESuperTypes().add(this.getBindingElement());
		exploreForwardEClass.getESuperTypes().add(this.getBehavior());
		exploreForwardEClass.getESuperTypes().add(this.getBindingElement());
		touchSensorEClass.getESuperTypes().add(this.getSensor());
		touchSensorEClass.getESuperTypes().add(this.getBindingElement());
		ultrasonicSensorEClass.getESuperTypes().add(this.getSensor());
		ultrasonicSensorEClass.getESuperTypes().add(this.getBindingElement());
		colorSensorEClass.getESuperTypes().add(this.getSensor());
		colorSensorEClass.getESuperTypes().add(this.getBindingElement());
		goToEnemyEClass.getESuperTypes().add(this.getAction());
		goToEnemyEClass.getESuperTypes().add(this.getBindingElement());
		nameProcedureEClass.getESuperTypes().add(this.getBindingAttribute());
		nameArbitratorEClass.getESuperTypes().add(this.getBindingAttribute());
		nameBehaviorEClass.getESuperTypes().add(this.getBindingAttribute());
		nameReuseInstructionEClass.getESuperTypes().add(this.getBindingAttribute());
		nameIfEClass.getESuperTypes().add(this.getBindingAttribute());
		nameWhileEClass.getESuperTypes().add(this.getBindingAttribute());
		nameGoForwardEClass.getESuperTypes().add(this.getBindingAttribute());
		cmGoForwardEClass.getESuperTypes().add(this.getBindingAttribute());
		infiniteGoForwardEClass.getESuperTypes().add(this.getBindingAttribute());
		nameGoBackwardEClass.getESuperTypes().add(this.getBindingAttribute());
		cmGoBackwardEClass.getESuperTypes().add(this.getBindingAttribute());
		infiniteGoBackwardEClass.getESuperTypes().add(this.getBindingAttribute());
		nameRotateEClass.getESuperTypes().add(this.getBindingAttribute());
		degreesRotateEClass.getESuperTypes().add(this.getBindingAttribute());
		randomRotateEClass.getESuperTypes().add(this.getBindingAttribute());
		nameGoToEClass.getESuperTypes().add(this.getBindingAttribute());
		xGoToEClass.getESuperTypes().add(this.getBindingAttribute());
		yGoToEClass.getESuperTypes().add(this.getBindingAttribute());
		nameReturnToBaseEClass.getESuperTypes().add(this.getBindingAttribute());
		nameGrabEClass.getESuperTypes().add(this.getBindingAttribute());
		nameReleaseEClass.getESuperTypes().add(this.getBindingAttribute());
		nameDelayEClass.getESuperTypes().add(this.getBindingAttribute());
		msDelayEClass.getESuperTypes().add(this.getBindingAttribute());
		nameAvoidObstacleEClass.getESuperTypes().add(this.getBindingAttribute());
		nameReturnBottleToBaseEClass.getESuperTypes().add(this.getBindingAttribute());
		nameExploreForwardEClass.getESuperTypes().add(this.getBindingAttribute());
		nameTouchSensorEClass.getESuperTypes().add(this.getBindingAttribute());
		isPressedTouchSensorEClass.getESuperTypes().add(this.getBindingAttribute());
		nameUltrasonicSensorEClass.getESuperTypes().add(this.getBindingAttribute());
		operatorUltrasonicSensorEClass.getESuperTypes().add(this.getBindingAttribute());
		valueUltrasonicSensorEClass.getESuperTypes().add(this.getBindingAttribute());
		nameColorSensorEClass.getESuperTypes().add(this.getBindingAttribute());
		colorColorSensorEClass.getESuperTypes().add(this.getBindingAttribute());
		nameGoToEnemyEClass.getESuperTypes().add(this.getBindingAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_ContainsNoneElement(), this.getNoneElement(), null, "containsNoneElement", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_ContainsBindingElement(), this.getBindingElement(), null, "containsBindingElement", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_ContainsIntermediateElement(), this.getIntermediateElement(), null, "containsIntermediateElement", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_ContainsMetamodelElement(), this.getMetamodelElement(), null, "containsMetamodelElement", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_ContainsMetamodelElementFeature(), this.getMetamodelElementFeature(), null, "containsMetamodelElementFeature", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_ContainsBindingAttribute(), this.getBindingAttribute(), null, "containsBindingAttribute", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_ContainsVirtualAttribute(), this.getVirtualAttribute(), null, "containsVirtualAttribute", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMain_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockContainerEClass, BlockContainer.class, "BlockContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockContainer_Blocks(), this.getBlock(), null, "blocks", null, 0, -1, BlockContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcedure_ContainsnameProcedure(), this.getnameProcedure(), null, "containsnameProcedure", null, 0, -1, Procedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arbitratorEClass, Arbitrator.class, "Arbitrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArbitrator_Behaviors(), this.getBehavior(), null, "behaviors", null, 0, -1, Arbitrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArbitrator_Reuse(), this.getBehavior(), null, "reuse", null, 0, -1, Arbitrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArbitrator_ContainsnameArbitrator(), this.getnameArbitrator(), null, "containsnameArbitrator", null, 0, -1, Arbitrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_ContainsnameBehavior(), this.getnameBehavior(), null, "containsnameBehavior", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reuseInstructionEClass, ReuseInstruction.class, "ReuseInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReuseInstruction_Reuse(), this.getInstruction(), null, "reuse", null, 0, 1, ReuseInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReuseInstruction_ContainsnameReuseInstruction(), this.getnameReuseInstruction(), null, "containsnameReuseInstruction", null, 0, -1, ReuseInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_ContainsnameIf(), this.getnameIf(), null, "containsnameIf", null, 0, -1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhile_ContainsnameWhile(), this.getnameWhile(), null, "containsnameWhile", null, 0, -1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goForwardEClass, GoForward.class, "GoForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoForward_Cm(), ecorePackage.getEInt(), "cm", null, 0, 1, GoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoForward_Infinite(), ecorePackage.getEBoolean(), "infinite", null, 0, 1, GoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoForward_ContainsnameGoForward(), this.getnameGoForward(), null, "containsnameGoForward", null, 0, -1, GoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoForward_ContainscmGoForward(), this.getcmGoForward(), null, "containscmGoForward", null, 0, -1, GoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoForward_ContainsinfiniteGoForward(), this.getinfiniteGoForward(), null, "containsinfiniteGoForward", null, 0, -1, GoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goBackwardEClass, GoBackward.class, "GoBackward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoBackward_Cm(), ecorePackage.getEInt(), "cm", null, 0, 1, GoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoBackward_Infinite(), ecorePackage.getEBoolean(), "infinite", null, 0, 1, GoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoBackward_ContainsnameGoBackward(), this.getnameGoBackward(), null, "containsnameGoBackward", null, 0, -1, GoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoBackward_ContainscmGoBackward(), this.getcmGoBackward(), null, "containscmGoBackward", null, 0, -1, GoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoBackward_ContainsinfiniteGoBackward(), this.getinfiniteGoBackward(), null, "containsinfiniteGoBackward", null, 0, -1, GoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotate_Degrees(), ecorePackage.getEInt(), "degrees", null, 0, 1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotate_Random(), ecorePackage.getEBoolean(), "random", null, 0, 1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRotate_ContainsnameRotate(), this.getnameRotate(), null, "containsnameRotate", null, 0, -1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRotate_ContainsdegreesRotate(), this.getdegreesRotate(), null, "containsdegreesRotate", null, 0, -1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRotate_ContainsrandomRotate(), this.getrandomRotate(), null, "containsrandomRotate", null, 0, -1, Rotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goToEClass, GoTo.class, "GoTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoTo_X(), ecorePackage.getEInt(), "x", null, 0, 1, GoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoTo_Y(), ecorePackage.getEInt(), "y", null, 0, 1, GoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoTo_ContainsnameGoTo(), this.getnameGoTo(), null, "containsnameGoTo", null, 0, -1, GoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoTo_ContainsxGoTo(), this.getxGoTo(), null, "containsxGoTo", null, 0, -1, GoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoTo_ContainsyGoTo(), this.getyGoTo(), null, "containsyGoTo", null, 0, -1, GoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnToBaseEClass, ReturnToBase.class, "ReturnToBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnToBase_ContainsnameReturnToBase(), this.getnameReturnToBase(), null, "containsnameReturnToBase", null, 0, -1, ReturnToBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grabEClass, Grab.class, "Grab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrab_ContainsnameGrab(), this.getnameGrab(), null, "containsnameGrab", null, 0, -1, Grab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelease_ContainsnameRelease(), this.getnameRelease(), null, "containsnameRelease", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_Ms(), ecorePackage.getEInt(), "ms", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelay_ContainsnameDelay(), this.getnameDelay(), null, "containsnameDelay", null, 0, -1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelay_ContainsmsDelay(), this.getmsDelay(), null, "containsmsDelay", null, 0, -1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avoidObstacleEClass, AvoidObstacle.class, "AvoidObstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvoidObstacle_ContainsnameAvoidObstacle(), this.getnameAvoidObstacle(), null, "containsnameAvoidObstacle", null, 0, -1, AvoidObstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnBottleToBaseEClass, ReturnBottleToBase.class, "ReturnBottleToBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnBottleToBase_ContainsnameReturnBottleToBase(), this.getnameReturnBottleToBase(), null, "containsnameReturnBottleToBase", null, 0, -1, ReturnBottleToBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exploreForwardEClass, ExploreForward.class, "ExploreForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExploreForward_ContainsnameExploreForward(), this.getnameExploreForward(), null, "containsnameExploreForward", null, 0, -1, ExploreForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchSensorEClass, TouchSensor.class, "TouchSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchSensor_IsPressed(), ecorePackage.getEBoolean(), "isPressed", null, 0, 1, TouchSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchSensor_ContainsnameTouchSensor(), this.getnameTouchSensor(), null, "containsnameTouchSensor", null, 0, -1, TouchSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchSensor_ContainsisPressedTouchSensor(), this.getisPressedTouchSensor(), null, "containsisPressedTouchSensor", null, 0, -1, TouchSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ultrasonicSensorEClass, UltrasonicSensor.class, "UltrasonicSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUltrasonicSensor_Operator(), this.getOperatorKind(), "operator", null, 0, 1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUltrasonicSensor_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUltrasonicSensor_ContainsnameUltrasonicSensor(), this.getnameUltrasonicSensor(), null, "containsnameUltrasonicSensor", null, 0, -1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUltrasonicSensor_ContainsoperatorUltrasonicSensor(), this.getoperatorUltrasonicSensor(), null, "containsoperatorUltrasonicSensor", null, 0, -1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUltrasonicSensor_ContainsvalueUltrasonicSensor(), this.getvalueUltrasonicSensor(), null, "containsvalueUltrasonicSensor", null, 0, -1, UltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorSensorEClass, ColorSensor.class, "ColorSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorSensor_Color(), this.getColor(), "color", "NONE", 0, 1, ColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColorSensor_ContainsnameColorSensor(), this.getnameColorSensor(), null, "containsnameColorSensor", null, 0, -1, ColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColorSensor_ContainscolorColorSensor(), this.getcolorColorSensor(), null, "containscolorColorSensor", null, 0, -1, ColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionContainerEClass, ConditionContainer.class, "ConditionContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionContainer_Condition(), this.getCondition(), null, "condition", null, 0, 1, ConditionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goToEnemyEClass, GoToEnemy.class, "GoToEnemy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoToEnemy_ContainsnameGoToEnemy(), this.getnameGoToEnemy(), null, "containsnameGoToEnemy", null, 0, -1, GoToEnemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameProcedureEClass, nameProcedure.class, "nameProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameProcedure_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameProcedure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameArbitratorEClass, nameArbitrator.class, "nameArbitrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameArbitrator_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameArbitrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameBehaviorEClass, nameBehavior.class, "nameBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameBehavior_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameReuseInstructionEClass, nameReuseInstruction.class, "nameReuseInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameReuseInstruction_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameReuseInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameIfEClass, nameIf.class, "nameIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameIf_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameWhileEClass, nameWhile.class, "nameWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameWhile_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameGoForwardEClass, nameGoForward.class, "nameGoForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameGoForward_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameGoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmGoForwardEClass, cmGoForward.class, "cmGoForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcmGoForward_Value(), ecorePackage.getEInt(), "value", null, 0, 1, cmGoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infiniteGoForwardEClass, infiniteGoForward.class, "infiniteGoForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getinfiniteGoForward_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, infiniteGoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameGoBackwardEClass, nameGoBackward.class, "nameGoBackward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameGoBackward_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameGoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmGoBackwardEClass, cmGoBackward.class, "cmGoBackward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcmGoBackward_Value(), ecorePackage.getEInt(), "value", null, 0, 1, cmGoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infiniteGoBackwardEClass, infiniteGoBackward.class, "infiniteGoBackward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getinfiniteGoBackward_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, infiniteGoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameRotateEClass, nameRotate.class, "nameRotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameRotate_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameRotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(degreesRotateEClass, degreesRotate.class, "degreesRotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdegreesRotate_Value(), ecorePackage.getEInt(), "value", null, 0, 1, degreesRotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomRotateEClass, randomRotate.class, "randomRotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getrandomRotate_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, randomRotate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameGoToEClass, nameGoTo.class, "nameGoTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameGoTo_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameGoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xGoToEClass, xGoTo.class, "xGoTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getxGoTo_Value(), ecorePackage.getEInt(), "value", null, 0, 1, xGoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yGoToEClass, yGoTo.class, "yGoTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getyGoTo_Value(), ecorePackage.getEInt(), "value", null, 0, 1, yGoTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameReturnToBaseEClass, nameReturnToBase.class, "nameReturnToBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameReturnToBase_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameReturnToBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameGrabEClass, nameGrab.class, "nameGrab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameGrab_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameGrab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameReleaseEClass, nameRelease.class, "nameRelease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameRelease_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameRelease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameDelayEClass, nameDelay.class, "nameDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameDelay_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msDelayEClass, msDelay.class, "msDelay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmsDelay_Value(), ecorePackage.getEInt(), "value", null, 0, 1, msDelay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameAvoidObstacleEClass, nameAvoidObstacle.class, "nameAvoidObstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameAvoidObstacle_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameAvoidObstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameReturnBottleToBaseEClass, nameReturnBottleToBase.class, "nameReturnBottleToBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameReturnBottleToBase_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameReturnBottleToBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameExploreForwardEClass, nameExploreForward.class, "nameExploreForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameExploreForward_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameExploreForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameTouchSensorEClass, nameTouchSensor.class, "nameTouchSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameTouchSensor_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameTouchSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isPressedTouchSensorEClass, isPressedTouchSensor.class, "isPressedTouchSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getisPressedTouchSensor_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, isPressedTouchSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameUltrasonicSensorEClass, nameUltrasonicSensor.class, "nameUltrasonicSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameUltrasonicSensor_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameUltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorUltrasonicSensorEClass, operatorUltrasonicSensor.class, "operatorUltrasonicSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getoperatorUltrasonicSensor_Value(), this.getOperatorKind(), "value", null, 0, 1, operatorUltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueUltrasonicSensorEClass, valueUltrasonicSensor.class, "valueUltrasonicSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getvalueUltrasonicSensor_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, valueUltrasonicSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameColorSensorEClass, nameColorSensor.class, "nameColorSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameColorSensor_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorColorSensorEClass, colorColorSensor.class, "colorColorSensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcolorColorSensor_Value(), this.getColor(), "value", null, 0, 1, colorColorSensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameGoToEnemyEClass, nameGoToEnemy.class, "nameGoToEnemy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameGoToEnemy_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameGoToEnemy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.YELLOW);
		addEEnumLiteral(colorEEnum, Color.MAGENTA);
		addEEnumLiteral(colorEEnum, Color.ORANGE);
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.PINK);
		addEEnumLiteral(colorEEnum, Color.GRAY);
		addEEnumLiteral(colorEEnum, Color.LIGHT_GRAY);
		addEEnumLiteral(colorEEnum, Color.DARK_GRAY);
		addEEnumLiteral(colorEEnum, Color.CYAN);
		addEEnumLiteral(colorEEnum, Color.BROWN);
		addEEnumLiteral(colorEEnum, Color.NONE);

		initEEnum(operatorKindEEnum, OperatorKind.class, "OperatorKind");
		addEEnumLiteral(operatorKindEEnum, OperatorKind.EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.NOT_EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.UPPER_OR_EQUAL);
		addEEnumLiteral(operatorKindEEnum, OperatorKind.LOWER_OR_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //Mindstorms_bdslPackageImpl

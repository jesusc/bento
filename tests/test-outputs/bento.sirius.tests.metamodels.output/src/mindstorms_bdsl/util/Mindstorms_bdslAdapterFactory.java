/**
 */
package mindstorms_bdsl.util;

import mindstorms_bdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mindstorms_bdsl.Mindstorms_bdslPackage
 * @generated
 */
public class Mindstorms_bdslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mindstorms_bdslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mindstorms_bdslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Mindstorms_bdslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mindstorms_bdslSwitch<Adapter> modelSwitch =
		new Mindstorms_bdslSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseMain(Main object) {
				return createMainAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseBlockContainer(BlockContainer object) {
				return createBlockContainerAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseArbitrator(Arbitrator object) {
				return createArbitratorAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseReuseInstruction(ReuseInstruction object) {
				return createReuseInstructionAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseGoForward(GoForward object) {
				return createGoForwardAdapter();
			}
			@Override
			public Adapter caseGoBackward(GoBackward object) {
				return createGoBackwardAdapter();
			}
			@Override
			public Adapter caseRotate(Rotate object) {
				return createRotateAdapter();
			}
			@Override
			public Adapter caseGoTo(GoTo object) {
				return createGoToAdapter();
			}
			@Override
			public Adapter caseReturnToBase(ReturnToBase object) {
				return createReturnToBaseAdapter();
			}
			@Override
			public Adapter caseGrab(Grab object) {
				return createGrabAdapter();
			}
			@Override
			public Adapter caseRelease(Release object) {
				return createReleaseAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
			}
			@Override
			public Adapter caseAvoidObstacle(AvoidObstacle object) {
				return createAvoidObstacleAdapter();
			}
			@Override
			public Adapter caseReturnBottleToBase(ReturnBottleToBase object) {
				return createReturnBottleToBaseAdapter();
			}
			@Override
			public Adapter caseExploreForward(ExploreForward object) {
				return createExploreForwardAdapter();
			}
			@Override
			public Adapter caseTouchSensor(TouchSensor object) {
				return createTouchSensorAdapter();
			}
			@Override
			public Adapter caseUltrasonicSensor(UltrasonicSensor object) {
				return createUltrasonicSensorAdapter();
			}
			@Override
			public Adapter caseColorSensor(ColorSensor object) {
				return createColorSensorAdapter();
			}
			@Override
			public Adapter caseConditionContainer(ConditionContainer object) {
				return createConditionContainerAdapter();
			}
			@Override
			public Adapter caseGoToEnemy(GoToEnemy object) {
				return createGoToEnemyAdapter();
			}
			@Override
			public Adapter casenameProcedure(nameProcedure object) {
				return createnameProcedureAdapter();
			}
			@Override
			public Adapter casenameArbitrator(nameArbitrator object) {
				return createnameArbitratorAdapter();
			}
			@Override
			public Adapter casenameBehavior(nameBehavior object) {
				return createnameBehaviorAdapter();
			}
			@Override
			public Adapter casenameReuseInstruction(nameReuseInstruction object) {
				return createnameReuseInstructionAdapter();
			}
			@Override
			public Adapter casenameIf(nameIf object) {
				return createnameIfAdapter();
			}
			@Override
			public Adapter casenameWhile(nameWhile object) {
				return createnameWhileAdapter();
			}
			@Override
			public Adapter casenameGoForward(nameGoForward object) {
				return createnameGoForwardAdapter();
			}
			@Override
			public Adapter casecmGoForward(cmGoForward object) {
				return createcmGoForwardAdapter();
			}
			@Override
			public Adapter caseinfiniteGoForward(infiniteGoForward object) {
				return createinfiniteGoForwardAdapter();
			}
			@Override
			public Adapter casenameGoBackward(nameGoBackward object) {
				return createnameGoBackwardAdapter();
			}
			@Override
			public Adapter casecmGoBackward(cmGoBackward object) {
				return createcmGoBackwardAdapter();
			}
			@Override
			public Adapter caseinfiniteGoBackward(infiniteGoBackward object) {
				return createinfiniteGoBackwardAdapter();
			}
			@Override
			public Adapter casenameRotate(nameRotate object) {
				return createnameRotateAdapter();
			}
			@Override
			public Adapter casedegreesRotate(degreesRotate object) {
				return createdegreesRotateAdapter();
			}
			@Override
			public Adapter caserandomRotate(randomRotate object) {
				return createrandomRotateAdapter();
			}
			@Override
			public Adapter casenameGoTo(nameGoTo object) {
				return createnameGoToAdapter();
			}
			@Override
			public Adapter casexGoTo(xGoTo object) {
				return createxGoToAdapter();
			}
			@Override
			public Adapter caseyGoTo(yGoTo object) {
				return createyGoToAdapter();
			}
			@Override
			public Adapter casenameReturnToBase(nameReturnToBase object) {
				return createnameReturnToBaseAdapter();
			}
			@Override
			public Adapter casenameGrab(nameGrab object) {
				return createnameGrabAdapter();
			}
			@Override
			public Adapter casenameRelease(nameRelease object) {
				return createnameReleaseAdapter();
			}
			@Override
			public Adapter casenameDelay(nameDelay object) {
				return createnameDelayAdapter();
			}
			@Override
			public Adapter casemsDelay(msDelay object) {
				return createmsDelayAdapter();
			}
			@Override
			public Adapter casenameAvoidObstacle(nameAvoidObstacle object) {
				return createnameAvoidObstacleAdapter();
			}
			@Override
			public Adapter casenameReturnBottleToBase(nameReturnBottleToBase object) {
				return createnameReturnBottleToBaseAdapter();
			}
			@Override
			public Adapter casenameExploreForward(nameExploreForward object) {
				return createnameExploreForwardAdapter();
			}
			@Override
			public Adapter casenameTouchSensor(nameTouchSensor object) {
				return createnameTouchSensorAdapter();
			}
			@Override
			public Adapter caseisPressedTouchSensor(isPressedTouchSensor object) {
				return createisPressedTouchSensorAdapter();
			}
			@Override
			public Adapter casenameUltrasonicSensor(nameUltrasonicSensor object) {
				return createnameUltrasonicSensorAdapter();
			}
			@Override
			public Adapter caseoperatorUltrasonicSensor(operatorUltrasonicSensor object) {
				return createoperatorUltrasonicSensorAdapter();
			}
			@Override
			public Adapter casevalueUltrasonicSensor(valueUltrasonicSensor object) {
				return createvalueUltrasonicSensorAdapter();
			}
			@Override
			public Adapter casenameColorSensor(nameColorSensor object) {
				return createnameColorSensorAdapter();
			}
			@Override
			public Adapter casecolorColorSensor(colorColorSensor object) {
				return createcolorColorSensorAdapter();
			}
			@Override
			public Adapter casenameGoToEnemy(nameGoToEnemy object) {
				return createnameGoToEnemyAdapter();
			}
			@Override
			public Adapter caseNoneElement(NoneElement object) {
				return createNoneElementAdapter();
			}
			@Override
			public Adapter caseBindingElement(BindingElement object) {
				return createBindingElementAdapter();
			}
			@Override
			public Adapter caseIntermediateElement(IntermediateElement object) {
				return createIntermediateElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElement(MetamodelElement object) {
				return createMetamodelElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElementFeature(MetamodelElementFeature object) {
				return createMetamodelElementFeatureAdapter();
			}
			@Override
			public Adapter caseBindingAttribute(BindingAttribute object) {
				return createBindingAttributeAdapter();
			}
			@Override
			public Adapter caseVirtualAttribute(VirtualAttribute object) {
				return createVirtualAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Main
	 * @generated
	 */
	public Adapter createMainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.BlockContainer <em>Block Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.BlockContainer
	 * @generated
	 */
	public Adapter createBlockContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Arbitrator
	 * @generated
	 */
	public Adapter createArbitratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.ReuseInstruction <em>Reuse Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.ReuseInstruction
	 * @generated
	 */
	public Adapter createReuseInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.GoForward
	 * @generated
	 */
	public Adapter createGoForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.GoBackward <em>Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.GoBackward
	 * @generated
	 */
	public Adapter createGoBackwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.GoTo
	 * @generated
	 */
	public Adapter createGoToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.ReturnToBase <em>Return To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.ReturnToBase
	 * @generated
	 */
	public Adapter createReturnToBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Grab <em>Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Grab
	 * @generated
	 */
	public Adapter createGrabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Release
	 * @generated
	 */
	public Adapter createReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.AvoidObstacle <em>Avoid Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.AvoidObstacle
	 * @generated
	 */
	public Adapter createAvoidObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.ReturnBottleToBase <em>Return Bottle To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.ReturnBottleToBase
	 * @generated
	 */
	public Adapter createReturnBottleToBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.ExploreForward <em>Explore Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.ExploreForward
	 * @generated
	 */
	public Adapter createExploreForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.TouchSensor <em>Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.TouchSensor
	 * @generated
	 */
	public Adapter createTouchSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.UltrasonicSensor <em>Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.UltrasonicSensor
	 * @generated
	 */
	public Adapter createUltrasonicSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.ColorSensor
	 * @generated
	 */
	public Adapter createColorSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.ConditionContainer <em>Condition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.ConditionContainer
	 * @generated
	 */
	public Adapter createConditionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.GoToEnemy <em>Go To Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.GoToEnemy
	 * @generated
	 */
	public Adapter createGoToEnemyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameProcedure <em>name Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameProcedure
	 * @generated
	 */
	public Adapter createnameProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameArbitrator <em>name Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameArbitrator
	 * @generated
	 */
	public Adapter createnameArbitratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameBehavior <em>name Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameBehavior
	 * @generated
	 */
	public Adapter createnameBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameReuseInstruction <em>name Reuse Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameReuseInstruction
	 * @generated
	 */
	public Adapter createnameReuseInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameIf <em>name If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameIf
	 * @generated
	 */
	public Adapter createnameIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameWhile <em>name While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameWhile
	 * @generated
	 */
	public Adapter createnameWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameGoForward <em>name Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameGoForward
	 * @generated
	 */
	public Adapter createnameGoForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.cmGoForward <em>cm Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.cmGoForward
	 * @generated
	 */
	public Adapter createcmGoForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.infiniteGoForward <em>infinite Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.infiniteGoForward
	 * @generated
	 */
	public Adapter createinfiniteGoForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameGoBackward <em>name Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameGoBackward
	 * @generated
	 */
	public Adapter createnameGoBackwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.cmGoBackward <em>cm Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.cmGoBackward
	 * @generated
	 */
	public Adapter createcmGoBackwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.infiniteGoBackward <em>infinite Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.infiniteGoBackward
	 * @generated
	 */
	public Adapter createinfiniteGoBackwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameRotate <em>name Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameRotate
	 * @generated
	 */
	public Adapter createnameRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.degreesRotate <em>degrees Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.degreesRotate
	 * @generated
	 */
	public Adapter createdegreesRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.randomRotate <em>random Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.randomRotate
	 * @generated
	 */
	public Adapter createrandomRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameGoTo <em>name Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameGoTo
	 * @generated
	 */
	public Adapter createnameGoToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.xGoTo <em>xGo To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.xGoTo
	 * @generated
	 */
	public Adapter createxGoToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.yGoTo <em>yGo To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.yGoTo
	 * @generated
	 */
	public Adapter createyGoToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameReturnToBase <em>name Return To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameReturnToBase
	 * @generated
	 */
	public Adapter createnameReturnToBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameGrab <em>name Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameGrab
	 * @generated
	 */
	public Adapter createnameGrabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameRelease <em>name Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameRelease
	 * @generated
	 */
	public Adapter createnameReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameDelay <em>name Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameDelay
	 * @generated
	 */
	public Adapter createnameDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.msDelay <em>ms Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.msDelay
	 * @generated
	 */
	public Adapter createmsDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameAvoidObstacle <em>name Avoid Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameAvoidObstacle
	 * @generated
	 */
	public Adapter createnameAvoidObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameReturnBottleToBase <em>name Return Bottle To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameReturnBottleToBase
	 * @generated
	 */
	public Adapter createnameReturnBottleToBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameExploreForward <em>name Explore Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameExploreForward
	 * @generated
	 */
	public Adapter createnameExploreForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameTouchSensor <em>name Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameTouchSensor
	 * @generated
	 */
	public Adapter createnameTouchSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.isPressedTouchSensor <em>is Pressed Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.isPressedTouchSensor
	 * @generated
	 */
	public Adapter createisPressedTouchSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameUltrasonicSensor <em>name Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameUltrasonicSensor
	 * @generated
	 */
	public Adapter createnameUltrasonicSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.operatorUltrasonicSensor <em>operator Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.operatorUltrasonicSensor
	 * @generated
	 */
	public Adapter createoperatorUltrasonicSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.valueUltrasonicSensor <em>value Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.valueUltrasonicSensor
	 * @generated
	 */
	public Adapter createvalueUltrasonicSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameColorSensor <em>name Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameColorSensor
	 * @generated
	 */
	public Adapter createnameColorSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.colorColorSensor <em>color Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.colorColorSensor
	 * @generated
	 */
	public Adapter createcolorColorSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.nameGoToEnemy <em>name Go To Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.nameGoToEnemy
	 * @generated
	 */
	public Adapter createnameGoToEnemyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.NoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.NoneElement
	 * @generated
	 */
	public Adapter createNoneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.BindingElement
	 * @generated
	 */
	public Adapter createBindingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.IntermediateElement <em>Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.IntermediateElement
	 * @generated
	 */
	public Adapter createIntermediateElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.MetamodelElement
	 * @generated
	 */
	public Adapter createMetamodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.MetamodelElementFeature
	 * @generated
	 */
	public Adapter createMetamodelElementFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.BindingAttribute <em>Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.BindingAttribute
	 * @generated
	 */
	public Adapter createBindingAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mindstorms_bdsl.VirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mindstorms_bdsl.VirtualAttribute
	 * @generated
	 */
	public Adapter createVirtualAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Mindstorms_bdslAdapterFactory

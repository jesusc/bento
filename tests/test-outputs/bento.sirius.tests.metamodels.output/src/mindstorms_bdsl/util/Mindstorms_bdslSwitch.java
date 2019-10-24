/**
 */
package mindstorms_bdsl.util;

import mindstorms_bdsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see mindstorms_bdsl.Mindstorms_bdslPackage
 * @generated
 */
public class Mindstorms_bdslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mindstorms_bdslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mindstorms_bdslSwitch() {
		if (modelPackage == null) {
			modelPackage = Mindstorms_bdslPackage.eINSTANCE;
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
			case Mindstorms_bdslPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.MAIN: {
				Main main = (Main)theEObject;
				T result = caseMain(main);
				if (result == null) result = caseBindingElement(main);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = caseNamedElement(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.BLOCK_CONTAINER: {
				BlockContainer blockContainer = (BlockContainer)theEObject;
				T result = caseBlockContainer(blockContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseInstruction(procedure);
				if (result == null) result = caseBlockContainer(procedure);
				if (result == null) result = caseBindingElement(procedure);
				if (result == null) result = caseNamedElement(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.ARBITRATOR: {
				Arbitrator arbitrator = (Arbitrator)theEObject;
				T result = caseArbitrator(arbitrator);
				if (result == null) result = caseInstruction(arbitrator);
				if (result == null) result = caseConditionContainer(arbitrator);
				if (result == null) result = caseBindingElement(arbitrator);
				if (result == null) result = caseNamedElement(arbitrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseNamedElement(behavior);
				if (result == null) result = caseBlockContainer(behavior);
				if (result == null) result = caseConditionContainer(behavior);
				if (result == null) result = caseBindingElement(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION: {
				ReuseInstruction reuseInstruction = (ReuseInstruction)theEObject;
				T result = caseReuseInstruction(reuseInstruction);
				if (result == null) result = caseInstruction(reuseInstruction);
				if (result == null) result = caseBindingElement(reuseInstruction);
				if (result == null) result = caseNamedElement(reuseInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseInstruction(block);
				if (result == null) result = caseNamedElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseBlock(action);
				if (result == null) result = caseInstruction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseBlock(flow);
				if (result == null) result = caseBlockContainer(flow);
				if (result == null) result = caseConditionContainer(flow);
				if (result == null) result = caseInstruction(flow);
				if (result == null) result = caseNamedElement(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseNamedElement(sensor);
				if (result == null) result = caseCondition(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseFlow(if_);
				if (result == null) result = caseBindingElement(if_);
				if (result == null) result = caseBlock(if_);
				if (result == null) result = caseBlockContainer(if_);
				if (result == null) result = caseConditionContainer(if_);
				if (result == null) result = caseInstruction(if_);
				if (result == null) result = caseNamedElement(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseFlow(while_);
				if (result == null) result = caseBindingElement(while_);
				if (result == null) result = caseBlock(while_);
				if (result == null) result = caseBlockContainer(while_);
				if (result == null) result = caseConditionContainer(while_);
				if (result == null) result = caseInstruction(while_);
				if (result == null) result = caseNamedElement(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.GO_FORWARD: {
				GoForward goForward = (GoForward)theEObject;
				T result = caseGoForward(goForward);
				if (result == null) result = caseAction(goForward);
				if (result == null) result = caseBindingElement(goForward);
				if (result == null) result = caseBlock(goForward);
				if (result == null) result = caseInstruction(goForward);
				if (result == null) result = caseNamedElement(goForward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.GO_BACKWARD: {
				GoBackward goBackward = (GoBackward)theEObject;
				T result = caseGoBackward(goBackward);
				if (result == null) result = caseAction(goBackward);
				if (result == null) result = caseBindingElement(goBackward);
				if (result == null) result = caseBlock(goBackward);
				if (result == null) result = caseInstruction(goBackward);
				if (result == null) result = caseNamedElement(goBackward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.ROTATE: {
				Rotate rotate = (Rotate)theEObject;
				T result = caseRotate(rotate);
				if (result == null) result = caseAction(rotate);
				if (result == null) result = caseBindingElement(rotate);
				if (result == null) result = caseBlock(rotate);
				if (result == null) result = caseInstruction(rotate);
				if (result == null) result = caseNamedElement(rotate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.GO_TO: {
				GoTo goTo = (GoTo)theEObject;
				T result = caseGoTo(goTo);
				if (result == null) result = caseAction(goTo);
				if (result == null) result = caseBindingElement(goTo);
				if (result == null) result = caseBlock(goTo);
				if (result == null) result = caseInstruction(goTo);
				if (result == null) result = caseNamedElement(goTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.RETURN_TO_BASE: {
				ReturnToBase returnToBase = (ReturnToBase)theEObject;
				T result = caseReturnToBase(returnToBase);
				if (result == null) result = caseAction(returnToBase);
				if (result == null) result = caseBindingElement(returnToBase);
				if (result == null) result = caseBlock(returnToBase);
				if (result == null) result = caseInstruction(returnToBase);
				if (result == null) result = caseNamedElement(returnToBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.GRAB: {
				Grab grab = (Grab)theEObject;
				T result = caseGrab(grab);
				if (result == null) result = caseAction(grab);
				if (result == null) result = caseBindingElement(grab);
				if (result == null) result = caseBlock(grab);
				if (result == null) result = caseInstruction(grab);
				if (result == null) result = caseNamedElement(grab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.RELEASE: {
				Release release = (Release)theEObject;
				T result = caseRelease(release);
				if (result == null) result = caseAction(release);
				if (result == null) result = caseBindingElement(release);
				if (result == null) result = caseBlock(release);
				if (result == null) result = caseInstruction(release);
				if (result == null) result = caseNamedElement(release);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = caseAction(delay);
				if (result == null) result = caseBindingElement(delay);
				if (result == null) result = caseBlock(delay);
				if (result == null) result = caseInstruction(delay);
				if (result == null) result = caseNamedElement(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.AVOID_OBSTACLE: {
				AvoidObstacle avoidObstacle = (AvoidObstacle)theEObject;
				T result = caseAvoidObstacle(avoidObstacle);
				if (result == null) result = caseBehavior(avoidObstacle);
				if (result == null) result = caseNamedElement(avoidObstacle);
				if (result == null) result = caseBlockContainer(avoidObstacle);
				if (result == null) result = caseConditionContainer(avoidObstacle);
				if (result == null) result = caseBindingElement(avoidObstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.RETURN_BOTTLE_TO_BASE: {
				ReturnBottleToBase returnBottleToBase = (ReturnBottleToBase)theEObject;
				T result = caseReturnBottleToBase(returnBottleToBase);
				if (result == null) result = caseBehavior(returnBottleToBase);
				if (result == null) result = caseNamedElement(returnBottleToBase);
				if (result == null) result = caseBlockContainer(returnBottleToBase);
				if (result == null) result = caseConditionContainer(returnBottleToBase);
				if (result == null) result = caseBindingElement(returnBottleToBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.EXPLORE_FORWARD: {
				ExploreForward exploreForward = (ExploreForward)theEObject;
				T result = caseExploreForward(exploreForward);
				if (result == null) result = caseBehavior(exploreForward);
				if (result == null) result = caseNamedElement(exploreForward);
				if (result == null) result = caseBlockContainer(exploreForward);
				if (result == null) result = caseConditionContainer(exploreForward);
				if (result == null) result = caseBindingElement(exploreForward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.TOUCH_SENSOR: {
				TouchSensor touchSensor = (TouchSensor)theEObject;
				T result = caseTouchSensor(touchSensor);
				if (result == null) result = caseSensor(touchSensor);
				if (result == null) result = caseBindingElement(touchSensor);
				if (result == null) result = caseNamedElement(touchSensor);
				if (result == null) result = caseCondition(touchSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.ULTRASONIC_SENSOR: {
				UltrasonicSensor ultrasonicSensor = (UltrasonicSensor)theEObject;
				T result = caseUltrasonicSensor(ultrasonicSensor);
				if (result == null) result = caseSensor(ultrasonicSensor);
				if (result == null) result = caseBindingElement(ultrasonicSensor);
				if (result == null) result = caseNamedElement(ultrasonicSensor);
				if (result == null) result = caseCondition(ultrasonicSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.COLOR_SENSOR: {
				ColorSensor colorSensor = (ColorSensor)theEObject;
				T result = caseColorSensor(colorSensor);
				if (result == null) result = caseSensor(colorSensor);
				if (result == null) result = caseBindingElement(colorSensor);
				if (result == null) result = caseNamedElement(colorSensor);
				if (result == null) result = caseCondition(colorSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.CONDITION_CONTAINER: {
				ConditionContainer conditionContainer = (ConditionContainer)theEObject;
				T result = caseConditionContainer(conditionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.GO_TO_ENEMY: {
				GoToEnemy goToEnemy = (GoToEnemy)theEObject;
				T result = caseGoToEnemy(goToEnemy);
				if (result == null) result = caseAction(goToEnemy);
				if (result == null) result = caseBindingElement(goToEnemy);
				if (result == null) result = caseBlock(goToEnemy);
				if (result == null) result = caseInstruction(goToEnemy);
				if (result == null) result = caseNamedElement(goToEnemy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_PROCEDURE: {
				nameProcedure nameProcedure = (nameProcedure)theEObject;
				T result = casenameProcedure(nameProcedure);
				if (result == null) result = caseBindingAttribute(nameProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_ARBITRATOR: {
				nameArbitrator nameArbitrator = (nameArbitrator)theEObject;
				T result = casenameArbitrator(nameArbitrator);
				if (result == null) result = caseBindingAttribute(nameArbitrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_BEHAVIOR: {
				nameBehavior nameBehavior = (nameBehavior)theEObject;
				T result = casenameBehavior(nameBehavior);
				if (result == null) result = caseBindingAttribute(nameBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_REUSE_INSTRUCTION: {
				nameReuseInstruction nameReuseInstruction = (nameReuseInstruction)theEObject;
				T result = casenameReuseInstruction(nameReuseInstruction);
				if (result == null) result = caseBindingAttribute(nameReuseInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_IF: {
				nameIf nameIf = (nameIf)theEObject;
				T result = casenameIf(nameIf);
				if (result == null) result = caseBindingAttribute(nameIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_WHILE: {
				nameWhile nameWhile = (nameWhile)theEObject;
				T result = casenameWhile(nameWhile);
				if (result == null) result = caseBindingAttribute(nameWhile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_GO_FORWARD: {
				nameGoForward nameGoForward = (nameGoForward)theEObject;
				T result = casenameGoForward(nameGoForward);
				if (result == null) result = caseBindingAttribute(nameGoForward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.CM_GO_FORWARD: {
				cmGoForward cmGoForward = (cmGoForward)theEObject;
				T result = casecmGoForward(cmGoForward);
				if (result == null) result = caseBindingAttribute(cmGoForward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.INFINITE_GO_FORWARD: {
				infiniteGoForward infiniteGoForward = (infiniteGoForward)theEObject;
				T result = caseinfiniteGoForward(infiniteGoForward);
				if (result == null) result = caseBindingAttribute(infiniteGoForward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_GO_BACKWARD: {
				nameGoBackward nameGoBackward = (nameGoBackward)theEObject;
				T result = casenameGoBackward(nameGoBackward);
				if (result == null) result = caseBindingAttribute(nameGoBackward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.CM_GO_BACKWARD: {
				cmGoBackward cmGoBackward = (cmGoBackward)theEObject;
				T result = casecmGoBackward(cmGoBackward);
				if (result == null) result = caseBindingAttribute(cmGoBackward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.INFINITE_GO_BACKWARD: {
				infiniteGoBackward infiniteGoBackward = (infiniteGoBackward)theEObject;
				T result = caseinfiniteGoBackward(infiniteGoBackward);
				if (result == null) result = caseBindingAttribute(infiniteGoBackward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_ROTATE: {
				nameRotate nameRotate = (nameRotate)theEObject;
				T result = casenameRotate(nameRotate);
				if (result == null) result = caseBindingAttribute(nameRotate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.DEGREES_ROTATE: {
				degreesRotate degreesRotate = (degreesRotate)theEObject;
				T result = casedegreesRotate(degreesRotate);
				if (result == null) result = caseBindingAttribute(degreesRotate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.RANDOM_ROTATE: {
				randomRotate randomRotate = (randomRotate)theEObject;
				T result = caserandomRotate(randomRotate);
				if (result == null) result = caseBindingAttribute(randomRotate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_GO_TO: {
				nameGoTo nameGoTo = (nameGoTo)theEObject;
				T result = casenameGoTo(nameGoTo);
				if (result == null) result = caseBindingAttribute(nameGoTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.XGO_TO: {
				xGoTo xGoTo = (xGoTo)theEObject;
				T result = casexGoTo(xGoTo);
				if (result == null) result = caseBindingAttribute(xGoTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.YGO_TO: {
				yGoTo yGoTo = (yGoTo)theEObject;
				T result = caseyGoTo(yGoTo);
				if (result == null) result = caseBindingAttribute(yGoTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_RETURN_TO_BASE: {
				nameReturnToBase nameReturnToBase = (nameReturnToBase)theEObject;
				T result = casenameReturnToBase(nameReturnToBase);
				if (result == null) result = caseBindingAttribute(nameReturnToBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_GRAB: {
				nameGrab nameGrab = (nameGrab)theEObject;
				T result = casenameGrab(nameGrab);
				if (result == null) result = caseBindingAttribute(nameGrab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_RELEASE: {
				nameRelease nameRelease = (nameRelease)theEObject;
				T result = casenameRelease(nameRelease);
				if (result == null) result = caseBindingAttribute(nameRelease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_DELAY: {
				nameDelay nameDelay = (nameDelay)theEObject;
				T result = casenameDelay(nameDelay);
				if (result == null) result = caseBindingAttribute(nameDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.MS_DELAY: {
				msDelay msDelay = (msDelay)theEObject;
				T result = casemsDelay(msDelay);
				if (result == null) result = caseBindingAttribute(msDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_AVOID_OBSTACLE: {
				nameAvoidObstacle nameAvoidObstacle = (nameAvoidObstacle)theEObject;
				T result = casenameAvoidObstacle(nameAvoidObstacle);
				if (result == null) result = caseBindingAttribute(nameAvoidObstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_RETURN_BOTTLE_TO_BASE: {
				nameReturnBottleToBase nameReturnBottleToBase = (nameReturnBottleToBase)theEObject;
				T result = casenameReturnBottleToBase(nameReturnBottleToBase);
				if (result == null) result = caseBindingAttribute(nameReturnBottleToBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_EXPLORE_FORWARD: {
				nameExploreForward nameExploreForward = (nameExploreForward)theEObject;
				T result = casenameExploreForward(nameExploreForward);
				if (result == null) result = caseBindingAttribute(nameExploreForward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_TOUCH_SENSOR: {
				nameTouchSensor nameTouchSensor = (nameTouchSensor)theEObject;
				T result = casenameTouchSensor(nameTouchSensor);
				if (result == null) result = caseBindingAttribute(nameTouchSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.IS_PRESSED_TOUCH_SENSOR: {
				isPressedTouchSensor isPressedTouchSensor = (isPressedTouchSensor)theEObject;
				T result = caseisPressedTouchSensor(isPressedTouchSensor);
				if (result == null) result = caseBindingAttribute(isPressedTouchSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_ULTRASONIC_SENSOR: {
				nameUltrasonicSensor nameUltrasonicSensor = (nameUltrasonicSensor)theEObject;
				T result = casenameUltrasonicSensor(nameUltrasonicSensor);
				if (result == null) result = caseBindingAttribute(nameUltrasonicSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.OPERATOR_ULTRASONIC_SENSOR: {
				operatorUltrasonicSensor operatorUltrasonicSensor = (operatorUltrasonicSensor)theEObject;
				T result = caseoperatorUltrasonicSensor(operatorUltrasonicSensor);
				if (result == null) result = caseBindingAttribute(operatorUltrasonicSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.VALUE_ULTRASONIC_SENSOR: {
				valueUltrasonicSensor valueUltrasonicSensor = (valueUltrasonicSensor)theEObject;
				T result = casevalueUltrasonicSensor(valueUltrasonicSensor);
				if (result == null) result = caseBindingAttribute(valueUltrasonicSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_COLOR_SENSOR: {
				nameColorSensor nameColorSensor = (nameColorSensor)theEObject;
				T result = casenameColorSensor(nameColorSensor);
				if (result == null) result = caseBindingAttribute(nameColorSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.COLOR_COLOR_SENSOR: {
				colorColorSensor colorColorSensor = (colorColorSensor)theEObject;
				T result = casecolorColorSensor(colorColorSensor);
				if (result == null) result = caseBindingAttribute(colorColorSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NAME_GO_TO_ENEMY: {
				nameGoToEnemy nameGoToEnemy = (nameGoToEnemy)theEObject;
				T result = casenameGoToEnemy(nameGoToEnemy);
				if (result == null) result = caseBindingAttribute(nameGoToEnemy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.NONE_ELEMENT: {
				NoneElement noneElement = (NoneElement)theEObject;
				T result = caseNoneElement(noneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.BINDING_ELEMENT: {
				BindingElement bindingElement = (BindingElement)theEObject;
				T result = caseBindingElement(bindingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.INTERMEDIATE_ELEMENT: {
				IntermediateElement intermediateElement = (IntermediateElement)theEObject;
				T result = caseIntermediateElement(intermediateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.METAMODEL_ELEMENT: {
				MetamodelElement metamodelElement = (MetamodelElement)theEObject;
				T result = caseMetamodelElement(metamodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.METAMODEL_ELEMENT_FEATURE: {
				MetamodelElementFeature metamodelElementFeature = (MetamodelElementFeature)theEObject;
				T result = caseMetamodelElementFeature(metamodelElementFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.BINDING_ATTRIBUTE: {
				BindingAttribute bindingAttribute = (BindingAttribute)theEObject;
				T result = caseBindingAttribute(bindingAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mindstorms_bdslPackage.VIRTUAL_ATTRIBUTE: {
				VirtualAttribute virtualAttribute = (VirtualAttribute)theEObject;
				T result = caseVirtualAttribute(virtualAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMain(Main object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockContainer(BlockContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitrator(Arbitrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reuse Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reuse Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReuseInstruction(ReuseInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoForward(GoForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoBackward(GoBackward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotate(Rotate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoTo(GoTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return To Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return To Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnToBase(ReturnToBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrab(Grab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avoid Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avoid Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvoidObstacle(AvoidObstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Bottle To Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Bottle To Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnBottleToBase(ReturnBottleToBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explore Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explore Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExploreForward(ExploreForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchSensor(TouchSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ultrasonic Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUltrasonicSensor(UltrasonicSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorSensor(ColorSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionContainer(ConditionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go To Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go To Enemy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoToEnemy(GoToEnemy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameProcedure(nameProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Arbitrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Arbitrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameArbitrator(nameArbitrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameBehavior(nameBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Reuse Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Reuse Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameReuseInstruction(nameReuseInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameIf(nameIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameWhile(nameWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Go Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameGoForward(nameGoForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>cm Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>cm Go Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecmGoForward(cmGoForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>infinite Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>infinite Go Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinfiniteGoForward(infiniteGoForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Go Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameGoBackward(nameGoBackward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>cm Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>cm Go Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecmGoBackward(cmGoBackward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>infinite Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>infinite Go Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinfiniteGoBackward(infiniteGoBackward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameRotate(nameRotate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>degrees Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>degrees Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedegreesRotate(degreesRotate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>random Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>random Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserandomRotate(randomRotate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Go To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Go To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameGoTo(nameGoTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xGo To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xGo To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexGoTo(xGoTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>yGo To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>yGo To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseyGoTo(yGoTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Return To Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Return To Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameReturnToBase(nameReturnToBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Grab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Grab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameGrab(nameGrab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameRelease(nameRelease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameDelay(nameDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ms Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ms Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemsDelay(msDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Avoid Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Avoid Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameAvoidObstacle(nameAvoidObstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Return Bottle To Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Return Bottle To Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameReturnBottleToBase(nameReturnBottleToBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Explore Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Explore Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameExploreForward(nameExploreForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Touch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Touch Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameTouchSensor(nameTouchSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is Pressed Touch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is Pressed Touch Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisPressedTouchSensor(isPressedTouchSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Ultrasonic Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameUltrasonicSensor(nameUltrasonicSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>operator Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>operator Ultrasonic Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoperatorUltrasonicSensor(operatorUltrasonicSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>value Ultrasonic Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>value Ultrasonic Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalueUltrasonicSensor(valueUltrasonicSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Color Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameColorSensor(nameColorSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>color Color Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>color Color Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecolorColorSensor(colorColorSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Go To Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Go To Enemy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameGoToEnemy(nameGoToEnemy object) {
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

} //Mindstorms_bdslSwitch

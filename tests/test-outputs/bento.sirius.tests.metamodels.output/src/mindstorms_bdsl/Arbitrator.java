/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.Arbitrator#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link mindstorms_bdsl.Arbitrator#getReuse <em>Reuse</em>}</li>
 *   <li>{@link mindstorms_bdsl.Arbitrator#getContainsnameArbitrator <em>Containsname Arbitrator</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getArbitrator()
 * @model
 * @generated
 */
public interface Arbitrator extends Instruction, ConditionContainer, BindingElement {
	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getArbitrator_Behaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Reuse</b></em>' reference list.
	 * The list contents are of type {@link mindstorms_bdsl.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reuse</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuse</em>' reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getArbitrator_Reuse()
	 * @model
	 * @generated
	 */
	EList<Behavior> getReuse();

	/**
	 * Returns the value of the '<em><b>Containsname Arbitrator</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameArbitrator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Arbitrator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Arbitrator</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getArbitrator_ContainsnameArbitrator()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameArbitrator> getContainsnameArbitrator();

} // Arbitrator

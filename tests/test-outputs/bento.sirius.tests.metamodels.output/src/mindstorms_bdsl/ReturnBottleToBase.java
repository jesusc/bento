/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Bottle To Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.ReturnBottleToBase#getContainsnameReturnBottleToBase <em>Containsname Return Bottle To Base</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getReturnBottleToBase()
 * @model
 * @generated
 */
public interface ReturnBottleToBase extends Behavior, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Return Bottle To Base</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameReturnBottleToBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Return Bottle To Base</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Return Bottle To Base</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getReturnBottleToBase_ContainsnameReturnBottleToBase()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameReturnBottleToBase> getContainsnameReturnBottleToBase();

} // ReturnBottleToBase

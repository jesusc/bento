/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.Behavior#getContainsnameBehavior <em>Containsname Behavior</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends NamedElement, BlockContainer, ConditionContainer, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Behavior</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getBehavior_ContainsnameBehavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameBehavior> getContainsnameBehavior();

} // Behavior

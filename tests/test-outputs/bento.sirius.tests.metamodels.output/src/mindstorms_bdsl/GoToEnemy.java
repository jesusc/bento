/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go To Enemy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.GoToEnemy#getContainsnameGoToEnemy <em>Containsname Go To Enemy</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoToEnemy()
 * @model
 * @generated
 */
public interface GoToEnemy extends Action, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Go To Enemy</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameGoToEnemy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Go To Enemy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Go To Enemy</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoToEnemy_ContainsnameGoToEnemy()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameGoToEnemy> getContainsnameGoToEnemy();

} // GoToEnemy

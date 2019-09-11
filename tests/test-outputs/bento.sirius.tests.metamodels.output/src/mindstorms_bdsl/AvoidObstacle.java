/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avoid Obstacle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.AvoidObstacle#getContainsnameAvoidObstacle <em>Containsname Avoid Obstacle</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getAvoidObstacle()
 * @model
 * @generated
 */
public interface AvoidObstacle extends Behavior, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Avoid Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameAvoidObstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Avoid Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Avoid Obstacle</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getAvoidObstacle_ContainsnameAvoidObstacle()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameAvoidObstacle> getContainsnameAvoidObstacle();

} // AvoidObstacle

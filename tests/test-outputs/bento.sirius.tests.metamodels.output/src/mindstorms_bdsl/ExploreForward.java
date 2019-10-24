/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explore Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.ExploreForward#getContainsnameExploreForward <em>Containsname Explore Forward</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getExploreForward()
 * @model
 * @generated
 */
public interface ExploreForward extends Behavior, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Explore Forward</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameExploreForward}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Explore Forward</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Explore Forward</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getExploreForward_ContainsnameExploreForward()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameExploreForward> getContainsnameExploreForward();

} // ExploreForward

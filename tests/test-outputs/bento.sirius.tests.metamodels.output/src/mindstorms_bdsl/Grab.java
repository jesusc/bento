/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.Grab#getContainsnameGrab <em>Containsname Grab</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGrab()
 * @model
 * @generated
 */
public interface Grab extends Action, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Grab</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameGrab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Grab</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Grab</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGrab_ContainsnameGrab()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameGrab> getContainsnameGrab();

} // Grab

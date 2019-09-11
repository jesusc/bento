/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.Release#getContainsnameRelease <em>Containsname Release</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getRelease()
 * @model
 * @generated
 */
public interface Release extends Action, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Release</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameRelease}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Release</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Release</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getRelease_ContainsnameRelease()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameRelease> getContainsnameRelease();

} // Release

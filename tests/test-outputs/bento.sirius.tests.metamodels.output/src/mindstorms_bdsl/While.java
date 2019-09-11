/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.While#getContainsnameWhile <em>Containsname While</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Flow, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname While</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameWhile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname While</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname While</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getWhile_ContainsnameWhile()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameWhile> getContainsnameWhile();

} // While

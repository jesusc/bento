/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.If#getContainsnameIf <em>Containsname If</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Flow, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname If</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameIf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname If</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname If</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getIf_ContainsnameIf()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameIf> getContainsnameIf();

} // If

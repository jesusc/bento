/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.Procedure#getContainsnameProcedure <em>Containsname Procedure</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends Instruction, BlockContainer, BindingElement {
	/**
	 * Returns the value of the '<em><b>Containsname Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Procedure</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getProcedure_ContainsnameProcedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameProcedure> getContainsnameProcedure();

} // Procedure

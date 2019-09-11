/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reuse Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.ReuseInstruction#getReuse <em>Reuse</em>}</li>
 *   <li>{@link mindstorms_bdsl.ReuseInstruction#getContainsnameReuseInstruction <em>Containsname Reuse Instruction</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getReuseInstruction()
 * @model
 * @generated
 */
public interface ReuseInstruction extends Instruction, BindingElement {
	/**
	 * Returns the value of the '<em><b>Reuse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reuse</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuse</em>' reference.
	 * @see #setReuse(Instruction)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getReuseInstruction_Reuse()
	 * @model
	 * @generated
	 */
	Instruction getReuse();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.ReuseInstruction#getReuse <em>Reuse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reuse</em>' reference.
	 * @see #getReuse()
	 * @generated
	 */
	void setReuse(Instruction value);

	/**
	 * Returns the value of the '<em><b>Containsname Reuse Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameReuseInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Reuse Instruction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Reuse Instruction</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getReuseInstruction_ContainsnameReuseInstruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameReuseInstruction> getContainsnameReuseInstruction();

} // ReuseInstruction

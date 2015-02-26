/**
 */
package bento.language.bentocomp.flowcontrol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.flowcontrol.Xor#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getXor()
 * @model
 * @generated
 */
public interface Xor extends CompositionStep {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.flowcontrol.XorCond}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getXor_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<XorCond> getConditions();

} // Xor

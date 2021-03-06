/**
 */
package bento.language.bentocomp.flowcontrol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.flowcontrol.Seq#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getSeq()
 * @model
 * @generated
 */
public interface Seq extends CompositionStep {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.flowcontrol.CompositionStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getSeq_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionStep> getSteps();

} // Seq

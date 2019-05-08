/**
 */
package bento.language.bentocomp.flowcontrol;

import bento.language.bentocomp.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.flowcontrol.Composition#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(CompositionStep)
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getComposition_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompositionStep getStep();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.Composition#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(CompositionStep value);

} // Composition

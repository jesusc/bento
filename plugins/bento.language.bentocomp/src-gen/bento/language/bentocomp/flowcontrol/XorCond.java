/**
 */
package bento.language.bentocomp.flowcontrol;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xor Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.flowcontrol.XorCond#getValue <em>Value</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.XorCond#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getXorCond()
 * @model
 * @generated
 */
public interface XorCond extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(BooleanValue)
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getXorCond_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanValue getValue();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.XorCond#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BooleanValue value);

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
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getXorCond_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompositionStep getStep();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.XorCond#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(CompositionStep value);

} // XorCond

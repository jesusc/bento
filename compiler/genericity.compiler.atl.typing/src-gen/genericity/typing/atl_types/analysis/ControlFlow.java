/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.analysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.analysis.ControlFlow#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getControlFlow()
 * @model
 * @generated
 */
public interface ControlFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(BasicBlock)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getControlFlow_Start()
	 * @model required="true"
	 * @generated
	 */
	BasicBlock getStart();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.ControlFlow#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(BasicBlock value);

} // ControlFlow

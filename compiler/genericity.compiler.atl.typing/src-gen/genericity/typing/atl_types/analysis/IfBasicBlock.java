/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Basic Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.analysis.IfBasicBlock#getThen <em>Then</em>}</li>
 *   <li>{@link genericity.typing.atl_types.analysis.IfBasicBlock#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getIfBasicBlock()
 * @model
 * @generated
 */
public interface IfBasicBlock extends BasicBlock {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' reference.
	 * @see #setThen(BasicBlock)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getIfBasicBlock_Then()
	 * @model required="true"
	 * @generated
	 */
	BasicBlock getThen();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.IfBasicBlock#getThen <em>Then</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(BasicBlock value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(BasicBlock)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getIfBasicBlock_Else()
	 * @model required="true"
	 * @generated
	 */
	BasicBlock getElse();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.IfBasicBlock#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(BasicBlock value);

} // IfBasicBlock

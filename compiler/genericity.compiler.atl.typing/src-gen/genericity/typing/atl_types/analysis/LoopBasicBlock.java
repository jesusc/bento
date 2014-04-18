/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.analysis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Basic Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.analysis.LoopBasicBlock#getBody <em>Body</em>}</li>
 *   <li>{@link genericity.typing.atl_types.analysis.LoopBasicBlock#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getLoopBasicBlock()
 * @model
 * @generated
 */
public interface LoopBasicBlock extends BasicBlock {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(BasicBlock)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getLoopBasicBlock_Body()
	 * @model
	 * @generated
	 */
	BasicBlock getBody();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.LoopBasicBlock#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BasicBlock value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(BasicBlock)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getLoopBasicBlock_Next()
	 * @model
	 * @generated
	 */
	BasicBlock getNext();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.LoopBasicBlock#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(BasicBlock value);

} // LoopBasicBlock

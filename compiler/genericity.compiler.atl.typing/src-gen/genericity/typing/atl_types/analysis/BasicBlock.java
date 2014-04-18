/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.analysis;

import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.analysis.BasicBlock#getExpr <em>Expr</em>}</li>
 *   <li>{@link genericity.typing.atl_types.analysis.BasicBlock#getCfNext <em>Cf Next</em>}</li>
 *   <li>{@link genericity.typing.atl_types.analysis.BasicBlock#getCfPrev <em>Cf Prev</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getBasicBlock()
 * @model abstract="true"
 * @generated
 */
public interface BasicBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' reference.
	 * @see #setExpr(ExpressionAnnotation)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getBasicBlock_Expr()
	 * @model required="true"
	 * @generated
	 */
	ExpressionAnnotation getExpr();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.BasicBlock#getExpr <em>Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(ExpressionAnnotation value);

	/**
	 * Returns the value of the '<em><b>Cf Next</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.analysis.BasicBlock}.
	 * It is bidirectional and its opposite is '{@link genericity.typing.atl_types.analysis.BasicBlock#getCfPrev <em>Cf Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cf Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cf Next</em>' reference list.
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getBasicBlock_CfNext()
	 * @see genericity.typing.atl_types.analysis.BasicBlock#getCfPrev
	 * @model opposite="cfPrev"
	 * @generated
	 */
	EList<BasicBlock> getCfNext();

	/**
	 * Returns the value of the '<em><b>Cf Prev</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link genericity.typing.atl_types.analysis.BasicBlock#getCfNext <em>Cf Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cf Prev</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cf Prev</em>' reference.
	 * @see #setCfPrev(BasicBlock)
	 * @see genericity.typing.atl_types.analysis.AnalysisPackage#getBasicBlock_CfPrev()
	 * @see genericity.typing.atl_types.analysis.BasicBlock#getCfNext
	 * @model opposite="cfNext" required="true"
	 * @generated
	 */
	BasicBlock getCfPrev();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.analysis.BasicBlock#getCfPrev <em>Cf Prev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cf Prev</em>' reference.
	 * @see #getCfPrev()
	 * @generated
	 */
	void setCfPrev(BasicBlock value);

} // BasicBlock

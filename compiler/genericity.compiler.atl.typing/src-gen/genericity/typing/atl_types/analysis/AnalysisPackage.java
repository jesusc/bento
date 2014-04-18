/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.analysis;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see genericity.typing.atl_types.analysis.AnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/types/atl/analysis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl_types_analysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisPackage eINSTANCE = genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.analysis.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.analysis.impl.ControlFlowImpl
	 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__START = 0;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.analysis.impl.BasicBlockImpl <em>Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.analysis.impl.BasicBlockImpl
	 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getBasicBlock()
	 * @generated
	 */
	int BASIC_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__EXPR = 0;

	/**
	 * The feature id for the '<em><b>Cf Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__CF_NEXT = 1;

	/**
	 * The feature id for the '<em><b>Cf Prev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__CF_PREV = 2;

	/**
	 * The number of structural features of the '<em>Basic Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.analysis.impl.NavigationBasicBlockImpl <em>Navigation Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.analysis.impl.NavigationBasicBlockImpl
	 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getNavigationBasicBlock()
	 * @generated
	 */
	int NAVIGATION_BASIC_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_BASIC_BLOCK__EXPR = BASIC_BLOCK__EXPR;

	/**
	 * The feature id for the '<em><b>Cf Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_BASIC_BLOCK__CF_NEXT = BASIC_BLOCK__CF_NEXT;

	/**
	 * The feature id for the '<em><b>Cf Prev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_BASIC_BLOCK__CF_PREV = BASIC_BLOCK__CF_PREV;

	/**
	 * The feature id for the '<em><b>Subexpr Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_BASIC_BLOCK__SUBEXPR_START = BASIC_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subexpr End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_BASIC_BLOCK__SUBEXPR_END = BASIC_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Navigation Basic Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_BASIC_BLOCK_FEATURE_COUNT = BASIC_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.analysis.impl.LoopBasicBlockImpl <em>Loop Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.analysis.impl.LoopBasicBlockImpl
	 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getLoopBasicBlock()
	 * @generated
	 */
	int LOOP_BASIC_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BASIC_BLOCK__EXPR = BASIC_BLOCK__EXPR;

	/**
	 * The feature id for the '<em><b>Cf Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BASIC_BLOCK__CF_NEXT = BASIC_BLOCK__CF_NEXT;

	/**
	 * The feature id for the '<em><b>Cf Prev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BASIC_BLOCK__CF_PREV = BASIC_BLOCK__CF_PREV;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BASIC_BLOCK__BODY = BASIC_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BASIC_BLOCK__NEXT = BASIC_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Basic Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_BASIC_BLOCK_FEATURE_COUNT = BASIC_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.analysis.impl.IfBasicBlockImpl <em>If Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.analysis.impl.IfBasicBlockImpl
	 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getIfBasicBlock()
	 * @generated
	 */
	int IF_BASIC_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BASIC_BLOCK__EXPR = BASIC_BLOCK__EXPR;

	/**
	 * The feature id for the '<em><b>Cf Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BASIC_BLOCK__CF_NEXT = BASIC_BLOCK__CF_NEXT;

	/**
	 * The feature id for the '<em><b>Cf Prev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BASIC_BLOCK__CF_PREV = BASIC_BLOCK__CF_PREV;

	/**
	 * The feature id for the '<em><b>Then</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BASIC_BLOCK__THEN = BASIC_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BASIC_BLOCK__ELSE = BASIC_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Basic Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BASIC_BLOCK_FEATURE_COUNT = BASIC_BLOCK_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.analysis.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see genericity.typing.atl_types.analysis.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.ControlFlow#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see genericity.typing.atl_types.analysis.ControlFlow#getStart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Start();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.analysis.BasicBlock <em>Basic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Block</em>'.
	 * @see genericity.typing.atl_types.analysis.BasicBlock
	 * @generated
	 */
	EClass getBasicBlock();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.BasicBlock#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr</em>'.
	 * @see genericity.typing.atl_types.analysis.BasicBlock#getExpr()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_Expr();

	/**
	 * Returns the meta object for the reference list '{@link genericity.typing.atl_types.analysis.BasicBlock#getCfNext <em>Cf Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cf Next</em>'.
	 * @see genericity.typing.atl_types.analysis.BasicBlock#getCfNext()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_CfNext();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.BasicBlock#getCfPrev <em>Cf Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cf Prev</em>'.
	 * @see genericity.typing.atl_types.analysis.BasicBlock#getCfPrev()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_CfPrev();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.analysis.NavigationBasicBlock <em>Navigation Basic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Basic Block</em>'.
	 * @see genericity.typing.atl_types.analysis.NavigationBasicBlock
	 * @generated
	 */
	EClass getNavigationBasicBlock();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.NavigationBasicBlock#getSubexprStart <em>Subexpr Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subexpr Start</em>'.
	 * @see genericity.typing.atl_types.analysis.NavigationBasicBlock#getSubexprStart()
	 * @see #getNavigationBasicBlock()
	 * @generated
	 */
	EReference getNavigationBasicBlock_SubexprStart();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.NavigationBasicBlock#getSubexprEnd <em>Subexpr End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subexpr End</em>'.
	 * @see genericity.typing.atl_types.analysis.NavigationBasicBlock#getSubexprEnd()
	 * @see #getNavigationBasicBlock()
	 * @generated
	 */
	EReference getNavigationBasicBlock_SubexprEnd();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.analysis.LoopBasicBlock <em>Loop Basic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Basic Block</em>'.
	 * @see genericity.typing.atl_types.analysis.LoopBasicBlock
	 * @generated
	 */
	EClass getLoopBasicBlock();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.LoopBasicBlock#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see genericity.typing.atl_types.analysis.LoopBasicBlock#getBody()
	 * @see #getLoopBasicBlock()
	 * @generated
	 */
	EReference getLoopBasicBlock_Body();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.LoopBasicBlock#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see genericity.typing.atl_types.analysis.LoopBasicBlock#getNext()
	 * @see #getLoopBasicBlock()
	 * @generated
	 */
	EReference getLoopBasicBlock_Next();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.analysis.IfBasicBlock <em>If Basic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Basic Block</em>'.
	 * @see genericity.typing.atl_types.analysis.IfBasicBlock
	 * @generated
	 */
	EClass getIfBasicBlock();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.IfBasicBlock#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then</em>'.
	 * @see genericity.typing.atl_types.analysis.IfBasicBlock#getThen()
	 * @see #getIfBasicBlock()
	 * @generated
	 */
	EReference getIfBasicBlock_Then();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.analysis.IfBasicBlock#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else</em>'.
	 * @see genericity.typing.atl_types.analysis.IfBasicBlock#getElse()
	 * @see #getIfBasicBlock()
	 * @generated
	 */
	EReference getIfBasicBlock_Else();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysisFactory getAnalysisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.analysis.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.analysis.impl.ControlFlowImpl
		 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__START = eINSTANCE.getControlFlow_Start();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.analysis.impl.BasicBlockImpl <em>Basic Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.analysis.impl.BasicBlockImpl
		 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getBasicBlock()
		 * @generated
		 */
		EClass BASIC_BLOCK = eINSTANCE.getBasicBlock();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__EXPR = eINSTANCE.getBasicBlock_Expr();

		/**
		 * The meta object literal for the '<em><b>Cf Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__CF_NEXT = eINSTANCE.getBasicBlock_CfNext();

		/**
		 * The meta object literal for the '<em><b>Cf Prev</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__CF_PREV = eINSTANCE.getBasicBlock_CfPrev();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.analysis.impl.NavigationBasicBlockImpl <em>Navigation Basic Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.analysis.impl.NavigationBasicBlockImpl
		 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getNavigationBasicBlock()
		 * @generated
		 */
		EClass NAVIGATION_BASIC_BLOCK = eINSTANCE.getNavigationBasicBlock();

		/**
		 * The meta object literal for the '<em><b>Subexpr Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_BASIC_BLOCK__SUBEXPR_START = eINSTANCE.getNavigationBasicBlock_SubexprStart();

		/**
		 * The meta object literal for the '<em><b>Subexpr End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_BASIC_BLOCK__SUBEXPR_END = eINSTANCE.getNavigationBasicBlock_SubexprEnd();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.analysis.impl.LoopBasicBlockImpl <em>Loop Basic Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.analysis.impl.LoopBasicBlockImpl
		 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getLoopBasicBlock()
		 * @generated
		 */
		EClass LOOP_BASIC_BLOCK = eINSTANCE.getLoopBasicBlock();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_BASIC_BLOCK__BODY = eINSTANCE.getLoopBasicBlock_Body();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_BASIC_BLOCK__NEXT = eINSTANCE.getLoopBasicBlock_Next();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.analysis.impl.IfBasicBlockImpl <em>If Basic Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.analysis.impl.IfBasicBlockImpl
		 * @see genericity.typing.atl_types.analysis.impl.AnalysisPackageImpl#getIfBasicBlock()
		 * @generated
		 */
		EClass IF_BASIC_BLOCK = eINSTANCE.getIfBasicBlock();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BASIC_BLOCK__THEN = eINSTANCE.getIfBasicBlock_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BASIC_BLOCK__ELSE = eINSTANCE.getIfBasicBlock_Else();

	}

} //AnalysisPackage

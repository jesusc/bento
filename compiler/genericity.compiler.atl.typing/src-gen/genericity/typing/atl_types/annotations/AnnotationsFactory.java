/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsFactory eINSTANCE = genericity.typing.atl_types.annotations.impl.AnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Ann</em>'.
	 * @generated
	 */
	TransformationAnn createTransformationAnn();

	/**
	 * Returns a new object of class '<em>Matched Rule One Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matched Rule One Ann</em>'.
	 * @generated
	 */
	MatchedRuleOneAnn createMatchedRuleOneAnn();

	/**
	 * Returns a new object of class '<em>Matched Rule Many Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matched Rule Many Ann</em>'.
	 * @generated
	 */
	MatchedRuleManyAnn createMatchedRuleManyAnn();

	/**
	 * Returns a new object of class '<em>Lazy Rule Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lazy Rule Ann</em>'.
	 * @generated
	 */
	LazyRuleAnn createLazyRuleAnn();

	/**
	 * Returns a new object of class '<em>Called Rule Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Called Rule Ann</em>'.
	 * @generated
	 */
	CalledRuleAnn createCalledRuleAnn();

	/**
	 * Returns a new object of class '<em>Output Pattern Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Pattern Ann</em>'.
	 * @generated
	 */
	OutputPatternAnn createOutputPatternAnn();

	/**
	 * Returns a new object of class '<em>Module Helper Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Helper Ann</em>'.
	 * @generated
	 */
	ModuleHelperAnn createModuleHelperAnn();

	/**
	 * Returns a new object of class '<em>Context Helper Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Helper Ann</em>'.
	 * @generated
	 */
	ContextHelperAnn createContextHelperAnn();

	/**
	 * Returns a new object of class '<em>Binding Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Ann</em>'.
	 * @generated
	 */
	BindingAnn createBindingAnn();

	/**
	 * Returns a new object of class '<em>Let Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let Expr Ann</em>'.
	 * @generated
	 */
	LetExprAnn createLetExprAnn();

	/**
	 * Returns a new object of class '<em>If Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expr Ann</em>'.
	 * @generated
	 */
	IfExprAnn createIfExprAnn();

	/**
	 * Returns a new object of class '<em>Call Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Expr Ann</em>'.
	 * @generated
	 */
	CallExprAnn createCallExprAnn();

	/**
	 * Returns a new object of class '<em>Iterator Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Expr Ann</em>'.
	 * @generated
	 */
	IteratorExprAnn createIteratorExprAnn();

	/**
	 * Returns a new object of class '<em>Iterate Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate Expr Ann</em>'.
	 * @generated
	 */
	IterateExprAnn createIterateExprAnn();

	/**
	 * Returns a new object of class '<em>Collection Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Expr Ann</em>'.
	 * @generated
	 */
	CollectionExprAnn createCollectionExprAnn();

	/**
	 * Returns a new object of class '<em>Map Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Expr Ann</em>'.
	 * @generated
	 */
	MapExprAnn createMapExprAnn();

	/**
	 * Returns a new object of class '<em>Tuple Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple Expr Ann</em>'.
	 * @generated
	 */
	TupleExprAnn createTupleExprAnn();

	/**
	 * Returns a new object of class '<em>Generic Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Expr Ann</em>'.
	 * @generated
	 */
	GenericExprAnn createGenericExprAnn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory

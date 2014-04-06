/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.util;

import genericity.typing.atl_types.annotations.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage
 * @generated
 */
public class AnnotationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = AnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AnnotationsPackage.ATL_ANNOTATION: {
				AtlAnnotation atlAnnotation = (AtlAnnotation)theEObject;
				T result = caseAtlAnnotation(atlAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TRANSFORMATION_ANN: {
				TransformationAnn transformationAnn = (TransformationAnn)theEObject;
				T result = caseTransformationAnn(transformationAnn);
				if (result == null) result = caseAtlAnnotation(transformationAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.RULE_ANN: {
				RuleAnn ruleAnn = (RuleAnn)theEObject;
				T result = caseRuleAnn(ruleAnn);
				if (result == null) result = caseAtlAnnotation(ruleAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.MATCHED_RULE_ANN: {
				MatchedRuleAnn matchedRuleAnn = (MatchedRuleAnn)theEObject;
				T result = caseMatchedRuleAnn(matchedRuleAnn);
				if (result == null) result = caseRuleAnn(matchedRuleAnn);
				if (result == null) result = caseAtlAnnotation(matchedRuleAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.MATCHED_RULE_ONE_ANN: {
				MatchedRuleOneAnn matchedRuleOneAnn = (MatchedRuleOneAnn)theEObject;
				T result = caseMatchedRuleOneAnn(matchedRuleOneAnn);
				if (result == null) result = caseMatchedRuleAnn(matchedRuleOneAnn);
				if (result == null) result = caseRuleAnn(matchedRuleOneAnn);
				if (result == null) result = caseAtlAnnotation(matchedRuleOneAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.MATCHED_RULE_MANY_ANN: {
				MatchedRuleManyAnn matchedRuleManyAnn = (MatchedRuleManyAnn)theEObject;
				T result = caseMatchedRuleManyAnn(matchedRuleManyAnn);
				if (result == null) result = caseMatchedRuleAnn(matchedRuleManyAnn);
				if (result == null) result = caseRuleAnn(matchedRuleManyAnn);
				if (result == null) result = caseAtlAnnotation(matchedRuleManyAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.LAZY_RULE_ANN: {
				LazyRuleAnn lazyRuleAnn = (LazyRuleAnn)theEObject;
				T result = caseLazyRuleAnn(lazyRuleAnn);
				if (result == null) result = caseRuleAnn(lazyRuleAnn);
				if (result == null) result = caseAtlAnnotation(lazyRuleAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.CALLED_RULE_ANN: {
				CalledRuleAnn calledRuleAnn = (CalledRuleAnn)theEObject;
				T result = caseCalledRuleAnn(calledRuleAnn);
				if (result == null) result = caseRuleAnn(calledRuleAnn);
				if (result == null) result = caseAtlAnnotation(calledRuleAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.OUTPUT_PATTERN_ANN: {
				OutputPatternAnn outputPatternAnn = (OutputPatternAnn)theEObject;
				T result = caseOutputPatternAnn(outputPatternAnn);
				if (result == null) result = caseRuleAnn(outputPatternAnn);
				if (result == null) result = caseAtlAnnotation(outputPatternAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.HELPER_ANN: {
				HelperAnn helperAnn = (HelperAnn)theEObject;
				T result = caseHelperAnn(helperAnn);
				if (result == null) result = caseAtlAnnotation(helperAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.MODULE_HELPER_ANN: {
				ModuleHelperAnn moduleHelperAnn = (ModuleHelperAnn)theEObject;
				T result = caseModuleHelperAnn(moduleHelperAnn);
				if (result == null) result = caseHelperAnn(moduleHelperAnn);
				if (result == null) result = caseAtlAnnotation(moduleHelperAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.CONTEXT_HELPER_ANN: {
				ContextHelperAnn contextHelperAnn = (ContextHelperAnn)theEObject;
				T result = caseContextHelperAnn(contextHelperAnn);
				if (result == null) result = caseHelperAnn(contextHelperAnn);
				if (result == null) result = caseAtlAnnotation(contextHelperAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.BINDING_ANN: {
				BindingAnn bindingAnn = (BindingAnn)theEObject;
				T result = caseBindingAnn(bindingAnn);
				if (result == null) result = caseAtlAnnotation(bindingAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.EXPRESSION_ANNOTATION: {
				ExpressionAnnotation expressionAnnotation = (ExpressionAnnotation)theEObject;
				T result = caseExpressionAnnotation(expressionAnnotation);
				if (result == null) result = caseAtlAnnotation(expressionAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.LET_EXPR_ANN: {
				LetExprAnn letExprAnn = (LetExprAnn)theEObject;
				T result = caseLetExprAnn(letExprAnn);
				if (result == null) result = caseExpressionAnnotation(letExprAnn);
				if (result == null) result = caseAtlAnnotation(letExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.IF_EXPR_ANN: {
				IfExprAnn ifExprAnn = (IfExprAnn)theEObject;
				T result = caseIfExprAnn(ifExprAnn);
				if (result == null) result = caseExpressionAnnotation(ifExprAnn);
				if (result == null) result = caseAtlAnnotation(ifExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.CALL_EXPR_ANN: {
				CallExprAnn callExprAnn = (CallExprAnn)theEObject;
				T result = caseCallExprAnn(callExprAnn);
				if (result == null) result = caseExpressionAnnotation(callExprAnn);
				if (result == null) result = caseAtlAnnotation(callExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN: {
				AbstractIteratorExprAnn abstractIteratorExprAnn = (AbstractIteratorExprAnn)theEObject;
				T result = caseAbstractIteratorExprAnn(abstractIteratorExprAnn);
				if (result == null) result = caseExpressionAnnotation(abstractIteratorExprAnn);
				if (result == null) result = caseAtlAnnotation(abstractIteratorExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.ITERATOR_EXPR_ANN: {
				IteratorExprAnn iteratorExprAnn = (IteratorExprAnn)theEObject;
				T result = caseIteratorExprAnn(iteratorExprAnn);
				if (result == null) result = caseAbstractIteratorExprAnn(iteratorExprAnn);
				if (result == null) result = caseExpressionAnnotation(iteratorExprAnn);
				if (result == null) result = caseAtlAnnotation(iteratorExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.ITERATE_EXPR_ANN: {
				IterateExprAnn iterateExprAnn = (IterateExprAnn)theEObject;
				T result = caseIterateExprAnn(iterateExprAnn);
				if (result == null) result = caseAbstractIteratorExprAnn(iterateExprAnn);
				if (result == null) result = caseExpressionAnnotation(iterateExprAnn);
				if (result == null) result = caseAtlAnnotation(iterateExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.COLLECTION_EXPR_ANN: {
				CollectionExprAnn collectionExprAnn = (CollectionExprAnn)theEObject;
				T result = caseCollectionExprAnn(collectionExprAnn);
				if (result == null) result = caseExpressionAnnotation(collectionExprAnn);
				if (result == null) result = caseAtlAnnotation(collectionExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.MAP_EXPR_ANN: {
				MapExprAnn mapExprAnn = (MapExprAnn)theEObject;
				T result = caseMapExprAnn(mapExprAnn);
				if (result == null) result = caseExpressionAnnotation(mapExprAnn);
				if (result == null) result = caseAtlAnnotation(mapExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.TUPLE_EXPR_ANN: {
				TupleExprAnn tupleExprAnn = (TupleExprAnn)theEObject;
				T result = caseTupleExprAnn(tupleExprAnn);
				if (result == null) result = caseExpressionAnnotation(tupleExprAnn);
				if (result == null) result = caseAtlAnnotation(tupleExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnnotationsPackage.GENERIC_EXPR_ANN: {
				GenericExprAnn genericExprAnn = (GenericExprAnn)theEObject;
				T result = caseGenericExprAnn(genericExprAnn);
				if (result == null) result = caseExpressionAnnotation(genericExprAnn);
				if (result == null) result = caseAtlAnnotation(genericExprAnn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atl Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atl Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtlAnnotation(AtlAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationAnn(TransformationAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleAnn(RuleAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Rule Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Rule Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchedRuleAnn(MatchedRuleAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Rule One Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Rule One Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchedRuleOneAnn(MatchedRuleOneAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matched Rule Many Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matched Rule Many Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchedRuleManyAnn(MatchedRuleManyAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lazy Rule Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lazy Rule Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLazyRuleAnn(LazyRuleAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Called Rule Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Called Rule Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalledRuleAnn(CalledRuleAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pattern Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pattern Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPatternAnn(OutputPatternAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelperAnn(HelperAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Helper Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Helper Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleHelperAnn(ModuleHelperAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Helper Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Helper Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextHelperAnn(ContextHelperAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingAnn(BindingAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionAnnotation(ExpressionAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetExprAnn(LetExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExprAnn(IfExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallExprAnn(CallExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Iterator Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Iterator Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractIteratorExprAnn(AbstractIteratorExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorExprAnn(IteratorExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterate Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterate Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterateExprAnn(IterateExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExprAnn(CollectionExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapExprAnn(MapExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleExprAnn(TupleExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Expr Ann</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Expr Ann</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericExprAnn(GenericExprAnn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AnnotationsSwitch

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.util;

import genericity.typing.atl_types.annotations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage
 * @generated
 */
public class AnnotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationsSwitch<Adapter> modelSwitch =
		new AnnotationsSwitch<Adapter>() {
			@Override
			public Adapter caseAtlAnnotation(AtlAnnotation object) {
				return createAtlAnnotationAdapter();
			}
			@Override
			public Adapter caseTransformationAnn(TransformationAnn object) {
				return createTransformationAnnAdapter();
			}
			@Override
			public Adapter caseRuleAnn(RuleAnn object) {
				return createRuleAnnAdapter();
			}
			@Override
			public Adapter caseMatchedRuleAnn(MatchedRuleAnn object) {
				return createMatchedRuleAnnAdapter();
			}
			@Override
			public Adapter caseMatchedRuleOneAnn(MatchedRuleOneAnn object) {
				return createMatchedRuleOneAnnAdapter();
			}
			@Override
			public Adapter caseMatchedRuleManyAnn(MatchedRuleManyAnn object) {
				return createMatchedRuleManyAnnAdapter();
			}
			@Override
			public Adapter caseImperativeRuleAnn(ImperativeRuleAnn object) {
				return createImperativeRuleAnnAdapter();
			}
			@Override
			public Adapter caseLazyRuleAnn(LazyRuleAnn object) {
				return createLazyRuleAnnAdapter();
			}
			@Override
			public Adapter caseCalledRuleAnn(CalledRuleAnn object) {
				return createCalledRuleAnnAdapter();
			}
			@Override
			public Adapter caseOutputPatternAnn(OutputPatternAnn object) {
				return createOutputPatternAnnAdapter();
			}
			@Override
			public Adapter caseHelperAnn(HelperAnn object) {
				return createHelperAnnAdapter();
			}
			@Override
			public Adapter caseModuleCallableAnn(ModuleCallableAnn object) {
				return createModuleCallableAnnAdapter();
			}
			@Override
			public Adapter caseModuleHelperAnn(ModuleHelperAnn object) {
				return createModuleHelperAnnAdapter();
			}
			@Override
			public Adapter caseContextHelperAnn(ContextHelperAnn object) {
				return createContextHelperAnnAdapter();
			}
			@Override
			public Adapter caseBindingAnn(BindingAnn object) {
				return createBindingAnnAdapter();
			}
			@Override
			public Adapter caseExpressionAnnotation(ExpressionAnnotation object) {
				return createExpressionAnnotationAdapter();
			}
			@Override
			public Adapter caseLetExprAnn(LetExprAnn object) {
				return createLetExprAnnAdapter();
			}
			@Override
			public Adapter caseIfExprAnn(IfExprAnn object) {
				return createIfExprAnnAdapter();
			}
			@Override
			public Adapter caseCallExprAnn(CallExprAnn object) {
				return createCallExprAnnAdapter();
			}
			@Override
			public Adapter caseAbstractIteratorExprAnn(AbstractIteratorExprAnn object) {
				return createAbstractIteratorExprAnnAdapter();
			}
			@Override
			public Adapter caseIteratorExprAnn(IteratorExprAnn object) {
				return createIteratorExprAnnAdapter();
			}
			@Override
			public Adapter caseIterateExprAnn(IterateExprAnn object) {
				return createIterateExprAnnAdapter();
			}
			@Override
			public Adapter caseCollectionExprAnn(CollectionExprAnn object) {
				return createCollectionExprAnnAdapter();
			}
			@Override
			public Adapter caseMapExprAnn(MapExprAnn object) {
				return createMapExprAnnAdapter();
			}
			@Override
			public Adapter caseTupleExprAnn(TupleExprAnn object) {
				return createTupleExprAnnAdapter();
			}
			@Override
			public Adapter caseGenericExprAnn(GenericExprAnn object) {
				return createGenericExprAnnAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.AtlAnnotation <em>Atl Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.AtlAnnotation
	 * @generated
	 */
	public Adapter createAtlAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.TransformationAnn <em>Transformation Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.TransformationAnn
	 * @generated
	 */
	public Adapter createTransformationAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.RuleAnn <em>Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.RuleAnn
	 * @generated
	 */
	public Adapter createRuleAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.MatchedRuleAnn <em>Matched Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleAnn
	 * @generated
	 */
	public Adapter createMatchedRuleAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.MatchedRuleOneAnn <em>Matched Rule One Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleOneAnn
	 * @generated
	 */
	public Adapter createMatchedRuleOneAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.MatchedRuleManyAnn <em>Matched Rule Many Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleManyAnn
	 * @generated
	 */
	public Adapter createMatchedRuleManyAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.ImperativeRuleAnn <em>Imperative Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.ImperativeRuleAnn
	 * @generated
	 */
	public Adapter createImperativeRuleAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.LazyRuleAnn <em>Lazy Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.LazyRuleAnn
	 * @generated
	 */
	public Adapter createLazyRuleAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.CalledRuleAnn <em>Called Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.CalledRuleAnn
	 * @generated
	 */
	public Adapter createCalledRuleAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.OutputPatternAnn <em>Output Pattern Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.OutputPatternAnn
	 * @generated
	 */
	public Adapter createOutputPatternAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.HelperAnn <em>Helper Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.HelperAnn
	 * @generated
	 */
	public Adapter createHelperAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.ModuleCallableAnn <em>Module Callable Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.ModuleCallableAnn
	 * @generated
	 */
	public Adapter createModuleCallableAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.ModuleHelperAnn <em>Module Helper Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.ModuleHelperAnn
	 * @generated
	 */
	public Adapter createModuleHelperAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.ContextHelperAnn <em>Context Helper Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.ContextHelperAnn
	 * @generated
	 */
	public Adapter createContextHelperAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.BindingAnn <em>Binding Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.BindingAnn
	 * @generated
	 */
	public Adapter createBindingAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation <em>Expression Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation
	 * @generated
	 */
	public Adapter createExpressionAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.LetExprAnn <em>Let Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.LetExprAnn
	 * @generated
	 */
	public Adapter createLetExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.IfExprAnn <em>If Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.IfExprAnn
	 * @generated
	 */
	public Adapter createIfExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.CallExprAnn <em>Call Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.CallExprAnn
	 * @generated
	 */
	public Adapter createCallExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.AbstractIteratorExprAnn <em>Abstract Iterator Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.AbstractIteratorExprAnn
	 * @generated
	 */
	public Adapter createAbstractIteratorExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.IteratorExprAnn <em>Iterator Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.IteratorExprAnn
	 * @generated
	 */
	public Adapter createIteratorExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.IterateExprAnn <em>Iterate Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.IterateExprAnn
	 * @generated
	 */
	public Adapter createIterateExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.CollectionExprAnn <em>Collection Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.CollectionExprAnn
	 * @generated
	 */
	public Adapter createCollectionExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.MapExprAnn <em>Map Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.MapExprAnn
	 * @generated
	 */
	public Adapter createMapExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.TupleExprAnn <em>Tuple Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.TupleExprAnn
	 * @generated
	 */
	public Adapter createTupleExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.typing.atl_types.annotations.GenericExprAnn <em>Generic Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.typing.atl_types.annotations.GenericExprAnn
	 * @generated
	 */
	public Adapter createGenericExprAnnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AnnotationsAdapterFactory

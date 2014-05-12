/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.annotations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsFactoryImpl extends EFactoryImpl implements AnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotationsFactory init() {
		try {
			AnnotationsFactory theAnnotationsFactory = (AnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(AnnotationsPackage.eNS_URI);
			if (theAnnotationsFactory != null) {
				return theAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnnotationsPackage.TRANSFORMATION_ANN: return createTransformationAnn();
			case AnnotationsPackage.MATCHED_RULE_ONE_ANN: return createMatchedRuleOneAnn();
			case AnnotationsPackage.MATCHED_RULE_MANY_ANN: return createMatchedRuleManyAnn();
			case AnnotationsPackage.LAZY_RULE_ANN: return createLazyRuleAnn();
			case AnnotationsPackage.CALLED_RULE_ANN: return createCalledRuleAnn();
			case AnnotationsPackage.OUTPUT_PATTERN_ANN: return createOutputPatternAnn();
			case AnnotationsPackage.MODULE_HELPER_ANN: return createModuleHelperAnn();
			case AnnotationsPackage.CONTEXT_HELPER_ANN: return createContextHelperAnn();
			case AnnotationsPackage.BINDING_ANN: return createBindingAnn();
			case AnnotationsPackage.LET_EXPR_ANN: return createLetExprAnn();
			case AnnotationsPackage.IF_EXPR_ANN: return createIfExprAnn();
			case AnnotationsPackage.CALL_EXPR_ANN: return createCallExprAnn();
			case AnnotationsPackage.ITERATOR_EXPR_ANN: return createIteratorExprAnn();
			case AnnotationsPackage.ITERATE_EXPR_ANN: return createIterateExprAnn();
			case AnnotationsPackage.COLLECTION_EXPR_ANN: return createCollectionExprAnn();
			case AnnotationsPackage.MAP_EXPR_ANN: return createMapExprAnn();
			case AnnotationsPackage.TUPLE_EXPR_ANN: return createTupleExprAnn();
			case AnnotationsPackage.GENERIC_EXPR_ANN: return createGenericExprAnn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationAnn createTransformationAnn() {
		TransformationAnnImpl transformationAnn = new TransformationAnnImpl();
		return transformationAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedRuleOneAnn createMatchedRuleOneAnn() {
		MatchedRuleOneAnnImpl matchedRuleOneAnn = new MatchedRuleOneAnnImpl();
		return matchedRuleOneAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedRuleManyAnn createMatchedRuleManyAnn() {
		MatchedRuleManyAnnImpl matchedRuleManyAnn = new MatchedRuleManyAnnImpl();
		return matchedRuleManyAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyRuleAnn createLazyRuleAnn() {
		LazyRuleAnnImpl lazyRuleAnn = new LazyRuleAnnImpl();
		return lazyRuleAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledRuleAnn createCalledRuleAnn() {
		CalledRuleAnnImpl calledRuleAnn = new CalledRuleAnnImpl();
		return calledRuleAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPatternAnn createOutputPatternAnn() {
		OutputPatternAnnImpl outputPatternAnn = new OutputPatternAnnImpl();
		return outputPatternAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleHelperAnn createModuleHelperAnn() {
		ModuleHelperAnnImpl moduleHelperAnn = new ModuleHelperAnnImpl();
		return moduleHelperAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextHelperAnn createContextHelperAnn() {
		ContextHelperAnnImpl contextHelperAnn = new ContextHelperAnnImpl();
		return contextHelperAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingAnn createBindingAnn() {
		BindingAnnImpl bindingAnn = new BindingAnnImpl();
		return bindingAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExprAnn createLetExprAnn() {
		LetExprAnnImpl letExprAnn = new LetExprAnnImpl();
		return letExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExprAnn createIfExprAnn() {
		IfExprAnnImpl ifExprAnn = new IfExprAnnImpl();
		return ifExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallExprAnn createCallExprAnn() {
		CallExprAnnImpl callExprAnn = new CallExprAnnImpl();
		return callExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorExprAnn createIteratorExprAnn() {
		IteratorExprAnnImpl iteratorExprAnn = new IteratorExprAnnImpl();
		return iteratorExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateExprAnn createIterateExprAnn() {
		IterateExprAnnImpl iterateExprAnn = new IterateExprAnnImpl();
		return iterateExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionExprAnn createCollectionExprAnn() {
		CollectionExprAnnImpl collectionExprAnn = new CollectionExprAnnImpl();
		return collectionExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExprAnn createMapExprAnn() {
		MapExprAnnImpl mapExprAnn = new MapExprAnnImpl();
		return mapExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleExprAnn createTupleExprAnn() {
		TupleExprAnnImpl tupleExprAnn = new TupleExprAnnImpl();
		return tupleExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericExprAnn createGenericExprAnn() {
		GenericExprAnnImpl genericExprAnn = new GenericExprAnnImpl();
		return genericExprAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsPackage getAnnotationsPackage() {
		return (AnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnnotationsPackage getPackage() {
		return AnnotationsPackage.eINSTANCE;
	}

} //AnnotationsFactoryImpl

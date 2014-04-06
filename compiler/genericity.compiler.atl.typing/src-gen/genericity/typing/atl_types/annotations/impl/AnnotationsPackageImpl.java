/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.AtlTypingPackage;

import genericity.typing.atl_types.annotations.AbstractIteratorExprAnn;
import genericity.typing.atl_types.annotations.AnnotationsFactory;
import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.AtlAnnotation;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.CalledRuleAnn;
import genericity.typing.atl_types.annotations.CollectionExprAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.GenericExprAnn;
import genericity.typing.atl_types.annotations.HelperAnn;
import genericity.typing.atl_types.annotations.IfExprAnn;
import genericity.typing.atl_types.annotations.IterateExprAnn;
import genericity.typing.atl_types.annotations.IteratorExprAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;
import genericity.typing.atl_types.annotations.LetExprAnn;
import genericity.typing.atl_types.annotations.MapExprAnn;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleManyAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;
import genericity.typing.atl_types.annotations.ModuleHelperAnn;
import genericity.typing.atl_types.annotations.OutputPatternAnn;
import genericity.typing.atl_types.annotations.RuleAnn;
import genericity.typing.atl_types.annotations.TransformationAnn;

import genericity.typing.atl_types.annotations.TupleExprAnn;
import genericity.typing.atl_types.impl.AtlTypingPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsPackageImpl extends EPackageImpl implements AnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atlAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedRuleAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedRuleOneAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedRuleManyAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lazyRuleAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calledRuleAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPatternAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleHelperAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextHelperAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractIteratorExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterateExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleExprAnnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericExprAnnEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnnotationsPackageImpl() {
		super(eNS_URI, AnnotationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnnotationsPackage init() {
		if (isInited) return (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnnotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnnotationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AtlTypingPackageImpl theAtlTypingPackage = (AtlTypingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtlTypingPackage.eNS_URI) instanceof AtlTypingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtlTypingPackage.eNS_URI) : AtlTypingPackage.eINSTANCE);

		// Create package meta-data objects
		theAnnotationsPackage.createPackageContents();
		theAtlTypingPackage.createPackageContents();

		// Initialize created meta-data
		theAnnotationsPackage.initializePackageContents();
		theAtlTypingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnnotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnnotationsPackage.eNS_URI, theAnnotationsPackage);
		return theAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtlAnnotation() {
		return atlAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationAnn() {
		return transformationAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationAnn_Module() {
		return (EReference)transformationAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationAnn_MatchedRules() {
		return (EReference)transformationAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationAnn_CalledRules() {
		return (EReference)transformationAnnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationAnn_LazyRules() {
		return (EReference)transformationAnnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationAnn_Helpers() {
		return (EReference)transformationAnnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleAnn() {
		return ruleAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleAnn_Rule() {
		return (EReference)ruleAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleAnn_OutputPatterns() {
		return (EReference)ruleAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleAnn_Name() {
		return (EAttribute)ruleAnnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedRuleAnn() {
		return matchedRuleAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedRuleAnn_Filter() {
		return (EReference)matchedRuleAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedRuleAnn_OutputPatternType() {
		return (EReference)matchedRuleAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedRuleOneAnn() {
		return matchedRuleOneAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedRuleOneAnn_InPatternType() {
		return (EReference)matchedRuleOneAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedRuleManyAnn() {
		return matchedRuleManyAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedRuleManyAnn_InPatternTypes() {
		return (EReference)matchedRuleManyAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLazyRuleAnn() {
		return lazyRuleAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLazyRuleAnn_InPatternType() {
		return (EReference)lazyRuleAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLazyRuleAnn_OutputPatternType() {
		return (EReference)lazyRuleAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalledRuleAnn() {
		return calledRuleAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPatternAnn() {
		return outputPatternAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPatternAnn_OutputPatternElement() {
		return (EReference)outputPatternAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPatternAnn_Type() {
		return (EReference)outputPatternAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPatternAnn_Bindings() {
		return (EReference)outputPatternAnnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperAnn() {
		return helperAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperAnn_Helper() {
		return (EReference)helperAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelperAnn_Name() {
		return (EAttribute)helperAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperAnn_ReturnType() {
		return (EReference)helperAnnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperAnn_Expr() {
		return (EReference)helperAnnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleHelperAnn() {
		return moduleHelperAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextHelperAnn() {
		return contextHelperAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextHelperAnn_ContextType() {
		return (EReference)contextHelperAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextHelperAnn_CalledBy() {
		return (EReference)contextHelperAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingAnn() {
		return bindingAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnn_Rule() {
		return (EReference)bindingAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnn_Binding() {
		return (EReference)bindingAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingAnn_Name() {
		return (EAttribute)bindingAnnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnn_SourceType() {
		return (EReference)bindingAnnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnn_TargetType() {
		return (EReference)bindingAnnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnn_Value() {
		return (EReference)bindingAnnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnn_ResolvedBy() {
		return (EReference)bindingAnnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionAnnotation() {
		return expressionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionAnnotation_Expr() {
		return (EReference)expressionAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionAnnotation_Type() {
		return (EReference)expressionAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionAnnotation_UsedFeature() {
		return (EReference)expressionAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionAnnotation_ReceptorType() {
		return (EReference)expressionAnnotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetExprAnn() {
		return letExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetExprAnn_Init() {
		return (EReference)letExprAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetExprAnn_Body() {
		return (EReference)letExprAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfExprAnn() {
		return ifExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExprAnn_IfCondition() {
		return (EReference)ifExprAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExprAnn_ThenPart() {
		return (EReference)ifExprAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExprAnn_ElsePart() {
		return (EReference)ifExprAnnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallExprAnn() {
		return callExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallExprAnn_Source() {
		return (EReference)callExprAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallExprAnn_Arguments() {
		return (EReference)callExprAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallExprAnn_StaticResolver() {
		return (EReference)callExprAnnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallExprAnn_DynamicResolvers() {
		return (EReference)callExprAnnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractIteratorExprAnn() {
		return abstractIteratorExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractIteratorExprAnn_Source() {
		return (EReference)abstractIteratorExprAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractIteratorExprAnn_Body() {
		return (EReference)abstractIteratorExprAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorExprAnn() {
		return iteratorExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterateExprAnn() {
		return iterateExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterateExprAnn_ResultVar() {
		return (EReference)iterateExprAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionExprAnn() {
		return collectionExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExprAnn_Initializers() {
		return (EReference)collectionExprAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapExprAnn() {
		return mapExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapExprAnn_KeyInitializers() {
		return (EReference)mapExprAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapExprAnn_ValueInitializers() {
		return (EReference)mapExprAnnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleExprAnn() {
		return tupleExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleExprAnn_Parts() {
		return (EReference)tupleExprAnnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericExprAnn() {
		return genericExprAnnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsFactory getAnnotationsFactory() {
		return (AnnotationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		atlAnnotationEClass = createEClass(ATL_ANNOTATION);

		transformationAnnEClass = createEClass(TRANSFORMATION_ANN);
		createEReference(transformationAnnEClass, TRANSFORMATION_ANN__MODULE);
		createEReference(transformationAnnEClass, TRANSFORMATION_ANN__MATCHED_RULES);
		createEReference(transformationAnnEClass, TRANSFORMATION_ANN__CALLED_RULES);
		createEReference(transformationAnnEClass, TRANSFORMATION_ANN__LAZY_RULES);
		createEReference(transformationAnnEClass, TRANSFORMATION_ANN__HELPERS);

		ruleAnnEClass = createEClass(RULE_ANN);
		createEReference(ruleAnnEClass, RULE_ANN__RULE);
		createEReference(ruleAnnEClass, RULE_ANN__OUTPUT_PATTERNS);
		createEAttribute(ruleAnnEClass, RULE_ANN__NAME);

		matchedRuleAnnEClass = createEClass(MATCHED_RULE_ANN);
		createEReference(matchedRuleAnnEClass, MATCHED_RULE_ANN__FILTER);
		createEReference(matchedRuleAnnEClass, MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE);

		matchedRuleOneAnnEClass = createEClass(MATCHED_RULE_ONE_ANN);
		createEReference(matchedRuleOneAnnEClass, MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE);

		matchedRuleManyAnnEClass = createEClass(MATCHED_RULE_MANY_ANN);
		createEReference(matchedRuleManyAnnEClass, MATCHED_RULE_MANY_ANN__IN_PATTERN_TYPES);

		lazyRuleAnnEClass = createEClass(LAZY_RULE_ANN);
		createEReference(lazyRuleAnnEClass, LAZY_RULE_ANN__IN_PATTERN_TYPE);
		createEReference(lazyRuleAnnEClass, LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE);

		calledRuleAnnEClass = createEClass(CALLED_RULE_ANN);

		outputPatternAnnEClass = createEClass(OUTPUT_PATTERN_ANN);
		createEReference(outputPatternAnnEClass, OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT);
		createEReference(outputPatternAnnEClass, OUTPUT_PATTERN_ANN__TYPE);
		createEReference(outputPatternAnnEClass, OUTPUT_PATTERN_ANN__BINDINGS);

		helperAnnEClass = createEClass(HELPER_ANN);
		createEReference(helperAnnEClass, HELPER_ANN__HELPER);
		createEAttribute(helperAnnEClass, HELPER_ANN__NAME);
		createEReference(helperAnnEClass, HELPER_ANN__RETURN_TYPE);
		createEReference(helperAnnEClass, HELPER_ANN__EXPR);

		moduleHelperAnnEClass = createEClass(MODULE_HELPER_ANN);

		contextHelperAnnEClass = createEClass(CONTEXT_HELPER_ANN);
		createEReference(contextHelperAnnEClass, CONTEXT_HELPER_ANN__CONTEXT_TYPE);
		createEReference(contextHelperAnnEClass, CONTEXT_HELPER_ANN__CALLED_BY);

		bindingAnnEClass = createEClass(BINDING_ANN);
		createEReference(bindingAnnEClass, BINDING_ANN__RULE);
		createEReference(bindingAnnEClass, BINDING_ANN__BINDING);
		createEAttribute(bindingAnnEClass, BINDING_ANN__NAME);
		createEReference(bindingAnnEClass, BINDING_ANN__SOURCE_TYPE);
		createEReference(bindingAnnEClass, BINDING_ANN__TARGET_TYPE);
		createEReference(bindingAnnEClass, BINDING_ANN__VALUE);
		createEReference(bindingAnnEClass, BINDING_ANN__RESOLVED_BY);

		expressionAnnotationEClass = createEClass(EXPRESSION_ANNOTATION);
		createEReference(expressionAnnotationEClass, EXPRESSION_ANNOTATION__EXPR);
		createEReference(expressionAnnotationEClass, EXPRESSION_ANNOTATION__TYPE);
		createEReference(expressionAnnotationEClass, EXPRESSION_ANNOTATION__USED_FEATURE);
		createEReference(expressionAnnotationEClass, EXPRESSION_ANNOTATION__RECEPTOR_TYPE);

		letExprAnnEClass = createEClass(LET_EXPR_ANN);
		createEReference(letExprAnnEClass, LET_EXPR_ANN__INIT);
		createEReference(letExprAnnEClass, LET_EXPR_ANN__BODY);

		ifExprAnnEClass = createEClass(IF_EXPR_ANN);
		createEReference(ifExprAnnEClass, IF_EXPR_ANN__IF_CONDITION);
		createEReference(ifExprAnnEClass, IF_EXPR_ANN__THEN_PART);
		createEReference(ifExprAnnEClass, IF_EXPR_ANN__ELSE_PART);

		callExprAnnEClass = createEClass(CALL_EXPR_ANN);
		createEReference(callExprAnnEClass, CALL_EXPR_ANN__SOURCE);
		createEReference(callExprAnnEClass, CALL_EXPR_ANN__ARGUMENTS);
		createEReference(callExprAnnEClass, CALL_EXPR_ANN__STATIC_RESOLVER);
		createEReference(callExprAnnEClass, CALL_EXPR_ANN__DYNAMIC_RESOLVERS);

		abstractIteratorExprAnnEClass = createEClass(ABSTRACT_ITERATOR_EXPR_ANN);
		createEReference(abstractIteratorExprAnnEClass, ABSTRACT_ITERATOR_EXPR_ANN__SOURCE);
		createEReference(abstractIteratorExprAnnEClass, ABSTRACT_ITERATOR_EXPR_ANN__BODY);

		iteratorExprAnnEClass = createEClass(ITERATOR_EXPR_ANN);

		iterateExprAnnEClass = createEClass(ITERATE_EXPR_ANN);
		createEReference(iterateExprAnnEClass, ITERATE_EXPR_ANN__RESULT_VAR);

		collectionExprAnnEClass = createEClass(COLLECTION_EXPR_ANN);
		createEReference(collectionExprAnnEClass, COLLECTION_EXPR_ANN__INITIALIZERS);

		mapExprAnnEClass = createEClass(MAP_EXPR_ANN);
		createEReference(mapExprAnnEClass, MAP_EXPR_ANN__KEY_INITIALIZERS);
		createEReference(mapExprAnnEClass, MAP_EXPR_ANN__VALUE_INITIALIZERS);

		tupleExprAnnEClass = createEClass(TUPLE_EXPR_ANN);
		createEReference(tupleExprAnnEClass, TUPLE_EXPR_ANN__PARTS);

		genericExprAnnEClass = createEClass(GENERIC_EXPR_ANN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AtlTypingPackage theAtlTypingPackage = (AtlTypingPackage)EPackage.Registry.INSTANCE.getEPackage(AtlTypingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transformationAnnEClass.getESuperTypes().add(this.getAtlAnnotation());
		ruleAnnEClass.getESuperTypes().add(this.getAtlAnnotation());
		matchedRuleAnnEClass.getESuperTypes().add(this.getRuleAnn());
		matchedRuleOneAnnEClass.getESuperTypes().add(this.getMatchedRuleAnn());
		matchedRuleManyAnnEClass.getESuperTypes().add(this.getMatchedRuleAnn());
		lazyRuleAnnEClass.getESuperTypes().add(this.getRuleAnn());
		calledRuleAnnEClass.getESuperTypes().add(this.getRuleAnn());
		outputPatternAnnEClass.getESuperTypes().add(this.getRuleAnn());
		helperAnnEClass.getESuperTypes().add(this.getAtlAnnotation());
		moduleHelperAnnEClass.getESuperTypes().add(this.getHelperAnn());
		contextHelperAnnEClass.getESuperTypes().add(this.getHelperAnn());
		bindingAnnEClass.getESuperTypes().add(this.getAtlAnnotation());
		expressionAnnotationEClass.getESuperTypes().add(this.getAtlAnnotation());
		letExprAnnEClass.getESuperTypes().add(this.getExpressionAnnotation());
		ifExprAnnEClass.getESuperTypes().add(this.getExpressionAnnotation());
		callExprAnnEClass.getESuperTypes().add(this.getExpressionAnnotation());
		abstractIteratorExprAnnEClass.getESuperTypes().add(this.getExpressionAnnotation());
		iteratorExprAnnEClass.getESuperTypes().add(this.getAbstractIteratorExprAnn());
		iterateExprAnnEClass.getESuperTypes().add(this.getAbstractIteratorExprAnn());
		collectionExprAnnEClass.getESuperTypes().add(this.getExpressionAnnotation());
		mapExprAnnEClass.getESuperTypes().add(this.getExpressionAnnotation());
		tupleExprAnnEClass.getESuperTypes().add(this.getExpressionAnnotation());
		genericExprAnnEClass.getESuperTypes().add(this.getExpressionAnnotation());

		// Initialize classes and features; add operations and parameters
		initEClass(atlAnnotationEClass, AtlAnnotation.class, "AtlAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformationAnnEClass, TransformationAnn.class, "TransformationAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationAnn_Module(), ecorePackage.getEObject(), null, "module", null, 1, 1, TransformationAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationAnn_MatchedRules(), this.getMatchedRuleAnn(), null, "matchedRules", null, 0, -1, TransformationAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationAnn_CalledRules(), this.getCalledRuleAnn(), null, "calledRules", null, 0, -1, TransformationAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationAnn_LazyRules(), this.getLazyRuleAnn(), null, "lazyRules", null, 0, -1, TransformationAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformationAnn_Helpers(), this.getHelperAnn(), null, "helpers", null, 0, -1, TransformationAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleAnnEClass, RuleAnn.class, "RuleAnn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleAnn_Rule(), ecorePackage.getEObject(), null, "rule", null, 0, 1, RuleAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleAnn_OutputPatterns(), this.getOutputPatternAnn(), null, "outputPatterns", null, 1, -1, RuleAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleAnn_Name(), ecorePackage.getEString(), "name", null, 1, 1, RuleAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchedRuleAnnEClass, MatchedRuleAnn.class, "MatchedRuleAnn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchedRuleAnn_Filter(), this.getExpressionAnnotation(), null, "filter", null, 0, 1, MatchedRuleAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchedRuleAnn_OutputPatternType(), theAtlTypingPackage.getMetaclass(), null, "outputPatternType", null, 1, 1, MatchedRuleAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchedRuleOneAnnEClass, MatchedRuleOneAnn.class, "MatchedRuleOneAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchedRuleOneAnn_InPatternType(), theAtlTypingPackage.getMetaclass(), null, "inPatternType", null, 1, 1, MatchedRuleOneAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchedRuleManyAnnEClass, MatchedRuleManyAnn.class, "MatchedRuleManyAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchedRuleManyAnn_InPatternTypes(), theAtlTypingPackage.getMetaclass(), null, "inPatternTypes", null, 2, -1, MatchedRuleManyAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lazyRuleAnnEClass, LazyRuleAnn.class, "LazyRuleAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLazyRuleAnn_InPatternType(), theAtlTypingPackage.getMetaclass(), null, "inPatternType", null, 1, 1, LazyRuleAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLazyRuleAnn_OutputPatternType(), theAtlTypingPackage.getMetaclass(), null, "outputPatternType", null, 1, 1, LazyRuleAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calledRuleAnnEClass, CalledRuleAnn.class, "CalledRuleAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputPatternAnnEClass, OutputPatternAnn.class, "OutputPatternAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPatternAnn_OutputPatternElement(), ecorePackage.getEObject(), null, "outputPatternElement", null, 0, 1, OutputPatternAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPatternAnn_Type(), theAtlTypingPackage.getType(), null, "type", null, 1, 1, OutputPatternAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPatternAnn_Bindings(), this.getBindingAnn(), null, "bindings", null, 0, -1, OutputPatternAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helperAnnEClass, HelperAnn.class, "HelperAnn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHelperAnn_Helper(), ecorePackage.getEObject(), null, "helper", null, 0, 1, HelperAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelperAnn_Name(), ecorePackage.getEString(), "name", null, 1, 1, HelperAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperAnn_ReturnType(), theAtlTypingPackage.getType(), null, "returnType", null, 1, 1, HelperAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperAnn_Expr(), this.getExpressionAnnotation(), null, "expr", null, 1, 1, HelperAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleHelperAnnEClass, ModuleHelperAnn.class, "ModuleHelperAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextHelperAnnEClass, ContextHelperAnn.class, "ContextHelperAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextHelperAnn_ContextType(), theAtlTypingPackage.getType(), null, "contextType", null, 1, 1, ContextHelperAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextHelperAnn_CalledBy(), this.getCallExprAnn(), this.getCallExprAnn_DynamicResolvers(), "calledBy", null, 0, -1, ContextHelperAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingAnnEClass, BindingAnn.class, "BindingAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingAnn_Rule(), ecorePackage.getEObject(), null, "rule", null, 0, 1, BindingAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingAnn_Binding(), ecorePackage.getEObject(), null, "binding", null, 0, 1, BindingAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingAnn_Name(), ecorePackage.getEString(), "name", null, 0, 1, BindingAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingAnn_SourceType(), theAtlTypingPackage.getType(), null, "sourceType", null, 1, 1, BindingAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingAnn_TargetType(), theAtlTypingPackage.getType(), null, "targetType", null, 1, 1, BindingAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingAnn_Value(), this.getExpressionAnnotation(), null, "value", null, 1, 1, BindingAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingAnn_ResolvedBy(), this.getMatchedRuleOneAnn(), null, "resolvedBy", null, 0, -1, BindingAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionAnnotationEClass, ExpressionAnnotation.class, "ExpressionAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionAnnotation_Expr(), ecorePackage.getEObject(), null, "expr", null, 0, 1, ExpressionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionAnnotation_Type(), theAtlTypingPackage.getType(), null, "type", null, 1, 1, ExpressionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionAnnotation_UsedFeature(), ecorePackage.getEObject(), null, "usedFeature", null, 0, 1, ExpressionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionAnnotation_ReceptorType(), ecorePackage.getEObject(), null, "receptorType", null, 0, 1, ExpressionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letExprAnnEClass, LetExprAnn.class, "LetExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetExprAnn_Init(), this.getExpressionAnnotation(), null, "init", null, 1, 1, LetExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetExprAnn_Body(), this.getExpressionAnnotation(), null, "body", null, 1, 1, LetExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifExprAnnEClass, IfExprAnn.class, "IfExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfExprAnn_IfCondition(), this.getExpressionAnnotation(), null, "ifCondition", null, 1, 1, IfExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExprAnn_ThenPart(), this.getExpressionAnnotation(), null, "thenPart", null, 1, 1, IfExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExprAnn_ElsePart(), this.getExpressionAnnotation(), null, "elsePart", null, 1, 1, IfExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callExprAnnEClass, CallExprAnn.class, "CallExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallExprAnn_Source(), this.getExpressionAnnotation(), null, "source", null, 1, 1, CallExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallExprAnn_Arguments(), this.getExpressionAnnotation(), null, "arguments", null, 0, -1, CallExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallExprAnn_StaticResolver(), this.getHelperAnn(), null, "staticResolver", null, 1, 1, CallExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallExprAnn_DynamicResolvers(), this.getContextHelperAnn(), this.getContextHelperAnn_CalledBy(), "dynamicResolvers", null, 1, -1, CallExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractIteratorExprAnnEClass, AbstractIteratorExprAnn.class, "AbstractIteratorExprAnn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractIteratorExprAnn_Source(), this.getExpressionAnnotation(), null, "source", null, 1, 1, AbstractIteratorExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractIteratorExprAnn_Body(), this.getExpressionAnnotation(), null, "body", null, 1, 1, AbstractIteratorExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iteratorExprAnnEClass, IteratorExprAnn.class, "IteratorExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterateExprAnnEClass, IterateExprAnn.class, "IterateExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIterateExprAnn_ResultVar(), this.getExpressionAnnotation(), null, "resultVar", null, 1, 1, IterateExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionExprAnnEClass, CollectionExprAnn.class, "CollectionExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionExprAnn_Initializers(), this.getExpressionAnnotation(), null, "initializers", null, 0, -1, CollectionExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapExprAnnEClass, MapExprAnn.class, "MapExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapExprAnn_KeyInitializers(), this.getExpressionAnnotation(), null, "keyInitializers", null, 0, -1, MapExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapExprAnn_ValueInitializers(), this.getExpressionAnnotation(), null, "valueInitializers", null, 0, -1, MapExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleExprAnnEClass, TupleExprAnn.class, "TupleExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleExprAnn_Parts(), this.getExpressionAnnotation(), null, "parts", null, 0, -1, TupleExprAnn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericExprAnnEClass, GenericExprAnn.class, "GenericExprAnn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AnnotationsPackageImpl

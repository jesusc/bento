/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see genericity.typing.atl_types.annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/types/atl/annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl_types_annotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.AtlAnnotationImpl <em>Atl Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.AtlAnnotationImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getAtlAnnotation()
	 * @generated
	 */
	int ATL_ANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>Atl Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.TransformationAnnImpl <em>Transformation Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.TransformationAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getTransformationAnn()
	 * @generated
	 */
	int TRANSFORMATION_ANN = 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ANN__MODULE = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matched Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ANN__MATCHED_RULES = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Called Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ANN__CALLED_RULES = ATL_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ANN__LAZY_RULES = ATL_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Helpers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ANN__HELPERS = ATL_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformation Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ANN_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.RuleAnnImpl <em>Rule Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.RuleAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getRuleAnn()
	 * @generated
	 */
	int RULE_ANN = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ANN__RULE = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ANN__OUTPUT_PATTERNS = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ANN__NAME = ATL_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ANN_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.MatchedRuleAnnImpl <em>Matched Rule Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.MatchedRuleAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getMatchedRuleAnn()
	 * @generated
	 */
	int MATCHED_RULE_ANN = 3;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ANN__RULE = RULE_ANN__RULE;

	/**
	 * The feature id for the '<em><b>Output Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ANN__OUTPUT_PATTERNS = RULE_ANN__OUTPUT_PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ANN__NAME = RULE_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ANN__FILTER = RULE_ANN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Pattern Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE = RULE_ANN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matched Rule Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ANN_FEATURE_COUNT = RULE_ANN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.MatchedRuleOneAnnImpl <em>Matched Rule One Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.MatchedRuleOneAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getMatchedRuleOneAnn()
	 * @generated
	 */
	int MATCHED_RULE_ONE_ANN = 4;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ONE_ANN__RULE = MATCHED_RULE_ANN__RULE;

	/**
	 * The feature id for the '<em><b>Output Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ONE_ANN__OUTPUT_PATTERNS = MATCHED_RULE_ANN__OUTPUT_PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ONE_ANN__NAME = MATCHED_RULE_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ONE_ANN__FILTER = MATCHED_RULE_ANN__FILTER;

	/**
	 * The feature id for the '<em><b>Output Pattern Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ONE_ANN__OUTPUT_PATTERN_TYPE = MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE;

	/**
	 * The feature id for the '<em><b>In Pattern Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE = MATCHED_RULE_ANN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matched Rule One Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_ONE_ANN_FEATURE_COUNT = MATCHED_RULE_ANN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.MatchedRuleManyAnnImpl <em>Matched Rule Many Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.MatchedRuleManyAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getMatchedRuleManyAnn()
	 * @generated
	 */
	int MATCHED_RULE_MANY_ANN = 5;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_MANY_ANN__RULE = MATCHED_RULE_ANN__RULE;

	/**
	 * The feature id for the '<em><b>Output Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_MANY_ANN__OUTPUT_PATTERNS = MATCHED_RULE_ANN__OUTPUT_PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_MANY_ANN__NAME = MATCHED_RULE_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_MANY_ANN__FILTER = MATCHED_RULE_ANN__FILTER;

	/**
	 * The feature id for the '<em><b>Output Pattern Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_MANY_ANN__OUTPUT_PATTERN_TYPE = MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE;

	/**
	 * The feature id for the '<em><b>In Pattern Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_MANY_ANN__IN_PATTERN_TYPES = MATCHED_RULE_ANN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matched Rule Many Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHED_RULE_MANY_ANN_FEATURE_COUNT = MATCHED_RULE_ANN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.ImperativeRuleAnnImpl <em>Imperative Rule Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.ImperativeRuleAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getImperativeRuleAnn()
	 * @generated
	 */
	int IMPERATIVE_RULE_ANN = 6;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_RULE_ANN__RULE = RULE_ANN__RULE;

	/**
	 * The feature id for the '<em><b>Output Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_RULE_ANN__OUTPUT_PATTERNS = RULE_ANN__OUTPUT_PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_RULE_ANN__NAME = RULE_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_RULE_ANN__CALLED_BY = RULE_ANN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_RULE_ANN__ARGUMENTS = RULE_ANN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_RULE_ANN__NAMES = RULE_ANN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_RULE_ANN__ARGUMENT_VARS = RULE_ANN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Imperative Rule Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_RULE_ANN_FEATURE_COUNT = RULE_ANN_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.LazyRuleAnnImpl <em>Lazy Rule Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.LazyRuleAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getLazyRuleAnn()
	 * @generated
	 */
	int LAZY_RULE_ANN = 7;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__RULE = IMPERATIVE_RULE_ANN__RULE;

	/**
	 * The feature id for the '<em><b>Output Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__OUTPUT_PATTERNS = IMPERATIVE_RULE_ANN__OUTPUT_PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__NAME = IMPERATIVE_RULE_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__CALLED_BY = IMPERATIVE_RULE_ANN__CALLED_BY;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__ARGUMENTS = IMPERATIVE_RULE_ANN__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__NAMES = IMPERATIVE_RULE_ANN__NAMES;

	/**
	 * The feature id for the '<em><b>Argument Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__ARGUMENT_VARS = IMPERATIVE_RULE_ANN__ARGUMENT_VARS;

	/**
	 * The feature id for the '<em><b>In Pattern Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__IN_PATTERN_TYPE = IMPERATIVE_RULE_ANN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Pattern Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE = IMPERATIVE_RULE_ANN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lazy Rule Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_RULE_ANN_FEATURE_COUNT = IMPERATIVE_RULE_ANN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.CalledRuleAnnImpl <em>Called Rule Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.CalledRuleAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getCalledRuleAnn()
	 * @generated
	 */
	int CALLED_RULE_ANN = 8;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_ANN__RULE = IMPERATIVE_RULE_ANN__RULE;

	/**
	 * The feature id for the '<em><b>Output Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_ANN__OUTPUT_PATTERNS = IMPERATIVE_RULE_ANN__OUTPUT_PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_ANN__NAME = IMPERATIVE_RULE_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_ANN__CALLED_BY = IMPERATIVE_RULE_ANN__CALLED_BY;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_ANN__ARGUMENTS = IMPERATIVE_RULE_ANN__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_ANN__NAMES = IMPERATIVE_RULE_ANN__NAMES;

	/**
	 * The feature id for the '<em><b>Argument Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_ANN__ARGUMENT_VARS = IMPERATIVE_RULE_ANN__ARGUMENT_VARS;

	/**
	 * The number of structural features of the '<em>Called Rule Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLED_RULE_ANN_FEATURE_COUNT = IMPERATIVE_RULE_ANN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.OutputPatternAnnImpl <em>Output Pattern Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.OutputPatternAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getOutputPatternAnn()
	 * @generated
	 */
	int OUTPUT_PATTERN_ANN = 9;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ANN__RULE = RULE_ANN__RULE;

	/**
	 * The feature id for the '<em><b>Output Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ANN__OUTPUT_PATTERNS = RULE_ANN__OUTPUT_PATTERNS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ANN__NAME = RULE_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Output Pattern Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT = RULE_ANN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ANN__TYPE = RULE_ANN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ANN__BINDINGS = RULE_ANN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output Pattern Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ANN_FEATURE_COUNT = RULE_ANN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl <em>Helper Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.HelperAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getHelperAnn()
	 * @generated
	 */
	int HELPER_ANN = 10;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN__CALLED_BY = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN__ARGUMENTS = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN__NAMES = ATL_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN__ARGUMENT_VARS = ATL_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN__HELPER = ATL_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN__NAME = ATL_ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN__RETURN_TYPE = ATL_ANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN__EXPR = ATL_ANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Helper Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANN_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.ModuleCallableAnnImpl <em>Module Callable Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.ModuleCallableAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getModuleCallableAnn()
	 * @generated
	 */
	int MODULE_CALLABLE_ANN = 11;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALLABLE_ANN__CALLED_BY = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALLABLE_ANN__ARGUMENTS = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALLABLE_ANN__NAMES = ATL_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALLABLE_ANN__ARGUMENT_VARS = ATL_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module Callable Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CALLABLE_ANN_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.ModuleHelperAnnImpl <em>Module Helper Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.ModuleHelperAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getModuleHelperAnn()
	 * @generated
	 */
	int MODULE_HELPER_ANN = 12;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN__CALLED_BY = HELPER_ANN__CALLED_BY;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN__ARGUMENTS = HELPER_ANN__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN__NAMES = HELPER_ANN__NAMES;

	/**
	 * The feature id for the '<em><b>Argument Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN__ARGUMENT_VARS = HELPER_ANN__ARGUMENT_VARS;

	/**
	 * The feature id for the '<em><b>Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN__HELPER = HELPER_ANN__HELPER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN__NAME = HELPER_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN__RETURN_TYPE = HELPER_ANN__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN__EXPR = HELPER_ANN__EXPR;

	/**
	 * The number of structural features of the '<em>Module Helper Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_HELPER_ANN_FEATURE_COUNT = HELPER_ANN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.ContextHelperAnnImpl <em>Context Helper Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.ContextHelperAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getContextHelperAnn()
	 * @generated
	 */
	int CONTEXT_HELPER_ANN = 13;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__CALLED_BY = HELPER_ANN__CALLED_BY;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__ARGUMENTS = HELPER_ANN__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__NAMES = HELPER_ANN__NAMES;

	/**
	 * The feature id for the '<em><b>Argument Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__ARGUMENT_VARS = HELPER_ANN__ARGUMENT_VARS;

	/**
	 * The feature id for the '<em><b>Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__HELPER = HELPER_ANN__HELPER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__NAME = HELPER_ANN__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__RETURN_TYPE = HELPER_ANN__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__EXPR = HELPER_ANN__EXPR;

	/**
	 * The feature id for the '<em><b>Context Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__CONTEXT_TYPE = HELPER_ANN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Polymorphic Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN__POLYMORPHIC_CALLED_BY = HELPER_ANN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Helper Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_HELPER_ANN_FEATURE_COUNT = HELPER_ANN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl <em>Binding Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.BindingAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getBindingAnn()
	 * @generated
	 */
	int BINDING_ANN = 14;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__RULE = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__BINDING = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__NAME = ATL_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__SOURCE_TYPE = ATL_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__TARGET_TYPE = ATL_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Written Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__WRITTEN_FEATURE = ATL_ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__VALUE = ATL_ANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__RESOLVED_BY = ATL_ANNOTATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Control Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN__CONTROL_FLOW = ATL_ANNOTATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Binding Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANN_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.RuleResolutionInfoImpl <em>Rule Resolution Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.RuleResolutionInfoImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getRuleResolutionInfo()
	 * @generated
	 */
	int RULE_RESOLUTION_INFO = 15;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESOLUTION_INFO__RULE = 0;

	/**
	 * The feature id for the '<em><b>All Involved Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESOLUTION_INFO__ALL_INVOLVED_RULES = 1;

	/**
	 * The number of structural features of the '<em>Rule Resolution Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_RESOLUTION_INFO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl <em>Expression Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getExpressionAnnotation()
	 * @generated
	 */
	int EXPRESSION_ANNOTATION = 16;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ANNOTATION__EXPR = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ANNOTATION__TYPE = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ANNOTATION__USED_FEATURE = ATL_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ANNOTATION__RECEPTOR_TYPE = ATL_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Expression Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ANNOTATION_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.LetExprAnnImpl <em>Let Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.LetExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getLetExprAnn()
	 * @generated
	 */
	int LET_EXPR_ANN = 17;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPR_ANN__EXPR = EXPRESSION_ANNOTATION__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPR_ANN__TYPE = EXPRESSION_ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPR_ANN__USED_FEATURE = EXPRESSION_ANNOTATION__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPR_ANN__RECEPTOR_TYPE = EXPRESSION_ANNOTATION__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPR_ANN__INIT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPR_ANN__BODY = EXPRESSION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPR_ANN_FEATURE_COUNT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.IfExprAnnImpl <em>If Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.IfExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getIfExprAnn()
	 * @generated
	 */
	int IF_EXPR_ANN = 18;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_ANN__EXPR = EXPRESSION_ANNOTATION__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_ANN__TYPE = EXPRESSION_ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_ANN__USED_FEATURE = EXPRESSION_ANNOTATION__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_ANN__RECEPTOR_TYPE = EXPRESSION_ANNOTATION__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_ANN__IF_CONDITION = EXPRESSION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_ANN__THEN_PART = EXPRESSION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_ANN__ELSE_PART = EXPRESSION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPR_ANN_FEATURE_COUNT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.CallExprAnnImpl <em>Call Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.CallExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getCallExprAnn()
	 * @generated
	 */
	int CALL_EXPR_ANN = 19;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__EXPR = EXPRESSION_ANNOTATION__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__TYPE = EXPRESSION_ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__USED_FEATURE = EXPRESSION_ANNOTATION__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__RECEPTOR_TYPE = EXPRESSION_ANNOTATION__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__SOURCE = EXPRESSION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__ARGUMENTS = EXPRESSION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Static Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__IS_STATIC_CALL = EXPRESSION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Static Resolver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__STATIC_RESOLVER = EXPRESSION_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dynamic Resolvers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN__DYNAMIC_RESOLVERS = EXPRESSION_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Call Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXPR_ANN_FEATURE_COUNT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.AbstractIteratorExprAnnImpl <em>Abstract Iterator Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.AbstractIteratorExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getAbstractIteratorExprAnn()
	 * @generated
	 */
	int ABSTRACT_ITERATOR_EXPR_ANN = 20;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITERATOR_EXPR_ANN__EXPR = EXPRESSION_ANNOTATION__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITERATOR_EXPR_ANN__TYPE = EXPRESSION_ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITERATOR_EXPR_ANN__USED_FEATURE = EXPRESSION_ANNOTATION__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITERATOR_EXPR_ANN__RECEPTOR_TYPE = EXPRESSION_ANNOTATION__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITERATOR_EXPR_ANN__SOURCE = EXPRESSION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITERATOR_EXPR_ANN__BODY = EXPRESSION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Iterator Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ITERATOR_EXPR_ANN_FEATURE_COUNT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.IteratorExprAnnImpl <em>Iterator Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.IteratorExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getIteratorExprAnn()
	 * @generated
	 */
	int ITERATOR_EXPR_ANN = 21;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXPR_ANN__EXPR = ABSTRACT_ITERATOR_EXPR_ANN__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXPR_ANN__TYPE = ABSTRACT_ITERATOR_EXPR_ANN__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXPR_ANN__USED_FEATURE = ABSTRACT_ITERATOR_EXPR_ANN__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXPR_ANN__RECEPTOR_TYPE = ABSTRACT_ITERATOR_EXPR_ANN__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXPR_ANN__SOURCE = ABSTRACT_ITERATOR_EXPR_ANN__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXPR_ANN__BODY = ABSTRACT_ITERATOR_EXPR_ANN__BODY;

	/**
	 * The number of structural features of the '<em>Iterator Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXPR_ANN_FEATURE_COUNT = ABSTRACT_ITERATOR_EXPR_ANN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.IterateExprAnnImpl <em>Iterate Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.IterateExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getIterateExprAnn()
	 * @generated
	 */
	int ITERATE_EXPR_ANN = 22;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXPR_ANN__EXPR = ABSTRACT_ITERATOR_EXPR_ANN__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXPR_ANN__TYPE = ABSTRACT_ITERATOR_EXPR_ANN__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXPR_ANN__USED_FEATURE = ABSTRACT_ITERATOR_EXPR_ANN__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXPR_ANN__RECEPTOR_TYPE = ABSTRACT_ITERATOR_EXPR_ANN__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXPR_ANN__SOURCE = ABSTRACT_ITERATOR_EXPR_ANN__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXPR_ANN__BODY = ABSTRACT_ITERATOR_EXPR_ANN__BODY;

	/**
	 * The feature id for the '<em><b>Result Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXPR_ANN__RESULT_VAR = ABSTRACT_ITERATOR_EXPR_ANN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterate Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXPR_ANN_FEATURE_COUNT = ABSTRACT_ITERATOR_EXPR_ANN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.CollectionExprAnnImpl <em>Collection Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.CollectionExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getCollectionExprAnn()
	 * @generated
	 */
	int COLLECTION_EXPR_ANN = 23;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPR_ANN__EXPR = EXPRESSION_ANNOTATION__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPR_ANN__TYPE = EXPRESSION_ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPR_ANN__USED_FEATURE = EXPRESSION_ANNOTATION__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPR_ANN__RECEPTOR_TYPE = EXPRESSION_ANNOTATION__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPR_ANN__INITIALIZERS = EXPRESSION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPR_ANN_FEATURE_COUNT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.MapExprAnnImpl <em>Map Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.MapExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getMapExprAnn()
	 * @generated
	 */
	int MAP_EXPR_ANN = 24;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_ANN__EXPR = EXPRESSION_ANNOTATION__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_ANN__TYPE = EXPRESSION_ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_ANN__USED_FEATURE = EXPRESSION_ANNOTATION__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_ANN__RECEPTOR_TYPE = EXPRESSION_ANNOTATION__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Key Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_ANN__KEY_INITIALIZERS = EXPRESSION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_ANN__VALUE_INITIALIZERS = EXPRESSION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXPR_ANN_FEATURE_COUNT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.TupleExprAnnImpl <em>Tuple Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.TupleExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getTupleExprAnn()
	 * @generated
	 */
	int TUPLE_EXPR_ANN = 25;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXPR_ANN__EXPR = EXPRESSION_ANNOTATION__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXPR_ANN__TYPE = EXPRESSION_ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXPR_ANN__USED_FEATURE = EXPRESSION_ANNOTATION__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXPR_ANN__RECEPTOR_TYPE = EXPRESSION_ANNOTATION__RECEPTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXPR_ANN__PARTS = EXPRESSION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXPR_ANN_FEATURE_COUNT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.GenericExprAnnImpl <em>Generic Expr Ann</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.GenericExprAnnImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getGenericExprAnn()
	 * @generated
	 */
	int GENERIC_EXPR_ANN = 26;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXPR_ANN__EXPR = EXPRESSION_ANNOTATION__EXPR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXPR_ANN__TYPE = EXPRESSION_ANNOTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Used Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXPR_ANN__USED_FEATURE = EXPRESSION_ANNOTATION__USED_FEATURE;

	/**
	 * The feature id for the '<em><b>Receptor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXPR_ANN__RECEPTOR_TYPE = EXPRESSION_ANNOTATION__RECEPTOR_TYPE;

	/**
	 * The number of structural features of the '<em>Generic Expr Ann</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EXPR_ANN_FEATURE_COUNT = EXPRESSION_ANNOTATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.AtlAnnotation <em>Atl Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atl Annotation</em>'.
	 * @see genericity.typing.atl_types.annotations.AtlAnnotation
	 * @generated
	 */
	EClass getAtlAnnotation();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.TransformationAnn <em>Transformation Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.TransformationAnn
	 * @generated
	 */
	EClass getTransformationAnn();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.TransformationAnn#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see genericity.typing.atl_types.annotations.TransformationAnn#getModule()
	 * @see #getTransformationAnn()
	 * @generated
	 */
	EReference getTransformationAnn_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.TransformationAnn#getMatchedRules <em>Matched Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matched Rules</em>'.
	 * @see genericity.typing.atl_types.annotations.TransformationAnn#getMatchedRules()
	 * @see #getTransformationAnn()
	 * @generated
	 */
	EReference getTransformationAnn_MatchedRules();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.TransformationAnn#getCalledRules <em>Called Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Called Rules</em>'.
	 * @see genericity.typing.atl_types.annotations.TransformationAnn#getCalledRules()
	 * @see #getTransformationAnn()
	 * @generated
	 */
	EReference getTransformationAnn_CalledRules();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.TransformationAnn#getLazyRules <em>Lazy Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lazy Rules</em>'.
	 * @see genericity.typing.atl_types.annotations.TransformationAnn#getLazyRules()
	 * @see #getTransformationAnn()
	 * @generated
	 */
	EReference getTransformationAnn_LazyRules();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.TransformationAnn#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helpers</em>'.
	 * @see genericity.typing.atl_types.annotations.TransformationAnn#getHelpers()
	 * @see #getTransformationAnn()
	 * @generated
	 */
	EReference getTransformationAnn_Helpers();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.RuleAnn <em>Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.RuleAnn
	 * @generated
	 */
	EClass getRuleAnn();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.RuleAnn#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see genericity.typing.atl_types.annotations.RuleAnn#getRule()
	 * @see #getRuleAnn()
	 * @generated
	 */
	EReference getRuleAnn_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.RuleAnn#getOutputPatterns <em>Output Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Patterns</em>'.
	 * @see genericity.typing.atl_types.annotations.RuleAnn#getOutputPatterns()
	 * @see #getRuleAnn()
	 * @generated
	 */
	EReference getRuleAnn_OutputPatterns();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.annotations.RuleAnn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.typing.atl_types.annotations.RuleAnn#getName()
	 * @see #getRuleAnn()
	 * @generated
	 */
	EAttribute getRuleAnn_Name();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.MatchedRuleAnn <em>Matched Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Rule Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleAnn
	 * @generated
	 */
	EClass getMatchedRuleAnn();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.MatchedRuleAnn#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleAnn#getFilter()
	 * @see #getMatchedRuleAnn()
	 * @generated
	 */
	EReference getMatchedRuleAnn_Filter();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.MatchedRuleAnn#getOutputPatternType <em>Output Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Pattern Type</em>'.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleAnn#getOutputPatternType()
	 * @see #getMatchedRuleAnn()
	 * @generated
	 */
	EReference getMatchedRuleAnn_OutputPatternType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.MatchedRuleOneAnn <em>Matched Rule One Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Rule One Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleOneAnn
	 * @generated
	 */
	EClass getMatchedRuleOneAnn();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.MatchedRuleOneAnn#getInPatternType <em>In Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Pattern Type</em>'.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleOneAnn#getInPatternType()
	 * @see #getMatchedRuleOneAnn()
	 * @generated
	 */
	EReference getMatchedRuleOneAnn_InPatternType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.MatchedRuleManyAnn <em>Matched Rule Many Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matched Rule Many Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleManyAnn
	 * @generated
	 */
	EClass getMatchedRuleManyAnn();

	/**
	 * Returns the meta object for the reference list '{@link genericity.typing.atl_types.annotations.MatchedRuleManyAnn#getInPatternTypes <em>In Pattern Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Pattern Types</em>'.
	 * @see genericity.typing.atl_types.annotations.MatchedRuleManyAnn#getInPatternTypes()
	 * @see #getMatchedRuleManyAnn()
	 * @generated
	 */
	EReference getMatchedRuleManyAnn_InPatternTypes();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.ImperativeRuleAnn <em>Imperative Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Rule Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.ImperativeRuleAnn
	 * @generated
	 */
	EClass getImperativeRuleAnn();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.LazyRuleAnn <em>Lazy Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lazy Rule Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.LazyRuleAnn
	 * @generated
	 */
	EClass getLazyRuleAnn();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.LazyRuleAnn#getInPatternType <em>In Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Pattern Type</em>'.
	 * @see genericity.typing.atl_types.annotations.LazyRuleAnn#getInPatternType()
	 * @see #getLazyRuleAnn()
	 * @generated
	 */
	EReference getLazyRuleAnn_InPatternType();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.LazyRuleAnn#getOutputPatternType <em>Output Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Pattern Type</em>'.
	 * @see genericity.typing.atl_types.annotations.LazyRuleAnn#getOutputPatternType()
	 * @see #getLazyRuleAnn()
	 * @generated
	 */
	EReference getLazyRuleAnn_OutputPatternType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.CalledRuleAnn <em>Called Rule Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Called Rule Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.CalledRuleAnn
	 * @generated
	 */
	EClass getCalledRuleAnn();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.OutputPatternAnn <em>Output Pattern Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pattern Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.OutputPatternAnn
	 * @generated
	 */
	EClass getOutputPatternAnn();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.OutputPatternAnn#getOutputPatternElement <em>Output Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Pattern Element</em>'.
	 * @see genericity.typing.atl_types.annotations.OutputPatternAnn#getOutputPatternElement()
	 * @see #getOutputPatternAnn()
	 * @generated
	 */
	EReference getOutputPatternAnn_OutputPatternElement();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.OutputPatternAnn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see genericity.typing.atl_types.annotations.OutputPatternAnn#getType()
	 * @see #getOutputPatternAnn()
	 * @generated
	 */
	EReference getOutputPatternAnn_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.OutputPatternAnn#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see genericity.typing.atl_types.annotations.OutputPatternAnn#getBindings()
	 * @see #getOutputPatternAnn()
	 * @generated
	 */
	EReference getOutputPatternAnn_Bindings();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.HelperAnn <em>Helper Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnn
	 * @generated
	 */
	EClass getHelperAnn();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.HelperAnn#getHelper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Helper</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnn#getHelper()
	 * @see #getHelperAnn()
	 * @generated
	 */
	EReference getHelperAnn_Helper();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.annotations.HelperAnn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnn#getName()
	 * @see #getHelperAnn()
	 * @generated
	 */
	EAttribute getHelperAnn_Name();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.HelperAnn#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnn#getReturnType()
	 * @see #getHelperAnn()
	 * @generated
	 */
	EReference getHelperAnn_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.HelperAnn#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnn#getExpr()
	 * @see #getHelperAnn()
	 * @generated
	 */
	EReference getHelperAnn_Expr();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.ModuleCallableAnn <em>Module Callable Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Callable Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.ModuleCallableAnn
	 * @generated
	 */
	EClass getModuleCallableAnn();

	/**
	 * Returns the meta object for the reference list '{@link genericity.typing.atl_types.annotations.ModuleCallableAnn#getCalledBy <em>Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Called By</em>'.
	 * @see genericity.typing.atl_types.annotations.ModuleCallableAnn#getCalledBy()
	 * @see #getModuleCallableAnn()
	 * @generated
	 */
	EReference getModuleCallableAnn_CalledBy();

	/**
	 * Returns the meta object for the reference list '{@link genericity.typing.atl_types.annotations.ModuleCallableAnn#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see genericity.typing.atl_types.annotations.ModuleCallableAnn#getArguments()
	 * @see #getModuleCallableAnn()
	 * @generated
	 */
	EReference getModuleCallableAnn_Arguments();

	/**
	 * Returns the meta object for the attribute list '{@link genericity.typing.atl_types.annotations.ModuleCallableAnn#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Names</em>'.
	 * @see genericity.typing.atl_types.annotations.ModuleCallableAnn#getNames()
	 * @see #getModuleCallableAnn()
	 * @generated
	 */
	EAttribute getModuleCallableAnn_Names();

	/**
	 * Returns the meta object for the reference list '{@link genericity.typing.atl_types.annotations.ModuleCallableAnn#getArgumentVars <em>Argument Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Vars</em>'.
	 * @see genericity.typing.atl_types.annotations.ModuleCallableAnn#getArgumentVars()
	 * @see #getModuleCallableAnn()
	 * @generated
	 */
	EReference getModuleCallableAnn_ArgumentVars();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.ModuleHelperAnn <em>Module Helper Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Helper Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.ModuleHelperAnn
	 * @generated
	 */
	EClass getModuleHelperAnn();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.ContextHelperAnn <em>Context Helper Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Helper Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.ContextHelperAnn
	 * @generated
	 */
	EClass getContextHelperAnn();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.ContextHelperAnn#getContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Type</em>'.
	 * @see genericity.typing.atl_types.annotations.ContextHelperAnn#getContextType()
	 * @see #getContextHelperAnn()
	 * @generated
	 */
	EReference getContextHelperAnn_ContextType();

	/**
	 * Returns the meta object for the reference list '{@link genericity.typing.atl_types.annotations.ContextHelperAnn#getPolymorphicCalledBy <em>Polymorphic Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polymorphic Called By</em>'.
	 * @see genericity.typing.atl_types.annotations.ContextHelperAnn#getPolymorphicCalledBy()
	 * @see #getContextHelperAnn()
	 * @generated
	 */
	EReference getContextHelperAnn_PolymorphicCalledBy();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.BindingAnn <em>Binding Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn
	 * @generated
	 */
	EClass getBindingAnn();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnn#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getRule()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EReference getBindingAnn_Rule();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnn#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getBinding()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EReference getBindingAnn_Binding();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.annotations.BindingAnn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getName()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EAttribute getBindingAnn_Name();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnn#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getSourceType()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EReference getBindingAnn_SourceType();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnn#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getTargetType()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EReference getBindingAnn_TargetType();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnn#getWrittenFeature <em>Written Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Written Feature</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getWrittenFeature()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EReference getBindingAnn_WrittenFeature();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.BindingAnn#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getValue()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EReference getBindingAnn_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.BindingAnn#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolved By</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getResolvedBy()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EReference getBindingAnn_ResolvedBy();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnn#getControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Flow</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnn#getControlFlow()
	 * @see #getBindingAnn()
	 * @generated
	 */
	EReference getBindingAnn_ControlFlow();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.RuleResolutionInfo <em>Rule Resolution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Resolution Info</em>'.
	 * @see genericity.typing.atl_types.annotations.RuleResolutionInfo
	 * @generated
	 */
	EClass getRuleResolutionInfo();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.RuleResolutionInfo#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see genericity.typing.atl_types.annotations.RuleResolutionInfo#getRule()
	 * @see #getRuleResolutionInfo()
	 * @generated
	 */
	EReference getRuleResolutionInfo_Rule();

	/**
	 * Returns the meta object for the reference list '{@link genericity.typing.atl_types.annotations.RuleResolutionInfo#getAllInvolvedRules <em>All Involved Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Involved Rules</em>'.
	 * @see genericity.typing.atl_types.annotations.RuleResolutionInfo#getAllInvolvedRules()
	 * @see #getRuleResolutionInfo()
	 * @generated
	 */
	EReference getRuleResolutionInfo_AllInvolvedRules();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation <em>Expression Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Annotation</em>'.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation
	 * @generated
	 */
	EClass getExpressionAnnotation();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr</em>'.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation#getExpr()
	 * @see #getExpressionAnnotation()
	 * @generated
	 */
	EReference getExpressionAnnotation_Expr();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation#getType()
	 * @see #getExpressionAnnotation()
	 * @generated
	 */
	EReference getExpressionAnnotation_Type();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getUsedFeature <em>Used Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used Feature</em>'.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation#getUsedFeature()
	 * @see #getExpressionAnnotation()
	 * @generated
	 */
	EReference getExpressionAnnotation_UsedFeature();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getReceptorType <em>Receptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receptor Type</em>'.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation#getReceptorType()
	 * @see #getExpressionAnnotation()
	 * @generated
	 */
	EReference getExpressionAnnotation_ReceptorType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.LetExprAnn <em>Let Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.LetExprAnn
	 * @generated
	 */
	EClass getLetExprAnn();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.LetExprAnn#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see genericity.typing.atl_types.annotations.LetExprAnn#getInit()
	 * @see #getLetExprAnn()
	 * @generated
	 */
	EReference getLetExprAnn_Init();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.LetExprAnn#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see genericity.typing.atl_types.annotations.LetExprAnn#getBody()
	 * @see #getLetExprAnn()
	 * @generated
	 */
	EReference getLetExprAnn_Body();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.IfExprAnn <em>If Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.IfExprAnn
	 * @generated
	 */
	EClass getIfExprAnn();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.IfExprAnn#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Condition</em>'.
	 * @see genericity.typing.atl_types.annotations.IfExprAnn#getIfCondition()
	 * @see #getIfExprAnn()
	 * @generated
	 */
	EReference getIfExprAnn_IfCondition();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.IfExprAnn#getThenPart <em>Then Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Part</em>'.
	 * @see genericity.typing.atl_types.annotations.IfExprAnn#getThenPart()
	 * @see #getIfExprAnn()
	 * @generated
	 */
	EReference getIfExprAnn_ThenPart();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.IfExprAnn#getElsePart <em>Else Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Part</em>'.
	 * @see genericity.typing.atl_types.annotations.IfExprAnn#getElsePart()
	 * @see #getIfExprAnn()
	 * @generated
	 */
	EReference getIfExprAnn_ElsePart();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.CallExprAnn <em>Call Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.CallExprAnn
	 * @generated
	 */
	EClass getCallExprAnn();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.CallExprAnn#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see genericity.typing.atl_types.annotations.CallExprAnn#getSource()
	 * @see #getCallExprAnn()
	 * @generated
	 */
	EReference getCallExprAnn_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.CallExprAnn#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see genericity.typing.atl_types.annotations.CallExprAnn#getArguments()
	 * @see #getCallExprAnn()
	 * @generated
	 */
	EReference getCallExprAnn_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.annotations.CallExprAnn#isIsStaticCall <em>Is Static Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static Call</em>'.
	 * @see genericity.typing.atl_types.annotations.CallExprAnn#isIsStaticCall()
	 * @see #getCallExprAnn()
	 * @generated
	 */
	EAttribute getCallExprAnn_IsStaticCall();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.CallExprAnn#getStaticResolver <em>Static Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Static Resolver</em>'.
	 * @see genericity.typing.atl_types.annotations.CallExprAnn#getStaticResolver()
	 * @see #getCallExprAnn()
	 * @generated
	 */
	EReference getCallExprAnn_StaticResolver();

	/**
	 * Returns the meta object for the reference list '{@link genericity.typing.atl_types.annotations.CallExprAnn#getDynamicResolvers <em>Dynamic Resolvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dynamic Resolvers</em>'.
	 * @see genericity.typing.atl_types.annotations.CallExprAnn#getDynamicResolvers()
	 * @see #getCallExprAnn()
	 * @generated
	 */
	EReference getCallExprAnn_DynamicResolvers();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.AbstractIteratorExprAnn <em>Abstract Iterator Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Iterator Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.AbstractIteratorExprAnn
	 * @generated
	 */
	EClass getAbstractIteratorExprAnn();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.AbstractIteratorExprAnn#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see genericity.typing.atl_types.annotations.AbstractIteratorExprAnn#getSource()
	 * @see #getAbstractIteratorExprAnn()
	 * @generated
	 */
	EReference getAbstractIteratorExprAnn_Source();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.AbstractIteratorExprAnn#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see genericity.typing.atl_types.annotations.AbstractIteratorExprAnn#getBody()
	 * @see #getAbstractIteratorExprAnn()
	 * @generated
	 */
	EReference getAbstractIteratorExprAnn_Body();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.IteratorExprAnn <em>Iterator Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.IteratorExprAnn
	 * @generated
	 */
	EClass getIteratorExprAnn();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.IterateExprAnn <em>Iterate Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.IterateExprAnn
	 * @generated
	 */
	EClass getIterateExprAnn();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.annotations.IterateExprAnn#getResultVar <em>Result Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Var</em>'.
	 * @see genericity.typing.atl_types.annotations.IterateExprAnn#getResultVar()
	 * @see #getIterateExprAnn()
	 * @generated
	 */
	EReference getIterateExprAnn_ResultVar();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.CollectionExprAnn <em>Collection Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.CollectionExprAnn
	 * @generated
	 */
	EClass getCollectionExprAnn();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.CollectionExprAnn#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializers</em>'.
	 * @see genericity.typing.atl_types.annotations.CollectionExprAnn#getInitializers()
	 * @see #getCollectionExprAnn()
	 * @generated
	 */
	EReference getCollectionExprAnn_Initializers();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.MapExprAnn <em>Map Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.MapExprAnn
	 * @generated
	 */
	EClass getMapExprAnn();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.MapExprAnn#getKeyInitializers <em>Key Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Initializers</em>'.
	 * @see genericity.typing.atl_types.annotations.MapExprAnn#getKeyInitializers()
	 * @see #getMapExprAnn()
	 * @generated
	 */
	EReference getMapExprAnn_KeyInitializers();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.MapExprAnn#getValueInitializers <em>Value Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Initializers</em>'.
	 * @see genericity.typing.atl_types.annotations.MapExprAnn#getValueInitializers()
	 * @see #getMapExprAnn()
	 * @generated
	 */
	EReference getMapExprAnn_ValueInitializers();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.TupleExprAnn <em>Tuple Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.TupleExprAnn
	 * @generated
	 */
	EClass getTupleExprAnn();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.annotations.TupleExprAnn#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see genericity.typing.atl_types.annotations.TupleExprAnn#getParts()
	 * @see #getTupleExprAnn()
	 * @generated
	 */
	EReference getTupleExprAnn_Parts();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.GenericExprAnn <em>Generic Expr Ann</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Expr Ann</em>'.
	 * @see genericity.typing.atl_types.annotations.GenericExprAnn
	 * @generated
	 */
	EClass getGenericExprAnn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationsFactory getAnnotationsFactory();

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
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.AtlAnnotationImpl <em>Atl Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.AtlAnnotationImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getAtlAnnotation()
		 * @generated
		 */
		EClass ATL_ANNOTATION = eINSTANCE.getAtlAnnotation();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.TransformationAnnImpl <em>Transformation Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.TransformationAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getTransformationAnn()
		 * @generated
		 */
		EClass TRANSFORMATION_ANN = eINSTANCE.getTransformationAnn();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_ANN__MODULE = eINSTANCE.getTransformationAnn_Module();

		/**
		 * The meta object literal for the '<em><b>Matched Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_ANN__MATCHED_RULES = eINSTANCE.getTransformationAnn_MatchedRules();

		/**
		 * The meta object literal for the '<em><b>Called Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_ANN__CALLED_RULES = eINSTANCE.getTransformationAnn_CalledRules();

		/**
		 * The meta object literal for the '<em><b>Lazy Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_ANN__LAZY_RULES = eINSTANCE.getTransformationAnn_LazyRules();

		/**
		 * The meta object literal for the '<em><b>Helpers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_ANN__HELPERS = eINSTANCE.getTransformationAnn_Helpers();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.RuleAnnImpl <em>Rule Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.RuleAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getRuleAnn()
		 * @generated
		 */
		EClass RULE_ANN = eINSTANCE.getRuleAnn();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ANN__RULE = eINSTANCE.getRuleAnn_Rule();

		/**
		 * The meta object literal for the '<em><b>Output Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ANN__OUTPUT_PATTERNS = eINSTANCE.getRuleAnn_OutputPatterns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ANN__NAME = eINSTANCE.getRuleAnn_Name();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.MatchedRuleAnnImpl <em>Matched Rule Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.MatchedRuleAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getMatchedRuleAnn()
		 * @generated
		 */
		EClass MATCHED_RULE_ANN = eINSTANCE.getMatchedRuleAnn();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_RULE_ANN__FILTER = eINSTANCE.getMatchedRuleAnn_Filter();

		/**
		 * The meta object literal for the '<em><b>Output Pattern Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_RULE_ANN__OUTPUT_PATTERN_TYPE = eINSTANCE.getMatchedRuleAnn_OutputPatternType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.MatchedRuleOneAnnImpl <em>Matched Rule One Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.MatchedRuleOneAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getMatchedRuleOneAnn()
		 * @generated
		 */
		EClass MATCHED_RULE_ONE_ANN = eINSTANCE.getMatchedRuleOneAnn();

		/**
		 * The meta object literal for the '<em><b>In Pattern Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_RULE_ONE_ANN__IN_PATTERN_TYPE = eINSTANCE.getMatchedRuleOneAnn_InPatternType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.MatchedRuleManyAnnImpl <em>Matched Rule Many Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.MatchedRuleManyAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getMatchedRuleManyAnn()
		 * @generated
		 */
		EClass MATCHED_RULE_MANY_ANN = eINSTANCE.getMatchedRuleManyAnn();

		/**
		 * The meta object literal for the '<em><b>In Pattern Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHED_RULE_MANY_ANN__IN_PATTERN_TYPES = eINSTANCE.getMatchedRuleManyAnn_InPatternTypes();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.ImperativeRuleAnnImpl <em>Imperative Rule Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.ImperativeRuleAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getImperativeRuleAnn()
		 * @generated
		 */
		EClass IMPERATIVE_RULE_ANN = eINSTANCE.getImperativeRuleAnn();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.LazyRuleAnnImpl <em>Lazy Rule Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.LazyRuleAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getLazyRuleAnn()
		 * @generated
		 */
		EClass LAZY_RULE_ANN = eINSTANCE.getLazyRuleAnn();

		/**
		 * The meta object literal for the '<em><b>In Pattern Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAZY_RULE_ANN__IN_PATTERN_TYPE = eINSTANCE.getLazyRuleAnn_InPatternType();

		/**
		 * The meta object literal for the '<em><b>Output Pattern Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAZY_RULE_ANN__OUTPUT_PATTERN_TYPE = eINSTANCE.getLazyRuleAnn_OutputPatternType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.CalledRuleAnnImpl <em>Called Rule Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.CalledRuleAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getCalledRuleAnn()
		 * @generated
		 */
		EClass CALLED_RULE_ANN = eINSTANCE.getCalledRuleAnn();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.OutputPatternAnnImpl <em>Output Pattern Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.OutputPatternAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getOutputPatternAnn()
		 * @generated
		 */
		EClass OUTPUT_PATTERN_ANN = eINSTANCE.getOutputPatternAnn();

		/**
		 * The meta object literal for the '<em><b>Output Pattern Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT = eINSTANCE.getOutputPatternAnn_OutputPatternElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PATTERN_ANN__TYPE = eINSTANCE.getOutputPatternAnn_Type();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PATTERN_ANN__BINDINGS = eINSTANCE.getOutputPatternAnn_Bindings();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl <em>Helper Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.HelperAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getHelperAnn()
		 * @generated
		 */
		EClass HELPER_ANN = eINSTANCE.getHelperAnn();

		/**
		 * The meta object literal for the '<em><b>Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_ANN__HELPER = eINSTANCE.getHelperAnn_Helper();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_ANN__NAME = eINSTANCE.getHelperAnn_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_ANN__RETURN_TYPE = eINSTANCE.getHelperAnn_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_ANN__EXPR = eINSTANCE.getHelperAnn_Expr();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.ModuleCallableAnnImpl <em>Module Callable Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.ModuleCallableAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getModuleCallableAnn()
		 * @generated
		 */
		EClass MODULE_CALLABLE_ANN = eINSTANCE.getModuleCallableAnn();

		/**
		 * The meta object literal for the '<em><b>Called By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CALLABLE_ANN__CALLED_BY = eINSTANCE.getModuleCallableAnn_CalledBy();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CALLABLE_ANN__ARGUMENTS = eINSTANCE.getModuleCallableAnn_Arguments();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_CALLABLE_ANN__NAMES = eINSTANCE.getModuleCallableAnn_Names();

		/**
		 * The meta object literal for the '<em><b>Argument Vars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CALLABLE_ANN__ARGUMENT_VARS = eINSTANCE.getModuleCallableAnn_ArgumentVars();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.ModuleHelperAnnImpl <em>Module Helper Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.ModuleHelperAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getModuleHelperAnn()
		 * @generated
		 */
		EClass MODULE_HELPER_ANN = eINSTANCE.getModuleHelperAnn();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.ContextHelperAnnImpl <em>Context Helper Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.ContextHelperAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getContextHelperAnn()
		 * @generated
		 */
		EClass CONTEXT_HELPER_ANN = eINSTANCE.getContextHelperAnn();

		/**
		 * The meta object literal for the '<em><b>Context Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_HELPER_ANN__CONTEXT_TYPE = eINSTANCE.getContextHelperAnn_ContextType();

		/**
		 * The meta object literal for the '<em><b>Polymorphic Called By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_HELPER_ANN__POLYMORPHIC_CALLED_BY = eINSTANCE.getContextHelperAnn_PolymorphicCalledBy();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.BindingAnnImpl <em>Binding Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.BindingAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getBindingAnn()
		 * @generated
		 */
		EClass BINDING_ANN = eINSTANCE.getBindingAnn();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANN__RULE = eINSTANCE.getBindingAnn_Rule();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANN__BINDING = eINSTANCE.getBindingAnn_Binding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_ANN__NAME = eINSTANCE.getBindingAnn_Name();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANN__SOURCE_TYPE = eINSTANCE.getBindingAnn_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANN__TARGET_TYPE = eINSTANCE.getBindingAnn_TargetType();

		/**
		 * The meta object literal for the '<em><b>Written Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANN__WRITTEN_FEATURE = eINSTANCE.getBindingAnn_WrittenFeature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANN__VALUE = eINSTANCE.getBindingAnn_Value();

		/**
		 * The meta object literal for the '<em><b>Resolved By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANN__RESOLVED_BY = eINSTANCE.getBindingAnn_ResolvedBy();

		/**
		 * The meta object literal for the '<em><b>Control Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANN__CONTROL_FLOW = eINSTANCE.getBindingAnn_ControlFlow();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.RuleResolutionInfoImpl <em>Rule Resolution Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.RuleResolutionInfoImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getRuleResolutionInfo()
		 * @generated
		 */
		EClass RULE_RESOLUTION_INFO = eINSTANCE.getRuleResolutionInfo();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_RESOLUTION_INFO__RULE = eINSTANCE.getRuleResolutionInfo_Rule();

		/**
		 * The meta object literal for the '<em><b>All Involved Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_RESOLUTION_INFO__ALL_INVOLVED_RULES = eINSTANCE.getRuleResolutionInfo_AllInvolvedRules();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl <em>Expression Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getExpressionAnnotation()
		 * @generated
		 */
		EClass EXPRESSION_ANNOTATION = eINSTANCE.getExpressionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ANNOTATION__EXPR = eINSTANCE.getExpressionAnnotation_Expr();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ANNOTATION__TYPE = eINSTANCE.getExpressionAnnotation_Type();

		/**
		 * The meta object literal for the '<em><b>Used Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ANNOTATION__USED_FEATURE = eINSTANCE.getExpressionAnnotation_UsedFeature();

		/**
		 * The meta object literal for the '<em><b>Receptor Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ANNOTATION__RECEPTOR_TYPE = eINSTANCE.getExpressionAnnotation_ReceptorType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.LetExprAnnImpl <em>Let Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.LetExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getLetExprAnn()
		 * @generated
		 */
		EClass LET_EXPR_ANN = eINSTANCE.getLetExprAnn();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPR_ANN__INIT = eINSTANCE.getLetExprAnn_Init();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPR_ANN__BODY = eINSTANCE.getLetExprAnn_Body();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.IfExprAnnImpl <em>If Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.IfExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getIfExprAnn()
		 * @generated
		 */
		EClass IF_EXPR_ANN = eINSTANCE.getIfExprAnn();

		/**
		 * The meta object literal for the '<em><b>If Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPR_ANN__IF_CONDITION = eINSTANCE.getIfExprAnn_IfCondition();

		/**
		 * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPR_ANN__THEN_PART = eINSTANCE.getIfExprAnn_ThenPart();

		/**
		 * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPR_ANN__ELSE_PART = eINSTANCE.getIfExprAnn_ElsePart();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.CallExprAnnImpl <em>Call Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.CallExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getCallExprAnn()
		 * @generated
		 */
		EClass CALL_EXPR_ANN = eINSTANCE.getCallExprAnn();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EXPR_ANN__SOURCE = eINSTANCE.getCallExprAnn_Source();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EXPR_ANN__ARGUMENTS = eINSTANCE.getCallExprAnn_Arguments();

		/**
		 * The meta object literal for the '<em><b>Is Static Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_EXPR_ANN__IS_STATIC_CALL = eINSTANCE.getCallExprAnn_IsStaticCall();

		/**
		 * The meta object literal for the '<em><b>Static Resolver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EXPR_ANN__STATIC_RESOLVER = eINSTANCE.getCallExprAnn_StaticResolver();

		/**
		 * The meta object literal for the '<em><b>Dynamic Resolvers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EXPR_ANN__DYNAMIC_RESOLVERS = eINSTANCE.getCallExprAnn_DynamicResolvers();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.AbstractIteratorExprAnnImpl <em>Abstract Iterator Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.AbstractIteratorExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getAbstractIteratorExprAnn()
		 * @generated
		 */
		EClass ABSTRACT_ITERATOR_EXPR_ANN = eINSTANCE.getAbstractIteratorExprAnn();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ITERATOR_EXPR_ANN__SOURCE = eINSTANCE.getAbstractIteratorExprAnn_Source();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ITERATOR_EXPR_ANN__BODY = eINSTANCE.getAbstractIteratorExprAnn_Body();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.IteratorExprAnnImpl <em>Iterator Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.IteratorExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getIteratorExprAnn()
		 * @generated
		 */
		EClass ITERATOR_EXPR_ANN = eINSTANCE.getIteratorExprAnn();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.IterateExprAnnImpl <em>Iterate Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.IterateExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getIterateExprAnn()
		 * @generated
		 */
		EClass ITERATE_EXPR_ANN = eINSTANCE.getIterateExprAnn();

		/**
		 * The meta object literal for the '<em><b>Result Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_EXPR_ANN__RESULT_VAR = eINSTANCE.getIterateExprAnn_ResultVar();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.CollectionExprAnnImpl <em>Collection Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.CollectionExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getCollectionExprAnn()
		 * @generated
		 */
		EClass COLLECTION_EXPR_ANN = eINSTANCE.getCollectionExprAnn();

		/**
		 * The meta object literal for the '<em><b>Initializers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPR_ANN__INITIALIZERS = eINSTANCE.getCollectionExprAnn_Initializers();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.MapExprAnnImpl <em>Map Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.MapExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getMapExprAnn()
		 * @generated
		 */
		EClass MAP_EXPR_ANN = eINSTANCE.getMapExprAnn();

		/**
		 * The meta object literal for the '<em><b>Key Initializers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_EXPR_ANN__KEY_INITIALIZERS = eINSTANCE.getMapExprAnn_KeyInitializers();

		/**
		 * The meta object literal for the '<em><b>Value Initializers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_EXPR_ANN__VALUE_INITIALIZERS = eINSTANCE.getMapExprAnn_ValueInitializers();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.TupleExprAnnImpl <em>Tuple Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.TupleExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getTupleExprAnn()
		 * @generated
		 */
		EClass TUPLE_EXPR_ANN = eINSTANCE.getTupleExprAnn();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_EXPR_ANN__PARTS = eINSTANCE.getTupleExprAnn_Parts();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.GenericExprAnnImpl <em>Generic Expr Ann</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.GenericExprAnnImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getGenericExprAnn()
		 * @generated
		 */
		EClass GENERIC_EXPR_ANN = eINSTANCE.getGenericExprAnn();

	}

} //AnnotationsPackage

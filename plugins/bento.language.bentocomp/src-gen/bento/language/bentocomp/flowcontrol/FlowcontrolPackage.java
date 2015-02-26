/**
 */
package bento.language.bentocomp.flowcontrol;

import bento.language.bentocomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see bento.language.bentocomp.flowcontrol.FlowcontrolFactory
 * @model kind="package"
 * @generated
 */
public interface FlowcontrolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flowcontrol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.miso.es/bento/bentocomp/flowcontrol";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bentocomp_flowcontrol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowcontrolPackage eINSTANCE = bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.CompositionImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__STEP = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.CompositionStepImpl <em>Composition Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.CompositionStepImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getCompositionStep()
	 * @generated
	 */
	int COMPOSITION_STEP = 1;

	/**
	 * The number of structural features of the '<em>Composition Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_STEP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.ApplyImpl <em>Apply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.ApplyImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getApply()
	 * @generated
	 */
	int APPLY = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY__COMPONENT = COMPOSITION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY__INPUT_MODELS = COMPOSITION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY__OUTPUT_MODELS = COMPOSITION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Apply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_FEATURE_COUNT = COMPOSITION_STEP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.ApplyParameterImpl <em>Apply Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.ApplyParameterImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getApplyParameter()
	 * @generated
	 */
	int APPLY_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PARAMETER__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Bound Concept Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Bound Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PARAMETER__BOUND_CONCEPT = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PARAMETER__BINDING = 3;

	/**
	 * The number of structural features of the '<em>Apply Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.SeqImpl <em>Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.SeqImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getSeq()
	 * @generated
	 */
	int SEQ = 4;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__STEPS = COMPOSITION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FEATURE_COUNT = COMPOSITION_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.XorImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getXor()
	 * @generated
	 */
	int XOR = 5;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__CONDITIONS = COMPOSITION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = COMPOSITION_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.XorCondImpl <em>Xor Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.XorCondImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getXorCond()
	 * @generated
	 */
	int XOR_COND = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_COND__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_COND__STEP = 1;

	/**
	 * The number of structural features of the '<em>Xor Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_COND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.ParImpl <em>Par</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.ParImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getPar()
	 * @generated
	 */
	int PAR = 7;

	/**
	 * The number of structural features of the '<em>Par</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAR_FEATURE_COUNT = COMPOSITION_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.ExpressionImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.ValueImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 9;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.BooleanValueImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 10;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.BooleanExpressionImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.impl.FeatureRefImpl
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getFeatureRef()
	 * @generated
	 */
	int FEATURE_REF = 12;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF__FEATURE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.flowcontrol.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.flowcontrol.BooleanOperator
	 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 13;


	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference '{@link bento.language.bentocomp.flowcontrol.Composition#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Composition#getStep()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Step();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.CompositionStep <em>Composition Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Step</em>'.
	 * @see bento.language.bentocomp.flowcontrol.CompositionStep
	 * @generated
	 */
	EClass getCompositionStep();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.Apply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Apply
	 * @generated
	 */
	EClass getApply();

	/**
	 * Returns the meta object for the reference '{@link bento.language.bentocomp.flowcontrol.Apply#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Apply#getComponent()
	 * @see #getApply()
	 * @generated
	 */
	EReference getApply_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.flowcontrol.Apply#getInputModels <em>Input Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Models</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Apply#getInputModels()
	 * @see #getApply()
	 * @generated
	 */
	EReference getApply_InputModels();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.flowcontrol.Apply#getOutputModels <em>Output Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Models</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Apply#getOutputModels()
	 * @see #getApply()
	 * @generated
	 */
	EReference getApply_OutputModels();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.ApplyParameter <em>Apply Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Parameter</em>'.
	 * @see bento.language.bentocomp.flowcontrol.ApplyParameter
	 * @generated
	 */
	EClass getApplyParameter();

	/**
	 * Returns the meta object for the reference '{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see bento.language.bentocomp.flowcontrol.ApplyParameter#getModel()
	 * @see #getApplyParameter()
	 * @generated
	 */
	EReference getApplyParameter_Model();

	/**
	 * Returns the meta object for the reference '{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBoundConceptQualifier <em>Bound Concept Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Concept Qualifier</em>'.
	 * @see bento.language.bentocomp.flowcontrol.ApplyParameter#getBoundConceptQualifier()
	 * @see #getApplyParameter()
	 * @generated
	 */
	EReference getApplyParameter_BoundConceptQualifier();

	/**
	 * Returns the meta object for the reference '{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBoundConcept <em>Bound Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Concept</em>'.
	 * @see bento.language.bentocomp.flowcontrol.ApplyParameter#getBoundConcept()
	 * @see #getApplyParameter()
	 * @generated
	 */
	EReference getApplyParameter_BoundConcept();

	/**
	 * Returns the meta object for the reference '{@link bento.language.bentocomp.flowcontrol.ApplyParameter#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see bento.language.bentocomp.flowcontrol.ApplyParameter#getBinding()
	 * @see #getApplyParameter()
	 * @generated
	 */
	EReference getApplyParameter_Binding();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Seq
	 * @generated
	 */
	EClass getSeq();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.flowcontrol.Seq#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Seq#getSteps()
	 * @see #getSeq()
	 * @generated
	 */
	EReference getSeq_Steps();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.flowcontrol.Xor#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Xor#getConditions()
	 * @see #getXor()
	 * @generated
	 */
	EReference getXor_Conditions();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.XorCond <em>Xor Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Cond</em>'.
	 * @see bento.language.bentocomp.flowcontrol.XorCond
	 * @generated
	 */
	EClass getXorCond();

	/**
	 * Returns the meta object for the containment reference '{@link bento.language.bentocomp.flowcontrol.XorCond#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see bento.language.bentocomp.flowcontrol.XorCond#getValue()
	 * @see #getXorCond()
	 * @generated
	 */
	EReference getXorCond_Value();

	/**
	 * Returns the meta object for the containment reference '{@link bento.language.bentocomp.flowcontrol.XorCond#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see bento.language.bentocomp.flowcontrol.XorCond#getStep()
	 * @see #getXorCond()
	 * @generated
	 */
	EReference getXorCond_Step();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.Par <em>Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Par</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Par
	 * @generated
	 */
	EClass getPar();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see bento.language.bentocomp.flowcontrol.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see bento.language.bentocomp.flowcontrol.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see bento.language.bentocomp.flowcontrol.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see bento.language.bentocomp.flowcontrol.BooleanExpression#getLeft()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see bento.language.bentocomp.flowcontrol.BooleanExpression#getRight()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see bento.language.bentocomp.flowcontrol.BooleanExpression#getOperator()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Operator();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.flowcontrol.FeatureRef <em>Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Ref</em>'.
	 * @see bento.language.bentocomp.flowcontrol.FeatureRef
	 * @generated
	 */
	EClass getFeatureRef();

	/**
	 * Returns the meta object for the reference '{@link bento.language.bentocomp.flowcontrol.FeatureRef#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see bento.language.bentocomp.flowcontrol.FeatureRef#getFeature()
	 * @see #getFeatureRef()
	 * @generated
	 */
	EReference getFeatureRef_Feature();

	/**
	 * Returns the meta object for enum '{@link bento.language.bentocomp.flowcontrol.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see bento.language.bentocomp.flowcontrol.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowcontrolFactory getFlowcontrolFactory();

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
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.CompositionImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__STEP = eINSTANCE.getComposition_Step();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.CompositionStepImpl <em>Composition Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.CompositionStepImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getCompositionStep()
		 * @generated
		 */
		EClass COMPOSITION_STEP = eINSTANCE.getCompositionStep();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.ApplyImpl <em>Apply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.ApplyImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getApply()
		 * @generated
		 */
		EClass APPLY = eINSTANCE.getApply();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY__COMPONENT = eINSTANCE.getApply_Component();

		/**
		 * The meta object literal for the '<em><b>Input Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY__INPUT_MODELS = eINSTANCE.getApply_InputModels();

		/**
		 * The meta object literal for the '<em><b>Output Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY__OUTPUT_MODELS = eINSTANCE.getApply_OutputModels();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.ApplyParameterImpl <em>Apply Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.ApplyParameterImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getApplyParameter()
		 * @generated
		 */
		EClass APPLY_PARAMETER = eINSTANCE.getApplyParameter();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY_PARAMETER__MODEL = eINSTANCE.getApplyParameter_Model();

		/**
		 * The meta object literal for the '<em><b>Bound Concept Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER = eINSTANCE.getApplyParameter_BoundConceptQualifier();

		/**
		 * The meta object literal for the '<em><b>Bound Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY_PARAMETER__BOUND_CONCEPT = eINSTANCE.getApplyParameter_BoundConcept();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY_PARAMETER__BINDING = eINSTANCE.getApplyParameter_Binding();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.SeqImpl <em>Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.SeqImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getSeq()
		 * @generated
		 */
		EClass SEQ = eINSTANCE.getSeq();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__STEPS = eINSTANCE.getSeq_Steps();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.XorImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XOR__CONDITIONS = eINSTANCE.getXor_Conditions();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.XorCondImpl <em>Xor Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.XorCondImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getXorCond()
		 * @generated
		 */
		EClass XOR_COND = eINSTANCE.getXorCond();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XOR_COND__VALUE = eINSTANCE.getXorCond_Value();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XOR_COND__STEP = eINSTANCE.getXorCond_Step();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.ParImpl <em>Par</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.ParImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getPar()
		 * @generated
		 */
		EClass PAR = eINSTANCE.getPar();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.ExpressionImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.ValueImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.BooleanValueImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.BooleanExpressionImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__LEFT = eINSTANCE.getBooleanExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__RIGHT = eINSTANCE.getBooleanExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__OPERATOR = eINSTANCE.getBooleanExpression_Operator();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.impl.FeatureRefImpl <em>Feature Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.impl.FeatureRefImpl
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getFeatureRef()
		 * @generated
		 */
		EClass FEATURE_REF = eINSTANCE.getFeatureRef();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_REF__FEATURE = eINSTANCE.getFeatureRef_Feature();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.flowcontrol.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.flowcontrol.BooleanOperator
		 * @see bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

	}

} //FlowcontrolPackage

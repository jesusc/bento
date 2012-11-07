/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.flowcontrol.impl;

import genericity.language.gcomponent.GcomponentPackage;
import genericity.language.gcomponent.core.CorePackage;

import genericity.language.gcomponent.core.impl.CorePackageImpl;

import genericity.language.gcomponent.dsl.DslPackage;
import genericity.language.gcomponent.dsl.impl.DslPackageImpl;
import genericity.language.gcomponent.flowcontrol.Apply;
import genericity.language.gcomponent.flowcontrol.ApplyParameter;
import genericity.language.gcomponent.flowcontrol.BooleanExpression;
import genericity.language.gcomponent.flowcontrol.BooleanOperator;
import genericity.language.gcomponent.flowcontrol.BooleanValue;
import genericity.language.gcomponent.flowcontrol.Composition;
import genericity.language.gcomponent.flowcontrol.CompositionStep;
import genericity.language.gcomponent.flowcontrol.Expression;
import genericity.language.gcomponent.flowcontrol.FeatureRef;
import genericity.language.gcomponent.flowcontrol.FlowcontrolFactory;
import genericity.language.gcomponent.flowcontrol.FlowcontrolPackage;
import genericity.language.gcomponent.flowcontrol.Par;
import genericity.language.gcomponent.flowcontrol.Seq;
import genericity.language.gcomponent.flowcontrol.Value;
import genericity.language.gcomponent.flowcontrol.Xor;
import genericity.language.gcomponent.flowcontrol.XorCond;

import genericity.language.gcomponent.impl.GcomponentPackageImpl;
import genericity.language.gcomponent.technologies.TechnologiesPackage;
import genericity.language.gcomponent.technologies.impl.TechnologiesPackageImpl;
import genericity.language.gcomponent.variants.VariantsPackage;

import genericity.language.gcomponent.variants.impl.VariantsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowcontrolPackageImpl extends EPackageImpl implements FlowcontrolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorCondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorEEnum = null;

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
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlowcontrolPackageImpl() {
		super(eNS_URI, FlowcontrolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FlowcontrolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlowcontrolPackage init() {
		if (isInited) return (FlowcontrolPackage)EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI);

		// Obtain or create and register package
		FlowcontrolPackageImpl theFlowcontrolPackage = (FlowcontrolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FlowcontrolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FlowcontrolPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GcomponentPackageImpl theGcomponentPackage = (GcomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GcomponentPackage.eNS_URI) instanceof GcomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GcomponentPackage.eNS_URI) : GcomponentPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		VariantsPackageImpl theVariantsPackage = (VariantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI) instanceof VariantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI) : VariantsPackage.eINSTANCE);
		DslPackageImpl theDslPackage = (DslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI) instanceof DslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI) : DslPackage.eINSTANCE);
		TechnologiesPackageImpl theTechnologiesPackage = (TechnologiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI) instanceof TechnologiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI) : TechnologiesPackage.eINSTANCE);

		// Create package meta-data objects
		theFlowcontrolPackage.createPackageContents();
		theGcomponentPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theVariantsPackage.createPackageContents();
		theDslPackage.createPackageContents();
		theTechnologiesPackage.createPackageContents();

		// Initialize created meta-data
		theFlowcontrolPackage.initializePackageContents();
		theGcomponentPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theVariantsPackage.initializePackageContents();
		theDslPackage.initializePackageContents();
		theTechnologiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlowcontrolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlowcontrolPackage.eNS_URI, theFlowcontrolPackage);
		return theFlowcontrolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Step() {
		return (EReference)compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionStep() {
		return compositionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApply() {
		return applyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApply_Component() {
		return (EReference)applyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApply_InputModels() {
		return (EReference)applyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApply_OutputModels() {
		return (EReference)applyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyParameter() {
		return applyParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyParameter_Model() {
		return (EReference)applyParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyParameter_BoundConceptQualifier() {
		return (EReference)applyParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplyParameter_BoundConcept() {
		return (EReference)applyParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyParameter_BindingName() {
		return (EAttribute)applyParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeq() {
		return seqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeq_Steps() {
		return (EReference)seqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXor() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXor_Conditions() {
		return (EReference)xorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXorCond() {
		return xorCondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXorCond_Value() {
		return (EReference)xorCondEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXorCond_Step() {
		return (EReference)xorCondEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPar() {
		return parEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_Left() {
		return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_Right() {
		return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_Operator() {
		return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureRef() {
		return featureRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureRef_Feature() {
		return (EReference)featureRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanOperator() {
		return booleanOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowcontrolFactory getFlowcontrolFactory() {
		return (FlowcontrolFactory)getEFactoryInstance();
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
		compositionEClass = createEClass(COMPOSITION);
		createEReference(compositionEClass, COMPOSITION__STEP);

		compositionStepEClass = createEClass(COMPOSITION_STEP);

		applyEClass = createEClass(APPLY);
		createEReference(applyEClass, APPLY__COMPONENT);
		createEReference(applyEClass, APPLY__INPUT_MODELS);
		createEReference(applyEClass, APPLY__OUTPUT_MODELS);

		applyParameterEClass = createEClass(APPLY_PARAMETER);
		createEReference(applyParameterEClass, APPLY_PARAMETER__MODEL);
		createEReference(applyParameterEClass, APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER);
		createEReference(applyParameterEClass, APPLY_PARAMETER__BOUND_CONCEPT);
		createEAttribute(applyParameterEClass, APPLY_PARAMETER__BINDING_NAME);

		seqEClass = createEClass(SEQ);
		createEReference(seqEClass, SEQ__STEPS);

		xorEClass = createEClass(XOR);
		createEReference(xorEClass, XOR__CONDITIONS);

		xorCondEClass = createEClass(XOR_COND);
		createEReference(xorCondEClass, XOR_COND__VALUE);
		createEReference(xorCondEClass, XOR_COND__STEP);

		parEClass = createEClass(PAR);

		expressionEClass = createEClass(EXPRESSION);

		valueEClass = createEClass(VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__LEFT);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__RIGHT);
		createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__OPERATOR);

		featureRefEClass = createEClass(FEATURE_REF);
		createEReference(featureRefEClass, FEATURE_REF__FEATURE);

		// Create enums
		booleanOperatorEEnum = createEEnum(BOOLEAN_OPERATOR);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		VariantsPackage theVariantsPackage = (VariantsPackage)EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		applyEClass.getESuperTypes().add(this.getCompositionStep());
		seqEClass.getESuperTypes().add(this.getCompositionStep());
		xorEClass.getESuperTypes().add(this.getCompositionStep());
		parEClass.getESuperTypes().add(this.getCompositionStep());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getBooleanValue());
		featureRefEClass.getESuperTypes().add(this.getExpression());
		featureRefEClass.getESuperTypes().add(this.getBooleanValue());

		// Initialize classes and features; add operations and parameters
		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposition_Step(), this.getCompositionStep(), null, "step", null, 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionStepEClass, CompositionStep.class, "CompositionStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applyEClass, Apply.class, "Apply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApply_Component(), theCorePackage.getComponent(), null, "component", null, 1, 1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApply_InputModels(), this.getApplyParameter(), null, "inputModels", null, 0, -1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApply_OutputModels(), this.getApplyParameter(), null, "outputModels", null, 0, -1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applyParameterEClass, ApplyParameter.class, "ApplyParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplyParameter_Model(), theCorePackage.getModel(), null, "model", null, 1, 1, ApplyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplyParameter_BoundConceptQualifier(), theCorePackage.getComponent(), null, "boundConceptQualifier", null, 0, 1, ApplyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplyParameter_BoundConcept(), theCorePackage.getConcept(), null, "boundConcept", null, 0, 1, ApplyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplyParameter_BindingName(), ecorePackage.getEString(), "bindingName", null, 1, 1, ApplyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seqEClass, Seq.class, "Seq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeq_Steps(), this.getCompositionStep(), null, "steps", null, 0, -1, Seq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXor_Conditions(), this.getXorCond(), null, "conditions", null, 1, -1, Xor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xorCondEClass, XorCond.class, "XorCond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXorCond_Value(), this.getBooleanValue(), null, "value", null, 1, 1, XorCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXorCond_Step(), this.getCompositionStep(), null, "step", null, 1, 1, XorCond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parEClass, Par.class, "Par", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpression_Left(), this.getBooleanValue(), null, "left", null, 1, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanExpression_Right(), this.getBooleanValue(), null, "right", null, 1, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanExpression_Operator(), this.getBooleanOperator(), "operator", null, 1, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureRefEClass, FeatureRef.class, "FeatureRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureRef_Feature(), theVariantsPackage.getFeature(), null, "feature", null, 1, 1, FeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(booleanOperatorEEnum, BooleanOperator.class, "BooleanOperator");
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.AND);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.OR);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.LESS);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.LESS_THAN);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.GREATER);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.GREATER_THAN);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.EQUAL);
	}

} //FlowcontrolPackageImpl

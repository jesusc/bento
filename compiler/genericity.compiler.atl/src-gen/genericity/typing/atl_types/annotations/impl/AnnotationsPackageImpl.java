/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.AtlTypingPackage;

import genericity.typing.atl_types.annotations.AnnotationsFactory;
import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.AtlAnnotation;
import genericity.typing.atl_types.annotations.BindingAnnotation;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.HelperAnnotation;

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
	private EClass helperAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionAnnotationEClass = null;

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
	public EClass getHelperAnnotation() {
		return helperAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperAnnotation_Helper() {
		return (EReference)helperAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelperAnnotation_Name() {
		return (EAttribute)helperAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHelperAnnotation_Type() {
		return (EReference)helperAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingAnnotation() {
		return bindingAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnnotation_Rule() {
		return (EReference)bindingAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnnotation_Binding() {
		return (EReference)bindingAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingAnnotation_Name() {
		return (EAttribute)bindingAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnnotation_SourceType() {
		return (EReference)bindingAnnotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingAnnotation_TargetType() {
		return (EReference)bindingAnnotationEClass.getEStructuralFeatures().get(4);
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

		helperAnnotationEClass = createEClass(HELPER_ANNOTATION);
		createEReference(helperAnnotationEClass, HELPER_ANNOTATION__HELPER);
		createEAttribute(helperAnnotationEClass, HELPER_ANNOTATION__NAME);
		createEReference(helperAnnotationEClass, HELPER_ANNOTATION__TYPE);

		bindingAnnotationEClass = createEClass(BINDING_ANNOTATION);
		createEReference(bindingAnnotationEClass, BINDING_ANNOTATION__RULE);
		createEReference(bindingAnnotationEClass, BINDING_ANNOTATION__BINDING);
		createEAttribute(bindingAnnotationEClass, BINDING_ANNOTATION__NAME);
		createEReference(bindingAnnotationEClass, BINDING_ANNOTATION__SOURCE_TYPE);
		createEReference(bindingAnnotationEClass, BINDING_ANNOTATION__TARGET_TYPE);

		expressionAnnotationEClass = createEClass(EXPRESSION_ANNOTATION);
		createEReference(expressionAnnotationEClass, EXPRESSION_ANNOTATION__EXPR);
		createEReference(expressionAnnotationEClass, EXPRESSION_ANNOTATION__TYPE);
		createEReference(expressionAnnotationEClass, EXPRESSION_ANNOTATION__USED_FEATURE);
		createEReference(expressionAnnotationEClass, EXPRESSION_ANNOTATION__RECEPTOR_TYPE);
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
		helperAnnotationEClass.getESuperTypes().add(this.getAtlAnnotation());
		bindingAnnotationEClass.getESuperTypes().add(this.getAtlAnnotation());
		expressionAnnotationEClass.getESuperTypes().add(this.getAtlAnnotation());

		// Initialize classes and features; add operations and parameters
		initEClass(atlAnnotationEClass, AtlAnnotation.class, "AtlAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helperAnnotationEClass, HelperAnnotation.class, "HelperAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHelperAnnotation_Helper(), ecorePackage.getEObject(), null, "helper", null, 0, 1, HelperAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelperAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, HelperAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperAnnotation_Type(), theAtlTypingPackage.getType(), null, "type", null, 1, 1, HelperAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingAnnotationEClass, BindingAnnotation.class, "BindingAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingAnnotation_Rule(), ecorePackage.getEObject(), null, "rule", null, 0, 1, BindingAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingAnnotation_Binding(), ecorePackage.getEObject(), null, "binding", null, 0, 1, BindingAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, BindingAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingAnnotation_SourceType(), theAtlTypingPackage.getType(), null, "sourceType", null, 1, 1, BindingAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingAnnotation_TargetType(), theAtlTypingPackage.getType(), null, "targetType", null, 1, 1, BindingAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionAnnotationEClass, ExpressionAnnotation.class, "ExpressionAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionAnnotation_Expr(), ecorePackage.getEObject(), null, "expr", null, 0, 1, ExpressionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionAnnotation_Type(), theAtlTypingPackage.getType(), null, "type", null, 1, 1, ExpressionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionAnnotation_UsedFeature(), ecorePackage.getEObject(), null, "usedFeature", null, 0, 1, ExpressionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionAnnotation_ReceptorType(), ecorePackage.getEObject(), null, "receptorType", null, 0, 1, ExpressionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AnnotationsPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error.impl;

import bento.analysis.atl_analysis.AtlAnalysisPackage;

import bento.analysis.atl_analysis.atl_error.AtlErrorsFactory;
import bento.analysis.atl_analysis.atl_error.AtlErrorsPackage;
import bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError;
import bento.analysis.atl_analysis.atl_error.FeatureNotFound;
import bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType;
import bento.analysis.atl_analysis.atl_error.InvalidArgumentProblem;
import bento.analysis.atl_analysis.atl_error.InvalidOperand;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_error.NavigationProblem;

import bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite;
import bento.analysis.atl_analysis.atl_recovery.AtlRecoveryPackage;
import bento.analysis.atl_analysis.atl_recovery.impl.AtlRecoveryPackageImpl;
import bento.analysis.atl_analysis.impl.AtlAnalysisPackageImpl;

import genericity.typing.atl_types.AtlTypingPackage;
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
public class AtlErrorsPackageImpl extends EPackageImpl implements AtlErrorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidArgumentProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionOperationOverNoCollectionErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureNotFoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureNotFoundInUnionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noContainerForRefImmediateCompositeEClass = null;

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
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtlErrorsPackageImpl() {
		super(eNS_URI, AtlErrorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AtlErrorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtlErrorsPackage init() {
		if (isInited) return (AtlErrorsPackage)EPackage.Registry.INSTANCE.getEPackage(AtlErrorsPackage.eNS_URI);

		// Obtain or create and register package
		AtlErrorsPackageImpl theAtlErrorsPackage = (AtlErrorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AtlErrorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AtlErrorsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AtlTypingPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AtlAnalysisPackageImpl theAtlAnalysisPackage = (AtlAnalysisPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtlAnalysisPackage.eNS_URI) instanceof AtlAnalysisPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtlAnalysisPackage.eNS_URI) : AtlAnalysisPackage.eINSTANCE);
		AtlRecoveryPackageImpl theAtlRecoveryPackage = (AtlRecoveryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtlRecoveryPackage.eNS_URI) instanceof AtlRecoveryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtlRecoveryPackage.eNS_URI) : AtlRecoveryPackage.eINSTANCE);

		// Create package meta-data objects
		theAtlErrorsPackage.createPackageContents();
		theAtlAnalysisPackage.createPackageContents();
		theAtlRecoveryPackage.createPackageContents();

		// Initialize created meta-data
		theAtlErrorsPackage.initializePackageContents();
		theAtlAnalysisPackage.initializePackageContents();
		theAtlRecoveryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtlErrorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtlErrorsPackage.eNS_URI, theAtlErrorsPackage);
		return theAtlErrorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalProblem() {
		return localProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalProblem_Location() {
		return (EAttribute)localProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalProblem_Element() {
		return (EAttribute)localProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalProblem_Recovery() {
		return (EReference)localProblemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationProblem() {
		return navigationProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidArgumentProblem() {
		return invalidArgumentProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionOperationOverNoCollectionError() {
		return collectionOperationOverNoCollectionErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureNotFound() {
		return featureNotFoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureNotFound_FeatureName() {
		return (EAttribute)featureNotFoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureNotFound_ClassName() {
		return (EAttribute)featureNotFoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureNotFound_MetamodelName() {
		return (EAttribute)featureNotFoundEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureNotFoundInUnionType() {
		return featureNotFoundInUnionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureNotFoundInUnionType_FeatureName() {
		return (EAttribute)featureNotFoundInUnionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidOperand() {
		return invalidOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvalidOperand_OperatorSymbol() {
		return (EAttribute)invalidOperandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoContainerForRefImmediateComposite() {
		return noContainerForRefImmediateCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoContainerForRefImmediateComposite_ClassName() {
		return (EAttribute)noContainerForRefImmediateCompositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoContainerForRefImmediateComposite_MetamodelName() {
		return (EAttribute)noContainerForRefImmediateCompositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlErrorsFactory getAtlErrorsFactory() {
		return (AtlErrorsFactory)getEFactoryInstance();
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
		localProblemEClass = createEClass(LOCAL_PROBLEM);
		createEAttribute(localProblemEClass, LOCAL_PROBLEM__LOCATION);
		createEAttribute(localProblemEClass, LOCAL_PROBLEM__ELEMENT);
		createEReference(localProblemEClass, LOCAL_PROBLEM__RECOVERY);

		navigationProblemEClass = createEClass(NAVIGATION_PROBLEM);

		invalidArgumentProblemEClass = createEClass(INVALID_ARGUMENT_PROBLEM);

		collectionOperationOverNoCollectionErrorEClass = createEClass(COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR);

		featureNotFoundEClass = createEClass(FEATURE_NOT_FOUND);
		createEAttribute(featureNotFoundEClass, FEATURE_NOT_FOUND__FEATURE_NAME);
		createEAttribute(featureNotFoundEClass, FEATURE_NOT_FOUND__CLASS_NAME);
		createEAttribute(featureNotFoundEClass, FEATURE_NOT_FOUND__METAMODEL_NAME);

		featureNotFoundInUnionTypeEClass = createEClass(FEATURE_NOT_FOUND_IN_UNION_TYPE);
		createEAttribute(featureNotFoundInUnionTypeEClass, FEATURE_NOT_FOUND_IN_UNION_TYPE__FEATURE_NAME);

		invalidOperandEClass = createEClass(INVALID_OPERAND);
		createEAttribute(invalidOperandEClass, INVALID_OPERAND__OPERATOR_SYMBOL);

		noContainerForRefImmediateCompositeEClass = createEClass(NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE);
		createEAttribute(noContainerForRefImmediateCompositeEClass, NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__CLASS_NAME);
		createEAttribute(noContainerForRefImmediateCompositeEClass, NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__METAMODEL_NAME);
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
		AtlAnalysisPackage theAtlAnalysisPackage = (AtlAnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AtlAnalysisPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localProblemEClass.getESuperTypes().add(theAtlAnalysisPackage.getProblem());
		navigationProblemEClass.getESuperTypes().add(this.getLocalProblem());
		invalidArgumentProblemEClass.getESuperTypes().add(this.getLocalProblem());
		collectionOperationOverNoCollectionErrorEClass.getESuperTypes().add(this.getNavigationProblem());
		featureNotFoundEClass.getESuperTypes().add(this.getNavigationProblem());
		featureNotFoundInUnionTypeEClass.getESuperTypes().add(this.getNavigationProblem());
		invalidOperandEClass.getESuperTypes().add(this.getInvalidArgumentProblem());
		noContainerForRefImmediateCompositeEClass.getESuperTypes().add(this.getNavigationProblem());

		// Initialize classes and features; add operations and parameters
		initEClass(localProblemEClass, LocalProblem.class, "LocalProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalProblem_Location(), ecorePackage.getEString(), "location", null, 1, 1, LocalProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalProblem_Element(), ecorePackage.getEString(), "element", null, 1, 1, LocalProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalProblem_Recovery(), theAtlAnalysisPackage.getRecovery(), null, "recovery", null, 0, 1, LocalProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationProblemEClass, NavigationProblem.class, "NavigationProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invalidArgumentProblemEClass, InvalidArgumentProblem.class, "InvalidArgumentProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionOperationOverNoCollectionErrorEClass, CollectionOperationOverNoCollectionError.class, "CollectionOperationOverNoCollectionError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureNotFoundEClass, FeatureNotFound.class, "FeatureNotFound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureNotFound_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, FeatureNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureNotFound_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, FeatureNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureNotFound_MetamodelName(), ecorePackage.getEString(), "metamodelName", null, 1, 1, FeatureNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureNotFoundInUnionTypeEClass, FeatureNotFoundInUnionType.class, "FeatureNotFoundInUnionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureNotFoundInUnionType_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, FeatureNotFoundInUnionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidOperandEClass, InvalidOperand.class, "InvalidOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvalidOperand_OperatorSymbol(), ecorePackage.getEString(), "operatorSymbol", null, 1, 1, InvalidOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noContainerForRefImmediateCompositeEClass, NoContainerForRefImmediateComposite.class, "NoContainerForRefImmediateComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoContainerForRefImmediateComposite_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, NoContainerForRefImmediateComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoContainerForRefImmediateComposite_MetamodelName(), ecorePackage.getEString(), "metamodelName", null, 1, 1, NoContainerForRefImmediateComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AtlErrorsPackageImpl

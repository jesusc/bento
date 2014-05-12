/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error.impl;

import bento.analysis.atl_analysis.AtlAnalysisPackage;

import bento.analysis.atl_analysis.atl_error.AmbiguousTargetModelReference;
import bento.analysis.atl_analysis.atl_error.AtlErrorsFactory;
import bento.analysis.atl_analysis.atl_error.AtlErrorsPackage;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;
import bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved;
import bento.analysis.atl_analysis.atl_error.BindingProblem;
import bento.analysis.atl_analysis.atl_error.BindingResolution;
import bento.analysis.atl_analysis.atl_error.BindingWithResolvedByIncompatibleRule;
import bento.analysis.atl_analysis.atl_error.BindingWithoutRule;
import bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError;
import bento.analysis.atl_analysis.atl_error.DifferentBranchTypes;
import bento.analysis.atl_analysis.atl_error.ExpectedCollectionInForEach;
import bento.analysis.atl_analysis.atl_error.FeatureAccessInCollection;
import bento.analysis.atl_analysis.atl_error.FeatureNotFound;
import bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType;
import bento.analysis.atl_analysis.atl_error.FlattenOverNonNestedCollection;
import bento.analysis.atl_analysis.atl_error.InvalidArgument;
import bento.analysis.atl_analysis.atl_error.InvalidArgumentProblem;
import bento.analysis.atl_analysis.atl_error.InvalidOperand;
import bento.analysis.atl_analysis.atl_error.IteratorBodyWrongType;
import bento.analysis.atl_analysis.atl_error.IteratorOverEmptySequence;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_error.MatchedRuleWithoutOutputPattern;
import bento.analysis.atl_analysis.atl_error.NavigationProblem;

import bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature;
import bento.analysis.atl_analysis.atl_error.NoClassFoundInMetamodel;
import bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite;
import bento.analysis.atl_analysis.atl_error.NoModelFound;
import bento.analysis.atl_analysis.atl_error.OperationNotFound;
import bento.analysis.atl_analysis.atl_error.ReadingTargetModel;
import bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo;
import bento.analysis.atl_analysis.atl_error.TargetModelConformanceProblem;
import bento.analysis.atl_analysis.atl_error.WrongType;
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
	private EClass targetModelConformanceProblemEClass = null;

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
	private EClass featureAccessInCollectionEClass = null;

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
	private EClass operationNotFoundEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differentBranchTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noBindingForCompulsoryFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingExpectedOneAssignedManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingWithoutRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingWithResolvedByIncompatibleRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingPossiblyUnresolvedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolvedRuleInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flattenOverNonNestedCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorOverEmptySequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingTargetModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambiguousTargetModelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noModelFoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrongTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorBodyWrongTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedRuleWithoutOutputPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedCollectionInForEachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noClassFoundInMetamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidArgumentEClass = null;

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
	public EReference getLocalProblem_Element() {
		return (EReference)localProblemEClass.getEStructuralFeatures().get(1);
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
	public EClass getTargetModelConformanceProblem() {
		return targetModelConformanceProblemEClass;
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
	public EClass getFeatureAccessInCollection() {
		return featureAccessInCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureAccessInCollection_FeatureName() {
		return (EAttribute)featureAccessInCollectionEClass.getEStructuralFeatures().get(0);
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
	public EClass getOperationNotFound() {
		return operationNotFoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationNotFound_OperationName() {
		return (EAttribute)operationNotFoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationNotFound_Type() {
		return (EReference)operationNotFoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationNotFound_ClassName() {
		return (EAttribute)operationNotFoundEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationNotFound_MetamodelName() {
		return (EAttribute)operationNotFoundEClass.getEStructuralFeatures().get(3);
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
	public EClass getDifferentBranchTypes() {
		return differentBranchTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentBranchTypes_ThenType() {
		return (EReference)differentBranchTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDifferentBranchTypes_ElseType() {
		return (EReference)differentBranchTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingProblem() {
		return bindingProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingProblem_Feature() {
		return (EReference)bindingProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingProblem_FeatureName() {
		return (EAttribute)bindingProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoBindingForCompulsoryFeature() {
		return noBindingForCompulsoryFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingExpectedOneAssignedMany() {
		return bindingExpectedOneAssignedManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingResolution() {
		return bindingResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingResolution_RightType() {
		return (EReference)bindingResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingResolution_TargetType() {
		return (EReference)bindingResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingResolution_Rules() {
		return (EReference)bindingResolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingWithoutRule() {
		return bindingWithoutRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingWithResolvedByIncompatibleRule() {
		return bindingWithResolvedByIncompatibleRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingPossiblyUnresolved() {
		return bindingPossiblyUnresolvedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingPossiblyUnresolved_ProblematicClasses() {
		return (EReference)bindingPossiblyUnresolvedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolvedRuleInfo() {
		return resolvedRuleInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolvedRuleInfo_Location() {
		return (EAttribute)resolvedRuleInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedRuleInfo_Element() {
		return (EReference)resolvedRuleInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolvedRuleInfo_RuleName() {
		return (EAttribute)resolvedRuleInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolvedRuleInfo_OutputType() {
		return (EReference)resolvedRuleInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlattenOverNonNestedCollection() {
		return flattenOverNonNestedCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorOverEmptySequence() {
		return iteratorOverEmptySequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingTargetModel() {
		return readingTargetModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingTargetModel_ModelName() {
		return (EAttribute)readingTargetModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbiguousTargetModelReference() {
		return ambiguousTargetModelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmbiguousTargetModelReference_ModelName() {
		return (EAttribute)ambiguousTargetModelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoModelFound() {
		return noModelFoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoModelFound_ModelName() {
		return (EAttribute)noModelFoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrongType() {
		return wrongTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorBodyWrongType() {
		return iteratorBodyWrongTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedRuleWithoutOutputPattern() {
		return matchedRuleWithoutOutputPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectedCollectionInForEach() {
		return expectedCollectionInForEachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoClassFoundInMetamodel() {
		return noClassFoundInMetamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoClassFoundInMetamodel_ClassName() {
		return (EAttribute)noClassFoundInMetamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidArgument() {
		return invalidArgumentEClass;
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
		createEReference(localProblemEClass, LOCAL_PROBLEM__ELEMENT);
		createEReference(localProblemEClass, LOCAL_PROBLEM__RECOVERY);

		navigationProblemEClass = createEClass(NAVIGATION_PROBLEM);

		invalidArgumentProblemEClass = createEClass(INVALID_ARGUMENT_PROBLEM);

		targetModelConformanceProblemEClass = createEClass(TARGET_MODEL_CONFORMANCE_PROBLEM);

		collectionOperationOverNoCollectionErrorEClass = createEClass(COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR);

		featureAccessInCollectionEClass = createEClass(FEATURE_ACCESS_IN_COLLECTION);
		createEAttribute(featureAccessInCollectionEClass, FEATURE_ACCESS_IN_COLLECTION__FEATURE_NAME);

		featureNotFoundEClass = createEClass(FEATURE_NOT_FOUND);
		createEAttribute(featureNotFoundEClass, FEATURE_NOT_FOUND__FEATURE_NAME);
		createEAttribute(featureNotFoundEClass, FEATURE_NOT_FOUND__CLASS_NAME);
		createEAttribute(featureNotFoundEClass, FEATURE_NOT_FOUND__METAMODEL_NAME);

		operationNotFoundEClass = createEClass(OPERATION_NOT_FOUND);
		createEAttribute(operationNotFoundEClass, OPERATION_NOT_FOUND__OPERATION_NAME);
		createEReference(operationNotFoundEClass, OPERATION_NOT_FOUND__TYPE);
		createEAttribute(operationNotFoundEClass, OPERATION_NOT_FOUND__CLASS_NAME);
		createEAttribute(operationNotFoundEClass, OPERATION_NOT_FOUND__METAMODEL_NAME);

		featureNotFoundInUnionTypeEClass = createEClass(FEATURE_NOT_FOUND_IN_UNION_TYPE);
		createEAttribute(featureNotFoundInUnionTypeEClass, FEATURE_NOT_FOUND_IN_UNION_TYPE__FEATURE_NAME);

		invalidOperandEClass = createEClass(INVALID_OPERAND);
		createEAttribute(invalidOperandEClass, INVALID_OPERAND__OPERATOR_SYMBOL);

		noContainerForRefImmediateCompositeEClass = createEClass(NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE);
		createEAttribute(noContainerForRefImmediateCompositeEClass, NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__CLASS_NAME);
		createEAttribute(noContainerForRefImmediateCompositeEClass, NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE__METAMODEL_NAME);

		differentBranchTypesEClass = createEClass(DIFFERENT_BRANCH_TYPES);
		createEReference(differentBranchTypesEClass, DIFFERENT_BRANCH_TYPES__THEN_TYPE);
		createEReference(differentBranchTypesEClass, DIFFERENT_BRANCH_TYPES__ELSE_TYPE);

		bindingProblemEClass = createEClass(BINDING_PROBLEM);
		createEReference(bindingProblemEClass, BINDING_PROBLEM__FEATURE);
		createEAttribute(bindingProblemEClass, BINDING_PROBLEM__FEATURE_NAME);

		noBindingForCompulsoryFeatureEClass = createEClass(NO_BINDING_FOR_COMPULSORY_FEATURE);

		bindingExpectedOneAssignedManyEClass = createEClass(BINDING_EXPECTED_ONE_ASSIGNED_MANY);

		bindingResolutionEClass = createEClass(BINDING_RESOLUTION);
		createEReference(bindingResolutionEClass, BINDING_RESOLUTION__RIGHT_TYPE);
		createEReference(bindingResolutionEClass, BINDING_RESOLUTION__TARGET_TYPE);
		createEReference(bindingResolutionEClass, BINDING_RESOLUTION__RULES);

		bindingWithoutRuleEClass = createEClass(BINDING_WITHOUT_RULE);

		bindingWithResolvedByIncompatibleRuleEClass = createEClass(BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE);

		bindingPossiblyUnresolvedEClass = createEClass(BINDING_POSSIBLY_UNRESOLVED);
		createEReference(bindingPossiblyUnresolvedEClass, BINDING_POSSIBLY_UNRESOLVED__PROBLEMATIC_CLASSES);

		resolvedRuleInfoEClass = createEClass(RESOLVED_RULE_INFO);
		createEAttribute(resolvedRuleInfoEClass, RESOLVED_RULE_INFO__LOCATION);
		createEReference(resolvedRuleInfoEClass, RESOLVED_RULE_INFO__ELEMENT);
		createEAttribute(resolvedRuleInfoEClass, RESOLVED_RULE_INFO__RULE_NAME);
		createEReference(resolvedRuleInfoEClass, RESOLVED_RULE_INFO__OUTPUT_TYPE);

		flattenOverNonNestedCollectionEClass = createEClass(FLATTEN_OVER_NON_NESTED_COLLECTION);

		iteratorOverEmptySequenceEClass = createEClass(ITERATOR_OVER_EMPTY_SEQUENCE);

		readingTargetModelEClass = createEClass(READING_TARGET_MODEL);
		createEAttribute(readingTargetModelEClass, READING_TARGET_MODEL__MODEL_NAME);

		ambiguousTargetModelReferenceEClass = createEClass(AMBIGUOUS_TARGET_MODEL_REFERENCE);
		createEAttribute(ambiguousTargetModelReferenceEClass, AMBIGUOUS_TARGET_MODEL_REFERENCE__MODEL_NAME);

		noModelFoundEClass = createEClass(NO_MODEL_FOUND);
		createEAttribute(noModelFoundEClass, NO_MODEL_FOUND__MODEL_NAME);

		wrongTypeEClass = createEClass(WRONG_TYPE);

		iteratorBodyWrongTypeEClass = createEClass(ITERATOR_BODY_WRONG_TYPE);

		matchedRuleWithoutOutputPatternEClass = createEClass(MATCHED_RULE_WITHOUT_OUTPUT_PATTERN);

		expectedCollectionInForEachEClass = createEClass(EXPECTED_COLLECTION_IN_FOR_EACH);

		noClassFoundInMetamodelEClass = createEClass(NO_CLASS_FOUND_IN_METAMODEL);
		createEAttribute(noClassFoundInMetamodelEClass, NO_CLASS_FOUND_IN_METAMODEL__CLASS_NAME);

		invalidArgumentEClass = createEClass(INVALID_ARGUMENT);
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
		AtlTypingPackage theAtlTypingPackage = (AtlTypingPackage)EPackage.Registry.INSTANCE.getEPackage(AtlTypingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localProblemEClass.getESuperTypes().add(theAtlAnalysisPackage.getProblem());
		navigationProblemEClass.getESuperTypes().add(this.getLocalProblem());
		invalidArgumentProblemEClass.getESuperTypes().add(this.getLocalProblem());
		targetModelConformanceProblemEClass.getESuperTypes().add(this.getLocalProblem());
		collectionOperationOverNoCollectionErrorEClass.getESuperTypes().add(this.getNavigationProblem());
		featureAccessInCollectionEClass.getESuperTypes().add(this.getNavigationProblem());
		featureNotFoundEClass.getESuperTypes().add(this.getNavigationProblem());
		operationNotFoundEClass.getESuperTypes().add(this.getNavigationProblem());
		featureNotFoundInUnionTypeEClass.getESuperTypes().add(this.getNavigationProblem());
		invalidOperandEClass.getESuperTypes().add(this.getInvalidArgumentProblem());
		noContainerForRefImmediateCompositeEClass.getESuperTypes().add(this.getNavigationProblem());
		differentBranchTypesEClass.getESuperTypes().add(this.getNavigationProblem());
		bindingProblemEClass.getESuperTypes().add(this.getLocalProblem());
		noBindingForCompulsoryFeatureEClass.getESuperTypes().add(this.getTargetModelConformanceProblem());
		noBindingForCompulsoryFeatureEClass.getESuperTypes().add(this.getBindingProblem());
		bindingExpectedOneAssignedManyEClass.getESuperTypes().add(this.getBindingProblem());
		bindingWithoutRuleEClass.getESuperTypes().add(this.getBindingProblem());
		bindingWithoutRuleEClass.getESuperTypes().add(this.getBindingResolution());
		bindingWithResolvedByIncompatibleRuleEClass.getESuperTypes().add(this.getBindingProblem());
		bindingWithResolvedByIncompatibleRuleEClass.getESuperTypes().add(this.getBindingResolution());
		bindingPossiblyUnresolvedEClass.getESuperTypes().add(this.getBindingProblem());
		bindingPossiblyUnresolvedEClass.getESuperTypes().add(this.getBindingResolution());
		flattenOverNonNestedCollectionEClass.getESuperTypes().add(this.getLocalProblem());
		iteratorOverEmptySequenceEClass.getESuperTypes().add(this.getLocalProblem());
		readingTargetModelEClass.getESuperTypes().add(this.getLocalProblem());
		ambiguousTargetModelReferenceEClass.getESuperTypes().add(this.getLocalProblem());
		noModelFoundEClass.getESuperTypes().add(this.getLocalProblem());
		wrongTypeEClass.getESuperTypes().add(this.getLocalProblem());
		iteratorBodyWrongTypeEClass.getESuperTypes().add(this.getWrongType());
		matchedRuleWithoutOutputPatternEClass.getESuperTypes().add(this.getLocalProblem());
		expectedCollectionInForEachEClass.getESuperTypes().add(this.getLocalProblem());
		noClassFoundInMetamodelEClass.getESuperTypes().add(this.getLocalProblem());
		invalidArgumentEClass.getESuperTypes().add(this.getLocalProblem());

		// Initialize classes and features; add operations and parameters
		initEClass(localProblemEClass, LocalProblem.class, "LocalProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalProblem_Location(), ecorePackage.getEString(), "location", null, 1, 1, LocalProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalProblem_Element(), ecorePackage.getEObject(), null, "element", null, 1, 1, LocalProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalProblem_Recovery(), theAtlAnalysisPackage.getRecovery(), null, "recovery", null, 0, 1, LocalProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationProblemEClass, NavigationProblem.class, "NavigationProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invalidArgumentProblemEClass, InvalidArgumentProblem.class, "InvalidArgumentProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetModelConformanceProblemEClass, TargetModelConformanceProblem.class, "TargetModelConformanceProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionOperationOverNoCollectionErrorEClass, CollectionOperationOverNoCollectionError.class, "CollectionOperationOverNoCollectionError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureAccessInCollectionEClass, FeatureAccessInCollection.class, "FeatureAccessInCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureAccessInCollection_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, FeatureAccessInCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureNotFoundEClass, FeatureNotFound.class, "FeatureNotFound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureNotFound_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, FeatureNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureNotFound_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, FeatureNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureNotFound_MetamodelName(), ecorePackage.getEString(), "metamodelName", null, 1, 1, FeatureNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationNotFoundEClass, OperationNotFound.class, "OperationNotFound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationNotFound_OperationName(), ecorePackage.getEString(), "operationName", null, 1, 1, OperationNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationNotFound_Type(), theAtlTypingPackage.getType(), null, "type", null, 1, 1, OperationNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationNotFound_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, OperationNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationNotFound_MetamodelName(), ecorePackage.getEString(), "metamodelName", null, 1, 1, OperationNotFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureNotFoundInUnionTypeEClass, FeatureNotFoundInUnionType.class, "FeatureNotFoundInUnionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureNotFoundInUnionType_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, FeatureNotFoundInUnionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidOperandEClass, InvalidOperand.class, "InvalidOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvalidOperand_OperatorSymbol(), ecorePackage.getEString(), "operatorSymbol", null, 1, 1, InvalidOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noContainerForRefImmediateCompositeEClass, NoContainerForRefImmediateComposite.class, "NoContainerForRefImmediateComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoContainerForRefImmediateComposite_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, NoContainerForRefImmediateComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoContainerForRefImmediateComposite_MetamodelName(), ecorePackage.getEString(), "metamodelName", null, 1, 1, NoContainerForRefImmediateComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(differentBranchTypesEClass, DifferentBranchTypes.class, "DifferentBranchTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferentBranchTypes_ThenType(), theAtlTypingPackage.getType(), null, "thenType", null, 1, 1, DifferentBranchTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifferentBranchTypes_ElseType(), theAtlTypingPackage.getType(), null, "elseType", null, 1, 1, DifferentBranchTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingProblemEClass, BindingProblem.class, "BindingProblem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingProblem_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, BindingProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingProblem_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, BindingProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noBindingForCompulsoryFeatureEClass, NoBindingForCompulsoryFeature.class, "NoBindingForCompulsoryFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingExpectedOneAssignedManyEClass, BindingExpectedOneAssignedMany.class, "BindingExpectedOneAssignedMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingResolutionEClass, BindingResolution.class, "BindingResolution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingResolution_RightType(), ecorePackage.getEClass(), null, "rightType", null, 1, 1, BindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingResolution_TargetType(), ecorePackage.getEClass(), null, "targetType", null, 1, 1, BindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingResolution_Rules(), this.getResolvedRuleInfo(), null, "rules", null, 0, -1, BindingResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingWithoutRuleEClass, BindingWithoutRule.class, "BindingWithoutRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingWithResolvedByIncompatibleRuleEClass, BindingWithResolvedByIncompatibleRule.class, "BindingWithResolvedByIncompatibleRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingPossiblyUnresolvedEClass, BindingPossiblyUnresolved.class, "BindingPossiblyUnresolved", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingPossiblyUnresolved_ProblematicClasses(), ecorePackage.getEClass(), null, "problematicClasses", null, 1, -1, BindingPossiblyUnresolved.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolvedRuleInfoEClass, ResolvedRuleInfo.class, "ResolvedRuleInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResolvedRuleInfo_Location(), ecorePackage.getEString(), "location", null, 1, 1, ResolvedRuleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedRuleInfo_Element(), ecorePackage.getEObject(), null, "element", null, 1, 1, ResolvedRuleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolvedRuleInfo_RuleName(), ecorePackage.getEString(), "ruleName", null, 1, 1, ResolvedRuleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolvedRuleInfo_OutputType(), ecorePackage.getEClass(), null, "outputType", null, 0, 1, ResolvedRuleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flattenOverNonNestedCollectionEClass, FlattenOverNonNestedCollection.class, "FlattenOverNonNestedCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iteratorOverEmptySequenceEClass, IteratorOverEmptySequence.class, "IteratorOverEmptySequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readingTargetModelEClass, ReadingTargetModel.class, "ReadingTargetModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadingTargetModel_ModelName(), ecorePackage.getEString(), "modelName", null, 1, 1, ReadingTargetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambiguousTargetModelReferenceEClass, AmbiguousTargetModelReference.class, "AmbiguousTargetModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmbiguousTargetModelReference_ModelName(), ecorePackage.getEString(), "modelName", null, 1, 1, AmbiguousTargetModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noModelFoundEClass, NoModelFound.class, "NoModelFound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoModelFound_ModelName(), ecorePackage.getEString(), "modelName", null, 1, 1, NoModelFound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wrongTypeEClass, WrongType.class, "WrongType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iteratorBodyWrongTypeEClass, IteratorBodyWrongType.class, "IteratorBodyWrongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchedRuleWithoutOutputPatternEClass, MatchedRuleWithoutOutputPattern.class, "MatchedRuleWithoutOutputPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expectedCollectionInForEachEClass, ExpectedCollectionInForEach.class, "ExpectedCollectionInForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noClassFoundInMetamodelEClass, NoClassFoundInMetamodel.class, "NoClassFoundInMetamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoClassFoundInMetamodel_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, NoClassFoundInMetamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidArgumentEClass, InvalidArgument.class, "InvalidArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AtlErrorsPackageImpl

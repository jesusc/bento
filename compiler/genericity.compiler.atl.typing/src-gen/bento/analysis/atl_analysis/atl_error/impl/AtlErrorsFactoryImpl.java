/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error.impl;

import bento.analysis.atl_analysis.atl_error.*;

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
public class AtlErrorsFactoryImpl extends EFactoryImpl implements AtlErrorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtlErrorsFactory init() {
		try {
			AtlErrorsFactory theAtlErrorsFactory = (AtlErrorsFactory)EPackage.Registry.INSTANCE.getEFactory(AtlErrorsPackage.eNS_URI);
			if (theAtlErrorsFactory != null) {
				return theAtlErrorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtlErrorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlErrorsFactoryImpl() {
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
			case AtlErrorsPackage.COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR: return createCollectionOperationOverNoCollectionError();
			case AtlErrorsPackage.FEATURE_ACCESS_IN_COLLECTION: return createFeatureAccessInCollection();
			case AtlErrorsPackage.FEATURE_NOT_FOUND: return createFeatureNotFound();
			case AtlErrorsPackage.OPERATION_NOT_FOUND: return createOperationNotFound();
			case AtlErrorsPackage.FEATURE_NOT_FOUND_IN_UNION_TYPE: return createFeatureNotFoundInUnionType();
			case AtlErrorsPackage.INVALID_OPERAND: return createInvalidOperand();
			case AtlErrorsPackage.NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE: return createNoContainerForRefImmediateComposite();
			case AtlErrorsPackage.DIFFERENT_BRANCH_TYPES: return createDifferentBranchTypes();
			case AtlErrorsPackage.NO_BINDING_FOR_COMPULSORY_FEATURE: return createNoBindingForCompulsoryFeature();
			case AtlErrorsPackage.BINDING_EXPECTED_ONE_ASSIGNED_MANY: return createBindingExpectedOneAssignedMany();
			case AtlErrorsPackage.BINDING_WITHOUT_RULE: return createBindingWithoutRule();
			case AtlErrorsPackage.BINDING_WITH_RESOLVED_BY_INCOMPATIBLE_RULE: return createBindingWithResolvedByIncompatibleRule();
			case AtlErrorsPackage.BINDING_POSSIBLY_UNRESOLVED: return createBindingPossiblyUnresolved();
			case AtlErrorsPackage.RESOLVED_RULE_INFO: return createResolvedRuleInfo();
			case AtlErrorsPackage.FLATTEN_OVER_NON_NESTED_COLLECTION: return createFlattenOverNonNestedCollection();
			case AtlErrorsPackage.ITERATOR_OVER_EMPTY_SEQUENCE: return createIteratorOverEmptySequence();
			case AtlErrorsPackage.READING_TARGET_MODEL: return createReadingTargetModel();
			case AtlErrorsPackage.AMBIGUOUS_TARGET_MODEL_REFERENCE: return createAmbiguousTargetModelReference();
			case AtlErrorsPackage.NO_MODEL_FOUND: return createNoModelFound();
			case AtlErrorsPackage.ITERATOR_BODY_WRONG_TYPE: return createIteratorBodyWrongType();
			case AtlErrorsPackage.MATCHED_RULE_WITHOUT_OUTPUT_PATTERN: return createMatchedRuleWithoutOutputPattern();
			case AtlErrorsPackage.EXPECTED_COLLECTION_IN_FOR_EACH: return createExpectedCollectionInForEach();
			case AtlErrorsPackage.NO_CLASS_FOUND_IN_METAMODEL: return createNoClassFoundInMetamodel();
			case AtlErrorsPackage.INVALID_ARGUMENT: return createInvalidArgument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOperationOverNoCollectionError createCollectionOperationOverNoCollectionError() {
		CollectionOperationOverNoCollectionErrorImpl collectionOperationOverNoCollectionError = new CollectionOperationOverNoCollectionErrorImpl();
		return collectionOperationOverNoCollectionError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureAccessInCollection createFeatureAccessInCollection() {
		FeatureAccessInCollectionImpl featureAccessInCollection = new FeatureAccessInCollectionImpl();
		return featureAccessInCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureNotFound createFeatureNotFound() {
		FeatureNotFoundImpl featureNotFound = new FeatureNotFoundImpl();
		return featureNotFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationNotFound createOperationNotFound() {
		OperationNotFoundImpl operationNotFound = new OperationNotFoundImpl();
		return operationNotFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureNotFoundInUnionType createFeatureNotFoundInUnionType() {
		FeatureNotFoundInUnionTypeImpl featureNotFoundInUnionType = new FeatureNotFoundInUnionTypeImpl();
		return featureNotFoundInUnionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidOperand createInvalidOperand() {
		InvalidOperandImpl invalidOperand = new InvalidOperandImpl();
		return invalidOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoContainerForRefImmediateComposite createNoContainerForRefImmediateComposite() {
		NoContainerForRefImmediateCompositeImpl noContainerForRefImmediateComposite = new NoContainerForRefImmediateCompositeImpl();
		return noContainerForRefImmediateComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifferentBranchTypes createDifferentBranchTypes() {
		DifferentBranchTypesImpl differentBranchTypes = new DifferentBranchTypesImpl();
		return differentBranchTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoBindingForCompulsoryFeature createNoBindingForCompulsoryFeature() {
		NoBindingForCompulsoryFeatureImpl noBindingForCompulsoryFeature = new NoBindingForCompulsoryFeatureImpl();
		return noBindingForCompulsoryFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingExpectedOneAssignedMany createBindingExpectedOneAssignedMany() {
		BindingExpectedOneAssignedManyImpl bindingExpectedOneAssignedMany = new BindingExpectedOneAssignedManyImpl();
		return bindingExpectedOneAssignedMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingWithoutRule createBindingWithoutRule() {
		BindingWithoutRuleImpl bindingWithoutRule = new BindingWithoutRuleImpl();
		return bindingWithoutRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingWithResolvedByIncompatibleRule createBindingWithResolvedByIncompatibleRule() {
		BindingWithResolvedByIncompatibleRuleImpl bindingWithResolvedByIncompatibleRule = new BindingWithResolvedByIncompatibleRuleImpl();
		return bindingWithResolvedByIncompatibleRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingPossiblyUnresolved createBindingPossiblyUnresolved() {
		BindingPossiblyUnresolvedImpl bindingPossiblyUnresolved = new BindingPossiblyUnresolvedImpl();
		return bindingPossiblyUnresolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolvedRuleInfo createResolvedRuleInfo() {
		ResolvedRuleInfoImpl resolvedRuleInfo = new ResolvedRuleInfoImpl();
		return resolvedRuleInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlattenOverNonNestedCollection createFlattenOverNonNestedCollection() {
		FlattenOverNonNestedCollectionImpl flattenOverNonNestedCollection = new FlattenOverNonNestedCollectionImpl();
		return flattenOverNonNestedCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorOverEmptySequence createIteratorOverEmptySequence() {
		IteratorOverEmptySequenceImpl iteratorOverEmptySequence = new IteratorOverEmptySequenceImpl();
		return iteratorOverEmptySequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingTargetModel createReadingTargetModel() {
		ReadingTargetModelImpl readingTargetModel = new ReadingTargetModelImpl();
		return readingTargetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbiguousTargetModelReference createAmbiguousTargetModelReference() {
		AmbiguousTargetModelReferenceImpl ambiguousTargetModelReference = new AmbiguousTargetModelReferenceImpl();
		return ambiguousTargetModelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoModelFound createNoModelFound() {
		NoModelFoundImpl noModelFound = new NoModelFoundImpl();
		return noModelFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorBodyWrongType createIteratorBodyWrongType() {
		IteratorBodyWrongTypeImpl iteratorBodyWrongType = new IteratorBodyWrongTypeImpl();
		return iteratorBodyWrongType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedRuleWithoutOutputPattern createMatchedRuleWithoutOutputPattern() {
		MatchedRuleWithoutOutputPatternImpl matchedRuleWithoutOutputPattern = new MatchedRuleWithoutOutputPatternImpl();
		return matchedRuleWithoutOutputPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedCollectionInForEach createExpectedCollectionInForEach() {
		ExpectedCollectionInForEachImpl expectedCollectionInForEach = new ExpectedCollectionInForEachImpl();
		return expectedCollectionInForEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoClassFoundInMetamodel createNoClassFoundInMetamodel() {
		NoClassFoundInMetamodelImpl noClassFoundInMetamodel = new NoClassFoundInMetamodelImpl();
		return noClassFoundInMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidArgument createInvalidArgument() {
		InvalidArgumentImpl invalidArgument = new InvalidArgumentImpl();
		return invalidArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlErrorsPackage getAtlErrorsPackage() {
		return (AtlErrorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtlErrorsPackage getPackage() {
		return AtlErrorsPackage.eINSTANCE;
	}

} //AtlErrorsFactoryImpl

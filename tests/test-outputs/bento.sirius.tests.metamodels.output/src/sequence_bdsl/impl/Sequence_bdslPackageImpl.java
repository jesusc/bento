/**
 */
package sequence_bdsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sequence_bdsl.BindingElement;
import sequence_bdsl.Element;
import sequence_bdsl.FeatureClass;
import sequence_bdsl.IntemediateElement;
import sequence_bdsl.MetamodelElement;
import sequence_bdsl.MetamodelElementFeature;
import sequence_bdsl.SequenceModel;
import sequence_bdsl.Sequence_bdslFactory;
import sequence_bdsl.Sequence_bdslPackage;
import sequence_bdsl.valueElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sequence_bdslPackageImpl extends EPackageImpl implements Sequence_bdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intemediateElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureClassEClass = null;

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
	 * @see sequence_bdsl.Sequence_bdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sequence_bdslPackageImpl() {
		super(eNS_URI, Sequence_bdslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Sequence_bdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Sequence_bdslPackage init() {
		if (isInited) return (Sequence_bdslPackage)EPackage.Registry.INSTANCE.getEPackage(Sequence_bdslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSequence_bdslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Sequence_bdslPackageImpl theSequence_bdslPackage = registeredSequence_bdslPackage instanceof Sequence_bdslPackageImpl ? (Sequence_bdslPackageImpl)registeredSequence_bdslPackage : new Sequence_bdslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSequence_bdslPackage.createPackageContents();

		// Initialize created meta-data
		theSequence_bdslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSequence_bdslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sequence_bdslPackage.eNS_URI, theSequence_bdslPackage);
		return theSequence_bdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceModel() {
		return sequenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceModel_Elements() {
		return (EReference)sequenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceModel_ContainsMetamodelElement() {
		return (EReference)sequenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceModel_ContainsIntermediateElement() {
		return (EReference)sequenceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceModel_ContainsFeatureClass() {
		return (EReference)sequenceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceModel_ContainsMetamodelElementFeature() {
		return (EReference)sequenceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Value() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Next() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ContainsvalueElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvalueElement() {
		return valueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvalueElement_Value() {
		return (EAttribute)valueElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingElement() {
		return bindingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelElement() {
		return metamodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElement_Name() {
		return (EAttribute)metamodelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElement_MetamodelElementFeature() {
		return (EReference)metamodelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntemediateElement() {
		return intemediateElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntemediateElement_BindingElement() {
		return (EReference)intemediateElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntemediateElement_MetamodElelement() {
		return (EReference)intemediateElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelElementFeature() {
		return metamodelElementFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementFeature_Name() {
		return (EAttribute)metamodelElementFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElementFeature_FeatureClass() {
		return (EReference)metamodelElementFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureClass() {
		return featureClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_bdslFactory getSequence_bdslFactory() {
		return (Sequence_bdslFactory)getEFactoryInstance();
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
		sequenceModelEClass = createEClass(SEQUENCE_MODEL);
		createEReference(sequenceModelEClass, SEQUENCE_MODEL__ELEMENTS);
		createEReference(sequenceModelEClass, SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT);
		createEReference(sequenceModelEClass, SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT);
		createEReference(sequenceModelEClass, SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS);
		createEReference(sequenceModelEClass, SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__VALUE);
		createEReference(elementEClass, ELEMENT__NEXT);
		createEReference(elementEClass, ELEMENT__CONTAINSVALUE_ELEMENT);

		valueElementEClass = createEClass(VALUE_ELEMENT);
		createEAttribute(valueElementEClass, VALUE_ELEMENT__VALUE);

		bindingElementEClass = createEClass(BINDING_ELEMENT);

		metamodelElementEClass = createEClass(METAMODEL_ELEMENT);
		createEAttribute(metamodelElementEClass, METAMODEL_ELEMENT__NAME);
		createEReference(metamodelElementEClass, METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE);

		intemediateElementEClass = createEClass(INTEMEDIATE_ELEMENT);
		createEReference(intemediateElementEClass, INTEMEDIATE_ELEMENT__BINDING_ELEMENT);
		createEReference(intemediateElementEClass, INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT);

		metamodelElementFeatureEClass = createEClass(METAMODEL_ELEMENT_FEATURE);
		createEAttribute(metamodelElementFeatureEClass, METAMODEL_ELEMENT_FEATURE__NAME);
		createEReference(metamodelElementFeatureEClass, METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS);

		featureClassEClass = createEClass(FEATURE_CLASS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(this.getBindingElement());
		valueElementEClass.getESuperTypes().add(this.getFeatureClass());

		// Initialize classes, features, and operations; add parameters
		initEClass(sequenceModelEClass, SequenceModel.class, "SequenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceModel_Elements(), this.getElement(), null, "elements", null, 0, -1, SequenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceModel_ContainsMetamodelElement(), this.getMetamodelElement(), null, "containsMetamodelElement", null, 0, -1, SequenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceModel_ContainsIntermediateElement(), this.getIntemediateElement(), null, "containsIntermediateElement", null, 0, -1, SequenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceModel_ContainsFeatureClass(), this.getFeatureClass(), null, "containsFeatureClass", null, 0, -1, SequenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceModel_ContainsMetamodelElementFeature(), this.getFeatureClass(), null, "containsMetamodelElementFeature", null, 0, -1, SequenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Value(), ecorePackage.getEString(), "value", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Next(), this.getElement(), null, "next", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ContainsvalueElement(), this.getvalueElement(), null, "containsvalueElement", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueElementEClass, valueElement.class, "valueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getvalueElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, valueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingElementEClass, BindingElement.class, "BindingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metamodelElementEClass, MetamodelElement.class, "MetamodelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelElement_MetamodelElementFeature(), this.getMetamodelElementFeature(), null, "metamodelElementFeature", null, 0, -1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intemediateElementEClass, IntemediateElement.class, "IntemediateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntemediateElement_BindingElement(), this.getBindingElement(), null, "bindingElement", null, 1, 1, IntemediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntemediateElement_MetamodElelement(), this.getMetamodelElement(), null, "metamodElelement", null, 1, 1, IntemediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelElementFeatureEClass, MetamodelElementFeature.class, "MetamodelElementFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelElementFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelElementFeature_FeatureClass(), this.getFeatureClass(), null, "featureClass", null, 0, -1, MetamodelElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureClassEClass, FeatureClass.class, "FeatureClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Sequence_bdslPackageImpl

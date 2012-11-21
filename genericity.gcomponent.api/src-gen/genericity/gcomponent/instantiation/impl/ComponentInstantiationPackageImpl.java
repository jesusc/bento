/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation.impl;

import genericity.gcomponent.instantiation.AdaptWithBinding;
import genericity.gcomponent.instantiation.AdaptedTransformation;
import genericity.gcomponent.instantiation.ComponentInstantiation;
import genericity.gcomponent.instantiation.ComponentInstantiationFactory;
import genericity.gcomponent.instantiation.ComponentInstantiationPackage;
import genericity.gcomponent.instantiation.ExecutableTransformation;

import genericity.language.gcomponent.GcomponentPackage;

import genericity.language.gcomponent.core.CorePackage;

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
public class ComponentInstantiationPackageImpl extends EPackageImpl implements ComponentInstantiationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptedTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptWithBindingEClass = null;

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
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentInstantiationPackageImpl() {
		super(eNS_URI, ComponentInstantiationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentInstantiationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentInstantiationPackage init() {
		if (isInited) return (ComponentInstantiationPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentInstantiationPackage.eNS_URI);

		// Obtain or create and register package
		ComponentInstantiationPackageImpl theComponentInstantiationPackage = (ComponentInstantiationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentInstantiationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentInstantiationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GcomponentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentInstantiationPackage.createPackageContents();

		// Initialize created meta-data
		theComponentInstantiationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentInstantiationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentInstantiationPackage.eNS_URI, theComponentInstantiationPackage);
		return theComponentInstantiationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstantiation() {
		return componentInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstantiation_Transformation() {
		return (EReference)componentInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableTransformation() {
		return executableTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptedTransformation() {
		return adaptedTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptedTransformation_Template() {
		return (EReference)adaptedTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptedTransformation_RequiredAdaptations() {
		return (EReference)adaptedTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptWithBinding() {
		return adaptWithBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdaptWithBinding_ParameterIndex() {
		return (EAttribute)adaptWithBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptWithBinding_ConcreteModel() {
		return (EReference)adaptWithBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptWithBinding_ConceptModel() {
		return (EReference)adaptWithBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptWithBinding_AppliedBinding() {
		return (EReference)adaptWithBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiationFactory getComponentInstantiationFactory() {
		return (ComponentInstantiationFactory)getEFactoryInstance();
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
		componentInstantiationEClass = createEClass(COMPONENT_INSTANTIATION);
		createEReference(componentInstantiationEClass, COMPONENT_INSTANTIATION__TRANSFORMATION);

		executableTransformationEClass = createEClass(EXECUTABLE_TRANSFORMATION);

		adaptedTransformationEClass = createEClass(ADAPTED_TRANSFORMATION);
		createEReference(adaptedTransformationEClass, ADAPTED_TRANSFORMATION__TEMPLATE);
		createEReference(adaptedTransformationEClass, ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS);

		adaptWithBindingEClass = createEClass(ADAPT_WITH_BINDING);
		createEAttribute(adaptWithBindingEClass, ADAPT_WITH_BINDING__PARAMETER_INDEX);
		createEReference(adaptWithBindingEClass, ADAPT_WITH_BINDING__CONCRETE_MODEL);
		createEReference(adaptWithBindingEClass, ADAPT_WITH_BINDING__CONCEPT_MODEL);
		createEReference(adaptWithBindingEClass, ADAPT_WITH_BINDING__APPLIED_BINDING);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adaptedTransformationEClass.getESuperTypes().add(this.getExecutableTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(componentInstantiationEClass, ComponentInstantiation.class, "ComponentInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstantiation_Transformation(), this.getExecutableTransformation(), null, "transformation", null, 1, 1, ComponentInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executableTransformationEClass, ExecutableTransformation.class, "ExecutableTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adaptedTransformationEClass, AdaptedTransformation.class, "AdaptedTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptedTransformation_Template(), theCorePackage.getTemplate(), null, "template", null, 1, 1, AdaptedTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptedTransformation_RequiredAdaptations(), this.getAdaptWithBinding(), null, "requiredAdaptations", null, 0, -1, AdaptedTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptWithBindingEClass, AdaptWithBinding.class, "AdaptWithBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdaptWithBinding_ParameterIndex(), ecorePackage.getEInt(), "parameterIndex", null, 1, 1, AdaptWithBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptWithBinding_ConcreteModel(), theCorePackage.getParameterModel(), null, "concreteModel", null, 1, 1, AdaptWithBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptWithBinding_ConceptModel(), theCorePackage.getParameterModel(), null, "conceptModel", null, 1, 1, AdaptWithBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptWithBinding_AppliedBinding(), theCorePackage.getBindingDeclaration(), null, "appliedBinding", null, 1, 1, AdaptWithBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentInstantiationPackageImpl

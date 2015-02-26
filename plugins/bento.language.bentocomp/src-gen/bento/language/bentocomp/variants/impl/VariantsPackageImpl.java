/**
 */
package bento.language.bentocomp.variants.impl;

import bento.language.bentocomp.BentocompPackage;

import bento.language.bentocomp.core.CorePackage;

import bento.language.bentocomp.core.impl.CorePackageImpl;

import bento.language.bentocomp.dsl.DslPackage;

import bento.language.bentocomp.dsl.impl.DslPackageImpl;

import bento.language.bentocomp.flowcontrol.FlowcontrolPackage;

import bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl;

import bento.language.bentocomp.impl.BentocompPackageImpl;

import bento.language.bentocomp.technologies.TechnologiesPackage;

import bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl;

import bento.language.bentocomp.variants.CompositeFeature;
import bento.language.bentocomp.variants.Feature;
import bento.language.bentocomp.variants.Parameter;
import bento.language.bentocomp.variants.SingleFeature;
import bento.language.bentocomp.variants.VariantsFactory;
import bento.language.bentocomp.variants.VariantsPackage;
import bento.language.bentocomp.variants.XorFeature;

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
public class VariantsPackageImpl extends EPackageImpl implements VariantsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorFeatureEClass = null;

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
	 * @see bento.language.bentocomp.variants.VariantsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariantsPackageImpl() {
		super(eNS_URI, VariantsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VariantsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariantsPackage init() {
		if (isInited) return (VariantsPackage)EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI);

		// Obtain or create and register package
		VariantsPackageImpl theVariantsPackage = (VariantsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariantsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariantsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BentocompPackageImpl theBentocompPackage = (BentocompPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BentocompPackage.eNS_URI) instanceof BentocompPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BentocompPackage.eNS_URI) : BentocompPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		FlowcontrolPackageImpl theFlowcontrolPackage = (FlowcontrolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI) instanceof FlowcontrolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI) : FlowcontrolPackage.eINSTANCE);
		DslPackageImpl theDslPackage = (DslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI) instanceof DslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI) : DslPackage.eINSTANCE);
		TechnologiesPackageImpl theTechnologiesPackage = (TechnologiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI) instanceof TechnologiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI) : TechnologiesPackage.eINSTANCE);

		// Create package meta-data objects
		theVariantsPackage.createPackageContents();
		theBentocompPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theFlowcontrolPackage.createPackageContents();
		theDslPackage.createPackageContents();
		theTechnologiesPackage.createPackageContents();

		// Initialize created meta-data
		theVariantsPackage.initializePackageContents();
		theBentocompPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theFlowcontrolPackage.initializePackageContents();
		theDslPackage.initializePackageContents();
		theTechnologiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariantsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariantsPackage.eNS_URI, theVariantsPackage);
		return theVariantsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFeature() {
		return singleFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeFeature() {
		return compositeFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeFeature_Children() {
		return (EReference)compositeFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXorFeature() {
		return xorFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantsFactory getVariantsFactory() {
		return (VariantsFactory)getEFactoryInstance();
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
		parameterEClass = createEClass(PARAMETER);

		featureEClass = createEClass(FEATURE);

		singleFeatureEClass = createEClass(SINGLE_FEATURE);

		compositeFeatureEClass = createEClass(COMPOSITE_FEATURE);
		createEReference(compositeFeatureEClass, COMPOSITE_FEATURE__CHILDREN);

		xorFeatureEClass = createEClass(XOR_FEATURE);
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
		parameterEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		featureEClass.getESuperTypes().add(this.getParameter());
		singleFeatureEClass.getESuperTypes().add(this.getFeature());
		compositeFeatureEClass.getESuperTypes().add(this.getFeature());
		xorFeatureEClass.getESuperTypes().add(this.getCompositeFeature());

		// Initialize classes and features; add operations and parameters
		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleFeatureEClass, SingleFeature.class, "SingleFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeFeatureEClass, CompositeFeature.class, "CompositeFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeFeature_Children(), this.getFeature(), null, "children", null, 1, -1, CompositeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xorFeatureEClass, XorFeature.class, "XorFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //VariantsPackageImpl

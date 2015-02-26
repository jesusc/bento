/**
 */
package bento.language.bentocomp.impl;

import bento.language.bentocomp.BentocompFactory;
import bento.language.bentocomp.BentocompPackage;
import bento.language.bentocomp.DummyClass;

import bento.language.bentocomp.core.CorePackage;

import bento.language.bentocomp.core.impl.CorePackageImpl;

import bento.language.bentocomp.dsl.DslPackage;

import bento.language.bentocomp.dsl.impl.DslPackageImpl;

import bento.language.bentocomp.flowcontrol.FlowcontrolPackage;

import bento.language.bentocomp.flowcontrol.impl.FlowcontrolPackageImpl;

import bento.language.bentocomp.technologies.TechnologiesPackage;

import bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl;

import bento.language.bentocomp.variants.VariantsPackage;

import bento.language.bentocomp.variants.impl.VariantsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BentocompPackageImpl extends EPackageImpl implements BentocompPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyClassEClass = null;

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
	 * @see bento.language.bentocomp.BentocompPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BentocompPackageImpl() {
		super(eNS_URI, BentocompFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BentocompPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BentocompPackage init() {
		if (isInited) return (BentocompPackage)EPackage.Registry.INSTANCE.getEPackage(BentocompPackage.eNS_URI);

		// Obtain or create and register package
		BentocompPackageImpl theBentocompPackage = (BentocompPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BentocompPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BentocompPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		VariantsPackageImpl theVariantsPackage = (VariantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI) instanceof VariantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI) : VariantsPackage.eINSTANCE);
		FlowcontrolPackageImpl theFlowcontrolPackage = (FlowcontrolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI) instanceof FlowcontrolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI) : FlowcontrolPackage.eINSTANCE);
		DslPackageImpl theDslPackage = (DslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI) instanceof DslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI) : DslPackage.eINSTANCE);
		TechnologiesPackageImpl theTechnologiesPackage = (TechnologiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI) instanceof TechnologiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI) : TechnologiesPackage.eINSTANCE);

		// Create package meta-data objects
		theBentocompPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theVariantsPackage.createPackageContents();
		theFlowcontrolPackage.createPackageContents();
		theDslPackage.createPackageContents();
		theTechnologiesPackage.createPackageContents();

		// Initialize created meta-data
		theBentocompPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theVariantsPackage.initializePackageContents();
		theFlowcontrolPackage.initializePackageContents();
		theDslPackage.initializePackageContents();
		theTechnologiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBentocompPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BentocompPackage.eNS_URI, theBentocompPackage);
		return theBentocompPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummyClass() {
		return dummyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BentocompFactory getBentocompFactory() {
		return (BentocompFactory)getEFactoryInstance();
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
		dummyClassEClass = createEClass(DUMMY_CLASS);
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
		FlowcontrolPackage theFlowcontrolPackage = (FlowcontrolPackage)EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI);
		DslPackage theDslPackage = (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);
		TechnologiesPackage theTechnologiesPackage = (TechnologiesPackage)EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theVariantsPackage);
		getESubpackages().add(theFlowcontrolPackage);
		getESubpackages().add(theDslPackage);
		getESubpackages().add(theTechnologiesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dummyClassEClass, DummyClass.class, "DummyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BentocompPackageImpl

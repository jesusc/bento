/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.dsl.impl;

import genericity.language.gcomponent.GcomponentPackage;
import genericity.language.gcomponent.core.CorePackage;

import genericity.language.gcomponent.core.impl.CorePackageImpl;

import genericity.language.gcomponent.dsl.DefinitionRoot;
import genericity.language.gcomponent.dsl.DslFactory;
import genericity.language.gcomponent.dsl.DslPackage;

import genericity.language.gcomponent.flowcontrol.FlowcontrolPackage;

import genericity.language.gcomponent.flowcontrol.impl.FlowcontrolPackageImpl;

import genericity.language.gcomponent.impl.GcomponentPackageImpl;
import genericity.language.gcomponent.technologies.TechnologiesPackage;
import genericity.language.gcomponent.technologies.impl.TechnologiesPackageImpl;
import genericity.language.gcomponent.variants.VariantsPackage;

import genericity.language.gcomponent.variants.impl.VariantsPackageImpl;

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
public class DslPackageImpl extends EPackageImpl implements DslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionRootEClass = null;

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
	 * @see genericity.language.gcomponent.dsl.DslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DslPackageImpl() {
		super(eNS_URI, DslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DslPackage init() {
		if (isInited) return (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);

		// Obtain or create and register package
		DslPackageImpl theDslPackage = (DslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DslPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GcomponentPackageImpl theGcomponentPackage = (GcomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GcomponentPackage.eNS_URI) instanceof GcomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GcomponentPackage.eNS_URI) : GcomponentPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		VariantsPackageImpl theVariantsPackage = (VariantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI) instanceof VariantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI) : VariantsPackage.eINSTANCE);
		FlowcontrolPackageImpl theFlowcontrolPackage = (FlowcontrolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI) instanceof FlowcontrolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI) : FlowcontrolPackage.eINSTANCE);
		TechnologiesPackageImpl theTechnologiesPackage = (TechnologiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI) instanceof TechnologiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI) : TechnologiesPackage.eINSTANCE);

		// Create package meta-data objects
		theDslPackage.createPackageContents();
		theGcomponentPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theVariantsPackage.createPackageContents();
		theFlowcontrolPackage.createPackageContents();
		theTechnologiesPackage.createPackageContents();

		// Initialize created meta-data
		theDslPackage.initializePackageContents();
		theGcomponentPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theVariantsPackage.initializePackageContents();
		theFlowcontrolPackage.initializePackageContents();
		theTechnologiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDslPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DslPackage.eNS_URI, theDslPackage);
		return theDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionRoot() {
		return definitionRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionRoot_Component() {
		return (EReference)definitionRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFactory getDslFactory() {
		return (DslFactory)getEFactoryInstance();
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
		definitionRootEClass = createEClass(DEFINITION_ROOT);
		createEReference(definitionRootEClass, DEFINITION_ROOT__COMPONENT);
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

		// Initialize classes and features; add operations and parameters
		initEClass(definitionRootEClass, DefinitionRoot.class, "DefinitionRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionRoot_Component(), theCorePackage.getComponent(), null, "component", null, 1, 1, DefinitionRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DslPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.technologies.impl;

import genericity.language.gcomponent.GcomponentPackage;
import genericity.language.gcomponent.core.CorePackage;

import genericity.language.gcomponent.core.impl.CorePackageImpl;

import genericity.language.gcomponent.dsl.DslPackage;

import genericity.language.gcomponent.dsl.impl.DslPackageImpl;

import genericity.language.gcomponent.flowcontrol.FlowcontrolPackage;

import genericity.language.gcomponent.flowcontrol.impl.FlowcontrolPackageImpl;

import genericity.language.gcomponent.impl.GcomponentPackageImpl;
import genericity.language.gcomponent.technologies.AtlParameter;
import genericity.language.gcomponent.technologies.AtlTemplate;
import genericity.language.gcomponent.technologies.JavaTemplate;
import genericity.language.gcomponent.technologies.TechnologiesFactory;
import genericity.language.gcomponent.technologies.TechnologiesPackage;

import genericity.language.gcomponent.variants.VariantsPackage;

import genericity.language.gcomponent.variants.impl.VariantsPackageImpl;

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
public class TechnologiesPackageImpl extends EPackageImpl implements TechnologiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atlTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atlParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaTemplateEClass = null;

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
	 * @see genericity.language.gcomponent.technologies.TechnologiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TechnologiesPackageImpl() {
		super(eNS_URI, TechnologiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TechnologiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TechnologiesPackage init() {
		if (isInited) return (TechnologiesPackage)EPackage.Registry.INSTANCE.getEPackage(TechnologiesPackage.eNS_URI);

		// Obtain or create and register package
		TechnologiesPackageImpl theTechnologiesPackage = (TechnologiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TechnologiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TechnologiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GcomponentPackageImpl theGcomponentPackage = (GcomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GcomponentPackage.eNS_URI) instanceof GcomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GcomponentPackage.eNS_URI) : GcomponentPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		VariantsPackageImpl theVariantsPackage = (VariantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI) instanceof VariantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariantsPackage.eNS_URI) : VariantsPackage.eINSTANCE);
		FlowcontrolPackageImpl theFlowcontrolPackage = (FlowcontrolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI) instanceof FlowcontrolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FlowcontrolPackage.eNS_URI) : FlowcontrolPackage.eINSTANCE);
		DslPackageImpl theDslPackage = (DslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI) instanceof DslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI) : DslPackage.eINSTANCE);

		// Create package meta-data objects
		theTechnologiesPackage.createPackageContents();
		theGcomponentPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theVariantsPackage.createPackageContents();
		theFlowcontrolPackage.createPackageContents();
		theDslPackage.createPackageContents();

		// Initialize created meta-data
		theTechnologiesPackage.initializePackageContents();
		theGcomponentPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theVariantsPackage.initializePackageContents();
		theFlowcontrolPackage.initializePackageContents();
		theDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTechnologiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TechnologiesPackage.eNS_URI, theTechnologiesPackage);
		return theTechnologiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtlTemplate() {
		return atlTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtlTemplate_Template() {
		return (EAttribute)atlTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtlTemplate_Parameters() {
		return (EReference)atlTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtlParameter() {
		return atlParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtlParameter_AtlModelName() {
		return (EAttribute)atlParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtlParameter_AtlMetamodelName() {
		return (EAttribute)atlParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtlParameter_Model() {
		return (EReference)atlParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaTemplate() {
		return javaTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaTemplate_QualifiedClassname() {
		return (EAttribute)javaTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologiesFactory getTechnologiesFactory() {
		return (TechnologiesFactory)getEFactoryInstance();
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
		atlTemplateEClass = createEClass(ATL_TEMPLATE);
		createEAttribute(atlTemplateEClass, ATL_TEMPLATE__TEMPLATE);
		createEReference(atlTemplateEClass, ATL_TEMPLATE__PARAMETERS);

		atlParameterEClass = createEClass(ATL_PARAMETER);
		createEAttribute(atlParameterEClass, ATL_PARAMETER__ATL_MODEL_NAME);
		createEAttribute(atlParameterEClass, ATL_PARAMETER__ATL_METAMODEL_NAME);
		createEReference(atlParameterEClass, ATL_PARAMETER__MODEL);

		javaTemplateEClass = createEClass(JAVA_TEMPLATE);
		createEAttribute(javaTemplateEClass, JAVA_TEMPLATE__QUALIFIED_CLASSNAME);
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
		atlTemplateEClass.getESuperTypes().add(theCorePackage.getTemplate());
		javaTemplateEClass.getESuperTypes().add(theCorePackage.getTemplate());

		// Initialize classes and features; add operations and parameters
		initEClass(atlTemplateEClass, AtlTemplate.class, "AtlTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtlTemplate_Template(), ecorePackage.getEString(), "template", null, 1, 1, AtlTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtlTemplate_Parameters(), this.getAtlParameter(), null, "parameters", null, 0, -1, AtlTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atlParameterEClass, AtlParameter.class, "AtlParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtlParameter_AtlModelName(), ecorePackage.getEString(), "atlModelName", null, 1, 1, AtlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtlParameter_AtlMetamodelName(), ecorePackage.getEString(), "atlMetamodelName", null, 0, 1, AtlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtlParameter_Model(), theCorePackage.getModel(), null, "model", null, 0, 1, AtlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaTemplateEClass, JavaTemplate.class, "JavaTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaTemplate_QualifiedClassname(), ecorePackage.getEString(), "qualifiedClassname", null, 1, 1, JavaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TechnologiesPackageImpl

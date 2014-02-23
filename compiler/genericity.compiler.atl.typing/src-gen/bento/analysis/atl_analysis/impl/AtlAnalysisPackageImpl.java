/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.impl;

import bento.analysis.atl_analysis.AnalysisInfo;
import bento.analysis.atl_analysis.AnalysisResult;
import bento.analysis.atl_analysis.AtlAnalysisFactory;
import bento.analysis.atl_analysis.AtlAnalysisPackage;
import bento.analysis.atl_analysis.Problem;

import bento.analysis.atl_analysis.Recovery;
import bento.analysis.atl_analysis.atl_error.AtlErrorsPackage;

import bento.analysis.atl_analysis.atl_error.impl.AtlErrorsPackageImpl;

import bento.analysis.atl_analysis.atl_recovery.AtlRecoveryPackage;
import bento.analysis.atl_analysis.atl_recovery.impl.AtlRecoveryPackageImpl;
import genericity.typing.atl_types.AtlTypingPackage;
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
public class AtlAnalysisPackageImpl extends EPackageImpl implements AtlAnalysisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoveryEClass = null;

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
	 * @see bento.analysis.atl_analysis.AtlAnalysisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtlAnalysisPackageImpl() {
		super(eNS_URI, AtlAnalysisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AtlAnalysisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtlAnalysisPackage init() {
		if (isInited) return (AtlAnalysisPackage)EPackage.Registry.INSTANCE.getEPackage(AtlAnalysisPackage.eNS_URI);

		// Obtain or create and register package
		AtlAnalysisPackageImpl theAtlAnalysisPackage = (AtlAnalysisPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AtlAnalysisPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AtlAnalysisPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AtlTypingPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AtlErrorsPackageImpl theAtlErrorsPackage = (AtlErrorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtlErrorsPackage.eNS_URI) instanceof AtlErrorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtlErrorsPackage.eNS_URI) : AtlErrorsPackage.eINSTANCE);
		AtlRecoveryPackageImpl theAtlRecoveryPackage = (AtlRecoveryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AtlRecoveryPackage.eNS_URI) instanceof AtlRecoveryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AtlRecoveryPackage.eNS_URI) : AtlRecoveryPackage.eINSTANCE);

		// Create package meta-data objects
		theAtlAnalysisPackage.createPackageContents();
		theAtlErrorsPackage.createPackageContents();
		theAtlRecoveryPackage.createPackageContents();

		// Initialize created meta-data
		theAtlAnalysisPackage.initializePackageContents();
		theAtlErrorsPackage.initializePackageContents();
		theAtlRecoveryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtlAnalysisPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtlAnalysisPackage.eNS_URI, theAtlAnalysisPackage);
		return theAtlAnalysisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisResult() {
		return analysisResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisResult_Problems() {
		return (EReference)analysisResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisInfo() {
		return analysisInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblem() {
		return problemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecovery() {
		return recoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlAnalysisFactory getAtlAnalysisFactory() {
		return (AtlAnalysisFactory)getEFactoryInstance();
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
		analysisResultEClass = createEClass(ANALYSIS_RESULT);
		createEReference(analysisResultEClass, ANALYSIS_RESULT__PROBLEMS);

		analysisInfoEClass = createEClass(ANALYSIS_INFO);

		problemEClass = createEClass(PROBLEM);

		recoveryEClass = createEClass(RECOVERY);
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
		AtlErrorsPackage theAtlErrorsPackage = (AtlErrorsPackage)EPackage.Registry.INSTANCE.getEPackage(AtlErrorsPackage.eNS_URI);
		AtlRecoveryPackage theAtlRecoveryPackage = (AtlRecoveryPackage)EPackage.Registry.INSTANCE.getEPackage(AtlRecoveryPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAtlErrorsPackage);
		getESubpackages().add(theAtlRecoveryPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		problemEClass.getESuperTypes().add(this.getAnalysisInfo());

		// Initialize classes and features; add operations and parameters
		initEClass(analysisResultEClass, AnalysisResult.class, "AnalysisResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisResult_Problems(), this.getProblem(), null, "problems", null, 0, -1, AnalysisResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisInfoEClass, AnalysisInfo.class, "AnalysisInfo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(problemEClass, Problem.class, "Problem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recoveryEClass, Recovery.class, "Recovery", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AtlAnalysisPackageImpl

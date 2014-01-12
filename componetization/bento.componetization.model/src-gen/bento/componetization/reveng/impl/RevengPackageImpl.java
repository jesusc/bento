/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.componetization.reveng.impl;

import bento.componetization.reveng.AtlTransformation;
import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.RevengFactory;
import bento.componetization.reveng.RevengModel;
import bento.componetization.reveng.RevengPackage;
import bento.componetization.reveng.Transformation;

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
public class RevengPackageImpl extends EPackageImpl implements RevengPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revengModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atlTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelEClass = null;

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
	 * @see bento.componetization.reveng.RevengPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RevengPackageImpl() {
		super(eNS_URI, RevengFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RevengPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RevengPackage init() {
		if (isInited) return (RevengPackage)EPackage.Registry.INSTANCE.getEPackage(RevengPackage.eNS_URI);

		// Obtain or create and register package
		RevengPackageImpl theRevengPackage = (RevengPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RevengPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RevengPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRevengPackage.createPackageContents();

		// Initialize created meta-data
		theRevengPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRevengPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RevengPackage.eNS_URI, theRevengPackage);
		return theRevengPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevengModel() {
		return revengModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevengModel_Transformation() {
		return (EReference)revengModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Path() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtlTransformation() {
		return atlTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtlTransformation_Metamodels() {
		return (EReference)atlTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodel() {
		return metamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodel_Name() {
		return (EAttribute)metamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodel_URI() {
		return (EAttribute)metamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevengFactory getRevengFactory() {
		return (RevengFactory)getEFactoryInstance();
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
		revengModelEClass = createEClass(REVENG_MODEL);
		createEReference(revengModelEClass, REVENG_MODEL__TRANSFORMATION);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__PATH);

		atlTransformationEClass = createEClass(ATL_TRANSFORMATION);
		createEReference(atlTransformationEClass, ATL_TRANSFORMATION__METAMODELS);

		metamodelEClass = createEClass(METAMODEL);
		createEAttribute(metamodelEClass, METAMODEL__NAME);
		createEAttribute(metamodelEClass, METAMODEL__URI);
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
		atlTransformationEClass.getESuperTypes().add(this.getTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(revengModelEClass, RevengModel.class, "RevengModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevengModel_Transformation(), this.getTransformation(), null, "transformation", null, 1, 1, RevengModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Path(), ecorePackage.getEString(), "path", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atlTransformationEClass, AtlTransformation.class, "AtlTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtlTransformation_Metamodels(), this.getMetamodel(), null, "metamodels", null, 0, -1, AtlTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelEClass, Metamodel.class, "Metamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodel_URI(), ecorePackage.getEString(), "URI", null, 1, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RevengPackageImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.BaseHelper;
import gbind.dsl.BindingModel;
import gbind.dsl.BindingOptions;
import gbind.dsl.ClassBinding;
import gbind.dsl.ConceptBinding;
import gbind.dsl.ConceptFeatureRef;
import gbind.dsl.ConceptHelper;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.ConcreteReferencDeclaringVar;
import gbind.dsl.DslFactory;
import gbind.dsl.DslPackage;
import gbind.dsl.HelperParameter;
import gbind.dsl.IntermediateClassBinding;
import gbind.dsl.LocalHelper;
import gbind.dsl.Metaclass;
import gbind.dsl.MetamodelDeclaration;
import gbind.dsl.OclFeatureBinding;
import gbind.dsl.RenamingFeatureBinding;
import gbind.dsl.VirtualAttribute;
import gbind.dsl.VirtualClassBinding;
import gbind.dsl.VirtualFeature;
import gbind.dsl.VirtualMetaclass;
import gbind.dsl.VirtualReference;

import gbind.dsl.VirtualTupleExp;
import gbind.simpleocl.SimpleoclPackage;

import gbind.simpleocl.impl.SimpleoclPackageImpl;

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
public class DslPackageImpl extends EPackageImpl implements DslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMetaclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteMetaclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateClassBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteReferencDeclaringVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMetaclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualTupleExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualClassBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptFeatureRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseFeatureBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renamingFeatureBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclFeatureBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperParameterEClass = null;

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
	 * @see gbind.dsl.DslPackage#eNS_URI
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
		SimpleoclPackageImpl theSimpleoclPackage = (SimpleoclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimpleoclPackage.eNS_URI) instanceof SimpleoclPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimpleoclPackage.eNS_URI) : SimpleoclPackage.eINSTANCE);

		// Create package meta-data objects
		theDslPackage.createPackageContents();
		theSimpleoclPackage.createPackageContents();

		// Initialize created meta-data
		theDslPackage.initializePackageContents();
		theSimpleoclPackage.initializePackageContents();

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
	public EClass getBindingModel() {
		return bindingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingModel_TargetBinding() {
		return (EAttribute)bindingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingModel_Bindings() {
		return (EReference)bindingModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingModel_Helpers() {
		return (EReference)bindingModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingModel_ConceptMetaclasses() {
		return (EReference)bindingModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingModel_ConcreteMetaclasses() {
		return (EReference)bindingModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingModel_VirtualMetaclasses() {
		return (EReference)bindingModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingModel_BoundConcept() {
		return (EReference)bindingModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingModel_BoundMetamodels() {
		return (EReference)bindingModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingModel_Name() {
		return (EAttribute)bindingModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingModel_Options() {
		return (EReference)bindingModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingOptions() {
		return bindingOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingOptions_EnableClassMerge() {
		return (EAttribute)bindingOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelDeclaration() {
		return metamodelDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelDeclaration_MetamodelURI() {
		return (EAttribute)metamodelDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelDeclaration_Resource() {
		return (EAttribute)metamodelDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaclass() {
		return metaclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaclass_Name() {
		return (EAttribute)metaclassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaclass_Eclass() {
		return (EReference)metaclassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMetaclass() {
		return conceptMetaclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteMetaclass() {
		return concreteMetaclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptBinding() {
		return conceptBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptBinding_DebugName() {
		return (EAttribute)conceptBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptBinding_Model_() {
		return (EReference)conceptBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassBinding() {
		return classBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBinding_Concept() {
		return (EReference)classBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBinding_Concrete() {
		return (EReference)classBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBinding_WhenClause() {
		return (EReference)classBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateClassBinding() {
		return intermediateClassBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateClassBinding_Concept() {
		return (EReference)intermediateClassBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateClassBinding_ConcreteClass() {
		return (EReference)intermediateClassBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateClassBinding_ConcreteReference() {
		return (EReference)intermediateClassBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateClassBinding_ConceptContext() {
		return (EReference)intermediateClassBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntermediateClassBinding_ConceptReferenceName() {
		return (EAttribute)intermediateClassBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateClassBinding_FeatureBindings() {
		return (EReference)intermediateClassBindingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteReferencDeclaringVar() {
		return concreteReferencDeclaringVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMetaclass() {
		return virtualMetaclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMetaclass_References() {
		return (EReference)virtualMetaclassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMetaclass_Attributes() {
		return (EReference)virtualMetaclassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMetaclass_Init() {
		return (EReference)virtualMetaclassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualFeature() {
		return virtualFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualFeature_Name() {
		return (EAttribute)virtualFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualReference() {
		return virtualReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualReference_Type_() {
		return (EReference)virtualReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualAttribute() {
		return virtualAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualAttribute_Type_() {
		return (EReference)virtualAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualTupleExp() {
		return virtualTupleExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualTupleExp_TypeName() {
		return (EAttribute)virtualTupleExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualClassBinding() {
		return virtualClassBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualClassBinding_Concept() {
		return (EReference)virtualClassBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualClassBinding_Virtual() {
		return (EReference)virtualClassBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualClassBinding_RefFeatures() {
		return (EReference)virtualClassBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptFeatureRef() {
		return conceptFeatureRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptFeatureRef_ConceptClass() {
		return (EReference)conceptFeatureRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptFeatureRef_FeatureName() {
		return (EAttribute)conceptFeatureRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseFeatureBinding() {
		return baseFeatureBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseFeatureBinding_ConceptFeature() {
		return (EAttribute)baseFeatureBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseFeatureBinding_ConceptClass() {
		return (EReference)baseFeatureBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseFeatureBinding_Qualifier() {
		return (EReference)baseFeatureBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenamingFeatureBinding() {
		return renamingFeatureBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenamingFeatureBinding_ConcreteFeature() {
		return (EAttribute)renamingFeatureBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclFeatureBinding() {
		return oclFeatureBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOclFeatureBinding_Concrete() {
		return (EReference)oclFeatureBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseHelper() {
		return baseHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseHelper_Feature() {
		return (EAttribute)baseHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseHelper_Body() {
		return (EReference)baseHelperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseHelper_Type() {
		return (EReference)baseHelperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseHelper_Model_() {
		return (EReference)baseHelperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptHelper() {
		return conceptHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptHelper_Qualifier() {
		return (EReference)conceptHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptHelper_ContextClass() {
		return (EReference)conceptHelperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalHelper() {
		return localHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalHelper_Context() {
		return (EReference)localHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalHelper_Parameters() {
		return (EReference)localHelperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperParameter() {
		return helperParameterEClass;
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
		bindingModelEClass = createEClass(BINDING_MODEL);
		createEAttribute(bindingModelEClass, BINDING_MODEL__TARGET_BINDING);
		createEReference(bindingModelEClass, BINDING_MODEL__BINDINGS);
		createEReference(bindingModelEClass, BINDING_MODEL__HELPERS);
		createEReference(bindingModelEClass, BINDING_MODEL__CONCEPT_METACLASSES);
		createEReference(bindingModelEClass, BINDING_MODEL__CONCRETE_METACLASSES);
		createEReference(bindingModelEClass, BINDING_MODEL__VIRTUAL_METACLASSES);
		createEReference(bindingModelEClass, BINDING_MODEL__BOUND_CONCEPT);
		createEReference(bindingModelEClass, BINDING_MODEL__BOUND_METAMODELS);
		createEAttribute(bindingModelEClass, BINDING_MODEL__NAME);
		createEReference(bindingModelEClass, BINDING_MODEL__OPTIONS);

		bindingOptionsEClass = createEClass(BINDING_OPTIONS);
		createEAttribute(bindingOptionsEClass, BINDING_OPTIONS__ENABLE_CLASS_MERGE);

		metamodelDeclarationEClass = createEClass(METAMODEL_DECLARATION);
		createEAttribute(metamodelDeclarationEClass, METAMODEL_DECLARATION__METAMODEL_URI);
		createEAttribute(metamodelDeclarationEClass, METAMODEL_DECLARATION__RESOURCE);

		metaclassEClass = createEClass(METACLASS);
		createEAttribute(metaclassEClass, METACLASS__NAME);
		createEReference(metaclassEClass, METACLASS__ECLASS);

		conceptMetaclassEClass = createEClass(CONCEPT_METACLASS);

		concreteMetaclassEClass = createEClass(CONCRETE_METACLASS);

		conceptBindingEClass = createEClass(CONCEPT_BINDING);
		createEAttribute(conceptBindingEClass, CONCEPT_BINDING__DEBUG_NAME);
		createEReference(conceptBindingEClass, CONCEPT_BINDING__MODEL_);

		classBindingEClass = createEClass(CLASS_BINDING);
		createEReference(classBindingEClass, CLASS_BINDING__CONCEPT);
		createEReference(classBindingEClass, CLASS_BINDING__CONCRETE);
		createEReference(classBindingEClass, CLASS_BINDING__WHEN_CLAUSE);

		intermediateClassBindingEClass = createEClass(INTERMEDIATE_CLASS_BINDING);
		createEReference(intermediateClassBindingEClass, INTERMEDIATE_CLASS_BINDING__CONCEPT);
		createEReference(intermediateClassBindingEClass, INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS);
		createEReference(intermediateClassBindingEClass, INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE);
		createEReference(intermediateClassBindingEClass, INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT);
		createEAttribute(intermediateClassBindingEClass, INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME);
		createEReference(intermediateClassBindingEClass, INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS);

		concreteReferencDeclaringVarEClass = createEClass(CONCRETE_REFERENC_DECLARING_VAR);

		virtualMetaclassEClass = createEClass(VIRTUAL_METACLASS);
		createEReference(virtualMetaclassEClass, VIRTUAL_METACLASS__REFERENCES);
		createEReference(virtualMetaclassEClass, VIRTUAL_METACLASS__ATTRIBUTES);
		createEReference(virtualMetaclassEClass, VIRTUAL_METACLASS__INIT);

		virtualFeatureEClass = createEClass(VIRTUAL_FEATURE);
		createEAttribute(virtualFeatureEClass, VIRTUAL_FEATURE__NAME);

		virtualReferenceEClass = createEClass(VIRTUAL_REFERENCE);
		createEReference(virtualReferenceEClass, VIRTUAL_REFERENCE__TYPE_);

		virtualAttributeEClass = createEClass(VIRTUAL_ATTRIBUTE);
		createEReference(virtualAttributeEClass, VIRTUAL_ATTRIBUTE__TYPE_);

		virtualTupleExpEClass = createEClass(VIRTUAL_TUPLE_EXP);
		createEAttribute(virtualTupleExpEClass, VIRTUAL_TUPLE_EXP__TYPE_NAME);

		virtualClassBindingEClass = createEClass(VIRTUAL_CLASS_BINDING);
		createEReference(virtualClassBindingEClass, VIRTUAL_CLASS_BINDING__CONCEPT);
		createEReference(virtualClassBindingEClass, VIRTUAL_CLASS_BINDING__VIRTUAL);
		createEReference(virtualClassBindingEClass, VIRTUAL_CLASS_BINDING__REF_FEATURES);

		conceptFeatureRefEClass = createEClass(CONCEPT_FEATURE_REF);
		createEReference(conceptFeatureRefEClass, CONCEPT_FEATURE_REF__CONCEPT_CLASS);
		createEAttribute(conceptFeatureRefEClass, CONCEPT_FEATURE_REF__FEATURE_NAME);

		baseFeatureBindingEClass = createEClass(BASE_FEATURE_BINDING);
		createEAttribute(baseFeatureBindingEClass, BASE_FEATURE_BINDING__CONCEPT_FEATURE);
		createEReference(baseFeatureBindingEClass, BASE_FEATURE_BINDING__CONCEPT_CLASS);
		createEReference(baseFeatureBindingEClass, BASE_FEATURE_BINDING__QUALIFIER);

		renamingFeatureBindingEClass = createEClass(RENAMING_FEATURE_BINDING);
		createEAttribute(renamingFeatureBindingEClass, RENAMING_FEATURE_BINDING__CONCRETE_FEATURE);

		oclFeatureBindingEClass = createEClass(OCL_FEATURE_BINDING);
		createEReference(oclFeatureBindingEClass, OCL_FEATURE_BINDING__CONCRETE);

		baseHelperEClass = createEClass(BASE_HELPER);
		createEAttribute(baseHelperEClass, BASE_HELPER__FEATURE);
		createEReference(baseHelperEClass, BASE_HELPER__BODY);
		createEReference(baseHelperEClass, BASE_HELPER__TYPE);
		createEReference(baseHelperEClass, BASE_HELPER__MODEL_);

		conceptHelperEClass = createEClass(CONCEPT_HELPER);
		createEReference(conceptHelperEClass, CONCEPT_HELPER__QUALIFIER);
		createEReference(conceptHelperEClass, CONCEPT_HELPER__CONTEXT_CLASS);

		localHelperEClass = createEClass(LOCAL_HELPER);
		createEReference(localHelperEClass, LOCAL_HELPER__CONTEXT);
		createEReference(localHelperEClass, LOCAL_HELPER__PARAMETERS);

		helperParameterEClass = createEClass(HELPER_PARAMETER);
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
		SimpleoclPackage theSimpleoclPackage = (SimpleoclPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleoclPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metamodelDeclarationEClass.getESuperTypes().add(theSimpleoclPackage.getOclMetamodel());
		conceptMetaclassEClass.getESuperTypes().add(this.getMetaclass());
		concreteMetaclassEClass.getESuperTypes().add(this.getMetaclass());
		classBindingEClass.getESuperTypes().add(this.getConceptBinding());
		intermediateClassBindingEClass.getESuperTypes().add(this.getConceptBinding());
		concreteReferencDeclaringVarEClass.getESuperTypes().add(theSimpleoclPackage.getVariableDeclaration());
		virtualMetaclassEClass.getESuperTypes().add(this.getMetaclass());
		virtualReferenceEClass.getESuperTypes().add(this.getVirtualFeature());
		virtualAttributeEClass.getESuperTypes().add(this.getVirtualFeature());
		virtualTupleExpEClass.getESuperTypes().add(theSimpleoclPackage.getTupleExp());
		virtualClassBindingEClass.getESuperTypes().add(this.getConceptBinding());
		baseFeatureBindingEClass.getESuperTypes().add(this.getConceptBinding());
		renamingFeatureBindingEClass.getESuperTypes().add(this.getBaseFeatureBinding());
		oclFeatureBindingEClass.getESuperTypes().add(this.getBaseFeatureBinding());
		conceptHelperEClass.getESuperTypes().add(this.getBaseHelper());
		localHelperEClass.getESuperTypes().add(this.getBaseHelper());
		helperParameterEClass.getESuperTypes().add(theSimpleoclPackage.getVariableDeclaration());

		// Initialize classes and features; add operations and parameters
		initEClass(bindingModelEClass, BindingModel.class, "BindingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingModel_TargetBinding(), ecorePackage.getEBoolean(), "targetBinding", "false", 1, 1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingModel_Bindings(), this.getConceptBinding(), this.getConceptBinding_Model_(), "bindings", null, 0, -1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingModel_Helpers(), this.getBaseHelper(), this.getBaseHelper_Model_(), "helpers", null, 0, -1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingModel_ConceptMetaclasses(), this.getConceptMetaclass(), null, "conceptMetaclasses", null, 0, -1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingModel_ConcreteMetaclasses(), this.getConcreteMetaclass(), null, "concreteMetaclasses", null, 0, -1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingModel_VirtualMetaclasses(), this.getVirtualMetaclass(), null, "virtualMetaclasses", null, 0, -1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingModel_BoundConcept(), this.getMetamodelDeclaration(), null, "boundConcept", null, 1, 1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingModel_BoundMetamodels(), this.getMetamodelDeclaration(), null, "boundMetamodels", null, 1, -1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingModel_Options(), this.getBindingOptions(), null, "options", null, 1, 1, BindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingOptionsEClass, BindingOptions.class, "BindingOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingOptions_EnableClassMerge(), ecorePackage.getEBoolean(), "enableClassMerge", "false", 0, 1, BindingOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelDeclarationEClass, MetamodelDeclaration.class, "MetamodelDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelDeclaration_MetamodelURI(), ecorePackage.getEString(), "metamodelURI", null, 0, 1, MetamodelDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelDeclaration_Resource(), ecorePackage.getEResource(), "resource", null, 0, 1, MetamodelDeclaration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaclassEClass, Metaclass.class, "Metaclass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaclass_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metaclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaclass_Eclass(), ecorePackage.getEClass(), null, "eclass", null, 1, 1, Metaclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptMetaclassEClass, ConceptMetaclass.class, "ConceptMetaclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteMetaclassEClass, ConcreteMetaclass.class, "ConcreteMetaclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conceptBindingEClass, ConceptBinding.class, "ConceptBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConceptBinding_DebugName(), ecorePackage.getEString(), "debugName", null, 0, 1, ConceptBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptBinding_Model_(), this.getBindingModel(), this.getBindingModel_Bindings(), "model_", null, 0, 1, ConceptBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classBindingEClass, ClassBinding.class, "ClassBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassBinding_Concept(), this.getConceptMetaclass(), null, "concept", null, 1, 1, ClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassBinding_Concrete(), this.getConcreteMetaclass(), null, "concrete", null, 1, -1, ClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassBinding_WhenClause(), theSimpleoclPackage.getOclExpression(), null, "whenClause", null, 1, 1, ClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateClassBindingEClass, IntermediateClassBinding.class, "IntermediateClassBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermediateClassBinding_Concept(), this.getConceptMetaclass(), null, "concept", null, 1, 1, IntermediateClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateClassBinding_ConcreteClass(), this.getConcreteMetaclass(), null, "concreteClass", null, 1, 1, IntermediateClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateClassBinding_ConcreteReference(), this.getConcreteReferencDeclaringVar(), null, "concreteReference", null, 1, 1, IntermediateClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateClassBinding_ConceptContext(), this.getConceptMetaclass(), null, "conceptContext", null, 1, 1, IntermediateClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermediateClassBinding_ConceptReferenceName(), ecorePackage.getEString(), "conceptReferenceName", null, 1, 1, IntermediateClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateClassBinding_FeatureBindings(), this.getBaseFeatureBinding(), null, "featureBindings", null, 0, -1, IntermediateClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteReferencDeclaringVarEClass, ConcreteReferencDeclaringVar.class, "ConcreteReferencDeclaringVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualMetaclassEClass, VirtualMetaclass.class, "VirtualMetaclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMetaclass_References(), this.getVirtualReference(), null, "references", null, 0, -1, VirtualMetaclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMetaclass_Attributes(), this.getVirtualAttribute(), null, "attributes", null, 0, -1, VirtualMetaclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMetaclass_Init(), theSimpleoclPackage.getOclExpression(), null, "init", null, 1, 1, VirtualMetaclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualFeatureEClass, VirtualFeature.class, "VirtualFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualFeature_Name(), ecorePackage.getEString(), "name", null, 1, 1, VirtualFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualReferenceEClass, VirtualReference.class, "VirtualReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualReference_Type_(), this.getConcreteMetaclass(), null, "type_", null, 1, 1, VirtualReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualAttributeEClass, VirtualAttribute.class, "VirtualAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualAttribute_Type_(), theSimpleoclPackage.getPrimitive(), null, "type_", null, 1, 1, VirtualAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualTupleExpEClass, VirtualTupleExp.class, "VirtualTupleExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualTupleExp_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1, VirtualTupleExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualClassBindingEClass, VirtualClassBinding.class, "VirtualClassBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualClassBinding_Concept(), this.getConceptMetaclass(), null, "concept", null, 1, 1, VirtualClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualClassBinding_Virtual(), this.getVirtualMetaclass(), null, "virtual", null, 1, 1, VirtualClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualClassBinding_RefFeatures(), this.getConceptFeatureRef(), null, "refFeatures", null, 0, -1, VirtualClassBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptFeatureRefEClass, ConceptFeatureRef.class, "ConceptFeatureRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptFeatureRef_ConceptClass(), this.getConceptMetaclass(), null, "conceptClass", null, 1, 1, ConceptFeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConceptFeatureRef_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, ConceptFeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseFeatureBindingEClass, BaseFeatureBinding.class, "BaseFeatureBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseFeatureBinding_ConceptFeature(), ecorePackage.getEString(), "conceptFeature", null, 1, 1, BaseFeatureBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseFeatureBinding_ConceptClass(), this.getConceptMetaclass(), null, "conceptClass", null, 1, 1, BaseFeatureBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseFeatureBinding_Qualifier(), this.getConcreteMetaclass(), null, "qualifier", null, 0, 1, BaseFeatureBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renamingFeatureBindingEClass, RenamingFeatureBinding.class, "RenamingFeatureBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenamingFeatureBinding_ConcreteFeature(), ecorePackage.getEString(), "concreteFeature", null, 1, 1, RenamingFeatureBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclFeatureBindingEClass, OclFeatureBinding.class, "OclFeatureBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclFeatureBinding_Concrete(), theSimpleoclPackage.getOclExpression(), null, "concrete", null, 1, 1, OclFeatureBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseHelperEClass, BaseHelper.class, "BaseHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseHelper_Feature(), ecorePackage.getEString(), "feature", null, 1, 1, BaseHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseHelper_Body(), theSimpleoclPackage.getOclExpression(), null, "body", null, 1, 1, BaseHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseHelper_Type(), theSimpleoclPackage.getOclType(), null, "type", null, 0, 1, BaseHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseHelper_Model_(), this.getBindingModel(), this.getBindingModel_Helpers(), "model_", null, 0, 1, BaseHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptHelperEClass, ConceptHelper.class, "ConceptHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptHelper_Qualifier(), this.getConcreteMetaclass(), null, "qualifier", null, 0, 1, ConceptHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptHelper_ContextClass(), this.getConceptMetaclass(), null, "contextClass", null, 1, 1, ConceptHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localHelperEClass, LocalHelper.class, "LocalHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalHelper_Context(), this.getConcreteMetaclass(), null, "context", null, 0, 1, LocalHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalHelper_Parameters(), this.getHelperParameter(), null, "parameters", null, 0, -1, LocalHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helperParameterEClass, HelperParameter.class, "HelperParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DslPackageImpl

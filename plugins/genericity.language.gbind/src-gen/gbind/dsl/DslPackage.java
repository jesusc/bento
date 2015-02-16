/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import gbind.simpleocl.SimpleoclPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gbind.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://http://genericity/language/gbind/dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bindingModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslPackage eINSTANCE = gbind.dsl.impl.DslPackageImpl.init();

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.BindingModelImpl <em>Binding Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.BindingModelImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getBindingModel()
	 * @generated
	 */
	int BINDING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__BINDINGS = 0;

	/**
	 * The feature id for the '<em><b>Helpers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__HELPERS = 1;

	/**
	 * The feature id for the '<em><b>Concept Metaclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__CONCEPT_METACLASSES = 2;

	/**
	 * The feature id for the '<em><b>Concrete Metaclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__CONCRETE_METACLASSES = 3;

	/**
	 * The feature id for the '<em><b>Virtual Metaclasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__VIRTUAL_METACLASSES = 4;

	/**
	 * The feature id for the '<em><b>Bound Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__BOUND_CONCEPT = 5;

	/**
	 * The feature id for the '<em><b>Bound Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__BOUND_METAMODEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__NAME = 7;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__OPTIONS = 8;

	/**
	 * The number of structural features of the '<em>Binding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.BindingOptionsImpl <em>Binding Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.BindingOptionsImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getBindingOptions()
	 * @generated
	 */
	int BINDING_OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Enable Class Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPTIONS__ENABLE_CLASS_MERGE = 0;

	/**
	 * The number of structural features of the '<em>Binding Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.MetamodelDeclarationImpl <em>Metamodel Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.MetamodelDeclarationImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getMetamodelDeclaration()
	 * @generated
	 */
	int METAMODEL_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__LINE = SimpleoclPackage.OCL_METAMODEL__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__COLUMN = SimpleoclPackage.OCL_METAMODEL__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__CHAR_START = SimpleoclPackage.OCL_METAMODEL__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__CHAR_END = SimpleoclPackage.OCL_METAMODEL__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__NAME = SimpleoclPackage.OCL_METAMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__ELEMENTS = SimpleoclPackage.OCL_METAMODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__MODEL = SimpleoclPackage.OCL_METAMODEL__MODEL;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__URI = SimpleoclPackage.OCL_METAMODEL__URI;

	/**
	 * The feature id for the '<em><b>Metamodel URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION__METAMODEL_URI = SimpleoclPackage.OCL_METAMODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metamodel Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DECLARATION_FEATURE_COUNT = SimpleoclPackage.OCL_METAMODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.MetaclassImpl <em>Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.MetaclassImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getMetaclass()
	 * @generated
	 */
	int METACLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS__ECLASS = 1;

	/**
	 * The number of structural features of the '<em>Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.ConceptMetaclassImpl <em>Concept Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.ConceptMetaclassImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getConceptMetaclass()
	 * @generated
	 */
	int CONCEPT_METACLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METACLASS__NAME = METACLASS__NAME;

	/**
	 * The feature id for the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METACLASS__ECLASS = METACLASS__ECLASS;

	/**
	 * The number of structural features of the '<em>Concept Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METACLASS_FEATURE_COUNT = METACLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.ConcreteMetaclassImpl <em>Concrete Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.ConcreteMetaclassImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getConcreteMetaclass()
	 * @generated
	 */
	int CONCRETE_METACLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_METACLASS__NAME = METACLASS__NAME;

	/**
	 * The feature id for the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_METACLASS__ECLASS = METACLASS__ECLASS;

	/**
	 * The number of structural features of the '<em>Concrete Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_METACLASS_FEATURE_COUNT = METACLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.ConceptBindingImpl <em>Concept Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.ConceptBindingImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getConceptBinding()
	 * @generated
	 */
	int CONCEPT_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_BINDING__DEBUG_NAME = 0;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_BINDING__MODEL_ = 1;

	/**
	 * The number of structural features of the '<em>Concept Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.ClassBindingImpl <em>Class Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.ClassBindingImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getClassBinding()
	 * @generated
	 */
	int CLASS_BINDING = 7;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__DEBUG_NAME = CONCEPT_BINDING__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__MODEL_ = CONCEPT_BINDING__MODEL_;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__CONCEPT = CONCEPT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__CONCRETE = CONCEPT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING__WHEN_CLAUSE = CONCEPT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_BINDING_FEATURE_COUNT = CONCEPT_BINDING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.IntermediateClassBindingImpl <em>Intermediate Class Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.IntermediateClassBindingImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getIntermediateClassBinding()
	 * @generated
	 */
	int INTERMEDIATE_CLASS_BINDING = 8;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__DEBUG_NAME = CONCEPT_BINDING__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__MODEL_ = CONCEPT_BINDING__MODEL_;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCEPT = CONCEPT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concrete Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS = CONCEPT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concrete Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE = CONCEPT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concept Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT = CONCEPT_BINDING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concept Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME = CONCEPT_BINDING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS = CONCEPT_BINDING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Intermediate Class Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING_FEATURE_COUNT = CONCEPT_BINDING_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.ConcreteReferencDeclaringVarImpl <em>Concrete Referenc Declaring Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.ConcreteReferencDeclaringVarImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getConcreteReferencDeclaringVar()
	 * @generated
	 */
	int CONCRETE_REFERENC_DECLARING_VAR = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENC_DECLARING_VAR__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENC_DECLARING_VAR__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENC_DECLARING_VAR__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENC_DECLARING_VAR__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENC_DECLARING_VAR__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENC_DECLARING_VAR__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENC_DECLARING_VAR__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The number of structural features of the '<em>Concrete Referenc Declaring Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_REFERENC_DECLARING_VAR_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.VirtualMetaclassImpl <em>Virtual Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.VirtualMetaclassImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getVirtualMetaclass()
	 * @generated
	 */
	int VIRTUAL_METACLASS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_METACLASS__NAME = METACLASS__NAME;

	/**
	 * The feature id for the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_METACLASS__ECLASS = METACLASS__ECLASS;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_METACLASS__REFERENCES = METACLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_METACLASS__ATTRIBUTES = METACLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_METACLASS__INIT = METACLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Virtual Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_METACLASS_FEATURE_COUNT = METACLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.VirtualFeatureImpl <em>Virtual Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.VirtualFeatureImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getVirtualFeature()
	 * @generated
	 */
	int VIRTUAL_FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Virtual Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.VirtualReferenceImpl <em>Virtual Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.VirtualReferenceImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getVirtualReference()
	 * @generated
	 */
	int VIRTUAL_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_REFERENCE__NAME = VIRTUAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_REFERENCE__TYPE_ = VIRTUAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_REFERENCE_FEATURE_COUNT = VIRTUAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.VirtualAttributeImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getVirtualAttribute()
	 * @generated
	 */
	int VIRTUAL_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__NAME = VIRTUAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__TYPE_ = VIRTUAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE_FEATURE_COUNT = VIRTUAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.VirtualTupleExpImpl <em>Virtual Tuple Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.VirtualTupleExpImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getVirtualTupleExp()
	 * @generated
	 */
	int VIRTUAL_TUPLE_EXP = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__LINE = SimpleoclPackage.TUPLE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__COLUMN = SimpleoclPackage.TUPLE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__CHAR_START = SimpleoclPackage.TUPLE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__CHAR_END = SimpleoclPackage.TUPLE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__TYPE = SimpleoclPackage.TUPLE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__IF_EXP3 = SimpleoclPackage.TUPLE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__APPLIED_PROPERTY = SimpleoclPackage.TUPLE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__COLLECTION = SimpleoclPackage.TUPLE_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__LET_EXP = SimpleoclPackage.TUPLE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__LOOP_EXP = SimpleoclPackage.TUPLE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__PARENT_OPERATION = SimpleoclPackage.TUPLE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__INITIALIZED_VARIABLE = SimpleoclPackage.TUPLE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__IF_EXP2 = SimpleoclPackage.TUPLE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__OWNING_OPERATION = SimpleoclPackage.TUPLE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__IF_EXP1 = SimpleoclPackage.TUPLE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__OWNING_ATTRIBUTE = SimpleoclPackage.TUPLE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applied Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__APPLIED_OPERATOR = SimpleoclPackage.TUPLE_EXP__APPLIED_OPERATOR;

	/**
	 * The feature id for the '<em><b>Tuple Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__TUPLE_PART = SimpleoclPackage.TUPLE_EXP__TUPLE_PART;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP__TYPE_NAME = SimpleoclPackage.TUPLE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Tuple Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_TUPLE_EXP_FEATURE_COUNT = SimpleoclPackage.TUPLE_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.VirtualClassBindingImpl <em>Virtual Class Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.VirtualClassBindingImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getVirtualClassBinding()
	 * @generated
	 */
	int VIRTUAL_CLASS_BINDING = 15;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CLASS_BINDING__DEBUG_NAME = CONCEPT_BINDING__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CLASS_BINDING__MODEL_ = CONCEPT_BINDING__MODEL_;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CLASS_BINDING__CONCEPT = CONCEPT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CLASS_BINDING__VIRTUAL = CONCEPT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CLASS_BINDING__REF_FEATURES = CONCEPT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Virtual Class Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_CLASS_BINDING_FEATURE_COUNT = CONCEPT_BINDING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.ConceptFeatureRefImpl <em>Concept Feature Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.ConceptFeatureRefImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getConceptFeatureRef()
	 * @generated
	 */
	int CONCEPT_FEATURE_REF = 16;

	/**
	 * The feature id for the '<em><b>Concept Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_REF__CONCEPT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_REF__FEATURE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Concept Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_REF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.BaseFeatureBindingImpl <em>Base Feature Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.BaseFeatureBindingImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getBaseFeatureBinding()
	 * @generated
	 */
	int BASE_FEATURE_BINDING = 17;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_BINDING__DEBUG_NAME = CONCEPT_BINDING__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_BINDING__MODEL_ = CONCEPT_BINDING__MODEL_;

	/**
	 * The feature id for the '<em><b>Concept Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_BINDING__CONCEPT_FEATURE = CONCEPT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concept Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_BINDING__CONCEPT_CLASS = CONCEPT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_BINDING__QUALIFIER = CONCEPT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Base Feature Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_BINDING_FEATURE_COUNT = CONCEPT_BINDING_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.RenamingFeatureBindingImpl <em>Renaming Feature Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.RenamingFeatureBindingImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getRenamingFeatureBinding()
	 * @generated
	 */
	int RENAMING_FEATURE_BINDING = 18;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_BINDING__DEBUG_NAME = BASE_FEATURE_BINDING__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_BINDING__MODEL_ = BASE_FEATURE_BINDING__MODEL_;

	/**
	 * The feature id for the '<em><b>Concept Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_BINDING__CONCEPT_FEATURE = BASE_FEATURE_BINDING__CONCEPT_FEATURE;

	/**
	 * The feature id for the '<em><b>Concept Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_BINDING__CONCEPT_CLASS = BASE_FEATURE_BINDING__CONCEPT_CLASS;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_BINDING__QUALIFIER = BASE_FEATURE_BINDING__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Concrete Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_BINDING__CONCRETE_FEATURE = BASE_FEATURE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Renaming Feature Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_BINDING_FEATURE_COUNT = BASE_FEATURE_BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.OclFeatureBindingImpl <em>Ocl Feature Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.OclFeatureBindingImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getOclFeatureBinding()
	 * @generated
	 */
	int OCL_FEATURE_BINDING = 19;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_BINDING__DEBUG_NAME = BASE_FEATURE_BINDING__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_BINDING__MODEL_ = BASE_FEATURE_BINDING__MODEL_;

	/**
	 * The feature id for the '<em><b>Concept Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_BINDING__CONCEPT_FEATURE = BASE_FEATURE_BINDING__CONCEPT_FEATURE;

	/**
	 * The feature id for the '<em><b>Concept Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_BINDING__CONCEPT_CLASS = BASE_FEATURE_BINDING__CONCEPT_CLASS;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_BINDING__QUALIFIER = BASE_FEATURE_BINDING__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Concrete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_BINDING__CONCRETE = BASE_FEATURE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Feature Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_BINDING_FEATURE_COUNT = BASE_FEATURE_BINDING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.BaseHelperImpl <em>Base Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.BaseHelperImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getBaseHelper()
	 * @generated
	 */
	int BASE_HELPER = 20;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_HELPER__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_HELPER__BODY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_HELPER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_HELPER__MODEL_ = 3;

	/**
	 * The number of structural features of the '<em>Base Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_HELPER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.ConceptHelperImpl <em>Concept Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.ConceptHelperImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getConceptHelper()
	 * @generated
	 */
	int CONCEPT_HELPER = 21;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HELPER__FEATURE = BASE_HELPER__FEATURE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HELPER__BODY = BASE_HELPER__BODY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HELPER__TYPE = BASE_HELPER__TYPE;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HELPER__MODEL_ = BASE_HELPER__MODEL_;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HELPER__QUALIFIER = BASE_HELPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HELPER__CONTEXT_CLASS = BASE_HELPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HELPER_FEATURE_COUNT = BASE_HELPER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.LocalHelperImpl <em>Local Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.LocalHelperImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getLocalHelper()
	 * @generated
	 */
	int LOCAL_HELPER = 22;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HELPER__FEATURE = BASE_HELPER__FEATURE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HELPER__BODY = BASE_HELPER__BODY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HELPER__TYPE = BASE_HELPER__TYPE;

	/**
	 * The feature id for the '<em><b>Model </b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HELPER__MODEL_ = BASE_HELPER__MODEL_;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HELPER__CONTEXT = BASE_HELPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HELPER__PARAMETERS = BASE_HELPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HELPER_FEATURE_COUNT = BASE_HELPER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.HelperParameterImpl <em>Helper Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.HelperParameterImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getHelperParameter()
	 * @generated
	 */
	int HELPER_PARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_PARAMETER__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_PARAMETER__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_PARAMETER__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_PARAMETER__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_PARAMETER__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_PARAMETER__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_PARAMETER__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The number of structural features of the '<em>Helper Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_PARAMETER_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gbind.dsl.BindingModel <em>Binding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Model</em>'.
	 * @see gbind.dsl.BindingModel
	 * @generated
	 */
	EClass getBindingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.BindingModel#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see gbind.dsl.BindingModel#getBindings()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.BindingModel#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helpers</em>'.
	 * @see gbind.dsl.BindingModel#getHelpers()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_Helpers();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.BindingModel#getConceptMetaclasses <em>Concept Metaclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept Metaclasses</em>'.
	 * @see gbind.dsl.BindingModel#getConceptMetaclasses()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_ConceptMetaclasses();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.BindingModel#getConcreteMetaclasses <em>Concrete Metaclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concrete Metaclasses</em>'.
	 * @see gbind.dsl.BindingModel#getConcreteMetaclasses()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_ConcreteMetaclasses();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.BindingModel#getVirtualMetaclasses <em>Virtual Metaclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Metaclasses</em>'.
	 * @see gbind.dsl.BindingModel#getVirtualMetaclasses()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_VirtualMetaclasses();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.BindingModel#getBoundConcept <em>Bound Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound Concept</em>'.
	 * @see gbind.dsl.BindingModel#getBoundConcept()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_BoundConcept();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.BindingModel#getBoundMetamodel <em>Bound Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound Metamodel</em>'.
	 * @see gbind.dsl.BindingModel#getBoundMetamodel()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_BoundMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.BindingModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gbind.dsl.BindingModel#getName()
	 * @see #getBindingModel()
	 * @generated
	 */
	EAttribute getBindingModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.BindingModel#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see gbind.dsl.BindingModel#getOptions()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_Options();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.BindingOptions <em>Binding Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Options</em>'.
	 * @see gbind.dsl.BindingOptions
	 * @generated
	 */
	EClass getBindingOptions();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.BindingOptions#isEnableClassMerge <em>Enable Class Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Class Merge</em>'.
	 * @see gbind.dsl.BindingOptions#isEnableClassMerge()
	 * @see #getBindingOptions()
	 * @generated
	 */
	EAttribute getBindingOptions_EnableClassMerge();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.MetamodelDeclaration <em>Metamodel Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Declaration</em>'.
	 * @see gbind.dsl.MetamodelDeclaration
	 * @generated
	 */
	EClass getMetamodelDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.MetamodelDeclaration#getMetamodelURI <em>Metamodel URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel URI</em>'.
	 * @see gbind.dsl.MetamodelDeclaration#getMetamodelURI()
	 * @see #getMetamodelDeclaration()
	 * @generated
	 */
	EAttribute getMetamodelDeclaration_MetamodelURI();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.Metaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metaclass</em>'.
	 * @see gbind.dsl.Metaclass
	 * @generated
	 */
	EClass getMetaclass();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.Metaclass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gbind.dsl.Metaclass#getName()
	 * @see #getMetaclass()
	 * @generated
	 */
	EAttribute getMetaclass_Name();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.Metaclass#getEclass <em>Eclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eclass</em>'.
	 * @see gbind.dsl.Metaclass#getEclass()
	 * @see #getMetaclass()
	 * @generated
	 */
	EReference getMetaclass_Eclass();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.ConceptMetaclass <em>Concept Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Metaclass</em>'.
	 * @see gbind.dsl.ConceptMetaclass
	 * @generated
	 */
	EClass getConceptMetaclass();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.ConcreteMetaclass <em>Concrete Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Metaclass</em>'.
	 * @see gbind.dsl.ConcreteMetaclass
	 * @generated
	 */
	EClass getConcreteMetaclass();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.ConceptBinding <em>Concept Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Binding</em>'.
	 * @see gbind.dsl.ConceptBinding
	 * @generated
	 */
	EClass getConceptBinding();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.ConceptBinding#getDebugName <em>Debug Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug Name</em>'.
	 * @see gbind.dsl.ConceptBinding#getDebugName()
	 * @see #getConceptBinding()
	 * @generated
	 */
	EAttribute getConceptBinding_DebugName();

	/**
	 * Returns the meta object for the container reference '{@link gbind.dsl.ConceptBinding#getModel_ <em>Model </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model </em>'.
	 * @see gbind.dsl.ConceptBinding#getModel_()
	 * @see #getConceptBinding()
	 * @generated
	 */
	EReference getConceptBinding_Model_();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.ClassBinding <em>Class Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Binding</em>'.
	 * @see gbind.dsl.ClassBinding
	 * @generated
	 */
	EClass getClassBinding();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.ClassBinding#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see gbind.dsl.ClassBinding#getConcept()
	 * @see #getClassBinding()
	 * @generated
	 */
	EReference getClassBinding_Concept();

	/**
	 * Returns the meta object for the reference list '{@link gbind.dsl.ClassBinding#getConcrete <em>Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete</em>'.
	 * @see gbind.dsl.ClassBinding#getConcrete()
	 * @see #getClassBinding()
	 * @generated
	 */
	EReference getClassBinding_Concrete();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.ClassBinding#getWhenClause <em>When Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Clause</em>'.
	 * @see gbind.dsl.ClassBinding#getWhenClause()
	 * @see #getClassBinding()
	 * @generated
	 */
	EReference getClassBinding_WhenClause();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.IntermediateClassBinding <em>Intermediate Class Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Class Binding</em>'.
	 * @see gbind.dsl.IntermediateClassBinding
	 * @generated
	 */
	EClass getIntermediateClassBinding();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.IntermediateClassBinding#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConcept()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EReference getIntermediateClassBinding_Concept();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.IntermediateClassBinding#getConcreteClass <em>Concrete Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Class</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConcreteClass()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EReference getIntermediateClassBinding_ConcreteClass();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.IntermediateClassBinding#getConcreteReference <em>Concrete Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concrete Reference</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConcreteReference()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EReference getIntermediateClassBinding_ConcreteReference();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.IntermediateClassBinding#getConceptContext <em>Concept Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Context</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConceptContext()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EReference getIntermediateClassBinding_ConceptContext();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.IntermediateClassBinding#getConceptReferenceName <em>Concept Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept Reference Name</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConceptReferenceName()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EAttribute getIntermediateClassBinding_ConceptReferenceName();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.IntermediateClassBinding#getFeatureBindings <em>Feature Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Bindings</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getFeatureBindings()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EReference getIntermediateClassBinding_FeatureBindings();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.ConcreteReferencDeclaringVar <em>Concrete Referenc Declaring Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Referenc Declaring Var</em>'.
	 * @see gbind.dsl.ConcreteReferencDeclaringVar
	 * @generated
	 */
	EClass getConcreteReferencDeclaringVar();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.VirtualMetaclass <em>Virtual Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Metaclass</em>'.
	 * @see gbind.dsl.VirtualMetaclass
	 * @generated
	 */
	EClass getVirtualMetaclass();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.VirtualMetaclass#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see gbind.dsl.VirtualMetaclass#getReferences()
	 * @see #getVirtualMetaclass()
	 * @generated
	 */
	EReference getVirtualMetaclass_References();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.VirtualMetaclass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see gbind.dsl.VirtualMetaclass#getAttributes()
	 * @see #getVirtualMetaclass()
	 * @generated
	 */
	EReference getVirtualMetaclass_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.VirtualMetaclass#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see gbind.dsl.VirtualMetaclass#getInit()
	 * @see #getVirtualMetaclass()
	 * @generated
	 */
	EReference getVirtualMetaclass_Init();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.VirtualFeature <em>Virtual Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Feature</em>'.
	 * @see gbind.dsl.VirtualFeature
	 * @generated
	 */
	EClass getVirtualFeature();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.VirtualFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gbind.dsl.VirtualFeature#getName()
	 * @see #getVirtualFeature()
	 * @generated
	 */
	EAttribute getVirtualFeature_Name();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.VirtualReference <em>Virtual Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Reference</em>'.
	 * @see gbind.dsl.VirtualReference
	 * @generated
	 */
	EClass getVirtualReference();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.VirtualReference#getType_ <em>Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type </em>'.
	 * @see gbind.dsl.VirtualReference#getType_()
	 * @see #getVirtualReference()
	 * @generated
	 */
	EReference getVirtualReference_Type_();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.VirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Attribute</em>'.
	 * @see gbind.dsl.VirtualAttribute
	 * @generated
	 */
	EClass getVirtualAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.VirtualAttribute#getType_ <em>Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type </em>'.
	 * @see gbind.dsl.VirtualAttribute#getType_()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EReference getVirtualAttribute_Type_();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.VirtualTupleExp <em>Virtual Tuple Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Tuple Exp</em>'.
	 * @see gbind.dsl.VirtualTupleExp
	 * @generated
	 */
	EClass getVirtualTupleExp();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.VirtualTupleExp#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see gbind.dsl.VirtualTupleExp#getTypeName()
	 * @see #getVirtualTupleExp()
	 * @generated
	 */
	EAttribute getVirtualTupleExp_TypeName();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.VirtualClassBinding <em>Virtual Class Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Class Binding</em>'.
	 * @see gbind.dsl.VirtualClassBinding
	 * @generated
	 */
	EClass getVirtualClassBinding();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.VirtualClassBinding#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see gbind.dsl.VirtualClassBinding#getConcept()
	 * @see #getVirtualClassBinding()
	 * @generated
	 */
	EReference getVirtualClassBinding_Concept();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.VirtualClassBinding#getVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual</em>'.
	 * @see gbind.dsl.VirtualClassBinding#getVirtual()
	 * @see #getVirtualClassBinding()
	 * @generated
	 */
	EReference getVirtualClassBinding_Virtual();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.VirtualClassBinding#getRefFeatures <em>Ref Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Features</em>'.
	 * @see gbind.dsl.VirtualClassBinding#getRefFeatures()
	 * @see #getVirtualClassBinding()
	 * @generated
	 */
	EReference getVirtualClassBinding_RefFeatures();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.ConceptFeatureRef <em>Concept Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Feature Ref</em>'.
	 * @see gbind.dsl.ConceptFeatureRef
	 * @generated
	 */
	EClass getConceptFeatureRef();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.ConceptFeatureRef#getConceptClass <em>Concept Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Class</em>'.
	 * @see gbind.dsl.ConceptFeatureRef#getConceptClass()
	 * @see #getConceptFeatureRef()
	 * @generated
	 */
	EReference getConceptFeatureRef_ConceptClass();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.ConceptFeatureRef#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see gbind.dsl.ConceptFeatureRef#getFeatureName()
	 * @see #getConceptFeatureRef()
	 * @generated
	 */
	EAttribute getConceptFeatureRef_FeatureName();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.BaseFeatureBinding <em>Base Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Feature Binding</em>'.
	 * @see gbind.dsl.BaseFeatureBinding
	 * @generated
	 */
	EClass getBaseFeatureBinding();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.BaseFeatureBinding#getConceptFeature <em>Concept Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept Feature</em>'.
	 * @see gbind.dsl.BaseFeatureBinding#getConceptFeature()
	 * @see #getBaseFeatureBinding()
	 * @generated
	 */
	EAttribute getBaseFeatureBinding_ConceptFeature();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.BaseFeatureBinding#getConceptClass <em>Concept Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Class</em>'.
	 * @see gbind.dsl.BaseFeatureBinding#getConceptClass()
	 * @see #getBaseFeatureBinding()
	 * @generated
	 */
	EReference getBaseFeatureBinding_ConceptClass();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.BaseFeatureBinding#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see gbind.dsl.BaseFeatureBinding#getQualifier()
	 * @see #getBaseFeatureBinding()
	 * @generated
	 */
	EReference getBaseFeatureBinding_Qualifier();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.RenamingFeatureBinding <em>Renaming Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renaming Feature Binding</em>'.
	 * @see gbind.dsl.RenamingFeatureBinding
	 * @generated
	 */
	EClass getRenamingFeatureBinding();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.RenamingFeatureBinding#getConcreteFeature <em>Concrete Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concrete Feature</em>'.
	 * @see gbind.dsl.RenamingFeatureBinding#getConcreteFeature()
	 * @see #getRenamingFeatureBinding()
	 * @generated
	 */
	EAttribute getRenamingFeatureBinding_ConcreteFeature();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.OclFeatureBinding <em>Ocl Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Feature Binding</em>'.
	 * @see gbind.dsl.OclFeatureBinding
	 * @generated
	 */
	EClass getOclFeatureBinding();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.OclFeatureBinding#getConcrete <em>Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concrete</em>'.
	 * @see gbind.dsl.OclFeatureBinding#getConcrete()
	 * @see #getOclFeatureBinding()
	 * @generated
	 */
	EReference getOclFeatureBinding_Concrete();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.BaseHelper <em>Base Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Helper</em>'.
	 * @see gbind.dsl.BaseHelper
	 * @generated
	 */
	EClass getBaseHelper();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.BaseHelper#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see gbind.dsl.BaseHelper#getFeature()
	 * @see #getBaseHelper()
	 * @generated
	 */
	EAttribute getBaseHelper_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.BaseHelper#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see gbind.dsl.BaseHelper#getBody()
	 * @see #getBaseHelper()
	 * @generated
	 */
	EReference getBaseHelper_Body();

	/**
	 * Returns the meta object for the containment reference '{@link gbind.dsl.BaseHelper#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see gbind.dsl.BaseHelper#getType()
	 * @see #getBaseHelper()
	 * @generated
	 */
	EReference getBaseHelper_Type();

	/**
	 * Returns the meta object for the container reference '{@link gbind.dsl.BaseHelper#getModel_ <em>Model </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model </em>'.
	 * @see gbind.dsl.BaseHelper#getModel_()
	 * @see #getBaseHelper()
	 * @generated
	 */
	EReference getBaseHelper_Model_();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.ConceptHelper <em>Concept Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Helper</em>'.
	 * @see gbind.dsl.ConceptHelper
	 * @generated
	 */
	EClass getConceptHelper();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.ConceptHelper#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see gbind.dsl.ConceptHelper#getQualifier()
	 * @see #getConceptHelper()
	 * @generated
	 */
	EReference getConceptHelper_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.ConceptHelper#getContextClass <em>Context Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Class</em>'.
	 * @see gbind.dsl.ConceptHelper#getContextClass()
	 * @see #getConceptHelper()
	 * @generated
	 */
	EReference getConceptHelper_ContextClass();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.LocalHelper <em>Local Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Helper</em>'.
	 * @see gbind.dsl.LocalHelper
	 * @generated
	 */
	EClass getLocalHelper();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.LocalHelper#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see gbind.dsl.LocalHelper#getContext()
	 * @see #getLocalHelper()
	 * @generated
	 */
	EReference getLocalHelper_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link gbind.dsl.LocalHelper#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see gbind.dsl.LocalHelper#getParameters()
	 * @see #getLocalHelper()
	 * @generated
	 */
	EReference getLocalHelper_Parameters();

	/**
	 * Returns the meta object for class '{@link gbind.dsl.HelperParameter <em>Helper Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Parameter</em>'.
	 * @see gbind.dsl.HelperParameter
	 * @generated
	 */
	EClass getHelperParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslFactory getDslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.BindingModelImpl <em>Binding Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.BindingModelImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getBindingModel()
		 * @generated
		 */
		EClass BINDING_MODEL = eINSTANCE.getBindingModel();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__BINDINGS = eINSTANCE.getBindingModel_Bindings();

		/**
		 * The meta object literal for the '<em><b>Helpers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__HELPERS = eINSTANCE.getBindingModel_Helpers();

		/**
		 * The meta object literal for the '<em><b>Concept Metaclasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__CONCEPT_METACLASSES = eINSTANCE.getBindingModel_ConceptMetaclasses();

		/**
		 * The meta object literal for the '<em><b>Concrete Metaclasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__CONCRETE_METACLASSES = eINSTANCE.getBindingModel_ConcreteMetaclasses();

		/**
		 * The meta object literal for the '<em><b>Virtual Metaclasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__VIRTUAL_METACLASSES = eINSTANCE.getBindingModel_VirtualMetaclasses();

		/**
		 * The meta object literal for the '<em><b>Bound Concept</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__BOUND_CONCEPT = eINSTANCE.getBindingModel_BoundConcept();

		/**
		 * The meta object literal for the '<em><b>Bound Metamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__BOUND_METAMODEL = eINSTANCE.getBindingModel_BoundMetamodel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_MODEL__NAME = eINSTANCE.getBindingModel_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_MODEL__OPTIONS = eINSTANCE.getBindingModel_Options();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.BindingOptionsImpl <em>Binding Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.BindingOptionsImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getBindingOptions()
		 * @generated
		 */
		EClass BINDING_OPTIONS = eINSTANCE.getBindingOptions();

		/**
		 * The meta object literal for the '<em><b>Enable Class Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_OPTIONS__ENABLE_CLASS_MERGE = eINSTANCE.getBindingOptions_EnableClassMerge();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.MetamodelDeclarationImpl <em>Metamodel Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.MetamodelDeclarationImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getMetamodelDeclaration()
		 * @generated
		 */
		EClass METAMODEL_DECLARATION = eINSTANCE.getMetamodelDeclaration();

		/**
		 * The meta object literal for the '<em><b>Metamodel URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_DECLARATION__METAMODEL_URI = eINSTANCE.getMetamodelDeclaration_MetamodelURI();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.MetaclassImpl <em>Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.MetaclassImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getMetaclass()
		 * @generated
		 */
		EClass METACLASS = eINSTANCE.getMetaclass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METACLASS__NAME = eINSTANCE.getMetaclass_Name();

		/**
		 * The meta object literal for the '<em><b>Eclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METACLASS__ECLASS = eINSTANCE.getMetaclass_Eclass();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.ConceptMetaclassImpl <em>Concept Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.ConceptMetaclassImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getConceptMetaclass()
		 * @generated
		 */
		EClass CONCEPT_METACLASS = eINSTANCE.getConceptMetaclass();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.ConcreteMetaclassImpl <em>Concrete Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.ConcreteMetaclassImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getConcreteMetaclass()
		 * @generated
		 */
		EClass CONCRETE_METACLASS = eINSTANCE.getConcreteMetaclass();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.ConceptBindingImpl <em>Concept Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.ConceptBindingImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getConceptBinding()
		 * @generated
		 */
		EClass CONCEPT_BINDING = eINSTANCE.getConceptBinding();

		/**
		 * The meta object literal for the '<em><b>Debug Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_BINDING__DEBUG_NAME = eINSTANCE.getConceptBinding_DebugName();

		/**
		 * The meta object literal for the '<em><b>Model </b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_BINDING__MODEL_ = eINSTANCE.getConceptBinding_Model_();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.ClassBindingImpl <em>Class Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.ClassBindingImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getClassBinding()
		 * @generated
		 */
		EClass CLASS_BINDING = eINSTANCE.getClassBinding();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_BINDING__CONCEPT = eINSTANCE.getClassBinding_Concept();

		/**
		 * The meta object literal for the '<em><b>Concrete</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_BINDING__CONCRETE = eINSTANCE.getClassBinding_Concrete();

		/**
		 * The meta object literal for the '<em><b>When Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_BINDING__WHEN_CLAUSE = eINSTANCE.getClassBinding_WhenClause();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.IntermediateClassBindingImpl <em>Intermediate Class Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.IntermediateClassBindingImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getIntermediateClassBinding()
		 * @generated
		 */
		EClass INTERMEDIATE_CLASS_BINDING = eINSTANCE.getIntermediateClassBinding();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CLASS_BINDING__CONCEPT = eINSTANCE.getIntermediateClassBinding_Concept();

		/**
		 * The meta object literal for the '<em><b>Concrete Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS = eINSTANCE.getIntermediateClassBinding_ConcreteClass();

		/**
		 * The meta object literal for the '<em><b>Concrete Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE = eINSTANCE.getIntermediateClassBinding_ConcreteReference();

		/**
		 * The meta object literal for the '<em><b>Concept Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT = eINSTANCE.getIntermediateClassBinding_ConceptContext();

		/**
		 * The meta object literal for the '<em><b>Concept Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME = eINSTANCE.getIntermediateClassBinding_ConceptReferenceName();

		/**
		 * The meta object literal for the '<em><b>Feature Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS = eINSTANCE.getIntermediateClassBinding_FeatureBindings();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.ConcreteReferencDeclaringVarImpl <em>Concrete Referenc Declaring Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.ConcreteReferencDeclaringVarImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getConcreteReferencDeclaringVar()
		 * @generated
		 */
		EClass CONCRETE_REFERENC_DECLARING_VAR = eINSTANCE.getConcreteReferencDeclaringVar();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.VirtualMetaclassImpl <em>Virtual Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.VirtualMetaclassImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getVirtualMetaclass()
		 * @generated
		 */
		EClass VIRTUAL_METACLASS = eINSTANCE.getVirtualMetaclass();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_METACLASS__REFERENCES = eINSTANCE.getVirtualMetaclass_References();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_METACLASS__ATTRIBUTES = eINSTANCE.getVirtualMetaclass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_METACLASS__INIT = eINSTANCE.getVirtualMetaclass_Init();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.VirtualFeatureImpl <em>Virtual Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.VirtualFeatureImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getVirtualFeature()
		 * @generated
		 */
		EClass VIRTUAL_FEATURE = eINSTANCE.getVirtualFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_FEATURE__NAME = eINSTANCE.getVirtualFeature_Name();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.VirtualReferenceImpl <em>Virtual Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.VirtualReferenceImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getVirtualReference()
		 * @generated
		 */
		EClass VIRTUAL_REFERENCE = eINSTANCE.getVirtualReference();

		/**
		 * The meta object literal for the '<em><b>Type </b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_REFERENCE__TYPE_ = eINSTANCE.getVirtualReference_Type_();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.VirtualAttributeImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getVirtualAttribute()
		 * @generated
		 */
		EClass VIRTUAL_ATTRIBUTE = eINSTANCE.getVirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Type </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ATTRIBUTE__TYPE_ = eINSTANCE.getVirtualAttribute_Type_();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.VirtualTupleExpImpl <em>Virtual Tuple Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.VirtualTupleExpImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getVirtualTupleExp()
		 * @generated
		 */
		EClass VIRTUAL_TUPLE_EXP = eINSTANCE.getVirtualTupleExp();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_TUPLE_EXP__TYPE_NAME = eINSTANCE.getVirtualTupleExp_TypeName();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.VirtualClassBindingImpl <em>Virtual Class Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.VirtualClassBindingImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getVirtualClassBinding()
		 * @generated
		 */
		EClass VIRTUAL_CLASS_BINDING = eINSTANCE.getVirtualClassBinding();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_CLASS_BINDING__CONCEPT = eINSTANCE.getVirtualClassBinding_Concept();

		/**
		 * The meta object literal for the '<em><b>Virtual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_CLASS_BINDING__VIRTUAL = eINSTANCE.getVirtualClassBinding_Virtual();

		/**
		 * The meta object literal for the '<em><b>Ref Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_CLASS_BINDING__REF_FEATURES = eINSTANCE.getVirtualClassBinding_RefFeatures();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.ConceptFeatureRefImpl <em>Concept Feature Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.ConceptFeatureRefImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getConceptFeatureRef()
		 * @generated
		 */
		EClass CONCEPT_FEATURE_REF = eINSTANCE.getConceptFeatureRef();

		/**
		 * The meta object literal for the '<em><b>Concept Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_FEATURE_REF__CONCEPT_CLASS = eINSTANCE.getConceptFeatureRef_ConceptClass();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_FEATURE_REF__FEATURE_NAME = eINSTANCE.getConceptFeatureRef_FeatureName();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.BaseFeatureBindingImpl <em>Base Feature Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.BaseFeatureBindingImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getBaseFeatureBinding()
		 * @generated
		 */
		EClass BASE_FEATURE_BINDING = eINSTANCE.getBaseFeatureBinding();

		/**
		 * The meta object literal for the '<em><b>Concept Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_FEATURE_BINDING__CONCEPT_FEATURE = eINSTANCE.getBaseFeatureBinding_ConceptFeature();

		/**
		 * The meta object literal for the '<em><b>Concept Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_FEATURE_BINDING__CONCEPT_CLASS = eINSTANCE.getBaseFeatureBinding_ConceptClass();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_FEATURE_BINDING__QUALIFIER = eINSTANCE.getBaseFeatureBinding_Qualifier();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.RenamingFeatureBindingImpl <em>Renaming Feature Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.RenamingFeatureBindingImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getRenamingFeatureBinding()
		 * @generated
		 */
		EClass RENAMING_FEATURE_BINDING = eINSTANCE.getRenamingFeatureBinding();

		/**
		 * The meta object literal for the '<em><b>Concrete Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAMING_FEATURE_BINDING__CONCRETE_FEATURE = eINSTANCE.getRenamingFeatureBinding_ConcreteFeature();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.OclFeatureBindingImpl <em>Ocl Feature Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.OclFeatureBindingImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getOclFeatureBinding()
		 * @generated
		 */
		EClass OCL_FEATURE_BINDING = eINSTANCE.getOclFeatureBinding();

		/**
		 * The meta object literal for the '<em><b>Concrete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_FEATURE_BINDING__CONCRETE = eINSTANCE.getOclFeatureBinding_Concrete();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.BaseHelperImpl <em>Base Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.BaseHelperImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getBaseHelper()
		 * @generated
		 */
		EClass BASE_HELPER = eINSTANCE.getBaseHelper();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_HELPER__FEATURE = eINSTANCE.getBaseHelper_Feature();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_HELPER__BODY = eINSTANCE.getBaseHelper_Body();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_HELPER__TYPE = eINSTANCE.getBaseHelper_Type();

		/**
		 * The meta object literal for the '<em><b>Model </b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_HELPER__MODEL_ = eINSTANCE.getBaseHelper_Model_();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.ConceptHelperImpl <em>Concept Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.ConceptHelperImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getConceptHelper()
		 * @generated
		 */
		EClass CONCEPT_HELPER = eINSTANCE.getConceptHelper();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_HELPER__QUALIFIER = eINSTANCE.getConceptHelper_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Context Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_HELPER__CONTEXT_CLASS = eINSTANCE.getConceptHelper_ContextClass();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.LocalHelperImpl <em>Local Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.LocalHelperImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getLocalHelper()
		 * @generated
		 */
		EClass LOCAL_HELPER = eINSTANCE.getLocalHelper();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_HELPER__CONTEXT = eINSTANCE.getLocalHelper_Context();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_HELPER__PARAMETERS = eINSTANCE.getLocalHelper_Parameters();

		/**
		 * The meta object literal for the '{@link gbind.dsl.impl.HelperParameterImpl <em>Helper Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gbind.dsl.impl.HelperParameterImpl
		 * @see gbind.dsl.impl.DslPackageImpl#getHelperParameter()
		 * @generated
		 */
		EClass HELPER_PARAMETER = eINSTANCE.getHelperParameter();

	}

} //DslPackage

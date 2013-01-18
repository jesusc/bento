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
	 * The feature id for the '<em><b>Bound Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__BOUND_CONCEPT = 4;

	/**
	 * The feature id for the '<em><b>Bound Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__BOUND_METAMODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__NAME = 6;

	/**
	 * The number of structural features of the '<em>Binding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.MetamodelDeclarationImpl <em>Metamodel Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.MetamodelDeclarationImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getMetamodelDeclaration()
	 * @generated
	 */
	int METAMODEL_DECLARATION = 1;

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
	int METACLASS = 2;

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
	int CONCEPT_METACLASS = 3;

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
	int CONCRETE_METACLASS = 4;

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
	int CONCEPT_BINDING = 5;

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
	int CLASS_BINDING = 6;

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
	int INTERMEDIATE_CLASS_BINDING = 7;

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
	 * The feature id for the '<em><b>Concrete Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCRETE_SOURCE = CONCEPT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concrete Reference Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_SOURCE = CONCEPT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concrete Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCRETE_TARGET = CONCEPT_BINDING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concrete Reference Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_TARGET = CONCEPT_BINDING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Intermediate Class Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CLASS_BINDING_FEATURE_COUNT = CONCEPT_BINDING_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link gbind.dsl.impl.BaseFeatureBindingImpl <em>Base Feature Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gbind.dsl.impl.BaseFeatureBindingImpl
	 * @see gbind.dsl.impl.DslPackageImpl#getBaseFeatureBinding()
	 * @generated
	 */
	int BASE_FEATURE_BINDING = 8;

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
	int RENAMING_FEATURE_BINDING = 9;

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
	int OCL_FEATURE_BINDING = 10;

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
	int BASE_HELPER = 11;

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
	int CONCEPT_HELPER = 12;

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
	int LOCAL_HELPER = 13;

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
	 * The number of structural features of the '<em>Local Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HELPER_FEATURE_COUNT = BASE_HELPER_FEATURE_COUNT + 1;


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
	 * Returns the meta object for the reference '{@link gbind.dsl.IntermediateClassBinding#getConcreteSource <em>Concrete Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Source</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConcreteSource()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EReference getIntermediateClassBinding_ConcreteSource();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.IntermediateClassBinding#getConcreteReferenceSource <em>Concrete Reference Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concrete Reference Source</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConcreteReferenceSource()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EAttribute getIntermediateClassBinding_ConcreteReferenceSource();

	/**
	 * Returns the meta object for the reference '{@link gbind.dsl.IntermediateClassBinding#getConcreteTarget <em>Concrete Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Target</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConcreteTarget()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EReference getIntermediateClassBinding_ConcreteTarget();

	/**
	 * Returns the meta object for the attribute '{@link gbind.dsl.IntermediateClassBinding#getConcreteReferenceTarget <em>Concrete Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concrete Reference Target</em>'.
	 * @see gbind.dsl.IntermediateClassBinding#getConcreteReferenceTarget()
	 * @see #getIntermediateClassBinding()
	 * @generated
	 */
	EAttribute getIntermediateClassBinding_ConcreteReferenceTarget();

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
		 * The meta object literal for the '<em><b>Concrete Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CLASS_BINDING__CONCRETE_SOURCE = eINSTANCE.getIntermediateClassBinding_ConcreteSource();

		/**
		 * The meta object literal for the '<em><b>Concrete Reference Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_SOURCE = eINSTANCE.getIntermediateClassBinding_ConcreteReferenceSource();

		/**
		 * The meta object literal for the '<em><b>Concrete Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_CLASS_BINDING__CONCRETE_TARGET = eINSTANCE.getIntermediateClassBinding_ConcreteTarget();

		/**
		 * The meta object literal for the '<em><b>Concrete Reference Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE_TARGET = eINSTANCE.getIntermediateClassBinding_ConcreteReferenceTarget();

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

	}

} //DslPackage

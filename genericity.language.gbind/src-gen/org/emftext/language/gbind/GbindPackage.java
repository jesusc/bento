/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.gbind;

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
 * @see org.emftext.language.gbind.GbindFactory
 * @model kind="package"
 * @generated
 */
public interface GbindPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gbind";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/language/gbind";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gbind";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GbindPackage eINSTANCE = org.emftext.language.gbind.impl.GbindPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.BindingModelImpl <em>Binding Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.BindingModelImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getBindingModel()
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
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__METAMODEL = 4;

	/**
	 * The feature id for the '<em><b>Metamodel URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__METAMODEL_URI = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__NAME = 6;

	/**
	 * The feature id for the '<em><b>Component URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL__COMPONENT_URI = 7;

	/**
	 * The number of structural features of the '<em>Binding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_MODEL_FEATURE_COUNT = 8;


	/**
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.MetaclassImpl <em>Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.MetaclassImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getMetaclass()
	 * @generated
	 */
	int METACLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.ConceptMetaclassImpl <em>Concept Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.ConceptMetaclassImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getConceptMetaclass()
	 * @generated
	 */
	int CONCEPT_METACLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METACLASS__NAME = METACLASS__NAME;

	/**
	 * The number of structural features of the '<em>Concept Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_METACLASS_FEATURE_COUNT = METACLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.ConcreteMetaclassImpl <em>Concrete Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.ConcreteMetaclassImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getConcreteMetaclass()
	 * @generated
	 */
	int CONCRETE_METACLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_METACLASS__NAME = METACLASS__NAME;

	/**
	 * The number of structural features of the '<em>Concrete Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_METACLASS_FEATURE_COUNT = METACLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.ConceptBindingImpl <em>Concept Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.ConceptBindingImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getConceptBinding()
	 * @generated
	 */
	int CONCEPT_BINDING = 4;

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
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.ClassBindingImpl <em>Class Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.ClassBindingImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getClassBinding()
	 * @generated
	 */
	int CLASS_BINDING = 5;

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
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.BaseFeatureBindingImpl <em>Base Feature Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.BaseFeatureBindingImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getBaseFeatureBinding()
	 * @generated
	 */
	int BASE_FEATURE_BINDING = 6;

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
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.RenamingFeatureBindingImpl <em>Renaming Feature Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.RenamingFeatureBindingImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getRenamingFeatureBinding()
	 * @generated
	 */
	int RENAMING_FEATURE_BINDING = 7;

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
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.OclFeatureBindingImpl <em>Ocl Feature Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.OclFeatureBindingImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getOclFeatureBinding()
	 * @generated
	 */
	int OCL_FEATURE_BINDING = 8;

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
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.BaseHelperImpl <em>Base Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.BaseHelperImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getBaseHelper()
	 * @generated
	 */
	int BASE_HELPER = 9;

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
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.ConceptHelperImpl <em>Concept Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.ConceptHelperImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getConceptHelper()
	 * @generated
	 */
	int CONCEPT_HELPER = 10;

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
	 * The meta object id for the '{@link org.emftext.language.gbind.impl.LocalHelperImpl <em>Local Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.gbind.impl.LocalHelperImpl
	 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getLocalHelper()
	 * @generated
	 */
	int LOCAL_HELPER = 11;

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
	 * Returns the meta object for class '{@link org.emftext.language.gbind.BindingModel <em>Binding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Model</em>'.
	 * @see org.emftext.language.gbind.BindingModel
	 * @generated
	 */
	EClass getBindingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.gbind.BindingModel#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.emftext.language.gbind.BindingModel#getBindings()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.gbind.BindingModel#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helpers</em>'.
	 * @see org.emftext.language.gbind.BindingModel#getHelpers()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_Helpers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.gbind.BindingModel#getConceptMetaclasses <em>Concept Metaclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept Metaclasses</em>'.
	 * @see org.emftext.language.gbind.BindingModel#getConceptMetaclasses()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_ConceptMetaclasses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.gbind.BindingModel#getConcreteMetaclasses <em>Concrete Metaclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concrete Metaclasses</em>'.
	 * @see org.emftext.language.gbind.BindingModel#getConcreteMetaclasses()
	 * @see #getBindingModel()
	 * @generated
	 */
	EReference getBindingModel_ConcreteMetaclasses();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.BindingModel#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel</em>'.
	 * @see org.emftext.language.gbind.BindingModel#getMetamodel()
	 * @see #getBindingModel()
	 * @generated
	 */
	EAttribute getBindingModel_Metamodel();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.BindingModel#getMetamodelURI <em>Metamodel URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel URI</em>'.
	 * @see org.emftext.language.gbind.BindingModel#getMetamodelURI()
	 * @see #getBindingModel()
	 * @generated
	 */
	EAttribute getBindingModel_MetamodelURI();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.BindingModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.gbind.BindingModel#getName()
	 * @see #getBindingModel()
	 * @generated
	 */
	EAttribute getBindingModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.BindingModel#getComponentURI <em>Component URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component URI</em>'.
	 * @see org.emftext.language.gbind.BindingModel#getComponentURI()
	 * @see #getBindingModel()
	 * @generated
	 */
	EAttribute getBindingModel_ComponentURI();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.Metaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metaclass</em>'.
	 * @see org.emftext.language.gbind.Metaclass
	 * @generated
	 */
	EClass getMetaclass();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.Metaclass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.gbind.Metaclass#getName()
	 * @see #getMetaclass()
	 * @generated
	 */
	EAttribute getMetaclass_Name();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.ConceptMetaclass <em>Concept Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Metaclass</em>'.
	 * @see org.emftext.language.gbind.ConceptMetaclass
	 * @generated
	 */
	EClass getConceptMetaclass();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.ConcreteMetaclass <em>Concrete Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Metaclass</em>'.
	 * @see org.emftext.language.gbind.ConcreteMetaclass
	 * @generated
	 */
	EClass getConcreteMetaclass();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.ConceptBinding <em>Concept Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Binding</em>'.
	 * @see org.emftext.language.gbind.ConceptBinding
	 * @generated
	 */
	EClass getConceptBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.ConceptBinding#getDebugName <em>Debug Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug Name</em>'.
	 * @see org.emftext.language.gbind.ConceptBinding#getDebugName()
	 * @see #getConceptBinding()
	 * @generated
	 */
	EAttribute getConceptBinding_DebugName();

	/**
	 * Returns the meta object for the container reference '{@link org.emftext.language.gbind.ConceptBinding#getModel_ <em>Model </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model </em>'.
	 * @see org.emftext.language.gbind.ConceptBinding#getModel_()
	 * @see #getConceptBinding()
	 * @generated
	 */
	EReference getConceptBinding_Model_();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.ClassBinding <em>Class Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Binding</em>'.
	 * @see org.emftext.language.gbind.ClassBinding
	 * @generated
	 */
	EClass getClassBinding();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.gbind.ClassBinding#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see org.emftext.language.gbind.ClassBinding#getConcept()
	 * @see #getClassBinding()
	 * @generated
	 */
	EReference getClassBinding_Concept();

	/**
	 * Returns the meta object for the reference list '{@link org.emftext.language.gbind.ClassBinding#getConcrete <em>Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concrete</em>'.
	 * @see org.emftext.language.gbind.ClassBinding#getConcrete()
	 * @see #getClassBinding()
	 * @generated
	 */
	EReference getClassBinding_Concrete();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.gbind.ClassBinding#getWhenClause <em>When Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Clause</em>'.
	 * @see org.emftext.language.gbind.ClassBinding#getWhenClause()
	 * @see #getClassBinding()
	 * @generated
	 */
	EReference getClassBinding_WhenClause();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.BaseFeatureBinding <em>Base Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Feature Binding</em>'.
	 * @see org.emftext.language.gbind.BaseFeatureBinding
	 * @generated
	 */
	EClass getBaseFeatureBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.BaseFeatureBinding#getConceptFeature <em>Concept Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept Feature</em>'.
	 * @see org.emftext.language.gbind.BaseFeatureBinding#getConceptFeature()
	 * @see #getBaseFeatureBinding()
	 * @generated
	 */
	EAttribute getBaseFeatureBinding_ConceptFeature();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.gbind.BaseFeatureBinding#getConceptClass <em>Concept Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Class</em>'.
	 * @see org.emftext.language.gbind.BaseFeatureBinding#getConceptClass()
	 * @see #getBaseFeatureBinding()
	 * @generated
	 */
	EReference getBaseFeatureBinding_ConceptClass();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.gbind.BaseFeatureBinding#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see org.emftext.language.gbind.BaseFeatureBinding#getQualifier()
	 * @see #getBaseFeatureBinding()
	 * @generated
	 */
	EReference getBaseFeatureBinding_Qualifier();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.RenamingFeatureBinding <em>Renaming Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renaming Feature Binding</em>'.
	 * @see org.emftext.language.gbind.RenamingFeatureBinding
	 * @generated
	 */
	EClass getRenamingFeatureBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.RenamingFeatureBinding#getConcreteFeature <em>Concrete Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concrete Feature</em>'.
	 * @see org.emftext.language.gbind.RenamingFeatureBinding#getConcreteFeature()
	 * @see #getRenamingFeatureBinding()
	 * @generated
	 */
	EAttribute getRenamingFeatureBinding_ConcreteFeature();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.OclFeatureBinding <em>Ocl Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Feature Binding</em>'.
	 * @see org.emftext.language.gbind.OclFeatureBinding
	 * @generated
	 */
	EClass getOclFeatureBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.gbind.OclFeatureBinding#getConcrete <em>Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concrete</em>'.
	 * @see org.emftext.language.gbind.OclFeatureBinding#getConcrete()
	 * @see #getOclFeatureBinding()
	 * @generated
	 */
	EReference getOclFeatureBinding_Concrete();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.BaseHelper <em>Base Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Helper</em>'.
	 * @see org.emftext.language.gbind.BaseHelper
	 * @generated
	 */
	EClass getBaseHelper();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.gbind.BaseHelper#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see org.emftext.language.gbind.BaseHelper#getFeature()
	 * @see #getBaseHelper()
	 * @generated
	 */
	EAttribute getBaseHelper_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.gbind.BaseHelper#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.emftext.language.gbind.BaseHelper#getBody()
	 * @see #getBaseHelper()
	 * @generated
	 */
	EReference getBaseHelper_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.gbind.BaseHelper#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.emftext.language.gbind.BaseHelper#getType()
	 * @see #getBaseHelper()
	 * @generated
	 */
	EReference getBaseHelper_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.emftext.language.gbind.BaseHelper#getModel_ <em>Model </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model </em>'.
	 * @see org.emftext.language.gbind.BaseHelper#getModel_()
	 * @see #getBaseHelper()
	 * @generated
	 */
	EReference getBaseHelper_Model_();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.ConceptHelper <em>Concept Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Helper</em>'.
	 * @see org.emftext.language.gbind.ConceptHelper
	 * @generated
	 */
	EClass getConceptHelper();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.gbind.ConceptHelper#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see org.emftext.language.gbind.ConceptHelper#getQualifier()
	 * @see #getConceptHelper()
	 * @generated
	 */
	EReference getConceptHelper_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.gbind.ConceptHelper#getContextClass <em>Context Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Class</em>'.
	 * @see org.emftext.language.gbind.ConceptHelper#getContextClass()
	 * @see #getConceptHelper()
	 * @generated
	 */
	EReference getConceptHelper_ContextClass();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.gbind.LocalHelper <em>Local Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Helper</em>'.
	 * @see org.emftext.language.gbind.LocalHelper
	 * @generated
	 */
	EClass getLocalHelper();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.gbind.LocalHelper#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.emftext.language.gbind.LocalHelper#getContext()
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
	GbindFactory getGbindFactory();

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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.BindingModelImpl <em>Binding Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.BindingModelImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getBindingModel()
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
		 * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_MODEL__METAMODEL = eINSTANCE.getBindingModel_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Metamodel URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_MODEL__METAMODEL_URI = eINSTANCE.getBindingModel_MetamodelURI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_MODEL__NAME = eINSTANCE.getBindingModel_Name();

		/**
		 * The meta object literal for the '<em><b>Component URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_MODEL__COMPONENT_URI = eINSTANCE.getBindingModel_ComponentURI();

		/**
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.MetaclassImpl <em>Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.MetaclassImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getMetaclass()
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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.ConceptMetaclassImpl <em>Concept Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.ConceptMetaclassImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getConceptMetaclass()
		 * @generated
		 */
		EClass CONCEPT_METACLASS = eINSTANCE.getConceptMetaclass();

		/**
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.ConcreteMetaclassImpl <em>Concrete Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.ConcreteMetaclassImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getConcreteMetaclass()
		 * @generated
		 */
		EClass CONCRETE_METACLASS = eINSTANCE.getConcreteMetaclass();

		/**
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.ConceptBindingImpl <em>Concept Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.ConceptBindingImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getConceptBinding()
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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.ClassBindingImpl <em>Class Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.ClassBindingImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getClassBinding()
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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.BaseFeatureBindingImpl <em>Base Feature Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.BaseFeatureBindingImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getBaseFeatureBinding()
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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.RenamingFeatureBindingImpl <em>Renaming Feature Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.RenamingFeatureBindingImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getRenamingFeatureBinding()
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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.OclFeatureBindingImpl <em>Ocl Feature Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.OclFeatureBindingImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getOclFeatureBinding()
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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.BaseHelperImpl <em>Base Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.BaseHelperImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getBaseHelper()
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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.ConceptHelperImpl <em>Concept Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.ConceptHelperImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getConceptHelper()
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
		 * The meta object literal for the '{@link org.emftext.language.gbind.impl.LocalHelperImpl <em>Local Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.gbind.impl.LocalHelperImpl
		 * @see org.emftext.language.gbind.impl.GbindPackageImpl#getLocalHelper()
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

} //GbindPackage

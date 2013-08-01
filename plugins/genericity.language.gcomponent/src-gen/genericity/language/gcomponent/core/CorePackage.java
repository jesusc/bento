/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see genericity.language.gcomponent.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/language/gcomponent/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gcomponent_core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = genericity.language.gcomponent.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.NamedElementImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.ComponentImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MAINTAINER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SOURCE_MODELS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TARGET_MODELS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Generate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATE_MODELS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FORMAL_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.ModelImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.ParameterModelImpl <em>Parameter Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.ParameterModelImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getParameterModel()
	 * @generated
	 */
	int PARAMETER_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MODEL__TYPE = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MODEL__RESOURCE_NAME = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.GeneratedModelImpl <em>Generated Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.GeneratedModelImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getGeneratedModel()
	 * @generated
	 */
	int GENERATED_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_MODEL__NAME = MODEL__NAME;

	/**
	 * The number of structural features of the '<em>Generated Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.TaggedImpl <em>Tagged</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.TaggedImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getTagged()
	 * @generated
	 */
	int TAGGED = 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED__TAGS = 0;

	/**
	 * The number of structural features of the '<em>Tagged</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.TransformationComponentImpl <em>Transformation Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.TransformationComponentImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getTransformationComponent()
	 * @generated
	 */
	int TRANSFORMATION_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__OWNER = COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__MAINTAINER = COMPONENT__MAINTAINER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__VERSION = COMPONENT__VERSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__SOURCE = COMPONENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TARGET = COMPONENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__SOURCE_MODELS = COMPONENT__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TARGET_MODELS = COMPONENT__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Generate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__GENERATE_MODELS = COMPONENT__GENERATE_MODELS;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS = COMPONENT__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TAGS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is M2M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__IS_M2M = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TEMPLATE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__CONSTRAINTS = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transformation Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.CompositeComponentImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__OWNER = COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__MAINTAINER = COMPONENT__MAINTAINER;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__VERSION = COMPONENT__VERSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__SOURCE = COMPONENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__TARGET = COMPONENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__SOURCE_MODELS = COMPONENT__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__TARGET_MODELS = COMPONENT__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Generate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__GENERATE_MODELS = COMPONENT__GENERATE_MODELS;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__FORMAL_PARAMETERS = COMPONENT__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__USES = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__COMPOSITION = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__BINDINGS = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.BindingDeclarationImpl <em>Binding Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.BindingDeclarationImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getBindingDeclaration()
	 * @generated
	 */
	int BINDING_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DECLARATION__FILE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Binding Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.TemplateImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 9;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.ConstraintImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 10;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.OclConstraintImpl <em>Ocl Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.OclConstraintImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getOclConstraint()
	 * @generated
	 */
	int OCL_CONSTRAINT = 11;

	/**
	 * The number of structural features of the '<em>Ocl Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.MetamodelImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__URI = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.TagImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getTag()
	 * @generated
	 */
	int TAG = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.ConceptImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = METAMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__URI = METAMODEL__URI;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CONSTRAINTS = METAMODEL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__TAGS = METAMODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = METAMODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.impl.DocumentationImpl
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 15;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericity.language.gcomponent.core.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.core.Status
	 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 16;


	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see genericity.language.gcomponent.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.language.gcomponent.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see genericity.language.gcomponent.core.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.Component#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see genericity.language.gcomponent.core.Component#getOwner()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Owner();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.Component#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see genericity.language.gcomponent.core.Component#getMaintainer()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Maintainer();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.Component#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see genericity.language.gcomponent.core.Component#getVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Version();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.Component#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see genericity.language.gcomponent.core.Component#getStatus()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.Component#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see genericity.language.gcomponent.core.Component#getSource()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.Component#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see genericity.language.gcomponent.core.Component#getTarget()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.Component#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see genericity.language.gcomponent.core.Component#getSourceModels()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.Component#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see genericity.language.gcomponent.core.Component#getTargetModels()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_TargetModels();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.Component#getGenerateModels <em>Generate Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generate Models</em>'.
	 * @see genericity.language.gcomponent.core.Component#getGenerateModels()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_GenerateModels();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.Component#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see genericity.language.gcomponent.core.Component#getFormalParameters()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_FormalParameters();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see genericity.language.gcomponent.core.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.ParameterModel <em>Parameter Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Model</em>'.
	 * @see genericity.language.gcomponent.core.ParameterModel
	 * @generated
	 */
	EClass getParameterModel();

	/**
	 * Returns the meta object for the reference '{@link genericity.language.gcomponent.core.ParameterModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see genericity.language.gcomponent.core.ParameterModel#getType()
	 * @see #getParameterModel()
	 * @generated
	 */
	EReference getParameterModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.ParameterModel#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see genericity.language.gcomponent.core.ParameterModel#getResourceName()
	 * @see #getParameterModel()
	 * @generated
	 */
	EAttribute getParameterModel_ResourceName();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.GeneratedModel <em>Generated Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Model</em>'.
	 * @see genericity.language.gcomponent.core.GeneratedModel
	 * @generated
	 */
	EClass getGeneratedModel();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Tagged <em>Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged</em>'.
	 * @see genericity.language.gcomponent.core.Tagged
	 * @generated
	 */
	EClass getTagged();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.Tagged#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see genericity.language.gcomponent.core.Tagged#getTags()
	 * @see #getTagged()
	 * @generated
	 */
	EReference getTagged_Tags();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.TransformationComponent <em>Transformation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Component</em>'.
	 * @see genericity.language.gcomponent.core.TransformationComponent
	 * @generated
	 */
	EClass getTransformationComponent();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.TransformationComponent#isIsM2M <em>Is M2M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is M2M</em>'.
	 * @see genericity.language.gcomponent.core.TransformationComponent#isIsM2M()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EAttribute getTransformationComponent_IsM2M();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.language.gcomponent.core.TransformationComponent#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see genericity.language.gcomponent.core.TransformationComponent#getTemplate()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EReference getTransformationComponent_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.TransformationComponent#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see genericity.language.gcomponent.core.TransformationComponent#getConstraints()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EReference getTransformationComponent_Constraints();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see genericity.language.gcomponent.core.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for the reference list '{@link genericity.language.gcomponent.core.CompositeComponent#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see genericity.language.gcomponent.core.CompositeComponent#getUses()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_Uses();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.language.gcomponent.core.CompositeComponent#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composition</em>'.
	 * @see genericity.language.gcomponent.core.CompositeComponent#getComposition()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_Composition();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.CompositeComponent#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see genericity.language.gcomponent.core.CompositeComponent#getBindings()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_Bindings();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.BindingDeclaration <em>Binding Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Declaration</em>'.
	 * @see genericity.language.gcomponent.core.BindingDeclaration
	 * @generated
	 */
	EClass getBindingDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.BindingDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.language.gcomponent.core.BindingDeclaration#getName()
	 * @see #getBindingDeclaration()
	 * @generated
	 */
	EAttribute getBindingDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.BindingDeclaration#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see genericity.language.gcomponent.core.BindingDeclaration#getFileName()
	 * @see #getBindingDeclaration()
	 * @generated
	 */
	EAttribute getBindingDeclaration_FileName();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see genericity.language.gcomponent.core.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see genericity.language.gcomponent.core.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.OclConstraint <em>Ocl Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Constraint</em>'.
	 * @see genericity.language.gcomponent.core.OclConstraint
	 * @generated
	 */
	EClass getOclConstraint();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see genericity.language.gcomponent.core.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.Metamodel#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see genericity.language.gcomponent.core.Metamodel#getUri()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.core.Metamodel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see genericity.language.gcomponent.core.Metamodel#getConstraints()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Constraints();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see genericity.language.gcomponent.core.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.core.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see genericity.language.gcomponent.core.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see genericity.language.gcomponent.core.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.core.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see genericity.language.gcomponent.core.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for enum '{@link genericity.language.gcomponent.core.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see genericity.language.gcomponent.core.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.NamedElementImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.ComponentImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__OWNER = eINSTANCE.getComponent_Owner();

		/**
		 * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MAINTAINER = eINSTANCE.getComponent_Maintainer();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__VERSION = eINSTANCE.getComponent_Version();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__STATUS = eINSTANCE.getComponent_Status();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SOURCE = eINSTANCE.getComponent_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TARGET = eINSTANCE.getComponent_Target();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SOURCE_MODELS = eINSTANCE.getComponent_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TARGET_MODELS = eINSTANCE.getComponent_TargetModels();

		/**
		 * The meta object literal for the '<em><b>Generate Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__GENERATE_MODELS = eINSTANCE.getComponent_GenerateModels();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__FORMAL_PARAMETERS = eINSTANCE.getComponent_FormalParameters();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.ModelImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.ParameterModelImpl <em>Parameter Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.ParameterModelImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getParameterModel()
		 * @generated
		 */
		EClass PARAMETER_MODEL = eINSTANCE.getParameterModel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MODEL__TYPE = eINSTANCE.getParameterModel_Type();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MODEL__RESOURCE_NAME = eINSTANCE.getParameterModel_ResourceName();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.GeneratedModelImpl <em>Generated Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.GeneratedModelImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getGeneratedModel()
		 * @generated
		 */
		EClass GENERATED_MODEL = eINSTANCE.getGeneratedModel();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.TaggedImpl <em>Tagged</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.TaggedImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getTagged()
		 * @generated
		 */
		EClass TAGGED = eINSTANCE.getTagged();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED__TAGS = eINSTANCE.getTagged_Tags();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.TransformationComponentImpl <em>Transformation Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.TransformationComponentImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getTransformationComponent()
		 * @generated
		 */
		EClass TRANSFORMATION_COMPONENT = eINSTANCE.getTransformationComponent();

		/**
		 * The meta object literal for the '<em><b>Is M2M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_COMPONENT__IS_M2M = eINSTANCE.getTransformationComponent_IsM2M();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_COMPONENT__TEMPLATE = eINSTANCE.getTransformationComponent_Template();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_COMPONENT__CONSTRAINTS = eINSTANCE.getTransformationComponent_Constraints();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.CompositeComponentImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__USES = eINSTANCE.getCompositeComponent_Uses();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__COMPOSITION = eINSTANCE.getCompositeComponent_Composition();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT__BINDINGS = eINSTANCE.getCompositeComponent_Bindings();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.BindingDeclarationImpl <em>Binding Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.BindingDeclarationImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getBindingDeclaration()
		 * @generated
		 */
		EClass BINDING_DECLARATION = eINSTANCE.getBindingDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_DECLARATION__NAME = eINSTANCE.getBindingDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_DECLARATION__FILE_NAME = eINSTANCE.getBindingDeclaration_FileName();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.TemplateImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.ConstraintImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.OclConstraintImpl <em>Ocl Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.OclConstraintImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getOclConstraint()
		 * @generated
		 */
		EClass OCL_CONSTRAINT = eINSTANCE.getOclConstraint();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.MetamodelImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__URI = eINSTANCE.getMetamodel_Uri();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__CONSTRAINTS = eINSTANCE.getMetamodel_Constraints();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.TagImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUE = eINSTANCE.getTag_Value();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.ConceptImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.impl.DocumentationImpl
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.core.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.core.Status
		 * @see genericity.language.gcomponent.core.impl.CorePackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //CorePackage

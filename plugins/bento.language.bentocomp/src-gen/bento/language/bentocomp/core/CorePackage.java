/**
 */
package bento.language.bentocomp.core;

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
 * @see bento.language.bentocomp.core.CoreFactory
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
	String eNS_URI = "http://www.miso.es/bento/bentocomp/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bentocomp_core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = bento.language.bentocomp.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.NamedElementImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.ComponentImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getComponent()
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
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TAGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTRIBUTORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SOURCE_MODELS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TARGET_MODELS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Generate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATE_MODELS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FORMAL_PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.ModelImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getModel()
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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.ParameterModelImpl <em>Parameter Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.ParameterModelImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getParameterModel()
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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.GeneratedModelImpl <em>Generated Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.GeneratedModelImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getGeneratedModel()
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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.TaggedImpl <em>Tagged</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.TaggedImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTagged()
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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.TemplateBasedComponentImpl <em>Template Based Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.TemplateBasedComponentImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTemplateBasedComponent()
	 * @generated
	 */
	int TEMPLATE_BASED_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__TAGS = COMPONENT__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__OWNER = COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__CONTRIBUTORS = COMPONENT__CONTRIBUTORS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__VERSION = COMPONENT__VERSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__STATUS = COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__SOURCE = COMPONENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__TARGET = COMPONENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__SOURCE_MODELS = COMPONENT__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__TARGET_MODELS = COMPONENT__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Generate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__GENERATE_MODELS = COMPONENT__GENERATE_MODELS;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__FORMAL_PARAMETERS = COMPONENT__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT__TEMPLATE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Based Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASED_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.TransformationComponentImpl <em>Transformation Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.TransformationComponentImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTransformationComponent()
	 * @generated
	 */
	int TRANSFORMATION_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__NAME = TEMPLATE_BASED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TAGS = TEMPLATE_BASED_COMPONENT__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__OWNER = TEMPLATE_BASED_COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__CONTRIBUTORS = TEMPLATE_BASED_COMPONENT__CONTRIBUTORS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__VERSION = TEMPLATE_BASED_COMPONENT__VERSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__STATUS = TEMPLATE_BASED_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__SOURCE = TEMPLATE_BASED_COMPONENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TARGET = TEMPLATE_BASED_COMPONENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__SOURCE_MODELS = TEMPLATE_BASED_COMPONENT__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TARGET_MODELS = TEMPLATE_BASED_COMPONENT__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Generate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__GENERATE_MODELS = TEMPLATE_BASED_COMPONENT__GENERATE_MODELS;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS = TEMPLATE_BASED_COMPONENT__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TEMPLATE = TEMPLATE_BASED_COMPONENT__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Is M2M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__IS_M2M = TEMPLATE_BASED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__CONSTRAINTS = TEMPLATE_BASED_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT_FEATURE_COUNT = TEMPLATE_BASED_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.GraphicalEditorComponentImpl <em>Graphical Editor Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.GraphicalEditorComponentImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getGraphicalEditorComponent()
	 * @generated
	 */
	int GRAPHICAL_EDITOR_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__NAME = TEMPLATE_BASED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__TAGS = TEMPLATE_BASED_COMPONENT__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__OWNER = TEMPLATE_BASED_COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__CONTRIBUTORS = TEMPLATE_BASED_COMPONENT__CONTRIBUTORS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__VERSION = TEMPLATE_BASED_COMPONENT__VERSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__STATUS = TEMPLATE_BASED_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__SOURCE = TEMPLATE_BASED_COMPONENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__TARGET = TEMPLATE_BASED_COMPONENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__SOURCE_MODELS = TEMPLATE_BASED_COMPONENT__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__TARGET_MODELS = TEMPLATE_BASED_COMPONENT__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Generate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__GENERATE_MODELS = TEMPLATE_BASED_COMPONENT__GENERATE_MODELS;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__FORMAL_PARAMETERS = TEMPLATE_BASED_COMPONENT__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT__TEMPLATE = TEMPLATE_BASED_COMPONENT__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Graphical Editor Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_EDITOR_COMPONENT_FEATURE_COUNT = TEMPLATE_BASED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.CompositeComponentImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__TAGS = COMPONENT__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__OWNER = COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__CONTRIBUTORS = COMPONENT__CONTRIBUTORS;

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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.BindingDeclarationImpl <em>Binding Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.BindingDeclarationImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getBindingDeclaration()
	 * @generated
	 */
	int BINDING_DECLARATION = 10;

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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.TemplateImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 11;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.ConstraintImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 12;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.OclConstraintImpl <em>Ocl Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.OclConstraintImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getOclConstraint()
	 * @generated
	 */
	int OCL_CONSTRAINT = 13;

	/**
	 * The number of structural features of the '<em>Ocl Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.MetamodelImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 14;

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
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__RESOURCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.TagImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTag()
	 * @generated
	 */
	int TAG = 15;

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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.ConceptImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 16;

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
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__RESOURCE = METAMODEL__RESOURCE;

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
	 * The meta object id for the '{@link bento.language.bentocomp.core.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.impl.DocumentationImpl
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 17;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.core.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.core.Status
	 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 18;


	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see bento.language.bentocomp.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.language.bentocomp.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see bento.language.bentocomp.core.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.Component#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see bento.language.bentocomp.core.Component#getOwner()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Owner();

	/**
	 * Returns the meta object for the attribute list '{@link bento.language.bentocomp.core.Component#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contributors</em>'.
	 * @see bento.language.bentocomp.core.Component#getContributors()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Contributors();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.Component#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see bento.language.bentocomp.core.Component#getVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Version();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.Component#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see bento.language.bentocomp.core.Component#getStatus()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.Component#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see bento.language.bentocomp.core.Component#getSource()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.Component#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see bento.language.bentocomp.core.Component#getTarget()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.Component#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see bento.language.bentocomp.core.Component#getSourceModels()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.Component#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see bento.language.bentocomp.core.Component#getTargetModels()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_TargetModels();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.Component#getGenerateModels <em>Generate Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generate Models</em>'.
	 * @see bento.language.bentocomp.core.Component#getGenerateModels()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_GenerateModels();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.Component#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see bento.language.bentocomp.core.Component#getFormalParameters()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_FormalParameters();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see bento.language.bentocomp.core.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.ParameterModel <em>Parameter Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Model</em>'.
	 * @see bento.language.bentocomp.core.ParameterModel
	 * @generated
	 */
	EClass getParameterModel();

	/**
	 * Returns the meta object for the reference '{@link bento.language.bentocomp.core.ParameterModel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see bento.language.bentocomp.core.ParameterModel#getType()
	 * @see #getParameterModel()
	 * @generated
	 */
	EReference getParameterModel_Type();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.ParameterModel#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see bento.language.bentocomp.core.ParameterModel#getResourceName()
	 * @see #getParameterModel()
	 * @generated
	 */
	EAttribute getParameterModel_ResourceName();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.GeneratedModel <em>Generated Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Model</em>'.
	 * @see bento.language.bentocomp.core.GeneratedModel
	 * @generated
	 */
	EClass getGeneratedModel();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Tagged <em>Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged</em>'.
	 * @see bento.language.bentocomp.core.Tagged
	 * @generated
	 */
	EClass getTagged();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.Tagged#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see bento.language.bentocomp.core.Tagged#getTags()
	 * @see #getTagged()
	 * @generated
	 */
	EReference getTagged_Tags();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.TemplateBasedComponent <em>Template Based Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Based Component</em>'.
	 * @see bento.language.bentocomp.core.TemplateBasedComponent
	 * @generated
	 */
	EClass getTemplateBasedComponent();

	/**
	 * Returns the meta object for the containment reference '{@link bento.language.bentocomp.core.TemplateBasedComponent#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see bento.language.bentocomp.core.TemplateBasedComponent#getTemplate()
	 * @see #getTemplateBasedComponent()
	 * @generated
	 */
	EReference getTemplateBasedComponent_Template();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.TransformationComponent <em>Transformation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Component</em>'.
	 * @see bento.language.bentocomp.core.TransformationComponent
	 * @generated
	 */
	EClass getTransformationComponent();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.TransformationComponent#isIsM2M <em>Is M2M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is M2M</em>'.
	 * @see bento.language.bentocomp.core.TransformationComponent#isIsM2M()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EAttribute getTransformationComponent_IsM2M();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.TransformationComponent#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see bento.language.bentocomp.core.TransformationComponent#getConstraints()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EReference getTransformationComponent_Constraints();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.GraphicalEditorComponent <em>Graphical Editor Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Editor Component</em>'.
	 * @see bento.language.bentocomp.core.GraphicalEditorComponent
	 * @generated
	 */
	EClass getGraphicalEditorComponent();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see bento.language.bentocomp.core.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for the reference list '{@link bento.language.bentocomp.core.CompositeComponent#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see bento.language.bentocomp.core.CompositeComponent#getUses()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_Uses();

	/**
	 * Returns the meta object for the containment reference '{@link bento.language.bentocomp.core.CompositeComponent#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composition</em>'.
	 * @see bento.language.bentocomp.core.CompositeComponent#getComposition()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_Composition();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.CompositeComponent#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see bento.language.bentocomp.core.CompositeComponent#getBindings()
	 * @see #getCompositeComponent()
	 * @generated
	 */
	EReference getCompositeComponent_Bindings();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.BindingDeclaration <em>Binding Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Declaration</em>'.
	 * @see bento.language.bentocomp.core.BindingDeclaration
	 * @generated
	 */
	EClass getBindingDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.BindingDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.language.bentocomp.core.BindingDeclaration#getName()
	 * @see #getBindingDeclaration()
	 * @generated
	 */
	EAttribute getBindingDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.BindingDeclaration#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see bento.language.bentocomp.core.BindingDeclaration#getFileName()
	 * @see #getBindingDeclaration()
	 * @generated
	 */
	EAttribute getBindingDeclaration_FileName();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see bento.language.bentocomp.core.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see bento.language.bentocomp.core.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.OclConstraint <em>Ocl Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Constraint</em>'.
	 * @see bento.language.bentocomp.core.OclConstraint
	 * @generated
	 */
	EClass getOclConstraint();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see bento.language.bentocomp.core.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.Metamodel#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see bento.language.bentocomp.core.Metamodel#getUri()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Uri();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.Metamodel#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see bento.language.bentocomp.core.Metamodel#getResource()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.core.Metamodel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see bento.language.bentocomp.core.Metamodel#getConstraints()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Constraints();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see bento.language.bentocomp.core.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.core.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bento.language.bentocomp.core.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see bento.language.bentocomp.core.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.core.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see bento.language.bentocomp.core.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for enum '{@link bento.language.bentocomp.core.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see bento.language.bentocomp.core.Status
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
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.NamedElementImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.ComponentImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getComponent()
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
		 * The meta object literal for the '<em><b>Contributors</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CONTRIBUTORS = eINSTANCE.getComponent_Contributors();

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
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.ModelImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.ParameterModelImpl <em>Parameter Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.ParameterModelImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getParameterModel()
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
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.GeneratedModelImpl <em>Generated Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.GeneratedModelImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getGeneratedModel()
		 * @generated
		 */
		EClass GENERATED_MODEL = eINSTANCE.getGeneratedModel();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.TaggedImpl <em>Tagged</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.TaggedImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTagged()
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
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.TemplateBasedComponentImpl <em>Template Based Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.TemplateBasedComponentImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTemplateBasedComponent()
		 * @generated
		 */
		EClass TEMPLATE_BASED_COMPONENT = eINSTANCE.getTemplateBasedComponent();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BASED_COMPONENT__TEMPLATE = eINSTANCE.getTemplateBasedComponent_Template();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.TransformationComponentImpl <em>Transformation Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.TransformationComponentImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTransformationComponent()
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
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_COMPONENT__CONSTRAINTS = eINSTANCE.getTransformationComponent_Constraints();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.GraphicalEditorComponentImpl <em>Graphical Editor Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.GraphicalEditorComponentImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getGraphicalEditorComponent()
		 * @generated
		 */
		EClass GRAPHICAL_EDITOR_COMPONENT = eINSTANCE.getGraphicalEditorComponent();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.CompositeComponentImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getCompositeComponent()
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
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.BindingDeclarationImpl <em>Binding Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.BindingDeclarationImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getBindingDeclaration()
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
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.TemplateImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.ConstraintImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.OclConstraintImpl <em>Ocl Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.OclConstraintImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getOclConstraint()
		 * @generated
		 */
		EClass OCL_CONSTRAINT = eINSTANCE.getOclConstraint();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.MetamodelImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getMetamodel()
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
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__RESOURCE = eINSTANCE.getMetamodel_Resource();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__CONSTRAINTS = eINSTANCE.getMetamodel_Constraints();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.TagImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getTag()
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
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.ConceptImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.impl.DocumentationImpl
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.core.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.core.Status
		 * @see bento.language.bentocomp.core.impl.CorePackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //CorePackage

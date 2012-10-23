/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent;

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
 * @see genericity.language.gcomponent.GcomponentFactory
 * @model kind="package"
 * @generated
 */
public interface GcomponentPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "gcomponent";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://genericity/language/gcomponent";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "gcomponent";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  GcomponentPackage eINSTANCE = genericity.language.gcomponent.impl.GcomponentPackageImpl.init();

  /**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.NamedElementImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.TaggedImpl <em>Tagged</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.TaggedImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getTagged()
	 * @generated
	 */
	int TAGGED = 1;

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
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.AbstractComponentImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 2;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.TransformationComponentImpl <em>Transformation Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.TransformationComponentImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getTransformationComponent()
	 * @generated
	 */
	int TRANSFORMATION_COMPONENT = 3;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__NAME = ABSTRACT_COMPONENT__NAME;

		/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TAGS = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__SOURCE = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TARGET = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Is M2M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__IS_M2M = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__TEMPLATE = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT__CONSTRAINTS = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

		/**
	 * The number of structural features of the '<em>Transformation Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

		/**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.TemplateImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 4;

		/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 0;

		/**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.AtlTemplateImpl <em>Atl Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.AtlTemplateImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getAtlTemplate()
	 * @generated
	 */
	int ATL_TEMPLATE = 5;

		/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TEMPLATE__TEMPLATE = TEMPLATE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Atl Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TEMPLATE_FEATURE_COUNT = TEMPLATE_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.ConstraintImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 6;

		/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

		/**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.OclConstraintImpl <em>Ocl Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.OclConstraintImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getOclConstraint()
	 * @generated
	 */
	int OCL_CONSTRAINT = 7;

		/**
	 * The number of structural features of the '<em>Ocl Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.MetamodelImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 8;

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
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.TagImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 9;

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
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.ConceptImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 10;

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
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.ParameterImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 11;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link genericity.language.gcomponent.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.language.gcomponent.impl.SpecificationImpl
	 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 12;

		/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 0;

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see genericity.language.gcomponent.NamedElement
	 * @generated
	 */
  EClass getNamedElement();

  /**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.language.gcomponent.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
  EAttribute getNamedElement_Name();

  /**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.Tagged <em>Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged</em>'.
	 * @see genericity.language.gcomponent.Tagged
	 * @generated
	 */
	EClass getTagged();

		/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.Tagged#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see genericity.language.gcomponent.Tagged#getTags()
	 * @see #getTagged()
	 * @generated
	 */
	EReference getTagged_Tags();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see genericity.language.gcomponent.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.TransformationComponent <em>Transformation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Component</em>'.
	 * @see genericity.language.gcomponent.TransformationComponent
	 * @generated
	 */
	EClass getTransformationComponent();

		/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.TransformationComponent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see genericity.language.gcomponent.TransformationComponent#getSource()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EReference getTransformationComponent_Source();

		/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.TransformationComponent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see genericity.language.gcomponent.TransformationComponent#getTarget()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EReference getTransformationComponent_Target();

		/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.TransformationComponent#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see genericity.language.gcomponent.TransformationComponent#getFormalParameters()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EReference getTransformationComponent_FormalParameters();

		/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.TransformationComponent#isIsM2M <em>Is M2M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is M2M</em>'.
	 * @see genericity.language.gcomponent.TransformationComponent#isIsM2M()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EAttribute getTransformationComponent_IsM2M();

		/**
	 * Returns the meta object for the containment reference '{@link genericity.language.gcomponent.TransformationComponent#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see genericity.language.gcomponent.TransformationComponent#getTemplate()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EReference getTransformationComponent_Template();

		/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.TransformationComponent#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see genericity.language.gcomponent.TransformationComponent#getConstraints()
	 * @see #getTransformationComponent()
	 * @generated
	 */
	EReference getTransformationComponent_Constraints();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see genericity.language.gcomponent.Template
	 * @generated
	 */
	EClass getTemplate();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.AtlTemplate <em>Atl Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atl Template</em>'.
	 * @see genericity.language.gcomponent.AtlTemplate
	 * @generated
	 */
	EClass getAtlTemplate();

		/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.AtlTemplate#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see genericity.language.gcomponent.AtlTemplate#getTemplate()
	 * @see #getAtlTemplate()
	 * @generated
	 */
	EAttribute getAtlTemplate_Template();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see genericity.language.gcomponent.Constraint
	 * @generated
	 */
	EClass getConstraint();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.OclConstraint <em>Ocl Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Constraint</em>'.
	 * @see genericity.language.gcomponent.OclConstraint
	 * @generated
	 */
	EClass getOclConstraint();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see genericity.language.gcomponent.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

		/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.Metamodel#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see genericity.language.gcomponent.Metamodel#getUri()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Uri();

		/**
	 * Returns the meta object for the containment reference list '{@link genericity.language.gcomponent.Metamodel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see genericity.language.gcomponent.Metamodel#getConstraints()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Constraints();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see genericity.language.gcomponent.Tag
	 * @generated
	 */
	EClass getTag();

		/**
	 * Returns the meta object for the attribute '{@link genericity.language.gcomponent.Tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see genericity.language.gcomponent.Tag#getValue()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Value();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see genericity.language.gcomponent.Concept
	 * @generated
	 */
	EClass getConcept();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see genericity.language.gcomponent.Parameter
	 * @generated
	 */
	EClass getParameter();

		/**
	 * Returns the meta object for class '{@link genericity.language.gcomponent.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see genericity.language.gcomponent.Specification
	 * @generated
	 */
	EClass getSpecification();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  GcomponentFactory getGcomponentFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.NamedElementImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.TaggedImpl <em>Tagged</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.TaggedImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getTagged()
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
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.AbstractComponentImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

				/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.TransformationComponentImpl <em>Transformation Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.TransformationComponentImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getTransformationComponent()
		 * @generated
		 */
		EClass TRANSFORMATION_COMPONENT = eINSTANCE.getTransformationComponent();

				/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_COMPONENT__SOURCE = eINSTANCE.getTransformationComponent_Source();

				/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_COMPONENT__TARGET = eINSTANCE.getTransformationComponent_Target();

				/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS = eINSTANCE.getTransformationComponent_FormalParameters();

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
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.TemplateImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

				/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.AtlTemplateImpl <em>Atl Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.AtlTemplateImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getAtlTemplate()
		 * @generated
		 */
		EClass ATL_TEMPLATE = eINSTANCE.getAtlTemplate();

				/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATL_TEMPLATE__TEMPLATE = eINSTANCE.getAtlTemplate_Template();

				/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.ConstraintImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

				/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.OclConstraintImpl <em>Ocl Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.OclConstraintImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getOclConstraint()
		 * @generated
		 */
		EClass OCL_CONSTRAINT = eINSTANCE.getOclConstraint();

				/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.MetamodelImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getMetamodel()
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
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.TagImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getTag()
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
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.ConceptImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

				/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.ParameterImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

				/**
		 * The meta object literal for the '{@link genericity.language.gcomponent.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.language.gcomponent.impl.SpecificationImpl
		 * @see genericity.language.gcomponent.impl.GcomponentPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

  }

} //GcomponentPackage

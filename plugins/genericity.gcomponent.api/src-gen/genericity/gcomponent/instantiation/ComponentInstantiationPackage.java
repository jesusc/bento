/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation;

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
 * @see genericity.gcomponent.instantiation.ComponentInstantiationFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentInstantiationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instantiation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/language/gcomponent/instantiation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gcomponent_instantiation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInstantiationPackage eINSTANCE = genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.gcomponent.instantiation.impl.ComponentInstantiationImpl <em>Component Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationImpl
	 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getComponentInstantiation()
	 * @generated
	 */
	int COMPONENT_INSTANTIATION = 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION__TRANSFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Component Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANTIATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link genericity.gcomponent.instantiation.impl.ExecutableTransformationImpl <em>Executable Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.gcomponent.instantiation.impl.ExecutableTransformationImpl
	 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getExecutableTransformation()
	 * @generated
	 */
	int EXECUTABLE_TRANSFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Executable Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_TRANSFORMATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericity.gcomponent.instantiation.impl.AdaptedTransformationImpl <em>Adapted Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.gcomponent.instantiation.impl.AdaptedTransformationImpl
	 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getAdaptedTransformation()
	 * @generated
	 */
	int ADAPTED_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_TRANSFORMATION__TEMPLATE = EXECUTABLE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Adaptations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS = EXECUTABLE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adapted Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTED_TRANSFORMATION_FEATURE_COUNT = EXECUTABLE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl <em>Adapt With Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl
	 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getAdaptWithBinding()
	 * @generated
	 */
	int ADAPT_WITH_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Parameter Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPT_WITH_BINDING__PARAMETER_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Concrete Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPT_WITH_BINDING__CONCRETE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Concept Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPT_WITH_BINDING__CONCEPT_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Applied Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPT_WITH_BINDING__APPLIED_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Template Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPT_WITH_BINDING__TEMPLATE_DATA = 4;

	/**
	 * The number of structural features of the '<em>Adapt With Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPT_WITH_BINDING_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link genericity.gcomponent.instantiation.impl.TemplateSpecificDataImpl <em>Template Specific Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.gcomponent.instantiation.impl.TemplateSpecificDataImpl
	 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getTemplateSpecificData()
	 * @generated
	 */
	int TEMPLATE_SPECIFIC_DATA = 4;

	/**
	 * The number of structural features of the '<em>Template Specific Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFIC_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericity.gcomponent.instantiation.impl.AtlTemplateDataImpl <em>Atl Template Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.gcomponent.instantiation.impl.AtlTemplateDataImpl
	 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getAtlTemplateData()
	 * @generated
	 */
	int ATL_TEMPLATE_DATA = 5;

	/**
	 * The feature id for the '<em><b>Atl Declared Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TEMPLATE_DATA__ATL_DECLARED_METAMODEL_NAME = TEMPLATE_SPECIFIC_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atl Template Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TEMPLATE_DATA_FEATURE_COUNT = TEMPLATE_SPECIFIC_DATA_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link genericity.gcomponent.instantiation.ComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instantiation</em>'.
	 * @see genericity.gcomponent.instantiation.ComponentInstantiation
	 * @generated
	 */
	EClass getComponentInstantiation();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.gcomponent.instantiation.ComponentInstantiation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see genericity.gcomponent.instantiation.ComponentInstantiation#getTransformation()
	 * @see #getComponentInstantiation()
	 * @generated
	 */
	EReference getComponentInstantiation_Transformation();

	/**
	 * Returns the meta object for class '{@link genericity.gcomponent.instantiation.ExecutableTransformation <em>Executable Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Transformation</em>'.
	 * @see genericity.gcomponent.instantiation.ExecutableTransformation
	 * @generated
	 */
	EClass getExecutableTransformation();

	/**
	 * Returns the meta object for class '{@link genericity.gcomponent.instantiation.AdaptedTransformation <em>Adapted Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapted Transformation</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptedTransformation
	 * @generated
	 */
	EClass getAdaptedTransformation();

	/**
	 * Returns the meta object for the reference '{@link genericity.gcomponent.instantiation.AdaptedTransformation#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptedTransformation#getTemplate()
	 * @see #getAdaptedTransformation()
	 * @generated
	 */
	EReference getAdaptedTransformation_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.gcomponent.instantiation.AdaptedTransformation#getRequiredAdaptations <em>Required Adaptations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Adaptations</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptedTransformation#getRequiredAdaptations()
	 * @see #getAdaptedTransformation()
	 * @generated
	 */
	EReference getAdaptedTransformation_RequiredAdaptations();

	/**
	 * Returns the meta object for class '{@link genericity.gcomponent.instantiation.AdaptWithBinding <em>Adapt With Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapt With Binding</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptWithBinding
	 * @generated
	 */
	EClass getAdaptWithBinding();

	/**
	 * Returns the meta object for the attribute '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getParameterIndex <em>Parameter Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Index</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptWithBinding#getParameterIndex()
	 * @see #getAdaptWithBinding()
	 * @generated
	 */
	EAttribute getAdaptWithBinding_ParameterIndex();

	/**
	 * Returns the meta object for the reference '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getConcreteModel <em>Concrete Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concrete Model</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptWithBinding#getConcreteModel()
	 * @see #getAdaptWithBinding()
	 * @generated
	 */
	EReference getAdaptWithBinding_ConcreteModel();

	/**
	 * Returns the meta object for the reference '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getConceptModel <em>Concept Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Model</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptWithBinding#getConceptModel()
	 * @see #getAdaptWithBinding()
	 * @generated
	 */
	EReference getAdaptWithBinding_ConceptModel();

	/**
	 * Returns the meta object for the reference '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getAppliedBinding <em>Applied Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applied Binding</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptWithBinding#getAppliedBinding()
	 * @see #getAdaptWithBinding()
	 * @generated
	 */
	EReference getAdaptWithBinding_AppliedBinding();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.gcomponent.instantiation.AdaptWithBinding#getTemplateData <em>Template Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Data</em>'.
	 * @see genericity.gcomponent.instantiation.AdaptWithBinding#getTemplateData()
	 * @see #getAdaptWithBinding()
	 * @generated
	 */
	EReference getAdaptWithBinding_TemplateData();

	/**
	 * Returns the meta object for class '{@link genericity.gcomponent.instantiation.TemplateSpecificData <em>Template Specific Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Specific Data</em>'.
	 * @see genericity.gcomponent.instantiation.TemplateSpecificData
	 * @generated
	 */
	EClass getTemplateSpecificData();

	/**
	 * Returns the meta object for class '{@link genericity.gcomponent.instantiation.AtlTemplateData <em>Atl Template Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atl Template Data</em>'.
	 * @see genericity.gcomponent.instantiation.AtlTemplateData
	 * @generated
	 */
	EClass getAtlTemplateData();

	/**
	 * Returns the meta object for the attribute '{@link genericity.gcomponent.instantiation.AtlTemplateData#getAtlDeclaredMetamodelName <em>Atl Declared Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atl Declared Metamodel Name</em>'.
	 * @see genericity.gcomponent.instantiation.AtlTemplateData#getAtlDeclaredMetamodelName()
	 * @see #getAtlTemplateData()
	 * @generated
	 */
	EAttribute getAtlTemplateData_AtlDeclaredMetamodelName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentInstantiationFactory getComponentInstantiationFactory();

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
		 * The meta object literal for the '{@link genericity.gcomponent.instantiation.impl.ComponentInstantiationImpl <em>Component Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationImpl
		 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getComponentInstantiation()
		 * @generated
		 */
		EClass COMPONENT_INSTANTIATION = eINSTANCE.getComponentInstantiation();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANTIATION__TRANSFORMATION = eINSTANCE.getComponentInstantiation_Transformation();

		/**
		 * The meta object literal for the '{@link genericity.gcomponent.instantiation.impl.ExecutableTransformationImpl <em>Executable Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.gcomponent.instantiation.impl.ExecutableTransformationImpl
		 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getExecutableTransformation()
		 * @generated
		 */
		EClass EXECUTABLE_TRANSFORMATION = eINSTANCE.getExecutableTransformation();

		/**
		 * The meta object literal for the '{@link genericity.gcomponent.instantiation.impl.AdaptedTransformationImpl <em>Adapted Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.gcomponent.instantiation.impl.AdaptedTransformationImpl
		 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getAdaptedTransformation()
		 * @generated
		 */
		EClass ADAPTED_TRANSFORMATION = eINSTANCE.getAdaptedTransformation();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTED_TRANSFORMATION__TEMPLATE = eINSTANCE.getAdaptedTransformation_Template();

		/**
		 * The meta object literal for the '<em><b>Required Adaptations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTED_TRANSFORMATION__REQUIRED_ADAPTATIONS = eINSTANCE.getAdaptedTransformation_RequiredAdaptations();

		/**
		 * The meta object literal for the '{@link genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl <em>Adapt With Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.gcomponent.instantiation.impl.AdaptWithBindingImpl
		 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getAdaptWithBinding()
		 * @generated
		 */
		EClass ADAPT_WITH_BINDING = eINSTANCE.getAdaptWithBinding();

		/**
		 * The meta object literal for the '<em><b>Parameter Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPT_WITH_BINDING__PARAMETER_INDEX = eINSTANCE.getAdaptWithBinding_ParameterIndex();

		/**
		 * The meta object literal for the '<em><b>Concrete Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPT_WITH_BINDING__CONCRETE_MODEL = eINSTANCE.getAdaptWithBinding_ConcreteModel();

		/**
		 * The meta object literal for the '<em><b>Concept Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPT_WITH_BINDING__CONCEPT_MODEL = eINSTANCE.getAdaptWithBinding_ConceptModel();

		/**
		 * The meta object literal for the '<em><b>Applied Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPT_WITH_BINDING__APPLIED_BINDING = eINSTANCE.getAdaptWithBinding_AppliedBinding();

		/**
		 * The meta object literal for the '<em><b>Template Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPT_WITH_BINDING__TEMPLATE_DATA = eINSTANCE.getAdaptWithBinding_TemplateData();

		/**
		 * The meta object literal for the '{@link genericity.gcomponent.instantiation.impl.TemplateSpecificDataImpl <em>Template Specific Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.gcomponent.instantiation.impl.TemplateSpecificDataImpl
		 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getTemplateSpecificData()
		 * @generated
		 */
		EClass TEMPLATE_SPECIFIC_DATA = eINSTANCE.getTemplateSpecificData();

		/**
		 * The meta object literal for the '{@link genericity.gcomponent.instantiation.impl.AtlTemplateDataImpl <em>Atl Template Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.gcomponent.instantiation.impl.AtlTemplateDataImpl
		 * @see genericity.gcomponent.instantiation.impl.ComponentInstantiationPackageImpl#getAtlTemplateData()
		 * @generated
		 */
		EClass ATL_TEMPLATE_DATA = eINSTANCE.getAtlTemplateData();

		/**
		 * The meta object literal for the '<em><b>Atl Declared Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATL_TEMPLATE_DATA__ATL_DECLARED_METAMODEL_NAME = eINSTANCE.getAtlTemplateData_AtlDeclaredMetamodelName();

	}

} //ComponentInstantiationPackage

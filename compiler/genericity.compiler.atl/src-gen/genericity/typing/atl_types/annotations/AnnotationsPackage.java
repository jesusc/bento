/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

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
 * @see genericity.typing.atl_types.annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/types/atl/annotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl_types_annotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsPackage eINSTANCE = genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.AtlAnnotationImpl <em>Atl Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.AtlAnnotationImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getAtlAnnotation()
	 * @generated
	 */
	int ATL_ANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>Atl Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.HelperAnnotationImpl <em>Helper Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.HelperAnnotationImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getHelperAnnotation()
	 * @generated
	 */
	int HELPER_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANNOTATION__HELPER = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANNOTATION__NAME = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANNOTATION__TYPE = ATL_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Helper Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_ANNOTATION_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.BindingAnnotationImpl <em>Binding Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.BindingAnnotationImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getBindingAnnotation()
	 * @generated
	 */
	int BINDING_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANNOTATION__RULE = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANNOTATION__BINDING = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANNOTATION__NAME = ATL_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANNOTATION__SOURCE_TYPE = ATL_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANNOTATION__TARGET_TYPE = ATL_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binding Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ANNOTATION_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl <em>Expression Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl
	 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getExpressionAnnotation()
	 * @generated
	 */
	int EXPRESSION_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ANNOTATION__EXPR = ATL_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ANNOTATION__TYPE = ATL_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ANNOTATION_FEATURE_COUNT = ATL_ANNOTATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.AtlAnnotation <em>Atl Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atl Annotation</em>'.
	 * @see genericity.typing.atl_types.annotations.AtlAnnotation
	 * @generated
	 */
	EClass getAtlAnnotation();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.HelperAnnotation <em>Helper Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Annotation</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnnotation
	 * @generated
	 */
	EClass getHelperAnnotation();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.HelperAnnotation#getHelper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Helper</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnnotation#getHelper()
	 * @see #getHelperAnnotation()
	 * @generated
	 */
	EReference getHelperAnnotation_Helper();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.annotations.HelperAnnotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnnotation#getName()
	 * @see #getHelperAnnotation()
	 * @generated
	 */
	EAttribute getHelperAnnotation_Name();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.HelperAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see genericity.typing.atl_types.annotations.HelperAnnotation#getType()
	 * @see #getHelperAnnotation()
	 * @generated
	 */
	EReference getHelperAnnotation_Type();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.BindingAnnotation <em>Binding Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Annotation</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnnotation
	 * @generated
	 */
	EClass getBindingAnnotation();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnnotation#getRule()
	 * @see #getBindingAnnotation()
	 * @generated
	 */
	EReference getBindingAnnotation_Rule();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnnotation#getBinding()
	 * @see #getBindingAnnotation()
	 * @generated
	 */
	EReference getBindingAnnotation_Binding();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnnotation#getName()
	 * @see #getBindingAnnotation()
	 * @generated
	 */
	EAttribute getBindingAnnotation_Name();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnnotation#getSourceType()
	 * @see #getBindingAnnotation()
	 * @generated
	 */
	EReference getBindingAnnotation_SourceType();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.BindingAnnotation#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see genericity.typing.atl_types.annotations.BindingAnnotation#getTargetType()
	 * @see #getBindingAnnotation()
	 * @generated
	 */
	EReference getBindingAnnotation_TargetType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation <em>Expression Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Annotation</em>'.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation
	 * @generated
	 */
	EClass getExpressionAnnotation();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expr</em>'.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation#getExpr()
	 * @see #getExpressionAnnotation()
	 * @generated
	 */
	EReference getExpressionAnnotation_Expr();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.annotations.ExpressionAnnotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see genericity.typing.atl_types.annotations.ExpressionAnnotation#getType()
	 * @see #getExpressionAnnotation()
	 * @generated
	 */
	EReference getExpressionAnnotation_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotationsFactory getAnnotationsFactory();

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
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.AtlAnnotationImpl <em>Atl Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.AtlAnnotationImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getAtlAnnotation()
		 * @generated
		 */
		EClass ATL_ANNOTATION = eINSTANCE.getAtlAnnotation();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.HelperAnnotationImpl <em>Helper Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.HelperAnnotationImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getHelperAnnotation()
		 * @generated
		 */
		EClass HELPER_ANNOTATION = eINSTANCE.getHelperAnnotation();

		/**
		 * The meta object literal for the '<em><b>Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_ANNOTATION__HELPER = eINSTANCE.getHelperAnnotation_Helper();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_ANNOTATION__NAME = eINSTANCE.getHelperAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_ANNOTATION__TYPE = eINSTANCE.getHelperAnnotation_Type();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.BindingAnnotationImpl <em>Binding Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.BindingAnnotationImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getBindingAnnotation()
		 * @generated
		 */
		EClass BINDING_ANNOTATION = eINSTANCE.getBindingAnnotation();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANNOTATION__RULE = eINSTANCE.getBindingAnnotation_Rule();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANNOTATION__BINDING = eINSTANCE.getBindingAnnotation_Binding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_ANNOTATION__NAME = eINSTANCE.getBindingAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANNOTATION__SOURCE_TYPE = eINSTANCE.getBindingAnnotation_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ANNOTATION__TARGET_TYPE = eINSTANCE.getBindingAnnotation_TargetType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl <em>Expression Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl
		 * @see genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl#getExpressionAnnotation()
		 * @generated
		 */
		EClass EXPRESSION_ANNOTATION = eINSTANCE.getExpressionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ANNOTATION__EXPR = eINSTANCE.getExpressionAnnotation_Expr();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ANNOTATION__TYPE = eINSTANCE.getExpressionAnnotation_Type();

	}

} //AnnotationsPackage

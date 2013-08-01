/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage
 * @generated
 */
public interface AnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotationsFactory eINSTANCE = genericity.typing.atl_types.annotations.impl.AnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Helper Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Helper Annotation</em>'.
	 * @generated
	 */
	HelperAnnotation createHelperAnnotation();

	/**
	 * Returns a new object of class '<em>Binding Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Annotation</em>'.
	 * @generated
	 */
	BindingAnnotation createBindingAnnotation();

	/**
	 * Returns a new object of class '<em>Expression Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Annotation</em>'.
	 * @generated
	 */
	ExpressionAnnotation createExpressionAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnotationsPackage getAnnotationsPackage();

} //AnnotationsFactory

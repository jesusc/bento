/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage
 * @generated
 */
public interface ComponentInstantiationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInstantiationFactory eINSTANCE = genericity.gcomponent.instantiation.impl.ComponentInstantiationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instantiation</em>'.
	 * @generated
	 */
	ComponentInstantiation createComponentInstantiation();

	/**
	 * Returns a new object of class '<em>Adapted Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapted Transformation</em>'.
	 * @generated
	 */
	AdaptedTransformation createAdaptedTransformation();

	/**
	 * Returns a new object of class '<em>Adapt With Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapt With Binding</em>'.
	 * @generated
	 */
	AdaptWithBinding createAdaptWithBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentInstantiationPackage getComponentInstantiationPackage();

} //ComponentInstantiationFactory

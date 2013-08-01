/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.variants;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see genericity.language.gcomponent.variants.VariantsPackage
 * @generated
 */
public interface VariantsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariantsFactory eINSTANCE = genericity.language.gcomponent.variants.impl.VariantsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Feature</em>'.
	 * @generated
	 */
	SingleFeature createSingleFeature();

	/**
	 * Returns a new object of class '<em>Xor Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor Feature</em>'.
	 * @generated
	 */
	XorFeature createXorFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariantsPackage getVariantsPackage();

} //VariantsFactory

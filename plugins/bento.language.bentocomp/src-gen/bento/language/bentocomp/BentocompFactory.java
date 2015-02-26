/**
 */
package bento.language.bentocomp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bento.language.bentocomp.BentocompPackage
 * @generated
 */
public interface BentocompFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BentocompFactory eINSTANCE = bento.language.bentocomp.impl.BentocompFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dummy Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy Class</em>'.
	 * @generated
	 */
	DummyClass createDummyClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BentocompPackage getBentocompPackage();

} //BentocompFactory

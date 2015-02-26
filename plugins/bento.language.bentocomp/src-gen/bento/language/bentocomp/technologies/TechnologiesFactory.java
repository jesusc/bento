/**
 */
package bento.language.bentocomp.technologies;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bento.language.bentocomp.technologies.TechnologiesPackage
 * @generated
 */
public interface TechnologiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TechnologiesFactory eINSTANCE = bento.language.bentocomp.technologies.impl.TechnologiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atl Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atl Template</em>'.
	 * @generated
	 */
	AtlTemplate createAtlTemplate();

	/**
	 * Returns a new object of class '<em>Atl Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atl Parameter</em>'.
	 * @generated
	 */
	AtlParameter createAtlParameter();

	/**
	 * Returns a new object of class '<em>Java Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Template</em>'.
	 * @generated
	 */
	JavaTemplate createJavaTemplate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TechnologiesPackage getTechnologiesPackage();

} //TechnologiesFactory

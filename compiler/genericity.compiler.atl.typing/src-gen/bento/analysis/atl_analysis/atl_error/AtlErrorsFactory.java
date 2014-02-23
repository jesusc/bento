/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage
 * @generated
 */
public interface AtlErrorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlErrorsFactory eINSTANCE = bento.analysis.atl_analysis.atl_error.impl.AtlErrorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Collection Operation Over No Collection Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Operation Over No Collection Error</em>'.
	 * @generated
	 */
	CollectionOperationOverNoCollectionError createCollectionOperationOverNoCollectionError();

	/**
	 * Returns a new object of class '<em>Feature Not Found</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Not Found</em>'.
	 * @generated
	 */
	FeatureNotFound createFeatureNotFound();

	/**
	 * Returns a new object of class '<em>Invalid Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Operand</em>'.
	 * @generated
	 */
	InvalidOperand createInvalidOperand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtlErrorsPackage getAtlErrorsPackage();

} //AtlErrorsFactory

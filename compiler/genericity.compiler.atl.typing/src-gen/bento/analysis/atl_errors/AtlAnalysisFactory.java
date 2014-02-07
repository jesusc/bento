/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_errors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bento.analysis.atl_errors.AtlAnalysisPackage
 * @generated
 */
public interface AtlAnalysisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlAnalysisFactory eINSTANCE = bento.analysis.atl_errors.impl.AtlAnalysisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analysis Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Result</em>'.
	 * @generated
	 */
	AnalysisResult createAnalysisResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtlAnalysisPackage getAtlAnalysisPackage();

} //AtlAnalysisFactory

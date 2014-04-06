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
	 * Returns a new object of class '<em>Operation Not Found</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Not Found</em>'.
	 * @generated
	 */
	OperationNotFound createOperationNotFound();

	/**
	 * Returns a new object of class '<em>Feature Not Found In Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Not Found In Union Type</em>'.
	 * @generated
	 */
	FeatureNotFoundInUnionType createFeatureNotFoundInUnionType();

	/**
	 * Returns a new object of class '<em>Invalid Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Operand</em>'.
	 * @generated
	 */
	InvalidOperand createInvalidOperand();

	/**
	 * Returns a new object of class '<em>No Container For Ref Immediate Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Container For Ref Immediate Composite</em>'.
	 * @generated
	 */
	NoContainerForRefImmediateComposite createNoContainerForRefImmediateComposite();

	/**
	 * Returns a new object of class '<em>Different Branch Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Different Branch Types</em>'.
	 * @generated
	 */
	DifferentBranchTypes createDifferentBranchTypes();

	/**
	 * Returns a new object of class '<em>No Binding For Compulsory Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Binding For Compulsory Feature</em>'.
	 * @generated
	 */
	NoBindingForCompulsoryFeature createNoBindingForCompulsoryFeature();

	/**
	 * Returns a new object of class '<em>Binding Expected One Assigned Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Expected One Assigned Many</em>'.
	 * @generated
	 */
	BindingExpectedOneAssignedMany createBindingExpectedOneAssignedMany();

	/**
	 * Returns a new object of class '<em>Flatten Over Non Nested Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flatten Over Non Nested Collection</em>'.
	 * @generated
	 */
	FlattenOverNonNestedCollection createFlattenOverNonNestedCollection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtlErrorsPackage getAtlErrorsPackage();

} //AtlErrorsFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gbind.dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslFactory eINSTANCE = gbind.dsl.impl.DslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Binding Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Model</em>'.
	 * @generated
	 */
	BindingModel createBindingModel();

	/**
	 * Returns a new object of class '<em>Metamodel Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Declaration</em>'.
	 * @generated
	 */
	MetamodelDeclaration createMetamodelDeclaration();

	/**
	 * Returns a new object of class '<em>Concept Metaclass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Metaclass</em>'.
	 * @generated
	 */
	ConceptMetaclass createConceptMetaclass();

	/**
	 * Returns a new object of class '<em>Concrete Metaclass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Metaclass</em>'.
	 * @generated
	 */
	ConcreteMetaclass createConcreteMetaclass();

	/**
	 * Returns a new object of class '<em>Class Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Binding</em>'.
	 * @generated
	 */
	ClassBinding createClassBinding();

	/**
	 * Returns a new object of class '<em>Intermediate Class Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Class Binding</em>'.
	 * @generated
	 */
	IntermediateClassBinding createIntermediateClassBinding();

	/**
	 * Returns a new object of class '<em>Base Feature Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Feature Binding</em>'.
	 * @generated
	 */
	BaseFeatureBinding createBaseFeatureBinding();

	/**
	 * Returns a new object of class '<em>Renaming Feature Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Renaming Feature Binding</em>'.
	 * @generated
	 */
	RenamingFeatureBinding createRenamingFeatureBinding();

	/**
	 * Returns a new object of class '<em>Ocl Feature Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocl Feature Binding</em>'.
	 * @generated
	 */
	OclFeatureBinding createOclFeatureBinding();

	/**
	 * Returns a new object of class '<em>Base Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Helper</em>'.
	 * @generated
	 */
	BaseHelper createBaseHelper();

	/**
	 * Returns a new object of class '<em>Concept Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Helper</em>'.
	 * @generated
	 */
	ConceptHelper createConceptHelper();

	/**
	 * Returns a new object of class '<em>Local Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Helper</em>'.
	 * @generated
	 */
	LocalHelper createLocalHelper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DslPackage getDslPackage();

} //DslFactory

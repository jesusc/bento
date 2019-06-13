/**
 */
package scenes_bdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see scenes_bdsl.Scenes_bdslPackage
 * @generated
 */
public interface Scenes_bdslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Scenes_bdslFactory eINSTANCE = scenes_bdsl.impl.Scenes_bdslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History</em>'.
	 * @generated
	 */
	History createHistory();

	/**
	 * Returns a new object of class '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene</em>'.
	 * @generated
	 */
	Scene createScene();

	/**
	 * Returns a new object of class '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character</em>'.
	 * @generated
	 */
	Character createCharacter();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>name Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Scene</em>'.
	 * @generated
	 */
	nameScene createnameScene();

	/**
	 * Returns a new object of class '<em>name Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Character</em>'.
	 * @generated
	 */
	nameCharacter createnameCharacter();

	/**
	 * Returns a new object of class '<em>name Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Place</em>'.
	 * @generated
	 */
	namePlace createnamePlace();

	/**
	 * Returns a new object of class '<em>name Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Action</em>'.
	 * @generated
	 */
	nameAction createnameAction();

	/**
	 * Returns a new object of class '<em>type Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>type Action</em>'.
	 * @generated
	 */
	typeAction createtypeAction();

	/**
	 * Returns a new object of class '<em>text Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>text Comment</em>'.
	 * @generated
	 */
	textComment createtextComment();

	/**
	 * Returns a new object of class '<em>Metamodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Element</em>'.
	 * @generated
	 */
	MetamodelElement createMetamodelElement();

	/**
	 * Returns a new object of class '<em>Intemediate Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intemediate Element</em>'.
	 * @generated
	 */
	IntemediateElement createIntemediateElement();

	/**
	 * Returns a new object of class '<em>Metamodel Element Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Element Feature</em>'.
	 * @generated
	 */
	MetamodelElementFeature createMetamodelElementFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Scenes_bdslPackage getScenes_bdslPackage();

} //Scenes_bdslFactory

/**
 */
package scenes_bdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scenes_bdsl.Scenes_bdslFactory
 * @model kind="package"
 * @generated
 */
public interface Scenes_bdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenes_bdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "wakame.scene_bdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wakame.scene_bdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Scenes_bdslPackage eINSTANCE = scenes_bdsl.impl.Scenes_bdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.HistoryImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 0;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__SCENES = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__CONTAINS_METAMODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__CONTAINS_INTERMEDIATE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Contains Feature Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__CONTAINS_FEATURE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE = 5;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.NamedElementImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.SceneImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NEXT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containsname Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__CONTAINSNAME_SCENE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.ElementImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.CharacterImpl <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.CharacterImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Containsname Character</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__CONTAINSNAME_CHARACTER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.PlaceImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Containsname Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__CONTAINSNAME_PLACE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.ActionImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Characters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CHARACTERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containsname Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINSNAME_ACTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containstype Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINSTYPE_ACTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.BindingElementImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getBindingElement()
	 * @generated
	 */
	int BINDING_ELEMENT = 14;

	/**
	 * The number of structural features of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.CommentImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containstext Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTAINSTEXT_COMMENT = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.FeatureClassImpl <em>Feature Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.FeatureClassImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getFeatureClass()
	 * @generated
	 */
	int FEATURE_CLASS = 18;

	/**
	 * The number of structural features of the '<em>Feature Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Feature Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.nameSceneImpl <em>name Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.nameSceneImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getnameScene()
	 * @generated
	 */
	int NAME_SCENE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SCENE__VALUE = FEATURE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SCENE_FEATURE_COUNT = FEATURE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SCENE_OPERATION_COUNT = FEATURE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.nameCharacterImpl <em>name Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.nameCharacterImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getnameCharacter()
	 * @generated
	 */
	int NAME_CHARACTER = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CHARACTER__VALUE = FEATURE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CHARACTER_FEATURE_COUNT = FEATURE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CHARACTER_OPERATION_COUNT = FEATURE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.namePlaceImpl <em>name Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.namePlaceImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getnamePlace()
	 * @generated
	 */
	int NAME_PLACE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PLACE__VALUE = FEATURE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PLACE_FEATURE_COUNT = FEATURE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PLACE_OPERATION_COUNT = FEATURE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.nameActionImpl <em>name Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.nameActionImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getnameAction()
	 * @generated
	 */
	int NAME_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ACTION__VALUE = FEATURE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ACTION_FEATURE_COUNT = FEATURE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ACTION_OPERATION_COUNT = FEATURE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.typeActionImpl <em>type Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.typeActionImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#gettypeAction()
	 * @generated
	 */
	int TYPE_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACTION__VALUE = FEATURE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>type Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACTION_FEATURE_COUNT = FEATURE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>type Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACTION_OPERATION_COUNT = FEATURE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.textCommentImpl <em>text Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.textCommentImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#gettextComment()
	 * @generated
	 */
	int TEXT_COMMENT = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMMENT__VALUE = FEATURE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>text Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMMENT_FEATURE_COUNT = FEATURE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>text Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMMENT_OPERATION_COUNT = FEATURE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.MetamodelElementImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getMetamodelElement()
	 * @generated
	 */
	int METAMODEL_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.IntemediateElementImpl <em>Intemediate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.IntemediateElementImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getIntemediateElement()
	 * @generated
	 */
	int INTEMEDIATE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Binding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEMEDIATE_ELEMENT__BINDING_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Metamod Elelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Intemediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEMEDIATE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intemediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEMEDIATE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.impl.MetamodelElementFeatureImpl
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getMetamodelElementFeature()
	 * @generated
	 */
	int METAMODEL_ELEMENT_FEATURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Feature Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Element Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Element Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scenes_bdsl.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scenes_bdsl.ActionType
	 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link scenes_bdsl.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see scenes_bdsl.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link scenes_bdsl.History#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see scenes_bdsl.History#getScenes()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Scenes();

	/**
	 * Returns the meta object for the containment reference list '{@link scenes_bdsl.History#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see scenes_bdsl.History#getElements()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link scenes_bdsl.History#getContainsMetamodelElement <em>Contains Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element</em>'.
	 * @see scenes_bdsl.History#getContainsMetamodelElement()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_ContainsMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link scenes_bdsl.History#getContainsIntermediateElement <em>Contains Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Intermediate Element</em>'.
	 * @see scenes_bdsl.History#getContainsIntermediateElement()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_ContainsIntermediateElement();

	/**
	 * Returns the meta object for the containment reference list '{@link scenes_bdsl.History#getContainsFeatureClass <em>Contains Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Feature Class</em>'.
	 * @see scenes_bdsl.History#getContainsFeatureClass()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_ContainsFeatureClass();

	/**
	 * Returns the meta object for the containment reference list '{@link scenes_bdsl.History#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element Feature</em>'.
	 * @see scenes_bdsl.History#getContainsMetamodelElementFeature()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_ContainsMetamodelElementFeature();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see scenes_bdsl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenes_bdsl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see scenes_bdsl.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the reference list '{@link scenes_bdsl.Scene#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see scenes_bdsl.Scene#getElements()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Elements();

	/**
	 * Returns the meta object for the reference '{@link scenes_bdsl.Scene#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see scenes_bdsl.Scene#getNext()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link scenes_bdsl.Scene#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see scenes_bdsl.Scene#getActions()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link scenes_bdsl.Scene#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see scenes_bdsl.Scene#getDescription()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Description();

	/**
	 * Returns the meta object for the containment reference '{@link scenes_bdsl.Scene#getContainsnameScene <em>Containsname Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containsname Scene</em>'.
	 * @see scenes_bdsl.Scene#getContainsnameScene()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_ContainsnameScene();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see scenes_bdsl.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for the containment reference '{@link scenes_bdsl.Character#getContainsnameCharacter <em>Containsname Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containsname Character</em>'.
	 * @see scenes_bdsl.Character#getContainsnameCharacter()
	 * @see #getCharacter()
	 * @generated
	 */
	EReference getCharacter_ContainsnameCharacter();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see scenes_bdsl.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link scenes_bdsl.Place#getContainsnamePlace <em>Containsname Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containsname Place</em>'.
	 * @see scenes_bdsl.Place#getContainsnamePlace()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_ContainsnamePlace();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see scenes_bdsl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference list '{@link scenes_bdsl.Action#getCharacters <em>Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Characters</em>'.
	 * @see scenes_bdsl.Action#getCharacters()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Characters();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scenes_bdsl.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for the containment reference '{@link scenes_bdsl.Action#getContainsnameAction <em>Containsname Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containsname Action</em>'.
	 * @see scenes_bdsl.Action#getContainsnameAction()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ContainsnameAction();

	/**
	 * Returns the meta object for the containment reference '{@link scenes_bdsl.Action#getContainstypeAction <em>Containstype Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containstype Action</em>'.
	 * @see scenes_bdsl.Action#getContainstypeAction()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ContainstypeAction();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see scenes_bdsl.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see scenes_bdsl.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see scenes_bdsl.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the meta object for the containment reference '{@link scenes_bdsl.Comment#getContainstextComment <em>Containstext Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containstext Comment</em>'.
	 * @see scenes_bdsl.Comment#getContainstextComment()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_ContainstextComment();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.nameScene <em>name Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Scene</em>'.
	 * @see scenes_bdsl.nameScene
	 * @generated
	 */
	EClass getnameScene();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.nameScene#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scenes_bdsl.nameScene#getValue()
	 * @see #getnameScene()
	 * @generated
	 */
	EAttribute getnameScene_Value();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.nameCharacter <em>name Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Character</em>'.
	 * @see scenes_bdsl.nameCharacter
	 * @generated
	 */
	EClass getnameCharacter();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.nameCharacter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scenes_bdsl.nameCharacter#getValue()
	 * @see #getnameCharacter()
	 * @generated
	 */
	EAttribute getnameCharacter_Value();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.namePlace <em>name Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Place</em>'.
	 * @see scenes_bdsl.namePlace
	 * @generated
	 */
	EClass getnamePlace();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.namePlace#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scenes_bdsl.namePlace#getValue()
	 * @see #getnamePlace()
	 * @generated
	 */
	EAttribute getnamePlace_Value();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.nameAction <em>name Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Action</em>'.
	 * @see scenes_bdsl.nameAction
	 * @generated
	 */
	EClass getnameAction();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.nameAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scenes_bdsl.nameAction#getValue()
	 * @see #getnameAction()
	 * @generated
	 */
	EAttribute getnameAction_Value();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.typeAction <em>type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>type Action</em>'.
	 * @see scenes_bdsl.typeAction
	 * @generated
	 */
	EClass gettypeAction();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.typeAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scenes_bdsl.typeAction#getValue()
	 * @see #gettypeAction()
	 * @generated
	 */
	EAttribute gettypeAction_Value();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.textComment <em>text Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>text Comment</em>'.
	 * @see scenes_bdsl.textComment
	 * @generated
	 */
	EClass gettextComment();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.textComment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scenes_bdsl.textComment#getValue()
	 * @see #gettextComment()
	 * @generated
	 */
	EAttribute gettextComment_Value();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Element</em>'.
	 * @see scenes_bdsl.BindingElement
	 * @generated
	 */
	EClass getBindingElement();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element</em>'.
	 * @see scenes_bdsl.MetamodelElement
	 * @generated
	 */
	EClass getMetamodelElement();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.MetamodelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenes_bdsl.MetamodelElement#getName()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EAttribute getMetamodelElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link scenes_bdsl.MetamodelElement#getMetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel Element Feature</em>'.
	 * @see scenes_bdsl.MetamodelElement#getMetamodelElementFeature()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_MetamodelElementFeature();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.IntemediateElement <em>Intemediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intemediate Element</em>'.
	 * @see scenes_bdsl.IntemediateElement
	 * @generated
	 */
	EClass getIntemediateElement();

	/**
	 * Returns the meta object for the reference '{@link scenes_bdsl.IntemediateElement#getBindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Element</em>'.
	 * @see scenes_bdsl.IntemediateElement#getBindingElement()
	 * @see #getIntemediateElement()
	 * @generated
	 */
	EReference getIntemediateElement_BindingElement();

	/**
	 * Returns the meta object for the reference '{@link scenes_bdsl.IntemediateElement#getMetamodElelement <em>Metamod Elelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamod Elelement</em>'.
	 * @see scenes_bdsl.IntemediateElement#getMetamodElelement()
	 * @see #getIntemediateElement()
	 * @generated
	 */
	EReference getIntemediateElement_MetamodElelement();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element Feature</em>'.
	 * @see scenes_bdsl.MetamodelElementFeature
	 * @generated
	 */
	EClass getMetamodelElementFeature();

	/**
	 * Returns the meta object for the attribute '{@link scenes_bdsl.MetamodelElementFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scenes_bdsl.MetamodelElementFeature#getName()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EAttribute getMetamodelElementFeature_Name();

	/**
	 * Returns the meta object for the reference list '{@link scenes_bdsl.MetamodelElementFeature#getFeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Class</em>'.
	 * @see scenes_bdsl.MetamodelElementFeature#getFeatureClass()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EReference getMetamodelElementFeature_FeatureClass();

	/**
	 * Returns the meta object for class '{@link scenes_bdsl.FeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Class</em>'.
	 * @see scenes_bdsl.FeatureClass
	 * @generated
	 */
	EClass getFeatureClass();

	/**
	 * Returns the meta object for enum '{@link scenes_bdsl.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see scenes_bdsl.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Scenes_bdslFactory getScenes_bdslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.HistoryImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__SCENES = eINSTANCE.getHistory_Scenes();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__ELEMENTS = eINSTANCE.getHistory_Elements();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__CONTAINS_METAMODEL_ELEMENT = eINSTANCE.getHistory_ContainsMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Contains Intermediate Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__CONTAINS_INTERMEDIATE_ELEMENT = eINSTANCE.getHistory_ContainsIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Contains Feature Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__CONTAINS_FEATURE_CLASS = eINSTANCE.getHistory_ContainsFeatureClass();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE = eINSTANCE.getHistory_ContainsMetamodelElementFeature();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.NamedElementImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.SceneImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__ELEMENTS = eINSTANCE.getScene_Elements();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__NEXT = eINSTANCE.getScene_Next();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__ACTIONS = eINSTANCE.getScene_Actions();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__DESCRIPTION = eINSTANCE.getScene_Description();

		/**
		 * The meta object literal for the '<em><b>Containsname Scene</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__CONTAINSNAME_SCENE = eINSTANCE.getScene_ContainsnameScene();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.CharacterImpl <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.CharacterImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em><b>Containsname Character</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER__CONTAINSNAME_CHARACTER = eINSTANCE.getCharacter_ContainsnameCharacter();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.PlaceImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Containsname Place</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__CONTAINSNAME_PLACE = eINSTANCE.getPlace_ContainsnamePlace();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.ActionImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Characters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CHARACTERS = eINSTANCE.getAction_Characters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '<em><b>Containsname Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTAINSNAME_ACTION = eINSTANCE.getAction_ContainsnameAction();

		/**
		 * The meta object literal for the '<em><b>Containstype Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTAINSTYPE_ACTION = eINSTANCE.getAction_ContainstypeAction();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.ElementImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.CommentImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

		/**
		 * The meta object literal for the '<em><b>Containstext Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__CONTAINSTEXT_COMMENT = eINSTANCE.getComment_ContainstextComment();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.nameSceneImpl <em>name Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.nameSceneImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getnameScene()
		 * @generated
		 */
		EClass NAME_SCENE = eINSTANCE.getnameScene();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_SCENE__VALUE = eINSTANCE.getnameScene_Value();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.nameCharacterImpl <em>name Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.nameCharacterImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getnameCharacter()
		 * @generated
		 */
		EClass NAME_CHARACTER = eINSTANCE.getnameCharacter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_CHARACTER__VALUE = eINSTANCE.getnameCharacter_Value();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.namePlaceImpl <em>name Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.namePlaceImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getnamePlace()
		 * @generated
		 */
		EClass NAME_PLACE = eINSTANCE.getnamePlace();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PLACE__VALUE = eINSTANCE.getnamePlace_Value();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.nameActionImpl <em>name Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.nameActionImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getnameAction()
		 * @generated
		 */
		EClass NAME_ACTION = eINSTANCE.getnameAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ACTION__VALUE = eINSTANCE.getnameAction_Value();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.typeActionImpl <em>type Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.typeActionImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#gettypeAction()
		 * @generated
		 */
		EClass TYPE_ACTION = eINSTANCE.gettypeAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ACTION__VALUE = eINSTANCE.gettypeAction_Value();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.textCommentImpl <em>text Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.textCommentImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#gettextComment()
		 * @generated
		 */
		EClass TEXT_COMMENT = eINSTANCE.gettextComment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_COMMENT__VALUE = eINSTANCE.gettextComment_Value();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.BindingElementImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getBindingElement()
		 * @generated
		 */
		EClass BINDING_ELEMENT = eINSTANCE.getBindingElement();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.MetamodelElementImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getMetamodelElement()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT = eINSTANCE.getMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT__NAME = eINSTANCE.getMetamodelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElement_MetamodelElementFeature();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.IntemediateElementImpl <em>Intemediate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.IntemediateElementImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getIntemediateElement()
		 * @generated
		 */
		EClass INTEMEDIATE_ELEMENT = eINSTANCE.getIntemediateElement();

		/**
		 * The meta object literal for the '<em><b>Binding Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEMEDIATE_ELEMENT__BINDING_ELEMENT = eINSTANCE.getIntemediateElement_BindingElement();

		/**
		 * The meta object literal for the '<em><b>Metamod Elelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT = eINSTANCE.getIntemediateElement_MetamodElelement();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.MetamodelElementFeatureImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getMetamodelElementFeature()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_FEATURE__NAME = eINSTANCE.getMetamodelElementFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Feature Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = eINSTANCE.getMetamodelElementFeature_FeatureClass();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.impl.FeatureClassImpl <em>Feature Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.impl.FeatureClassImpl
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getFeatureClass()
		 * @generated
		 */
		EClass FEATURE_CLASS = eINSTANCE.getFeatureClass();

		/**
		 * The meta object literal for the '{@link scenes_bdsl.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scenes_bdsl.ActionType
		 * @see scenes_bdsl.impl.Scenes_bdslPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

	}

} //Scenes_bdslPackage

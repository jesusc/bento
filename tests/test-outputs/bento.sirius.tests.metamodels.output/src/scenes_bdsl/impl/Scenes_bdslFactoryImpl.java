/**
 */
package scenes_bdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import scenes_bdsl.Action;
import scenes_bdsl.ActionType;
import scenes_bdsl.Comment;
import scenes_bdsl.History;
import scenes_bdsl.IntemediateElement;
import scenes_bdsl.MetamodelElement;
import scenes_bdsl.MetamodelElementFeature;
import scenes_bdsl.Place;
import scenes_bdsl.Scene;
import scenes_bdsl.Scenes_bdslFactory;
import scenes_bdsl.Scenes_bdslPackage;
import scenes_bdsl.nameAction;
import scenes_bdsl.nameCharacter;
import scenes_bdsl.namePlace;
import scenes_bdsl.nameScene;
import scenes_bdsl.textComment;
import scenes_bdsl.typeAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Scenes_bdslFactoryImpl extends EFactoryImpl implements Scenes_bdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Scenes_bdslFactory init() {
		try {
			Scenes_bdslFactory theScenes_bdslFactory = (Scenes_bdslFactory)EPackage.Registry.INSTANCE.getEFactory(Scenes_bdslPackage.eNS_URI);
			if (theScenes_bdslFactory != null) {
				return theScenes_bdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Scenes_bdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenes_bdslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Scenes_bdslPackage.HISTORY: return createHistory();
			case Scenes_bdslPackage.SCENE: return createScene();
			case Scenes_bdslPackage.CHARACTER: return createCharacter();
			case Scenes_bdslPackage.PLACE: return createPlace();
			case Scenes_bdslPackage.ACTION: return createAction();
			case Scenes_bdslPackage.COMMENT: return createComment();
			case Scenes_bdslPackage.NAME_SCENE: return createnameScene();
			case Scenes_bdslPackage.NAME_CHARACTER: return createnameCharacter();
			case Scenes_bdslPackage.NAME_PLACE: return createnamePlace();
			case Scenes_bdslPackage.NAME_ACTION: return createnameAction();
			case Scenes_bdslPackage.TYPE_ACTION: return createtypeAction();
			case Scenes_bdslPackage.TEXT_COMMENT: return createtextComment();
			case Scenes_bdslPackage.METAMODEL_ELEMENT: return createMetamodelElement();
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT: return createIntemediateElement();
			case Scenes_bdslPackage.METAMODEL_ELEMENT_FEATURE: return createMetamodelElementFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Scenes_bdslPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Scenes_bdslPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History createHistory() {
		HistoryImpl history = new HistoryImpl();
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene createScene() {
		SceneImpl scene = new SceneImpl();
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scenes_bdsl.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameScene createnameScene() {
		nameSceneImpl nameScene = new nameSceneImpl();
		return nameScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameCharacter createnameCharacter() {
		nameCharacterImpl nameCharacter = new nameCharacterImpl();
		return nameCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public namePlace createnamePlace() {
		namePlaceImpl namePlace = new namePlaceImpl();
		return namePlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameAction createnameAction() {
		nameActionImpl nameAction = new nameActionImpl();
		return nameAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeAction createtypeAction() {
		typeActionImpl typeAction = new typeActionImpl();
		return typeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public textComment createtextComment() {
		textCommentImpl textComment = new textCommentImpl();
		return textComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelElement createMetamodelElement() {
		MetamodelElementImpl metamodelElement = new MetamodelElementImpl();
		return metamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntemediateElement createIntemediateElement() {
		IntemediateElementImpl intemediateElement = new IntemediateElementImpl();
		return intemediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelElementFeature createMetamodelElementFeature() {
		MetamodelElementFeatureImpl metamodelElementFeature = new MetamodelElementFeatureImpl();
		return metamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenes_bdslPackage getScenes_bdslPackage() {
		return (Scenes_bdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Scenes_bdslPackage getPackage() {
		return Scenes_bdslPackage.eINSTANCE;
	}

} //Scenes_bdslFactoryImpl

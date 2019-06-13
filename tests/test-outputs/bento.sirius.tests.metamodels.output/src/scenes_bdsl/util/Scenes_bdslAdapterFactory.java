/**
 */
package scenes_bdsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import scenes_bdsl.Action;
import scenes_bdsl.BindingElement;
import scenes_bdsl.Comment;
import scenes_bdsl.Element;
import scenes_bdsl.FeatureClass;
import scenes_bdsl.History;
import scenes_bdsl.IntemediateElement;
import scenes_bdsl.MetamodelElement;
import scenes_bdsl.MetamodelElementFeature;
import scenes_bdsl.NamedElement;
import scenes_bdsl.Place;
import scenes_bdsl.Scene;
import scenes_bdsl.Scenes_bdslPackage;
import scenes_bdsl.nameAction;
import scenes_bdsl.nameCharacter;
import scenes_bdsl.namePlace;
import scenes_bdsl.nameScene;
import scenes_bdsl.textComment;
import scenes_bdsl.typeAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see scenes_bdsl.Scenes_bdslPackage
 * @generated
 */
public class Scenes_bdslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Scenes_bdslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenes_bdslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Scenes_bdslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Scenes_bdslSwitch<Adapter> modelSwitch =
		new Scenes_bdslSwitch<Adapter>() {
			@Override
			public Adapter caseHistory(History object) {
				return createHistoryAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseScene(Scene object) {
				return createSceneAdapter();
			}
			@Override
			public Adapter caseCharacter(scenes_bdsl.Character object) {
				return createCharacterAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter casenameScene(nameScene object) {
				return createnameSceneAdapter();
			}
			@Override
			public Adapter casenameCharacter(nameCharacter object) {
				return createnameCharacterAdapter();
			}
			@Override
			public Adapter casenamePlace(namePlace object) {
				return createnamePlaceAdapter();
			}
			@Override
			public Adapter casenameAction(nameAction object) {
				return createnameActionAdapter();
			}
			@Override
			public Adapter casetypeAction(typeAction object) {
				return createtypeActionAdapter();
			}
			@Override
			public Adapter casetextComment(textComment object) {
				return createtextCommentAdapter();
			}
			@Override
			public Adapter caseBindingElement(BindingElement object) {
				return createBindingElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElement(MetamodelElement object) {
				return createMetamodelElementAdapter();
			}
			@Override
			public Adapter caseIntemediateElement(IntemediateElement object) {
				return createIntemediateElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElementFeature(MetamodelElementFeature object) {
				return createMetamodelElementFeatureAdapter();
			}
			@Override
			public Adapter caseFeatureClass(FeatureClass object) {
				return createFeatureClassAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.History
	 * @generated
	 */
	public Adapter createHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.Scene
	 * @generated
	 */
	public Adapter createSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.Character
	 * @generated
	 */
	public Adapter createCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.nameScene <em>name Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.nameScene
	 * @generated
	 */
	public Adapter createnameSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.nameCharacter <em>name Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.nameCharacter
	 * @generated
	 */
	public Adapter createnameCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.namePlace <em>name Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.namePlace
	 * @generated
	 */
	public Adapter createnamePlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.nameAction <em>name Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.nameAction
	 * @generated
	 */
	public Adapter createnameActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.typeAction <em>type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.typeAction
	 * @generated
	 */
	public Adapter createtypeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.textComment <em>text Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.textComment
	 * @generated
	 */
	public Adapter createtextCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.BindingElement
	 * @generated
	 */
	public Adapter createBindingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.MetamodelElement
	 * @generated
	 */
	public Adapter createMetamodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.IntemediateElement <em>Intemediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.IntemediateElement
	 * @generated
	 */
	public Adapter createIntemediateElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.MetamodelElementFeature
	 * @generated
	 */
	public Adapter createMetamodelElementFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scenes_bdsl.FeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scenes_bdsl.FeatureClass
	 * @generated
	 */
	public Adapter createFeatureClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Scenes_bdslAdapterFactory

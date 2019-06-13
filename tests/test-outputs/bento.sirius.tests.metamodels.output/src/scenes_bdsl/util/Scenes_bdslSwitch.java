/**
 */
package scenes_bdsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see scenes_bdsl.Scenes_bdslPackage
 * @generated
 */
public class Scenes_bdslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Scenes_bdslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenes_bdslSwitch() {
		if (modelPackage == null) {
			modelPackage = Scenes_bdslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Scenes_bdslPackage.HISTORY: {
				History history = (History)theEObject;
				T result = caseHistory(history);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.SCENE: {
				Scene scene = (Scene)theEObject;
				T result = caseScene(scene);
				if (result == null) result = caseNamedElement(scene);
				if (result == null) result = caseBindingElement(scene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.CHARACTER: {
				scenes_bdsl.Character character = (scenes_bdsl.Character)theEObject;
				T result = caseCharacter(character);
				if (result == null) result = caseElement(character);
				if (result == null) result = caseBindingElement(character);
				if (result == null) result = caseNamedElement(character);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseElement(place);
				if (result == null) result = caseBindingElement(place);
				if (result == null) result = caseNamedElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseBindingElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseNamedElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseBindingElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.NAME_SCENE: {
				nameScene nameScene = (nameScene)theEObject;
				T result = casenameScene(nameScene);
				if (result == null) result = caseFeatureClass(nameScene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.NAME_CHARACTER: {
				nameCharacter nameCharacter = (nameCharacter)theEObject;
				T result = casenameCharacter(nameCharacter);
				if (result == null) result = caseFeatureClass(nameCharacter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.NAME_PLACE: {
				namePlace namePlace = (namePlace)theEObject;
				T result = casenamePlace(namePlace);
				if (result == null) result = caseFeatureClass(namePlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.NAME_ACTION: {
				nameAction nameAction = (nameAction)theEObject;
				T result = casenameAction(nameAction);
				if (result == null) result = caseFeatureClass(nameAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.TYPE_ACTION: {
				typeAction typeAction = (typeAction)theEObject;
				T result = casetypeAction(typeAction);
				if (result == null) result = caseFeatureClass(typeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.TEXT_COMMENT: {
				textComment textComment = (textComment)theEObject;
				T result = casetextComment(textComment);
				if (result == null) result = caseFeatureClass(textComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.BINDING_ELEMENT: {
				BindingElement bindingElement = (BindingElement)theEObject;
				T result = caseBindingElement(bindingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.METAMODEL_ELEMENT: {
				MetamodelElement metamodelElement = (MetamodelElement)theEObject;
				T result = caseMetamodelElement(metamodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT: {
				IntemediateElement intemediateElement = (IntemediateElement)theEObject;
				T result = caseIntemediateElement(intemediateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.METAMODEL_ELEMENT_FEATURE: {
				MetamodelElementFeature metamodelElementFeature = (MetamodelElementFeature)theEObject;
				T result = caseMetamodelElementFeature(metamodelElementFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Scenes_bdslPackage.FEATURE_CLASS: {
				FeatureClass featureClass = (FeatureClass)theEObject;
				T result = caseFeatureClass(featureClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistory(History object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScene(Scene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(scenes_bdsl.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameScene(nameScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameCharacter(nameCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenamePlace(namePlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>name Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>name Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenameAction(nameAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>type Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>type Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetypeAction(typeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>text Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>text Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetextComment(textComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingElement(BindingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElement(MetamodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intemediate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intemediate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntemediateElement(IntemediateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElementFeature(MetamodelElementFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureClass(FeatureClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Scenes_bdslSwitch

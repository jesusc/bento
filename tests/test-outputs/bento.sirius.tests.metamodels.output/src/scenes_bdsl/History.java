/**
 */
package scenes_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.History#getScenes <em>Scenes</em>}</li>
 *   <li>{@link scenes_bdsl.History#getElements <em>Elements</em>}</li>
 *   <li>{@link scenes_bdsl.History#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link scenes_bdsl.History#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link scenes_bdsl.History#getContainsFeatureClass <em>Contains Feature Class</em>}</li>
 *   <li>{@link scenes_bdsl.History#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 * </ul>
 *
 * @see scenes_bdsl.Scenes_bdslPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link scenes_bdsl.Scene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getHistory_Scenes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Scene> getScenes();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link scenes_bdsl.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getHistory_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * The list contents are of type {@link scenes_bdsl.MetamodelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element</em>' containment reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getHistory_ContainsMetamodelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElement> getContainsMetamodelElement();

	/**
	 * Returns the value of the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * The list contents are of type {@link scenes_bdsl.IntemediateElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Intermediate Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Intermediate Element</em>' containment reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getHistory_ContainsIntermediateElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntemediateElement> getContainsIntermediateElement();

	/**
	 * Returns the value of the '<em><b>Contains Feature Class</b></em>' containment reference list.
	 * The list contents are of type {@link scenes_bdsl.FeatureClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Feature Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Feature Class</em>' containment reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getHistory_ContainsFeatureClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureClass> getContainsFeatureClass();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * The list contents are of type {@link scenes_bdsl.FeatureClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element Feature</em>' containment reference list.
	 * @see scenes_bdsl.Scenes_bdslPackage#getHistory_ContainsMetamodelElementFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureClass> getContainsMetamodelElementFeature();

} // History

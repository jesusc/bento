/**
 */
package sequence_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.SequenceModel#getElements <em>Elements</em>}</li>
 *   <li>{@link sequence_bdsl.SequenceModel#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link sequence_bdsl.SequenceModel#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link sequence_bdsl.SequenceModel#getContainsFeatureClass <em>Contains Feature Class</em>}</li>
 *   <li>{@link sequence_bdsl.SequenceModel#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 * </ul>
 *
 * @see sequence_bdsl.Sequence_bdslPackage#getSequenceModel()
 * @model
 * @generated
 */
public interface SequenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link sequence_bdsl.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see sequence_bdsl.Sequence_bdslPackage#getSequenceModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * The list contents are of type {@link sequence_bdsl.MetamodelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element</em>' containment reference list.
	 * @see sequence_bdsl.Sequence_bdslPackage#getSequenceModel_ContainsMetamodelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElement> getContainsMetamodelElement();

	/**
	 * Returns the value of the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * The list contents are of type {@link sequence_bdsl.IntemediateElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Intermediate Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Intermediate Element</em>' containment reference list.
	 * @see sequence_bdsl.Sequence_bdslPackage#getSequenceModel_ContainsIntermediateElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntemediateElement> getContainsIntermediateElement();

	/**
	 * Returns the value of the '<em><b>Contains Feature Class</b></em>' containment reference list.
	 * The list contents are of type {@link sequence_bdsl.FeatureClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Feature Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Feature Class</em>' containment reference list.
	 * @see sequence_bdsl.Sequence_bdslPackage#getSequenceModel_ContainsFeatureClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureClass> getContainsFeatureClass();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * The list contents are of type {@link sequence_bdsl.FeatureClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Metamodel Element Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element Feature</em>' containment reference list.
	 * @see sequence_bdsl.Sequence_bdslPackage#getSequenceModel_ContainsMetamodelElementFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureClass> getContainsMetamodelElementFeature();

} // SequenceModel

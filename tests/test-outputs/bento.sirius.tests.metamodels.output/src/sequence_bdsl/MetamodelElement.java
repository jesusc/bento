/**
 */
package sequence_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.MetamodelElement#getName <em>Name</em>}</li>
 *   <li>{@link sequence_bdsl.MetamodelElement#getMetamodelElementFeature <em>Metamodel Element Feature</em>}</li>
 * </ul>
 *
 * @see sequence_bdsl.Sequence_bdslPackage#getMetamodelElement()
 * @model
 * @generated
 */
public interface MetamodelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sequence_bdsl.Sequence_bdslPackage#getMetamodelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sequence_bdsl.MetamodelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel Element Feature</b></em>' containment reference list.
	 * The list contents are of type {@link sequence_bdsl.MetamodelElementFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Element Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Element Feature</em>' containment reference list.
	 * @see sequence_bdsl.Sequence_bdslPackage#getMetamodelElement_MetamodelElementFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElementFeature> getMetamodelElementFeature();

} // MetamodelElement

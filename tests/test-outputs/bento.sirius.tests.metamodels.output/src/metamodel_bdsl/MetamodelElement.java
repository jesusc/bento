/**
 */
package metamodel_bdsl;

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
 *   <li>{@link metamodel_bdsl.MetamodelElement#getVirtualAttribute <em>Virtual Attribute</em>}</li>
 *   <li>{@link metamodel_bdsl.MetamodelElement#getMetamodelElementFeature <em>Metamodel Element Feature</em>}</li>
 *   <li>{@link metamodel_bdsl.MetamodelElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getMetamodelElement()
 * @model
 * @generated
 */
public interface MetamodelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtual Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.VirtualAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Attribute</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getMetamodelElement_VirtualAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualAttribute> getVirtualAttribute();

	/**
	 * Returns the value of the '<em><b>Metamodel Element Feature</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.MetamodelElementFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Element Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Element Feature</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getMetamodelElement_MetamodelElementFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElementFeature> getMetamodelElementFeature();

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
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getMetamodelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.MetamodelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MetamodelElement

/**
 */
package graph_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Element Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.MetamodelElementFeature#getFeatureClass <em>Feature Class</em>}</li>
 *   <li>{@link graph_bdsl.MetamodelElementFeature#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see graph_bdsl.Graph_bdslPackage#getMetamodelElementFeature()
 * @model
 * @generated
 */
public interface MetamodelElementFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Class</b></em>' reference list.
	 * The list contents are of type {@link graph_bdsl.BindingAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Class</em>' reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getMetamodelElementFeature_FeatureClass()
	 * @model
	 * @generated
	 */
	EList<BindingAttribute> getFeatureClass();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graph_bdsl.Graph_bdslPackage#getMetamodelElementFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graph_bdsl.MetamodelElementFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MetamodelElementFeature

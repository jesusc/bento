/**
 */
package mindstorms_bdsl;

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
 *   <li>{@link mindstorms_bdsl.MetamodelElementFeature#getFeatureClass <em>Feature Class</em>}</li>
 *   <li>{@link mindstorms_bdsl.MetamodelElementFeature#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getMetamodelElementFeature()
 * @model
 * @generated
 */
public interface MetamodelElementFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Class</b></em>' reference list.
	 * The list contents are of type {@link mindstorms_bdsl.BindingAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Class</em>' reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getMetamodelElementFeature_FeatureClass()
	 * @model
	 * @generated
	 */
	EList<BindingAttribute> getFeatureClass();

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
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getMetamodelElementFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.MetamodelElementFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MetamodelElementFeature

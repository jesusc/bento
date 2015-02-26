/**
 */
package bento.language.bentocomp.technologies;

import bento.language.bentocomp.core.Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atl Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.technologies.AtlParameter#getAtlModelName <em>Atl Model Name</em>}</li>
 *   <li>{@link bento.language.bentocomp.technologies.AtlParameter#getAtlMetamodelName <em>Atl Metamodel Name</em>}</li>
 *   <li>{@link bento.language.bentocomp.technologies.AtlParameter#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.technologies.TechnologiesPackage#getAtlParameter()
 * @model
 * @generated
 */
public interface AtlParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Atl Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atl Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atl Model Name</em>' attribute.
	 * @see #setAtlModelName(String)
	 * @see bento.language.bentocomp.technologies.TechnologiesPackage#getAtlParameter_AtlModelName()
	 * @model required="true"
	 * @generated
	 */
	String getAtlModelName();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.technologies.AtlParameter#getAtlModelName <em>Atl Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atl Model Name</em>' attribute.
	 * @see #getAtlModelName()
	 * @generated
	 */
	void setAtlModelName(String value);

	/**
	 * Returns the value of the '<em><b>Atl Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atl Metamodel Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atl Metamodel Name</em>' attribute.
	 * @see #setAtlMetamodelName(String)
	 * @see bento.language.bentocomp.technologies.TechnologiesPackage#getAtlParameter_AtlMetamodelName()
	 * @model
	 * @generated
	 */
	String getAtlMetamodelName();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.technologies.AtlParameter#getAtlMetamodelName <em>Atl Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atl Metamodel Name</em>' attribute.
	 * @see #getAtlMetamodelName()
	 * @generated
	 */
	void setAtlMetamodelName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see bento.language.bentocomp.technologies.TechnologiesPackage#getAtlParameter_Model()
	 * @model
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.technologies.AtlParameter#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // AtlParameter

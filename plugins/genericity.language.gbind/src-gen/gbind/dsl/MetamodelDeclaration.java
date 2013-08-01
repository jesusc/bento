/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import gbind.simpleocl.OclMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.MetamodelDeclaration#getMetamodelURI <em>Metamodel URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getMetamodelDeclaration()
 * @model
 * @generated
 */
public interface MetamodelDeclaration extends OclMetamodel {
	/**
	 * Returns the value of the '<em><b>Metamodel URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel URI</em>' attribute.
	 * @see #setMetamodelURI(String)
	 * @see gbind.dsl.DslPackage#getMetamodelDeclaration_MetamodelURI()
	 * @model
	 * @generated
	 */
	String getMetamodelURI();

	/**
	 * Sets the value of the '{@link gbind.dsl.MetamodelDeclaration#getMetamodelURI <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel URI</em>' attribute.
	 * @see #getMetamodelURI()
	 * @generated
	 */
	void setMetamodelURI(String value);

} // MetamodelDeclaration

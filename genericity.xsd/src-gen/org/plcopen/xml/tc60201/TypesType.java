/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.TypesType#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.TypesType#getPous <em>Pous</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getTypesType()
 * @model extendedMetaData="name='types_._type' kind='elementOnly'"
 * @generated
 */
public interface TypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference.
	 * @see #setDataTypes(DataTypesType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTypesType_DataTypes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypesType getDataTypes();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TypesType#getDataTypes <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Types</em>' containment reference.
	 * @see #getDataTypes()
	 * @generated
	 */
	void setDataTypes(DataTypesType value);

	/**
	 * Returns the value of the '<em><b>Pous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pous</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pous</em>' containment reference.
	 * @see #setPous(PousType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTypesType_Pous()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pous' namespace='##targetNamespace'"
	 * @generated
	 */
	PousType getPous();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TypesType#getPous <em>Pous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pous</em>' containment reference.
	 * @see #getPous()
	 * @generated
	 */
	void setPous(PousType value);

} // TypesType

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.DataTypesType#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataTypesType()
 * @model extendedMetaData="name='dataTypes_._type' kind='elementOnly'"
 * @generated
 */
public interface DataTypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.DataTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataTypesType_DataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataTypeType> getDataType();

} // DataTypesType

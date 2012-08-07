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
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ArrayType#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ArrayType#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getArrayType()
 * @model extendedMetaData="name='array_._type' kind='elementOnly'"
 * @generated
 */
public interface ArrayType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.RangeSigned}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getArrayType_Dimension()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RangeSigned> getDimension();

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' containment reference.
	 * @see #setBaseType(DataType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getArrayType_BaseType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataType getBaseType();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ArrayType#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(DataType value);

} // ArrayType

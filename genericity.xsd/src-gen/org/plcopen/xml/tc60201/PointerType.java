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
 * A representation of the model object '<em><b>Pointer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.PointerType#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getPointerType()
 * @model extendedMetaData="name='pointer_._type' kind='elementOnly'"
 * @generated
 */
public interface PointerType extends EObject {
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
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPointerType_BaseType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataType getBaseType();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.PointerType#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(DataType value);

} // PointerType

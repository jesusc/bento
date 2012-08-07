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
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generic value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.Value#getSimpleValue <em>Simple Value</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Value#getArrayValue <em>Array Value</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.Value#getStructValue <em>Struct Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getValue()
 * @model extendedMetaData="name='value' kind='elementOnly'"
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Value</em>' containment reference.
	 * @see #setSimpleValue(SimpleValueType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getValue_SimpleValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simpleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleValueType getSimpleValue();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Value#getSimpleValue <em>Simple Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Value</em>' containment reference.
	 * @see #getSimpleValue()
	 * @generated
	 */
	void setSimpleValue(SimpleValueType value);

	/**
	 * Returns the value of the '<em><b>Array Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Value</em>' containment reference.
	 * @see #setArrayValue(ArrayValueType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getValue_ArrayValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arrayValue' namespace='##targetNamespace'"
	 * @generated
	 */
	ArrayValueType getArrayValue();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Value#getArrayValue <em>Array Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Value</em>' containment reference.
	 * @see #getArrayValue()
	 * @generated
	 */
	void setArrayValue(ArrayValueType value);

	/**
	 * Returns the value of the '<em><b>Struct Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Value</em>' containment reference.
	 * @see #setStructValue(StructValueType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getValue_StructValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structValue' namespace='##targetNamespace'"
	 * @generated
	 */
	StructValueType getStructValue();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.Value#getStructValue <em>Struct Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct Value</em>' containment reference.
	 * @see #getStructValue()
	 * @generated
	 */
	void setStructValue(StructValueType value);

} // Value

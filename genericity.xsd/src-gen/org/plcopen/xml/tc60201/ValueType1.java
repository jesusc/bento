/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ValueType1#getRepetitionValue <em>Repetition Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getValueType1()
 * @model extendedMetaData="name='value_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ValueType1 extends Value {
	/**
	 * Returns the value of the '<em><b>Repetition Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition Value</em>' attribute.
	 * @see #isSetRepetitionValue()
	 * @see #unsetRepetitionValue()
	 * @see #setRepetitionValue(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getValueType1_RepetitionValue()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='repetitionValue'"
	 * @generated
	 */
	String getRepetitionValue();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ValueType1#getRepetitionValue <em>Repetition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Value</em>' attribute.
	 * @see #isSetRepetitionValue()
	 * @see #unsetRepetitionValue()
	 * @see #getRepetitionValue()
	 * @generated
	 */
	void setRepetitionValue(String value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.ValueType1#getRepetitionValue <em>Repetition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepetitionValue()
	 * @see #getRepetitionValue()
	 * @see #setRepetitionValue(String)
	 * @generated
	 */
	void unsetRepetitionValue();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.ValueType1#getRepetitionValue <em>Repetition Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repetition Value</em>' attribute is set.
	 * @see #unsetRepetitionValue()
	 * @see #getRepetitionValue()
	 * @see #setRepetitionValue(String)
	 * @generated
	 */
	boolean isSetRepetitionValue();

} // ValueType1

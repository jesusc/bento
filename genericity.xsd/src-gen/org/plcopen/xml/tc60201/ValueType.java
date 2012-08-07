/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ValueType#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getValueType()
 * @model extendedMetaData="name='value_._type' kind='elementOnly'"
 * @generated
 */
public interface ValueType extends Value {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' attribute.
	 * @see #setMember(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getValueType_Member()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='member'"
	 * @generated
	 */
	String getMember();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ValueType#getMember <em>Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' attribute.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(String value);

} // ValueType

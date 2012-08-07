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
 * A representation of the model object '<em><b>Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ConditionType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ConditionType#getConnectionPointIn <em>Connection Point In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ConditionType#getInline <em>Inline</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ConditionType#isNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getConditionType()
 * @model extendedMetaData="name='condition_._type' kind='elementOnly'"
 * @generated
 */
public interface ConditionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConditionType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConditionType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Point In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Point In</em>' containment reference.
	 * @see #setConnectionPointIn(ConnectionPointIn)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConditionType_ConnectionPointIn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectionPointIn' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionPointIn getConnectionPointIn();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConditionType#getConnectionPointIn <em>Connection Point In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Point In</em>' containment reference.
	 * @see #getConnectionPointIn()
	 * @generated
	 */
	void setConnectionPointIn(ConnectionPointIn value);

	/**
	 * Returns the value of the '<em><b>Inline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline</em>' containment reference.
	 * @see #setInline(InlineType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConditionType_Inline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inline' namespace='##targetNamespace'"
	 * @generated
	 */
	InlineType getInline();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConditionType#getInline <em>Inline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline</em>' containment reference.
	 * @see #getInline()
	 * @generated
	 */
	void setInline(InlineType value);

	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #isSetNegated()
	 * @see #unsetNegated()
	 * @see #setNegated(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConditionType_Negated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='negated'"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConditionType#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #isSetNegated()
	 * @see #unsetNegated()
	 * @see #isNegated()
	 * @generated
	 */
	void setNegated(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.ConditionType#isNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNegated()
	 * @see #isNegated()
	 * @see #setNegated(boolean)
	 * @generated
	 */
	void unsetNegated();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.ConditionType#isNegated <em>Negated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Negated</em>' attribute is set.
	 * @see #unsetNegated()
	 * @see #isNegated()
	 * @see #setNegated(boolean)
	 * @generated
	 */
	boolean isSetNegated();

} // ConditionType

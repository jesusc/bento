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
 * A representation of the model object '<em><b>Ld Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.LdType#getScaling <em>Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getLdType()
 * @model extendedMetaData="name='ld_._type' kind='elementOnly'"
 * @generated
 */
public interface LdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling</em>' containment reference.
	 * @see #setScaling(ScalingType1)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getLdType_Scaling()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	ScalingType1 getScaling();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.LdType#getScaling <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling</em>' containment reference.
	 * @see #getScaling()
	 * @generated
	 */
	void setScaling(ScalingType1 value);

} // LdType

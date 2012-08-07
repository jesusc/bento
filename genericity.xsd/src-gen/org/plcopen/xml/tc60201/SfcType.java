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
 * A representation of the model object '<em><b>Sfc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.SfcType#getScaling <em>Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getSfcType()
 * @model extendedMetaData="name='sfc_._type' kind='elementOnly'"
 * @generated
 */
public interface SfcType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling</em>' containment reference.
	 * @see #setScaling(ScalingType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSfcType_Scaling()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	ScalingType getScaling();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.SfcType#getScaling <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling</em>' containment reference.
	 * @see #getScaling()
	 * @generated
	 */
	void setScaling(ScalingType value);

} // SfcType

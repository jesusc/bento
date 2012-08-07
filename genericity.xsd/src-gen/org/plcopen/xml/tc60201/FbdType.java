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
 * A representation of the model object '<em><b>Fbd Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.FbdType#getScaling <em>Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getFbdType()
 * @model extendedMetaData="name='fbd_._type' kind='elementOnly'"
 * @generated
 */
public interface FbdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling</em>' containment reference.
	 * @see #setScaling(ScalingType2)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getFbdType_Scaling()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	ScalingType2 getScaling();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.FbdType#getScaling <em>Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling</em>' containment reference.
	 * @see #getScaling()
	 * @generated
	 */
	void setScaling(ScalingType2 value);

} // FbdType

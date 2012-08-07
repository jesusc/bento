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
 * A representation of the model object '<em><b>Pous Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.PousType#getPou <em>Pou</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getPousType()
 * @model extendedMetaData="name='pous_._type' kind='elementOnly'"
 * @generated
 */
public interface PousType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pou</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.PouType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pou</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pou</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getPousType_Pou()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pou' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PouType1> getPou();

} // PousType

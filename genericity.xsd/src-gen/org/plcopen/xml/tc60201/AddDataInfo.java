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
 * A representation of the model object '<em><b>Add Data Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of additional data elements used in the document with description
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.AddDataInfo#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getAddDataInfo()
 * @model extendedMetaData="name='addDataInfo' kind='elementOnly'"
 * @generated
 */
public interface AddDataInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.InfoType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getAddDataInfo_Info()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='info' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InfoType> getInfo();

} // AddDataInfo

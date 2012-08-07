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
 * A representation of the model object '<em><b>Var List Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of access variable declarations
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.VarListAccess#getAccessVariable <em>Access Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VarListAccess#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VarListAccess#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarListAccess()
 * @model extendedMetaData="name='varListAccess' kind='elementOnly'"
 * @generated
 */
public interface VarListAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.AccessVariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Variable</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarListAccess_AccessVariable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accessVariable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccessVariableType> getAccessVariable();

	/**
	 * Returns the value of the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Data</em>' containment reference.
	 * @see #setAddData(AddData)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarListAccess_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VarListAccess#getAddData <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data</em>' containment reference.
	 * @see #getAddData()
	 * @generated
	 */
	void setAddData(AddData value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(FormattedText)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarListAccess_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VarListAccess#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

} // VarListAccess

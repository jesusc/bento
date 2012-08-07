/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point Out Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ConnectionPointOutType1#getFormalParameter <em>Formal Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnectionPointOutType1()
 * @model extendedMetaData="name='connectionPointOut_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ConnectionPointOutType1 extends ConnectionPointOut {
	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' attribute.
	 * @see #setFormalParameter(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getConnectionPointOutType1_FormalParameter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='formalParameter'"
	 * @generated
	 */
	String getFormalParameter();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ConnectionPointOutType1#getFormalParameter <em>Formal Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameter</em>' attribute.
	 * @see #getFormalParameter()
	 * @generated
	 */
	void setFormalParameter(String value);

} // ConnectionPointOutType1

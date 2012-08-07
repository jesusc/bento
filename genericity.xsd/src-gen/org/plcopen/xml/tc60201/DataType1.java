/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.DataType1#getAny <em>Any</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType1#getHandleUnknown <em>Handle Unknown</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType1#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType1()
 * @model extendedMetaData="name='data_._type' kind='elementOnly'"
 * @generated
 */
public interface DataType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType1_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Handle Unknown</b></em>' attribute.
	 * The literals are from the enumeration {@link org.plcopen.xml.tc60201.HandleUnknownType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recommended processor handling for unknown data elements.
	 * Specifies if the processor should try to preserve the additional data element, dismiss the element (e.g. because the data is invalid if not updated correctly) or use the processors default behaviour for unknown data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handle Unknown</em>' attribute.
	 * @see org.plcopen.xml.tc60201.HandleUnknownType
	 * @see #isSetHandleUnknown()
	 * @see #unsetHandleUnknown()
	 * @see #setHandleUnknown(HandleUnknownType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType1_HandleUnknown()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='handleUnknown'"
	 * @generated
	 */
	HandleUnknownType getHandleUnknown();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType1#getHandleUnknown <em>Handle Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Unknown</em>' attribute.
	 * @see org.plcopen.xml.tc60201.HandleUnknownType
	 * @see #isSetHandleUnknown()
	 * @see #unsetHandleUnknown()
	 * @see #getHandleUnknown()
	 * @generated
	 */
	void setHandleUnknown(HandleUnknownType value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.DataType1#getHandleUnknown <em>Handle Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandleUnknown()
	 * @see #getHandleUnknown()
	 * @see #setHandleUnknown(HandleUnknownType)
	 * @generated
	 */
	void unsetHandleUnknown();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.DataType1#getHandleUnknown <em>Handle Unknown</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handle Unknown</em>' attribute is set.
	 * @see #unsetHandleUnknown()
	 * @see #getHandleUnknown()
	 * @see #setHandleUnknown(HandleUnknownType)
	 * @generated
	 */
	boolean isSetHandleUnknown();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uniquely identifies the additional data element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType1_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataType1

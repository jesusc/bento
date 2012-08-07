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
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generic data type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getBOOL <em>BOOL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getBYTE <em>BYTE</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getWORD <em>WORD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getDWORD <em>DWORD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getLWORD <em>LWORD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getSINT <em>SINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getINT <em>INT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getDINT <em>DINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getLINT <em>LINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getUSINT <em>USINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getUINT <em>UINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getUDINT <em>UDINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getULINT <em>ULINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getREAL <em>REAL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getLREAL <em>LREAL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getTIME <em>TIME</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getDATE <em>DATE</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getDT <em>DT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getTOD <em>TOD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getString <em>String</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getWstring <em>Wstring</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANY <em>ANY</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYDERIVED <em>ANYDERIVED</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYELEMENTARY <em>ANYELEMENTARY</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYMAGNITUDE <em>ANYMAGNITUDE</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYNUM <em>ANYNUM</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYREAL <em>ANYREAL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYINT <em>ANYINT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYBIT <em>ANYBIT</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYSTRING <em>ANYSTRING</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getANYDATE <em>ANYDATE</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getArray <em>Array</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getDerived <em>Derived</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getSubrangeSigned <em>Subrange Signed</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getSubrangeUnsigned <em>Subrange Unsigned</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.DataType#getPointer <em>Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType()
 * @model extendedMetaData="name='dataType' kind='elementOnly'"
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BOOL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BOOL</em>' containment reference.
	 * @see #setBOOL(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_BOOL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BOOL' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getBOOL();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getBOOL <em>BOOL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BOOL</em>' containment reference.
	 * @see #getBOOL()
	 * @generated
	 */
	void setBOOL(EObject value);

	/**
	 * Returns the value of the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BYTE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BYTE</em>' containment reference.
	 * @see #setBYTE(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_BYTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BYTE' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getBYTE();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getBYTE <em>BYTE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BYTE</em>' containment reference.
	 * @see #getBYTE()
	 * @generated
	 */
	void setBYTE(EObject value);

	/**
	 * Returns the value of the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WORD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WORD</em>' containment reference.
	 * @see #setWORD(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_WORD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WORD' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getWORD();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getWORD <em>WORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WORD</em>' containment reference.
	 * @see #getWORD()
	 * @generated
	 */
	void setWORD(EObject value);

	/**
	 * Returns the value of the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DWORD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DWORD</em>' containment reference.
	 * @see #setDWORD(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_DWORD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWORD' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDWORD();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getDWORD <em>DWORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWORD</em>' containment reference.
	 * @see #getDWORD()
	 * @generated
	 */
	void setDWORD(EObject value);

	/**
	 * Returns the value of the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LWORD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LWORD</em>' containment reference.
	 * @see #setLWORD(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_LWORD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LWORD' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLWORD();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getLWORD <em>LWORD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LWORD</em>' containment reference.
	 * @see #getLWORD()
	 * @generated
	 */
	void setLWORD(EObject value);

	/**
	 * Returns the value of the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SINT</em>' containment reference.
	 * @see #setSINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_SINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getSINT <em>SINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SINT</em>' containment reference.
	 * @see #getSINT()
	 * @generated
	 */
	void setSINT(EObject value);

	/**
	 * Returns the value of the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INT</em>' containment reference.
	 * @see #setINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_INT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getINT <em>INT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INT</em>' containment reference.
	 * @see #getINT()
	 * @generated
	 */
	void setINT(EObject value);

	/**
	 * Returns the value of the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DINT</em>' containment reference.
	 * @see #setDINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_DINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getDINT <em>DINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DINT</em>' containment reference.
	 * @see #getDINT()
	 * @generated
	 */
	void setDINT(EObject value);

	/**
	 * Returns the value of the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LINT</em>' containment reference.
	 * @see #setLINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_LINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getLINT <em>LINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LINT</em>' containment reference.
	 * @see #getLINT()
	 * @generated
	 */
	void setLINT(EObject value);

	/**
	 * Returns the value of the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>USINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>USINT</em>' containment reference.
	 * @see #setUSINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_USINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='USINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUSINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getUSINT <em>USINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USINT</em>' containment reference.
	 * @see #getUSINT()
	 * @generated
	 */
	void setUSINT(EObject value);

	/**
	 * Returns the value of the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UINT</em>' containment reference.
	 * @see #setUINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_UINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getUINT <em>UINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UINT</em>' containment reference.
	 * @see #getUINT()
	 * @generated
	 */
	void setUINT(EObject value);

	/**
	 * Returns the value of the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UDINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UDINT</em>' containment reference.
	 * @see #setUDINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_UDINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UDINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getUDINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getUDINT <em>UDINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UDINT</em>' containment reference.
	 * @see #getUDINT()
	 * @generated
	 */
	void setUDINT(EObject value);

	/**
	 * Returns the value of the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ULINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ULINT</em>' containment reference.
	 * @see #setULINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ULINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ULINT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getULINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getULINT <em>ULINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ULINT</em>' containment reference.
	 * @see #getULINT()
	 * @generated
	 */
	void setULINT(EObject value);

	/**
	 * Returns the value of the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REAL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REAL</em>' containment reference.
	 * @see #setREAL(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_REAL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='REAL' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getREAL();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getREAL <em>REAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REAL</em>' containment reference.
	 * @see #getREAL()
	 * @generated
	 */
	void setREAL(EObject value);

	/**
	 * Returns the value of the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LREAL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LREAL</em>' containment reference.
	 * @see #setLREAL(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_LREAL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LREAL' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLREAL();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getLREAL <em>LREAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LREAL</em>' containment reference.
	 * @see #getLREAL()
	 * @generated
	 */
	void setLREAL(EObject value);

	/**
	 * Returns the value of the '<em><b>TIME</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TIME</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TIME</em>' containment reference.
	 * @see #setTIME(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_TIME()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TIME' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTIME();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getTIME <em>TIME</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TIME</em>' containment reference.
	 * @see #getTIME()
	 * @generated
	 */
	void setTIME(EObject value);

	/**
	 * Returns the value of the '<em><b>DATE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATE</em>' containment reference.
	 * @see #setDATE(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_DATE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DATE' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDATE();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getDATE <em>DATE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATE</em>' containment reference.
	 * @see #getDATE()
	 * @generated
	 */
	void setDATE(EObject value);

	/**
	 * Returns the value of the '<em><b>DT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DT</em>' containment reference.
	 * @see #setDT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_DT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getDT <em>DT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DT</em>' containment reference.
	 * @see #getDT()
	 * @generated
	 */
	void setDT(EObject value);

	/**
	 * Returns the value of the '<em><b>TOD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TOD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOD</em>' containment reference.
	 * @see #setTOD(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_TOD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TOD' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTOD();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getTOD <em>TOD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOD</em>' containment reference.
	 * @see #getTOD()
	 * @generated
	 */
	void setTOD(EObject value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(StringType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getString();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
	void setString(StringType value);

	/**
	 * Returns the value of the '<em><b>Wstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wstring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wstring</em>' containment reference.
	 * @see #setWstring(WstringType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_Wstring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wstring' namespace='##targetNamespace'"
	 * @generated
	 */
	WstringType getWstring();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getWstring <em>Wstring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wstring</em>' containment reference.
	 * @see #getWstring()
	 * @generated
	 */
	void setWstring(WstringType value);

	/**
	 * Returns the value of the '<em><b>ANY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANY</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANY</em>' containment reference.
	 * @see #setANY(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANY();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANY <em>ANY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANY</em>' containment reference.
	 * @see #getANY()
	 * @generated
	 */
	void setANY(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYDERIVED</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYDERIVED</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYDERIVED</em>' containment reference.
	 * @see #setANYDERIVED(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYDERIVED()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_DERIVED' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYDERIVED();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYDERIVED <em>ANYDERIVED</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYDERIVED</em>' containment reference.
	 * @see #getANYDERIVED()
	 * @generated
	 */
	void setANYDERIVED(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYELEMENTARY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYELEMENTARY</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYELEMENTARY</em>' containment reference.
	 * @see #setANYELEMENTARY(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYELEMENTARY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_ELEMENTARY' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYELEMENTARY();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYELEMENTARY <em>ANYELEMENTARY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYELEMENTARY</em>' containment reference.
	 * @see #getANYELEMENTARY()
	 * @generated
	 */
	void setANYELEMENTARY(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYMAGNITUDE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYMAGNITUDE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYMAGNITUDE</em>' containment reference.
	 * @see #setANYMAGNITUDE(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYMAGNITUDE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_MAGNITUDE' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYMAGNITUDE();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYMAGNITUDE <em>ANYMAGNITUDE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYMAGNITUDE</em>' containment reference.
	 * @see #getANYMAGNITUDE()
	 * @generated
	 */
	void setANYMAGNITUDE(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYNUM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYNUM</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYNUM</em>' containment reference.
	 * @see #setANYNUM(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYNUM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_NUM' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYNUM();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYNUM <em>ANYNUM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYNUM</em>' containment reference.
	 * @see #getANYNUM()
	 * @generated
	 */
	void setANYNUM(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYREAL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYREAL</em>' containment reference.
	 * @see #setANYREAL(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYREAL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_REAL' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYREAL();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYREAL <em>ANYREAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYREAL</em>' containment reference.
	 * @see #getANYREAL()
	 * @generated
	 */
	void setANYREAL(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYINT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYINT</em>' containment reference.
	 * @see #setANYINT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYINT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_INT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYINT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYINT <em>ANYINT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYINT</em>' containment reference.
	 * @see #getANYINT()
	 * @generated
	 */
	void setANYINT(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYBIT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYBIT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYBIT</em>' containment reference.
	 * @see #setANYBIT(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYBIT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_BIT' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYBIT();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYBIT <em>ANYBIT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYBIT</em>' containment reference.
	 * @see #getANYBIT()
	 * @generated
	 */
	void setANYBIT(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYSTRING</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYSTRING</em>' containment reference.
	 * @see #setANYSTRING(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYSTRING()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_STRING' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYSTRING();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYSTRING <em>ANYSTRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYSTRING</em>' containment reference.
	 * @see #getANYSTRING()
	 * @generated
	 */
	void setANYSTRING(EObject value);

	/**
	 * Returns the value of the '<em><b>ANYDATE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANYDATE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANYDATE</em>' containment reference.
	 * @see #setANYDATE(EObject)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_ANYDATE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ANY_DATE' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getANYDATE();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getANYDATE <em>ANYDATE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANYDATE</em>' containment reference.
	 * @see #getANYDATE()
	 * @generated
	 */
	void setANYDATE(EObject value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(ArrayType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_Array()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace'"
	 * @generated
	 */
	ArrayType getArray();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(ArrayType value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a user defined datatype or POU. Variable declarations use this type to declare e.g. function block instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived</em>' containment reference.
	 * @see #setDerived(DerivedType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_Derived()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derived' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivedType getDerived();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getDerived <em>Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' containment reference.
	 * @see #getDerived()
	 * @generated
	 */
	void setDerived(DerivedType value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference.
	 * @see #setEnum(EnumType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_Enum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumType getEnum();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getEnum <em>Enum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' containment reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(EnumType value);

	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference.
	 * @see #setStruct(VarListPlain)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_Struct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
	VarListPlain getStruct();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getStruct <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' containment reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(VarListPlain value);

	/**
	 * Returns the value of the '<em><b>Subrange Signed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subrange Signed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subrange Signed</em>' containment reference.
	 * @see #setSubrangeSigned(SubrangeSignedType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_SubrangeSigned()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subrangeSigned' namespace='##targetNamespace'"
	 * @generated
	 */
	SubrangeSignedType getSubrangeSigned();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getSubrangeSigned <em>Subrange Signed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subrange Signed</em>' containment reference.
	 * @see #getSubrangeSigned()
	 * @generated
	 */
	void setSubrangeSigned(SubrangeSignedType value);

	/**
	 * Returns the value of the '<em><b>Subrange Unsigned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subrange Unsigned</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subrange Unsigned</em>' containment reference.
	 * @see #setSubrangeUnsigned(SubrangeUnsignedType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_SubrangeUnsigned()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subrangeUnsigned' namespace='##targetNamespace'"
	 * @generated
	 */
	SubrangeUnsignedType getSubrangeUnsigned();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getSubrangeUnsigned <em>Subrange Unsigned</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subrange Unsigned</em>' containment reference.
	 * @see #getSubrangeUnsigned()
	 * @generated
	 */
	void setSubrangeUnsigned(SubrangeUnsignedType value);

	/**
	 * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' containment reference.
	 * @see #setPointer(PointerType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getDataType_Pointer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointer' namespace='##targetNamespace'"
	 * @generated
	 */
	PointerType getPointer();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.DataType#getPointer <em>Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' containment reference.
	 * @see #getPointer()
	 * @generated
	 */
	void setPointer(PointerType value);

} // DataType

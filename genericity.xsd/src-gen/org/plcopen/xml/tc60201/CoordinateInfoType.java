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
 * A representation of the model object '<em><b>Coordinate Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.CoordinateInfoType#getPageSize <em>Page Size</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.CoordinateInfoType#getFbd <em>Fbd</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.CoordinateInfoType#getLd <em>Ld</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.CoordinateInfoType#getSfc <em>Sfc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getCoordinateInfoType()
 * @model extendedMetaData="name='coordinateInfo_._type' kind='elementOnly'"
 * @generated
 */
public interface CoordinateInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Page Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Size</em>' containment reference.
	 * @see #setPageSize(PageSizeType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getCoordinateInfoType_PageSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pageSize' namespace='##targetNamespace'"
	 * @generated
	 */
	PageSizeType getPageSize();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.CoordinateInfoType#getPageSize <em>Page Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Size</em>' containment reference.
	 * @see #getPageSize()
	 * @generated
	 */
	void setPageSize(PageSizeType value);

	/**
	 * Returns the value of the '<em><b>Fbd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fbd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fbd</em>' containment reference.
	 * @see #setFbd(FbdType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getCoordinateInfoType_Fbd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fbd' namespace='##targetNamespace'"
	 * @generated
	 */
	FbdType getFbd();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.CoordinateInfoType#getFbd <em>Fbd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fbd</em>' containment reference.
	 * @see #getFbd()
	 * @generated
	 */
	void setFbd(FbdType value);

	/**
	 * Returns the value of the '<em><b>Ld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ld</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ld</em>' containment reference.
	 * @see #setLd(LdType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getCoordinateInfoType_Ld()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ld' namespace='##targetNamespace'"
	 * @generated
	 */
	LdType getLd();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.CoordinateInfoType#getLd <em>Ld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ld</em>' containment reference.
	 * @see #getLd()
	 * @generated
	 */
	void setLd(LdType value);

	/**
	 * Returns the value of the '<em><b>Sfc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sfc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sfc</em>' containment reference.
	 * @see #setSfc(SfcType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getCoordinateInfoType_Sfc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sfc' namespace='##targetNamespace'"
	 * @generated
	 */
	SfcType getSfc();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.CoordinateInfoType#getSfc <em>Sfc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sfc</em>' containment reference.
	 * @see #getSfc()
	 * @generated
	 */
	void setSfc(SfcType value);

} // CoordinateInfoType

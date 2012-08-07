/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of variable declarations that share the same memory attributes (CONSTANT, RETAIN, NON_RETAIN, PERSISTENT)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.VarList#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VarList#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VarList#isNonpersistent <em>Nonpersistent</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VarList#isNonretain <em>Nonretain</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VarList#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.VarList#isRetain <em>Retain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarList()
 * @model extendedMetaData="name='varList' kind='elementOnly'"
 * @generated
 */
public interface VarList extends VarListPlain {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #isSetConstant()
	 * @see #unsetConstant()
	 * @see #setConstant(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarList_Constant()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='constant'"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VarList#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isSetConstant()
	 * @see #unsetConstant()
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.VarList#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstant()
	 * @see #isConstant()
	 * @see #setConstant(boolean)
	 * @generated
	 */
	void unsetConstant();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VarList#isConstant <em>Constant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constant</em>' attribute is set.
	 * @see #unsetConstant()
	 * @see #isConstant()
	 * @see #setConstant(boolean)
	 * @generated
	 */
	boolean isSetConstant();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarList_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VarList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nonpersistent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonpersistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonpersistent</em>' attribute.
	 * @see #isSetNonpersistent()
	 * @see #unsetNonpersistent()
	 * @see #setNonpersistent(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarList_Nonpersistent()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nonpersistent'"
	 * @generated
	 */
	boolean isNonpersistent();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VarList#isNonpersistent <em>Nonpersistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonpersistent</em>' attribute.
	 * @see #isSetNonpersistent()
	 * @see #unsetNonpersistent()
	 * @see #isNonpersistent()
	 * @generated
	 */
	void setNonpersistent(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.VarList#isNonpersistent <em>Nonpersistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNonpersistent()
	 * @see #isNonpersistent()
	 * @see #setNonpersistent(boolean)
	 * @generated
	 */
	void unsetNonpersistent();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VarList#isNonpersistent <em>Nonpersistent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nonpersistent</em>' attribute is set.
	 * @see #unsetNonpersistent()
	 * @see #isNonpersistent()
	 * @see #setNonpersistent(boolean)
	 * @generated
	 */
	boolean isSetNonpersistent();

	/**
	 * Returns the value of the '<em><b>Nonretain</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonretain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonretain</em>' attribute.
	 * @see #isSetNonretain()
	 * @see #unsetNonretain()
	 * @see #setNonretain(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarList_Nonretain()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nonretain'"
	 * @generated
	 */
	boolean isNonretain();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VarList#isNonretain <em>Nonretain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonretain</em>' attribute.
	 * @see #isSetNonretain()
	 * @see #unsetNonretain()
	 * @see #isNonretain()
	 * @generated
	 */
	void setNonretain(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.VarList#isNonretain <em>Nonretain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNonretain()
	 * @see #isNonretain()
	 * @see #setNonretain(boolean)
	 * @generated
	 */
	void unsetNonretain();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VarList#isNonretain <em>Nonretain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nonretain</em>' attribute is set.
	 * @see #unsetNonretain()
	 * @see #isNonretain()
	 * @see #setNonretain(boolean)
	 * @generated
	 */
	boolean isSetNonretain();

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #isSetPersistent()
	 * @see #unsetPersistent()
	 * @see #setPersistent(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarList_Persistent()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='persistent'"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VarList#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isSetPersistent()
	 * @see #unsetPersistent()
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.VarList#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistent()
	 * @see #isPersistent()
	 * @see #setPersistent(boolean)
	 * @generated
	 */
	void unsetPersistent();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VarList#isPersistent <em>Persistent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistent</em>' attribute is set.
	 * @see #unsetPersistent()
	 * @see #isPersistent()
	 * @see #setPersistent(boolean)
	 * @generated
	 */
	boolean isSetPersistent();

	/**
	 * Returns the value of the '<em><b>Retain</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retain</em>' attribute.
	 * @see #isSetRetain()
	 * @see #unsetRetain()
	 * @see #setRetain(boolean)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getVarList_Retain()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='retain'"
	 * @generated
	 */
	boolean isRetain();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.VarList#isRetain <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retain</em>' attribute.
	 * @see #isSetRetain()
	 * @see #unsetRetain()
	 * @see #isRetain()
	 * @generated
	 */
	void setRetain(boolean value);

	/**
	 * Unsets the value of the '{@link org.plcopen.xml.tc60201.VarList#isRetain <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetain()
	 * @see #isRetain()
	 * @see #setRetain(boolean)
	 * @generated
	 */
	void unsetRetain();

	/**
	 * Returns whether the value of the '{@link org.plcopen.xml.tc60201.VarList#isRetain <em>Retain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retain</em>' attribute is set.
	 * @see #unsetRetain()
	 * @see #isRetain()
	 * @see #setRetain(boolean)
	 * @generated
	 */
	boolean isSetRetain();

} // VarList

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.componetization.reveng;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.componetization.reveng.Metamodel#getName <em>Name</em>}</li>
 *   <li>{@link bento.componetization.reveng.Metamodel#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.componetization.reveng.RevengPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject {
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
	 * @see bento.componetization.reveng.RevengPackage#getMetamodel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Metamodel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see bento.componetization.reveng.RevengPackage#getMetamodel_URI()
	 * @model required="true"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Metamodel#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // Metamodel

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.core.BindingDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.BindingDeclaration#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.core.CorePackage#getBindingDeclaration()
 * @model
 * @generated
 */
public interface BindingDeclaration extends EObject {
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
	 * @see genericity.language.gcomponent.core.CorePackage#getBindingDeclaration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.core.BindingDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see genericity.language.gcomponent.core.CorePackage#getBindingDeclaration_FileName()
	 * @model required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.core.BindingDeclaration#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // BindingDeclaration

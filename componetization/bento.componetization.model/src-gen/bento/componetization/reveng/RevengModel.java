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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.componetization.reveng.RevengModel#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link bento.componetization.reveng.RevengModel#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.componetization.reveng.RevengPackage#getRevengModel()
 * @model
 * @generated
 */
public interface RevengModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Transformation)
	 * @see bento.componetization.reveng.RevengPackage#getRevengModel_Transformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.RevengModel#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(Transformation)
	 * @see bento.componetization.reveng.RevengPackage#getRevengModel_Template()
	 * @model containment="true"
	 * @generated
	 */
	Transformation getTemplate();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.RevengModel#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Transformation value);

} // RevengModel

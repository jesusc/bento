/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import gbind.simpleocl.OclExpression;
import gbind.simpleocl.OclType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.BaseHelper#getFeature <em>Feature</em>}</li>
 *   <li>{@link gbind.dsl.BaseHelper#getBody <em>Body</em>}</li>
 *   <li>{@link gbind.dsl.BaseHelper#getType <em>Type</em>}</li>
 *   <li>{@link gbind.dsl.BaseHelper#getModel_ <em>Model </em>}</li>
 * </ul>
 *
 * @see gbind.dsl.DslPackage#getBaseHelper()
 * @model
 * @generated
 */
public interface BaseHelper extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see gbind.dsl.DslPackage#getBaseHelper_Feature()
	 * @model required="true"
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link gbind.dsl.BaseHelper#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see gbind.dsl.DslPackage#getBaseHelper_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link gbind.dsl.BaseHelper#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(OclType)
	 * @see gbind.dsl.DslPackage#getBaseHelper_Type()
	 * @model containment="true"
	 * @generated
	 */
	OclType getType();

	/**
	 * Sets the value of the '{@link gbind.dsl.BaseHelper#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OclType value);

	/**
	 * Returns the value of the '<em><b>Model </b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gbind.dsl.BindingModel#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model </em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model </em>' container reference.
	 * @see #setModel_(BindingModel)
	 * @see gbind.dsl.DslPackage#getBaseHelper_Model_()
	 * @see gbind.dsl.BindingModel#getHelpers
	 * @model opposite="helpers" transient="false"
	 * @generated
	 */
	BindingModel getModel_();

	/**
	 * Sets the value of the '{@link gbind.dsl.BaseHelper#getModel_ <em>Model </em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model </em>' container reference.
	 * @see #getModel_()
	 * @generated
	 */
	void setModel_(BindingModel value);

} // BaseHelper

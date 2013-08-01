/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.technologies;

import genericity.language.gcomponent.core.Template;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atl Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.technologies.AtlTemplate#getTemplate <em>Template</em>}</li>
 *   <li>{@link genericity.language.gcomponent.technologies.AtlTemplate#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.technologies.TechnologiesPackage#getAtlTemplate()
 * @model
 * @generated
 */
public interface AtlTemplate extends Template {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(String)
	 * @see genericity.language.gcomponent.technologies.TechnologiesPackage#getAtlTemplate_Template()
	 * @model required="true"
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.technologies.AtlTemplate#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.technologies.AtlParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see genericity.language.gcomponent.technologies.TechnologiesPackage#getAtlTemplate_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtlParameter> getParameters();

} // AtlTemplate

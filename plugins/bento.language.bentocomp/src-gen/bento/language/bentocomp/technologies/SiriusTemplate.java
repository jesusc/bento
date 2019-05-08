/**
 */
package bento.language.bentocomp.technologies;

import bento.language.bentocomp.core.Template;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sirius Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.technologies.SiriusTemplate#getODesignFile <em>ODesign File</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.technologies.TechnologiesPackage#getSiriusTemplate()
 * @model
 * @generated
 */
public interface SiriusTemplate extends Template {
	/**
	 * Returns the value of the '<em><b>ODesign File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODesign File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODesign File</em>' attribute.
	 * @see #setODesignFile(String)
	 * @see bento.language.bentocomp.technologies.TechnologiesPackage#getSiriusTemplate_ODesignFile()
	 * @model required="true"
	 * @generated
	 */
	String getODesignFile();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.technologies.SiriusTemplate#getODesignFile <em>ODesign File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ODesign File</em>' attribute.
	 * @see #getODesignFile()
	 * @generated
	 */
	void setODesignFile(String value);

} // SiriusTemplate

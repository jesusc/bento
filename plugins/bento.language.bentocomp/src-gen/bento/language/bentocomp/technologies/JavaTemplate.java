/**
 */
package bento.language.bentocomp.technologies;

import bento.language.bentocomp.core.Template;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.technologies.JavaTemplate#getQualifiedClassname <em>Qualified Classname</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.technologies.TechnologiesPackage#getJavaTemplate()
 * @model
 * @generated
 */
public interface JavaTemplate extends Template {
	/**
	 * Returns the value of the '<em><b>Qualified Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Classname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Classname</em>' attribute.
	 * @see #setQualifiedClassname(String)
	 * @see bento.language.bentocomp.technologies.TechnologiesPackage#getJavaTemplate_QualifiedClassname()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedClassname();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.technologies.JavaTemplate#getQualifiedClassname <em>Qualified Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Classname</em>' attribute.
	 * @see #getQualifiedClassname()
	 * @generated
	 */
	void setQualifiedClassname(String value);

} // JavaTemplate

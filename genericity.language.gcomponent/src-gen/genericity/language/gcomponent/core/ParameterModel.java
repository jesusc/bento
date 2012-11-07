/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.core.ParameterModel#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.core.CorePackage#getParameterModel()
 * @model
 * @generated
 */
public interface ParameterModel extends Model {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.core.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see genericity.language.gcomponent.core.CorePackage#getParameterModel_Type()
	 * @model
	 * @generated
	 */
	EList<Concept> getType();

} // ParameterModel

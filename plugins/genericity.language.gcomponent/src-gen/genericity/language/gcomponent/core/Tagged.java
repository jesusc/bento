/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.core.Tagged#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.core.CorePackage#getTagged()
 * @model abstract="true"
 * @generated
 */
public interface Tagged extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.core.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see genericity.language.gcomponent.core.CorePackage#getTagged_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // Tagged

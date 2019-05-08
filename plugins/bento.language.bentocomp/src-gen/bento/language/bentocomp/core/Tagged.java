/**
 */
package bento.language.bentocomp.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.core.Tagged#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.core.CorePackage#getTagged()
 * @model abstract="true"
 * @generated
 */
public interface Tagged extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getTagged_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // Tagged

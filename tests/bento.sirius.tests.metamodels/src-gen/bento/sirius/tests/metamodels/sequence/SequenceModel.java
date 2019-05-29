/**
 */
package bento.sirius.tests.metamodels.sequence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.sequence.SequenceModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.sequence.SequencePackage#getSequenceModel()
 * @model
 * @generated
 */
public interface SequenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.metamodels.sequence.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see bento.sirius.tests.metamodels.sequence.SequencePackage#getSequenceModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // SequenceModel

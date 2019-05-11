/**
 */
package bento.sirius.tests.boxes;

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
 *   <li>{@link bento.sirius.tests.boxes.Model#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link bento.sirius.tests.boxes.Model#getArrows <em>Arrows</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.boxes.BoxesPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.boxes.BoxNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boxes</em>' containment reference list.
	 * @see bento.sirius.tests.boxes.BoxesPackage#getModel_Boxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoxNode> getBoxes();

	/**
	 * Returns the value of the '<em><b>Arrows</b></em>' containment reference list.
	 * The list contents are of type {@link bento.sirius.tests.boxes.Arrow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrows</em>' containment reference list.
	 * @see bento.sirius.tests.boxes.BoxesPackage#getModel_Arrows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arrow> getArrows();

} // Model

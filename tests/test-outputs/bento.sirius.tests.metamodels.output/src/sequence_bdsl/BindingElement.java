/**
 */
package sequence_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.BindingElement#getNoneElement <em>None Element</em>}</li>
 * </ul>
 *
 * @see sequence_bdsl.Sequence_bdslPackage#getBindingElement()
 * @model abstract="true"
 * @generated
 */
public interface BindingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>None Element</b></em>' reference list.
	 * The list contents are of type {@link sequence_bdsl.NoneElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>None Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None Element</em>' reference list.
	 * @see sequence_bdsl.Sequence_bdslPackage#getBindingElement_NoneElement()
	 * @model
	 * @generated
	 */
	EList<NoneElement> getNoneElement();

} // BindingElement

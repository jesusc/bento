/**
 */
package graph_bdsl;

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
 *   <li>{@link graph_bdsl.BindingElement#getContainsSiriusTag <em>Contains Sirius Tag</em>}</li>
 *   <li>{@link graph_bdsl.BindingElement#getNoneElement <em>None Element</em>}</li>
 * </ul>
 *
 * @see graph_bdsl.Graph_bdslPackage#getBindingElement()
 * @model abstract="true"
 * @generated
 */
public interface BindingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.SiriusTag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Sirius Tag</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getBindingElement_ContainsSiriusTag()
	 * @model containment="true"
	 * @generated
	 */
	EList<SiriusTag> getContainsSiriusTag();

	/**
	 * Returns the value of the '<em><b>None Element</b></em>' reference list.
	 * The list contents are of type {@link graph_bdsl.NoneElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None Element</em>' reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getBindingElement_NoneElement()
	 * @model
	 * @generated
	 */
	EList<NoneElement> getNoneElement();

} // BindingElement

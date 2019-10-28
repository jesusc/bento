/**
 */
package graph_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.Node#getValue <em>Value</em>}</li>
 *   <li>{@link graph_bdsl.Node#getContainsvalueNode <em>Containsvalue Node</em>}</li>
 * </ul>
 *
 * @see graph_bdsl.Graph_bdslPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends BindingElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see graph_bdsl.Graph_bdslPackage#getNode_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link graph_bdsl.Node#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Containsvalue Node</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.valueNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsvalue Node</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getNode_ContainsvalueNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<valueNode> getContainsvalueNode();

} // Node

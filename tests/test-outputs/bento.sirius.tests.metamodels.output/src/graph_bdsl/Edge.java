/**
 */
package graph_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.Edge#getLabel <em>Label</em>}</li>
 *   <li>{@link graph_bdsl.Edge#getSrc <em>Src</em>}</li>
 *   <li>{@link graph_bdsl.Edge#getTgt <em>Tgt</em>}</li>
 *   <li>{@link graph_bdsl.Edge#getEref_srcEdge21 <em>Eref src Edge21</em>}</li>
 *   <li>{@link graph_bdsl.Edge#getEref_tgtEdge22 <em>Eref tgt Edge22</em>}</li>
 *   <li>{@link graph_bdsl.Edge#getContainslabelEdge <em>Containslabel Edge</em>}</li>
 * </ul>
 *
 * @see graph_bdsl.Graph_bdslPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends BindingElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see graph_bdsl.Graph_bdslPackage#getEdge_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link graph_bdsl.Edge#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Node)
	 * @see graph_bdsl.Graph_bdslPackage#getEdge_Src()
	 * @model required="true"
	 * @generated
	 */
	Node getSrc();

	/**
	 * Sets the value of the '{@link graph_bdsl.Edge#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Node value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Node)
	 * @see graph_bdsl.Graph_bdslPackage#getEdge_Tgt()
	 * @model required="true"
	 * @generated
	 */
	Node getTgt();

	/**
	 * Sets the value of the '{@link graph_bdsl.Edge#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Node value);

	/**
	 * Returns the value of the '<em><b>Eref src Edge21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref src Edge21</em>' containment reference.
	 * @see #setEref_srcEdge21(srcEdge21)
	 * @see graph_bdsl.Graph_bdslPackage#getEdge_Eref_srcEdge21()
	 * @model containment="true"
	 * @generated
	 */
	srcEdge21 getEref_srcEdge21();

	/**
	 * Sets the value of the '{@link graph_bdsl.Edge#getEref_srcEdge21 <em>Eref src Edge21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref src Edge21</em>' containment reference.
	 * @see #getEref_srcEdge21()
	 * @generated
	 */
	void setEref_srcEdge21(srcEdge21 value);

	/**
	 * Returns the value of the '<em><b>Eref tgt Edge22</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref tgt Edge22</em>' containment reference.
	 * @see #setEref_tgtEdge22(tgtEdge22)
	 * @see graph_bdsl.Graph_bdslPackage#getEdge_Eref_tgtEdge22()
	 * @model containment="true"
	 * @generated
	 */
	tgtEdge22 getEref_tgtEdge22();

	/**
	 * Sets the value of the '{@link graph_bdsl.Edge#getEref_tgtEdge22 <em>Eref tgt Edge22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref tgt Edge22</em>' containment reference.
	 * @see #getEref_tgtEdge22()
	 * @generated
	 */
	void setEref_tgtEdge22(tgtEdge22 value);

	/**
	 * Returns the value of the '<em><b>Containslabel Edge</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.labelEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containslabel Edge</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getEdge_ContainslabelEdge()
	 * @model containment="true"
	 * @generated
	 */
	EList<labelEdge> getContainslabelEdge();

} // Edge

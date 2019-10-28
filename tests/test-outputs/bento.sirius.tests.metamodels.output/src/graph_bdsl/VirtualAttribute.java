/**
 */
package graph_bdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.VirtualAttribute#getTo_virtualAttribute <em>To virtual Attribute</em>}</li>
 *   <li>{@link graph_bdsl.VirtualAttribute#getName <em>Name</em>}</li>
 *   <li>{@link graph_bdsl.VirtualAttribute#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see graph_bdsl.Graph_bdslPackage#getVirtualAttribute()
 * @model
 * @generated
 */
public interface VirtualAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>To virtual Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To virtual Attribute</em>' reference.
	 * @see #setTo_virtualAttribute(BindingAttribute)
	 * @see graph_bdsl.Graph_bdslPackage#getVirtualAttribute_To_virtualAttribute()
	 * @model
	 * @generated
	 */
	BindingAttribute getTo_virtualAttribute();

	/**
	 * Sets the value of the '{@link graph_bdsl.VirtualAttribute#getTo_virtualAttribute <em>To virtual Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To virtual Attribute</em>' reference.
	 * @see #getTo_virtualAttribute()
	 * @generated
	 */
	void setTo_virtualAttribute(BindingAttribute value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graph_bdsl.Graph_bdslPackage#getVirtualAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graph_bdsl.VirtualAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see graph_bdsl.Graph_bdslPackage#getVirtualAttribute_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link graph_bdsl.VirtualAttribute#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // VirtualAttribute

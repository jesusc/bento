/**
 */
package bento.language.bentocomp.flowcontrol;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getRight <em>Right</em>}</li>
 *   <li>{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends Expression, BooleanValue {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BooleanValue)
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getBooleanExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanValue getLeft();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BooleanValue value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BooleanValue)
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getBooleanExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanValue getRight();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BooleanValue value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link bento.language.bentocomp.flowcontrol.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see bento.language.bentocomp.flowcontrol.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see bento.language.bentocomp.flowcontrol.FlowcontrolPackage#getBooleanExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.flowcontrol.BooleanExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see bento.language.bentocomp.flowcontrol.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // BooleanExpression

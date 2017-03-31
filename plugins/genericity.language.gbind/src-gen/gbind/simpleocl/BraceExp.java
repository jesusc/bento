/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brace Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.simpleocl.BraceExp#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getBraceExp()
 * @model
 * @generated
 */
public interface BraceExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(OclExpression)
	 * @see gbind.simpleocl.SimpleoclPackage#getBraceExp_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getExp();

	/**
	 * Sets the value of the '{@link gbind.simpleocl.BraceExp#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(OclExpression value);

} // BraceExp

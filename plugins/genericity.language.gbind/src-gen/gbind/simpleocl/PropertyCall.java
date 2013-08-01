/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.simpleocl.PropertyCall#getCallExp <em>Call Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getPropertyCall()
 * @model abstract="true"
 * @generated
 */
public interface PropertyCall extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Call Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gbind.simpleocl.PropertyCallExp#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Exp</em>' container reference.
	 * @see #setCallExp(PropertyCallExp)
	 * @see gbind.simpleocl.SimpleoclPackage#getPropertyCall_CallExp()
	 * @see gbind.simpleocl.PropertyCallExp#getCalls
	 * @model opposite="calls" required="true" transient="false"
	 * @generated
	 */
	PropertyCallExp getCallExp();

	/**
	 * Sets the value of the '{@link gbind.simpleocl.PropertyCall#getCallExp <em>Call Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Exp</em>' container reference.
	 * @see #getCallExp()
	 * @generated
	 */
	void setCallExp(PropertyCallExp value);

} // PropertyCall

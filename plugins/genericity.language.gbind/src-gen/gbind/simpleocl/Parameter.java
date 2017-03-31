/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.simpleocl.Parameter#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gbind.simpleocl.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see gbind.simpleocl.SimpleoclPackage#getParameter_Operation()
	 * @see gbind.simpleocl.Operation#getParameters
	 * @model opposite="parameters" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link gbind.simpleocl.Parameter#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Parameter

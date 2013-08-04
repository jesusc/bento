/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.simpleocl.LambdaCallExp#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getLambdaCallExp()
 * @model
 * @generated
 */
public interface LambdaCallExp extends VariableExp {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.simpleocl.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see gbind.simpleocl.SimpleoclPackage#getLambdaCallExp_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclExpression> getArguments();

} // LambdaCallExp

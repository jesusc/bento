/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Navigation Or Attribute Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.simpleocl.StaticNavigationOrAttributeCall#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getStaticNavigationOrAttributeCall()
 * @model
 * @generated
 */
public interface StaticNavigationOrAttributeCall extends StaticPropertyCall {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gbind.simpleocl.SimpleoclPackage#getStaticNavigationOrAttributeCall_Name()
	 * @model unique="false" dataType="gbind.simpleocl.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gbind.simpleocl.StaticNavigationOrAttributeCall#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StaticNavigationOrAttributeCall

/**
 */
package metamodel_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>name Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.nameStorage#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getnameStorage()
 * @model
 * @generated
 */
public interface nameStorage extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getnameStorage_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.nameStorage#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // nameStorage

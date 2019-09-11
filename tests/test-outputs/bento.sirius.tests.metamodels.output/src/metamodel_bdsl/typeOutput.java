/**
 */
package metamodel_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.typeOutput#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#gettypeOutput()
 * @model
 * @generated
 */
public interface typeOutput extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel_bdsl.OutputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see metamodel_bdsl.OutputType
	 * @see #setValue(OutputType)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#gettypeOutput_Value()
	 * @model
	 * @generated
	 */
	OutputType getValue();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.typeOutput#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see metamodel_bdsl.OutputType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OutputType value);

} // typeOutput

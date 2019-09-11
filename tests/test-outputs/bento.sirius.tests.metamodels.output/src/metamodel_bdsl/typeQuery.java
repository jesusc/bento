/**
 */
package metamodel_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.typeQuery#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#gettypeQuery()
 * @model
 * @generated
 */
public interface typeQuery extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel_bdsl.QueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see metamodel_bdsl.QueryType
	 * @see #setValue(QueryType)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#gettypeQuery_Value()
	 * @model
	 * @generated
	 */
	QueryType getValue();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.typeQuery#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see metamodel_bdsl.QueryType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(QueryType value);

} // typeQuery

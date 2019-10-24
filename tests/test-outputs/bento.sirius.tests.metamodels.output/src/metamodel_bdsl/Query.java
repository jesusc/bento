/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Query#getName <em>Name</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#getValue <em>Value</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#getError <em>Error</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#getType <em>Type</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#isSystem <em>System</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#getContainsnameQuery <em>Containsname Query</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#getContainsvalueQuery <em>Containsvalue Query</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#getContainserrorQuery <em>Containserror Query</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#getContainstypeQuery <em>Containstype Query</em>}</li>
 *   <li>{@link metamodel_bdsl.Query#getContainssystemQuery <em>Containssystem Query</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends BindingElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"query"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_Name()
	 * @model default="query"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Query#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Query#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(String)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_Error()
	 * @model
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Query#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link metamodel_bdsl.QueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see metamodel_bdsl.QueryType
	 * @see #setType(QueryType)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_Type()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	QueryType getType();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Query#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see metamodel_bdsl.QueryType
	 * @see #getType()
	 * @generated
	 */
	void setType(QueryType value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(boolean)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_System()
	 * @model
	 * @generated
	 */
	boolean isSystem();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Query#isSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #isSystem()
	 * @generated
	 */
	void setSystem(boolean value);

	/**
	 * Returns the value of the '<em><b>Containsname Query</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.nameQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Query</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_ContainsnameQuery()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameQuery> getContainsnameQuery();

	/**
	 * Returns the value of the '<em><b>Containsvalue Query</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.valueQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsvalue Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsvalue Query</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_ContainsvalueQuery()
	 * @model containment="true"
	 * @generated
	 */
	EList<valueQuery> getContainsvalueQuery();

	/**
	 * Returns the value of the '<em><b>Containserror Query</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.errorQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containserror Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containserror Query</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_ContainserrorQuery()
	 * @model containment="true"
	 * @generated
	 */
	EList<errorQuery> getContainserrorQuery();

	/**
	 * Returns the value of the '<em><b>Containstype Query</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.typeQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containstype Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containstype Query</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_ContainstypeQuery()
	 * @model containment="true"
	 * @generated
	 */
	EList<typeQuery> getContainstypeQuery();

	/**
	 * Returns the value of the '<em><b>Containssystem Query</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.systemQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containssystem Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containssystem Query</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getQuery_ContainssystemQuery()
	 * @model containment="true"
	 * @generated
	 */
	EList<systemQuery> getContainssystemQuery();

} // Query

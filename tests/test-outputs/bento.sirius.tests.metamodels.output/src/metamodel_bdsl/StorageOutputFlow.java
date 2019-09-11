/**
 */
package metamodel_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Output Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.StorageOutputFlow#getSource <em>Source</em>}</li>
 *   <li>{@link metamodel_bdsl.StorageOutputFlow#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorageOutputFlow()
 * @model
 * @generated
 */
public interface StorageOutputFlow extends Flow, BindingElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.Storage#getStorageOutputFlow <em>Storage Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Storage)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorageOutputFlow_Source()
	 * @see metamodel_bdsl.Storage#getStorageOutputFlow
	 * @model opposite="storageOutputFlow" required="true"
	 * @generated
	 */
	Storage getSource();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.StorageOutputFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Storage value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.Process#getStorageOutputFlow <em>Storage Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(metamodel_bdsl.Process)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorageOutputFlow_Destination()
	 * @see metamodel_bdsl.Process#getStorageOutputFlow
	 * @model opposite="storageOutputFlow" required="true"
	 * @generated
	 */
	metamodel_bdsl.Process getDestination();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.StorageOutputFlow#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(metamodel_bdsl.Process value);

} // StorageOutputFlow

/**
 */
package metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Output Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.ProcessOutputFlow#getSource <em>Source</em>}</li>
 *   <li>{@link metamodel.ProcessOutputFlow#getProcessOutputFlowDelay <em>Process Output Flow Delay</em>}</li>
 *   <li>{@link metamodel.ProcessOutputFlow#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getProcessOutputFlow()
 * @model
 * @generated
 */
public interface ProcessOutputFlow extends Flow {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel.Output#getProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Output)
	 * @see metamodel.MetamodelPackage#getProcessOutputFlow_Source()
	 * @see metamodel.Output#getProcessOutputFlow
	 * @model opposite="processOutputFlow" required="true"
	 * @generated
	 */
	Output getSource();

	/**
	 * Sets the value of the '{@link metamodel.ProcessOutputFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Output value);

	/**
	 * Returns the value of the '<em><b>Process Output Flow Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Output Flow Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Output Flow Delay</em>' containment reference.
	 * @see #setProcessOutputFlowDelay(Probability)
	 * @see metamodel.MetamodelPackage#getProcessOutputFlow_ProcessOutputFlowDelay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Probability getProcessOutputFlowDelay();

	/**
	 * Sets the value of the '{@link metamodel.ProcessOutputFlow#getProcessOutputFlowDelay <em>Process Output Flow Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Output Flow Delay</em>' containment reference.
	 * @see #getProcessOutputFlowDelay()
	 * @generated
	 */
	void setProcessOutputFlowDelay(Probability value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel.Storage#getProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Storage)
	 * @see metamodel.MetamodelPackage#getProcessOutputFlow_Destination()
	 * @see metamodel.Storage#getProcessOutputFlow
	 * @model opposite="processOutputFlow" required="true"
	 * @generated
	 */
	Storage getDestination();

	/**
	 * Sets the value of the '{@link metamodel.ProcessOutputFlow#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Storage value);

} // ProcessOutputFlow

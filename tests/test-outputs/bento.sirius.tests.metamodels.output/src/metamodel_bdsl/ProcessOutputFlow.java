/**
 */
package metamodel_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Output Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.ProcessOutputFlow#getSource <em>Source</em>}</li>
 *   <li>{@link metamodel_bdsl.ProcessOutputFlow#getProcessOutputFlowDelay <em>Process Output Flow Delay</em>}</li>
 *   <li>{@link metamodel_bdsl.ProcessOutputFlow#getDestination <em>Destination</em>}</li>
 *   <li>{@link metamodel_bdsl.ProcessOutputFlow#getEref_quantityProcessOutputFlow71 <em>Eref quantity Process Output Flow71</em>}</li>
 *   <li>{@link metamodel_bdsl.ProcessOutputFlow#getEref_sourceProcessOutputFlow72 <em>Eref source Process Output Flow72</em>}</li>
 *   <li>{@link metamodel_bdsl.ProcessOutputFlow#getEref_processOutputFlowDelayProcessOutputFlow73 <em>Eref process Output Flow Delay Process Output Flow73</em>}</li>
 *   <li>{@link metamodel_bdsl.ProcessOutputFlow#getEref_destinationProcessOutputFlow74 <em>Eref destination Process Output Flow74</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getProcessOutputFlow()
 * @model
 * @generated
 */
public interface ProcessOutputFlow extends Flow, BindingElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.Output#getProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Output)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getProcessOutputFlow_Source()
	 * @see metamodel_bdsl.Output#getProcessOutputFlow
	 * @model opposite="processOutputFlow" required="true"
	 * @generated
	 */
	Output getSource();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ProcessOutputFlow#getSource <em>Source</em>}' reference.
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
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getProcessOutputFlow_ProcessOutputFlowDelay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Probability getProcessOutputFlowDelay();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ProcessOutputFlow#getProcessOutputFlowDelay <em>Process Output Flow Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Output Flow Delay</em>' containment reference.
	 * @see #getProcessOutputFlowDelay()
	 * @generated
	 */
	void setProcessOutputFlowDelay(Probability value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.Storage#getProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Storage)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getProcessOutputFlow_Destination()
	 * @see metamodel_bdsl.Storage#getProcessOutputFlow
	 * @model opposite="processOutputFlow" required="true"
	 * @generated
	 */
	Storage getDestination();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ProcessOutputFlow#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Storage value);

	/**
	 * Returns the value of the '<em><b>Eref quantity Process Output Flow71</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref quantity Process Output Flow71</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref quantity Process Output Flow71</em>' containment reference.
	 * @see #setEref_quantityProcessOutputFlow71(quantityProcessOutputFlow71)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getProcessOutputFlow_Eref_quantityProcessOutputFlow71()
	 * @model containment="true"
	 * @generated
	 */
	quantityProcessOutputFlow71 getEref_quantityProcessOutputFlow71();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ProcessOutputFlow#getEref_quantityProcessOutputFlow71 <em>Eref quantity Process Output Flow71</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref quantity Process Output Flow71</em>' containment reference.
	 * @see #getEref_quantityProcessOutputFlow71()
	 * @generated
	 */
	void setEref_quantityProcessOutputFlow71(quantityProcessOutputFlow71 value);

	/**
	 * Returns the value of the '<em><b>Eref source Process Output Flow72</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref source Process Output Flow72</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref source Process Output Flow72</em>' containment reference.
	 * @see #setEref_sourceProcessOutputFlow72(sourceProcessOutputFlow72)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getProcessOutputFlow_Eref_sourceProcessOutputFlow72()
	 * @model containment="true"
	 * @generated
	 */
	sourceProcessOutputFlow72 getEref_sourceProcessOutputFlow72();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ProcessOutputFlow#getEref_sourceProcessOutputFlow72 <em>Eref source Process Output Flow72</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref source Process Output Flow72</em>' containment reference.
	 * @see #getEref_sourceProcessOutputFlow72()
	 * @generated
	 */
	void setEref_sourceProcessOutputFlow72(sourceProcessOutputFlow72 value);

	/**
	 * Returns the value of the '<em><b>Eref process Output Flow Delay Process Output Flow73</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref process Output Flow Delay Process Output Flow73</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref process Output Flow Delay Process Output Flow73</em>' containment reference.
	 * @see #setEref_processOutputFlowDelayProcessOutputFlow73(processOutputFlowDelayProcessOutputFlow73)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getProcessOutputFlow_Eref_processOutputFlowDelayProcessOutputFlow73()
	 * @model containment="true"
	 * @generated
	 */
	processOutputFlowDelayProcessOutputFlow73 getEref_processOutputFlowDelayProcessOutputFlow73();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ProcessOutputFlow#getEref_processOutputFlowDelayProcessOutputFlow73 <em>Eref process Output Flow Delay Process Output Flow73</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref process Output Flow Delay Process Output Flow73</em>' containment reference.
	 * @see #getEref_processOutputFlowDelayProcessOutputFlow73()
	 * @generated
	 */
	void setEref_processOutputFlowDelayProcessOutputFlow73(processOutputFlowDelayProcessOutputFlow73 value);

	/**
	 * Returns the value of the '<em><b>Eref destination Process Output Flow74</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref destination Process Output Flow74</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref destination Process Output Flow74</em>' containment reference.
	 * @see #setEref_destinationProcessOutputFlow74(destinationProcessOutputFlow74)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getProcessOutputFlow_Eref_destinationProcessOutputFlow74()
	 * @model containment="true"
	 * @generated
	 */
	destinationProcessOutputFlow74 getEref_destinationProcessOutputFlow74();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ProcessOutputFlow#getEref_destinationProcessOutputFlow74 <em>Eref destination Process Output Flow74</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref destination Process Output Flow74</em>' containment reference.
	 * @see #getEref_destinationProcessOutputFlow74()
	 * @generated
	 */
	void setEref_destinationProcessOutputFlow74(destinationProcessOutputFlow74 value);

} // ProcessOutputFlow

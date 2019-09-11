/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Output#getType <em>Type</em>}</li>
 *   <li>{@link metamodel_bdsl.Output#getProcessOutputFlow <em>Process Output Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.Output#getDescription <em>Description</em>}</li>
 *   <li>{@link metamodel_bdsl.Output#getContainstypeOutput <em>Containstype Output</em>}</li>
 *   <li>{@link metamodel_bdsl.Output#getContainsdescriptionOutput <em>Containsdescription Output</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends BindingElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel_bdsl.OutputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see metamodel_bdsl.OutputType
	 * @see #setType(OutputType)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOutput_Type()
	 * @model
	 * @generated
	 */
	OutputType getType();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Output#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see metamodel_bdsl.OutputType
	 * @see #getType()
	 * @generated
	 */
	void setType(OutputType value);

	/**
	 * Returns the value of the '<em><b>Process Output Flow</b></em>' reference list.
	 * The list contents are of type {@link metamodel_bdsl.ProcessOutputFlow}.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.ProcessOutputFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Output Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Output Flow</em>' reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOutput_ProcessOutputFlow()
	 * @see metamodel_bdsl.ProcessOutputFlow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ProcessOutputFlow> getProcessOutputFlow();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOutput_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Output#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Containstype Output</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.typeOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containstype Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containstype Output</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOutput_ContainstypeOutput()
	 * @model containment="true"
	 * @generated
	 */
	EList<typeOutput> getContainstypeOutput();

	/**
	 * Returns the value of the '<em><b>Containsdescription Output</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.descriptionOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsdescription Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsdescription Output</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOutput_ContainsdescriptionOutput()
	 * @model containment="true"
	 * @generated
	 */
	EList<descriptionOutput> getContainsdescriptionOutput();

} // Output

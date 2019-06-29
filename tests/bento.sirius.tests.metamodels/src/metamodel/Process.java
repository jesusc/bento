/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Process#getStorageOutputFlow <em>Storage Output Flow</em>}</li>
 *   <li>{@link metamodel.Process#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends Component {
	/**
	 * Returns the value of the '<em><b>Storage Output Flow</b></em>' reference list.
	 * The list contents are of type {@link metamodel.StorageOutputFlow}.
	 * It is bidirectional and its opposite is '{@link metamodel.StorageOutputFlow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Output Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Output Flow</em>' reference list.
	 * @see metamodel.MetamodelPackage#getProcess_StorageOutputFlow()
	 * @see metamodel.StorageOutputFlow#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<StorageOutputFlow> getStorageOutputFlow();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Probability)
	 * @see metamodel.MetamodelPackage#getProcess_Duration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Probability getDuration();

	/**
	 * Sets the value of the '{@link metamodel.Process#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Probability value);

} // Process

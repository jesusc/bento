/**
 */
package fta_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.Gate#getType <em>Type</em>}</li>
 *   <li>{@link fta_bdsl.Gate#getDescription <em>Description</em>}</li>
 *   <li>{@link fta_bdsl.Gate#getEvents <em>Events</em>}</li>
 *   <li>{@link fta_bdsl.Gate#getNbOccurrences <em>Nb Occurrences</em>}</li>
 *   <li>{@link fta_bdsl.Gate#getEref_eventsGate21 <em>Eref events Gate21</em>}</li>
 *   <li>{@link fta_bdsl.Gate#getContainstypeGate <em>Containstype Gate</em>}</li>
 *   <li>{@link fta_bdsl.Gate#getContainsdescriptionGate <em>Containsdescription Gate</em>}</li>
 *   <li>{@link fta_bdsl.Gate#getContainsnbOccurrencesGate <em>Containsnb Occurrences Gate</em>}</li>
 * </ul>
 *
 * @see fta_bdsl.Fta_bdslPackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends BindingElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fta_bdsl.GateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fta_bdsl.GateType
	 * @see #setType(GateType)
	 * @see fta_bdsl.Fta_bdslPackage#getGate_Type()
	 * @model
	 * @generated
	 */
	GateType getType();

	/**
	 * Sets the value of the '{@link fta_bdsl.Gate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fta_bdsl.GateType
	 * @see #getType()
	 * @generated
	 */
	void setType(GateType value);

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
	 * @see fta_bdsl.Fta_bdslPackage#getGate_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fta_bdsl.Gate#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link fta_bdsl.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getGate_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Nb Occurrences</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Occurrences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Occurrences</em>' attribute.
	 * @see #setNbOccurrences(int)
	 * @see fta_bdsl.Fta_bdslPackage#getGate_NbOccurrences()
	 * @model default="1"
	 * @generated
	 */
	int getNbOccurrences();

	/**
	 * Sets the value of the '{@link fta_bdsl.Gate#getNbOccurrences <em>Nb Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Occurrences</em>' attribute.
	 * @see #getNbOccurrences()
	 * @generated
	 */
	void setNbOccurrences(int value);

	/**
	 * Returns the value of the '<em><b>Eref events Gate21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref events Gate21</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref events Gate21</em>' containment reference.
	 * @see #setEref_eventsGate21(eventsGate21)
	 * @see fta_bdsl.Fta_bdslPackage#getGate_Eref_eventsGate21()
	 * @model containment="true"
	 * @generated
	 */
	eventsGate21 getEref_eventsGate21();

	/**
	 * Sets the value of the '{@link fta_bdsl.Gate#getEref_eventsGate21 <em>Eref events Gate21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref events Gate21</em>' containment reference.
	 * @see #getEref_eventsGate21()
	 * @generated
	 */
	void setEref_eventsGate21(eventsGate21 value);

	/**
	 * Returns the value of the '<em><b>Containstype Gate</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.typeGate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containstype Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containstype Gate</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getGate_ContainstypeGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<typeGate> getContainstypeGate();

	/**
	 * Returns the value of the '<em><b>Containsdescription Gate</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.descriptionGate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsdescription Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsdescription Gate</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getGate_ContainsdescriptionGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<descriptionGate> getContainsdescriptionGate();

	/**
	 * Returns the value of the '<em><b>Containsnb Occurrences Gate</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.nbOccurrencesGate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsnb Occurrences Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsnb Occurrences Gate</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getGate_ContainsnbOccurrencesGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<nbOccurrencesGate> getContainsnbOccurrencesGate();

} // Gate

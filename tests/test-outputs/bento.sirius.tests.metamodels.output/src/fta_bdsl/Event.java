/**
 */
package fta_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.Event#getType <em>Type</em>}</li>
 *   <li>{@link fta_bdsl.Event#getName <em>Name</em>}</li>
 *   <li>{@link fta_bdsl.Event#getProbability <em>Probability</em>}</li>
 *   <li>{@link fta_bdsl.Event#getDescription <em>Description</em>}</li>
 *   <li>{@link fta_bdsl.Event#getGate <em>Gate</em>}</li>
 *   <li>{@link fta_bdsl.Event#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link fta_bdsl.Event#getReferenceCount <em>Reference Count</em>}</li>
 *   <li>{@link fta_bdsl.Event#getEref_gateEvent11 <em>Eref gate Event11</em>}</li>
 *   <li>{@link fta_bdsl.Event#getContainstypeEvent <em>Containstype Event</em>}</li>
 *   <li>{@link fta_bdsl.Event#getContainsnameEvent <em>Containsname Event</em>}</li>
 *   <li>{@link fta_bdsl.Event#getContainsprobabilityEvent <em>Containsprobability Event</em>}</li>
 *   <li>{@link fta_bdsl.Event#getContainsdescriptionEvent <em>Containsdescription Event</em>}</li>
 *   <li>{@link fta_bdsl.Event#getContainsrelatedObjectEvent <em>Containsrelated Object Event</em>}</li>
 *   <li>{@link fta_bdsl.Event#getContainsreferenceCountEvent <em>Containsreference Count Event</em>}</li>
 * </ul>
 *
 * @see fta_bdsl.Fta_bdslPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends BindingElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fta_bdsl.EventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fta_bdsl.EventType
	 * @see #setType(EventType)
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_Type()
	 * @model
	 * @generated
	 */
	EventType getType();

	/**
	 * Sets the value of the '{@link fta_bdsl.Event#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fta_bdsl.EventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EventType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fta_bdsl.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_Probability()
	 * @model
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link fta_bdsl.Event#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

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
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fta_bdsl.Event#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Gate</b></em>' reference list.
	 * The list contents are of type {@link fta_bdsl.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_Gate()
	 * @model upper="2"
	 * @generated
	 */
	EList<Gate> getGate();

	/**
	 * Returns the value of the '<em><b>Related Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Object</em>' attribute list.
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_RelatedObject()
	 * @model
	 * @generated
	 */
	EList<Object> getRelatedObject();

	/**
	 * Returns the value of the '<em><b>Reference Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Count</em>' attribute.
	 * @see #setReferenceCount(int)
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_ReferenceCount()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getReferenceCount();

	/**
	 * Sets the value of the '{@link fta_bdsl.Event#getReferenceCount <em>Reference Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Count</em>' attribute.
	 * @see #getReferenceCount()
	 * @generated
	 */
	void setReferenceCount(int value);

	/**
	 * Returns the value of the '<em><b>Eref gate Event11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref gate Event11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref gate Event11</em>' containment reference.
	 * @see #setEref_gateEvent11(gateEvent11)
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_Eref_gateEvent11()
	 * @model containment="true"
	 * @generated
	 */
	gateEvent11 getEref_gateEvent11();

	/**
	 * Sets the value of the '{@link fta_bdsl.Event#getEref_gateEvent11 <em>Eref gate Event11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref gate Event11</em>' containment reference.
	 * @see #getEref_gateEvent11()
	 * @generated
	 */
	void setEref_gateEvent11(gateEvent11 value);

	/**
	 * Returns the value of the '<em><b>Containstype Event</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.typeEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containstype Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containstype Event</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_ContainstypeEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<typeEvent> getContainstypeEvent();

	/**
	 * Returns the value of the '<em><b>Containsname Event</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.nameEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Event</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_ContainsnameEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameEvent> getContainsnameEvent();

	/**
	 * Returns the value of the '<em><b>Containsprobability Event</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.probabilityEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsprobability Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsprobability Event</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_ContainsprobabilityEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<probabilityEvent> getContainsprobabilityEvent();

	/**
	 * Returns the value of the '<em><b>Containsdescription Event</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.descriptionEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsdescription Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsdescription Event</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_ContainsdescriptionEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<descriptionEvent> getContainsdescriptionEvent();

	/**
	 * Returns the value of the '<em><b>Containsrelated Object Event</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.relatedObjectEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsrelated Object Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsrelated Object Event</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_ContainsrelatedObjectEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<relatedObjectEvent> getContainsrelatedObjectEvent();

	/**
	 * Returns the value of the '<em><b>Containsreference Count Event</b></em>' containment reference list.
	 * The list contents are of type {@link fta_bdsl.referenceCountEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsreference Count Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsreference Count Event</em>' containment reference list.
	 * @see fta_bdsl.Fta_bdslPackage#getEvent_ContainsreferenceCountEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<referenceCountEvent> getContainsreferenceCountEvent();

} // Event

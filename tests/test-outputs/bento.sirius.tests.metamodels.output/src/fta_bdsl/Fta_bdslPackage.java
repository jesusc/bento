/**
 */
package fta_bdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fta_bdsl.Fta_bdslFactory
 * @model kind="package"
 * @generated
 */
public interface Fta_bdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fta_bdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.wakame.es/fta_bdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fta_bdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fta_bdslPackage eINSTANCE = fta_bdsl.impl.Fta_bdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.BindingElementImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getBindingElement()
	 * @generated
	 */
	int BINDING_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT__CONTAINS_SIRIUS_TAG = 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT__NONE_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.EventImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTAINS_SIRIUS_TAG = BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NONE_ELEMENT = BINDING_ELEMENT__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROBABILITY = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = BINDING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GATE = BINDING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Related Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RELATED_OBJECT = BINDING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reference Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REFERENCE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Eref gate Event11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EREF_GATE_EVENT11 = BINDING_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Containstype Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTAINSTYPE_EVENT = BINDING_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Containsname Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTAINSNAME_EVENT = BINDING_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Containsprobability Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTAINSPROBABILITY_EVENT = BINDING_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Containsdescription Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTAINSDESCRIPTION_EVENT = BINDING_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Containsrelated Object Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTAINSRELATED_OBJECT_EVENT = BINDING_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Containsreference Count Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTAINSREFERENCE_COUNT_EVENT = BINDING_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.GateImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 1;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CONTAINS_SIRIUS_TAG = BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NONE_ELEMENT = BINDING_ELEMENT__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__TYPE = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__DESCRIPTION = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__EVENTS = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nb Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NB_OCCURRENCES = BINDING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eref events Gate21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__EREF_EVENTS_GATE21 = BINDING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containstype Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CONTAINSTYPE_GATE = BINDING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Containsdescription Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CONTAINSDESCRIPTION_GATE = BINDING_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Containsnb Occurrences Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CONTAINSNB_OCCURRENCES_GATE = BINDING_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.FTAModelImpl <em>FTA Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.FTAModelImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getFTAModel()
	 * @generated
	 */
	int FTA_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__COMMENTS = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__GATES = 4;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__CONTAINS_NONE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__CONTAINS_BINDING_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__CONTAINS_INTERMEDIATE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__CONTAINS_METAMODEL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__CONTAINS_BINDING_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Source MM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL__SOURCE_MM = 12;

	/**
	 * The number of structural features of the '<em>FTA Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>FTA Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.BindingAttributeImpl <em>Binding Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.BindingAttributeImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getBindingAttribute()
	 * @generated
	 */
	int BINDING_ATTRIBUTE = 19;

	/**
	 * The number of structural features of the '<em>Binding Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.gateEvent11Impl <em>gate Event11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.gateEvent11Impl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getgateEvent11()
	 * @generated
	 */
	int GATE_EVENT11 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_EVENT11__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>gate Event11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_EVENT11_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>gate Event11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_EVENT11_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.eventsGate21Impl <em>events Gate21</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.eventsGate21Impl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#geteventsGate21()
	 * @generated
	 */
	int EVENTS_GATE21 = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_GATE21__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>events Gate21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_GATE21_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>events Gate21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTS_GATE21_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.typeEventImpl <em>type Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.typeEventImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#gettypeEvent()
	 * @generated
	 */
	int TYPE_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EVENT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>type Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EVENT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>type Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EVENT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.nameEventImpl <em>name Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.nameEventImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getnameEvent()
	 * @generated
	 */
	int NAME_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EVENT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EVENT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EVENT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.probabilityEventImpl <em>probability Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.probabilityEventImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getprobabilityEvent()
	 * @generated
	 */
	int PROBABILITY_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_EVENT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>probability Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_EVENT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>probability Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_EVENT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.descriptionEventImpl <em>description Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.descriptionEventImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getdescriptionEvent()
	 * @generated
	 */
	int DESCRIPTION_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_EVENT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>description Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_EVENT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>description Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_EVENT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.relatedObjectEventImpl <em>related Object Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.relatedObjectEventImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getrelatedObjectEvent()
	 * @generated
	 */
	int RELATED_OBJECT_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_OBJECT_EVENT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>related Object Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_OBJECT_EVENT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>related Object Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_OBJECT_EVENT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.referenceCountEventImpl <em>reference Count Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.referenceCountEventImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getreferenceCountEvent()
	 * @generated
	 */
	int REFERENCE_COUNT_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_COUNT_EVENT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>reference Count Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_COUNT_EVENT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>reference Count Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_COUNT_EVENT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.typeGateImpl <em>type Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.typeGateImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#gettypeGate()
	 * @generated
	 */
	int TYPE_GATE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GATE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>type Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GATE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>type Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GATE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.descriptionGateImpl <em>description Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.descriptionGateImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getdescriptionGate()
	 * @generated
	 */
	int DESCRIPTION_GATE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_GATE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>description Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_GATE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>description Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_GATE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.nbOccurrencesGateImpl <em>nb Occurrences Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.nbOccurrencesGateImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getnbOccurrencesGate()
	 * @generated
	 */
	int NB_OCCURRENCES_GATE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_OCCURRENCES_GATE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>nb Occurrences Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_OCCURRENCES_GATE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>nb Occurrences Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_OCCURRENCES_GATE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.NoneElementImpl <em>None Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.NoneElementImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getNoneElement()
	 * @generated
	 */
	int NONE_ELEMENT = 14;

	/**
	 * The number of structural features of the '<em>None Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>None Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.IntermediateElementImpl <em>Intermediate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.IntermediateElementImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getIntermediateElement()
	 * @generated
	 */
	int INTERMEDIATE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Binding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT__BINDING_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Intermediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intermediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.MetamodelElementImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getMetamodelElement()
	 * @generated
	 */
	int METAMODEL_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.MetamodelElementFeatureImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getMetamodelElementFeature()
	 * @generated
	 */
	int METAMODEL_ELEMENT_FEATURE = 18;

	/**
	 * The feature id for the '<em><b>Feature Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Element Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Element Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.VirtualAttributeImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getVirtualAttribute()
	 * @generated
	 */
	int VIRTUAL_ATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>To virtual Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Virtual Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Virtual Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.impl.SiriusTagImpl <em>Sirius Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.impl.SiriusTagImpl
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getSiriusTag()
	 * @generated
	 */
	int SIRIUS_TAG = 21;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_TAG__TAG = 0;

	/**
	 * The number of structural features of the '<em>Sirius Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sirius Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fta_bdsl.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.EventType
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 22;

	/**
	 * The meta object id for the '{@link fta_bdsl.GateType <em>Gate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fta_bdsl.GateType
	 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getGateType()
	 * @generated
	 */
	int GATE_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link fta_bdsl.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fta_bdsl.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.Event#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fta_bdsl.Event#getType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Type();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_bdsl.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.Event#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see fta_bdsl.Event#getProbability()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Probability();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fta_bdsl.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for the reference list '{@link fta_bdsl.Event#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gate</em>'.
	 * @see fta_bdsl.Event#getGate()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Gate();

	/**
	 * Returns the meta object for the attribute list '{@link fta_bdsl.Event#getRelatedObject <em>Related Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Related Object</em>'.
	 * @see fta_bdsl.Event#getRelatedObject()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_RelatedObject();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.Event#getReferenceCount <em>Reference Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Count</em>'.
	 * @see fta_bdsl.Event#getReferenceCount()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ReferenceCount();

	/**
	 * Returns the meta object for the containment reference '{@link fta_bdsl.Event#getEref_gateEvent11 <em>Eref gate Event11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref gate Event11</em>'.
	 * @see fta_bdsl.Event#getEref_gateEvent11()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Eref_gateEvent11();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Event#getContainstypeEvent <em>Containstype Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containstype Event</em>'.
	 * @see fta_bdsl.Event#getContainstypeEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ContainstypeEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Event#getContainsnameEvent <em>Containsname Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Event</em>'.
	 * @see fta_bdsl.Event#getContainsnameEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ContainsnameEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Event#getContainsprobabilityEvent <em>Containsprobability Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsprobability Event</em>'.
	 * @see fta_bdsl.Event#getContainsprobabilityEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ContainsprobabilityEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Event#getContainsdescriptionEvent <em>Containsdescription Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsdescription Event</em>'.
	 * @see fta_bdsl.Event#getContainsdescriptionEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ContainsdescriptionEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Event#getContainsrelatedObjectEvent <em>Containsrelated Object Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsrelated Object Event</em>'.
	 * @see fta_bdsl.Event#getContainsrelatedObjectEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ContainsrelatedObjectEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Event#getContainsreferenceCountEvent <em>Containsreference Count Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsreference Count Event</em>'.
	 * @see fta_bdsl.Event#getContainsreferenceCountEvent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ContainsreferenceCountEvent();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see fta_bdsl.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.Gate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fta_bdsl.Gate#getType()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Type();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.Gate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fta_bdsl.Gate#getDescription()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Description();

	/**
	 * Returns the meta object for the reference list '{@link fta_bdsl.Gate#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see fta_bdsl.Gate#getEvents()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Events();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.Gate#getNbOccurrences <em>Nb Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Occurrences</em>'.
	 * @see fta_bdsl.Gate#getNbOccurrences()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_NbOccurrences();

	/**
	 * Returns the meta object for the containment reference '{@link fta_bdsl.Gate#getEref_eventsGate21 <em>Eref events Gate21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref events Gate21</em>'.
	 * @see fta_bdsl.Gate#getEref_eventsGate21()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Eref_eventsGate21();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Gate#getContainstypeGate <em>Containstype Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containstype Gate</em>'.
	 * @see fta_bdsl.Gate#getContainstypeGate()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_ContainstypeGate();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Gate#getContainsdescriptionGate <em>Containsdescription Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsdescription Gate</em>'.
	 * @see fta_bdsl.Gate#getContainsdescriptionGate()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_ContainsdescriptionGate();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.Gate#getContainsnbOccurrencesGate <em>Containsnb Occurrences Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsnb Occurrences Gate</em>'.
	 * @see fta_bdsl.Gate#getContainsnbOccurrencesGate()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_ContainsnbOccurrencesGate();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.FTAModel <em>FTA Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTA Model</em>'.
	 * @see fta_bdsl.FTAModel
	 * @generated
	 */
	EClass getFTAModel();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.FTAModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_bdsl.FTAModel#getName()
	 * @see #getFTAModel()
	 * @generated
	 */
	EAttribute getFTAModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.FTAModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fta_bdsl.FTAModel#getDescription()
	 * @see #getFTAModel()
	 * @generated
	 */
	EAttribute getFTAModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.FTAModel#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see fta_bdsl.FTAModel#getComments()
	 * @see #getFTAModel()
	 * @generated
	 */
	EAttribute getFTAModel_Comments();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see fta_bdsl.FTAModel#getEvents()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see fta_bdsl.FTAModel#getGates()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getContainsNoneElement <em>Contains None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains None Element</em>'.
	 * @see fta_bdsl.FTAModel#getContainsNoneElement()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_ContainsNoneElement();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getContainsBindingElement <em>Contains Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Binding Element</em>'.
	 * @see fta_bdsl.FTAModel#getContainsBindingElement()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_ContainsBindingElement();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getContainsIntermediateElement <em>Contains Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Intermediate Element</em>'.
	 * @see fta_bdsl.FTAModel#getContainsIntermediateElement()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_ContainsIntermediateElement();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getContainsMetamodelElement <em>Contains Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element</em>'.
	 * @see fta_bdsl.FTAModel#getContainsMetamodelElement()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_ContainsMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element Feature</em>'.
	 * @see fta_bdsl.FTAModel#getContainsMetamodelElementFeature()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_ContainsMetamodelElementFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getContainsBindingAttribute <em>Contains Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Binding Attribute</em>'.
	 * @see fta_bdsl.FTAModel#getContainsBindingAttribute()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_ContainsBindingAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.FTAModel#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Virtual Attribute</em>'.
	 * @see fta_bdsl.FTAModel#getContainsVirtualAttribute()
	 * @see #getFTAModel()
	 * @generated
	 */
	EReference getFTAModel_ContainsVirtualAttribute();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.FTAModel#getSourceMM <em>Source MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source MM</em>'.
	 * @see fta_bdsl.FTAModel#getSourceMM()
	 * @see #getFTAModel()
	 * @generated
	 */
	EAttribute getFTAModel_SourceMM();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.gateEvent11 <em>gate Event11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>gate Event11</em>'.
	 * @see fta_bdsl.gateEvent11
	 * @generated
	 */
	EClass getgateEvent11();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.gateEvent11#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_bdsl.gateEvent11#getName()
	 * @see #getgateEvent11()
	 * @generated
	 */
	EAttribute getgateEvent11_Name();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.eventsGate21 <em>events Gate21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>events Gate21</em>'.
	 * @see fta_bdsl.eventsGate21
	 * @generated
	 */
	EClass geteventsGate21();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.eventsGate21#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_bdsl.eventsGate21#getName()
	 * @see #geteventsGate21()
	 * @generated
	 */
	EAttribute geteventsGate21_Name();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.typeEvent <em>type Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>type Event</em>'.
	 * @see fta_bdsl.typeEvent
	 * @generated
	 */
	EClass gettypeEvent();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.typeEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.typeEvent#getValue()
	 * @see #gettypeEvent()
	 * @generated
	 */
	EAttribute gettypeEvent_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.nameEvent <em>name Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Event</em>'.
	 * @see fta_bdsl.nameEvent
	 * @generated
	 */
	EClass getnameEvent();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.nameEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.nameEvent#getValue()
	 * @see #getnameEvent()
	 * @generated
	 */
	EAttribute getnameEvent_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.probabilityEvent <em>probability Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>probability Event</em>'.
	 * @see fta_bdsl.probabilityEvent
	 * @generated
	 */
	EClass getprobabilityEvent();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.probabilityEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.probabilityEvent#getValue()
	 * @see #getprobabilityEvent()
	 * @generated
	 */
	EAttribute getprobabilityEvent_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.descriptionEvent <em>description Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>description Event</em>'.
	 * @see fta_bdsl.descriptionEvent
	 * @generated
	 */
	EClass getdescriptionEvent();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.descriptionEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.descriptionEvent#getValue()
	 * @see #getdescriptionEvent()
	 * @generated
	 */
	EAttribute getdescriptionEvent_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.relatedObjectEvent <em>related Object Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>related Object Event</em>'.
	 * @see fta_bdsl.relatedObjectEvent
	 * @generated
	 */
	EClass getrelatedObjectEvent();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.relatedObjectEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.relatedObjectEvent#getValue()
	 * @see #getrelatedObjectEvent()
	 * @generated
	 */
	EAttribute getrelatedObjectEvent_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.referenceCountEvent <em>reference Count Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>reference Count Event</em>'.
	 * @see fta_bdsl.referenceCountEvent
	 * @generated
	 */
	EClass getreferenceCountEvent();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.referenceCountEvent#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.referenceCountEvent#getValue()
	 * @see #getreferenceCountEvent()
	 * @generated
	 */
	EAttribute getreferenceCountEvent_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.typeGate <em>type Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>type Gate</em>'.
	 * @see fta_bdsl.typeGate
	 * @generated
	 */
	EClass gettypeGate();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.typeGate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.typeGate#getValue()
	 * @see #gettypeGate()
	 * @generated
	 */
	EAttribute gettypeGate_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.descriptionGate <em>description Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>description Gate</em>'.
	 * @see fta_bdsl.descriptionGate
	 * @generated
	 */
	EClass getdescriptionGate();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.descriptionGate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.descriptionGate#getValue()
	 * @see #getdescriptionGate()
	 * @generated
	 */
	EAttribute getdescriptionGate_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.nbOccurrencesGate <em>nb Occurrences Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>nb Occurrences Gate</em>'.
	 * @see fta_bdsl.nbOccurrencesGate
	 * @generated
	 */
	EClass getnbOccurrencesGate();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.nbOccurrencesGate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fta_bdsl.nbOccurrencesGate#getValue()
	 * @see #getnbOccurrencesGate()
	 * @generated
	 */
	EAttribute getnbOccurrencesGate_Value();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.NoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Element</em>'.
	 * @see fta_bdsl.NoneElement
	 * @generated
	 */
	EClass getNoneElement();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Element</em>'.
	 * @see fta_bdsl.BindingElement
	 * @generated
	 */
	EClass getBindingElement();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.BindingElement#getContainsSiriusTag <em>Contains Sirius Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Sirius Tag</em>'.
	 * @see fta_bdsl.BindingElement#getContainsSiriusTag()
	 * @see #getBindingElement()
	 * @generated
	 */
	EReference getBindingElement_ContainsSiriusTag();

	/**
	 * Returns the meta object for the reference list '{@link fta_bdsl.BindingElement#getNoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>None Element</em>'.
	 * @see fta_bdsl.BindingElement#getNoneElement()
	 * @see #getBindingElement()
	 * @generated
	 */
	EReference getBindingElement_NoneElement();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.IntermediateElement <em>Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Element</em>'.
	 * @see fta_bdsl.IntermediateElement
	 * @generated
	 */
	EClass getIntermediateElement();

	/**
	 * Returns the meta object for the reference '{@link fta_bdsl.IntermediateElement#getBindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Element</em>'.
	 * @see fta_bdsl.IntermediateElement#getBindingElement()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EReference getIntermediateElement_BindingElement();

	/**
	 * Returns the meta object for the reference list '{@link fta_bdsl.IntermediateElement#getMetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodel Element</em>'.
	 * @see fta_bdsl.IntermediateElement#getMetamodelElement()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EReference getIntermediateElement_MetamodelElement();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element</em>'.
	 * @see fta_bdsl.MetamodelElement
	 * @generated
	 */
	EClass getMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.MetamodelElement#getVirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Attribute</em>'.
	 * @see fta_bdsl.MetamodelElement#getVirtualAttribute()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_VirtualAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link fta_bdsl.MetamodelElement#getMetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel Element Feature</em>'.
	 * @see fta_bdsl.MetamodelElement#getMetamodelElementFeature()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_MetamodelElementFeature();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.MetamodelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_bdsl.MetamodelElement#getName()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EAttribute getMetamodelElement_Name();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element Feature</em>'.
	 * @see fta_bdsl.MetamodelElementFeature
	 * @generated
	 */
	EClass getMetamodelElementFeature();

	/**
	 * Returns the meta object for the reference list '{@link fta_bdsl.MetamodelElementFeature#getFeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Class</em>'.
	 * @see fta_bdsl.MetamodelElementFeature#getFeatureClass()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EReference getMetamodelElementFeature_FeatureClass();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.MetamodelElementFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_bdsl.MetamodelElementFeature#getName()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EAttribute getMetamodelElementFeature_Name();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.BindingAttribute <em>Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Attribute</em>'.
	 * @see fta_bdsl.BindingAttribute
	 * @generated
	 */
	EClass getBindingAttribute();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.VirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Attribute</em>'.
	 * @see fta_bdsl.VirtualAttribute
	 * @generated
	 */
	EClass getVirtualAttribute();

	/**
	 * Returns the meta object for the reference '{@link fta_bdsl.VirtualAttribute#getTo_virtualAttribute <em>To virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To virtual Attribute</em>'.
	 * @see fta_bdsl.VirtualAttribute#getTo_virtualAttribute()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EReference getVirtualAttribute_To_virtualAttribute();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.VirtualAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fta_bdsl.VirtualAttribute#getName()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EAttribute getVirtualAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.VirtualAttribute#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see fta_bdsl.VirtualAttribute#getExpression()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EAttribute getVirtualAttribute_Expression();

	/**
	 * Returns the meta object for class '{@link fta_bdsl.SiriusTag <em>Sirius Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Tag</em>'.
	 * @see fta_bdsl.SiriusTag
	 * @generated
	 */
	EClass getSiriusTag();

	/**
	 * Returns the meta object for the attribute '{@link fta_bdsl.SiriusTag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see fta_bdsl.SiriusTag#getTag()
	 * @see #getSiriusTag()
	 * @generated
	 */
	EAttribute getSiriusTag_Tag();

	/**
	 * Returns the meta object for enum '{@link fta_bdsl.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see fta_bdsl.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link fta_bdsl.GateType <em>Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gate Type</em>'.
	 * @see fta_bdsl.GateType
	 * @generated
	 */
	EEnum getGateType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Fta_bdslFactory getFta_bdslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.EventImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPE = eINSTANCE.getEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__PROBABILITY = eINSTANCE.getEvent_Probability();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__GATE = eINSTANCE.getEvent_Gate();

		/**
		 * The meta object literal for the '<em><b>Related Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__RELATED_OBJECT = eINSTANCE.getEvent_RelatedObject();

		/**
		 * The meta object literal for the '<em><b>Reference Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__REFERENCE_COUNT = eINSTANCE.getEvent_ReferenceCount();

		/**
		 * The meta object literal for the '<em><b>Eref gate Event11</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__EREF_GATE_EVENT11 = eINSTANCE.getEvent_Eref_gateEvent11();

		/**
		 * The meta object literal for the '<em><b>Containstype Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTAINSTYPE_EVENT = eINSTANCE.getEvent_ContainstypeEvent();

		/**
		 * The meta object literal for the '<em><b>Containsname Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTAINSNAME_EVENT = eINSTANCE.getEvent_ContainsnameEvent();

		/**
		 * The meta object literal for the '<em><b>Containsprobability Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTAINSPROBABILITY_EVENT = eINSTANCE.getEvent_ContainsprobabilityEvent();

		/**
		 * The meta object literal for the '<em><b>Containsdescription Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTAINSDESCRIPTION_EVENT = eINSTANCE.getEvent_ContainsdescriptionEvent();

		/**
		 * The meta object literal for the '<em><b>Containsrelated Object Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTAINSRELATED_OBJECT_EVENT = eINSTANCE.getEvent_ContainsrelatedObjectEvent();

		/**
		 * The meta object literal for the '<em><b>Containsreference Count Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTAINSREFERENCE_COUNT_EVENT = eINSTANCE.getEvent_ContainsreferenceCountEvent();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.GateImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__TYPE = eINSTANCE.getGate_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__DESCRIPTION = eINSTANCE.getGate_Description();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__EVENTS = eINSTANCE.getGate_Events();

		/**
		 * The meta object literal for the '<em><b>Nb Occurrences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__NB_OCCURRENCES = eINSTANCE.getGate_NbOccurrences();

		/**
		 * The meta object literal for the '<em><b>Eref events Gate21</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__EREF_EVENTS_GATE21 = eINSTANCE.getGate_Eref_eventsGate21();

		/**
		 * The meta object literal for the '<em><b>Containstype Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__CONTAINSTYPE_GATE = eINSTANCE.getGate_ContainstypeGate();

		/**
		 * The meta object literal for the '<em><b>Containsdescription Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__CONTAINSDESCRIPTION_GATE = eINSTANCE.getGate_ContainsdescriptionGate();

		/**
		 * The meta object literal for the '<em><b>Containsnb Occurrences Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__CONTAINSNB_OCCURRENCES_GATE = eINSTANCE.getGate_ContainsnbOccurrencesGate();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.FTAModelImpl <em>FTA Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.FTAModelImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getFTAModel()
		 * @generated
		 */
		EClass FTA_MODEL = eINSTANCE.getFTAModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTA_MODEL__NAME = eINSTANCE.getFTAModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTA_MODEL__DESCRIPTION = eINSTANCE.getFTAModel_Description();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTA_MODEL__COMMENTS = eINSTANCE.getFTAModel_Comments();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__EVENTS = eINSTANCE.getFTAModel_Events();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__GATES = eINSTANCE.getFTAModel_Gates();

		/**
		 * The meta object literal for the '<em><b>Contains None Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__CONTAINS_NONE_ELEMENT = eINSTANCE.getFTAModel_ContainsNoneElement();

		/**
		 * The meta object literal for the '<em><b>Contains Binding Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__CONTAINS_BINDING_ELEMENT = eINSTANCE.getFTAModel_ContainsBindingElement();

		/**
		 * The meta object literal for the '<em><b>Contains Intermediate Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__CONTAINS_INTERMEDIATE_ELEMENT = eINSTANCE.getFTAModel_ContainsIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__CONTAINS_METAMODEL_ELEMENT = eINSTANCE.getFTAModel_ContainsMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE = eINSTANCE.getFTAModel_ContainsMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Contains Binding Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__CONTAINS_BINDING_ATTRIBUTE = eINSTANCE.getFTAModel_ContainsBindingAttribute();

		/**
		 * The meta object literal for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTA_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE = eINSTANCE.getFTAModel_ContainsVirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Source MM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTA_MODEL__SOURCE_MM = eINSTANCE.getFTAModel_SourceMM();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.gateEvent11Impl <em>gate Event11</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.gateEvent11Impl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getgateEvent11()
		 * @generated
		 */
		EClass GATE_EVENT11 = eINSTANCE.getgateEvent11();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE_EVENT11__NAME = eINSTANCE.getgateEvent11_Name();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.eventsGate21Impl <em>events Gate21</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.eventsGate21Impl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#geteventsGate21()
		 * @generated
		 */
		EClass EVENTS_GATE21 = eINSTANCE.geteventsGate21();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENTS_GATE21__NAME = eINSTANCE.geteventsGate21_Name();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.typeEventImpl <em>type Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.typeEventImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#gettypeEvent()
		 * @generated
		 */
		EClass TYPE_EVENT = eINSTANCE.gettypeEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_EVENT__VALUE = eINSTANCE.gettypeEvent_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.nameEventImpl <em>name Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.nameEventImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getnameEvent()
		 * @generated
		 */
		EClass NAME_EVENT = eINSTANCE.getnameEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_EVENT__VALUE = eINSTANCE.getnameEvent_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.probabilityEventImpl <em>probability Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.probabilityEventImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getprobabilityEvent()
		 * @generated
		 */
		EClass PROBABILITY_EVENT = eINSTANCE.getprobabilityEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBABILITY_EVENT__VALUE = eINSTANCE.getprobabilityEvent_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.descriptionEventImpl <em>description Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.descriptionEventImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getdescriptionEvent()
		 * @generated
		 */
		EClass DESCRIPTION_EVENT = eINSTANCE.getdescriptionEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_EVENT__VALUE = eINSTANCE.getdescriptionEvent_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.relatedObjectEventImpl <em>related Object Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.relatedObjectEventImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getrelatedObjectEvent()
		 * @generated
		 */
		EClass RELATED_OBJECT_EVENT = eINSTANCE.getrelatedObjectEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_OBJECT_EVENT__VALUE = eINSTANCE.getrelatedObjectEvent_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.referenceCountEventImpl <em>reference Count Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.referenceCountEventImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getreferenceCountEvent()
		 * @generated
		 */
		EClass REFERENCE_COUNT_EVENT = eINSTANCE.getreferenceCountEvent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_COUNT_EVENT__VALUE = eINSTANCE.getreferenceCountEvent_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.typeGateImpl <em>type Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.typeGateImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#gettypeGate()
		 * @generated
		 */
		EClass TYPE_GATE = eINSTANCE.gettypeGate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_GATE__VALUE = eINSTANCE.gettypeGate_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.descriptionGateImpl <em>description Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.descriptionGateImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getdescriptionGate()
		 * @generated
		 */
		EClass DESCRIPTION_GATE = eINSTANCE.getdescriptionGate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_GATE__VALUE = eINSTANCE.getdescriptionGate_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.nbOccurrencesGateImpl <em>nb Occurrences Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.nbOccurrencesGateImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getnbOccurrencesGate()
		 * @generated
		 */
		EClass NB_OCCURRENCES_GATE = eINSTANCE.getnbOccurrencesGate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB_OCCURRENCES_GATE__VALUE = eINSTANCE.getnbOccurrencesGate_Value();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.NoneElementImpl <em>None Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.NoneElementImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getNoneElement()
		 * @generated
		 */
		EClass NONE_ELEMENT = eINSTANCE.getNoneElement();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.BindingElementImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getBindingElement()
		 * @generated
		 */
		EClass BINDING_ELEMENT = eINSTANCE.getBindingElement();

		/**
		 * The meta object literal for the '<em><b>Contains Sirius Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ELEMENT__CONTAINS_SIRIUS_TAG = eINSTANCE.getBindingElement_ContainsSiriusTag();

		/**
		 * The meta object literal for the '<em><b>None Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ELEMENT__NONE_ELEMENT = eINSTANCE.getBindingElement_NoneElement();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.IntermediateElementImpl <em>Intermediate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.IntermediateElementImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getIntermediateElement()
		 * @generated
		 */
		EClass INTERMEDIATE_ELEMENT = eINSTANCE.getIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Binding Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_ELEMENT__BINDING_ELEMENT = eINSTANCE.getIntermediateElement_BindingElement();

		/**
		 * The meta object literal for the '<em><b>Metamodel Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT = eINSTANCE.getIntermediateElement_MetamodelElement();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.MetamodelElementImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getMetamodelElement()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT = eINSTANCE.getMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Virtual Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE = eINSTANCE.getMetamodelElement_VirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElement_MetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT__NAME = eINSTANCE.getMetamodelElement_Name();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.MetamodelElementFeatureImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getMetamodelElementFeature()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = eINSTANCE.getMetamodelElementFeature_FeatureClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_FEATURE__NAME = eINSTANCE.getMetamodelElementFeature_Name();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.BindingAttributeImpl <em>Binding Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.BindingAttributeImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getBindingAttribute()
		 * @generated
		 */
		EClass BINDING_ATTRIBUTE = eINSTANCE.getBindingAttribute();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.VirtualAttributeImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getVirtualAttribute()
		 * @generated
		 */
		EClass VIRTUAL_ATTRIBUTE = eINSTANCE.getVirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>To virtual Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE = eINSTANCE.getVirtualAttribute_To_virtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ATTRIBUTE__NAME = eINSTANCE.getVirtualAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ATTRIBUTE__EXPRESSION = eINSTANCE.getVirtualAttribute_Expression();

		/**
		 * The meta object literal for the '{@link fta_bdsl.impl.SiriusTagImpl <em>Sirius Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.impl.SiriusTagImpl
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getSiriusTag()
		 * @generated
		 */
		EClass SIRIUS_TAG = eINSTANCE.getSiriusTag();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIRIUS_TAG__TAG = eINSTANCE.getSiriusTag_Tag();

		/**
		 * The meta object literal for the '{@link fta_bdsl.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.EventType
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link fta_bdsl.GateType <em>Gate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fta_bdsl.GateType
		 * @see fta_bdsl.impl.Fta_bdslPackageImpl#getGateType()
		 * @generated
		 */
		EEnum GATE_TYPE = eINSTANCE.getGateType();

	}

} //Fta_bdslPackage

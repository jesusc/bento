/**
 */
package fta_bdsl.impl;

import fta_bdsl.Event;
import fta_bdsl.EventType;
import fta_bdsl.Fta_bdslPackage;
import fta_bdsl.Gate;
import fta_bdsl.descriptionEvent;
import fta_bdsl.gateEvent11;
import fta_bdsl.nameEvent;
import fta_bdsl.probabilityEvent;
import fta_bdsl.referenceCountEvent;
import fta_bdsl.relatedObjectEvent;
import fta_bdsl.typeEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.impl.EventImpl#getType <em>Type</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getRelatedObject <em>Related Object</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getReferenceCount <em>Reference Count</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getEref_gateEvent11 <em>Eref gate Event11</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getContainstypeEvent <em>Containstype Event</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getContainsnameEvent <em>Containsname Event</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getContainsprobabilityEvent <em>Containsprobability Event</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getContainsdescriptionEvent <em>Containsdescription Event</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getContainsrelatedObjectEvent <em>Containsrelated Object Event</em>}</li>
 *   <li>{@link fta_bdsl.impl.EventImpl#getContainsreferenceCountEvent <em>Containsreference Count Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends BindingElementImpl implements Event {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EventType TYPE_EDEFAULT = EventType.BASIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EventType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGate() <em>Gate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gate;

	/**
	 * The cached value of the '{@link #getRelatedObject() <em>Related Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> relatedObject;

	/**
	 * The default value of the '{@link #getReferenceCount() <em>Reference Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REFERENCE_COUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getReferenceCount() <em>Reference Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCount()
	 * @generated
	 * @ordered
	 */
	protected int referenceCount = REFERENCE_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEref_gateEvent11() <em>Eref gate Event11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_gateEvent11()
	 * @generated
	 * @ordered
	 */
	protected gateEvent11 eref_gateEvent11;

	/**
	 * The cached value of the '{@link #getContainstypeEvent() <em>Containstype Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainstypeEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<typeEvent> containstypeEvent;

	/**
	 * The cached value of the '{@link #getContainsnameEvent() <em>Containsname Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<nameEvent> containsnameEvent;

	/**
	 * The cached value of the '{@link #getContainsprobabilityEvent() <em>Containsprobability Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsprobabilityEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<probabilityEvent> containsprobabilityEvent;

	/**
	 * The cached value of the '{@link #getContainsdescriptionEvent() <em>Containsdescription Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsdescriptionEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<descriptionEvent> containsdescriptionEvent;

	/**
	 * The cached value of the '{@link #getContainsrelatedObjectEvent() <em>Containsrelated Object Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsrelatedObjectEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<relatedObjectEvent> containsrelatedObjectEvent;

	/**
	 * The cached value of the '{@link #getContainsreferenceCountEvent() <em>Containsreference Count Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsreferenceCountEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<referenceCountEvent> containsreferenceCountEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_bdslPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EventType newType) {
		EventType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.EVENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.EVENT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.EVENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gate> getGate() {
		if (gate == null) {
			gate = new EObjectResolvingEList<Gate>(Gate.class, this, Fta_bdslPackage.EVENT__GATE);
		}
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getRelatedObject() {
		if (relatedObject == null) {
			relatedObject = new EDataTypeUniqueEList<Object>(Object.class, this, Fta_bdslPackage.EVENT__RELATED_OBJECT);
		}
		return relatedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReferenceCount() {
		return referenceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceCount(int newReferenceCount) {
		int oldReferenceCount = referenceCount;
		referenceCount = newReferenceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.EVENT__REFERENCE_COUNT, oldReferenceCount, referenceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public gateEvent11 getEref_gateEvent11() {
		return eref_gateEvent11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_gateEvent11(gateEvent11 newEref_gateEvent11, NotificationChain msgs) {
		gateEvent11 oldEref_gateEvent11 = eref_gateEvent11;
		eref_gateEvent11 = newEref_gateEvent11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.EVENT__EREF_GATE_EVENT11, oldEref_gateEvent11, newEref_gateEvent11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEref_gateEvent11(gateEvent11 newEref_gateEvent11) {
		if (newEref_gateEvent11 != eref_gateEvent11) {
			NotificationChain msgs = null;
			if (eref_gateEvent11 != null)
				msgs = ((InternalEObject)eref_gateEvent11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fta_bdslPackage.EVENT__EREF_GATE_EVENT11, null, msgs);
			if (newEref_gateEvent11 != null)
				msgs = ((InternalEObject)newEref_gateEvent11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fta_bdslPackage.EVENT__EREF_GATE_EVENT11, null, msgs);
			msgs = basicSetEref_gateEvent11(newEref_gateEvent11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.EVENT__EREF_GATE_EVENT11, newEref_gateEvent11, newEref_gateEvent11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<typeEvent> getContainstypeEvent() {
		if (containstypeEvent == null) {
			containstypeEvent = new EObjectContainmentEList<typeEvent>(typeEvent.class, this, Fta_bdslPackage.EVENT__CONTAINSTYPE_EVENT);
		}
		return containstypeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<nameEvent> getContainsnameEvent() {
		if (containsnameEvent == null) {
			containsnameEvent = new EObjectContainmentEList<nameEvent>(nameEvent.class, this, Fta_bdslPackage.EVENT__CONTAINSNAME_EVENT);
		}
		return containsnameEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<probabilityEvent> getContainsprobabilityEvent() {
		if (containsprobabilityEvent == null) {
			containsprobabilityEvent = new EObjectContainmentEList<probabilityEvent>(probabilityEvent.class, this, Fta_bdslPackage.EVENT__CONTAINSPROBABILITY_EVENT);
		}
		return containsprobabilityEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<descriptionEvent> getContainsdescriptionEvent() {
		if (containsdescriptionEvent == null) {
			containsdescriptionEvent = new EObjectContainmentEList<descriptionEvent>(descriptionEvent.class, this, Fta_bdslPackage.EVENT__CONTAINSDESCRIPTION_EVENT);
		}
		return containsdescriptionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<relatedObjectEvent> getContainsrelatedObjectEvent() {
		if (containsrelatedObjectEvent == null) {
			containsrelatedObjectEvent = new EObjectContainmentEList<relatedObjectEvent>(relatedObjectEvent.class, this, Fta_bdslPackage.EVENT__CONTAINSRELATED_OBJECT_EVENT);
		}
		return containsrelatedObjectEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<referenceCountEvent> getContainsreferenceCountEvent() {
		if (containsreferenceCountEvent == null) {
			containsreferenceCountEvent = new EObjectContainmentEList<referenceCountEvent>(referenceCountEvent.class, this, Fta_bdslPackage.EVENT__CONTAINSREFERENCE_COUNT_EVENT);
		}
		return containsreferenceCountEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fta_bdslPackage.EVENT__EREF_GATE_EVENT11:
				return basicSetEref_gateEvent11(null, msgs);
			case Fta_bdslPackage.EVENT__CONTAINSTYPE_EVENT:
				return ((InternalEList<?>)getContainstypeEvent()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.EVENT__CONTAINSNAME_EVENT:
				return ((InternalEList<?>)getContainsnameEvent()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.EVENT__CONTAINSPROBABILITY_EVENT:
				return ((InternalEList<?>)getContainsprobabilityEvent()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.EVENT__CONTAINSDESCRIPTION_EVENT:
				return ((InternalEList<?>)getContainsdescriptionEvent()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.EVENT__CONTAINSRELATED_OBJECT_EVENT:
				return ((InternalEList<?>)getContainsrelatedObjectEvent()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.EVENT__CONTAINSREFERENCE_COUNT_EVENT:
				return ((InternalEList<?>)getContainsreferenceCountEvent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fta_bdslPackage.EVENT__TYPE:
				return getType();
			case Fta_bdslPackage.EVENT__NAME:
				return getName();
			case Fta_bdslPackage.EVENT__PROBABILITY:
				return getProbability();
			case Fta_bdslPackage.EVENT__DESCRIPTION:
				return getDescription();
			case Fta_bdslPackage.EVENT__GATE:
				return getGate();
			case Fta_bdslPackage.EVENT__RELATED_OBJECT:
				return getRelatedObject();
			case Fta_bdslPackage.EVENT__REFERENCE_COUNT:
				return getReferenceCount();
			case Fta_bdslPackage.EVENT__EREF_GATE_EVENT11:
				return getEref_gateEvent11();
			case Fta_bdslPackage.EVENT__CONTAINSTYPE_EVENT:
				return getContainstypeEvent();
			case Fta_bdslPackage.EVENT__CONTAINSNAME_EVENT:
				return getContainsnameEvent();
			case Fta_bdslPackage.EVENT__CONTAINSPROBABILITY_EVENT:
				return getContainsprobabilityEvent();
			case Fta_bdslPackage.EVENT__CONTAINSDESCRIPTION_EVENT:
				return getContainsdescriptionEvent();
			case Fta_bdslPackage.EVENT__CONTAINSRELATED_OBJECT_EVENT:
				return getContainsrelatedObjectEvent();
			case Fta_bdslPackage.EVENT__CONTAINSREFERENCE_COUNT_EVENT:
				return getContainsreferenceCountEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Fta_bdslPackage.EVENT__TYPE:
				setType((EventType)newValue);
				return;
			case Fta_bdslPackage.EVENT__NAME:
				setName((String)newValue);
				return;
			case Fta_bdslPackage.EVENT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case Fta_bdslPackage.EVENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Fta_bdslPackage.EVENT__GATE:
				getGate().clear();
				getGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case Fta_bdslPackage.EVENT__RELATED_OBJECT:
				getRelatedObject().clear();
				getRelatedObject().addAll((Collection<? extends Object>)newValue);
				return;
			case Fta_bdslPackage.EVENT__REFERENCE_COUNT:
				setReferenceCount((Integer)newValue);
				return;
			case Fta_bdslPackage.EVENT__EREF_GATE_EVENT11:
				setEref_gateEvent11((gateEvent11)newValue);
				return;
			case Fta_bdslPackage.EVENT__CONTAINSTYPE_EVENT:
				getContainstypeEvent().clear();
				getContainstypeEvent().addAll((Collection<? extends typeEvent>)newValue);
				return;
			case Fta_bdslPackage.EVENT__CONTAINSNAME_EVENT:
				getContainsnameEvent().clear();
				getContainsnameEvent().addAll((Collection<? extends nameEvent>)newValue);
				return;
			case Fta_bdslPackage.EVENT__CONTAINSPROBABILITY_EVENT:
				getContainsprobabilityEvent().clear();
				getContainsprobabilityEvent().addAll((Collection<? extends probabilityEvent>)newValue);
				return;
			case Fta_bdslPackage.EVENT__CONTAINSDESCRIPTION_EVENT:
				getContainsdescriptionEvent().clear();
				getContainsdescriptionEvent().addAll((Collection<? extends descriptionEvent>)newValue);
				return;
			case Fta_bdslPackage.EVENT__CONTAINSRELATED_OBJECT_EVENT:
				getContainsrelatedObjectEvent().clear();
				getContainsrelatedObjectEvent().addAll((Collection<? extends relatedObjectEvent>)newValue);
				return;
			case Fta_bdslPackage.EVENT__CONTAINSREFERENCE_COUNT_EVENT:
				getContainsreferenceCountEvent().clear();
				getContainsreferenceCountEvent().addAll((Collection<? extends referenceCountEvent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Fta_bdslPackage.EVENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Fta_bdslPackage.EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Fta_bdslPackage.EVENT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case Fta_bdslPackage.EVENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Fta_bdslPackage.EVENT__GATE:
				getGate().clear();
				return;
			case Fta_bdslPackage.EVENT__RELATED_OBJECT:
				getRelatedObject().clear();
				return;
			case Fta_bdslPackage.EVENT__REFERENCE_COUNT:
				setReferenceCount(REFERENCE_COUNT_EDEFAULT);
				return;
			case Fta_bdslPackage.EVENT__EREF_GATE_EVENT11:
				setEref_gateEvent11((gateEvent11)null);
				return;
			case Fta_bdslPackage.EVENT__CONTAINSTYPE_EVENT:
				getContainstypeEvent().clear();
				return;
			case Fta_bdslPackage.EVENT__CONTAINSNAME_EVENT:
				getContainsnameEvent().clear();
				return;
			case Fta_bdslPackage.EVENT__CONTAINSPROBABILITY_EVENT:
				getContainsprobabilityEvent().clear();
				return;
			case Fta_bdslPackage.EVENT__CONTAINSDESCRIPTION_EVENT:
				getContainsdescriptionEvent().clear();
				return;
			case Fta_bdslPackage.EVENT__CONTAINSRELATED_OBJECT_EVENT:
				getContainsrelatedObjectEvent().clear();
				return;
			case Fta_bdslPackage.EVENT__CONTAINSREFERENCE_COUNT_EVENT:
				getContainsreferenceCountEvent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Fta_bdslPackage.EVENT__TYPE:
				return type != TYPE_EDEFAULT;
			case Fta_bdslPackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Fta_bdslPackage.EVENT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case Fta_bdslPackage.EVENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Fta_bdslPackage.EVENT__GATE:
				return gate != null && !gate.isEmpty();
			case Fta_bdslPackage.EVENT__RELATED_OBJECT:
				return relatedObject != null && !relatedObject.isEmpty();
			case Fta_bdslPackage.EVENT__REFERENCE_COUNT:
				return referenceCount != REFERENCE_COUNT_EDEFAULT;
			case Fta_bdslPackage.EVENT__EREF_GATE_EVENT11:
				return eref_gateEvent11 != null;
			case Fta_bdslPackage.EVENT__CONTAINSTYPE_EVENT:
				return containstypeEvent != null && !containstypeEvent.isEmpty();
			case Fta_bdslPackage.EVENT__CONTAINSNAME_EVENT:
				return containsnameEvent != null && !containsnameEvent.isEmpty();
			case Fta_bdslPackage.EVENT__CONTAINSPROBABILITY_EVENT:
				return containsprobabilityEvent != null && !containsprobabilityEvent.isEmpty();
			case Fta_bdslPackage.EVENT__CONTAINSDESCRIPTION_EVENT:
				return containsdescriptionEvent != null && !containsdescriptionEvent.isEmpty();
			case Fta_bdslPackage.EVENT__CONTAINSRELATED_OBJECT_EVENT:
				return containsrelatedObjectEvent != null && !containsrelatedObjectEvent.isEmpty();
			case Fta_bdslPackage.EVENT__CONTAINSREFERENCE_COUNT_EVENT:
				return containsreferenceCountEvent != null && !containsreferenceCountEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", probability: ");
		result.append(probability);
		result.append(", description: ");
		result.append(description);
		result.append(", relatedObject: ");
		result.append(relatedObject);
		result.append(", referenceCount: ");
		result.append(referenceCount);
		result.append(')');
		return result.toString();
	}

} //EventImpl

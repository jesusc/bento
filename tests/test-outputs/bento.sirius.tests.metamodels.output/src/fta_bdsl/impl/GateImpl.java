/**
 */
package fta_bdsl.impl;

import fta_bdsl.Event;
import fta_bdsl.Fta_bdslPackage;
import fta_bdsl.Gate;
import fta_bdsl.GateType;
import fta_bdsl.descriptionGate;
import fta_bdsl.eventsGate21;
import fta_bdsl.nbOccurrencesGate;
import fta_bdsl.typeGate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.impl.GateImpl#getType <em>Type</em>}</li>
 *   <li>{@link fta_bdsl.impl.GateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fta_bdsl.impl.GateImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fta_bdsl.impl.GateImpl#getNbOccurrences <em>Nb Occurrences</em>}</li>
 *   <li>{@link fta_bdsl.impl.GateImpl#getEref_eventsGate21 <em>Eref events Gate21</em>}</li>
 *   <li>{@link fta_bdsl.impl.GateImpl#getContainstypeGate <em>Containstype Gate</em>}</li>
 *   <li>{@link fta_bdsl.impl.GateImpl#getContainsdescriptionGate <em>Containsdescription Gate</em>}</li>
 *   <li>{@link fta_bdsl.impl.GateImpl#getContainsnbOccurrencesGate <em>Containsnb Occurrences Gate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GateImpl extends BindingElementImpl implements Gate {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GateType TYPE_EDEFAULT = GateType.OR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GateType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The default value of the '{@link #getNbOccurrences() <em>Nb Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OCCURRENCES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNbOccurrences() <em>Nb Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOccurrences()
	 * @generated
	 * @ordered
	 */
	protected int nbOccurrences = NB_OCCURRENCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEref_eventsGate21() <em>Eref events Gate21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_eventsGate21()
	 * @generated
	 * @ordered
	 */
	protected eventsGate21 eref_eventsGate21;

	/**
	 * The cached value of the '{@link #getContainstypeGate() <em>Containstype Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainstypeGate()
	 * @generated
	 * @ordered
	 */
	protected EList<typeGate> containstypeGate;

	/**
	 * The cached value of the '{@link #getContainsdescriptionGate() <em>Containsdescription Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsdescriptionGate()
	 * @generated
	 * @ordered
	 */
	protected EList<descriptionGate> containsdescriptionGate;

	/**
	 * The cached value of the '{@link #getContainsnbOccurrencesGate() <em>Containsnb Occurrences Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnbOccurrencesGate()
	 * @generated
	 * @ordered
	 */
	protected EList<nbOccurrencesGate> containsnbOccurrencesGate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_bdslPackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GateType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(GateType newType) {
		GateType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.GATE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.GATE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<Event>(Event.class, this, Fta_bdslPackage.GATE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbOccurrences() {
		return nbOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbOccurrences(int newNbOccurrences) {
		int oldNbOccurrences = nbOccurrences;
		nbOccurrences = newNbOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.GATE__NB_OCCURRENCES, oldNbOccurrences, nbOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eventsGate21 getEref_eventsGate21() {
		return eref_eventsGate21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_eventsGate21(eventsGate21 newEref_eventsGate21, NotificationChain msgs) {
		eventsGate21 oldEref_eventsGate21 = eref_eventsGate21;
		eref_eventsGate21 = newEref_eventsGate21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.GATE__EREF_EVENTS_GATE21, oldEref_eventsGate21, newEref_eventsGate21);
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
	public void setEref_eventsGate21(eventsGate21 newEref_eventsGate21) {
		if (newEref_eventsGate21 != eref_eventsGate21) {
			NotificationChain msgs = null;
			if (eref_eventsGate21 != null)
				msgs = ((InternalEObject)eref_eventsGate21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fta_bdslPackage.GATE__EREF_EVENTS_GATE21, null, msgs);
			if (newEref_eventsGate21 != null)
				msgs = ((InternalEObject)newEref_eventsGate21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fta_bdslPackage.GATE__EREF_EVENTS_GATE21, null, msgs);
			msgs = basicSetEref_eventsGate21(newEref_eventsGate21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.GATE__EREF_EVENTS_GATE21, newEref_eventsGate21, newEref_eventsGate21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<typeGate> getContainstypeGate() {
		if (containstypeGate == null) {
			containstypeGate = new EObjectContainmentEList<typeGate>(typeGate.class, this, Fta_bdslPackage.GATE__CONTAINSTYPE_GATE);
		}
		return containstypeGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<descriptionGate> getContainsdescriptionGate() {
		if (containsdescriptionGate == null) {
			containsdescriptionGate = new EObjectContainmentEList<descriptionGate>(descriptionGate.class, this, Fta_bdslPackage.GATE__CONTAINSDESCRIPTION_GATE);
		}
		return containsdescriptionGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<nbOccurrencesGate> getContainsnbOccurrencesGate() {
		if (containsnbOccurrencesGate == null) {
			containsnbOccurrencesGate = new EObjectContainmentEList<nbOccurrencesGate>(nbOccurrencesGate.class, this, Fta_bdslPackage.GATE__CONTAINSNB_OCCURRENCES_GATE);
		}
		return containsnbOccurrencesGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fta_bdslPackage.GATE__EREF_EVENTS_GATE21:
				return basicSetEref_eventsGate21(null, msgs);
			case Fta_bdslPackage.GATE__CONTAINSTYPE_GATE:
				return ((InternalEList<?>)getContainstypeGate()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.GATE__CONTAINSDESCRIPTION_GATE:
				return ((InternalEList<?>)getContainsdescriptionGate()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.GATE__CONTAINSNB_OCCURRENCES_GATE:
				return ((InternalEList<?>)getContainsnbOccurrencesGate()).basicRemove(otherEnd, msgs);
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
			case Fta_bdslPackage.GATE__TYPE:
				return getType();
			case Fta_bdslPackage.GATE__DESCRIPTION:
				return getDescription();
			case Fta_bdslPackage.GATE__EVENTS:
				return getEvents();
			case Fta_bdslPackage.GATE__NB_OCCURRENCES:
				return getNbOccurrences();
			case Fta_bdslPackage.GATE__EREF_EVENTS_GATE21:
				return getEref_eventsGate21();
			case Fta_bdslPackage.GATE__CONTAINSTYPE_GATE:
				return getContainstypeGate();
			case Fta_bdslPackage.GATE__CONTAINSDESCRIPTION_GATE:
				return getContainsdescriptionGate();
			case Fta_bdslPackage.GATE__CONTAINSNB_OCCURRENCES_GATE:
				return getContainsnbOccurrencesGate();
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
			case Fta_bdslPackage.GATE__TYPE:
				setType((GateType)newValue);
				return;
			case Fta_bdslPackage.GATE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Fta_bdslPackage.GATE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case Fta_bdslPackage.GATE__NB_OCCURRENCES:
				setNbOccurrences((Integer)newValue);
				return;
			case Fta_bdslPackage.GATE__EREF_EVENTS_GATE21:
				setEref_eventsGate21((eventsGate21)newValue);
				return;
			case Fta_bdslPackage.GATE__CONTAINSTYPE_GATE:
				getContainstypeGate().clear();
				getContainstypeGate().addAll((Collection<? extends typeGate>)newValue);
				return;
			case Fta_bdslPackage.GATE__CONTAINSDESCRIPTION_GATE:
				getContainsdescriptionGate().clear();
				getContainsdescriptionGate().addAll((Collection<? extends descriptionGate>)newValue);
				return;
			case Fta_bdslPackage.GATE__CONTAINSNB_OCCURRENCES_GATE:
				getContainsnbOccurrencesGate().clear();
				getContainsnbOccurrencesGate().addAll((Collection<? extends nbOccurrencesGate>)newValue);
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
			case Fta_bdslPackage.GATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Fta_bdslPackage.GATE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Fta_bdslPackage.GATE__EVENTS:
				getEvents().clear();
				return;
			case Fta_bdslPackage.GATE__NB_OCCURRENCES:
				setNbOccurrences(NB_OCCURRENCES_EDEFAULT);
				return;
			case Fta_bdslPackage.GATE__EREF_EVENTS_GATE21:
				setEref_eventsGate21((eventsGate21)null);
				return;
			case Fta_bdslPackage.GATE__CONTAINSTYPE_GATE:
				getContainstypeGate().clear();
				return;
			case Fta_bdslPackage.GATE__CONTAINSDESCRIPTION_GATE:
				getContainsdescriptionGate().clear();
				return;
			case Fta_bdslPackage.GATE__CONTAINSNB_OCCURRENCES_GATE:
				getContainsnbOccurrencesGate().clear();
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
			case Fta_bdslPackage.GATE__TYPE:
				return type != TYPE_EDEFAULT;
			case Fta_bdslPackage.GATE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Fta_bdslPackage.GATE__EVENTS:
				return events != null && !events.isEmpty();
			case Fta_bdslPackage.GATE__NB_OCCURRENCES:
				return nbOccurrences != NB_OCCURRENCES_EDEFAULT;
			case Fta_bdslPackage.GATE__EREF_EVENTS_GATE21:
				return eref_eventsGate21 != null;
			case Fta_bdslPackage.GATE__CONTAINSTYPE_GATE:
				return containstypeGate != null && !containstypeGate.isEmpty();
			case Fta_bdslPackage.GATE__CONTAINSDESCRIPTION_GATE:
				return containsdescriptionGate != null && !containsdescriptionGate.isEmpty();
			case Fta_bdslPackage.GATE__CONTAINSNB_OCCURRENCES_GATE:
				return containsnbOccurrencesGate != null && !containsnbOccurrencesGate.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", nbOccurrences: ");
		result.append(nbOccurrences);
		result.append(')');
		return result.toString();
	}

} //GateImpl

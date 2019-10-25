/**
 */
package fta_bdsl.impl;

import fta_bdsl.BindingAttribute;
import fta_bdsl.BindingElement;
import fta_bdsl.Event;
import fta_bdsl.FTAModel;
import fta_bdsl.Fta_bdslPackage;
import fta_bdsl.Gate;
import fta_bdsl.IntermediateElement;
import fta_bdsl.MetamodelElement;
import fta_bdsl.MetamodelElementFeature;
import fta_bdsl.NoneElement;
import fta_bdsl.VirtualAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FTA Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 *   <li>{@link fta_bdsl.impl.FTAModelImpl#getSourceMM <em>Source MM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTAModelImpl extends MinimalEObjectImpl.Container implements FTAModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gates;

	/**
	 * The cached value of the '{@link #getContainsNoneElement() <em>Contains None Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsNoneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NoneElement> containsNoneElement;

	/**
	 * The cached value of the '{@link #getContainsBindingElement() <em>Contains Binding Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsBindingElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingElement> containsBindingElement;

	/**
	 * The cached value of the '{@link #getContainsIntermediateElement() <em>Contains Intermediate Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsIntermediateElement()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermediateElement> containsIntermediateElement;

	/**
	 * The cached value of the '{@link #getContainsMetamodelElement() <em>Contains Metamodel Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsMetamodelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelElement> containsMetamodelElement;

	/**
	 * The cached value of the '{@link #getContainsMetamodelElementFeature() <em>Contains Metamodel Element Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsMetamodelElementFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelElementFeature> containsMetamodelElementFeature;

	/**
	 * The cached value of the '{@link #getContainsBindingAttribute() <em>Contains Binding Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsBindingAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingAttribute> containsBindingAttribute;

	/**
	 * The cached value of the '{@link #getContainsVirtualAttribute() <em>Contains Virtual Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsVirtualAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualAttribute> containsVirtualAttribute;

	/**
	 * The default value of the '{@link #getSourceMM() <em>Source MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMM()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MM_EDEFAULT = "www.wakame.es/fta_bdsl";

	/**
	 * The cached value of the '{@link #getSourceMM() <em>Source MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMM()
	 * @generated
	 * @ordered
	 */
	protected String sourceMM = SOURCE_MM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTAModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_bdslPackage.Literals.FTA_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.FTA_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.FTA_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.FTA_MODEL__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, Fta_bdslPackage.FTA_MODEL__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, Fta_bdslPackage.FTA_MODEL__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoneElement> getContainsNoneElement() {
		if (containsNoneElement == null) {
			containsNoneElement = new EObjectContainmentEList<NoneElement>(NoneElement.class, this, Fta_bdslPackage.FTA_MODEL__CONTAINS_NONE_ELEMENT);
		}
		return containsNoneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BindingElement> getContainsBindingElement() {
		if (containsBindingElement == null) {
			containsBindingElement = new EObjectContainmentEList<BindingElement>(BindingElement.class, this, Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ELEMENT);
		}
		return containsBindingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntermediateElement> getContainsIntermediateElement() {
		if (containsIntermediateElement == null) {
			containsIntermediateElement = new EObjectContainmentEList<IntermediateElement>(IntermediateElement.class, this, Fta_bdslPackage.FTA_MODEL__CONTAINS_INTERMEDIATE_ELEMENT);
		}
		return containsIntermediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetamodelElement> getContainsMetamodelElement() {
		if (containsMetamodelElement == null) {
			containsMetamodelElement = new EObjectContainmentEList<MetamodelElement>(MetamodelElement.class, this, Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT);
		}
		return containsMetamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetamodelElementFeature> getContainsMetamodelElementFeature() {
		if (containsMetamodelElementFeature == null) {
			containsMetamodelElementFeature = new EObjectContainmentEList<MetamodelElementFeature>(MetamodelElementFeature.class, this, Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		}
		return containsMetamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BindingAttribute> getContainsBindingAttribute() {
		if (containsBindingAttribute == null) {
			containsBindingAttribute = new EObjectContainmentEList<BindingAttribute>(BindingAttribute.class, this, Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ATTRIBUTE);
		}
		return containsBindingAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualAttribute> getContainsVirtualAttribute() {
		if (containsVirtualAttribute == null) {
			containsVirtualAttribute = new EObjectContainmentEList<VirtualAttribute>(VirtualAttribute.class, this, Fta_bdslPackage.FTA_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE);
		}
		return containsVirtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceMM() {
		return sourceMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceMM(String newSourceMM) {
		String oldSourceMM = sourceMM;
		sourceMM = newSourceMM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.FTA_MODEL__SOURCE_MM, oldSourceMM, sourceMM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fta_bdslPackage.FTA_MODEL__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.FTA_MODEL__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_NONE_ELEMENT:
				return ((InternalEList<?>)getContainsNoneElement()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ELEMENT:
				return ((InternalEList<?>)getContainsBindingElement()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return ((InternalEList<?>)getContainsIntermediateElement()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return ((InternalEList<?>)getContainsMetamodelElement()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return ((InternalEList<?>)getContainsMetamodelElementFeature()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return ((InternalEList<?>)getContainsBindingAttribute()).basicRemove(otherEnd, msgs);
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return ((InternalEList<?>)getContainsVirtualAttribute()).basicRemove(otherEnd, msgs);
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
			case Fta_bdslPackage.FTA_MODEL__NAME:
				return getName();
			case Fta_bdslPackage.FTA_MODEL__DESCRIPTION:
				return getDescription();
			case Fta_bdslPackage.FTA_MODEL__COMMENTS:
				return getComments();
			case Fta_bdslPackage.FTA_MODEL__EVENTS:
				return getEvents();
			case Fta_bdslPackage.FTA_MODEL__GATES:
				return getGates();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_NONE_ELEMENT:
				return getContainsNoneElement();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ELEMENT:
				return getContainsBindingElement();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return getContainsIntermediateElement();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return getContainsMetamodelElement();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return getContainsMetamodelElementFeature();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return getContainsBindingAttribute();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return getContainsVirtualAttribute();
			case Fta_bdslPackage.FTA_MODEL__SOURCE_MM:
				return getSourceMM();
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
			case Fta_bdslPackage.FTA_MODEL__NAME:
				setName((String)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__COMMENTS:
				setComments((String)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Gate>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				getContainsNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				getContainsBindingElement().addAll((Collection<? extends BindingElement>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				getContainsIntermediateElement().addAll((Collection<? extends IntermediateElement>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				getContainsMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				getContainsMetamodelElementFeature().addAll((Collection<? extends MetamodelElementFeature>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				getContainsBindingAttribute().addAll((Collection<? extends BindingAttribute>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
				getContainsVirtualAttribute().addAll((Collection<? extends VirtualAttribute>)newValue);
				return;
			case Fta_bdslPackage.FTA_MODEL__SOURCE_MM:
				setSourceMM((String)newValue);
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
			case Fta_bdslPackage.FTA_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Fta_bdslPackage.FTA_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Fta_bdslPackage.FTA_MODEL__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case Fta_bdslPackage.FTA_MODEL__EVENTS:
				getEvents().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__GATES:
				getGates().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
				return;
			case Fta_bdslPackage.FTA_MODEL__SOURCE_MM:
				setSourceMM(SOURCE_MM_EDEFAULT);
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
			case Fta_bdslPackage.FTA_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Fta_bdslPackage.FTA_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Fta_bdslPackage.FTA_MODEL__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case Fta_bdslPackage.FTA_MODEL__EVENTS:
				return events != null && !events.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__GATES:
				return gates != null && !gates.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_NONE_ELEMENT:
				return containsNoneElement != null && !containsNoneElement.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ELEMENT:
				return containsBindingElement != null && !containsBindingElement.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return containsIntermediateElement != null && !containsIntermediateElement.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return containsMetamodelElement != null && !containsMetamodelElement.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return containsMetamodelElementFeature != null && !containsMetamodelElementFeature.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return containsBindingAttribute != null && !containsBindingAttribute.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return containsVirtualAttribute != null && !containsVirtualAttribute.isEmpty();
			case Fta_bdslPackage.FTA_MODEL__SOURCE_MM:
				return SOURCE_MM_EDEFAULT == null ? sourceMM != null : !SOURCE_MM_EDEFAULT.equals(sourceMM);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", comments: ");
		result.append(comments);
		result.append(", SourceMM: ");
		result.append(sourceMM);
		result.append(')');
		return result.toString();
	}

} //FTAModelImpl

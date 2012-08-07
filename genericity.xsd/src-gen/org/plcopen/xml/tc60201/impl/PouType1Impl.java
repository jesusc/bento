/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.plcopen.xml.tc60201.ActionsType;
import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.Body;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.InterfaceType;
import org.plcopen.xml.tc60201.PouType;
import org.plcopen.xml.tc60201.PouType1;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.TransitionsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pou Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getBody <em>Body</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.PouType1Impl#getPouType <em>Pou Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PouType1Impl extends EObjectImpl implements PouType1 {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceType interface_;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected ActionsType actions;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected TransitionsType transitions;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Body> body;

	/**
	 * The cached value of the '{@link #getAddData() <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddData()
	 * @generated
	 * @ordered
	 */
	protected AddData addData;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected FormattedText documentation;

	/**
	 * The default value of the '{@link #getGlobalId() <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalId() <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected String globalId = GLOBAL_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPouType() <em>Pou Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPouType()
	 * @generated
	 * @ordered
	 */
	protected static final PouType POU_TYPE_EDEFAULT = PouType.FUNCTION;

	/**
	 * The cached value of the '{@link #getPouType() <em>Pou Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPouType()
	 * @generated
	 * @ordered
	 */
	protected PouType pouType = POU_TYPE_EDEFAULT;

	/**
	 * This is true if the Pou Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pouTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PouType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getPouType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(InterfaceType newInterface, NotificationChain msgs) {
		InterfaceType oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(InterfaceType newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsType getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(ActionsType newActions, NotificationChain msgs) {
		ActionsType oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(ActionsType newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionsType getTransitions() {
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitions(TransitionsType newTransitions, NotificationChain msgs) {
		TransitionsType oldTransitions = transitions;
		transitions = newTransitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__TRANSITIONS, oldTransitions, newTransitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitions(TransitionsType newTransitions) {
		if (newTransitions != transitions) {
			NotificationChain msgs = null;
			if (transitions != null)
				msgs = ((InternalEObject)transitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__TRANSITIONS, null, msgs);
			if (newTransitions != null)
				msgs = ((InternalEObject)newTransitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__TRANSITIONS, null, msgs);
			msgs = basicSetTransitions(newTransitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__TRANSITIONS, newTransitions, newTransitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Body> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Body>(Body.class, this, Tc60201Package.POU_TYPE1__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddData getAddData() {
		return addData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddData(AddData newAddData, NotificationChain msgs) {
		AddData oldAddData = addData;
		addData = newAddData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__ADD_DATA, oldAddData, newAddData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddData(AddData newAddData) {
		if (newAddData != addData) {
			NotificationChain msgs = null;
			if (addData != null)
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__ADD_DATA, newAddData, newAddData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(FormattedText newDocumentation, NotificationChain msgs) {
		FormattedText oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(FormattedText newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.POU_TYPE1__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalId(String newGlobalId) {
		String oldGlobalId = globalId;
		globalId = newGlobalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__GLOBAL_ID, oldGlobalId, globalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouType getPouType() {
		return pouType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPouType(PouType newPouType) {
		PouType oldPouType = pouType;
		pouType = newPouType == null ? POU_TYPE_EDEFAULT : newPouType;
		boolean oldPouTypeESet = pouTypeESet;
		pouTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.POU_TYPE1__POU_TYPE, oldPouType, pouType, !oldPouTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPouType() {
		PouType oldPouType = pouType;
		boolean oldPouTypeESet = pouTypeESet;
		pouType = POU_TYPE_EDEFAULT;
		pouTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.POU_TYPE1__POU_TYPE, oldPouType, POU_TYPE_EDEFAULT, oldPouTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPouType() {
		return pouTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.POU_TYPE1__INTERFACE:
				return basicSetInterface(null, msgs);
			case Tc60201Package.POU_TYPE1__ACTIONS:
				return basicSetActions(null, msgs);
			case Tc60201Package.POU_TYPE1__TRANSITIONS:
				return basicSetTransitions(null, msgs);
			case Tc60201Package.POU_TYPE1__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case Tc60201Package.POU_TYPE1__ADD_DATA:
				return basicSetAddData(null, msgs);
			case Tc60201Package.POU_TYPE1__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case Tc60201Package.POU_TYPE1__INTERFACE:
				return getInterface();
			case Tc60201Package.POU_TYPE1__ACTIONS:
				return getActions();
			case Tc60201Package.POU_TYPE1__TRANSITIONS:
				return getTransitions();
			case Tc60201Package.POU_TYPE1__BODY:
				return getBody();
			case Tc60201Package.POU_TYPE1__ADD_DATA:
				return getAddData();
			case Tc60201Package.POU_TYPE1__DOCUMENTATION:
				return getDocumentation();
			case Tc60201Package.POU_TYPE1__GLOBAL_ID:
				return getGlobalId();
			case Tc60201Package.POU_TYPE1__NAME:
				return getName();
			case Tc60201Package.POU_TYPE1__POU_TYPE:
				return getPouType();
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
			case Tc60201Package.POU_TYPE1__INTERFACE:
				setInterface((InterfaceType)newValue);
				return;
			case Tc60201Package.POU_TYPE1__ACTIONS:
				setActions((ActionsType)newValue);
				return;
			case Tc60201Package.POU_TYPE1__TRANSITIONS:
				setTransitions((TransitionsType)newValue);
				return;
			case Tc60201Package.POU_TYPE1__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Body>)newValue);
				return;
			case Tc60201Package.POU_TYPE1__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.POU_TYPE1__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
				return;
			case Tc60201Package.POU_TYPE1__GLOBAL_ID:
				setGlobalId((String)newValue);
				return;
			case Tc60201Package.POU_TYPE1__NAME:
				setName((String)newValue);
				return;
			case Tc60201Package.POU_TYPE1__POU_TYPE:
				setPouType((PouType)newValue);
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
			case Tc60201Package.POU_TYPE1__INTERFACE:
				setInterface((InterfaceType)null);
				return;
			case Tc60201Package.POU_TYPE1__ACTIONS:
				setActions((ActionsType)null);
				return;
			case Tc60201Package.POU_TYPE1__TRANSITIONS:
				setTransitions((TransitionsType)null);
				return;
			case Tc60201Package.POU_TYPE1__BODY:
				getBody().clear();
				return;
			case Tc60201Package.POU_TYPE1__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.POU_TYPE1__DOCUMENTATION:
				setDocumentation((FormattedText)null);
				return;
			case Tc60201Package.POU_TYPE1__GLOBAL_ID:
				setGlobalId(GLOBAL_ID_EDEFAULT);
				return;
			case Tc60201Package.POU_TYPE1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tc60201Package.POU_TYPE1__POU_TYPE:
				unsetPouType();
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
			case Tc60201Package.POU_TYPE1__INTERFACE:
				return interface_ != null;
			case Tc60201Package.POU_TYPE1__ACTIONS:
				return actions != null;
			case Tc60201Package.POU_TYPE1__TRANSITIONS:
				return transitions != null;
			case Tc60201Package.POU_TYPE1__BODY:
				return body != null && !body.isEmpty();
			case Tc60201Package.POU_TYPE1__ADD_DATA:
				return addData != null;
			case Tc60201Package.POU_TYPE1__DOCUMENTATION:
				return documentation != null;
			case Tc60201Package.POU_TYPE1__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalId != null : !GLOBAL_ID_EDEFAULT.equals(globalId);
			case Tc60201Package.POU_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tc60201Package.POU_TYPE1__POU_TYPE:
				return isSetPouType();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (globalId: ");
		result.append(globalId);
		result.append(", name: ");
		result.append(name);
		result.append(", pouType: ");
		if (pouTypeESet) result.append(pouType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PouType1Impl

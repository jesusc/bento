/**
 */
package scenes_bdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import scenes_bdsl.Action;
import scenes_bdsl.ActionType;
import scenes_bdsl.Scenes_bdslPackage;
import scenes_bdsl.nameAction;
import scenes_bdsl.typeAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.impl.ActionImpl#getCharacters <em>Characters</em>}</li>
 *   <li>{@link scenes_bdsl.impl.ActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link scenes_bdsl.impl.ActionImpl#getContainsnameAction <em>Containsname Action</em>}</li>
 *   <li>{@link scenes_bdsl.impl.ActionImpl#getContainstypeAction <em>Containstype Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends NamedElementImpl implements Action {
	/**
	 * The cached value of the '{@link #getCharacters() <em>Characters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacters()
	 * @generated
	 * @ordered
	 */
	protected EList<scenes_bdsl.Character> characters;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType TYPE_EDEFAULT = ActionType.FIGHT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameAction() <em>Containsname Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameAction()
	 * @generated
	 * @ordered
	 */
	protected nameAction containsnameAction;

	/**
	 * The cached value of the '{@link #getContainstypeAction() <em>Containstype Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainstypeAction()
	 * @generated
	 * @ordered
	 */
	protected typeAction containstypeAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenes_bdslPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<scenes_bdsl.Character> getCharacters() {
		if (characters == null) {
			characters = new EObjectResolvingEList<scenes_bdsl.Character>(scenes_bdsl.Character.class, this, Scenes_bdslPackage.ACTION__CHARACTERS);
		}
		return characters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActionType newType) {
		ActionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameAction getContainsnameAction() {
		return containsnameAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsnameAction(nameAction newContainsnameAction, NotificationChain msgs) {
		nameAction oldContainsnameAction = containsnameAction;
		containsnameAction = newContainsnameAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION, oldContainsnameAction, newContainsnameAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsnameAction(nameAction newContainsnameAction) {
		if (newContainsnameAction != containsnameAction) {
			NotificationChain msgs = null;
			if (containsnameAction != null)
				msgs = ((InternalEObject)containsnameAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION, null, msgs);
			if (newContainsnameAction != null)
				msgs = ((InternalEObject)newContainsnameAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION, null, msgs);
			msgs = basicSetContainsnameAction(newContainsnameAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION, newContainsnameAction, newContainsnameAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeAction getContainstypeAction() {
		return containstypeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainstypeAction(typeAction newContainstypeAction, NotificationChain msgs) {
		typeAction oldContainstypeAction = containstypeAction;
		containstypeAction = newContainstypeAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION, oldContainstypeAction, newContainstypeAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainstypeAction(typeAction newContainstypeAction) {
		if (newContainstypeAction != containstypeAction) {
			NotificationChain msgs = null;
			if (containstypeAction != null)
				msgs = ((InternalEObject)containstypeAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION, null, msgs);
			if (newContainstypeAction != null)
				msgs = ((InternalEObject)newContainstypeAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION, null, msgs);
			msgs = basicSetContainstypeAction(newContainstypeAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION, newContainstypeAction, newContainstypeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION:
				return basicSetContainsnameAction(null, msgs);
			case Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION:
				return basicSetContainstypeAction(null, msgs);
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
			case Scenes_bdslPackage.ACTION__CHARACTERS:
				return getCharacters();
			case Scenes_bdslPackage.ACTION__TYPE:
				return getType();
			case Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION:
				return getContainsnameAction();
			case Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION:
				return getContainstypeAction();
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
			case Scenes_bdslPackage.ACTION__CHARACTERS:
				getCharacters().clear();
				getCharacters().addAll((Collection<? extends scenes_bdsl.Character>)newValue);
				return;
			case Scenes_bdslPackage.ACTION__TYPE:
				setType((ActionType)newValue);
				return;
			case Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION:
				setContainsnameAction((nameAction)newValue);
				return;
			case Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION:
				setContainstypeAction((typeAction)newValue);
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
			case Scenes_bdslPackage.ACTION__CHARACTERS:
				getCharacters().clear();
				return;
			case Scenes_bdslPackage.ACTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION:
				setContainsnameAction((nameAction)null);
				return;
			case Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION:
				setContainstypeAction((typeAction)null);
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
			case Scenes_bdslPackage.ACTION__CHARACTERS:
				return characters != null && !characters.isEmpty();
			case Scenes_bdslPackage.ACTION__TYPE:
				return type != TYPE_EDEFAULT;
			case Scenes_bdslPackage.ACTION__CONTAINSNAME_ACTION:
				return containsnameAction != null;
			case Scenes_bdslPackage.ACTION__CONTAINSTYPE_ACTION:
				return containstypeAction != null;
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
		result.append(')');
		return result.toString();
	}

} //ActionImpl

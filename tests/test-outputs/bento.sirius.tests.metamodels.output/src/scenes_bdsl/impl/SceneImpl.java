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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scenes_bdsl.Action;
import scenes_bdsl.Comment;
import scenes_bdsl.Element;
import scenes_bdsl.Scene;
import scenes_bdsl.Scenes_bdslPackage;
import scenes_bdsl.nameScene;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.impl.SceneImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link scenes_bdsl.impl.SceneImpl#getNext <em>Next</em>}</li>
 *   <li>{@link scenes_bdsl.impl.SceneImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link scenes_bdsl.impl.SceneImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link scenes_bdsl.impl.SceneImpl#getContainsnameScene <em>Containsname Scene</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SceneImpl extends NamedElementImpl implements Scene {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Scene next;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Comment description;

	/**
	 * The cached value of the '{@link #getContainsnameScene() <em>Containsname Scene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameScene()
	 * @generated
	 * @ordered
	 */
	protected nameScene containsnameScene;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenes_bdslPackage.Literals.SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<Element>(Element.class, this, Scenes_bdslPackage.SCENE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Scene)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Scenes_bdslPackage.SCENE__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Scene newNext) {
		Scene oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.SCENE__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, Scenes_bdslPackage.SCENE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Comment newDescription, NotificationChain msgs) {
		Comment oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.SCENE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Comment newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.SCENE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.SCENE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.SCENE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameScene getContainsnameScene() {
		return containsnameScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsnameScene(nameScene newContainsnameScene, NotificationChain msgs) {
		nameScene oldContainsnameScene = containsnameScene;
		containsnameScene = newContainsnameScene;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE, oldContainsnameScene, newContainsnameScene);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsnameScene(nameScene newContainsnameScene) {
		if (newContainsnameScene != containsnameScene) {
			NotificationChain msgs = null;
			if (containsnameScene != null)
				msgs = ((InternalEObject)containsnameScene).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE, null, msgs);
			if (newContainsnameScene != null)
				msgs = ((InternalEObject)newContainsnameScene).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE, null, msgs);
			msgs = basicSetContainsnameScene(newContainsnameScene, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE, newContainsnameScene, newContainsnameScene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Scenes_bdslPackage.SCENE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case Scenes_bdslPackage.SCENE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE:
				return basicSetContainsnameScene(null, msgs);
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
			case Scenes_bdslPackage.SCENE__ELEMENTS:
				return getElements();
			case Scenes_bdslPackage.SCENE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case Scenes_bdslPackage.SCENE__ACTIONS:
				return getActions();
			case Scenes_bdslPackage.SCENE__DESCRIPTION:
				return getDescription();
			case Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE:
				return getContainsnameScene();
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
			case Scenes_bdslPackage.SCENE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case Scenes_bdslPackage.SCENE__NEXT:
				setNext((Scene)newValue);
				return;
			case Scenes_bdslPackage.SCENE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case Scenes_bdslPackage.SCENE__DESCRIPTION:
				setDescription((Comment)newValue);
				return;
			case Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE:
				setContainsnameScene((nameScene)newValue);
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
			case Scenes_bdslPackage.SCENE__ELEMENTS:
				getElements().clear();
				return;
			case Scenes_bdslPackage.SCENE__NEXT:
				setNext((Scene)null);
				return;
			case Scenes_bdslPackage.SCENE__ACTIONS:
				getActions().clear();
				return;
			case Scenes_bdslPackage.SCENE__DESCRIPTION:
				setDescription((Comment)null);
				return;
			case Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE:
				setContainsnameScene((nameScene)null);
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
			case Scenes_bdslPackage.SCENE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case Scenes_bdslPackage.SCENE__NEXT:
				return next != null;
			case Scenes_bdslPackage.SCENE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case Scenes_bdslPackage.SCENE__DESCRIPTION:
				return description != null;
			case Scenes_bdslPackage.SCENE__CONTAINSNAME_SCENE:
				return containsnameScene != null;
		}
		return super.eIsSet(featureID);
	}

} //SceneImpl

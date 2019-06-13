/**
 */
package scenes_bdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scenes_bdsl.Scenes_bdslPackage;
import scenes_bdsl.nameCharacter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.impl.CharacterImpl#getContainsnameCharacter <em>Containsname Character</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterImpl extends ElementImpl implements scenes_bdsl.Character {
	/**
	 * The cached value of the '{@link #getContainsnameCharacter() <em>Containsname Character</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameCharacter()
	 * @generated
	 * @ordered
	 */
	protected nameCharacter containsnameCharacter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenes_bdslPackage.Literals.CHARACTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nameCharacter getContainsnameCharacter() {
		return containsnameCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsnameCharacter(nameCharacter newContainsnameCharacter, NotificationChain msgs) {
		nameCharacter oldContainsnameCharacter = containsnameCharacter;
		containsnameCharacter = newContainsnameCharacter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER, oldContainsnameCharacter, newContainsnameCharacter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsnameCharacter(nameCharacter newContainsnameCharacter) {
		if (newContainsnameCharacter != containsnameCharacter) {
			NotificationChain msgs = null;
			if (containsnameCharacter != null)
				msgs = ((InternalEObject)containsnameCharacter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER, null, msgs);
			if (newContainsnameCharacter != null)
				msgs = ((InternalEObject)newContainsnameCharacter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER, null, msgs);
			msgs = basicSetContainsnameCharacter(newContainsnameCharacter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER, newContainsnameCharacter, newContainsnameCharacter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER:
				return basicSetContainsnameCharacter(null, msgs);
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
			case Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER:
				return getContainsnameCharacter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER:
				setContainsnameCharacter((nameCharacter)newValue);
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
			case Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER:
				setContainsnameCharacter((nameCharacter)null);
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
			case Scenes_bdslPackage.CHARACTER__CONTAINSNAME_CHARACTER:
				return containsnameCharacter != null;
		}
		return super.eIsSet(featureID);
	}

} //CharacterImpl

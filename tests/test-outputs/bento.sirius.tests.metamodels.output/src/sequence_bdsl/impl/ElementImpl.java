/**
 */
package sequence_bdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sequence_bdsl.Element;
import sequence_bdsl.Sequence_bdslPackage;
import sequence_bdsl.valueElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.impl.ElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link sequence_bdsl.impl.ElementImpl#getNext <em>Next</em>}</li>
 *   <li>{@link sequence_bdsl.impl.ElementImpl#getContainsvalueElement <em>Containsvalue Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends BindingElementImpl implements Element {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Element next;

	/**
	 * The cached value of the '{@link #getContainsvalueElement() <em>Containsvalue Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsvalueElement()
	 * @generated
	 * @ordered
	 */
	protected valueElement containsvalueElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_bdslPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_bdslPackage.ELEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Element newNext, NotificationChain msgs) {
		Element oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sequence_bdslPackage.ELEMENT__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Element newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sequence_bdslPackage.ELEMENT__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sequence_bdslPackage.ELEMENT__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_bdslPackage.ELEMENT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public valueElement getContainsvalueElement() {
		return containsvalueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsvalueElement(valueElement newContainsvalueElement, NotificationChain msgs) {
		valueElement oldContainsvalueElement = containsvalueElement;
		containsvalueElement = newContainsvalueElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT, oldContainsvalueElement, newContainsvalueElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsvalueElement(valueElement newContainsvalueElement) {
		if (newContainsvalueElement != containsvalueElement) {
			NotificationChain msgs = null;
			if (containsvalueElement != null)
				msgs = ((InternalEObject)containsvalueElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT, null, msgs);
			if (newContainsvalueElement != null)
				msgs = ((InternalEObject)newContainsvalueElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT, null, msgs);
			msgs = basicSetContainsvalueElement(newContainsvalueElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT, newContainsvalueElement, newContainsvalueElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sequence_bdslPackage.ELEMENT__NEXT:
				return basicSetNext(null, msgs);
			case Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT:
				return basicSetContainsvalueElement(null, msgs);
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
			case Sequence_bdslPackage.ELEMENT__VALUE:
				return getValue();
			case Sequence_bdslPackage.ELEMENT__NEXT:
				return getNext();
			case Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT:
				return getContainsvalueElement();
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
			case Sequence_bdslPackage.ELEMENT__VALUE:
				setValue((String)newValue);
				return;
			case Sequence_bdslPackage.ELEMENT__NEXT:
				setNext((Element)newValue);
				return;
			case Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT:
				setContainsvalueElement((valueElement)newValue);
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
			case Sequence_bdslPackage.ELEMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Sequence_bdslPackage.ELEMENT__NEXT:
				setNext((Element)null);
				return;
			case Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT:
				setContainsvalueElement((valueElement)null);
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
			case Sequence_bdslPackage.ELEMENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Sequence_bdslPackage.ELEMENT__NEXT:
				return next != null;
			case Sequence_bdslPackage.ELEMENT__CONTAINSVALUE_ELEMENT:
				return containsvalueElement != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ElementImpl

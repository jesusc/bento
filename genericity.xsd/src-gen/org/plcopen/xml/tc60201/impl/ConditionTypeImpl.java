/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.plcopen.xml.tc60201.ConditionType;
import org.plcopen.xml.tc60201.ConnectionPointIn;
import org.plcopen.xml.tc60201.InlineType;
import org.plcopen.xml.tc60201.ReferenceType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConditionTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConditionTypeImpl#getConnectionPointIn <em>Connection Point In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConditionTypeImpl#getInline <em>Inline</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConditionTypeImpl#isNegated <em>Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionTypeImpl extends EObjectImpl implements ConditionType {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType reference;

	/**
	 * The cached value of the '{@link #getConnectionPointIn() <em>Connection Point In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPointIn()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPointIn connectionPointIn;

	/**
	 * The cached value of the '{@link #getInline() <em>Inline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInline()
	 * @generated
	 * @ordered
	 */
	protected InlineType inline;

	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;

	/**
	 * This is true if the Negated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean negatedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getConditionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType newReference, NotificationChain msgs) {
		ReferenceType oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONDITION_TYPE__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ReferenceType newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONDITION_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONDITION_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONDITION_TYPE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointIn getConnectionPointIn() {
		return connectionPointIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionPointIn(ConnectionPointIn newConnectionPointIn, NotificationChain msgs) {
		ConnectionPointIn oldConnectionPointIn = connectionPointIn;
		connectionPointIn = newConnectionPointIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN, oldConnectionPointIn, newConnectionPointIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionPointIn(ConnectionPointIn newConnectionPointIn) {
		if (newConnectionPointIn != connectionPointIn) {
			NotificationChain msgs = null;
			if (connectionPointIn != null)
				msgs = ((InternalEObject)connectionPointIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN, null, msgs);
			if (newConnectionPointIn != null)
				msgs = ((InternalEObject)newConnectionPointIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN, null, msgs);
			msgs = basicSetConnectionPointIn(newConnectionPointIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN, newConnectionPointIn, newConnectionPointIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineType getInline() {
		return inline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInline(InlineType newInline, NotificationChain msgs) {
		InlineType oldInline = inline;
		inline = newInline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONDITION_TYPE__INLINE, oldInline, newInline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInline(InlineType newInline) {
		if (newInline != inline) {
			NotificationChain msgs = null;
			if (inline != null)
				msgs = ((InternalEObject)inline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONDITION_TYPE__INLINE, null, msgs);
			if (newInline != null)
				msgs = ((InternalEObject)newInline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONDITION_TYPE__INLINE, null, msgs);
			msgs = basicSetInline(newInline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONDITION_TYPE__INLINE, newInline, newInline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		boolean oldNegatedESet = negatedESet;
		negatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONDITION_TYPE__NEGATED, oldNegated, negated, !oldNegatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNegated() {
		boolean oldNegated = negated;
		boolean oldNegatedESet = negatedESet;
		negated = NEGATED_EDEFAULT;
		negatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.CONDITION_TYPE__NEGATED, oldNegated, NEGATED_EDEFAULT, oldNegatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNegated() {
		return negatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.CONDITION_TYPE__REFERENCE:
				return basicSetReference(null, msgs);
			case Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN:
				return basicSetConnectionPointIn(null, msgs);
			case Tc60201Package.CONDITION_TYPE__INLINE:
				return basicSetInline(null, msgs);
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
			case Tc60201Package.CONDITION_TYPE__REFERENCE:
				return getReference();
			case Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN:
				return getConnectionPointIn();
			case Tc60201Package.CONDITION_TYPE__INLINE:
				return getInline();
			case Tc60201Package.CONDITION_TYPE__NEGATED:
				return isNegated();
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
			case Tc60201Package.CONDITION_TYPE__REFERENCE:
				setReference((ReferenceType)newValue);
				return;
			case Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN:
				setConnectionPointIn((ConnectionPointIn)newValue);
				return;
			case Tc60201Package.CONDITION_TYPE__INLINE:
				setInline((InlineType)newValue);
				return;
			case Tc60201Package.CONDITION_TYPE__NEGATED:
				setNegated((Boolean)newValue);
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
			case Tc60201Package.CONDITION_TYPE__REFERENCE:
				setReference((ReferenceType)null);
				return;
			case Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN:
				setConnectionPointIn((ConnectionPointIn)null);
				return;
			case Tc60201Package.CONDITION_TYPE__INLINE:
				setInline((InlineType)null);
				return;
			case Tc60201Package.CONDITION_TYPE__NEGATED:
				unsetNegated();
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
			case Tc60201Package.CONDITION_TYPE__REFERENCE:
				return reference != null;
			case Tc60201Package.CONDITION_TYPE__CONNECTION_POINT_IN:
				return connectionPointIn != null;
			case Tc60201Package.CONDITION_TYPE__INLINE:
				return inline != null;
			case Tc60201Package.CONDITION_TYPE__NEGATED:
				return isSetNegated();
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
		result.append(" (negated: ");
		if (negatedESet) result.append(negated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConditionTypeImpl
